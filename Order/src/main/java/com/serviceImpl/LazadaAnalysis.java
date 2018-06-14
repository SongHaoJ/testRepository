/*
package com.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbShop;
import com.bean.util.RetCode;
import com.bean.util.Sys;
import com.gourpBean.ItemBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

public class LazadaAnalysis {

    Logger log = LoggerFactory.getLogger(LazadaAnalysis.class);


    public RetCode analysisOrderInfo(JSONObject oneOrder, DbShop shop,Long groupId){
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
                System.out.println("解析order_id异常:" + e.getMessage());
            }
            try {
                OrderNumber = oneOrder.getString("order_number");
            } catch (Exception e) {
                System.out.println("解析order_number异常:" + e.getMessage());
            }
            if (Sys.isNull(OrderNumber) == true) {
                OrderNumber = "" + OrderId;
            }
            try {
                CustomerFirstName = Sys
                        .isCheckNull(oneOrder.getString("customer_first_name"));
            } catch (Exception e) {
                System.out.println("解析customer_first_name异常:" + e.getMessage());
            }
            try {
                CustomerLastName = Sys
                        .isCheckNull(oneOrder.getString("customer_last_name"));
            } catch (Exception e) {
                System.out.println("解析customer_last_name异常:" + e.getMessage());
            }
            try {
                PaymentMethod = Sys
                        .isCheckNull(oneOrder.getString("payment_method"));
            } catch (Exception e) {
                System.out.println("解析payment_method异常:" + e.getMessage());
            }
            try {
                Remarks = Sys.isCheckNull(oneOrder.getString("remarks"));
            } catch (Exception e) {
                System.out.println("解析remarks异常:" + e.getMessage());
            }
            try {
                DeliveryInfo = Sys.isCheckNull(oneOrder.getString("delivery_info"));
            } catch (Exception e) {
                System.out.println("解析delivery_info异常:" + e.getMessage());
            }
            try {
                Price = Sys.isCheckNull(oneOrder.getString("price")).replace(",",
                        "");
            } catch (Exception e) {
                System.out.println("解析price异常:" + e.getMessage());
            }
            try {
                GiftOption = Sys.isCheckNull(oneOrder.getString("gift_option"));
            } catch (Exception e) {
                System.out.println("解析gift_option异常:" + e.getMessage());
            }
            try {
                GiftMessage = Sys.isCheckNull(oneOrder.getString("gift_message"));
            } catch (Exception e) {
                System.out.println("解析gift_message异常:" + e.getMessage());
            }
            try {
                VoucherCode = Sys.isCheckNull(oneOrder.getString("voucher_code"));
            } catch (Exception e) {
                System.out.println("解析voucher_code异常:" + e.getMessage());
            }
            try {
                CreatedAt = Sys.isCheckNull(oneOrder.getString("created_at"));
            } catch (Exception e) {
                System.out.println("解析created_at异常:" + e.getMessage());
            }
            try {
                UpdatedAt = Sys.isCheckNull(oneOrder.getString("updated_at"));
            } catch (Exception e) {
                System.out.println("解析updated_at异常:" + e.getMessage());
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
                    System.out.println("解析phone异常:" + e.getMessage());
                }
                try {
                    Phone2 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("phone2"));
                } catch (Exception e) {
                    System.out.println("解析phone2异常:" + e.getMessage());
                }
                try {
                    Address1 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address1"));
                } catch (Exception e) {
                    System.out.println("解析address1异常:" + e.getMessage());
                }
                try {
                    Address2 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address2"));
                } catch (Exception e) {
                    System.out.println("解析address2异常:" + e.getMessage());
                }
                try {
                    Address3 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address3"));
                } catch (Exception e) {
                    System.out.println("解析address3异常:" + e.getMessage());
                }
                try {
                    Address4 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address4"));
                } catch (Exception e) {
                    System.out.println("解析address4异常:" + e.getMessage());
                }
                try {
                    Address5 = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("address5"));
                } catch (Exception e) {
                    System.out.println("解析address5异常:" + e.getMessage());
                }
                try {
                    CustomerEmail = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("customer_email"));
                } catch (Exception e) {
                    System.out.println("解析customer_email异常:" + e.getMessage());
                }
                try {
                    City = Sys
                            .isCheckNull(jo_str_AddressShipping.getString("city"));
                } catch (Exception e) {
                    System.out.println("解析city异常:" + e.getMessage());
                }
                */
