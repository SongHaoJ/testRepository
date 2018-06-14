package com.bean.model;

import java.io.Serializable;

public class DbProductcontent implements Serializable {
    private String productid;

    private String clobcontent;

    private static final long serialVersionUID = 1L;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getClobcontent() {
        return clobcontent;
    }

    public void setClobcontent(String clobcontent) {
        this.clobcontent = clobcontent == null ? null : clobcontent.trim();
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
        DbProductcontent other = (DbProductcontent) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getClobcontent() == null ? other.getClobcontent() == null : this.getClobcontent().equals(other.getClobcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getClobcontent() == null) ? 0 : getClobcontent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", clobcontent=").append(clobcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}