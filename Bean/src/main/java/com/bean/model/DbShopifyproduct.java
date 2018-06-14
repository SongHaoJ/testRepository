package com.bean.model;

import java.io.Serializable;

public class DbShopifyproduct implements Serializable {
    private String variantid;

    private String sku;

    private String productid;

    private static final long serialVersionUID = 1L;

    public String getVariantid() {
        return variantid;
    }

    public void setVariantid(String variantid) {
        this.variantid = variantid == null ? null : variantid.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
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
        DbShopifyproduct other = (DbShopifyproduct) that;
        return (this.getVariantid() == null ? other.getVariantid() == null : this.getVariantid().equals(other.getVariantid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVariantid() == null) ? 0 : getVariantid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", variantid=").append(variantid);
        sb.append(", sku=").append(sku);
        sb.append(", productid=").append(productid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}