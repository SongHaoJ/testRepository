package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbExpstoreitem implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal expstoreid;

    private String sku;

    private BigDecimal ordernum;

    private BigDecimal price;

    private String savelog;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getExpstoreid() {
        return expstoreid;
    }

    public void setExpstoreid(BigDecimal expstoreid) {
        this.expstoreid = expstoreid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSavelog() {
        return savelog;
    }

    public void setSavelog(String savelog) {
        this.savelog = savelog == null ? null : savelog.trim();
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
        DbExpstoreitem other = (DbExpstoreitem) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getExpstoreid() == null ? other.getExpstoreid() == null : this.getExpstoreid().equals(other.getExpstoreid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSavelog() == null ? other.getSavelog() == null : this.getSavelog().equals(other.getSavelog()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getExpstoreid() == null) ? 0 : getExpstoreid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSavelog() == null) ? 0 : getSavelog().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", expstoreid=").append(expstoreid);
        sb.append(", sku=").append(sku);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", price=").append(price);
        sb.append(", savelog=").append(savelog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}