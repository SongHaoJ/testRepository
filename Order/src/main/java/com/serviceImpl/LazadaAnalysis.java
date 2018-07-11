package com.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bean.dao.DbOrderMapper;
import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbOrder;
import com.bean.model.DbShop;
import com.bean.orderUtil.LazadaUtil;
import com.bean.util.NumberUtil;
import com.bean.util.RetCode;
import com.bean.util.Sys;
import com.bean.yml.LazadaYml;
import com.gourpBean.ItemBean;
import com.lazada.lazop.api.LazopClient;
import com.lazada.lazop.api.LazopRequest;
import com.lazada.lazop.api.LazopResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

/**
 * lazada订单与商品详情解析
 */
@Component
public class LazadaAnalysis {
    @Autowired
    private LazadaYml yml;

    @Autowired
    private DbOrderMapper orderMapper;

    Logger log = LoggerFactory.getLogger(LazadaAnalysis.class);

    /**
     * 解析下载的订单
     *
     * @param oneOrder
     * @param shop
     * @param groupId
     * @return
     */
    public RetCode analysisOrderInfo(JSONObject oneOrder, DbShop shop, Long groupId) {
        RetCode rt = new RetCode(1000, "", "");
        try {
            DbLazadaorderinfo order = new DbLazadaorderinfo();
            // 开始解析单个订单


            String OrderId = "";// 订单id
            String OrderNumber = "";//
            String CustomerFirstName = "";// 买家姓
            String CustomerLastName = "";// 买家名
            // int OrderNumber = 0;//订单编号
            String PaymentMethod = "";// 支付方式CashOnDelivery
            String Remarks = "";// 备注
            String DeliveryInfo = "";// 发货信息,不知道有何用
            String Price = "";// 价格,如"3.14"
            String GiftOption = "";// 是否礼物属性,"false"或"true"
            String GiftMessage = "";// 礼物备注
            String VoucherCode = "";// 不知道什么用
            String CreatedAt = "";// 创建时间,2016-10-12
            // 16:12:09
            String UpdatedAt = "";// 更新时间,2016-10-12
            // 16:12:09
            String str_AddressBilling = "";// 地址Json字符串
            // String FirstName = "";
            // String LastName = "";
            String Phone = "";// 电话1
            String Phone2 = "";// 电话2
            String Address1 = "";// 地址1
            String Address2 = "";// 地址2
            String Address3 = "";// 地址3
            String Address4 = "";// 地址4
            String Address5 = "";// 地址5
            String CustomerEmail = "";// 邮箱
            String City = "";// 城市
            String PostCode = "";// 邮编
            String Country = "";// 国家
            // String Ward = ""; sdk新接口无此值
            // String Region = ""; sdk新接口无此值

            String str_AddressShipping = "";
            String NationalRegistrationNumber = "";
            int ItemsCount = 1;
            String PromisedShippingTimes = "";
            String ExtraAttributes = "";
            String Status = "";// 订单状态
            try {
                OrderId = oneOrder.getString("order_id");
            } catch (Exception e) {
                log.error("解析order_id异常:" + e.getMessage());
            }
            try {
                OrderNumber = oneOrder.getString("order_number");
            } catch (Exception e) {
                log.error("解析order_number异常:" + e.getMessage());
            }
            if (Sys.isNull(OrderNumber)) {
                OrderNumber = "" + OrderId;
            }
            try {
                CustomerFirstName = Sys
                        .isCheckNull(oneOrder.getString("customer_first_name"));
            } catch (Exception e) {
                log.error("解析customer_first_name异常:" + e.getMessage());
            }
            try {
                CustomerLastName = Sys
                        .isCheckNull(oneOrder.getString("customer_last_name"));
            } catch (Exception e) {
                log.error("解析customer_last_name异常:" + e.getMessage());
            }
            try {
                PaymentMethod = Sys
                        .isCheckNull(oneOrder.getString("payment_method"));
            } catch (Exception e) {
                log.error("解析payment_method异常:" + e.getMessage());
            }
            try {
                Remarks = Sys.isCheckNull(oneOrder.getString("remarks"));
            } catch (Exception e) {
                log.error("解析remarks异常:" + e.getMessage());
            }
            try {
                DeliveryInfo = Sys.isCheckNull(oneOrder.getString("delivery_info"));
            } catch (Exception e) {
                log.error("解析delivery_info异常:" + e.getMessage());
            }
            try {
                Price = Sys.isCheckNull(oneOrder.getString("price")).replace(",",
                        "");
            } catch (Exception e) {
                log.error("解析price异常:" + e.getMessage());
            }
            try {
                GiftOption = Sys.isCheckNull(oneOrder.getString("gift_option"));
            } catch (Exception e) {
                log.error("解析gift_option异常:" + e.getMessage());
            }
            try {
                GiftMessage = Sys.isCheckNull(oneOrder.getString("gift_message"));
            } catch (Exception e) {
                log.error("解析gift_message异常:" + e.getMessage());
            }
            try {
                VoucherCode = Sys.isCheckNull(oneOrder.getString("voucher_code"));
            } catch (Exception e) {
                log.error("解析voucher_code异常:" + e.getMessage());
            }
            try {
                CreatedAt = Sys.isCheckNull(oneOrder.getString("created_at"));
            } catch (Exception e) {
                log.error("解析created_at异常:" + e.getMessage());
            }
            try {
                UpdatedAt = Sys.isCheckNull(oneOrder.getString("updated_at"));
            } catch (Exception e) {
                log.error("解析updated_at异常:" + e.getMessage());
            }
            try {
                // 解析收件人地址
                str_AddressShipping = Sys
                        .isCheckNull(oneOrder.getString("address_shipping"));
                JSONObject jo_str_AddressShipping = JSON.parseObject(str_AddressShipping);
                try {
                    Phone = Sys
                            .isCheckNull(jo_str_AddressShipping.getString("phone"));
                } catch (Exception e) {
                    log.error("解析phone异常:" + e.getMessage());
                }
                try {
                    Phone2 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("phone2"));
                } catch (Exception e) {
                    log.error("解析phone2异常:" + e.getMessage());
                }
                try {
                    Address1 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address1"));
                } catch (Exception e) {
                    log.error("解析address1异常:" + e.getMessage());
                }
                try {
                    Address2 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address2"));
                } catch (Exception e) {
                    log.error("解析address2异常:" + e.getMessage());
                }
                try {
                    Address3 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address3"));
                } catch (Exception e) {
                    log.error("解析address3异常:" + e.getMessage());
                }
                try {
                    Address4 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address4"));
                } catch (Exception e) {
                    log.error("解析address4异常:" + e.getMessage());
                }
                try {
                    Address5 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address5"));
                } catch (Exception e) {
                    log.error("解析address5异常:" + e.getMessage());
                }
                try {
                    CustomerEmail = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("customer_email"));
                } catch (Exception e) {
                    log.error("解析customer_email异常:" + e.getMessage());
                }
                try {
                    City = Sys
                            .isCheckNull(jo_str_AddressShipping.getString("city"));
                } catch (Exception e) {
                    log.error("解析city异常:" + e.getMessage());
                }

                try {
                    PostCode = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("post_code"));
                } catch (Exception e) {
                    log.error("解析post_code异常:" + e.getMessage());
                }
                try {
                    Country = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("country"));
                } catch (Exception e) {
                    log.error("解析country异常:" + e.getMessage());
                }
            } catch (Exception e) {
                log.error("解析address_shipping异常:" + e.getMessage());
            }
            try {
                str_AddressShipping = Sys
                        .isCheckNull(oneOrder.getString("address_shipping"));
            } catch (Exception e) {
                log.error("解析address_shipping异常:" + e.getMessage());
            }
            try {
                NationalRegistrationNumber = Sys.isCheckNull(
                        oneOrder.getString("national_registration_number"));
            } catch (Exception e) {
                log.error(
                        "解析national_registration_number异常:" + e.getMessage());
            }
            try {
                ItemsCount = oneOrder.getInteger("items_count");
            } catch (Exception e) {
                log.error("解析items_count异常:" + e.getMessage());
            }
            try {
                PromisedShippingTimes = Sys
                        .isCheckNull(oneOrder.getString("promised_shipping_times"));
            } catch (Exception e) {
                log.error("解析promised_shipping_times异常:" + e.getMessage());
            }
            try {
                ExtraAttributes = Sys
                        .isCheckNull(oneOrder.getString("extra_attributes"));
            } catch (Exception e) {
                log.error("解析extra_attributes异常:" + e.getMessage());
            }
            try {
                String str_Statuses = Sys
                        .isCheckNull(oneOrder.getString("statuses")).toLowerCase();
                if (str_Statuses.contains("failed")) {
                    Status = "failed";
                }
                if (str_Statuses.contains("returned")) {
                    Status = "returned";
                }
                if (str_Statuses.contains("delivered")) {
                    Status = "delivered";
                }
                if (str_Statuses.contains("ready_to_ship")) {
                    Status = "ready_to_ship";
                }
                if (str_Statuses.contains("canceled")) {
                    Status = "canceled";
                }
                if (str_Statuses.contains("pending")) {
                    Status = "pending";
                }
                if (Sys.isNull(Status)) {
                    Status = str_Statuses.replace("\"", "").replace("[", "")
                            .replace("]", "").replace(" ", "").replace("\r\n", "");
                }
            } catch (Exception e) {
                log.error("解析statuses异常:" + e.getMessage());

            }
            order.setTradeid("" + OrderId);
            order.setOrderid(shop.getSid() + OrderNumber);//
            order.setGroupid(groupId);
            order.setPaymentmethod(PaymentMethod);// 支付方式
            order.setRemarks(Remarks);// 备注
            order.setCorpid("1");// 企业编号
            order.setShopid(shop.getSid());// 店铺编号
            order.setShopname(shop.getName());// 店铺名称
            try {
                order.setFirstname(CustomerFirstName);
            } catch (Exception e) {
            }
            try {
                order.setLastname(CustomerLastName);
            } catch (Exception e) {
            }
            order.setCustomerid(
                    (order.getFirstname() + " " + order.getLastname()).trim());
            order.setCustomername(order.getCustomerid());
            order.setCreateddate(new Date());
            try {
                order.setCreateddate((Timestamp.valueOf(CreatedAt)));
            } catch (Exception e) {
                order.setCreateddate(new Timestamp(System.currentTimeMillis()));
            } // 付款时间
            order.setUpdateddate(new Date());
            try {
                order.setUpdateddate((Timestamp.valueOf(UpdatedAt)));
            } catch (Exception e) {
                order.setUpdateddate(new Timestamp(System.currentTimeMillis()));
            } // 更新时间
            order.setCurrencyid("MYR");
            String countryCode = Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
            try {
                if ("my".equals(countryCode)) {
                    order.setCurrencyid("MYR");
                } // 马来西亚
                if ("ph".equals(countryCode)) {
                    order.setCurrencyid("PHP");
                } // 菲律宾
                if ("sg".equals(countryCode)) {
                    order.setCurrencyid("SGD");
                } // 新加坡
                if ("th".equals(countryCode)) {
                    order.setCurrencyid("THB");
                } // 泰国
                if ("id".equals(countryCode)) {
                    order.setCurrencyid("IDR");
                } // 印尼
                if ("vn".equals(countryCode)) {
                    order.setCurrencyid("VND");
                } // 越南
            } catch (Exception e) {
                ;
            }
            order.setPhone1(Phone);
            order.setPhone2(Phone2);
            order.setAddress1(Address1);
            order.setAddress2(Address2);
            order.setAddress3(Address3);
            try {
                // 如果有地址4
                if (!Sys.isNull(Address4)) {
                    order.setAddress3(order.getAddress3() + " " + Address4);
                } else {
                    ;
                }
            } catch (Exception e) {
            }
            order.setCity(City);
            // 因无province，所以默认province=city
            order.setProvince(City);
            order.setPostcode(PostCode);
            order.setCountry(Country);
            // 国家全称如Thailand

            try {

                if ("failed".equals(Status)
                        || "canceled".equals(Status)
                        || "returned".equals(Status)) {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("bansendflag", "1");
                    params.put("content", "订单已退款,请谨慎发货,平台订单状态：" + Status);
                    params.put("tradeid", order.getTradeid());
                    params.put("shoptypeid", shop.getSid());
                    orderMapper.updateRefundOrderStatus(params);
                    rt.setDetail("订单状态为："+Status);
                    rt.setCode(999L);
                    return rt;
                }
            } catch (Exception e) {
                log.error("判断订单状态出现异常："+e.getMessage(),e);
            }
            try {
                String address = order.getAddress1();
                if (Sys.isNotNull(order.getAddress2())) {
                    address = address + " " + order.getAddress2();
                }
                if (Sys.isNotNull(order.getAddress3())) {
                    address = address + " " + order.getAddress3();
                }
            } catch (Exception e) {
                log.error(
                        "修复订单" + order.getOrderid() + "地址信息异常：" + e.getMessage(),
                        e);
            }
            // 这里加个判断如果订单在正式表存在了，那就不存进临时表了，详情页别去下载了，节约时间。
            boolean rtIsExist = orderIsExist(order.getTradeid(),
                    order.getShopid());
            if (rtIsExist) {
                rt.setCode(998);
                rt.setDetail("正式表已存在");
                return rt;
            } else {
                rt.setCode(0);
                rt.setObj(order);
                return rt;
            }

        } catch (Exception e) {
            log.error("解析订单出现异常："+e.getMessage(),e);
        }
        return rt;
    }

    /**
     * 获取订单下的商品
     *
     * @param order
     * @param shop
     * @return
     * @throws Exception
     */
    public RetCode getItem(DbLazadaorderinfo order, DbShop shop)
            throws Exception {
        RetCode rt = new RetCode(1000, "保存商品和订单失败", "");
        // 用户账号
        String apiKey = Sys.isCheckNull(shop.getTokenid());

        try {
            String countryCode = Sys.isCheckNull(shop.getAmazonurlname()).toLowerCase();
            String scApiHost = LazadaUtil.getScApiHost(countryCode);

            LazopClient client = new LazopClient(scApiHost, yml.getAppKey(), yml.getSecret());
            LazopRequest request = new LazopRequest();
            request.setApiName("/order/items/get");
            request.setHttpMethod("GET");
            request.addApiParameter("order_id", order.getTradeid());
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
                            if (oneItem == null) {
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
                                log.error("读取purchase_order_id出现异常:" + e.getMessage());
                            }
                            try {
                                ShopId = Sys.isCheckNull(oneItem.getString("shop_id"));
                            } catch (Exception e) {
                                log.error("读取shop_id出现异常:" + e.getMessage());
                            }
                            try {
                                Name = Sys.isCheckNull(oneItem.getString("name"));
                            } catch (Exception e) {
                                log.error("读取name出现异常:" + e.getMessage());
                            }
                            try {
                                Sku = Sys.isCheckNull(oneItem.getString("sku"));
                            } catch (Exception e) {
                                log.error("读取sku出现异常:" + e.getMessage());
                            }
                            try {
                                ShopSku = Sys.isCheckNull(oneItem.getString("shop_sku"));
                            } catch (Exception e) {
                                log.error("读取shop_sku出现异常:" + e.getMessage());
                            }
                            if (Sys.isNull(ShopSku)) {
                                ShopSku = Sku;
                            }
                            try {
                                ShippingType = Sys.isCheckNull(oneItem.getString("shipping_type"));
                            } catch (Exception e) {
                                log.error("读取shipping_type出现异常:" + e.getMessage());
                            }
                            try {
                                ItemPrice = oneItem.getDouble("item_price");
                            } catch (Exception e) {
                                log.error("读取item_price出现异常:" + e.getMessage());
                            }
                            try {
                                PaidPrice = oneItem.getDouble("paid_price");
                            } catch (Exception e) {
                                log.error("读取paid_price出现异常:" + e.getMessage());
                            }
                            try {
                                Currency = Sys.isCheckNull(oneItem.getString("currency"));
                            } catch (Exception e) {
                                log.error("读取currency出现异常:" + e.getMessage());
                            }
                            /*
                             * try { WalletCredits =
                             * oneItem.getDouble("WalletCredits"); } catch
                             * (Exception e) {
                             * log.error("读取WalletCredits出现异常:" +
                             * e.getMessage()); }
                             */
                            try {
                                TaxAmount = oneItem.getDouble("tax_amount");
                            } catch (Exception e) {
                                log.error("读取tax_amount出现异常:" + e.getMessage());
                            }
                            try {
                                ShippingAmount = oneItem.getDouble("shipping_amount");
                            } catch (Exception e) {
                                log.error("读取shipping_amount出现异常:" + e.getMessage());
                            }
                            try {
                                ShippingServiceCost = oneItem.getDouble("shipping_service_cost");
                            } catch (Exception e) {
                                log.error("读取shipping_service_cost出现异常:" + e.getMessage());
                            }
                            try {
                                VoucherAmount = oneItem.getDouble("voucher_amount");
                            } catch (Exception e) {
                                log.error("读取voucher_amount出现异常:" + e.getMessage());
                            }
                            try {
                                VoucherCode = Sys.isCheckNull(oneItem.getString("voucher_code"));
                            } catch (Exception e) {
                                log.error("读取voucher_code出现异常:" + e.getMessage());
                            }
                            try {
                                Status = Sys.isCheckNull(oneItem.getString("status"));
                            } catch (Exception e) {
                                log.error("读取status出现异常:" + e.getMessage());
                            }
                            try {
                                ShipmentProvider = Sys.isCheckNull(oneItem.getString("shipment_provider"));
                            } catch (Exception e) {
                                log.error("读取shipment_provider出现异常:" + e.getMessage());
                            }
                            try {
                                IsDigital = oneItem.getInteger("is_digital");
                            } catch (Exception e) {
                                log.error("读取is_digital出现异常:" + e.getMessage());
                            }
                            try {
                                DigitalDeliveryInfo = Sys.isCheckNull(oneItem.getString("digital_delivery_info"));
                            } catch (Exception e) {
                                log.error("读取digital_delivery_info出现异常:" + e.getMessage());
                            }
                            try {
                                TrackingCode = Sys.isCheckNull(oneItem.getString("tracking_code"));
                            } catch (Exception e) {
                                log.error("读取TrackingCode出现异常:" + e.getMessage());
                            }
                            try {
                                TrackingCodePre = Sys.isCheckNull(oneItem.getString("tracking_code_pre"));
                            } catch (Exception e) {
                                log.error("读取TrackingCodePre出现异常:" + e.getMessage());
                            }
                            try {
                                Reason = Sys.isCheckNull(oneItem.getString("reason"));
                            } catch (Exception e) {
                                log.error("读取reason出现异常:" + e.getMessage());
                            }
                            try {
                                ReasonDetail = Sys.isCheckNull(oneItem.getString("reason_detail"));
                            } catch (Exception e) {
                                log.error("读取reason_detail出现异常:" + e.getMessage());
                            }
                            try {
                                PurchaseOrderId = Sys.isCheckNull(oneItem.getString("purchase_order_id"));
                            } catch (Exception e) {
                                log.error("读取purchase_order_id出现异常:" + e.getMessage());
                            }
                            try {
                                PurchaseOrderNumber = Sys.isCheckNull(oneItem.getString("purchase_order_number"));
                            } catch (Exception e) {
                                log.error("读取purchase_order_number出现异常:" + e.getMessage());
                            }
                            try {
                                PackageId = Sys.isCheckNull(oneItem.getString("package_id"));
                            } catch (Exception e) {
                                log.error("读取package_id出现异常:" + e.getMessage());
                            }
                            try {
                                PromisedShippingTime = Sys.isCheckNull(oneItem.getString("promised_shipping_time"));
                            } catch (Exception e) {
                                log.error("读取promised_shipping_time出现异常:" + e.getMessage());
                            }
                            try {
                                ExtraAttributes = Sys.isCheckNull(oneItem.getString("extra_attributes"));
                            } catch (Exception e) {
                                log.error("读取extra_attributes出现异常:" + e.getMessage());
                            }
                            try {
                                ShippingProviderType = Sys.isCheckNull(oneItem.getString("shipping_provider_type"));
                            } catch (Exception e) {
                                log.error("读取shipping_provider_type出现异常:" + e.getMessage());
                            }
                            try {
                                CreatedAt = Sys.isCheckNull(oneItem.getString("created_at"));
                            } catch (Exception e) {
                                log.error("读取created_at出现异常:" + e.getMessage());
                            }
                            try {
                                UpdatedAt = Sys.isCheckNull(oneItem.getString("updated_at"));
                            } catch (Exception e) {
                                log.error("读取updated_at出现异常:" + e.getMessage());
                            }
                            try {
                                ReturnStatus = Sys.isCheckNull(oneItem.getString("return_status"));
                            } catch (Exception e) {
                                log.error("读取return_status出现异常:" + e.getMessage());
                            }
                            try {
                                productMainImage = Sys.isCheckNull(oneItem.getString("product_main_image"));
                            } catch (Exception e) {
                                log.error("读取product_main_image出现异常:" + e.getMessage());
                            }
                            // 如果此订单已取消或退货
                            if ("canceled".equals(Sys.isCheckNull(Status).toLowerCase())) {
                                canceledCount++;
                                continue;// 跳过此商品,继续
                            } else if ("returned".equals(Sys.isCheckNull(Status).toLowerCase())) {
                                returnedCount++;
                                continue;// 跳过此商品,继续
                            } else if ("pending".equals(Sys.isCheckNull(Status).toLowerCase())) {
                                pendingCount++;
                            } else if ("ready_to_ship".equals(Sys.isCheckNull(Status).toLowerCase())) {
                                ready_to_shipCount++;
                            } else if ("delivered".equals(Sys.isCheckNull(Status).toLowerCase())) {
                                deliveredCount++;
                            } else if ("shipped".equals(Sys.isCheckNull(Status).toLowerCase())) {
                                shippedCount++;
                            } else if ("failed".equals(Sys.isCheckNull(Status).toLowerCase())) {
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
                            log.error("解析第" + j + "/100个商品Exception异常:" + e.getMessage());
                        }
                    }
                    if (itemList != null && !itemList.isEmpty()) {
                        rt.setCode(0);
                        rt.setDesc("订单:" + order.getOrderid() + "下有" + itemList.size() + "个商品");
                        rt.setObj(itemList);
                        return rt;
                    } else {
                        log.error("订单:" + order.getOrderid() + "下解析商品为空,但接口中有" + items.size() + "个商品");
                        rt.setCode(1000);
                        rt.setDesc("订单:" + order.getOrderid() + "下解析商品为空,但接口中有" + items.size() + "个商品");
                        return rt;
                    }
                } else {
                    log.error("订单:" + order.getOrderid() + "下无商品");
                    rt.setCode(1000);
                    rt.setDesc("订单:" + order.getOrderid() + "下无商品");
                    return rt;
                }
            } catch (Exception e) {
                log.error("Exception=" + e.getMessage());
                rt.setCode(999);
                rt.setDesc("解析详情HttpException异常:" + e.getMessage());
                return rt;
            }
        } catch (Exception e) {
            log.error("Exception=" + e.getMessage());
            rt.setCode(999);
            rt.setDesc("获取订单详情Exception异常:" + e.getMessage());
            return rt;
        }
    }

    /**
     * 判断订单是否存在正式表
     * @param tradeid
     * @param shoptypeid
     * @return
     * @throws Exception
     */
    private boolean orderIsExist(String tradeid, String shoptypeid) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("shoptypeid", shoptypeid);
        params.put("tradeid", tradeid);

        String orderid = orderMapper.orderIsExist(params);
        if (orderid != null) {
            return true;
        }
        return false;
    }

    /**
     * 整理订单
     *
     * @param order
     * @param itemList
     * @return
     */
    public List<DbLazadaorderinfo> saveOrderIntoTemp(DbLazadaorderinfo order, ArrayList<ItemBean> itemList) throws Exception {
        List<DbLazadaorderinfo> list = new ArrayList<>();
        if (order != null && itemList != null && !itemList.isEmpty()) {
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
            if (order.getCountrycode() == null && order.getCountry() != null) {
                order.setCountrycode(Sys.getCountryCodeFromCountryname(order.getCountry()));
            }
            order.setCheckdescr(Sys.isCheckNull(order.getCheckdescr()).replace("'", "‘"));

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
                DbLazadaorderinfo orderinfo = new DbLazadaorderinfo();
                orderinfo = order;
                orderinfo.setSequenceid(Sys.isCheckNull(order.getOrderid() + item.getOrderitemid()));
                orderinfo.setCorpid("1");
                orderinfo.setOrderitemid(Sys.isCheckNull(item.getOrderitemid()));
                orderinfo.setIdentifynum(Sys.isCheckNull(item.getIdentifynum()));
                orderinfo.setProductname(Sys.isCheckNull(item.getProductname()));
                orderinfo.setSku(Sys.isCheckNull(item.getSku()));
                orderinfo.setShopsku(Sys.isCheckNull(item.getShopsku()));
                orderinfo.setShippingtype(Sys.isCheckNull(item.getShippingtype()));
                orderinfo.setItemprice(NumberUtil.mul(item.getItemprice()));
                orderinfo.setQuantity(item.getQuantity());
                orderinfo.setPaidprice(NumberUtil.mul(item.getPaidprice()));
                orderinfo.setWalletcredits(NumberUtil.mul(item.getWalletcredits()));
                orderinfo.setTaxamount(NumberUtil.mul(item.getTaxamount()));
                orderinfo.setShippingamount(NumberUtil.mul(item.getShippingamount()));
                orderinfo.setVoucheramount(NumberUtil.mul(item.getVoucheramount()));
                orderinfo.setVouchercode(Sys.isCheckNull(item.getVouchercode()));
                orderinfo.setItemstatus(Sys.isCheckNull(item.getItemstatus()));
                orderinfo.setShipmentprovider(Sys.isCheckNull(item.getShipmentprovider()));
                orderinfo.setReason(Sys.isCheckNull(item.getReason()));
                orderinfo.setReasondetail(Sys.isCheckNull(item.getReasondetail()));
                orderinfo.setPurchaseorderid(Sys.isCheckNull(item.getPurchaseorderid()));
                orderinfo.setPurchaseordernumber(Sys.isCheckNull(item.getPurchaseordernumber()));
                orderinfo.setCheckflag(1);
                orderinfo.setCheckdescr("已校验");
                x++;
                list.add(orderinfo);
            }
        }
        return list;
    }


    // 保存Db_Order订单基本信息
    public void saveOrder(DbLazadaorderinfo obj, String skuPosition, double moneyrate, double platformFeeRate) {
        DbOrder order = new DbOrder();

        order.setOrderid(obj.getOrderid());
        order.setCorpid(obj.getCorpid());
        order.setTradeid(obj.getTradeid());// 注意这里保存的是主交易ID,DbLazadaorderinfo.tradeid里保存的是子交易ID
        order.setGroupid("" + obj.getGroupid());
        order.setCustomerid(obj.getCustomerid());
        order.setCustomername(obj.getCustomername());
        order.setCustomerfirstname(obj.getFirstname());
        order.setCustomerlastname(obj.getLastname());
        order.setCustomertype(obj.getShopname());
        order.setCustomertel1(obj.getPhone1());
        order.setCustomertel2(obj.getPhone2());
        order.setCustomeremail("");// Lazada无买家邮箱
        order.setCustomercountry(obj.getCountry());
        order.setCustomerprovince(obj.getProvince());
        order.setCustomercity(obj.getCity());
        String address = obj.getAddress1();
        if (!Sys.isNull(obj.getAddress2())) {// 有地址2
            if (!Sys.isNull(address)) {
                address = address + " , " + obj.getAddress2();
            } else {
                address = obj.getAddress2();
            }
        }
        if (!Sys.isNull(obj.getAddress3())) {// 有地址3
            if (!Sys.isNull(address)) {
                address = address + " , " + obj.getAddress3();
            } else {
                address = obj.getAddress3();
            }
        }
        order.setCustomeraddress(Sys.isCheckNull(address).trim());

        order.setCustomerzipcode(obj.getPostcode());
        order.setCustomerqq(obj.getCountrycode());// 保存的国家英文简称,如美国是US.
        order.setCustomerreserve2(Sys.getCountryCNByJc(obj.getCountrycode()));// 国家中文
        order.setCustomerreserve9("0");// 0表示未交运
        order.setCustomerreserve10("未交运");
        order.setShoptypeid(obj.getShopid());
        order.setShoptype(obj.getShopname());
        order.setMoneytype(obj.getCurrencyid());
        order.setMoneyask(NumberUtil.mul(0));// 后期自动算
        order.setMoneyaction(NumberUtil.mul(0));// 后期自动算
        order.setMoneyaction(NumberUtil.mul(0));// 后期自动算
        order.setMoneyexpressask(new BigDecimal(obj.getShippingamount().doubleValue() * moneyrate));// 快递费
        order.setOrdertime(obj.getCreateddate());// 付款时间就是创建时间
        order.setAlertflag("0");// 告警标志
        order.setUploadtime(new Date());
        order.setExpressweight(NumberUtil.mul(0));// 后期自动算
        order.setOper("sys");
        order.setOpertime(new Date());
        order.setReserve4("");// 买家对商品的备注信息
        order.setInsurance(NumberUtil.mul(0));// 保险费
        order.setPayid("");// PayPal交易ID
        order.setReserve8("");// PayPal收款Email地址
        order.setMoneyrate(NumberUtil.mul(moneyrate));// 汇率
        order.setOriginexpressmoney(obj.getShippingamount());// 原始运费
        order.setOriginfinalvaluefee(NumberUtil.mul(obj.getPaidprice(), obj.getQuantity(), platformFeeRate));// 原始交易费用
        order.setFinalvaluefee(NumberUtil.mul(order.getOriginfinalvaluefee(), moneyrate));// 转换后的交易费用
        // log.error(obj.getOriginfinalvaluefee());
        order.setNotestoyourself(Sys.isCheckNull(obj.getRemarks()));// 买家对卖家留言
        order.setOrigininsurance(NumberUtil.mul(0));// 原始保险费

        order.setOriginordermoney(NumberUtil.mul(obj.getPaidprice(), obj.getQuantity(), obj.getShippingamount()));// 原始订单费=产品费用+运费
        order.setOrdermoney(NumberUtil.mul(order.getOriginordermoney(), moneyrate));// 转换后的订单费
        String tempsku = Sys.findSku(obj.getSku());
        if ("1".equals(skuPosition)) {// 如果是取@#后面的字符串
            tempsku = Sys.findSkuFromMid(obj.getSku());
        }
        order.setQlreserve2("," + tempsku + ",");// 将第1个商品的SKU保存在订单里
        order.setPostageservice(Sys.isCheckNull(obj.getShippingtype()).replace("'", "'").replace(";", "_"));// Lazada发货方式
        order.setQlreserve5(NumberUtil.mul(0));
        order.setQlreserve6(NumberUtil.mul(0));
        order.setQlreserve7(NumberUtil.mul(0));
        order.setQlreserve8(NumberUtil.mul(0));
        order.setCalculateflag("0");// 未计算过运费
        // order.setCustomerreserve5(obj.getOrderreserve1());//此订单编号后期在交运时用的着-注:被作废,ebay真实订单ID目前保存在db_sell.reserve8而不是db_order.customerreserve1,因为sell会比合并到其他订单下,这样关联就出错了
        // 拼用户信息
        StringBuffer ebayadress = new StringBuffer();
        ebayadress.append("Name :" + Sys.isCheckNull(obj.getCustomername()) + "\r\n");
        ebayadress.append("Address :" + Sys.isCheckNull(order.getCustomeraddress()) + "\r\n");
        ebayadress.append("City :" + Sys.isCheckNull(order.getCustomercity()) + "\r\n");
        ebayadress.append("State :" + Sys.isCheckNull(order.getCustomerprovince()) + "\r\n");
        ebayadress.append("Country ：" + Sys.isCheckNull(order.getCustomercountry()) + "\r\n");
        ebayadress.append("Postal code :" + Sys.isCheckNull(order.getCustomerzipcode()) + "\r\n");
        ebayadress.append("Tel:" + Sys.isCheckNull(order.getCustomertel1()) + "\r\n");
        ebayadress.append("Email:" + Sys.isCheckNull(order.getCustomeremail()));
        order.setXbreserve3("0");// 费用拆分标志,0未拆分
        order.setEbaycustomeraddress(ebayadress.toString());// 保存合起来的ebay地址
        order.setCustomerreserve9("0");// 未交运
        order.setQlreserve4("1");// 默认排序1

        if (!Sys.isNull(order.getCustomerqq()) && order.getCustomerqq().length() == 2) {
            order.setCustomercountry(Sys.getCountry(order.getCustomerqq()));// 国家英文全称
            order.setCustomerreserve2(Sys.getCountryCNByJc(order.getCustomerqq()));// 国家中文
        }
        order.setStatus("已支付");// 既然要保存的直接就是已支付的订单
        try {
            orderMapper.insertSelective(order);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


}
