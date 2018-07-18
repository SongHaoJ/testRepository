package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductinfo implements Serializable {
    private String skuid;

    private String itemid;

    private String sku;

    private String sonsku;

    private String categoryid;

    private String producttype;

    private BigDecimal weight;

    private String attributeid;

    private String attributename;

    private Date createtime;

    private Date modefiedtime;

    private static final long serialVersionUID = 1L;

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid == null ? null : skuid.trim();
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

    public String getSonsku() {
        return sonsku;
    }

    public void setSonsku(String sonsku) {
        this.sonsku = sonsku == null ? null : sonsku.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(String attributeid) {
        this.attributeid = attributeid == null ? null : attributeid.trim();
    }

    public String getAttributename() {
        return attributename;
    }

    public void setAttributename(String attributename) {
        this.attributename = attributename == null ? null : attributename.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModefiedtime() {
        return modefiedtime;
    }

    public void setModefiedtime(Date modefiedtime) {
        this.modefiedtime = modefiedtime;
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
        DbProductinfo other = (DbProductinfo) that;
        return (this.getSkuid() == null ? other.getSkuid() == null : this.getSkuid().equals(other.getSkuid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getSonsku() == null ? other.getSonsku() == null : this.getSonsku().equals(other.getSonsku()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getProducttype() == null ? other.getProducttype() == null : this.getProducttype().equals(other.getProducttype()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getAttributeid() == null ? other.getAttributeid() == null : this.getAttributeid().equals(other.getAttributeid()))
            && (this.getAttributename() == null ? other.getAttributename() == null : this.getAttributename().equals(other.getAttributename()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModefiedtime() == null ? other.getModefiedtime() == null : this.getModefiedtime().equals(other.getModefiedtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSkuid() == null) ? 0 : getSkuid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getSonsku() == null) ? 0 : getSonsku().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getProducttype() == null) ? 0 : getProducttype().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getAttributeid() == null) ? 0 : getAttributeid().hashCode());
        result = prime * result + ((getAttributename() == null) ? 0 : getAttributename().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModefiedtime() == null) ? 0 : getModefiedtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuid=").append(skuid);
        sb.append(", itemid=").append(itemid);
        sb.append(", sku=").append(sku);
        sb.append(", sonsku=").append(sonsku);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", producttype=").append(producttype);
        sb.append(", weight=").append(weight);
        sb.append(", attributeid=").append(attributeid);
        sb.append(", attributename=").append(attributename);
        sb.append(", createtime=").append(createtime);
        sb.append(", modefiedtime=").append(modefiedtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}