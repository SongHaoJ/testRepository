package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSellforshop implements Serializable {
    private BigDecimal sequenceid;

    private String sellsku;

    private String shopid;

    private String shopname;

    private String openflag;

    private String oper;

    private Date opertime;

    private String corpid;

    private String selluserid;

    private String ebayshopid;

    private String ebayshopname;

    private BigDecimal sort;

    private String descr;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getSellsku() {
        return sellsku;
    }

    public void setSellsku(String sellsku) {
        this.sellsku = sellsku == null ? null : sellsku.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getSelluserid() {
        return selluserid;
    }

    public void setSelluserid(String selluserid) {
        this.selluserid = selluserid == null ? null : selluserid.trim();
    }

    public String getEbayshopid() {
        return ebayshopid;
    }

    public void setEbayshopid(String ebayshopid) {
        this.ebayshopid = ebayshopid == null ? null : ebayshopid.trim();
    }

    public String getEbayshopname() {
        return ebayshopname;
    }

    public void setEbayshopname(String ebayshopname) {
        this.ebayshopname = ebayshopname == null ? null : ebayshopname.trim();
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbSellforshop other = (DbSellforshop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSellsku() == null ? other.getSellsku() == null : this.getSellsku().equals(other.getSellsku()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getSelluserid() == null ? other.getSelluserid() == null : this.getSelluserid().equals(other.getSelluserid()))
            && (this.getEbayshopid() == null ? other.getEbayshopid() == null : this.getEbayshopid().equals(other.getEbayshopid()))
            && (this.getEbayshopname() == null ? other.getEbayshopname() == null : this.getEbayshopname().equals(other.getEbayshopname()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSellsku() == null) ? 0 : getSellsku().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getSelluserid() == null) ? 0 : getSelluserid().hashCode());
        result = prime * result + ((getEbayshopid() == null) ? 0 : getEbayshopid().hashCode());
        result = prime * result + ((getEbayshopname() == null) ? 0 : getEbayshopname().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", sellsku=").append(sellsku);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", selluserid=").append(selluserid);
        sb.append(", ebayshopid=").append(ebayshopid);
        sb.append(", ebayshopname=").append(ebayshopname);
        sb.append(", sort=").append(sort);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}