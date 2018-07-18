package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchasepaymentdetail implements Serializable {
    private String sid;

    private String oper;

    private String content;

    private BigDecimal moneyactionpay;

    private String manufactureid;

    private BigDecimal paymentid;

    private BigDecimal moneyneedpay;

    private Date opertime;

    private BigDecimal moneynotpay;

    private String payoper;

    private String manufacture;

    private String paynum;

    private String flag;

    private Date paytime;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getMoneyactionpay() {
        return moneyactionpay;
    }

    public void setMoneyactionpay(BigDecimal moneyactionpay) {
        this.moneyactionpay = moneyactionpay;
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public BigDecimal getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public BigDecimal getMoneyneedpay() {
        return moneyneedpay;
    }

    public void setMoneyneedpay(BigDecimal moneyneedpay) {
        this.moneyneedpay = moneyneedpay;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public BigDecimal getMoneynotpay() {
        return moneynotpay;
    }

    public void setMoneynotpay(BigDecimal moneynotpay) {
        this.moneynotpay = moneynotpay;
    }

    public String getPayoper() {
        return payoper;
    }

    public void setPayoper(String payoper) {
        this.payoper = payoper == null ? null : payoper.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum == null ? null : paynum.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
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
        DbPurchasepaymentdetail other = (DbPurchasepaymentdetail) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getMoneyactionpay() == null ? other.getMoneyactionpay() == null : this.getMoneyactionpay().equals(other.getMoneyactionpay()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getPaymentid() == null ? other.getPaymentid() == null : this.getPaymentid().equals(other.getPaymentid()))
            && (this.getMoneyneedpay() == null ? other.getMoneyneedpay() == null : this.getMoneyneedpay().equals(other.getMoneyneedpay()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getMoneynotpay() == null ? other.getMoneynotpay() == null : this.getMoneynotpay().equals(other.getMoneynotpay()))
            && (this.getPayoper() == null ? other.getPayoper() == null : this.getPayoper().equals(other.getPayoper()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getPaynum() == null ? other.getPaynum() == null : this.getPaynum().equals(other.getPaynum()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getMoneyactionpay() == null) ? 0 : getMoneyactionpay().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getPaymentid() == null) ? 0 : getPaymentid().hashCode());
        result = prime * result + ((getMoneyneedpay() == null) ? 0 : getMoneyneedpay().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getMoneynotpay() == null) ? 0 : getMoneynotpay().hashCode());
        result = prime * result + ((getPayoper() == null) ? 0 : getPayoper().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getPaynum() == null) ? 0 : getPaynum().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", oper=").append(oper);
        sb.append(", content=").append(content);
        sb.append(", moneyactionpay=").append(moneyactionpay);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", paymentid=").append(paymentid);
        sb.append(", moneyneedpay=").append(moneyneedpay);
        sb.append(", opertime=").append(opertime);
        sb.append(", moneynotpay=").append(moneynotpay);
        sb.append(", payoper=").append(payoper);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", paynum=").append(paynum);
        sb.append(", flag=").append(flag);
        sb.append(", paytime=").append(paytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}