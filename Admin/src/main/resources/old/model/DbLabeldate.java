package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbLabeldate implements Serializable {
    private String sequenceid;

    private String orderid;

    private String customername;

    private String customertel;

    private String customercountry;

    private String customerprovince;

    private String customercity;

    private String customeraddress;

    private BigDecimal ordermonry;

    private BigDecimal orderexpress;

    private Date ordertime;

    private String tradeid;

    private String customerid;

    private String customeremail;

    private String customerzipcode;

    private String customerrefax;

    private String shoptype;

    private String payid;

    private String expresstype;

    private String expressid;

    private BigDecimal orderweight;

    private BigDecimal reserve4;

    private BigDecimal reserve10;

    private BigDecimal reserve11;

    private BigDecimal reserve12;

    private String content;

    private String products;

    private String postageservice;

    private String sellinfo;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve5;

    private String reserve6;

    private String reserve7;

    private String reserve8;

    private String reserve9;

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

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel == null ? null : customertel.trim();
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getCustomerprovince() {
        return customerprovince;
    }

    public void setCustomerprovince(String customerprovince) {
        this.customerprovince = customerprovince == null ? null : customerprovince.trim();
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity == null ? null : customercity.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public BigDecimal getOrdermonry() {
        return ordermonry;
    }

    public void setOrdermonry(BigDecimal ordermonry) {
        this.ordermonry = ordermonry;
    }

    public BigDecimal getOrderexpress() {
        return orderexpress;
    }

    public void setOrderexpress(BigDecimal orderexpress) {
        this.orderexpress = orderexpress;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomerzipcode() {
        return customerzipcode;
    }

    public void setCustomerzipcode(String customerzipcode) {
        this.customerzipcode = customerzipcode == null ? null : customerzipcode.trim();
    }

    public String getCustomerrefax() {
        return customerrefax;
    }

    public void setCustomerrefax(String customerrefax) {
        this.customerrefax = customerrefax == null ? null : customerrefax.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public BigDecimal getOrderweight() {
        return orderweight;
    }

    public void setOrderweight(BigDecimal orderweight) {
        this.orderweight = orderweight;
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getReserve10() {
        return reserve10;
    }

    public void setReserve10(BigDecimal reserve10) {
        this.reserve10 = reserve10;
    }

    public BigDecimal getReserve11() {
        return reserve11;
    }

    public void setReserve11(BigDecimal reserve11) {
        this.reserve11 = reserve11;
    }

    public BigDecimal getReserve12() {
        return reserve12;
    }

    public void setReserve12(BigDecimal reserve12) {
        this.reserve12 = reserve12;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products == null ? null : products.trim();
    }

    public String getPostageservice() {
        return postageservice;
    }

    public void setPostageservice(String postageservice) {
        this.postageservice = postageservice == null ? null : postageservice.trim();
    }

    public String getSellinfo() {
        return sellinfo;
    }

    public void setSellinfo(String sellinfo) {
        this.sellinfo = sellinfo == null ? null : sellinfo.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public String getReserve6() {
        return reserve6;
    }

    public void setReserve6(String reserve6) {
        this.reserve6 = reserve6 == null ? null : reserve6.trim();
    }

    public String getReserve7() {
        return reserve7;
    }

    public void setReserve7(String reserve7) {
        this.reserve7 = reserve7 == null ? null : reserve7.trim();
    }

    public String getReserve8() {
        return reserve8;
    }

    public void setReserve8(String reserve8) {
        this.reserve8 = reserve8 == null ? null : reserve8.trim();
    }

    public String getReserve9() {
        return reserve9;
    }

    public void setReserve9(String reserve9) {
        this.reserve9 = reserve9 == null ? null : reserve9.trim();
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
        DbLabeldate other = (DbLabeldate) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomertel() == null ? other.getCustomertel() == null : this.getCustomertel().equals(other.getCustomertel()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getOrdermonry() == null ? other.getOrdermonry() == null : this.getOrdermonry().equals(other.getOrdermonry()))
            && (this.getOrderexpress() == null ? other.getOrderexpress() == null : this.getOrderexpress().equals(other.getOrderexpress()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomerrefax() == null ? other.getCustomerrefax() == null : this.getCustomerrefax().equals(other.getCustomerrefax()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getPayid() == null ? other.getPayid() == null : this.getPayid().equals(other.getPayid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getOrderweight() == null ? other.getOrderweight() == null : this.getOrderweight().equals(other.getOrderweight()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getProducts() == null ? other.getProducts() == null : this.getProducts().equals(other.getProducts()))
            && (this.getPostageservice() == null ? other.getPostageservice() == null : this.getPostageservice().equals(other.getPostageservice()))
            && (this.getSellinfo() == null ? other.getSellinfo() == null : this.getSellinfo().equals(other.getSellinfo()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomertel() == null) ? 0 : getCustomertel().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getOrdermonry() == null) ? 0 : getOrdermonry().hashCode());
        result = prime * result + ((getOrderexpress() == null) ? 0 : getOrderexpress().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomerrefax() == null) ? 0 : getCustomerrefax().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getPayid() == null) ? 0 : getPayid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getOrderweight() == null) ? 0 : getOrderweight().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getProducts() == null) ? 0 : getProducts().hashCode());
        result = prime * result + ((getPostageservice() == null) ? 0 : getPostageservice().hashCode());
        result = prime * result + ((getSellinfo() == null) ? 0 : getSellinfo().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
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
        sb.append(", customername=").append(customername);
        sb.append(", customertel=").append(customertel);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", ordermonry=").append(ordermonry);
        sb.append(", orderexpress=").append(orderexpress);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", customerid=").append(customerid);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customerrefax=").append(customerrefax);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", payid=").append(payid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", expressid=").append(expressid);
        sb.append(", orderweight=").append(orderweight);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", content=").append(content);
        sb.append(", products=").append(products);
        sb.append(", postageservice=").append(postageservice);
        sb.append(", sellinfo=").append(sellinfo);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}