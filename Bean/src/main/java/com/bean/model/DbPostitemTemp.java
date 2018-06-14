package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPostitemTemp implements Serializable {
    private String sid;

    private String itemid;

    private String shopid;

    private String shopname;

    private BigDecimal pricetype;

    private String site;

    private BigDecimal price;

    private String sku;

    private BigDecimal flag;

    private String oper;

    private Date opertime;

    private String error;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
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

    public BigDecimal getPricetype() {
        return pricetype;
    }

    public void setPricetype(BigDecimal pricetype) {
        this.pricetype = pricetype;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
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
        DbPostitemTemp other = (DbPostitemTemp) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getPricetype() == null ? other.getPricetype() == null : this.getPricetype().equals(other.getPricetype()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getPricetype() == null) ? 0 : getPricetype().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", itemid=").append(itemid);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", pricetype=").append(pricetype);
        sb.append(", site=").append(site);
        sb.append(", price=").append(price);
        sb.append(", sku=").append(sku);
        sb.append(", flag=").append(flag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}