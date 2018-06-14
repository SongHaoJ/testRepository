package com.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.bean.dao.DbLazadaexpresstypeMapper;
import com.bean.dao.DbOrderMapper;
import com.bean.model.DbLazadaexpresstype;
import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbOrder;
import com.bean.orderUtil.LazadaUtil;
import com.gourpBean.BaseOrderBean;
import com.gourpBean.ItemBean;
import com.service.LazadaService;
import com.bean.dao.DbShopMapper;
import com.bean.model.DbShop;
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
    Logger log = LoggerFactory.getLogger(LazadaServiceImpl.class);

    @Autowired
    private DbShopMapper shopMapper;
    @Autowired
    private DbOrderMapper orderMapper;
    @Autowired
    private DbLazadaexpresstypeMapper expressMapper;

    private Calendar cld = Calendar.getInstance();


    @Override
    public RetCode findLazadanewproduct(String shopid) {
        return null;
    }

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

                        }
                    }
                }
            } else {
                //获取认可物流失败

            }
        } catch (Exception e) {
            System.out.println("Exception=" + e.getMessage());
        }
    }

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
            List shopIdList = Arrays.asList(strs);
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

    @Override
    public void downloadLazadaOrderNew(DbShop shop, String status) {
        Boolean tokenFail = true;
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
        long groupId = Long.valueOf(Sys.getCtime());
        // 默认下载五天内的pending状态的订单，和ready to ship的订单
        Date starttime = Sys.getDateAfter(-7);// 默认开始时间是系统时间之前7天
        try {
            Date endtime = new Date();// 最终截止时间
            // 默认新加坡,他最先开
            String countryCode = Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
            String scApiHost = LazadaUtil.getScApiHost(countryCode);
            // API密钥
            String apiKey = Sys.isCheckNull(shop.getTokenid());
            // 订单开始时间

            String CreatedAfter = changeDateType(starttime);

            String CreatedBefore = changeDateType(endtime);

            //
            // ShowMsg("开始时间",df.format(starttime));
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
                    if ( response.getBody() != null && response.getBody().indexOf("count") > 0) {
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
                                    }
                                    try {

                                        int successCount = 0;
                                        ArrayList<BaseOrderBean> orderbeanlist = new ArrayList<BaseOrderBean>();
                                        pageNum = jo_os.size();
                                        //TODO 遍历解析订单
                                        for (int i = 0; i < pageNum; i++) {
                                            JSONObject oneOrder = jo_os.getJSONObject(i);
                                            LazadaAnalysis analysis = new LazadaAnalysis();
                                            RetCode rc = analysis.analysisOrderInfo(oneOrder,shop,groupId);
                                            if(rc.getCode()==0){
                                                DbLazadaorderinfo order = (DbLazadaorderinfo) rc.getObj();
                                                // 开始解析ItemList
                                                // TODO 解析商品列表
                                                RetCode rtGetItem = analysis.getItem(i, jo_os.size(), order, shop);
                                                if (rtGetItem.getObj() != null) {
                                                    ArrayList<ItemBean> itemList = (ArrayList<ItemBean>) rtGetItem
                                                            .getObj();
                                                    // 保存进临时表

                                                    RetCode rtSave = analysis.saveOrderIntoTemp(order, itemList);
                                                    if (rtSave.getCode() == 0) {

                                                        successCount++;
                                                    } else {// 保存不成功或部分不成功
                                                        log.info("保存失败" + rtSave.getDesc());
                                                    }
                                                } else {
                                                }
                                            }else{
                                                //订单已存在或信息异常
                                            }

                                        }

                                    } catch (Exception e) {
                                        //"解析订单Orders数据出现Exception异常:" + e.getMessage());
                                    }
                                    //"解析成功");

                                } else {
                                   //"无订单信息");
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTime(endtime);
                                }
                            } catch (Exception e) {
                                //"解析订单返回Json数据Exception异常:" + e.getMessage());
                            }
                        } else {
                            //"无订单Orders信息");
                        }
                    } else if (response != null && response.getBody() != null
                            && response.getBody().indexOf("The specified access token is invalid or expired") >= 0) {
                        RetCode rc = getrefreshAccess_token(shop);
                        tokenFail = false;
                        //"令牌过期，刷新结果：" + rc.getDesc() + "稍后重新拉去订单");
                    } else {
                       //"返回数据格式错误,详情见日志文件");
                    }
                } catch (Exception e) {
                    System.out.println("Exception=" + e.getMessage());
                    //"下载Exception异常:" + e.getMessage());
                }
            } while (pageNum >= 100 && count < 50);
        } catch (Exception e) {
           //"" + e.getMessage());
        }
        if (tokenFail) {
            // 将订单从临时表保存进正式表的算法
          /*  String resultinfo = this.doOrder(groupId, shop);// 处理当前店铺的当前批次的订单
            System.out.println(resultinfo);
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            // String downDate = format.format(starttime);
            String sqlUpt = "update DB_Shop set reserve9='" + Sys.getCtime() + "' where sid='" + shop.getSid() + "'";
            // 插入日志
            String sqlLog = "insert into db_ebayapilog ("
                    + "sequenceid,sid,name,descr,oper,opertime,corpid,openflag,shoptypeid,shoptypename,apitime,lastapitime,reserve1,reserve2,daydiff"
                    + ")values ('" + Sys.getCtime() + shop.getSid() + "','" + shop.getSid() + "','" + shop.getName()
                    + "','" + rt.getDesc() + "','sys',sysdate,'1','1','" + shop.getSid() + "','" + shop.getName()
                    + "','0000',sysdate,'" + groupId + "','1','1')";

            String sqlDeleteOrderTemp = "delete db_lazadaorderinfo where groupid=" + groupId;
        }

*/
        }
    }

    @Override
    public void calcuOrder() {

    }

    private String changeDateType(Date date) {
        String dateStr = Sys.date2strMis(date);
        return dateStr.substring(0, 4) + "-" + dateStr.substring(4, 6) + "-" + dateStr.substring(6, 8) + "T"
                + dateStr.substring(8, 10) + ":" + dateStr.substring(10, 12) + ":" + dateStr.substring(12, 14)
                + "+00:00";
    }








}
