package com.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.bean.dao.DbLazadaexpresstypeMapper;
import com.bean.dao.DbOrderMapper;
import com.bean.model.DbLazadaexpresstype;
import com.bean.model.DbLazadaorderinfo;
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
                    if (response != null && response.getBody() != null && response.getBody().indexOf("count") > 0) {
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




    private RetCode getItem(int recordId, int recordMax, DbLazadaorderinfo order, String OrderId, DbShop shop)
            throws Exception {
        RetCode rt = new RetCode(1000, "保存商品和订单失败", "");
        // 调接口的时间,需要把系统时间往前推8小时(7~9小时都可以)
        String timestampBefore8hours = Sys.getTimeBeforeMinite(8 * 60);// 返回YYYYMMDDHHMISS
        String timestamp = timestampBefore8hours.substring(0, 4) + "-" + timestampBefore8hours.substring(4, 6) + "-"
                + timestampBefore8hours.substring(6, 8) + "T" + timestampBefore8hours.substring(8, 10) + ":"
                + timestampBefore8hours.substring(10, 12) + ":" + timestampBefore8hours.substring(12, 14) + "+00:00";
        // 用户账号
        String apiKey = Sys.isCheckNull(shop.getTokenid());

        try {
            String countryCode = Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
            String scApiHost = LazadaUtil.getScApiHost(countryCode);

            LazopClient client = new LazopClient(scApiHost, appkey, appSecret);
            LazopRequest request = new LazopRequest();
            request.setApiName("/order/items/get");
            request.setHttpMethod("GET");
            request.addApiParameter("order_id", OrderId);
            LazopResponse response = client.execute(request, apiKey);
            try {
                JSONObject jo_0 = JSON.parseObject(response.getBody());
                String jo_d = jo_0.getString("data");

                JSONArray items = JSON.parseArray(jo_d);

                if (items != null && items.size() > 0) {
                    ArrayList<ItemBean> itemList = new ArrayList<ItemBean>();
                    double shippingFeeOrigin = 0.0;// 订单物流费用
                    double orderFeeOrigin = 0.0;// 订单总金额

                    int total = 0;// 订单状态总数
                    int pendingCount = 0;// pending状态个数
                    int canceledCount = 0;// cancel状态个数
                    int ready_to_shipCount = 0;// ready_to_shipCount状态个数
                    int deliveredCount = 0;// deliveredCount状态个数
                    int returnedCount = 0;// returnedCount状态个数
                    int shippedCount = 0;// shippedCount状态个数
                    int failedCount = 0;// failedCount状态个数

                    for (int j = 0; j < items.size(); j++) {
                        total++;
                        try {
                            JSONObject oneItem = items.getJSONObject(j);
                            if(oneItem==null){
                                continue;
                            }
                            String OrderItemId = "";
                            String ShopId = "";
                            String Name = "";
                            String Sku = "";
                            String ShopSku = "";
                            String ShippingType = "";
                            double ItemPrice = 0;
                            double PaidPrice = 0;
                            String Currency = "";
                            double WalletCredits = 0;
                            double TaxAmount = 0;
                            double ShippingAmount = 0;
                            double ShippingServiceCost = 0;
                            double VoucherAmount = 0;
                            String VoucherCode = "";
                            String Status = "";
                            String ShipmentProvider = "";
                            int IsDigital = 0;
                            String DigitalDeliveryInfo = "";
                            String TrackingCode = "";
                            String TrackingCodePre = "";
                            String Reason = "";
                            String ReasonDetail = "";
                            String PurchaseOrderId = "";
                            String PurchaseOrderNumber = "";
                            String PackageId = "";
                            String PromisedShippingTime = "";
                            String ExtraAttributes = "";
                            String ShippingProviderType = "";
                            String CreatedAt = "";
                            String UpdatedAt = "";
                            String ReturnStatus = "";
                            String productMainImage = "";
                            try {
                                OrderItemId = Sys.isCheckNull(oneItem.getString("order_item_id"));
                            } catch (Exception e) {
                                System.out.println("读取purchase_order_id出现异常:" + e.getMessage());
                            }
                            try {
                                ShopId = Sys.isCheckNull(oneItem.getString("shop_id"));
                            } catch (Exception e) {
                                System.out.println("读取shop_id出现异常:" + e.getMessage());
                            }
                            try {
                                Name = Sys.isCheckNull(oneItem.getString("name"));
                            } catch (Exception e) {
                                System.out.println("读取name出现异常:" + e.getMessage());
                            }
                            try {
                                Sku = Sys.isCheckNull(oneItem.getString("sku"));
                            } catch (Exception e) {
                                System.out.println("读取sku出现异常:" + e.getMessage());
                            }
                            try {
                                ShopSku = Sys.isCheckNull(oneItem.getString("shop_sku"));
                            } catch (Exception e) {
                                System.out.println("读取shop_sku出现异常:" + e.getMessage());
                            }
                            if (Sys.isNull(ShopSku) == true) {
                                ShopSku = Sku;
                            }
                            try {
                                ShippingType = Sys.isCheckNull(oneItem.getString("shipping_type"));
                            } catch (Exception e) {
                                System.out.println("读取shipping_type出现异常:" + e.getMessage());
                            }
                            try {
                                ItemPrice = oneItem.getDouble("item_price");
                            } catch (Exception e) {
                                System.out.println("读取item_price出现异常:" + e.getMessage());
                            }
                            try {
                                PaidPrice = oneItem.getDouble("paid_price");
                            } catch (Exception e) {
                                System.out.println("读取paid_price出现异常:" + e.getMessage());
                            }
                            try {
                                Currency = Sys.isCheckNull(oneItem.getString("currency"));
                            } catch (Exception e) {
                                System.out.println("读取currency出现异常:" + e.getMessage());
                            }
                            /*
                             * try { WalletCredits =
                             * oneItem.getDouble("WalletCredits"); } catch
                             * (Exception e) {
                             * System.out.println("读取WalletCredits出现异常:" +
                             * e.getMessage()); }
                             */
                            try {
                                TaxAmount = oneItem.getDouble("tax_amount");
                            } catch (Exception e) {
                                System.out.println("读取tax_amount出现异常:" + e.getMessage());
                            }
                            try {
                                ShippingAmount = oneItem.getDouble("shipping_amount");
                            } catch (Exception e) {
                                System.out.println("读取shipping_amount出现异常:" + e.getMessage());
                            }
                            try {
                                ShippingServiceCost = oneItem.getDouble("shipping_service_cost");
                            } catch (Exception e) {
                                System.out.println("读取shipping_service_cost出现异常:" + e.getMessage());
                            }
                            try {
                                VoucherAmount = oneItem.getDouble("voucher_amount");
                            } catch (Exception e) {
                                System.out.println("读取voucher_amount出现异常:" + e.getMessage());
                            }
                            try {
                                VoucherCode = Sys.isCheckNull(oneItem.getString("voucher_code"));
                            } catch (Exception e) {
                                System.out.println("读取voucher_code出现异常:" + e.getMessage());
                            }
                            try {
                                Status = Sys.isCheckNull(oneItem.getString("status"));
                            } catch (Exception e) {
                                System.out.println("读取status出现异常:" + e.getMessage());
                            }
                            try {
                                ShipmentProvider = Sys.isCheckNull(oneItem.getString("shipment_provider"));
                            } catch (Exception e) {
                                System.out.println("读取shipment_provider出现异常:" + e.getMessage());
                            }
                            try {
                                IsDigital = oneItem.getInteger("is_digital");
                            } catch (Exception e) {
                                System.out.println("读取is_digital出现异常:" + e.getMessage());
                            }
                            try {
                                DigitalDeliveryInfo = Sys.isCheckNull(oneItem.getString("digital_delivery_info"));
                            } catch (Exception e) {
                                System.out.println("读取digital_delivery_info出现异常:" + e.getMessage());
                            }
                            try {
                                TrackingCode = Sys.isCheckNull(oneItem.getString("tracking_code"));
                            } catch (Exception e) {
                                System.out.println("读取TrackingCode出现异常:" + e.getMessage());
                            }
                            try {
                                TrackingCodePre = Sys.isCheckNull(oneItem.getString("tracking_code_pre"));
                            } catch (Exception e) {
                                System.out.println("读取TrackingCodePre出现异常:" + e.getMessage());
                            }
                            try {
                                Reason = Sys.isCheckNull(oneItem.getString("reason"));
                            } catch (Exception e) {
                                System.out.println("读取reason出现异常:" + e.getMessage());
                            }
                            try {
                                ReasonDetail = Sys.isCheckNull(oneItem.getString("reason_detail"));
                            } catch (Exception e) {
                                System.out.println("读取reason_detail出现异常:" + e.getMessage());
                            }
                            try {
                                PurchaseOrderId = Sys.isCheckNull(oneItem.getString("purchase_order_id"));
                            } catch (Exception e) {
                                System.out.println("读取purchase_order_id出现异常:" + e.getMessage());
                            }
                            try {
                                PurchaseOrderNumber = Sys.isCheckNull(oneItem.getString("purchase_order_number"));
                            } catch (Exception e) {
                                System.out.println("读取purchase_order_number出现异常:" + e.getMessage());
                            }
                            try {
                                PackageId = Sys.isCheckNull(oneItem.getString("package_id"));
                            } catch (Exception e) {
                                System.out.println("读取package_id出现异常:" + e.getMessage());
                            }
                            try {
                                PromisedShippingTime = Sys.isCheckNull(oneItem.getString("promised_shipping_time"));
                            } catch (Exception e) {
                                System.out.println("读取promised_shipping_time出现异常:" + e.getMessage());
                            }
                            try {
                                ExtraAttributes = Sys.isCheckNull(oneItem.getString("extra_attributes"));
                            } catch (Exception e) {
                                System.out.println("读取extra_attributes出现异常:" + e.getMessage());
                            }
                            try {
                                ShippingProviderType = Sys.isCheckNull(oneItem.getString("shipping_provider_type"));
                            } catch (Exception e) {
                                System.out.println("读取shipping_provider_type出现异常:" + e.getMessage());
                            }
                            try {
                                CreatedAt = Sys.isCheckNull(oneItem.getString("created_at"));
                            } catch (Exception e) {
                                System.out.println("读取created_at出现异常:" + e.getMessage());
                            }
                            try {
                                UpdatedAt = Sys.isCheckNull(oneItem.getString("updated_at"));
                            } catch (Exception e) {
                                System.out.println("读取updated_at出现异常:" + e.getMessage());
                            }
                            try {
                                ReturnStatus = Sys.isCheckNull(oneItem.getString("return_status"));
                            } catch (Exception e) {
                                System.out.println("读取return_status出现异常:" + e.getMessage());
                            }
                            try {
                                productMainImage = Sys.isCheckNull(oneItem.getString("product_main_image"));
                            } catch (Exception e) {
                                System.out.println("读取product_main_image出现异常:" + e.getMessage());
                            }
                            // 如果此订单已取消或退货
                            if ("canceled".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                canceledCount++;
                                continue;// 跳过此商品,继续
                            } else if ("returned".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                returnedCount++;
                                continue;// 跳过此商品,继续
                            } else if ("pending".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                pendingCount++;
                            } else if ("ready_to_ship".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                ready_to_shipCount++;
                            } else if ("delivered".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                deliveredCount++;
                            } else if ("shipped".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                shippedCount++;
                            } else if ("failed".equals(Sys.isCheckNull(Status).toLowerCase()) == true) {
                                failedCount++;
                                continue;// 跳过此商品,继续
                            }

                            ItemBean item = new ItemBean();
                            try {
                                item.setOrderitemid(OrderItemId);
                            } catch (Exception e) {
                            } // 每笔商品交易的编号(理论上在同一店铺是唯一的)
                            try {
                                item.setSku(Sku);
                            } catch (Exception e) {
                            } // sku
                            try {
                                item.setShopsku(ShopSku);
                            } catch (Exception e) {
                            } // shop sku
                            try {
                                item.setProductname(Name);
                            } catch (Exception e) {
                            } // 产品名称
                            try {
                                item.setIdentifynum(order.getOrderid() + "_" + item.getOrderitemid());
                            } catch (Exception e) {
                            } // 拼写唯一交易id
                            try {
                                item.setQuantity(1);
                            } catch (Exception e) {
                            } // 数量
                            try {
                                item.setItemprice(Double.valueOf(ItemPrice));
                            } catch (Exception e) {
                            } // 原始售价
                            try {
                                item.setPaidprice(Double.valueOf(PaidPrice));
                            } catch (Exception e) {
                            } // 成交价
                            try {
                                item.setQuantity(Integer.valueOf(PurchaseOrderNumber));
                                if (item.getQuantity() <= 0) {
                                    item.setQuantity(1);
                                }
                            } catch (Exception e) {
                                item.setQuantity(1);
                            }
                            try {
                                item.setShippingtype(ShippingType);
                            } catch (Exception e) {
                            } // 例如Cross docking
                            try {
                                item.setWalletcredits(WalletCredits);
                            } catch (Exception e) {
                            } // 不知道是什么
                            try {
                                item.setTaxamount(Double.valueOf(TaxAmount));
                            } catch (Exception e) {
                            } // 应该是税
                            try {
                                item.setShippingamount(Double.valueOf(ShippingAmount));
                            } catch (Exception e) {
                            } // 应该是运费收入
                            try {
                                item.setVoucheramount(Double.valueOf(VoucherAmount));
                            } catch (Exception e) {
                            } // 不知道是什么,一般是0
                            try {
                                item.setVouchercode(VoucherCode);
                            } catch (Exception e) {
                            } // 不知道是什么,一般是空
                            try {
                                item.setItemstatus(Status);
                            } catch (Exception e) {
                            } // 应该是商品的状态,不确定是否和订单的一致
                            try {
                                item.setShipmentprovider(ShipmentProvider);
                            } catch (Exception e) {
                            } // 看起来象是提供给买家的物流方式
                            try {
                                item.setReason(Reason);
                            } catch (Exception e) {
                            } // 不知道是什么,一般是空
                            try {
                                item.setReasondetail(ReasonDetail);
                            } catch (Exception e) {
                            } // 不知道是什么,一般是空
                            try {
                                item.setPurchaseorderid(PurchaseOrderId);
                            } catch (Exception e) {
                            } // 不知道是什么,一般是空
                            try {
                                item.setPurchaseordernumber(PurchaseOrderNumber);
                            } catch (Exception e) {
                            } // 不知道是什么,一般是空
                            try {
                                item.setProductMainImage(productMainImage);
                            } catch (Exception e) {
                            } // 不知道是什么,一般是空
                            itemList.add(item);
                        } catch (Exception e) {
                            System.out.println("解析第" + j + "/100个商品Exception异常:" + e.getMessage());
                        }
                    }
                    if (itemList != null && itemList.size() > 0) {
                        rt.setCode(0);
                        rt.setDesc("订单:" + OrderId + "下有" + itemList.size() + "个商品");
                        rt.setObj(itemList);
                        return rt;
                    } else {
                        System.out.println("订单:" + OrderId + "下解析商品为空,但接口中有" + items.size() + "个商品");
                        rt.setCode(1000);
                        rt.setDesc("订单:" + OrderId + "下解析商品为空,但接口中有" + items.size() + "个商品");
                        return rt;
                    }
                } else {
                    System.out.println("订单:" + OrderId + "下无商品");
                    rt.setCode(1000);
                    rt.setDesc("订单:" + OrderId + "下无商品");
                    return rt;
                }
            } catch (Exception e) {
                System.out.println("Exception=" + e.getMessage());
                rt.setCode(999);
                rt.setDesc("解析详情HttpException异常:" + e.getMessage());
                return rt;
            }
        } catch (Exception e) {
            System.out.println("Exception=" + e.getMessage());
            rt.setCode(999);
            rt.setDesc("获取订单详情Exception异常:" + e.getMessage());
            return rt;
        }
    }


    private RetCode saveOrderIntoTemp(DbLazadaorderinfo order, ArrayList<ItemBean> itemList){
        RetCode rt = new RetCode(1000, "默认失败", "");
        if (order != null && itemList != null && itemList.size() > 0) {

            try {
                // 清理数据
                order.setSequenceid(Sys.isCheckNull(order.getSequenceid()).replace("'", "‘"));
                order.setTradeid(Sys.isCheckNull(order.getTradeid()).replace("'", "‘"));
                order.setCorpid(Sys.isCheckNull(order.getCorpid()).replace("'", "‘"));
                order.setShopid(Sys.isCheckNull(order.getShopid()).replace("'", "‘"));
                order.setShopname(Sys.isCheckNull(order.getShopname()).replace("'", "‘"));
                order.setCurrencyid(Sys.isCheckNull(order.getCurrencyid()).replace("'", "‘"));
                order.setCustomerid(Sys.isCheckNull(order.getCustomerid()).replace("'", "‘"));
                order.setCustomername(Sys.isCheckNull(order.getCustomername()).replace("'", "‘"));
                order.setFirstname(Sys.isCheckNull(order.getFirstname()).replace("'", "‘"));
                order.setLastname(Sys.isCheckNull(order.getLastname()).replace("'", "‘"));
                order.setOrderid(Sys.isCheckNull(order.getOrderid()).replace("'", "‘"));
                order.setPaymentmethod(Sys.isCheckNull(order.getPaymentmethod()).replace("'", "‘"));
                order.setRemarks(Sys.isCheckNull(order.getRemarks()).replace("'", "‘"));
                order.setGiftoption(Sys.isCheckNull(order.getGiftoption()).replace("'", "‘"));
                order.setGiftmessage(Sys.isCheckNull(order.getGiftmessage()).replace("'", "‘"));
                order.setPhone1(Sys.isCheckNull(order.getPhone1()).replace("'", "‘"));
                order.setPhone2(Sys.isCheckNull(order.getPhone2()).replace("'", "‘"));
                order.setAddress1(Sys.isCheckNull(order.getAddress1()).replace("'", "‘"));
                order.setAddress2(Sys.isCheckNull(order.getAddress2()).replace("'", "‘"));
                order.setAddress3(Sys.isCheckNull(order.getAddress3()).replace("'", "‘"));
                order.setCity(Sys.isCheckNull(order.getCity()).replace("'", "‘"));
                order.setProvince(Sys.isCheckNull(order.getProvince()).replace("'", "‘"));
                order.setWard(Sys.isCheckNull(order.getWard()).replace("'", "‘"));
                order.setRegion(Sys.isCheckNull(order.getRegion()).replace("'", "‘"));
                order.setPostcode(Sys.isCheckNull(order.getPostcode()).replace("'", "‘"));
                order.setCountry(Sys.isCheckNull(order.getCountry()).replace("'", "‘"));
                order.setCountrycode(Sys.isCheckNull(order.getCountrycode()).replace("'", "‘"));
                order.setCheckdescr(Sys.isCheckNull(order.getCheckdescr()).replace("'", "‘"));
                // 国家全称换简称
              //  order.setCountrycode(Sys.getCountryCodeFromCountryname(order.getCountry()));

                // 逐个插入item到Db_lazadaorderinfo表
                StringBuffer buffer = new StringBuffer();
                int x = 0;
                for (ItemBean item : itemList) {
                    // 清理数据
                    item.setOrderitemid(Sys.isCheckNull(item.getOrderitemid()).replace("'", "‘"));
                    item.setIdentifynum(Sys.isCheckNull(item.getIdentifynum()).replace("'", "‘"));
                    item.setProductname(Sys.isCheckNull(item.getProductname()).replace("'", "‘"));
                    item.setSku(Sys.isCheckNull(item.getSku()).replace("'", "‘"));
                    item.setShopsku(Sys.isCheckNull(item.getShopsku()).replace("'", "‘"));
                    item.setShippingtype(Sys.isCheckNull(item.getShippingtype()).replace("'", "‘"));
                    item.setVouchercode(Sys.isCheckNull(item.getVouchercode()).replace("'", "‘"));
                    item.setItemstatus(Sys.isCheckNull(item.getItemstatus()).replace("'", "‘"));
                    item.setShipmentprovider(Sys.isCheckNull(item.getShipmentprovider()).replace("'", "‘"));
                    item.setTrackingCode(Sys.isCheckNull(item.getTrackingCode()).replace("'", "‘"));
                    item.setReason(Sys.isCheckNull(item.getReason()).replace("'", "‘"));
                    item.setReasondetail(Sys.isCheckNull(item.getReasondetail()).replace("'", "‘"));
                    item.setPurchaseorderid(Sys.isCheckNull(item.getPurchaseorderid()).replace("'", "‘"));
                    item.setPurchaseordernumber(Sys.isCheckNull(item.getPurchaseordernumber()).replace("'", "‘"));
                    if (item.getPaidprice() == null && item.getItemprice() != null) {
                        item.setPaidprice(item.getItemprice());
                    }
                    if (item.getItemprice() == null && item.getPaidprice() != null) {
                        item.setItemprice(item.getPaidprice());
                    }

                }
                if (x == itemList.size()) {// 所有的Item都进了临时表
                    rt.setCode(0);
                    rt.setDesc("订单:" + order.getOrderid() + "[" + order.getTradeid() + "]下的" + x + "个商品保存进临时表");
                } else {// 部分或全部不成功
                    rt.setCode(1000);
                    rt.setDesc("订单:" + order.getOrderid() + "[" + order.getTradeid() + "]下有" + itemList.size()
                            + "个商品,保存" + x + "个进临时表,失败" + (itemList.size() - x) + "个.失败原因:" + buffer.toString());
                }
            } catch (Exception e) {
                rt.setCode(1000);
                rt.setDesc("保存订单进临时表出现Exception异常:" + e.getMessage());
            }

        } else {
            rt.setCode(1000);
            rt.setDesc("订单下无商品信息");
        }
        return rt;
    }

}
