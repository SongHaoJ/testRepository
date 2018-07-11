package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSfcuser implements Serializable {
    private String userid;

    private String oper;

    private String corpid;

    private BigDecimal ebayidentify;

    private BigDecimal operflag;

    private Date opertime;

    private String orderstatus;

    private BigDecimal updateflag;

    private String token;

    private String shipperaddress;

    private String shipperaddresstype;

    private String appkey;

    private String shippername;

    private String shipperemail;

    private String shipperzipcode;

    private String shipperphone;

    private String shippercompanyname;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public BigDecimal getEbayidentify() {
        return ebayidentify;
    }

    public void setEbayidentify(BigDecimal ebayidentify) {
        this.ebayidentify = ebayidentify;
    }

    public BigDecimal getOperflag() {
        return operflag;
    }

    public void setOperflag(BigDecimal operflag) {
        this.operflag = operflag;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public BigDecimal getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(BigDecimal updateflag) {
        this.updateflag = updateflag;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getShipperaddress() {
        return shipperaddress;
    }

    public void setShipperaddress(String shipperaddress) {
        this.shipperaddress = shipperaddress == null ? null : shipperaddress.trim();
    }

    public String getShipperaddresstype() {
        return shipperaddresstype;
    }

    public void setShipperaddresstype(String shipperaddresstype) {
        this.shipperaddresstype = shipperaddresstype == null ? null : shipperaddresstype.trim();
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getShippername() {
        return shippername;
    }

    public void setShippername(String shippername) {
        this.shippername = shippername == null ? null : shippername.trim();
    }

    public String getShipperemail() {
        return shipperemail;
    }

    public void setShipperemail(String shipperemail) {
        this.shipperemail = shipperemail == null ? null : shipperemail.trim();
    }

    public String getShipperzipcode() {
        return shipperzipcode;
    }

    public void setShipperzipcode(String shipperzipcode) {
        this.shipperzipcode = shipperzipcode == null ? null : shipperzipcode.trim();
    }

    public String getShipperphone() {
        return shipperphone;
    }

    public void setShipperphone(String shipperphone) {
        this.shipperphone = shipperphone == null ? null : shipperphone.trim();
    }

    public String getShippercompanyname() {
        return shippercompanyname;
    }

    public void setShippercompanyname(String shippercompanyname) {
        this.shippercompanyname = shippercompanyname == null ? null : shippercompanyname.trim();
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
        DbSfcuser other = (DbSfcuser) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getEbayidentify() == null ? other.getEbayidentify() == null : this.getEbayidentify().equals(other.getEbayidentify()))
            && (this.getOperflag() == null ? other.getOperflag() == null : this.getOperflag().equals(other.getOperflag()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getShipperaddress() == null ? other.getShipperaddress() == null : this.getShipperaddress().equals(other.getShipperaddress()))
            && (this.getShipperaddresstype() == null ? other.getShipperaddresstype() == null : this.getShipperaddresstype().equals(other.getShipperaddresstype()))
            && (this.getAppkey() == null ? other.getAppkey() == null : this.getAppkey().equals(other.getAppkey()))
            && (this.getShippername() == null ? other.getShippername() == null : this.getShippername().equals(other.getShippername()))
            && (this.getShipperemail() == null ? other.getShipperemail() == null : this.getShipperemail().equals(other.getShipperemail()))
            && (this.getShipperzipcode() == null ? other.getShipperzipcode() == null : this.getShipperzipcode().equals(other.getShipperzipcode()))
            && (this.getShipperphone() == null ? other.getShipperphone() == null : this.getShipperphone().equals(other.getShipperphone()))
            && (this.getShippercompanyname() == null ? other.getShippercompanyname() == null : this.getShippercompanyname().equals(other.getShippercompanyname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getEbayidentify() == null) ? 0 : getEbayidentify().hashCode());
        result = prime * result + ((getOperflag() == null) ? 0 : getOperflag().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getShipperaddress() == null) ? 0 : getShipperaddress().hashCode());
        result = prime * result + ((getShipperaddresstype() == null) ? 0 : getShipperaddresstype().hashCode());
        result = prime * result + ((getAppkey() == null) ? 0 : getAppkey().hashCode());
        result = prime * result + ((getShippername() == null) ? 0 : getShippername().hashCode());
        result = prime * result + ((getShipperemail() == null) ? 0 : getShipperemail().hashCode());
        result = prime * result + ((getShipperzipcode() == null) ? 0 : getShipperzipcode().hashCode());
        result = prime * result + ((getShipperphone() == null) ? 0 : getShipperphone().hashCode());
        result = prime * result + ((getShippercompanyname() == null) ? 0 : getShippercompanyname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", oper=").append(oper);
        sb.append(", corpid=").append(corpid);
        sb.append(", ebayidentify=").append(ebayidentify);
        sb.append(", operflag=").append(operflag);
        sb.append(", opertime=").append(opertime);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", token=").append(token);
        sb.append(", shipperaddress=").append(shipperaddress);
        sb.append(", shipperaddresstype=").append(shipperaddresstype);
        sb.append(", appkey=").append(appkey);
        sb.append(", shippername=").append(shippername);
        sb.append(", shipperemail=").append(shipperemail);
        sb.append(", shipperzipcode=").append(shipperzipcode);
        sb.append(", shipperphone=").append(shipperphone);
        sb.append(", shippercompanyname=").append(shippercompanyname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}