package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbItemidspc implements Serializable {
    private String sid;

    private String itemid;

    private String sku;

    private BigDecimal hitcount;

    private String title;

    private String site;

    private BigDecimal sellprice;

    private BigDecimal flag;

    private String url;

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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getHitcount() {
        return hitcount;
    }

    public void setHitcount(BigDecimal hitcount) {
        this.hitcount = hitcount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        DbItemidspc other = (DbItemidspc) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getHitcount() == null ? other.getHitcount() == null : this.getHitcount().equals(other.getHitcount()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getHitcount() == null) ? 0 : getHitcount().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
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
        sb.append(", sku=").append(sku);
        sb.append(", hitcount=").append(hitcount);
        sb.append(", title=").append(title);
        sb.append(", site=").append(site);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", flag=").append(flag);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}