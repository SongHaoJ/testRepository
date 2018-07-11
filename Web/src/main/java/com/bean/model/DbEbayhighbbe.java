package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbayhighbbe implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal ebayidmanageid;

    private String title;

    private BigDecimal itemid;

    private String trademoney;

    private String tradeall;

    private String tradebbe;

    private String bbebili;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getEbayidmanageid() {
        return ebayidmanageid;
    }

    public void setEbayidmanageid(BigDecimal ebayidmanageid) {
        this.ebayidmanageid = ebayidmanageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getItemid() {
        return itemid;
    }

    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    public String getTrademoney() {
        return trademoney;
    }

    public void setTrademoney(String trademoney) {
        this.trademoney = trademoney == null ? null : trademoney.trim();
    }

    public String getTradeall() {
        return tradeall;
    }

    public void setTradeall(String tradeall) {
        this.tradeall = tradeall == null ? null : tradeall.trim();
    }

    public String getTradebbe() {
        return tradebbe;
    }

    public void setTradebbe(String tradebbe) {
        this.tradebbe = tradebbe == null ? null : tradebbe.trim();
    }

    public String getBbebili() {
        return bbebili;
    }

    public void setBbebili(String bbebili) {
        this.bbebili = bbebili == null ? null : bbebili.trim();
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
        DbEbayhighbbe other = (DbEbayhighbbe) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getEbayidmanageid() == null ? other.getEbayidmanageid() == null : this.getEbayidmanageid().equals(other.getEbayidmanageid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getTrademoney() == null ? other.getTrademoney() == null : this.getTrademoney().equals(other.getTrademoney()))
            && (this.getTradeall() == null ? other.getTradeall() == null : this.getTradeall().equals(other.getTradeall()))
            && (this.getTradebbe() == null ? other.getTradebbe() == null : this.getTradebbe().equals(other.getTradebbe()))
            && (this.getBbebili() == null ? other.getBbebili() == null : this.getBbebili().equals(other.getBbebili()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getEbayidmanageid() == null) ? 0 : getEbayidmanageid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getTrademoney() == null) ? 0 : getTrademoney().hashCode());
        result = prime * result + ((getTradeall() == null) ? 0 : getTradeall().hashCode());
        result = prime * result + ((getTradebbe() == null) ? 0 : getTradebbe().hashCode());
        result = prime * result + ((getBbebili() == null) ? 0 : getBbebili().hashCode());
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
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", ebayidmanageid=").append(ebayidmanageid);
        sb.append(", title=").append(title);
        sb.append(", itemid=").append(itemid);
        sb.append(", trademoney=").append(trademoney);
        sb.append(", tradeall=").append(tradeall);
        sb.append(", tradebbe=").append(tradebbe);
        sb.append(", bbebili=").append(bbebili);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}