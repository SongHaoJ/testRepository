package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchasepaymentlog implements Serializable {
    private String sid;

    private String oper;

    private String content;

    private BigDecimal paymoney;

    private BigDecimal paymentid;

    private BigDecimal detailid;

    private String paytype;

    private Date opertime;

    private String opertype;

    private BigDecimal moneytotal;

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

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public BigDecimal getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public BigDecimal getDetailid() {
        return detailid;
    }

    public void setDetailid(BigDecimal detailid) {
        this.detailid = detailid;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype == null ? null : opertype.trim();
    }

    public BigDecimal getMoneytotal() {
        return moneytotal;
    }

    public void setMoneytotal(BigDecimal moneytotal) {
        this.moneytotal = moneytotal;
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
        DbPurchasepaymentlog other = (DbPurchasepaymentlog) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPaymoney() == null ? other.getPaymoney() == null : this.getPaymoney().equals(other.getPaymoney()))
            && (this.getPaymentid() == null ? other.getPaymentid() == null : this.getPaymentid().equals(other.getPaymentid()))
            && (this.getDetailid() == null ? other.getDetailid() == null : this.getDetailid().equals(other.getDetailid()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getMoneytotal() == null ? other.getMoneytotal() == null : this.getMoneytotal().equals(other.getMoneytotal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPaymoney() == null) ? 0 : getPaymoney().hashCode());
        result = prime * result + ((getPaymentid() == null) ? 0 : getPaymentid().hashCode());
        result = prime * result + ((getDetailid() == null) ? 0 : getDetailid().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getMoneytotal() == null) ? 0 : getMoneytotal().hashCode());
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
        sb.append(", paymoney=").append(paymoney);
        sb.append(", paymentid=").append(paymentid);
        sb.append(", detailid=").append(detailid);
        sb.append(", paytype=").append(paytype);
        sb.append(", opertime=").append(opertime);
        sb.append(", opertype=").append(opertype);
        sb.append(", moneytotal=").append(moneytotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}