/*
                 * try { Ward = Sys
                 * .isCheckNull(
                 * jo_str_AddressShipping.
                 * getString("Ward")); }
                 * catch (Exception e) {
                 * System.out.println(
                 * "解析Ward异常:" +
                 * e.getMessage()); }
                 *//*

                */
/*
                 * try { Region =
                 * Sys.isCheckNull(
                 * jo_str_AddressShipping.
                 * getString("Region")); }
                 * catch (Exception e) {
                 * System.out.println(
                 * "解析Region异常:" +
                 * e.getMessage()); }
                 *//*

                try {
                    PostCode = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("post_code"));
                } catch (Exception e) {
                    System.out.println("解析post_code异常:" + e.getMessage());
                }
                try {
                    Country = Sys.isCheckNull(
                            jo_str_AddressShipping.getString("country"));
                } catch (Exception e) {
                    System.out.println("解析country异常:" + e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("解析address_shipping异常:" + e.getMessage());
            }
            try {
                str_AddressShipping = Sys
                        .isCheckNull(oneOrder.getString("address_shipping"));
            } catch (Exception e) {
                System.out.println("解析address_shipping异常:" + e.getMessage());
            }
            try {
                NationalRegistrationNumber = Sys.isCheckNull(
                        oneOrder.getString("national_registration_number"));
            } catch (Exception e) {
                System.out.println(
                        "解析national_registration_number异常:" + e.getMessage());
            }
            try {
                ItemsCount = oneOrder.getInteger("items_count");
            } catch (Exception e) {
                System.out.println("解析items_count异常:" + e.getMessage());
            }
            try {
                PromisedShippingTimes = Sys
                        .isCheckNull(oneOrder.getString("promised_shipping_times"));
            } catch (Exception e) {
                System.out.println("解析promised_shipping_times异常:" + e.getMessage());
            }
            try {
                ExtraAttributes = Sys
                        .isCheckNull(oneOrder.getString("extra_attributes"));
            } catch (Exception e) {
                System.out.println("解析extra_attributes异常:" + e.getMessage());
            }
            try {
                String str_Statuses = Sys
                        .isCheckNull(oneOrder.getString("statuses")).toLowerCase();
                if (str_Statuses.indexOf("failed") >= 0) {
                    Status = "failed";
                }
                if (str_Statuses.indexOf("returned") >= 0) {
                    Status = "returned";
                }
                if (str_Statuses.indexOf("delivered") >= 0) {
                    Status = "delivered";
                }
                if (str_Statuses.indexOf("ready_to_ship") >= 0) {
                    Status = "ready_to_ship";
                }
                if (str_Statuses.indexOf("canceled") >= 0) {
                    Status = "canceled";
                }
                if (str_Statuses.indexOf("pending") >= 0) {
                    Status = "pending";
                }
                if (Sys.isNull(Status) == true) {
                    Status = str_Statuses.replace("\"", "").replace("[", "")
                            .replace("]", "").replace(" ", "").replace("\r\n", "");
                }
            } catch (Exception e) {
                System.out.println("解析statuses异常:" + e.getMessage());
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
            try {
                if ("my".equals(Sys.isCheckNull(shop.getAmazonurlname())
                        .toLowerCase()) == true) {
                    order.setCurrencyid("MYR");
                } // 马来西亚
                if ("ph".equals(Sys.isCheckNull(shop.getAmazonurlname())
                        .toLowerCase()) == true) {
                    order.setCurrencyid("PHP");
                } // 菲律宾
                if ("sg".equals(Sys.isCheckNull(shop.getAmazonurlname())
                        .toLowerCase()) == true) {
                    order.setCurrencyid("SGD");
                } // 新加坡
                if ("th".equals(Sys.isCheckNull(shop.getAmazonurlname())
                        .toLowerCase()) == true) {
                    order.setCurrencyid("THB");
                } // 泰国
                if ("id".equals(Sys.isCheckNull(shop.getAmazonurlname())
                        .toLowerCase()) == true) {
                    order.setCurrencyid("IDR");
                } // 印尼
                if ("vn".equals(Sys.isCheckNull(shop.getAmazonurlname())
                        .toLowerCase()) == true) {
                    order.setCurrencyid("VND");
                } // 越南
            } catch (Exception e) {
                ;
            }
            try {
                order.setPhone1(Phone);
            } catch (Exception e) {
            }
            try {
                order.setPhone2(Phone2);
            } catch (Exception e) {
            }
            try {
                order.setAddress1(Address1);
            } catch (Exception e) {
            }
            try {
                order.setAddress2(Address2);
            } catch (Exception e) {
            }
            try {
                order.setAddress3(Address3);
            } catch (Exception e) {
            }
            try {
                // 如果有地址4
                if (Sys.isNull(Address4) == false) {
                    order.setAddress3(order.getAddress3() + " " + Address4);
                } else {
                    ;
                }
            } catch (Exception e) {
            }
            try {
                order.setCity(City);
            } catch (Exception e) {
            }
            // 因无province，所以默认province=city
            try {
                order.setProvince(City);
            } catch (Exception e) {
            }
            try {
                order.setPostcode(PostCode);
            } catch (Exception e) {
            }
            */
