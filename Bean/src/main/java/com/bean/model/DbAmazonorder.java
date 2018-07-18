package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbAmazonorder implements Serializable {
    private String orderid;

    private String corpid;

    private String groupid;

    private String customerid;

    private String customername;

    private String customertel1;

    private String customertel2;

    private String customeremail;

    private String customerqq;

    private String customermsn;

    private String customercountry;

    private String customerprovince;

    private String customercity;

    private String customeraddress;

    private String customeraddress1;

    private String customeraddress2;

    private String customeraddress3;

    private String customeraddressall;

    private String customerzipcode;

    private String customerfax;

    private String shoptypeid;

    private String shoptype;

    private String salesource;

    private String moneytype;

    private BigDecimal moneyorigin;

    private BigDecimal originmoneytotal;

    private BigDecimal moneytotal;

    private BigDecimal ordernum;

    private Date ordertime;

    private Date uploadtime;

    private Date paytime;

    private String expresstype;

    private String transactionid;

    private BigDecimal moneyexpress;

    private BigDecimal originmoneyexpre;

    private String expressmoneytype;

    private String status;

    private BigDecimal originfinalvaluefee;

    private BigDecimal finalvaluefee;

    private String finalvaluefeemoneytype;

    private Date latestshipdate;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
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

    public String getCustomertel1() {
        return customertel1;
    }

    public void setCustomertel1(String customertel1) {
        this.customertel1 = customertel1 == null ? null : customertel1.trim();
    }

    public String getCustomertel2() {
        return customertel2;
    }

    public void setCustomertel2(String customertel2) {
        this.customertel2 = customertel2 == null ? null : customertel2.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomerqq() {
        return customerqq;
    }

    public void setCustomerqq(String customerqq) {
        this.customerqq = customerqq == null ? null : customerqq.trim();
    }

    public String getCustomermsn() {
        return customermsn;
    }

    public void setCustomermsn(String customermsn) {
        this.customermsn = customermsn == null ? null : customermsn.trim();
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

    public String getCustomeraddress3() {
        return customeraddress3;
    }

    public void setCustomeraddress3(String customeraddress3) {
        this.customeraddress3 = customeraddress3 == null ? null : customeraddress3.trim();
    }

    public String getCustomeraddressall() {
        return customeraddressall;
    }

    public void setCustomeraddressall(String customeraddressall) {
        this.customeraddressall = customeraddressall == null ? null : customeraddressall.trim();
    }

    public String getCustomerzipcode() {
        return customerzipcode;
    }

    public void setCustomerzipcode(String customerzipcode) {
        this.customerzipcode = customerzipcode == null ? null : customerzipcode.trim();
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

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getSalesource() {
        return salesource;
    }

    public void setSalesource(String salesource) {
        this.salesource = salesource == null ? null : salesource.trim();
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public BigDecimal getMoneyorigin() {
        return moneyorigin;
    }

    public void setMoneyorigin(BigDecimal moneyorigin) {
        this.moneyorigin = moneyorigin;
    }

    public BigDecimal getOriginmoneytotal() {
        return originmoneytotal;
    }

    public void setOriginmoneytotal(BigDecimal originmoneytotal) {
        this.originmoneytotal = originmoneytotal;
    }

    public BigDecimal getMoneytotal() {
        return moneytotal;
    }

    public void setMoneytotal(BigDecimal moneytotal) {
        this.moneytotal = moneytotal;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public BigDecimal getMoneyexpress() {
        return moneyexpress;
    }

    public void setMoneyexpress(BigDecimal moneyexpress) {
        this.moneyexpress = moneyexpress;
    }

    public BigDecimal getOriginmoneyexpre() {
        return originmoneyexpre;
    }

    public void setOriginmoneyexpre(BigDecimal originmoneyexpre) {
        this.originmoneyexpre = originmoneyexpre;
    }

    public String getExpressmoneytype() {
        return expressmoneytype;
    }

    public void setExpressmoneytype(String expressmoneytype) {
        this.expressmoneytype = expressmoneytype == null ? null : expressmoneytype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getOriginfinalvaluefee() {
        return originfinalvaluefee;
    }

    public void setOriginfinalvaluefee(BigDecimal originfinalvaluefee) {
        this.originfinalvaluefee = originfinalvaluefee;
    }

    public BigDecimal getFinalvaluefee() {
        return finalvaluefee;
    }

    public void setFinalvaluefee(BigDecimal finalvaluefee) {
        this.finalvaluefee = finalvaluefee;
    }

    public String getFinalvaluefeemoneytype() {
        return finalvaluefeemoneytype;
    }

    public void setFinalvaluefeemoneytype(String finalvaluefeemoneytype) {
        this.finalvaluefeemoneytype = finalvaluefeemoneytype == null ? null : finalvaluefeemoneytype.trim();
    }

    public Date getLatestshipdate() {
        return latestshipdate;
    }

    public void setLatestshipdate(Date latestshipdate) {
        this.latestshipdate = latestshipdate;
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
        DbAmazonorder other = (DbAmazonorder) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomertel1() == null ? other.getCustomertel1() == null : this.getCustomertel1().equals(other.getCustomertel1()))
            && (this.getCustomertel2() == null ? other.getCustomertel2() == null : this.getCustomertel2().equals(other.getCustomertel2()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomerqq() == null ? other.getCustomerqq() == null : this.getCustomerqq().equals(other.getCustomerqq()))
            && (this.getCustomermsn() == null ? other.getCustomermsn() == null : this.getCustomermsn().equals(other.getCustomermsn()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getCustomeraddress1() == null ? other.getCustomeraddress1() == null : this.getCustomeraddress1().equals(other.getCustomeraddress1()))
            && (this.getCustomeraddress2() == null ? other.getCustomeraddress2() == null : this.getCustomeraddress2().equals(other.getCustomeraddress2()))
            && (this.getCustomeraddress3() == null ? other.getCustomeraddress3() == null : this.getCustomeraddress3().equals(other.getCustomeraddress3()))
            && (this.getCustomeraddressall() == null ? other.getCustomeraddressall() == null : this.getCustomeraddressall().equals(other.getCustomeraddressall()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomerfax() == null ? other.getCustomerfax() == null : this.getCustomerfax().equals(other.getCustomerfax()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getMoneyorigin() == null ? other.getMoneyorigin() == null : this.getMoneyorigin().equals(other.getMoneyorigin()))
            && (this.getOriginmoneytotal() == null ? other.getOriginmoneytotal() == null : this.getOriginmoneytotal().equals(other.getOriginmoneytotal()))
            && (this.getMoneytotal() == null ? other.getMoneytotal() == null : this.getMoneytotal().equals(other.getMoneytotal()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getUploadtime() == null ? other.getUploadtime() == null : this.getUploadtime().equals(other.getUploadtime()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getMoneyexpress() == null ? other.getMoneyexpress() == null : this.getMoneyexpress().equals(other.getMoneyexpress()))
            && (this.getOriginmoneyexpre() == null ? other.getOriginmoneyexpre() == null : this.getOriginmoneyexpre().equals(other.getOriginmoneyexpre()))
            && (this.getExpressmoneytype() == null ? other.getExpressmoneytype() == null : this.getExpressmoneytype().equals(other.getExpressmoneytype()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOriginfinalvaluefee() == null ? other.getOriginfinalvaluefee() == null : this.getOriginfinalvaluefee().equals(other.getOriginfinalvaluefee()))
            && (this.getFinalvaluefee() == null ? other.getFinalvaluefee() == null : this.getFinalvaluefee().equals(other.getFinalvaluefee()))
            && (this.getFinalvaluefeemoneytype() == null ? other.getFinalvaluefeemoneytype() == null : this.getFinalvaluefeemoneytype().equals(other.getFinalvaluefeemoneytype()))
            && (this.getLatestshipdate() == null ? other.getLatestshipdate() == null : this.getLatestshipdate().equals(other.getLatestshipdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomertel1() == null) ? 0 : getCustomertel1().hashCode());
        result = prime * result + ((getCustomertel2() == null) ? 0 : getCustomertel2().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomerqq() == null) ? 0 : getCustomerqq().hashCode());
        result = prime * result + ((getCustomermsn() == null) ? 0 : getCustomermsn().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getCustomeraddress1() == null) ? 0 : getCustomeraddress1().hashCode());
        result = prime * result + ((getCustomeraddress2() == null) ? 0 : getCustomeraddress2().hashCode());
        result = prime * result + ((getCustomeraddress3() == null) ? 0 : getCustomeraddress3().hashCode());
        result = prime * result + ((getCustomeraddressall() == null) ? 0 : getCustomeraddressall().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomerfax() == null) ? 0 : getCustomerfax().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getMoneyorigin() == null) ? 0 : getMoneyorigin().hashCode());
        result = prime * result + ((getOriginmoneytotal() == null) ? 0 : getOriginmoneytotal().hashCode());
        result = prime * result + ((getMoneytotal() == null) ? 0 : getMoneytotal().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getUploadtime() == null) ? 0 : getUploadtime().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getMoneyexpress() == null) ? 0 : getMoneyexpress().hashCode());
        result = prime * result + ((getOriginmoneyexpre() == null) ? 0 : getOriginmoneyexpre().hashCode());
        result = prime * result + ((getExpressmoneytype() == null) ? 0 : getExpressmoneytype().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOriginfinalvaluefee() == null) ? 0 : getOriginfinalvaluefee().hashCode());
        result = prime * result + ((getFinalvaluefee() == null) ? 0 : getFinalvaluefee().hashCode());
        result = prime * result + ((getFinalvaluefeemoneytype() == null) ? 0 : getFinalvaluefeemoneytype().hashCode());
        result = prime * result + ((getLatestshipdate() == null) ? 0 : getLatestshipdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", corpid=").append(corpid);
        sb.append(", groupid=").append(groupid);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", customertel1=").append(customertel1);
        sb.append(", customertel2=").append(customertel2);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customerqq=").append(customerqq);
        sb.append(", customermsn=").append(customermsn);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", customeraddress1=").append(customeraddress1);
        sb.append(", customeraddress2=").append(customeraddress2);
        sb.append(", customeraddress3=").append(customeraddress3);
        sb.append(", customeraddressall=").append(customeraddressall);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customerfax=").append(customerfax);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", moneyorigin=").append(moneyorigin);
        sb.append(", originmoneytotal=").append(originmoneytotal);
        sb.append(", moneytotal=").append(moneytotal);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", paytime=").append(paytime);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", moneyexpress=").append(moneyexpress);
        sb.append(", originmoneyexpre=").append(originmoneyexpre);
        sb.append(", expressmoneytype=").append(expressmoneytype);
        sb.append(", status=").append(status);
        sb.append(", originfinalvaluefee=").append(originfinalvaluefee);
        sb.append(", finalvaluefee=").append(finalvaluefee);
        sb.append(", finalvaluefeemoneytype=").append(finalvaluefeemoneytype);
        sb.append(", latestshipdate=").append(latestshipdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}