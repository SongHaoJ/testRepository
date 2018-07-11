package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPrinteubTemp implements Serializable {
    private String sequenceuid;

    private String sendername;

    private String senderdist;

    private String sendercity;

    private String senderprovince;

    private String senderzip;

    private String sendertel;

    private String customername;

    private String customeraddress;

    private String customercity;

    private String customercountry;

    private String customerzip;

    private String customertel;

    private String countryflag;

    private String categoryname;

    private String categoryenglish;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private String customerprovince;

    private BigDecimal moneyask;

    private BigDecimal moneyexpressask;

    private Date ordertime;

    private BigDecimal orderweight;

    private String senderadress;

    private String sellinfo;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String customermail;

    private String customerfax;

    private String shoptypeid;

    private String payid;

    private String expresstype;

    private String postageservice;

    private String packagingname;

    private String oper1;

    private String storage;

    private String tradeid;

    private static final long serialVersionUID = 1L;

    public String getSequenceuid() {
        return sequenceuid;
    }

    public void setSequenceuid(String sequenceuid) {
        this.sequenceuid = sequenceuid == null ? null : sequenceuid.trim();
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername == null ? null : sendername.trim();
    }

    public String getSenderdist() {
        return senderdist;
    }

    public void setSenderdist(String senderdist) {
        this.senderdist = senderdist == null ? null : senderdist.trim();
    }

    public String getSendercity() {
        return sendercity;
    }

    public void setSendercity(String sendercity) {
        this.sendercity = sendercity == null ? null : sendercity.trim();
    }

    public String getSenderprovince() {
        return senderprovince;
    }

    public void setSenderprovince(String senderprovince) {
        this.senderprovince = senderprovince == null ? null : senderprovince.trim();
    }

    public String getSenderzip() {
        return senderzip;
    }

    public void setSenderzip(String senderzip) {
        this.senderzip = senderzip == null ? null : senderzip.trim();
    }

    public String getSendertel() {
        return sendertel;
    }

    public void setSendertel(String sendertel) {
        this.sendertel = sendertel == null ? null : sendertel.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity == null ? null : customercity.trim();
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getCustomerzip() {
        return customerzip;
    }

    public void setCustomerzip(String customerzip) {
        this.customerzip = customerzip == null ? null : customerzip.trim();
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel == null ? null : customertel.trim();
    }

    public String getCountryflag() {
        return countryflag;
    }

    public void setCountryflag(String countryflag) {
        this.countryflag = countryflag == null ? null : countryflag.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getCategoryenglish() {
        return categoryenglish;
    }

    public void setCategoryenglish(String categoryenglish) {
        this.categoryenglish = categoryenglish == null ? null : categoryenglish.trim();
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public String getCustomerprovince() {
        return customerprovince;
    }

    public void setCustomerprovince(String customerprovince) {
        this.customerprovince = customerprovince == null ? null : customerprovince.trim();
    }

    public BigDecimal getMoneyask() {
        return moneyask;
    }

    public void setMoneyask(BigDecimal moneyask) {
        this.moneyask = moneyask;
    }

    public BigDecimal getMoneyexpressask() {
        return moneyexpressask;
    }

    public void setMoneyexpressask(BigDecimal moneyexpressask) {
        this.moneyexpressask = moneyexpressask;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public BigDecimal getOrderweight() {
        return orderweight;
    }

    public void setOrderweight(BigDecimal orderweight) {
        this.orderweight = orderweight;
    }

    public String getSenderadress() {
        return senderadress;
    }

    public void setSenderadress(String senderadress) {
        this.senderadress = senderadress == null ? null : senderadress.trim();
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

    public String getCustomermail() {
        return customermail;
    }

    public void setCustomermail(String customermail) {
        this.customermail = customermail == null ? null : customermail.trim();
    }

    public String getCustomerfax() {
        return customerfax;
    }

    public void setCustomerfax(String customerfax) {
        this.customerfax = customerfax == null ? null : customerfax.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
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

    public String getPostageservice() {
        return postageservice;
    }

    public void setPostageservice(String postageservice) {
        this.postageservice = postageservice == null ? null : postageservice.trim();
    }

    public String getPackagingname() {
        return packagingname;
    }

    public void setPackagingname(String packagingname) {
        this.packagingname = packagingname == null ? null : packagingname.trim();
    }

    public String getOper1() {
        return oper1;
    }

    public void setOper1(String oper1) {
        this.oper1 = oper1 == null ? null : oper1.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
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
        DbPrinteubTemp other = (DbPrinteubTemp) that;
        return (this.getSequenceuid() == null ? other.getSequenceuid() == null : this.getSequenceuid().equals(other.getSequenceuid()))
            && (this.getSendername() == null ? other.getSendername() == null : this.getSendername().equals(other.getSendername()))
            && (this.getSenderdist() == null ? other.getSenderdist() == null : this.getSenderdist().equals(other.getSenderdist()))
            && (this.getSendercity() == null ? other.getSendercity() == null : this.getSendercity().equals(other.getSendercity()))
            && (this.getSenderprovince() == null ? other.getSenderprovince() == null : this.getSenderprovince().equals(other.getSenderprovince()))
            && (this.getSenderzip() == null ? other.getSenderzip() == null : this.getSenderzip().equals(other.getSenderzip()))
            && (this.getSendertel() == null ? other.getSendertel() == null : this.getSendertel().equals(other.getSendertel()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomerzip() == null ? other.getCustomerzip() == null : this.getCustomerzip().equals(other.getCustomerzip()))
            && (this.getCustomertel() == null ? other.getCustomertel() == null : this.getCustomertel().equals(other.getCustomertel()))
            && (this.getCountryflag() == null ? other.getCountryflag() == null : this.getCountryflag().equals(other.getCountryflag()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getCategoryenglish() == null ? other.getCategoryenglish() == null : this.getCategoryenglish().equals(other.getCategoryenglish()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getMoneyask() == null ? other.getMoneyask() == null : this.getMoneyask().equals(other.getMoneyask()))
            && (this.getMoneyexpressask() == null ? other.getMoneyexpressask() == null : this.getMoneyexpressask().equals(other.getMoneyexpressask()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getOrderweight() == null ? other.getOrderweight() == null : this.getOrderweight().equals(other.getOrderweight()))
            && (this.getSenderadress() == null ? other.getSenderadress() == null : this.getSenderadress().equals(other.getSenderadress()))
            && (this.getSellinfo() == null ? other.getSellinfo() == null : this.getSellinfo().equals(other.getSellinfo()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getCustomermail() == null ? other.getCustomermail() == null : this.getCustomermail().equals(other.getCustomermail()))
            && (this.getCustomerfax() == null ? other.getCustomerfax() == null : this.getCustomerfax().equals(other.getCustomerfax()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getPayid() == null ? other.getPayid() == null : this.getPayid().equals(other.getPayid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getPostageservice() == null ? other.getPostageservice() == null : this.getPostageservice().equals(other.getPostageservice()))
            && (this.getPackagingname() == null ? other.getPackagingname() == null : this.getPackagingname().equals(other.getPackagingname()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceuid() == null) ? 0 : getSequenceuid().hashCode());
        result = prime * result + ((getSendername() == null) ? 0 : getSendername().hashCode());
        result = prime * result + ((getSenderdist() == null) ? 0 : getSenderdist().hashCode());
        result = prime * result + ((getSendercity() == null) ? 0 : getSendercity().hashCode());
        result = prime * result + ((getSenderprovince() == null) ? 0 : getSenderprovince().hashCode());
        result = prime * result + ((getSenderzip() == null) ? 0 : getSenderzip().hashCode());
        result = prime * result + ((getSendertel() == null) ? 0 : getSendertel().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomerzip() == null) ? 0 : getCustomerzip().hashCode());
        result = prime * result + ((getCustomertel() == null) ? 0 : getCustomertel().hashCode());
        result = prime * result + ((getCountryflag() == null) ? 0 : getCountryflag().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getCategoryenglish() == null) ? 0 : getCategoryenglish().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getMoneyask() == null) ? 0 : getMoneyask().hashCode());
        result = prime * result + ((getMoneyexpressask() == null) ? 0 : getMoneyexpressask().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getOrderweight() == null) ? 0 : getOrderweight().hashCode());
        result = prime * result + ((getSenderadress() == null) ? 0 : getSenderadress().hashCode());
        result = prime * result + ((getSellinfo() == null) ? 0 : getSellinfo().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getCustomermail() == null) ? 0 : getCustomermail().hashCode());
        result = prime * result + ((getCustomerfax() == null) ? 0 : getCustomerfax().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getPayid() == null) ? 0 : getPayid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getPostageservice() == null) ? 0 : getPostageservice().hashCode());
        result = prime * result + ((getPackagingname() == null) ? 0 : getPackagingname().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceuid=").append(sequenceuid);
        sb.append(", sendername=").append(sendername);
        sb.append(", senderdist=").append(senderdist);
        sb.append(", sendercity=").append(sendercity);
        sb.append(", senderprovince=").append(senderprovince);
        sb.append(", senderzip=").append(senderzip);
        sb.append(", sendertel=").append(sendertel);
        sb.append(", customername=").append(customername);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", customercity=").append(customercity);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customerzip=").append(customerzip);
        sb.append(", customertel=").append(customertel);
        sb.append(", countryflag=").append(countryflag);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", categoryenglish=").append(categoryenglish);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", moneyask=").append(moneyask);
        sb.append(", moneyexpressask=").append(moneyexpressask);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", orderweight=").append(orderweight);
        sb.append(", senderadress=").append(senderadress);
        sb.append(", sellinfo=").append(sellinfo);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", customermail=").append(customermail);
        sb.append(", customerfax=").append(customerfax);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", payid=").append(payid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", postageservice=").append(postageservice);
        sb.append(", packagingname=").append(packagingname);
        sb.append(", oper1=").append(oper1);
        sb.append(", storage=").append(storage);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}