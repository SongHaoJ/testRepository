package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalculatconfig implements Serializable {
    private BigDecimal id;

    private BigDecimal paypalrateb;

    private String oper;

    private BigDecimal finalvaluefeerate;

    private BigDecimal position;

    private BigDecimal publishfee;

    private Date opertime;

    private String site;

    private BigDecimal paypalratel;

    private BigDecimal extrafeel;

    private BigDecimal extrafeeb;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getPaypalrateb() {
        return paypalrateb;
    }

    public void setPaypalrateb(BigDecimal paypalrateb) {
        this.paypalrateb = paypalrateb;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getFinalvaluefeerate() {
        return finalvaluefeerate;
    }

    public void setFinalvaluefeerate(BigDecimal finalvaluefeerate) {
        this.finalvaluefeerate = finalvaluefeerate;
    }

    public BigDecimal getPosition() {
        return position;
    }

    public void setPosition(BigDecimal position) {
        this.position = position;
    }

    public BigDecimal getPublishfee() {
        return publishfee;
    }

    public void setPublishfee(BigDecimal publishfee) {
        this.publishfee = publishfee;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public BigDecimal getPaypalratel() {
        return paypalratel;
    }

    public void setPaypalratel(BigDecimal paypalratel) {
        this.paypalratel = paypalratel;
    }

    public BigDecimal getExtrafeel() {
        return extrafeel;
    }

    public void setExtrafeel(BigDecimal extrafeel) {
        this.extrafeel = extrafeel;
    }

    public BigDecimal getExtrafeeb() {
        return extrafeeb;
    }

    public void setExtrafeeb(BigDecimal extrafeeb) {
        this.extrafeeb = extrafeeb;
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
        DbCalculatconfig other = (DbCalculatconfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPaypalrateb() == null ? other.getPaypalrateb() == null : this.getPaypalrateb().equals(other.getPaypalrateb()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getFinalvaluefeerate() == null ? other.getFinalvaluefeerate() == null : this.getFinalvaluefeerate().equals(other.getFinalvaluefeerate()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getPublishfee() == null ? other.getPublishfee() == null : this.getPublishfee().equals(other.getPublishfee()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getPaypalratel() == null ? other.getPaypalratel() == null : this.getPaypalratel().equals(other.getPaypalratel()))
            && (this.getExtrafeel() == null ? other.getExtrafeel() == null : this.getExtrafeel().equals(other.getExtrafeel()))
            && (this.getExtrafeeb() == null ? other.getExtrafeeb() == null : this.getExtrafeeb().equals(other.getExtrafeeb()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPaypalrateb() == null) ? 0 : getPaypalrateb().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getFinalvaluefeerate() == null) ? 0 : getFinalvaluefeerate().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getPublishfee() == null) ? 0 : getPublishfee().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getPaypalratel() == null) ? 0 : getPaypalratel().hashCode());
        result = prime * result + ((getExtrafeel() == null) ? 0 : getExtrafeel().hashCode());
        result = prime * result + ((getExtrafeeb() == null) ? 0 : getExtrafeeb().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", paypalrateb=").append(paypalrateb);
        sb.append(", oper=").append(oper);
        sb.append(", finalvaluefeerate=").append(finalvaluefeerate);
        sb.append(", position=").append(position);
        sb.append(", publishfee=").append(publishfee);
        sb.append(", opertime=").append(opertime);
        sb.append(", site=").append(site);
        sb.append(", paypalratel=").append(paypalratel);
        sb.append(", extrafeel=").append(extrafeel);
        sb.append(", extrafeeb=").append(extrafeeb);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}