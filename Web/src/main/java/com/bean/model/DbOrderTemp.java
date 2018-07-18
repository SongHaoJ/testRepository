package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbOrderTemp implements Serializable {
    private String sequenceid;

    private String tradeid;

    private String customerid;

    private String customername;

    private String customertel;

    private String customeremail;

    private String customeraddress1;

    private String customeraddress2;

    private String customercity;

    private String customerprovince;

    private String customerzipcode;

    private String customercountry;

    private String productid;

    private String ordernum;

    private String sellpricestr;

    private String expressstr;

    private String paypalid;

    private String transactionid;

    private String variationdetails;

    private String productname;

    private String itemid;

    private String insurance;

    private String postageservice;

    private String field23;

    private String field24;

    private String field25;

    private String field26;

    private String field27;

    private String field28;

    private String field29;

    private String field30;

    private String groupid;

    private String sline;

    private BigDecimal recordnum;

    private String oper;

    private Date opertime;

    private String shopid;

    private String shopname;

    private String shopitemid;

    private String checkflag;

    private String errorinfo;

    private String moneytype;

    private BigDecimal moneyrate;

    private BigDecimal originsellprice;

    private BigDecimal rmbsellprice;

    private BigDecimal rmbamount;

    private BigDecimal originexpress;

    private BigDecimal rmbexpressmoney;

    private BigDecimal insurancemoney;

    private BigDecimal rmbinsurancemoney;

    private String corpid;

    private String ebaycustomeraddress;

    private String content;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
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

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomeraddress1() {
        return customeraddress1;
    }

    public void setCustomeraddress1(String customeraddress1) {
        this.customeraddress1 = customeraddress1 == null ? null : customeraddress1.trim();
    }

    public String getCustomeraddress2() {
        return customeraddress2;
    }

    public void setCustomeraddress2(String customeraddress2) {
        this.customeraddress2 = customeraddress2 == null ? null : customeraddress2.trim();
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity == null ? null : customercity.trim();
    }

    public String getCustomerprovince() {
        return customerprovince;
    }

    public void setCustomerprovince(String customerprovince) {
        this.customerprovince = customerprovince == null ? null : customerprovince.trim();
    }

    public String getCustomerzipcode() {
        return customerzipcode;
    }

    public void setCustomerzipcode(String customerzipcode) {
        this.customerzipcode = customerzipcode == null ? null : customerzipcode.trim();
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getSellpricestr() {
        return sellpricestr;
    }

    public void setSellpricestr(String sellpricestr) {
        this.sellpricestr = sellpricestr == null ? null : sellpricestr.trim();
    }

    public String getExpressstr() {
        return expressstr;
    }

    public void setExpressstr(String expressstr) {
        this.expressstr = expressstr == null ? null : expressstr.trim();
    }

    public String getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(String paypalid) {
        this.paypalid = paypalid == null ? null : paypalid.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getVariationdetails() {
        return variationdetails;
    }

    public void setVariationdetails(String variationdetails) {
        this.variationdetails = variationdetails == null ? null : variationdetails.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance == null ? null : insurance.trim();
    }

    public String getPostageservice() {
        return postageservice;
    }

    public void setPostageservice(String postageservice) {
        this.postageservice = postageservice == null ? null : postageservice.trim();
    }

    public String getField23() {
        return field23;
    }

    public void setField23(String field23) {
        this.field23 = field23 == null ? null : field23.trim();
    }

    public String getField24() {
        return field24;
    }

    public void setField24(String field24) {
        this.field24 = field24 == null ? null : field24.trim();
    }

    public String getField25() {
        return field25;
    }

    public void setField25(String field25) {
        this.field25 = field25 == null ? null : field25.trim();
    }

    public String getField26() {
        return field26;
    }

    public void setField26(String field26) {
        this.field26 = field26 == null ? null : field26.trim();
    }

    public String getField27() {
        return field27;
    }

    public void setField27(String field27) {
        this.field27 = field27 == null ? null : field27.trim();
    }

    public String getField28() {
        return field28;
    }

    public void setField28(String field28) {
        this.field28 = field28 == null ? null : field28.trim();
    }

    public String getField29() {
        return field29;
    }

    public void setField29(String field29) {
        this.field29 = field29 == null ? null : field29.trim();
    }

    public String getField30() {
        return field30;
    }

    public void setField30(String field30) {
        this.field30 = field30 == null ? null : field30.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getSline() {
        return sline;
    }

    public void setSline(String sline) {
        this.sline = sline == null ? null : sline.trim();
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
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

    public String getShopitemid() {
        return shopitemid;
    }

    public void setShopitemid(String shopitemid) {
        this.shopitemid = shopitemid == null ? null : shopitemid.trim();
    }

    public String getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag == null ? null : checkflag.trim();
    }

    public String getErrorinfo() {
        return errorinfo;
    }

    public void setErrorinfo(String errorinfo) {
        this.errorinfo = errorinfo == null ? null : errorinfo.trim();
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public BigDecimal getMoneyrate() {
        return moneyrate;
    }

    public void setMoneyrate(BigDecimal moneyrate) {
        this.moneyrate = moneyrate;
    }

    public BigDecimal getOriginsellprice() {
        return originsellprice;
    }

    public void setOriginsellprice(BigDecimal originsellprice) {
        this.originsellprice = originsellprice;
    }

    public BigDecimal getRmbsellprice() {
        return rmbsellprice;
    }

    public void setRmbsellprice(BigDecimal rmbsellprice) {
        this.rmbsellprice = rmbsellprice;
    }

    public BigDecimal getRmbamount() {
        return rmbamount;
    }

    public void setRmbamount(BigDecimal rmbamount) {
        this.rmbamount = rmbamount;
    }

    public BigDecimal getOriginexpress() {
        return originexpress;
    }

    public void setOriginexpress(BigDecimal originexpress) {
        this.originexpress = originexpress;
    }

    public BigDecimal getRmbexpressmoney() {
        return rmbexpressmoney;
    }

    public void setRmbexpressmoney(BigDecimal rmbexpressmoney) {
        this.rmbexpressmoney = rmbexpressmoney;
    }

    public BigDecimal getInsurancemoney() {
        return insurancemoney;
    }

    public void setInsurancemoney(BigDecimal insurancemoney) {
        this.insurancemoney = insurancemoney;
    }

    public BigDecimal getRmbinsurancemoney() {
        return rmbinsurancemoney;
    }

    public void setRmbinsurancemoney(BigDecimal rmbinsurancemoney) {
        this.rmbinsurancemoney = rmbinsurancemoney;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getEbaycustomeraddress() {
        return ebaycustomeraddress;
    }

    public void setEbaycustomeraddress(String ebaycustomeraddress) {
        this.ebaycustomeraddress = ebaycustomeraddress == null ? null : ebaycustomeraddress.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        DbOrderTemp other = (DbOrderTemp) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomertel() == null ? other.getCustomertel() == null : this.getCustomertel().equals(other.getCustomertel()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomeraddress1() == null ? other.getCustomeraddress1() == null : this.getCustomeraddress1().equals(other.getCustomeraddress1()))
            && (this.getCustomeraddress2() == null ? other.getCustomeraddress2() == null : this.getCustomeraddress2().equals(other.getCustomeraddress2()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getSellpricestr() == null ? other.getSellpricestr() == null : this.getSellpricestr().equals(other.getSellpricestr()))
            && (this.getExpressstr() == null ? other.getExpressstr() == null : this.getExpressstr().equals(other.getExpressstr()))
            && (this.getPaypalid() == null ? other.getPaypalid() == null : this.getPaypalid().equals(other.getPaypalid()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getVariationdetails() == null ? other.getVariationdetails() == null : this.getVariationdetails().equals(other.getVariationdetails()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getPostageservice() == null ? other.getPostageservice() == null : this.getPostageservice().equals(other.getPostageservice()))
            && (this.getField23() == null ? other.getField23() == null : this.getField23().equals(other.getField23()))
            && (this.getField24() == null ? other.getField24() == null : this.getField24().equals(other.getField24()))
            && (this.getField25() == null ? other.getField25() == null : this.getField25().equals(other.getField25()))
            && (this.getField26() == null ? other.getField26() == null : this.getField26().equals(other.getField26()))
            && (this.getField27() == null ? other.getField27() == null : this.getField27().equals(other.getField27()))
            && (this.getField28() == null ? other.getField28() == null : this.getField28().equals(other.getField28()))
            && (this.getField29() == null ? other.getField29() == null : this.getField29().equals(other.getField29()))
            && (this.getField30() == null ? other.getField30() == null : this.getField30().equals(other.getField30()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getSline() == null ? other.getSline() == null : this.getSline().equals(other.getSline()))
            && (this.getRecordnum() == null ? other.getRecordnum() == null : this.getRecordnum().equals(other.getRecordnum()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getShopitemid() == null ? other.getShopitemid() == null : this.getShopitemid().equals(other.getShopitemid()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()))
            && (this.getErrorinfo() == null ? other.getErrorinfo() == null : this.getErrorinfo().equals(other.getErrorinfo()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getMoneyrate() == null ? other.getMoneyrate() == null : this.getMoneyrate().equals(other.getMoneyrate()))
            && (this.getOriginsellprice() == null ? other.getOriginsellprice() == null : this.getOriginsellprice().equals(other.getOriginsellprice()))
            && (this.getRmbsellprice() == null ? other.getRmbsellprice() == null : this.getRmbsellprice().equals(other.getRmbsellprice()))
            && (this.getRmbamount() == null ? other.getRmbamount() == null : this.getRmbamount().equals(other.getRmbamount()))
            && (this.getOriginexpress() == null ? other.getOriginexpress() == null : this.getOriginexpress().equals(other.getOriginexpress()))
            && (this.getRmbexpressmoney() == null ? other.getRmbexpressmoney() == null : this.getRmbexpressmoney().equals(other.getRmbexpressmoney()))
            && (this.getInsurancemoney() == null ? other.getInsurancemoney() == null : this.getInsurancemoney().equals(other.getInsurancemoney()))
            && (this.getRmbinsurancemoney() == null ? other.getRmbinsurancemoney() == null : this.getRmbinsurancemoney().equals(other.getRmbinsurancemoney()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getEbaycustomeraddress() == null ? other.getEbaycustomeraddress() == null : this.getEbaycustomeraddress().equals(other.getEbaycustomeraddress()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomertel() == null) ? 0 : getCustomertel().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomeraddress1() == null) ? 0 : getCustomeraddress1().hashCode());
        result = prime * result + ((getCustomeraddress2() == null) ? 0 : getCustomeraddress2().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getSellpricestr() == null) ? 0 : getSellpricestr().hashCode());
        result = prime * result + ((getExpressstr() == null) ? 0 : getExpressstr().hashCode());
        result = prime * result + ((getPaypalid() == null) ? 0 : getPaypalid().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getVariationdetails() == null) ? 0 : getVariationdetails().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getPostageservice() == null) ? 0 : getPostageservice().hashCode());
        result = prime * result + ((getField23() == null) ? 0 : getField23().hashCode());
        result = prime * result + ((getField24() == null) ? 0 : getField24().hashCode());
        result = prime * result + ((getField25() == null) ? 0 : getField25().hashCode());
        result = prime * result + ((getField26() == null) ? 0 : getField26().hashCode());
        result = prime * result + ((getField27() == null) ? 0 : getField27().hashCode());
        result = prime * result + ((getField28() == null) ? 0 : getField28().hashCode());
        result = prime * result + ((getField29() == null) ? 0 : getField29().hashCode());
        result = prime * result + ((getField30() == null) ? 0 : getField30().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getSline() == null) ? 0 : getSline().hashCode());
        result = prime * result + ((getRecordnum() == null) ? 0 : getRecordnum().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getShopitemid() == null) ? 0 : getShopitemid().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        result = prime * result + ((getErrorinfo() == null) ? 0 : getErrorinfo().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getMoneyrate() == null) ? 0 : getMoneyrate().hashCode());
        result = prime * result + ((getOriginsellprice() == null) ? 0 : getOriginsellprice().hashCode());
        result = prime * result + ((getRmbsellprice() == null) ? 0 : getRmbsellprice().hashCode());
        result = prime * result + ((getRmbamount() == null) ? 0 : getRmbamount().hashCode());
        result = prime * result + ((getOriginexpress() == null) ? 0 : getOriginexpress().hashCode());
        result = prime * result + ((getRmbexpressmoney() == null) ? 0 : getRmbexpressmoney().hashCode());
        result = prime * result + ((getInsurancemoney() == null) ? 0 : getInsurancemoney().hashCode());
        result = prime * result + ((getRmbinsurancemoney() == null) ? 0 : getRmbinsurancemoney().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getEbaycustomeraddress() == null) ? 0 : getEbaycustomeraddress().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", customertel=").append(customertel);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customeraddress1=").append(customeraddress1);
        sb.append(", customeraddress2=").append(customeraddress2);
        sb.append(", customercity=").append(customercity);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", productid=").append(productid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", sellpricestr=").append(sellpricestr);
        sb.append(", expressstr=").append(expressstr);
        sb.append(", paypalid=").append(paypalid);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", variationdetails=").append(variationdetails);
        sb.append(", productname=").append(productname);
        sb.append(", itemid=").append(itemid);
        sb.append(", insurance=").append(insurance);
        sb.append(", postageservice=").append(postageservice);
        sb.append(", field23=").append(field23);
        sb.append(", field24=").append(field24);
        sb.append(", field25=").append(field25);
        sb.append(", field26=").append(field26);
        sb.append(", field27=").append(field27);
        sb.append(", field28=").append(field28);
        sb.append(", field29=").append(field29);
        sb.append(", field30=").append(field30);
        sb.append(", groupid=").append(groupid);
        sb.append(", sline=").append(sline);
        sb.append(", recordnum=").append(recordnum);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", shopitemid=").append(shopitemid);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", errorinfo=").append(errorinfo);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", moneyrate=").append(moneyrate);
        sb.append(", originsellprice=").append(originsellprice);
        sb.append(", rmbsellprice=").append(rmbsellprice);
        sb.append(", rmbamount=").append(rmbamount);
        sb.append(", originexpress=").append(originexpress);
        sb.append(", rmbexpressmoney=").append(rmbexpressmoney);
        sb.append(", insurancemoney=").append(insurancemoney);
        sb.append(", rmbinsurancemoney=").append(rmbinsurancemoney);
        sb.append(", corpid=").append(corpid);
        sb.append(", ebaycustomeraddress=").append(ebaycustomeraddress);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}