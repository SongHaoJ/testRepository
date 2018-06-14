package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbShoppingitemdevelop implements Serializable {
    private BigDecimal itemid;

    private String sku;

    private static final long serialVersionUID = 1L;

    public BigDecimal getItemid() {
        return itemid;
    }

    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
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
        DbShoppingitemdevelop other = (DbShoppingitemdevelop) that;
        return (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemid=").append(itemid);
        sb.append(", sku=").append(sku);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}