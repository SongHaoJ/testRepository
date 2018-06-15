package com.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.bean.dao.*;
import com.bean.model.*;
import com.bean.orderUtil.LazadaUtil;
import com.bean.yml.LazadaYml;
import com.gourpBean.BaseOrderBean;
import com.gourpBean.ItemBean;
import com.service.LazadaService;
import com.bean.util.RetCode;
import com.bean.util.Sys;
import com.lazada.lazop.api.LazopClient;
import com.lazada.lazop.api.LazopRequest;
import com.lazada.lazop.api.LazopResponse;
import com.lazada.lazop.util.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class LazadaServiceImpl implements LazadaService {
    //TODO yml读取
    private String appkey = "";
    private String appSecret = "";
    private static final Logger log = LoggerFactory.getLogger(LazadaServiceImpl.class);
    private Map<String, BigDecimal> moneyMap = new HashMap<>();
    private boolean manyStorageflag = false;// 用户是否有使用多仓,默认是false
    private String manyStorageSku = "";// 如果有使用多仓,这里保存多仓的主sku列表(包括主sku的alias1)

    @Override
    public void setManyStorageflag(boolean manyStorageflag) {
        this.manyStorageflag = manyStorageflag;
    }

    @Override
    public void setManyStorageSku(String manyStorageSku) {
        this.manyStorageSku = manyStorageSku;
    }

    @Autowired
    private DbShopMapper shopMapper;
    @Autowired
    private DbOrderMapper orderMapper;
    @Autowired
    private DbMoneyrateMapper moneyrateMapper;
    @Autowired
    private DbLazadaorderinfoMapper orderInfoMapper;
    @Autowired
    private DbLazadaexpresstypeMapper expressMapper;
    @Autowired
    private DbMultiWarehouseMapper multiWarehouseMapper;
    @Autowired
    private DbProductMapper productMapper;
    @Autowired
    private DbSellMapper sellMapper;
    @Autowired
    private LazadaAnalysis analysis;

    private Calendar cld = Calendar.getInstance();


    @Override
    public RetCode findLazadanewproduct(String shopid) {
        return null;
    }

    /**
     * 获取汇率
     */
    public void getMoneyRate() {
        DbMoneyrate moneyrate = new DbMoneyrate();
        List<DbMoneyrate> list = moneyrateMapper.selectByCriteria(moneyrate);
        if (list != null) {
            for (DbMoneyrate o : list) {
                moneyMap.put(o.getName().toUpperCase(), o.getFiled8());
            }
        }
    }


    /**
     * 刷新令牌
     *
     * @param shop
     * @return
     */
    @Override
    public RetCode getrefreshAccess_token(DbShop shop) {
        RetCode rt = new RetCode(1000, "无记录", "无记录");
        cld.setTime(new Date());
        Long time = cld.getTimeInMillis();

        Long refresh = shop.getReserve18().longValue();
        if (time < (refresh * 1000 + 3600 * 48 * 1000)) {
            try {
                String countryCode = "" + Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
                String scApiHost = LazadaUtil.getScApiHost(countryCode);
                LazopClient client = new LazopClient(scApiHost, appkey, appSecret);
                LazopRequest request = new LazopRequest();
                request.setApiName("/auth/token/refresh");
                request.addApiParameter("refresh_token", shop.getReserve19());
                LazopResponse response = client.execute(request);
                response = client.execute(request);
                if (response.isSuccess()) {
                    JSONObject re = JSONObject.parseObject(response.getBody());
                    shop.setTokenid(re.getString("access_token"));
                    Long expiry_Time = re.getLong("refresh_expires_in");
                    shop.setReserve19(re.getString("refresh_token"));
                    Long refreshTime = time / 1000 + expiry_Time - 2 * 3600;
                    shop.setReserve18(new BigDecimal(refreshTime));
                    try {
                        //更新店铺信息
                        shopMapper.updateByPrimaryKeySelective(shop);
                        rt.setCode(0);
                        rt.setDesc("更新令牌成功");
                        rt.setObj(shop);
                        rt.setDetail(refreshTime + "");
                    } catch (Exception e) {
                        rt.setCode(999);
                        rt.setDesc("更新异常：" + e.getMessage());
                    }

                }
            } catch (ApiException e) {
                rt.setCode(1000);
                rt.setDesc("更新令牌异常：" + e.getMessage());
            }
        } else {
            rt.setCode(999);
            rt.setDesc("令牌过期，请重新授权");
        }
        return rt;
    }

    /**
     * 查找需要下载订单的店铺
     *
     * @param shopId 店铺id
     * @return
     */
    @Override
    public RetCode findLazadaShopForDownload(String shopId) {
        RetCode rt = new RetCode(1000, "操作失败", "操作失败");
        try {
            ArrayList<DbShop> list = new ArrayList<DbShop>();
            Map<String, String> paramMap = new HashMap<String, String>();
            paramMap.put("openflag", "1");
            paramMap.put("shoptypeid", "18");
            paramMap.put("tokenflag", "40");

            if (!Sys.isNull(shopId)) {
                paramMap.put("shopIdList", shopId);
            }

            List<DbShop> shopList = shopMapper.selectShopForOrder(paramMap);
            List<DbShop> resultList = new ArrayList<DbShop>();
            Iterator<DbShop> iterator = shopList.iterator();
            while (iterator.hasNext()) {
                DbShop shop = iterator.next();
                if (!Sys.isNull(shop.getTokenid()) && shop.getTokenid().length() >= 10
                        && !Sys.isNull(shop.getSelluserid()) && !Sys.isNull(shop.getAmazonurlname())) {// 必须要有令牌和登陆账号
                    if (shop.getReserve18() == null) {
                        shop.setReserve18(new BigDecimal(0D));
                    } // 如果无设置,则默认是0
                    resultList.add(shop);
                }
            }
            if (resultList.size() > 0) {// 如果有lazada的店铺需要下载
                rt.setCode(0);
                rt.setDesc("查询成功");
                rt.setDetail("" + list.size());
                rt.setObj(list);
            } else {
                rt.setCode(1000);
                rt.setDesc("无店铺需要下载Lazada订单");
            }
        } catch (Exception e) {
            rt.setCode(999);
            rt.setDesc("查询异常");
            rt.setDetail(e.getMessage());
        }
        return rt;
    }

    /**
     * 拉取物流信息
     *
     * @param shop
     */
    @Override
    public void GetShipmentProviders(DbShop shop) {
        String countryCode = "" + Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
        String apiKey = shop.getTokenid();
        String scApiHost = LazadaUtil.getScApiHost(countryCode);

        LazopClient client = new LazopClient(scApiHost, appkey, appSecret);
        LazopRequest request = new LazopRequest();
        request.setApiName("/shipment/providers/get");
        request.setHttpMethod("GET");
        try {
            LazopResponse response = client.execute(request, apiKey);
            Thread.sleep(2000);
            if ("0".equals(response.getCode())) {

                JSONObject jo = JSON.parseObject(response.getBody());

                JSONObject data = JSON.parseObject(jo.getString("data"));

                JSONArray ja = JSON.parseArray(data.getString("shipment_providers"));

                for (int i = 0; i < ja.size(); i++) {

                    JSONObject shipmentProviderObject = JSON.parseObject(ja.getString(i));

                    String name = shipmentProviderObject.getString("name");
                    String trackingUrl = "";
                    try {
                        trackingUrl = shipmentProviderObject.getString("TrackingUrl");
                    } catch (Exception e) {
                        System.out.println("1");
                    }
                    DbLazadaexpresstype let = new DbLazadaexpresstype();
                    let.setSid(name);
                    let.setReserve2(trackingUrl);
                    let.setReserve1(shop.getAmazonurlname());
                    let.setOpertime(new Date());
                    let.setReserve3("18");
                    int n = expressMapper.updateByPrimaryKeySelective(let);
                    if (n != 1) {
                        let.setName(name);
                        let.setOper("sys");
                        let.setOpenflag("1");
                        try {
                            expressMapper.insertSelective(let);
                        } catch (Exception e) {
                            System.out.println("1");
                        }
                    }
                }
            } else {
                //获取认可物流失败
                System.out.println("1");
            }
        } catch (Exception e) {
            System.out.println("Exception=" + e.getMessage());
        }
    }

    /**
     * 更新店铺状态
     *
     * @param shopIds
     * @return
     */
    @Override
    public RetCode updateShopStatus(String shopIds) {
        RetCode rc = new RetCode(1000, "操作失败", "操作失败");
        try {
            if (shopIds.startsWith(",")) {
                shopIds = shopIds.substring(1, shopIds.length());
            }
            if (shopIds.endsWith(",")) {
                shopIds = shopIds.substring(0, shopIds.length() - 1);
            }
            DbShop shop = new DbShop();

            String[] strs = shopIds.split(",");
            List<String> shopIdList = Arrays.asList(strs);
            shop.setShopIdList(shopIdList);
            shop.setOpenflag("1");
            shop.setTokenflag("2");
            shop.setReserve11("18");
            int num = shopMapper.updateByPrimaryKeySelective(shop);
            if (num > 0) {
                rc.setCode(0);
                if (num == shopIdList.size()) {
                    rc.setDetail("全部修改成功");
                    return rc;
                }
                rc.setDetail("共有" + shopIdList.size() + "个店铺需要修改，修改成功数量" + num);
                return rc;
            }
            return rc;
        } catch (Exception e) {
            rc.setCode(999);
            rc.setDetail(e.getMessage());
            return rc;
        }
    }

    /**
     * 下载lazada店铺订单
     *
     * @param shop
     * @param status
     */
    @Override
    public void downloadLazadaOrderNew(DbShop shop, String status) {
        Boolean tokenFail = true;
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
        long groupId = Long.valueOf(Sys.getCtime());
        // 默认下载五天内的pending状态的订单，和ready to ship的订单
        Date startTime = Sys.getDateAfter(-7);// 默认开始时间是系统时间之前7天
        String desc = "";
        try {
            Date endTime = new Date();// 最终截止时间
            // 默认新加坡,他最先开
            String countryCode = Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
            String scApiHost = LazadaUtil.getScApiHost(countryCode);
            // API密钥
            String apiKey = Sys.isCheckNull(shop.getTokenid());
            // 订单开始时间

            String CreatedAfter = changeDateType(startTime);

            String CreatedBefore = changeDateType(endTime);

            //
            // System.out.println("开始时间："+df.format(starttime));
            // 接口操作方式

            // 调接口的时间,需要把系统时间往前推8小时(7~9小时都可以)
            // String timestampBefore8hours =
            // Sys.getTimeBeforeMinite(8*60);//返回YYYYMMDDHHMISS
            // String timestamp =
            // timestampBefore8hours.substring(0,4)+"-"+timestampBefore8hours.substring(4,6)+"-"+timestampBefore8hours.substring(6,8)+"T"+timestampBefore8hours.substring(8,10)+":"+timestampBefore8hours.substring(10,12)+":"+timestampBefore8hours.substring(12,14)+"+00:00";

            LazopClient client = new LazopClient(scApiHost, appkey, appSecret);
            LazopRequest request = new LazopRequest();
            if (status.length() > 0) {
                request.addApiParameter("status", status);// 设置后，将返回的一组订单限制为宽松的订单，只返回符合所提供状态的条目。
            } else {
                request.addApiParameter("status", "pending");// 默认只拉已支付。
            }
            int pageNum = 0;
            int Offset = 0;
            int count = 0;
            // TODO laZaDa 公共参数

            request.setApiName("/orders/get");
            request.setHttpMethod("GET");
            request.addApiParameter("created_before", CreatedBefore);// 将返回的订单限制为在ISO
            // 8601日期格式中给定的指定日期之前或之后更新的订单。可选的
            request.addApiParameter("created_after", CreatedAfter);// 将返回的订单限制为在ISO
            // 8601日期格式中指定的日期之后或之后更新的订单。
            // UpdatedAfter或CreatedAfter是强制性的

            // request.addApiParameter("update_before",
            // "2018-02-10T16:00:00+08:00");//将返回的订单限制为在ISO
            // 8601日期格式中给定的指定日期之前或之后更新的订单。可选的。
            request.addApiParameter("sort_direction", "DESC");// 指定排序类型。可能的值是ASC和DESC。

            // request.addApiParameter("update_after",
            // "2017-02-10T09:00:00+08:00");//将返回的订单限制为在ISO
            // 8601日期格式中指定的日期之后或之后更新的订单。
            // UpdatedAfter或CreatedAfter是强制性的。
            request.addApiParameter("sort_by", "created_at");// 允许选择分类列。可能的值是created_at和updated_at
            request.addApiParameter("limit", "100");// 可以返回的最大订单数量。支持的最大数量是100。

            // 在这里加个分页,不然有的订单下载不下来

            do {
                count++;
                Offset = (count - 1) * 100;
                request.addApiParameter("offset", Offset + "");// 在列表开始处跳过的订单数量。

                LazopResponse response = client.execute(request, apiKey);
                System.out.println(response.getBody());
                try {
                    System.out.println("result=" + response);
                    log.info("返回订单数据.\r\n" + response.getBody());
                    if (response.getBody() != null && response.getBody().indexOf("count") > 0) {
                        if (response.getBody().indexOf("orders") > 0) {
                            try {
                                JSONObject jo_0 = JSON.parseObject(response.getBody());
                                JSONObject jo_d = jo_0.getJSONObject("data");
                                JSONArray jo_os = jo_d.getJSONArray("orders");

                                if (jo_os != null && jo_os.size() > 0) {
                                    int totalCount = 0;
                                    try {
                                        totalCount = jo_d.getInteger("count");
                                    } catch (Exception e) {
                                        System.out.println("1");
                                    }
                                    try {

                                        int successCount = 0;
                                        ArrayList<BaseOrderBean> orderbeanlist = new ArrayList<BaseOrderBean>();
                                        pageNum = jo_os.size();
                                        //TODO 遍历解析订单
                                        for (int i = 0; i < pageNum; i++) {
                                            JSONObject oneOrder = jo_os.getJSONObject(i);
                                            LazadaAnalysis analysis = new LazadaAnalysis();
                                            RetCode rc = analysis.analysisOrderInfo(oneOrder, shop, groupId);
                                            if (rc.getCode() == 0) {
                                                DbLazadaorderinfo order = (DbLazadaorderinfo) rc.getObj();
                                                // 开始解析ItemList
                                                // TODO 解析商品列表
                                                RetCode rtGetItem = analysis.getItem(i, jo_os.size(), order, shop);
                                                if (rtGetItem.getObj() != null) {
                                                    ArrayList<ItemBean> itemList = (ArrayList<ItemBean>) rtGetItem.getObj();
                                                    // 保存进临时表

                                                    RetCode rtSave = analysis.saveOrderIntoTemp(order, itemList);
                                                    if (rtSave.getCode() == 0) {

                                                        successCount++;
                                                    } else {// 保存不成功或部分不成功
                                                        log.info("保存失败" + rtSave.getDesc());
                                                        desc = rtSave.getDesc();
                                                    }
                                                } else {
                                                    System.out.println("1");
                                                }
                                            } else {
                                                //订单已存在或信息异常
                                                System.out.println("1");
                                            }
                                        }
                                    } catch (Exception e) {
                                        //"解析订单Orders数据出现Exception异常:" + e.getMessage());
                                        desc = e.getMessage();
                                    }
                                    //"解析成功");
                                } else {
                                    //"无订单信息");
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTime(endTime);
                                }
                            } catch (Exception e) {
                                //"解析订单返回Json数据Exception异常:" + e.getMessage());
                                desc = e.getMessage();
                            }
                        } else {
                            //"无订单Orders信息");
                            System.out.println("1");
                        }
                    } else if (response.getBody() != null
                            && response.getBody().contains("The specified access token is invalid or expired")) {
                        RetCode rc = getrefreshAccess_token(shop);
                        tokenFail = false;
                        //"令牌过期，刷新结果：" + rc.getDesc() + "稍后重新拉去订单");
                    } else {
                        //"返回数据格式错误,详情见日志文件");
                        System.out.println("1");
                    }
                } catch (Exception e) {
                    System.out.println("Exception=" + e.getMessage());
                    //"下载Exception异常:" + e.getMessage());
                    desc = e.getMessage();
                }
            } while (pageNum >= 100 && count < 50);
        } catch (Exception e) {
            //"" + e.getMessage());
            desc = e.getMessage();
        }
        if (tokenFail) {
            // 将订单从临时表保存进正式表的算法
            String resultInfo = doOrder(groupId, shop);// 处理当前店铺的当前批次的订单
            System.out.println(resultInfo);
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            // String downDate = format.format(starttime);
            String sqlUpt = "update DB_Shop set reserve9='" + Sys.getCtime() + "' where sid='" + shop.getSid() + "'";
            // 插入日志
            String sqlLog = "insert into db_ebayapilog ("
                    + "sequenceid,sid,name,descr,oper,opertime,corpid,openflag,shoptypeid,shoptypename,apitime,lastapitime,reserve1,reserve2,daydiff"
                    + ")values ('" + Sys.getCtime() + shop.getSid() + "','" + shop.getSid() + "','" + shop.getName()
                    + "','" + desc + "','sys',sysdate,'1','1','" + shop.getSid() + "','" + shop.getName()
                    + "','0000',sysdate,'" + groupId + "','1','1')";

            String sqlDeleteOrderTemp = "delete db_lazadaorderinfo where groupid=" + groupId;
        }

    }

    /**
     * 计算缺货
     */
    @Override
    public void calcuOrder() {

    }

    /**
     * 改变时间格式
     *
     * @param date
     * @return
     */
    private String changeDateType(Date date) {
        String dateStr = Sys.date2strMis(date);
        return dateStr.substring(0, 4) + "-" + dateStr.substring(4, 6) + "-" + dateStr.substring(6, 8) + "T"
                + dateStr.substring(8, 10) + ":" + dateStr.substring(10, 12) + ":" + dateStr.substring(12, 14)
                + "+00:00";
    }


    /**
     * 下载订单
     *
     * @param groupId
     * @param shop
     * @return
     */
/*    private String doOrder(long groupId, DbShop shop) {
        String result = "默认失败";
        try {
            // 专门找出异常类的,做处理
            // 找出Db_lazadaorderinfo.ramarks里不为空的记录,遍历,将ramarks更新到db_order.content....

            // 首先剔除重复订单
            System.out.println("删除重复订单开始:" + Sys.getCtime());
            this.clearDataFromLazadaTemp(groupId, shop);
            System.out.println("删除重复订单结束:" + Sys.getCtime());

            // 找出Db_lazadaorderinfo里checkflag=0的订单往正式Db_order,Db_sell里插入
            DbLazadaorderinfo lazadaorder = new DbLazadaorderinfo();
            lazadaorder.setGroupid(groupId);
            lazadaorder.setCheckflag(0);// 0表示前期验证通过的
            RetCode rtorder = findLazadaorderinfo(lazadaorder);
            if (rtorder.getObj() != null) {// 如果有订单记录
                ArrayList<DbLazadaorderinfo> list = (ArrayList<DbLazadaorderinfo>) rtorder.getObj();
                int i = 0;
                for (DbLazadaorderinfo o : list) {
                    i++;
                    try {
                        // 将订单信息从临时表里取的的对象往正式表里插入
                        double moneyrate = 1.0;
                        if ("MYR".equals(o.getCurrencyid())) {
                            moneyrate = 1.6687;
                        } // 默认马来西亚币兑换人民币
                        if ("PHP".equals(o.getCurrencyid())) {
                            moneyrate = 0.1376;
                        } // 默认菲律宾币兑换人民币
                        if ("SGD".equals(o.getCurrencyid())) {
                            moneyrate = 4.5687;
                        } // 默认新加坡币兑换人民币
                        if ("THB".equals(o.getCurrencyid())) {
                            moneyrate = 0.1830;
                        } // 默认泰国币兑换人民币
                        if ("IDR".equals(o.getCurrencyid())) {
                            moneyrate = 0.00048;
                        } // 默认印尼币兑换人民币
                        if ("VND".equals(o.getCurrencyid())) {
                            moneyrate = 0.0003;
                        } // 默认越南盾兑换人民币

                        if (!Sys.isNull(o.getCurrencyid()) && this.moneyMap != null
                                && moneyMap.get(o.getCurrencyid()) != null) {// 如果有币种
                            moneyrate = moneyMap.get(o.getCurrencyid()).doubleValue();
                        } else {// 遇到了马帮币种里不存在的全新币种
                            saveMoneyrate(o.getCurrencyid(), moneyrate);
                            this.moneyMap.put(o.getCurrencyid(), new BigDecimal(moneyrate));
                        }

                        RetCode rt = saveOrderInfoFromLazadatemp(i, o, manyStorageflag, manyStorageSku,
                                LazadaYml.getHoldSpace(), LazadaYml.getSkuPosition(), moneyrate, LazadaYml.getPlatformFeeRate());// 保存订单信息
                        log.info("保存订单到正式表：订单号：" + o.getOrderid() + "订单信息：" + JSON.toJSONString(o));
                        if (rt.getCode() == 0) {
                            String description = "";// 第2种描述,一般是匹配多仓的信息
                            try {
                                description = (String) rt.getObj();
                            } catch (Exception e) {
                            }
                            if (Sys.isNull(description) == true) {
                                description = "";
                            }
                            o.setCheckflag(2);
                            o.setCheckdescr("保存成功");
                            RetCode rtSucc = updateLazadaorderinfo(o);
                            *//*log.info("导入第" + i + "/" + ordertotal + "个订单成功" + "----订单信息:OrderID=" + o.getOrderid()
                                    + ",主交易ID=" + o.getTradeid() + ",买家ID=" + o.getCustomerid() + ",买家地址="
                                    + o.getAddress1() + ",产品名=" + o.getProductname() + ",SKU=" + o.getSku()
                                    + ",运费=" + o.getShippingamount() + ",订单金额="
                                    + (o.getPaidprice() * o.getQuantity()) + ",订单量=" + o.getQuantity() + "处理结果"
                                    + rt.getDesc() + "," + description);*//*
                        } else {
                            o.setCheckflag(1);
                            o.setCheckdescr(rt.getDesc().replace("'", ""));// 失败原因
                            RetCode rtErr = updateLazadaorderinfo(o);
                            *//*log.info("导入第" + i + "/" + ordertotal + "个订单失败," + rt.getDesc() + "," + rt.getDesc()
                                    + "----订单信息:OrderID=" + o.getOrderid() + ",主交易ID=" + o.getTradeid()
                                    + ",买家ID=" + o.getCustomerid() + ",买家地址=" + o.getAddress1() + ",产品名="
                                    + o.getProductname() + ",SKU=" + o.getSku() + ",运费=" + o.getShippingamount()
                                    + ",订单金额=" + (o.getPaidprice() * o.getQuantity()) + ",订单量="
                                    + o.getQuantity());*//*
                        }
                    } catch (Exception e) {// 出现异常
                        o.setCheckflag(1);
                        o.setCheckdescr(e.getMessage().replace("'", ""));// 失败原因
                        RetCode rtErr = updateLazadaorderinfo(o);
                        *//*log.info("导入第" + i + "/" + ordertotal + "个订单异常," + e.getMessage() + "----订单信息:OrderID="
                                + o.getOrderid() + ",主交易ID=" + o.getTradeid() + ",买家ID=" + o.getCustomerid()
                                + ",买家地址=" + o.getAddress1() + ",产品名=" + o.getProductname() + ",SKU="
                                + o.getSku() + ",运费=" + o.getShippingamount() + ",订单金额="
                                + (o.getPaidprice() * o.getQuantity()) + ",订单量=" + o.getQuantity());
*//*
                    }
                }
                System.out.println("后期整理订单开始:" + groupId);
                // 计算商品的总订单量和订单的总金额等
                updateCalculateNew(groupId);
                // 拼接locationid和categoryid
                RetCode rt30 = lazadaMgr.updateLoacationandStorage(syncLocationFlag);
                syncLocationFlag = false;// 以后都传入false,只查询最近6小时的,否则查询最近20天的
                if (rt30.getObj() != null) {
                    ArrayList<DbOrder> orderlist = (ArrayList<DbOrder>) rt30.getObj();
                    int m = 0;
                    for (DbOrder o : orderlist) {
                        m++;
                        String updateSQL = "update db_order set locationid='" + o.getLocationid() + "',location='"
                                + o.getLocation() + "',storageid='" + o.getStorageid() + "' where orderid='"
                                + o.getOrderid() + "'";
                        lazadaMgr.updateExecuteSQL(updateSQL);
                    }
                }
                System.out.println("后期整理订单结束:" + groupId);
                result = "0无订单记录";
            } else {// 都被剔除重复了,没有剩余的新付款订单
                result = "1无订单记录";
                System.out.println(result + ",批次:" + groupId);
            }

            // 生成最终处理文档
            System.out.println("生成最终处理结果");
            DbLazadaorderinfo lazadaorderinfo = new DbLazadaorderinfo();
            lazadaorderinfo.setGroupid(groupId);
            RetCode rtorder2 = lazadaMgr.findLazadaorderinfo(lazadaorderinfo);
            int sellnum = 0;// 商品明细条数
            successOrdernum = 0L;
            if (rtorder2.getObj() != null) {
                ArrayList<DbLazadaorderinfo> list = (ArrayList<DbLazadaorderinfo>) rtorder2.getObj();
                sellnum = list.size();
                int xx = 0;
                for (DbLazadaorderinfo o : list) {
                    xx++;
                    if (1 == o.getCheckflag()) {
                        log.info("导入第" + xx + "/" + list.size() + "个商品导入失败,原因:" + o.getCheckdescr() + "----临时订单信息:SeqID="
                                + o.getSequenceid() + ",OrderID=" + o.getTradeid() + ",交易ID=" + o.getTradeid()
                                + ",买家ID=" + o.getCustomerid() + ",买家地址=" + o.getAddress1() + ",产品名="
                                + o.getProductname() + ",SKU=" + o.getSku() + ",运费=" + o.getShippingamount()
                                + ",订单金额=" + o.getPaidprice() * o.getQuantity() + ",订单量=" + o.getQuantity());
                    } else if (2 == o.getCheckflag()) {
                        successOrdernum++;
                        log.info("导入第" + xx + "/" + list.size() + "个商品导入成功----临时订单信息:SeqID=" + o.getSequenceid()
                                + ",OrderID=" + o.getTradeid() + ",交易ID=" + o.getTradeid() + ",买家ID="
                                + o.getCustomerid() + ",买家地址=" + o.getAddress1() + ",产品名=" + o.getProductname()
                                + ",SKU=" + o.getSku() + ",运费=" + o.getShippingamount() + ",订单金额="
                                + o.getPaidprice() * o.getQuantity() + ",订单量=" + o.getQuantity());
                    } else {// errorflag=0的情况,应该不可能发生
                        log.info("导入第" + xx + "/" + list.size() + "个商品导入失败,原因:未执行操作----临时订单信息:SeqID=" + o.getSequenceid()
                                + ",OrderID=" + o.getTradeid() + ",交易ID=" + o.getTradeid() + ",买家ID="
                                + o.getCustomerid() + ",买家地址=" + o.getAddress1() + ",产品名=" + o.getProductname()
                                + ",SKU=" + o.getSku() + ",运费=" + o.getShippingamount() + ",订单金额="
                                + o.getPaidprice() * o.getQuantity() + ",订单量=" + o.getQuantity());
                    }
                }
            }

            result = "0导入订单批次:" + groupId + ",共读取" + ordertotal + "条订单," + sellnum + "个商品,导入成功" + successOrdernum
                    + "个商品,失败" + (sellnum - successOrdernum) + "条商品";

            System.out.println(result);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("外部Exception异常:" + e.getMessage());
            result = "1" + e.getMessage();
        }

        return result;
    }*/


    /**
     * 订单存入临时表
     *
     * @param recordId
     * @param obj
     * @param manyStorageflag
     * @param manyStorageSku
     * @param holdSpace
     * @param skuPosition
     * @param moneyrate
     * @param platformFeeRate
     * @return
     */
    @Override
    public RetCode saveOrderInfoFromLazadatemp(int recordId, DbLazadaorderinfo obj, boolean manyStorageflag,
                                               String manyStorageSku, boolean holdSpace, String skuPosition, double moneyrate, double platformFeeRate) {
        RetCode rt = new RetCode(1001, "无记录0/0", "");
        String originsku = "";// 原始sku,不做任何改变
        if (obj != null && Sys.isNull(obj.getSku()) == false) {
            String sku = Sys.findSku(obj.getSku());
            if ("1".equals(skuPosition) == true) {// 如果是取@#后面的字符串
                sku = Sys.findSkuFromMid(obj.getSku());
            }
            originsku = obj.getSku();
            sku = sku.trim();// 剔除前后空格
            if (false == holdSpace) {// 如果不保留空格,那么就自动剔除掉,默认都是剔除的
                sku = sku.replace(" ", "");// 空格,注:不剔除中间的空格,因为有用户的sku中间就是带有空格,不希望被剔除掉
            }
            sku = sku.replace("	", "");// tab
            sku = sku.replace("*", "");// *号
            sku = sku.replace("&", "");// &号
            obj.setSku(sku);
        }
        int orderflag = 0;
        int sellflag = 0;
        try {
            Connection conn = lazadaorderinfoDAO.getSessionFactory().getCurrentSession().connection();
            if (Sys.isNull(obj.getCustomerid()) == true || Sys.isNull(obj.getSku()) == true
                    || Sys.isNull(obj.getTradeid()) == true) {
                rt.setCode(1000);
                rt.setDesc("资料不全" + orderflag + "/" + sellflag);
                return rt;
            }
            // 第0步:
            if (true == manyStorageflag) {// 如果有manyStorageflag=true,表示该用户至少有使用多仓功能
                // 根据sku和买家国籍缩写来找sku
                try {
                    if (manyStorageSku.indexOf("," + obj.getSku() + ",") >= 0) {// 下载的sku包含在多仓的主sku中,那么去获取对应的某仓库的子sku
                        rt.setObj("多仓SKU切换");
                        String sqlSearch1 = "select productid from DB_MULTI_WAREHOUSE where mainsku='" + obj.getSku()
                                + "' and countryjc like '%;" + obj.getCountrycode() + ";%'";
                        System.out.println(obj.getSku() + "属于多仓sku,查询对应海外仓sku-SQL=" + sqlSearch1);
                        Statement stmSearch1 = conn.createStatement();
                        ResultSet rs1 = stmSearch1.executeQuery(sqlSearch1);
                        if (rs1.next()) {
                            rt.setObj("多仓SKU切换:" + obj.getSku() + "->" + rs1.getString("productid"));
                            obj.setSku(rs1.getString("productid"));// 如果有对应的多仓指定sku
                            System.out.println(obj.getSku() + "属于多仓sku>" + rs1.getString("productid"));
                        } else {
                            String sqlSearch2 = "select productid from DB_MULTI_WAREHOUSE where mainsku in(select sequenceid from db_product where alias1 like'%,"
                                    + obj.getSku() + ",%') and countryjc like '%;" + obj.getCountrycode() + ";%'";
                            Statement stmSearch2 = conn.createStatement();
                            ResultSet rs2 = stmSearch2.executeQuery(sqlSearch2);
                            if (rs2.next()) {
                                rt.setObj("多仓SKU切换:" + obj.getSku() + "->" + rs2.getString("productid"));
                                obj.setSku(rs2.getString("productid"));// 如果有对应的多仓指定sku
                                System.out.println(
                                        obj.getSku() + "属于多仓sku>" + rs2.getString("productid") + ",根据alias1找到");
                            } else {
                                System.out.println(obj.getSku() + "竟然没找到对应多仓sku:sql=" + sqlSearch2);
                            }
                            rs2.close();
                            stmSearch2.close();
                        }
                        rs1.close();
                        stmSearch1.close();
                    }
                } catch (Exception e) {
                    ;
                }
            }

            // 第一步.判断db_order订单是否存在,如果不存在,则保存,否则更新---------------------
            Statement stmSearchOrder = conn.createStatement();
            // 根据主交易编号maintradeid是否已经存在来判断订单是否创建
            String sql_order = "select orderid,tradeid,status,reserve20 from db_order where tradeid='"
                    + obj.getTradeid() + "' and shoptypeid='" + obj.getShopid() + "'";
            ResultSet rsOrder = stmSearchOrder.executeQuery(sql_order);
            if (rsOrder.next()) {//
                // 这句很重要,因为单笔订单,从外面传入的入参对象中orderid是空的!!!!切记,而下面在插入dbSell时需要用到orderid
                obj.setOrderid(Sys.isCheckNull(rsOrder.getString("orderid")));
                String reserve20 = Sys.isCheckNull(rsOrder.getString("reserve20"));
                if ("Lazada".equals(reserve20) == true) {// 如果是手动导入的订单,则不再执行后面操作
                    rt.setCode(1000);
                    rt.setDesc("该订单曾被手动导入过");
                    return rt;
                }
            } else {// 如果记录不存在,则保存
                this.saveOrder(obj, skuPosition, moneyrate, platformFeeRate);
                orderflag = 1;
                rt.setDesc("插入Db_orde成功");
            }
            rsOrder.close();
            stmSearchOrder.close();

            // 第二步:保存用户资料------------------------------------------------------
            // this.saveCustomer(obj);
            // System.out.println("SQL第三部分:"+Sys.getCtime());

            // 第三步:查询是否正常商品,如果是,(系统稳定运行后,90%以上的订单都走此流程,所以速度比原来先查询捆绑商品要快很多)
            String tempsku = Sys.findSku(obj.getSku());
            if ("1".equals(skuPosition) == true) {// 如果是取@#后面的字符串
                tempsku = Sys.findSkuFromMid(obj.getSku());
            }
            DbProduct product = productDAO.findById(tempsku);// 注意是按sequenceid来查,而不是sid,虽然sequenceid=sid
            if (product != null) {
                // 由于是Lazada的产品itemid,所以不将itemid保存到产品中,避免与ebay的冲突
                /*
                 * if(Sys.isNull(product.getOriginarea()) == true ||
                 * Sys.isCheckNull(obj.getEbayitemid()).equals(product.getOriginarea()) ==
                 * false){product.setOriginarea(obj.getEbayitemid());}
                 */
                DbSell sell = new DbSell();
                sell.setSid(obj.getOrderid() + Sys.getRand(4) + recordId);// 编号为交易号+4位随机数,理论上应该是唯一的
                sell.setDescr3(originsku);// 原始sku
                sell.setReserve9("" + obj.getQuantity());// 原始采购量
                sell.setCorpid(obj.getCorpid());
                sell.setOrderid(obj.getOrderid());
                sell.setProductid(product.getSid());// 真实的sku
                sell.setProductname(product.getName());
                sell.setOrdernum(Long.valueOf(obj.getQuantity()));
                sell.setCostprice(product.getCostprice());
                sell.setSellprice(obj.getPaidprice() * moneyrate);// 付款金额
                sell.setAmount(sell.getSellprice() * sell.getOrdernum());
                sell.setCustomerid(obj.getCustomerid());
                sell.setReserve2("");// 保存商品的单位如lots/piece by qinli 20140314
                sell.setOrdertime(obj.getCreateddate());
                sell.setAlertflag("0");
                sell.setShoptype(obj.getShopname());
                sell.setProductpic1(Sys.isCheckNull(product.getPicture3()));
                sell.setShoptypeid(obj.getShopid());
                sell.setOper("sys");
                sell.setOpertime(new Date());
                sell.setFlag("1");
                sell.setReserve7(obj.getProvince());// 保存省份,原因未知
                sell.setMoneyrate(moneyrate);// 汇率
                sell.setFlag("1");
                sell.setDescr2("");// 多物品选择
                sell.setXbtime1(new Date());// 订单下载时间
                sell.setTradeid(obj.getTradeid());
                sell.setTransactionid(obj.getOrderid());
                sell.setOriginsellprice(obj.getPaidprice());
                sell.setMoneytype(obj.getCurrencyid());// 比重
                sell.setGroupid("" + obj.getGroupid());
                sell.setEbayitemid(obj.getOrderitemid());// Lazada的商品ID
                sell.setPackagingid(product.getPackagingid());// 包材id
                sell.setPackagingname(product.getPackagingname());// 包材名称
                sell.setPackagingweight(product.getPackagingweight());// 包材重量
                sell.setPackagingclass(product.getIclass());// 包材级别
                sell.setWeight(product.getWeight().doubleValue());// 商品重量
                if (sell.getWeight() == null) {
                    sell.setWeight(0D);
                }
                sell.setWeightamount(sell.getWeight() * sell.getOrdernum());// 商品的总重量

                sell.setStorage(product.getStorage());// 仓库
                sell.setStorageid(product.getStorageid());
                sell.setLocation(product.getLocation());// 仓位
                sell.setLocationid(product.getLocationid());

                sell.setFinalvaluefee(obj.getPaidprice() * obj.getQuantity() * platformFeeRate * moneyrate);// 最终Lazada交易费=订单原始金额*汇率*百分比
                sell.setOriginfinalvaluefee(obj.getPaidprice() * obj.getQuantity() * platformFeeRate);// Lazada原始交易费
                sell.setOriginexpressmoney(obj.getShippingamount());// Lazada原始运费
                sell.setMoneyrate(moneyrate);// 汇率
                if (sell.getOriginexpressmoney() != null && sell.getOriginexpressmoney() > 0) {
                    sell.setMoneyexpressask(sell.getOriginexpressmoney() * sell.getMoneyrate());// 如果有收取运费
                } else {
                    sell.setMoneyexpressask(0D);// 如果没有收取运费
                }
                sell.setOrigininsurance(0.0);// Lazada原始保险费
                sell.setFeedback("20");// Lazada订单,评价状态为20
                sell.setReserve4("Lazada订单");
                sell.setUpdateflag("0");// Lazada订单,同步状态为20
                sell.setReserve5("Lazada订单");
                sell.setOper1(Sys.isCheckNull(product.getOper2()));// 产品的配货员
                sell.setOper2(Sys.isCheckNull(product.getOper1()));// 产品的采购员
                sell.setSelloper(Sys.isCheckNull(product.getOper3()));// 产品的销售员
                sell.setEnglishname(obj.getProductname());// 产品在Lazada上的名称

                sell.setPaypalfee(0D);
                sell.setOriginsku(product.getReserve7());// 原厂sku
                sellDAO.save(sell);
                sellflag = 1;

                rt.setCode(0);
                rt.setDesc("保存成功!" + orderflag + "/" + sellflag);
                rt.setDetail(obj.getOrderid());// 将订单ID返回到调用方法,有用
                return rt;
            } else {// 否则再去查询是否捆绑商品,如果都不是,则创建商品(这种概率已经比较小了)
                boolean Bindflag = false;
                Statement stmCount = conn.createStatement();
                int bindC = 0;
                int bindCount = 0;
                String sqlCount = "select count(*) as scount from db_bindlist where bindid='" + tempsku + "'";
                ResultSet rsCount = stmCount.executeQuery(sqlCount);
                if (rsCount.next()) {
                    bindC = rsCount.getInt("scount");
                } else {
                    bindC = 0;
                }
                rsCount.close();
                stmCount.close();

                if (bindC < 1) {
                    Bindflag = false;// 无捆绑商品
                } else {
                    // Statement stmBind =
                    // conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);//注意要加上此参数,否则后面使用rs.last()会报异常
                    Statement stmBind = conn.createStatement();
                    String sqlBind = "select a.alias1,a.num,b.name,b.costprice,b.oper2,b.oper1,b.packagingid,b.packagingname,b.packagingweight,b.iclass,b.weight,b.storageid,b.storage,b.locationid,b.location,b.reserve7,b.picture3 from db_bindlist a left join db_product b on a.alias1= b.sid where a.bindid='"
                            + tempsku + "'";
                    ResultSet rsBind = stmBind.executeQuery(sqlBind);
                    while (rsBind.next()) {
                        rt.setDesc("找到捆绑商品1111");

                        Bindflag = true;
                        bindCount++;// 绑定计数,当bindCount>2时,即第2件以上的绑定商品的售价为0
                        String bindProductid = Sys.isCheckNull(rsBind.getString("alias1"));// 被绑定的商品编号
                        String bindProductname = Sys.isCheckNull(rsBind.getString("name"));// 被绑定的商品名称
                        String pickupoper = Sys.isCheckNull(rsBind.getString("oper2"));// 该产品的配货员
                        String purchaseoper = Sys.isCheckNull(rsBind.getString("oper1"));// 该产品的采购员
                        String packagingid = Sys.isCheckNull(rsBind.getString("packagingid"));// 包材id
                        String packagingname = Sys.isCheckNull(rsBind.getString("packagingname"));// 包材名称
                        Double packagingweight = rsBind.getDouble("packagingweight");// 包材重量
                        String picture3 = Sys.isCheckNull(rsBind.getString("picture3"));// 获取橱窗小图片
                        if (packagingweight == null) {
                            packagingweight = 0D;
                        }
                        String packagingclass = Sys.isCheckNull(rsBind.getString("iclass"));// 包材级别
                        Double weight = rsBind.getDouble("weight");// 商品重量
                        if (weight == null) {
                            weight = 0D;
                        }
                        rt.setDesc("找到捆绑商品2222");
                        String storageid = Sys.isCheckNull(rsBind.getString("storageid"));
                        String storage = Sys.isCheckNull(rsBind.getString("storage"));
                        String locationid = Sys.isCheckNull(rsBind.getString("locationid"));
                        String location = Sys.isCheckNull(rsBind.getString("location"));
                        String yuanchangSku = Sys.isCheckNull(rsBind.getString("reserve7"));// 原厂sku

                        // 这里还要判断被捆绑商品是否也是多仓概念
                        if (true == manyStorageflag) {// 如果有manyStorageflag=true,表示该用户至少有使用多仓功能
                            // 根据sku和买家国籍缩写来找sku
                            try {
                                if (manyStorageSku.indexOf("," + bindProductid + ",") >= 0) {// 被捆绑的sku包含在多仓的主sku中,那么去获取对应的某仓库的子sku
                                    String sqlSearch91 = "select sid,name,costprice,oper2,oper1,packagingid,packagingname,packagingweight,iclass,weight,storageid,storage,locationid,location,reserve7 from db_product where sid in(select productid from DB_MULTI_WAREHOUSE where mainsku='"
                                            + bindProductid + "' and countryjc like '%;" + obj.getCountrycode()
                                            + ";%')";
                                    Statement stmSearch91 = conn.createStatement();
                                    ResultSet rs91 = stmSearch91.executeQuery(sqlSearch91);
                                    if (rs91.next()) {
                                        bindProductid = Sys.isCheckNull(rs91.getString("sid"));// 被绑定的商品编号
                                        bindProductname = Sys.isCheckNull(rs91.getString("name"));// 被绑定的商品名称
                                        pickupoper = Sys.isCheckNull(rs91.getString("oper2"));// 该产品的配货员
                                        purchaseoper = Sys.isCheckNull(rs91.getString("oper1"));// 该产品的采购员
                                        packagingid = Sys.isCheckNull(rs91.getString("packagingid"));// 包材id
                                        packagingname = Sys.isCheckNull(rs91.getString("packagingname"));// 包材名称
                                        packagingweight = rs91.getDouble("packagingweight");// 包材重量
                                        if (packagingweight == null) {
                                            packagingweight = 0D;
                                        }
                                        packagingclass = Sys.isCheckNull(rs91.getString("iclass"));// 包材级别
                                        weight = rs91.getDouble("weight");// 商品重量
                                        if (weight == null) {
                                            weight = 0D;
                                        }
                                        storageid = Sys.isCheckNull(rs91.getString("storageid"));
                                        storage = Sys.isCheckNull(rs91.getString("storage"));
                                        locationid = Sys.isCheckNull(rs91.getString("locationid"));
                                        location = Sys.isCheckNull(rs91.getString("location"));
                                        yuanchangSku = Sys.isCheckNull(rs91.getString("reserve7"));// 原厂sku

                                        rt.setObj("(捆绑商品)多仓SKU切换:" + rsBind.getString("alias1") + "->"
                                                + Sys.isCheckNull(rs91.getString("alias1")));
                                    } else {
                                        ;// 如果没有,也不用根据alias1去查别名了->找到主sku-->再找到多仓的子sku了.因为db_bindlist里的alias1被捆绑的sku肯定是db_product.sid,不可能存在于db_product.alias1
                                    }
                                    rs91.close();
                                    stmSearch91.close();
                                }
                            } catch (Exception e) {// 出现异常则不匹配
                                ;
                            }
                        }

                        Double bindProductcostprice = rsBind.getDouble("costprice");// 被绑定的商品的成本
                        Long bindNum = rsBind.getLong("num");// 绑定销售的数量
                        if (Sys.isNull(bindProductid) == false && Sys.isNull(bindProductname) == false && bindNum > 0) {// bindProductname不为空表示在db_product里有对应产品
                            rt.setDesc("找到捆绑商品3333");
                            DbSell sell = new DbSell();
                            sell.setSid(obj.getOrderid() + bindCount + Sys.getRand(4) + recordId);// 编号为交易号+绑定序列号+2位随机数,理论上应该是唯一的
                            sell.setDescr3(originsku);// 原始sku
                            sell.setReserve9("" + obj.getQuantity());
                            sell.setCorpid(obj.getCorpid());
                            sell.setOrderid(obj.getOrderid());
                            sell.setProductid(bindProductid);
                            sell.setProductname(bindProductname);
                            sell.setOrdernum(obj.getQuantity() * bindNum);// 实际订购量=订单的订购量*绑定商品数量
                            sell.setCostprice(bindProductcostprice);
                            sell.setSellprice(obj.getPaidprice() * moneyrate / bindNum / bindC);// 实际销售价格为订单上的单价除以绑定商品数量,除以捆绑sku个数
                            // by qinli 20140331
                            sell.setAmount(sell.getSellprice() * sell.getOrdernum());
                            sell.setFinalvaluefee(
                                    obj.getPaidprice() * obj.getQuantity() * moneyrate * platformFeeRate / bindC);// 最终Lazada交易费(根据捆绑商品数量均分)
                            /*
                             * if(bindCount > 1){//如果bindCount>1,表示是第2件以上的绑定商品,则售价为0,因为价格全部赋予给第1件商品了
                             * sell.setSellprice(0D); sell.setAmount(0D); }
                             */
                            sell.setCustomerid(obj.getCustomerid());
                            sell.setOrdertime(new Date());
                            sell.setAlertflag("0");
                            sell.setShoptype(obj.getShopname());
                            sell.setShoptypeid(obj.getShopid());
                            sell.setFeedback("20");// Lazada订单,评价状态为20
                            sell.setReserve4("Lazada订单");
                            sell.setUpdateflag("0");// Lazada订单,同步状态为20
                            sell.setReserve5("Lazada订单");
                            sell.setOper("sys");
                            sell.setOpertime(new Date());
                            sell.setProductpic1(Sys.isCheckNull(picture3));// Orderreserve3被用来临时保存XML中解析的产品橱窗图片
                            sell.setReserve7(obj.getProvince());// 保存省份,原因未知
                            sell.setFlag("1");
                            sell.setMoneyrate(moneyrate);// 汇率
                            sell.setXbtime1(new Date());// 订单下载时间
                            sell.setGroupid("" + obj.getGroupid());// 批次
                            sell.setDescr2("");// 多物品选择,如加大码等买家要求的信息
                            sell.setDescr1("此商品属捆绑商品");
                            sell.setTradeid(obj.getTradeid());
                            sell.setTransactionid(obj.getOrderid());// 交易ID
                            sell.setOriginsellprice(obj.getPaidprice() * obj.getQuantity() / bindNum / bindC);// 原始售价全部给第1个商品
                            /*
                             * if(bindCount > 1){ sell.setOriginsellprice(0D);//第2个商品无原始售价 }
                             */
                            sell.setReserve2("");// 保存商品的单位如lots/piece by qinli 20140314
                            sell.setMoneytype(obj.getCurrencyid());// 货币符号
                            sell.setEbayitemid(obj.getOrderitemid());
                            sell.setOper1(pickupoper);// 配货员---
                            sell.setOper2(purchaseoper);// 采购员
                            sell.setPackagingid(packagingid);// 包材id
                            sell.setPackagingname(packagingname);// 包材名称
                            sell.setPackagingweight(packagingweight);// 包材重量
                            sell.setPackagingclass(packagingclass);// 包材级别
                            sell.setWeight(weight);// 商品重量
                            sell.setWeightamount(sell.getWeight() * sell.getOrdernum());// 商品总重量

                            sell.setStorage(storage);
                            sell.setStorageid(storageid);
                            sell.setLocation(location);
                            sell.setLocationid(locationid);
                            sell.setOriginfinalvaluefee(
                                    obj.getPaidprice() * obj.getQuantity() * platformFeeRate / bindC);
                            sell.setOriginexpressmoney(obj.getShippingamount() / bindC);// eBay原始运费
                            sell.setOrigininsurance(0.0);// eBay原始保险费
                            sell.setMoneyrate(moneyrate);// 汇率
                            sell.setMoneyexpressask(sell.getOrigininsurance() * sell.getMoneyrate());// 运费
                            sell.setEnglishname(obj.getProductname());// 产品在ebay上的名称
                            sell.setPaypalfee(0D);
                            sell.setOriginsku(yuanchangSku);// 原厂sku
                            try {
                                System.out.println("处理绑定商品,父商品ID=" + obj.getSku() + ",子商品ID为:" + bindProductid
                                        + ",处理时间:" + Sys.getCtime());
                                sellDAO.save(sell);
                                sellflag = 1;
                                System.out.println("处理绑定商品完:" + Sys.getCtime());
                            } catch (Exception e) {
                                System.out.println("订单处理异常bbbbbbbbb:" + e.getMessage());
                                rt.setCode(1000);
                                rt.setDesc("保存订单异常abc:" + e.getMessage());
                            }
                        }
                    }
                    stmBind.close();
                }

                if (Bindflag == true) {// 如果是绑定商品,上面已经处理过了
                    rt.setCode(0);
                    rt.setDesc("导入成功!" + orderflag + "/" + sellflag);
                    rt.setDetail(obj.getOrderid());// orderid返回调用方法,有用
                    return rt;
                } else {
                    // 第五步:如果不是绑定商品,则只能再去查询sku是否是db_product里的子SKU,如果再不存在，只能创建
                    // 5.1.查询商品是否存在,如不存在,则创建---------------------------
                    DbProduct dp = new DbProduct();
                    dp.setSid(tempsku);// 商品自定义标签就是sku
                    dp.setName(obj.getProductname());// 产品名称
                    dp.setOriginarea(obj.getOrderitemid());// EbayItemID保存在Originarea字段中
                    dp.setCorpid(obj.getCorpid());
                    dp.setOper("sys");
                    dp.setSellprice(obj.getPaidprice() * moneyrate);
                    dp.setPicture3("");// Lazada图片地址
                    RetCode rtdp = this.saveAndfindProduct(dp);// 查找该产品，如果找不到就创建
                    dp = (DbProduct) rtdp.getObj();
                    // ----验证订单订单完--------------------------------------------------
                    // System.out.println("SQL第五部分:"+Sys.getCtime());
                    DbSell sell = new DbSell();
                    sell.setSid(obj.getOrderid() + Sys.getRand(4) + recordId);// 编号为订单号+交易号+2位随机数,理论上应该是唯一的
                    sell.setDescr3(originsku);// 原始sku
                    sell.setReserve9("" + obj.getQuantity());
                    sell.setCorpid(obj.getCorpid());
                    sell.setOrderid(obj.getOrderid());
                    sell.setProductid(dp.getSid());
                    sell.setProductname(dp.getName());
                    sell.setOrdernum(Long.valueOf(obj.getQuantity()));
                    sell.setCostprice(dp.getCostprice());
                    sell.setSellprice(obj.getPaidprice() * moneyrate);
                    sell.setAmount(sell.getSellprice() * sell.getOrdernum());
                    sell.setCustomerid(obj.getCustomerid());
                    sell.setOrdertime(obj.getCreateddate());
                    sell.setAlertflag("0");
                    sell.setShoptype(obj.getShopname());
                    sell.setProductpic1("");
                    sell.setShoptypeid(obj.getShopid());
                    sell.setFeedback("20");// Lazada订单,评价状态为20
                    sell.setReserve4("Lazada订单");
                    sell.setUpdateflag("0");// Lazada订单,同步状态为20
                    sell.setReserve5("Lazada订单");
                    sell.setOper("sys");
                    sell.setOpertime(new Date());
                    sell.setFlag("1");
                    sell.setReserve7(obj.getProvince());// 保存省份,原因未知
                    sell.setMoneyrate(moneyrate);// 汇率
                    sell.setDescr2("");// 多物品选择
                    sell.setTradeid(obj.getTradeid());
                    sell.setTransactionid(obj.getOrderid());
                    sell.setOriginsellprice(obj.getPaidprice());
                    sell.setMoneytype(obj.getCurrencyid());
                    sell.setGroupid("" + obj.getGroupid());
                    sell.setEbayitemid(obj.getOrderitemid());
                    sell.setPackagingid(dp.getPackagingid());// 包材id
                    sell.setPackagingname(dp.getPackagingname());// 包材名称
                    sell.setPackagingweight(dp.getPackagingweight());// 包材重量
                    sell.setPackagingclass(dp.getIclass());// 包材级别
                    sell.setWeight(dp.getWeight().doubleValue());// 商品重量
                    if (sell.getWeight() == null) {
                        sell.setWeight(0D);
                    }
                    sell.setWeightamount(sell.getWeight() * sell.getOrdernum());// 商品的总重量

                    sell.setStorage(dp.getStorage());// 仓库
                    sell.setStorageid(dp.getStorageid());
                    sell.setXbtime1(new Date());// 订单下载时间
                    sell.setLocation(dp.getLocation());// 仓位
                    sell.setLocationid(dp.getLocationid());
                    sell.setReserve2("");// 保存商品的单位如lots/piece by qinli 20140314
                    sell.setFinalvaluefee(obj.getPaidprice() * obj.getQuantity() * moneyrate * platformFeeRate);// 最终Lazada交易费
                    sell.setOper1(Sys.isCheckNull(dp.getOper2()));// 产品的配货员
                    sell.setOper2(Sys.isCheckNull(dp.getOper1()));// 采购员
                    sell.setOriginfinalvaluefee(obj.getPaidprice() * obj.getQuantity() * platformFeeRate);// Lazada原始交易费
                    sell.setOriginexpressmoney(obj.getShippingamount());// Lazada原始运费
                    sell.setMoneyexpressask(sell.getOriginexpressmoney() * sell.getMoneyrate());// 人民币运费
                    sell.setOrigininsurance(0.0);// Lazada原始保险费
                    sell.setEnglishname(obj.getProductname());// 产品在Lazada上的名称
                    sell.setMoneyrate(moneyrate);
                    sell.setPaypalfee(0D);
                    sell.setOriginsku(dp.getReserve7());// 原厂sku
                    sellDAO.save(sell);
                    sellflag = 1;

                    rt.setCode(0);
                    rt.setDesc("保存成功!" + orderflag + "/" + sellflag);
                    rt.setDetail(obj.getOrderid());// 将订单ID返回到调用方法,有用
                    return rt;
                }
            }
        } catch (Exception e) {
            System.out.println("订单处理异常aaaaa:" + e.getMessage());
            rt.setCode(1000);
            rt.setDesc("保存订单异常:" + e.getMessage());
        }
        return rt;
    }


    /**
     * 清理临时表
     * @param groupId
     * @param shop
     */
    /*@Override
    public void clearDataFromLazadaTemp(long groupId, DbShop shop) {
        int hh = Integer.valueOf(Sys.getCtime().substring(8, 10));// 获取当前系统时间的小时数值
        if (hh <= 8 || hh >= 20) {// 只有当非工作时间才执行这个语句,避免锁表
            String sqldeleteA = "update db_product set costprice='0' where costprice is null";
            lazadaMgr.updateExecuteSQL(sqldeleteA);
            String sqldeleteB = "update db_product set PACKAGINGWEIGHT='0' where PACKAGINGWEIGHT is null";
            lazadaMgr.updateExecuteSQL(sqldeleteB);
            String sqldeleteC = "update db_product set weight='0' where weight is null";
            lazadaMgr.updateExecuteSQL(sqldeleteC);
            String sqldeleteD = "update db_product set PACKAGINGFEE='0' where PACKAGINGFEE is null";
            lazadaMgr.updateExecuteSQL(sqldeleteD);
        }
        // 删除临时表中3天前的数据
        String sqldelete = "delete db_lazadaorderinfo where groupid <=" + (groupId - 300000);
        RetCode rtd = lazadaMgr.updateExecuteSQL(sqldelete);
        System.out.println("剔除3天前的数据:" + rtd.getDesc());

        String sql0 = "update db_lazadaorderinfo set checkflag='1',checkdescr='重复导入订单(已存在于db_lazadaorderinfo中)' where checkflag='0' and groupid='"
                + groupId + "' and orderid in(select orderid from db_lazadaorderinfo where shopid='" + shop.getSid()
                + "' and groupid!='" + groupId + "' and checkflag='1')";
        RetCode rt0 = lazadaMgr.updateExecuteSQL(sql0);
        System.out.println("找出db_lazadaorderinfo中已存在订单:" + rt0.getDesc());

        String sql1 = "update db_lazadaorderinfo set checkflag='1',checkdescr='重复导入订单(已存在于db_sell中)' where checkflag='0' and groupid='"
                + groupId + "' and  tradeid in (select tradeid from db_sell where tradeid is not null and shoptypeid='"
                + shop.getSid() + "')";
        RetCode rt1 = lazadaMgr.updateExecuteSQL(sql1);
        System.out.println("找出Db_sell中已存在订单:" + rt1.getDesc());

        String sql2 = "update db_lazadaorderinfo set checkflag='1',checkdescr='重复导入订单(已存在于db_sell_history中)' where checkflag='0' and groupid='"
                + groupId
                + "' and  orderitemid in (select tradeid from db_sell_history where tradeid is not null and shoptypeid='"
                + shop.getSid() + "')";
        RetCode rt2 = lazadaMgr.updateExecuteSQL(sql2);

        String sql3 = "update db_lazadaorderinfo set checkflag='1',checkdescr='重复导入订单(已存在于db_sell_bak中)' where checkflag='0' and groupid='"
                + groupId
                + "' and  orderitemid in (select tradeid from db_sell_bak where tradeid is not null and shoptypeid='"
                + shop.getSid() + "')";
        RetCode rt3 = lazadaMgr.updateExecuteSQL(sql3);
        // Item是退货的不需要导入
        String sql4 = "update db_lazadaorderinfo set checkflag=1,checkdescr='ItemStatus=returned,原因是:'||reason||reasondetail where itemstatus='returned' and checkflag='0' and groupid='"
                + groupId + "'";
        RetCode rt4 = lazadaMgr.updateExecuteSQL(sql4);
        // Item状态是failed,不需要导入
        String sql5 = "update db_lazadaorderinfo set checkflag=1,checkdescr='ItemStatus=failed,原因是:'||reason||reasondetail where itemstatus='failed' and checkflag='0' and groupid='"
                + groupId + "'";
        RetCode rt5 = lazadaMgr.updateExecuteSQL(sql5);
    }
*/

    /**
     * 查询临时表
     *
     * @param obj
     * @return
     */
    @Override
    public RetCode findLazadaorderinfo(DbLazadaorderinfo obj) {
        RetCode rt = new RetCode(1000, "操作失败", "操作失败");
        if (obj != null && obj.getSequenceid() != null) {
            try {
                DbLazadaorderinfo tmp = orderInfoMapper.selectByPrimaryKey(obj.getSequenceid());

                if (tmp != null) {
                    ArrayList<DbLazadaorderinfo> list = new ArrayList<DbLazadaorderinfo>();
                    list.add(tmp);

                    rt.setCode(0);
                    rt.setDesc("查询成功");
                    rt.setObj(list);
                }
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        } else {
            try {
                List<DbLazadaorderinfo> list = orderInfoMapper.selectByCriteria(obj);

                if (list != null && list.size() > 0) {
                    rt.setCode(0);
                    rt.setDesc("查询成功");
                    rt.setObj(list);
                    return rt;
                }
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
        return rt;
    }

    /**
     * 保存新币种
     *
     * @param currencyId
     * @param moneyrate
     */
    public void saveMoneyrate(String currencyId, double moneyrate) {
        try {
            boolean continueFlag = true;
            DbMoneyrate moneyRate = new DbMoneyrate();
            List<DbMoneyrate> list = moneyrateMapper.selectByCriteria(moneyRate);
            if (!list.isEmpty()) {
                continueFlag = false;
            }

            if (continueFlag) {
                // 获取最大的币种数字编号
                Integer mId = moneyrateMapper.selectMaxId();
                int nextId = 1;

                nextId = mId + 1;

                moneyRate.setSequenceid(nextId + "");
                moneyRate.setName(currencyId);
                moneyRate.setOper("sys");
                moneyRate.setOpertime(new Date());
                moneyRate.setFiled8(new BigDecimal(moneyrate));
                moneyRate.setCorpid("1");
                moneyRate.setOpenflag("1");
                // 插入新汇率
                moneyrateMapper.insertSelective(moneyRate);
            }
        } catch (Exception e) {
            System.out.println("保存新币种Exception异常:" + e.getMessage());
        }
    }

    /**
     * 更新lazada订单信息
     *
     * @param obj
     * @return
     */
    private RetCode updateLazadaorderinfo(DbLazadaorderinfo obj) {
        RetCode rt = new RetCode(1000, "操作失败", "操作失败");
        if (obj != null && obj.getSequenceid() != null) {
            if (Sys.isNull(obj.getCheckdescr()) == true) {
                obj.setCheckdescr("");
            }
            try {
                obj.setCheckdescr(obj.getCheckdescr().replace("'", "‘"));
                orderInfoMapper.updateByPrimaryKeySelective(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return rt;
    }


    // 查询用户是否有使用多仓,即查看DB_MULTI_WAREHOUSE表里有无记录
    @Override
    public RetCode findManyStorageSkuFlag() {
        RetCode rt = new RetCode(1000, "无多仓的SKU", "");
        try {
            StringBuffer sb = new StringBuffer();
            List<String> skus = multiWarehouseMapper.selectDistinctMainSku();

            List<Map<String, String>> resultMap = productMapper.selectSidAndAliasBySid(skus);
            for (Map<String, String> map : resultMap) {
                sb.append("," + map.get("sid") + ",");// 将sku追加进去
                if (Sys.isNull(map.get("alias1"))) {// 将主sku的alias1也追加进去
                    String alias1 = "," + map.get("alias1") + ",";
                    alias1 = alias1.replace(",,", ",");
                    alias1 = alias1.replace(",,", ",");
                    sb.append(alias1);
                }
            }
            String skuStr = sb.toString();
            if (Sys.isNull(skuStr) && skuStr.length() > 3) {
                rt.setCode(0);
                rt.setDesc("有多仓记录");
                rt.setObj(skuStr);
            } else {
                rt.setCode(1000);
                rt.setDesc("无多仓记录");
            }
        } catch (Exception e) {// 一般是表不存在
            System.out.println("查询DB_MULTI_WAREHOUSE异常" + e.getMessage());
            rt.setCode(1000);
            rt.setDetail("");
            rt.setObj(null);
        }
        return rt;
    }

   /* public void updateCalculateNew(long groupid) {
        try {
            int orderCount = 0;
            List<String> flagList = new ArrayList<>();
            flagList.add("1");
            flagList.add("0");
            // 第一步,计算每个商品的订单量,更新到db_product.ordernum
          List<Map<String,String>> resultList = sellMapper.selectSumOrderNumByGroup(groupid,flagList);

            for(Map<String,String> map:resultList) {
                try {
                    String productid = map.get("productid");
                    int ordernum = Integer.getInteger(map.get("ordernum"));
                    if (ordernum <= 0) {
                        ordernum = 0;
                    }
                    DbProduct dp = new DbProduct();
                    dp.setSequenceid(productid);
                    dp.setOrdernum(new BigDecimal(ordernum));
                    productMapper.updateByPrimaryKeySelective(dp);
                } catch (Exception e) {
                    ;
                }
            }
            System.out.println("整理完该批订单的各商品订单量");

            // 第二步:计算出每个订单的总金额,总重量,总成本,更新到db_order表
            List<Map<String,String>> resList = sellMapper.calculateorder(groupid);
            Iterator<Map<String,String>> iterator = resList.iterator();
            while (iterator.hasNext()) {
                Map<String,String> rs2 = iterator.next();
                try {
                    orderCount++;

                    String orderid = rs2.get("orderid");
                    Double moneyask = rs2.get("moneyask");// 总金额

                    Double originordermoney = rs2.get("originordermoney");// 增加总金额原始币种周平20150812
                    if (moneyask == null || moneyask <= 0D) {
                        moneyask = 0D;
                    }
                    Double moneyaction = rs2.get("moneyaction");// 总成本
                    Double originexpressask = rs2.get("originexpressask");// 原始总运费
                    if (originexpressask == null || originexpressask <= 0D) {
                        originexpressask = 0D;
                    }
                    Double moneyexpressask = rs2.get("moneyexpressask");// 人民币运费
                    if (moneyexpressask == null || moneyexpressask <= 0D) {
                        moneyexpressask = 0D;
                    }
                    double moneyrate = rs2.get("moneyrate");
                    if (moneyexpressask == 0D && originexpressask > 0) {// 如果有原始运费,但是人民币运费是0,那是计算出了问题
                        moneyexpressask = originexpressask * moneyrate;// 汇率默认是6,因为是人民币,换成实际汇率，怪不得老是有部分订单费用有问题，20160705
                        // 周平
                    }
                    if (moneyaction == null || moneyaction <= 0D) {
                        moneyaction = 0D;
                    }
                    Double expressweight = rs2.getDouble("expressweight");// 总商品重量
                    if (expressweight == null || expressweight <= 0D) {
                        expressweight = 0D;
                    }

                    int sellnum = rs2.getInt("sellnum");// 订单明细笔数
                    int ordernum = rs2.getInt("ordernum");// 订单明细总采购量
                    String storageid = "," + Sys.isCheckNull(rs2.getString("storageid")) + ",";// 仓库编号
                    String storage = Sys.isCheckNull(rs2.getString("storage"));// 仓库
                    String locationid = "," + Sys.isCheckNull(rs2.getString("locationid")) + ",";// 仓位编号
                    String location = Sys.isCheckNull(rs2.getString("location"));// 仓位
                    String purchaseoper = Sys.isCheckNull(rs2.getString("purchaseoper"));// 采购员
                    String pickupoper = Sys.isCheckNull(rs2.getString("pickupoper"));// 配货员
                    String originsku = Sys.isCheckNull(rs2.getString("originsku"));// 原厂sku
                    if (rs2.getInt("sellnum") > 1) {// 如果是多sku订单，则需要查询所有的仓库和仓位合起来
                        String sqlSearch5 = "select * from db_sell where orderid = '" + orderid + "'";
                        Statement stm5 = conn.createStatement();
                        ResultSet rs5 = stm5.executeQuery(sqlSearch5);
                        storageid = ",";
                        locationid = ",";
                        location = ",";
                        purchaseoper = ",";
                        pickupoper = ",";
                        originsku = ",";
                        while (rs5.next()) {
                            storageid = storageid + rs5.getString("storageid") + ",";
                            locationid = locationid + rs5.getString("locationid") + ",";
                            location = location + rs5.getString("location") + ",";
                            if (Sys.isNull(rs5.getString("oper1")) == false) {
                                pickupoper = pickupoper + rs5.getString("oper1") + ",";
                            }
                            if (Sys.isNull(rs5.getString("oper2")) == false) {
                                purchaseoper = purchaseoper + rs5.getString("oper2") + ",";
                            }
                            if (Sys.isNull(rs5.getString("originsku")) == false) {// 如果有原厂sku,则拼接
                                if (originsku.indexOf("," + rs5.getString("originsku") + ",") < 0) {// 如果未包含
                                    originsku = originsku + rs5.getString("originsku") + ",";
                                } else {// 如果已经包含
                                    ;
                                }

                            }
                        }
                        storageid = Sys.sortStr(storageid);
                        locationid = Sys.sortStr(locationid);
                        location = Sys.sortStr(location);
                        rs5.close();
                        stm5.close();
                    }
                    int skunumber = rs2.getInt("skunumber");// 该订单下有多少个不同的sku(不同的商品)数,便于满足广东陈文平的智能配货功能
                    Double originFinalvaluefee = rs2.getDouble("originFinalvaluefee");// ebay收取费用(原始)
                    Double Finalvaluefee = rs2.getDouble("Finalvaluefee");// ebay收取费用(人民币)
                    if (originFinalvaluefee == null || originFinalvaluefee < 0) {
                        originFinalvaluefee = 0D;
                    }
                    if (Finalvaluefee == null || Finalvaluefee < 0) {
                        Finalvaluefee = 0D;
                    }
                    if (originsku.length() > 2900) {
                        originsku = originsku.substring(0, 2900);
                    } // 原厂sku叠加不超过3000

                    String sqlExtendUpdate = "";// 扩展更新
                    if (sellnum == 1) {// 如果为单详单，则需要将仓库和仓位更新到db_order表中
                        if (Sys.isNull(purchaseoper) == true) {
                            purchaseoper = "-";
                        } // 如果无采购员,则默认为-
                        if (Sys.isNull(pickupoper) == true) {
                            pickupoper = "-";
                        } // 如果无配货员,则默认为-
                        sqlExtendUpdate = ",storageid='" + storageid + "',storage='" + storage + "',locationid='"
                                + locationid + "',location='" + location + "',oper1='" + pickupoper + "',oper2='"
                                + purchaseoper + "'";
                    } else {// 多详单的不在这里算，由后台统一算(主要是将采购员和配货员叠加起来)
                        sqlExtendUpdate = ",storageid='" + storageid + "',storage='" + storage + "',locationid='"
                                + locationid + "',location='" + location + "',oper1='" + pickupoper + "',oper2='"
                                + purchaseoper + "'";
                    }
                    // 修复订单列表总金额不准，增加originordermoney周平20150812
                    String sqlE = "update db_order set moneyask=" + moneyask + ", originordermoney=" + originordermoney
                            + ",moneyaction=" + moneyaction + ",originFinalvaluefee=" + originFinalvaluefee
                            + ",Finalvaluefee=" + Finalvaluefee + ",orderweight=" + expressweight + ", expressweight="
                            + expressweight + ",originexpressmoney=" + originexpressask + ",moneyexpressask="
                            + moneyexpressask + ",sellnum='" + sellnum + "',ordernum='" + ordernum + "',qlreserve3='"
                            + skunumber + "',originsku='" + originsku + "' " + sqlExtendUpdate + " where orderid='"
                            + orderid + "'";
                    stmExecute.executeUpdate(sqlE);
                    // this.WriteWeightLog(groupid,sqlE);
                } catch (SQLException e) {
                    System.out.println("updateCalculateNew方法SQLException异常:" + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Exception异常:" + e.getMessage());
                }
            }
            rs2.close();
            stm2.close();
            System.out.println("整理完该批订单的各订单总金额,总重量,总成本");

            // 第三步:迭加多物品选择,更新到db_order.reserve4中
            Statement stm3 = conn.createStatement();
            String orderidTemp = "";
            String descr2Str = "";
            String sqlSearch3 = "select orderid,descr2 from db_sell where descr2 is not null and groupid='" + groupid
                    + "' and not flag='3' order by orderid";
            ResultSet rs3 = stm3.executeQuery(sqlSearch3);
            while (rs3.next()) {
                try {
                    String orderid = rs3.getString("orderid");
                    String descr2 = Sys.isCheckNull(rs3.getString("descr2"));// 多物品选择的内容
                    if (orderidTemp.length() <= 0 || orderidTemp.equals(orderid) == true) {
                        orderidTemp = orderid;
                        // 如果订单id不变,则迭加多物品选择的内容
                        if (descr2Str.length() <= 0) {
                            descr2Str = descr2;
                        } else {
                            descr2Str = descr2Str + ";" + descr2;
                        }
                    } else {// 如果订单id改变,则更新前一ID的记录
                        if (orderidTemp.length() > 0 && descr2Str.length() > 0) {
                            String sqlE = "update db_order set reserve4='" + descr2Str.replace("'", "’")
                                    + "' where orderid='" + orderidTemp + "'";
                            try {
                                stmExecute.executeUpdate(sqlE);
                            } catch (SQLException e) {
                                System.out.println("SQL=" + sqlE + "执行异常:" + e.getMessage());
                            }
                        }
                        orderidTemp = orderid;// orderidTemp等于新的ID
                        descr2Str = descr2;// 重新迭加多物品选择
                    }
                } catch (Exception e) {
                    ;
                }
            }
            rs3.close();
            stm3.close();
            // 最后再更新1次
            if (orderidTemp.length() > 0 && descr2Str.length() > 0) {
                String sqlE = "update db_order set reserve4='" + descr2Str + "' where orderid='" + orderidTemp + "'";
                stmExecute.executeUpdate(sqlE);
            }
            System.out.println("整理完该批订单的多物品选择");

            // 第四步:遍历各订单id,调验证缺货子过程PROC_CALCULATION
            // 本过程速度有些慢,基本上每笔订单需要花1~3秒时间,如果某一批次下载有1000单,则要花大约半小时,因此放到EbayNote线程去执行updateOrderAlertflag(groupid)方法
            stmExecute.close();
        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("SQL执行异常:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("异常" + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    ;
                }
            }
        }
    }*/


    private Double stringToDouble(String str) {
        if (str != null) {
            try {
                return Double.parseDouble(str);
            } catch (Exception e) {
                return 0d;
            }
        }
        return 0d;
    }
}
