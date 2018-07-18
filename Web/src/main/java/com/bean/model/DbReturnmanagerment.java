package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbReturnmanagerment implements Serializable {
    private BigDecimal sequenceid;

    private String name;

    private BigDecimal replaystatus;

    private BigDecimal openflag;

    private String creatoper;

    private Date creattime;

    private String oper;

    private Date opertime;

    private BigDecimal contentid;

    private String orderid;

    private String messageid;

    private BigDecimal shoptypeid;

    private String customername;

    private String customercountry;

    private String shoptype;

    private String orderstatus;

    private String ordersource;

    private BigDecimal ordertime;

    private String customercountryid;

    private String customercountryen;

    private String content;

    private BigDecimal disposeflag;

    private BigDecimal returnprostatus;

    private BigDecimal returnmoneystatus;

    private String replayorderid;

    private String returndescr;

    private BigDecimal returnflag;

    private BigDecimal actualsavenum;

    private String keywords;

    private String customerid;

    private String customertel;

    private String expressid;

    private Date originordertime;

    private BigDecimal reasonid;

    private String reason;

    private String skuresult;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getReplaystatus() {
        return replaystatus;
    }

    public void setReplaystatus(BigDecimal replaystatus) {
        this.replaystatus = replaystatus;
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public String getCreatoper() {
        return creatoper;
    }

    public void setCreatoper(String creatoper) {
        this.creatoper = creatoper == null ? null : creatoper.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
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

    public BigDecimal getContentid() {
        return contentid;
    }

    public void setContentid(BigDecimal contentid) {
        this.contentid = contentid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public BigDecimal getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(BigDecimal shoptypeid) {
        this.shoptypeid = shoptypeid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public String getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(String ordersource) {
        this.ordersource = ordersource == null ? null : ordersource.trim();
    }

    public BigDecimal getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(BigDecimal ordertime) {
        this.ordertime = ordertime;
    }

    public String getCustomercountryid() {
        return customercountryid;
    }

    public void setCustomercountryid(String customercountryid) {
        this.customercountryid = customercountryid == null ? null : customercountryid.trim();
    }

    public String getCustomercountryen() {
        return customercountryen;
    }

    public void setCustomercountryen(String customercountryen) {
        this.customercountryen = customercountryen == null ? null : customercountryen.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getDisposeflag() {
        return disposeflag;
    }

    public void setDisposeflag(BigDecimal disposeflag) {
        this.disposeflag = disposeflag;
    }

    public BigDecimal getReturnprostatus() {
        return returnprostatus;
    }

    public void setReturnprostatus(BigDecimal returnprostatus) {
        this.returnprostatus = returnprostatus;
    }

    public BigDecimal getReturnmoneystatus() {
        return returnmoneystatus;
    }

    public void setReturnmoneystatus(BigDecimal returnmoneystatus) {
        this.returnmoneystatus = returnmoneystatus;
    }

    public String getReplayorderid() {
        return replayorderid;
    }

    public void setReplayorderid(String replayorderid) {
        this.replayorderid = replayorderid == null ? null : replayorderid.trim();
    }

    public String getReturndescr() {
        return returndescr;
    }

    public void setReturndescr(String returndescr) {
        this.returndescr = returndescr == null ? null : returndescr.trim();
    }

    public BigDecimal getReturnflag() {
        return returnflag;
    }

    public void setReturnflag(BigDecimal returnflag) {
        this.returnflag = returnflag;
    }

    public BigDecimal getActualsavenum() {
        return actualsavenum;
    }

    public void setActualsavenum(BigDecimal actualsavenum) {
        this.actualsavenum = actualsavenum;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel == null ? null : customertel.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public Date getOriginordertime() {
        return originordertime;
    }

    public void setOriginordertime(Date originordertime) {
        this.originordertime = originordertime;
    }

    public BigDecimal getReasonid() {
        return reasonid;
    }

    public void setReasonid(BigDecimal reasonid) {
        this.reasonid = reasonid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getSkuresult() {
        return skuresult;
    }

    public void setSkuresult(String skuresult) {
        this.skuresult = skuresult == null ? null : skuresult.trim();
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
        DbReturnmanagerment other = (DbReturnmanagerment) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getReplaystatus() == null ? other.getReplaystatus() == null : this.getReplaystatus().equals(other.getReplaystatus()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCreatoper() == null ? other.getCreatoper() == null : this.getCreatoper().equals(other.getCreatoper()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getContentid() == null ? other.getContentid() == null : this.getContentid().equals(other.getContentid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getOrdersource() == null ? other.getOrdersource() == null : this.getOrdersource().equals(other.getOrdersource()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getCustomercountryid() == null ? other.getCustomercountryid() == null : this.getCustomercountryid().equals(other.getCustomercountryid()))
            && (this.getCustomercountryen() == null ? other.getCustomercountryen() == null : this.getCustomercountryen().equals(other.getCustomercountryen()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDisposeflag() == null ? other.getDisposeflag() == null : this.getDisposeflag().equals(other.getDisposeflag()))
            && (this.getReturnprostatus() == null ? other.getReturnprostatus() == null : this.getReturnprostatus().equals(other.getReturnprostatus()))
            && (this.getReturnmoneystatus() == null ? other.getReturnmoneystatus() == null : this.getReturnmoneystatus().equals(other.getReturnmoneystatus()))
            && (this.getReplayorderid() == null ? other.getReplayorderid() == null : this.getReplayorderid().equals(other.getReplayorderid()))
            && (this.getReturndescr() == null ? other.getReturndescr() == null : this.getReturndescr().equals(other.getReturndescr()))
            && (this.getReturnflag() == null ? other.getReturnflag() == null : this.getReturnflag().equals(other.getReturnflag()))
            && (this.getActualsavenum() == null ? other.getActualsavenum() == null : this.getActualsavenum().equals(other.getActualsavenum()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomertel() == null ? other.getCustomertel() == null : this.getCustomertel().equals(other.getCustomertel()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getOriginordertime() == null ? other.getOriginordertime() == null : this.getOriginordertime().equals(other.getOriginordertime()))
            && (this.getReasonid() == null ? other.getReasonid() == null : this.getReasonid().equals(other.getReasonid()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getSkuresult() == null ? other.getSkuresult() == null : this.getSkuresult().equals(other.getSkuresult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getReplaystatus() == null) ? 0 : getReplaystatus().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCreatoper() == null) ? 0 : getCreatoper().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getContentid() == null) ? 0 : getContentid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getOrdersource() == null) ? 0 : getOrdersource().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getCustomercountryid() == null) ? 0 : getCustomercountryid().hashCode());
        result = prime * result + ((getCustomercountryen() == null) ? 0 : getCustomercountryen().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDisposeflag() == null) ? 0 : getDisposeflag().hashCode());
        result = prime * result + ((getReturnprostatus() == null) ? 0 : getReturnprostatus().hashCode());
        result = prime * result + ((getReturnmoneystatus() == null) ? 0 : getReturnmoneystatus().hashCode());
        result = prime * result + ((getReplayorderid() == null) ? 0 : getReplayorderid().hashCode());
        result = prime * result + ((getReturndescr() == null) ? 0 : getReturndescr().hashCode());
        result = prime * result + ((getReturnflag() == null) ? 0 : getReturnflag().hashCode());
        result = prime * result + ((getActualsavenum() == null) ? 0 : getActualsavenum().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomertel() == null) ? 0 : getCustomertel().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getOriginordertime() == null) ? 0 : getOriginordertime().hashCode());
        result = prime * result + ((getReasonid() == null) ? 0 : getReasonid().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getSkuresult() == null) ? 0 : getSkuresult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", name=").append(name);
        sb.append(", replaystatus=").append(replaystatus);
        sb.append(", openflag=").append(openflag);
        sb.append(", creatoper=").append(creatoper);
        sb.append(", creattime=").append(creattime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", contentid=").append(contentid);
        sb.append(", orderid=").append(orderid);
        sb.append(", messageid=").append(messageid);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", customername=").append(customername);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", ordersource=").append(ordersource);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", customercountryid=").append(customercountryid);
        sb.append(", customercountryen=").append(customercountryen);
        sb.append(", content=").append(content);
        sb.append(", disposeflag=").append(disposeflag);
        sb.append(", returnprostatus=").append(returnprostatus);
        sb.append(", returnmoneystatus=").append(returnmoneystatus);
        sb.append(", replayorderid=").append(replayorderid);
        sb.append(", returndescr=").append(returndescr);
        sb.append(", returnflag=").append(returnflag);
        sb.append(", actualsavenum=").append(actualsavenum);
        sb.append(", keywords=").append(keywords);
        sb.append(", customerid=").append(customerid);
        sb.append(", customertel=").append(customertel);
        sb.append(", expressid=").append(expressid);
        sb.append(", originordertime=").append(originordertime);
        sb.append(", reasonid=").append(reasonid);
        sb.append(", reason=").append(reason);
        sb.append(", skuresult=").append(skuresult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}