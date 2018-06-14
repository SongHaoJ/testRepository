package com.gourpBean;

import lombok.Data;

@Data
public class ItemBean {
    private String orderitemid;
    private String identifynum;
    private String productname;
    private String sku;
    private String shopsku;
    private String shippingtype;
    private Double itemprice;
    private Integer quantity;
    private Double paidprice;
    private Double walletcredits;
    private Double taxamount;
    private Double shippingamount;
    private Double voucheramount;
    private String vouchercode;
    private String itemstatus;
    private String shipmentprovider;
    private String reason;
    private String reasondetail;
    private String purchaseorderid;
    private String purchaseordernumber;
    private String productMainImage;
    private String TrackingCode;
}