/*
             * try { order.setWard(Ward); }
             * catch (Exception e) { } try {
             * order.setRegion(Region); }
             * catch (Exception e) { }
             *//*

            try {
                order.setCountry(Country);
            } catch (Exception e) {
            } // 国家全称如Thailand

            try {

                if ("failed".equals(Status)
                        || "canceled".equals(Status)
                        || "returned".equals(Status)) {
                    Map<String,String> params = new HashMap<String,String>();
                    params.put("bansendflag","1");
                    params.put("content","订单已退款,请谨慎发货,平台订单状态："+Status);
                    params.put("tradeid",order.getTradeid());
                    params.put("shoptypeid",shop.getSid());
                    orderMapper.updateRefundOrderStatus(params);

                  return null;
                }
            } catch (Exception e) {
                ;
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
            } else {
                // 开始解析ItemList
                // TODO 解析商品列表
                RetCode rtGetItem = this.getItem(i, jo_os.size(), order,
                        "" + OrderId, shop);
                if (rtGetItem.getObj() != null) {
                    ArrayList<ItemBean> itemList = (ArrayList<ItemBean>) rtGetItem
                            .getObj();
                    // 保存进临时表

                    RetCode rtSave = saveOrderIntoTemp(order, itemList);
                    if (rtSave.getCode() == 0) {
                        successCount++;
                    } else {// 保存不成功或部分不成功
                        log.info("保存失败" + rtSave.getDesc());
                    }
                } else {
                    return null;
                }
            }

        } catch (Exception e) {
        }
    }

    private boolean orderIsExist(String tradeid, String shoptypeid) throws SQLException, Exception {
        boolean isExist = false;
        Map<String,String> params = new HashMap<String, String>();
        params.put("shoptypeid",shoptypeid);
        params.put("tradeid",tradeid);

        List<String> orderIdList = orderMapper.selectOrderIdByShopId(params);
        if (orderIdList.size()>0) {
            isExist = true;
        }
        return isExist;
    }
}
*/
