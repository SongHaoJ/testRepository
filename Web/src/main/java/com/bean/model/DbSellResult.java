package com.bean.model;

import java.io.Serializable;

public class DbSellResult implements Serializable {
    private String sequenceid;

    private String orderid;

    private String refundtype;

    private String refundnum;

    private String refundmoney;

    private String refundtime;

    private String oper1;

    private String oper2;

    private String retrytype;

    private String retrynum;

    private String retrytradeid;

    private String retrytime;

    private String retrycause;

    private String oper3;

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

    public String getRefundtype() {
        return refundtype;
    }

    public void setRefundtype(String refundtype) {
        this.refundtype = refundtype == null ? null : refundtype.trim();
    }

    public String getRefundnum() {
        return refundnum;
    }

    public void setRefundnum(String refundnum) {
        this.refundnum = refundnum == null ? null : refundnum.trim();
    }

    public String getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(String refundmoney) {
        this.refundmoney = refundmoney == null ? null : refundmoney.trim();
    }

    public String getRefundtime() {
        return refundtime;
    }

    public void setRefundtime(String refundtime) {
        this.refundtime = refundtime == null ? null : refundtime.trim();
    }

    public String getOper1() {
        return oper1;
    }

    public void setOper1(String oper1) {
        this.oper1 = oper1 == null ? null : oper1.trim();
    }

    public String getOper2() {
        return oper2;
    }

    public void setOper2(String oper2) {
        this.oper2 = oper2 == null ? null : oper2.trim();
    }

    public String getRetrytype() {
        return retrytype;
    }

    public void setRetrytype(String retrytype) {
        this.retrytype = retrytype == null ? null : retrytype.trim();
    }

    public String getRetrynum() {
        return retrynum;
    }

    public void setRetrynum(String retrynum) {
        this.retrynum = retrynum == null ? null : retrynum.trim();
    }

    public String getRetrytradeid() {
        return retrytradeid;
    }

    public void setRetrytradeid(String retrytradeid) {
        this.retrytradeid = retrytradeid == null ? null : retrytradeid.trim();
    }

    public String getRetrytime() {
        return retrytime;
    }

    public void setRetrytime(String retrytime) {
        this.retrytime = retrytime == null ? null : retrytime.trim();
    }

    public String getRetrycause() {
        return retrycause;
    }

    public void setRetrycause(String retrycause) {
        this.retrycause = retrycause == null ? null : retrycause.trim();
    }

    public String getOper3() {
        return oper3;
    }

    public void setOper3(String oper3) {
        this.oper3 = oper3 == null ? null : oper3.trim();
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
        DbSellResult other = (DbSellResult) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getRefundtype() == null ? other.getRefundtype() == null : this.getRefundtype().equals(other.getRefundtype()))
            && (this.getRefundnum() == null ? other.getRefundnum() == null : this.getRefundnum().equals(other.getRefundnum()))
            && (this.getRefundmoney() == null ? other.getRefundmoney() == null : this.getRefundmoney().equals(other.getRefundmoney()))
            && (this.getRefundtime() == null ? other.getRefundtime() == null : this.getRefundtime().equals(other.getRefundtime()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getRetrytype() == null ? other.getRetrytype() == null : this.getRetrytype().equals(other.getRetrytype()))
            && (this.getRetrynum() == null ? other.getRetrynum() == null : this.getRetrynum().equals(other.getRetrynum()))
            && (this.getRetrytradeid() == null ? other.getRetrytradeid() == null : this.getRetrytradeid().equals(other.getRetrytradeid()))
            && (this.getRetrytime() == null ? other.getRetrytime() == null : this.getRetrytime().equals(other.getRetrytime()))
            && (this.getRetrycause() == null ? other.getRetrycause() == null : this.getRetrycause().equals(other.getRetrycause()))
            && (this.getOper3() == null ? other.getOper3() == null : this.getOper3().equals(other.getOper3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getRefundtype() == null) ? 0 : getRefundtype().hashCode());
        result = prime * result + ((getRefundnum() == null) ? 0 : getRefundnum().hashCode());
        result = prime * result + ((getRefundmoney() == null) ? 0 : getRefundmoney().hashCode());
        result = prime * result + ((getRefundtime() == null) ? 0 : getRefundtime().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getRetrytype() == null) ? 0 : getRetrytype().hashCode());
        result = prime * result + ((getRetrynum() == null) ? 0 : getRetrynum().hashCode());
        result = prime * result + ((getRetrytradeid() == null) ? 0 : getRetrytradeid().hashCode());
        result = prime * result + ((getRetrytime() == null) ? 0 : getRetrytime().hashCode());
        result = prime * result + ((getRetrycause() == null) ? 0 : getRetrycause().hashCode());
        result = prime * result + ((getOper3() == null) ? 0 : getOper3().hashCode());
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
        sb.append(", refundtype=").append(refundtype);
        sb.append(", refundnum=").append(refundnum);
        sb.append(", refundmoney=").append(refundmoney);
        sb.append(", refundtime=").append(refundtime);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", retrytype=").append(retrytype);
        sb.append(", retrynum=").append(retrynum);
        sb.append(", retrytradeid=").append(retrytradeid);
        sb.append(", retrytime=").append(retrytime);
        sb.append(", retrycause=").append(retrycause);
        sb.append(", oper3=").append(oper3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}