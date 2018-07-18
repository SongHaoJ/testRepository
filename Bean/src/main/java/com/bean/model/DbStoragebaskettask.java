package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbStoragebaskettask implements Serializable {
    private BigDecimal id;

    private String basketid;

    private Short status;

    private String creatoper;

    private Date creattime;

    private String labelingoper;

    private Date labelingtime;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBasketid() {
        return basketid;
    }

    public void setBasketid(String basketid) {
        this.basketid = basketid == null ? null : basketid.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public String getLabelingoper() {
        return labelingoper;
    }

    public void setLabelingoper(String labelingoper) {
        this.labelingoper = labelingoper == null ? null : labelingoper.trim();
    }

    public Date getLabelingtime() {
        return labelingtime;
    }

    public void setLabelingtime(Date labelingtime) {
        this.labelingtime = labelingtime;
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
        DbStoragebaskettask other = (DbStoragebaskettask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBasketid() == null ? other.getBasketid() == null : this.getBasketid().equals(other.getBasketid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatoper() == null ? other.getCreatoper() == null : this.getCreatoper().equals(other.getCreatoper()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getLabelingoper() == null ? other.getLabelingoper() == null : this.getLabelingoper().equals(other.getLabelingoper()))
            && (this.getLabelingtime() == null ? other.getLabelingtime() == null : this.getLabelingtime().equals(other.getLabelingtime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBasketid() == null) ? 0 : getBasketid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatoper() == null) ? 0 : getCreatoper().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getLabelingoper() == null) ? 0 : getLabelingoper().hashCode());
        result = prime * result + ((getLabelingtime() == null) ? 0 : getLabelingtime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", basketid=").append(basketid);
        sb.append(", status=").append(status);
        sb.append(", creatoper=").append(creatoper);
        sb.append(", creattime=").append(creattime);
        sb.append(", labelingoper=").append(labelingoper);
        sb.append(", labelingtime=").append(labelingtime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}