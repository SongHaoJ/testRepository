package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbLazadaorderinfo implements Serializable {
    private String sequenceid;

    private String orderid;

    private String tradeid;

    private String corpid;

    private String shopid;

    private String shopname;

    private Long groupid;

    private String currencyid;

    private String customerid;

    private String customername;

    private String firstname;

    private String lastname;

    private String paymentmethod;

    private String remarks;

    private String giftoption;

    private String giftmessage;

    private Date createddate;

    private Date updateddate;

    private String phone1;

    private String phone2;

    private String address1;

    private String address2;

    private String address3;

    private String city;

    private String province;

    private String ward;

    private String region;

    private String postcode;

    private String country;

    private String countrycode;

    private String orderitemid;

    private String identifynum;

    private String productname;

    private String sku;

    private String shopsku;

    private String shippingtype;

    private BigDecimal itemprice;

    private Integer quantity;

    private BigDecimal paidprice;

    private BigDecimal walletcredits;

    private BigDecimal taxamount;

    private BigDecimal shippingamount;

    private BigDecimal voucheramount;

    private String vouchercode;

    private String itemstatus;

    private String shipmentprovider;

    private String reason;

    private String reasondetail;

    private String purchaseorderid;

    private String purchaseordernumber;

    private Integer checkflag;

    private String checkdescr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid == null ? null : currencyid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod == null ? null : paymentmethod.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getGiftoption() {
        return giftoption;
    }

    public void setGiftoption(String giftoption) {
        this.giftoption = giftoption == null ? null : giftoption.trim();
    }

    public String getGiftmessage() {
        return giftmessage;
    }

    public void setGiftmessage(String giftmessage) {
        this.giftmessage = giftmessage == null ? null : giftmessage.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3 == null ? null : address3.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward == null ? null : ward.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(String orderitemid) {
        this.orderitemid = orderitemid == null ? null : orderitemid.trim();
    }

    public String getIdentifynum() {
        return identifynum;
    }

    public void setIdentifynum(String identifynum) {
        this.identifynum = identifynum == null ? null : identifynum.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getShopsku() {
        return shopsku;
    }

    public void setShopsku(String shopsku) {
        this.shopsku = shopsku == null ? null : shopsku.trim();
    }

    public String getShippingtype() {
        return shippingtype;
    }

    public void setShippingtype(String shippingtype) {
        this.shippingtype = shippingtype == null ? null : shippingtype.trim();
    }

    public BigDecimal getItemprice() {
        return itemprice;
    }

    public void setItemprice(BigDecimal itemprice) {
        this.itemprice = itemprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPaidprice() {
        return paidprice;
    }

    public void setPaidprice(BigDecimal paidprice) {
        this.paidprice = paidprice;
    }

    public BigDecimal getWalletcredits() {
        return walletcredits;
    }

    public void setWalletcredits(BigDecimal walletcredits) {
        this.walletcredits = walletcredits;
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public BigDecimal getShippingamount() {
        return shippingamount;
    }

    public void setShippingamount(BigDecimal shippingamount) {
        this.shippingamount = shippingamount;
    }

    public BigDecimal getVoucheramount() {
        return voucheramount;
    }

    public void setVoucheramount(BigDecimal voucheramount) {
        this.voucheramount = voucheramount;
    }

    public String getVouchercode() {
        return vouchercode;
    }

    public void setVouchercode(String vouchercode) {
        this.vouchercode = vouchercode == null ? null : vouchercode.trim();
    }

    public String getItemstatus() {
        return itemstatus;
    }

    public void setItemstatus(String itemstatus) {
        this.itemstatus = itemstatus == null ? null : itemstatus.trim();
    }

    public String getShipmentprovider() {
        return shipmentprovider;
    }

    public void setShipmentprovider(String shipmentprovider) {
        this.shipmentprovider = shipmentprovider == null ? null : shipmentprovider.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getReasondetail() {
        return reasondetail;
    }

    public void setReasondetail(String reasondetail) {
        this.reasondetail = reasondetail == null ? null : reasondetail.trim();
    }

    public String getPurchaseorderid() {
        return purchaseorderid;
    }

    public void setPurchaseorderid(String purchaseorderid) {
        this.purchaseorderid = purchaseorderid == null ? null : purchaseorderid.trim();
    }

    public String getPurchaseordernumber() {
        return purchaseordernumber;
    }

    public void setPurchaseordernumber(String purchaseordernumber) {
        this.purchaseordernumber = purchaseordernumber == null ? null : purchaseordernumber.trim();
    }

    public Integer getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(Integer checkflag) {
        this.checkflag = checkflag;
    }

    public String getCheckdescr() {
        return checkdescr;
    }

    public void setCheckdescr(String checkdescr) {
        this.checkdescr = checkdescr == null ? null : checkdescr.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DbLazadaorderinfo other = (DbLazadaorderinfo) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getCurrencyid() == null ? other.getCurrencyid() == null : this.getCurrencyid().equals(other.getCurrencyid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getPaymentmethod() == null ? other.getPaymentmethod() == null : this.getPaymentmethod().equals(other.getPaymentmethod()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getGiftoption() == null ? other.getGiftoption() == null : this.getGiftoption().equals(other.getGiftoption()))
            && (this.getGiftmessage() == null ? other.getGiftmessage() == null : this.getGiftmessage().equals(other.getGiftmessage()))
            && (this.getCreateddate() == null ? other.getCreateddate() == null : this.getCreateddate().equals(other.getCreateddate()))
            && (this.getUpdateddate() == null ? other.getUpdateddate() == null : this.getUpdateddate().equals(other.getUpdateddate()))
            && (this.getPhone1() == null ? other.getPhone1() == null : this.getPhone1().equals(other.getPhone1()))
            && (this.getPhone2() == null ? other.getPhone2() == null : this.getPhone2().equals(other.getPhone2()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getAddress2() == null ? other.getAddress2() == null : this.getAddress2().equals(other.getAddress2()))
            && (this.getAddress3() == null ? other.getAddress3() == null : this.getAddress3().equals(other.getAddress3()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getWard() == null ? other.getWard() == null : this.getWard().equals(other.getWard()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getOrderitemid() == null ? other.getOrderitemid() == null : this.getOrderitemid().equals(other.getOrderitemid()))
            && (this.getIdentifynum() == null ? other.getIdentifynum() == null : this.getIdentifynum().equals(other.getIdentifynum()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getShopsku() == null ? other.getShopsku() == null : this.getShopsku().equals(other.getShopsku()))
            && (this.getShippingtype() == null ? other.getShippingtype() == null : this.getShippingtype().equals(other.getShippingtype()))
            && (this.getItemprice() == null ? other.getItemprice() == null : this.getItemprice().equals(other.getItemprice()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPaidprice() == null ? other.getPaidprice() == null : this.getPaidprice().equals(other.getPaidprice()))
            && (this.getWalletcredits() == null ? other.getWalletcredits() == null : this.getWalletcredits().equals(other.getWalletcredits()))
            && (this.getTaxamount() == null ? other.getTaxamount() == null : this.getTaxamount().equals(other.getTaxamount()))
            && (this.getShippingamount() == null ? other.getShippingamount() == null : this.getShippingamount().equals(other.getShippingamount()))
            && (this.getVoucheramount() == null ? other.getVoucheramount() == null : this.getVoucheramount().equals(other.getVoucheramount()))
            && (this.getVouchercode() == null ? other.getVouchercode() == null : this.getVouchercode().equals(other.getVouchercode()))
            && (this.getItemstatus() == null ? other.getItemstatus() == null : this.getItemstatus().equals(other.getItemstatus()))
            && (this.getShipmentprovider() == null ? other.getShipmentprovider() == null : this.getShipmentprovider().equals(other.getShipmentprovider()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getReasondetail() == null ? other.getReasondetail() == null : this.getReasondetail().equals(other.getReasondetail()))
            && (this.getPurchaseorderid() == null ? other.getPurchaseorderid() == null : this.getPurchaseorderid().equals(other.getPurchaseorderid()))
            && (this.getPurchaseordernumber() == null ? other.getPurchaseordernumber() == null : this.getPurchaseordernumber().equals(other.getPurchaseordernumber()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()))
            && (this.getCheckdescr() == null ? other.getCheckdescr() == null : this.getCheckdescr().equals(other.getCheckdescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getCurrencyid() == null) ? 0 : getCurrencyid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getPaymentmethod() == null) ? 0 : getPaymentmethod().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getGiftoption() == null) ? 0 : getGiftoption().hashCode());
        result = prime * result + ((getGiftmessage() == null) ? 0 : getGiftmessage().hashCode());
        result = prime * result + ((getCreateddate() == null) ? 0 : getCreateddate().hashCode());
        result = prime * result + ((getUpdateddate() == null) ? 0 : getUpdateddate().hashCode());
        result = prime * result + ((getPhone1() == null) ? 0 : getPhone1().hashCode());
        result = prime * result + ((getPhone2() == null) ? 0 : getPhone2().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        result = prime * result + ((getAddress3() == null) ? 0 : getAddress3().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getWard() == null) ? 0 : getWard().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getOrderitemid() == null) ? 0 : getOrderitemid().hashCode());
        result = prime * result + ((getIdentifynum() == null) ? 0 : getIdentifynum().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getShopsku() == null) ? 0 : getShopsku().hashCode());
        result = prime * result + ((getShippingtype() == null) ? 0 : getShippingtype().hashCode());
        result = prime * result + ((getItemprice() == null) ? 0 : getItemprice().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPaidprice() == null) ? 0 : getPaidprice().hashCode());
        result = prime * result + ((getWalletcredits() == null) ? 0 : getWalletcredits().hashCode());
        result = prime * result + ((getTaxamount() == null) ? 0 : getTaxamount().hashCode());
        result = prime * result + ((getShippingamount() == null) ? 0 : getShippingamount().hashCode());
        result = prime * result + ((getVoucheramount() == null) ? 0 : getVoucheramount().hashCode());
        result = prime * result + ((getVouchercode() == null) ? 0 : getVouchercode().hashCode());
        result = prime * result + ((getItemstatus() == null) ? 0 : getItemstatus().hashCode());
        result = prime * result + ((getShipmentprovider() == null) ? 0 : getShipmentprovider().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getReasondetail() == null) ? 0 : getReasondetail().hashCode());
        result = prime * result + ((getPurchaseorderid() == null) ? 0 : getPurchaseorderid().hashCode());
        result = prime * result + ((getPurchaseordernumber() == null) ? 0 : getPurchaseordernumber().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        result = prime * result + ((getCheckdescr() == null) ? 0 : getCheckdescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", orderid=").append(orderid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", corpid=").append(corpid);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", groupid=").append(groupid);
        sb.append(", currencyid=").append(currencyid);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", paymentmethod=").append(paymentmethod);
        sb.append(", remarks=").append(remarks);
        sb.append(", giftoption=").append(giftoption);
        sb.append(", giftmessage=").append(giftmessage);
        sb.append(", createddate=").append(createddate);
        sb.append(", updateddate=").append(updateddate);
        sb.append(", phone1=").append(phone1);
        sb.append(", phone2=").append(phone2);
        sb.append(", address1=").append(address1);
        sb.append(", address2=").append(address2);
        sb.append(", address3=").append(address3);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", ward=").append(ward);
        sb.append(", region=").append(region);
        sb.append(", postcode=").append(postcode);
        sb.append(", country=").append(country);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", orderitemid=").append(orderitemid);
        sb.append(", identifynum=").append(identifynum);
        sb.append(", productname=").append(productname);
        sb.append(", sku=").append(sku);
        sb.append(", shopsku=").append(shopsku);
        sb.append(", shippingtype=").append(shippingtype);
        sb.append(", itemprice=").append(itemprice);
        sb.append(", quantity=").append(quantity);
        sb.append(", paidprice=").append(paidprice);
        sb.append(", walletcredits=").append(walletcredits);
        sb.append(", taxamount=").append(taxamount);
        sb.append(", shippingamount=").append(shippingamount);
        sb.append(", voucheramount=").append(voucheramount);
        sb.append(", vouchercode=").append(vouchercode);
        sb.append(", itemstatus=").append(itemstatus);
        sb.append(", shipmentprovider=").append(shipmentprovider);
        sb.append(", reason=").append(reason);
        sb.append(", reasondetail=").append(reasondetail);
        sb.append(", purchaseorderid=").append(purchaseorderid);
        sb.append(", purchaseordernumber=").append(purchaseordernumber);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", checkdescr=").append(checkdescr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}