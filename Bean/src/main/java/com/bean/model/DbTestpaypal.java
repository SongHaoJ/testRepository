package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbTestpaypal implements Serializable {
    private String sid;

    private Short flag;

    private BigDecimal totalmoney;

    private BigDecimal refundmoney;

    private BigDecimal feemoney;

    private Date opertime;

    private String status;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public BigDecimal getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(BigDecimal refundmoney) {
        this.refundmoney = refundmoney;
    }

    public BigDecimal getFeemoney() {
        return feemoney;
    }

    public void setFeemoney(BigDecimal feemoney) {
        this.feemoney = feemoney;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        DbTestpaypal other = (DbTestpaypal) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getRefundmoney() == null ? other.getRefundmoney() == null : this.getRefundmoney().equals(other.getRefundmoney()))
            && (this.getFeemoney() == null ? other.getFeemoney() == null : this.getFeemoney().equals(other.getFeemoney()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getRefundmoney() == null) ? 0 : getRefundmoney().hashCode());
        result = prime * result + ((getFeemoney() == null) ? 0 : getFeemoney().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", flag=").append(flag);
        sb.append(", totalmoney=").append(totalmoney);
        sb.append(", refundmoney=").append(refundmoney);
        sb.append(", feemoney=").append(feemoney);
        sb.append(", opertime=").append(opertime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}