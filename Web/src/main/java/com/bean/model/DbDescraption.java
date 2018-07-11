package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbDescraption implements Serializable {
    private BigDecimal sid;

    private String productcontent;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getProductcontent() {
        return productcontent;
    }

    public void setProductcontent(String productcontent) {
        this.productcontent = productcontent == null ? null : productcontent.trim();
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
        DbDescraption other = (DbDescraption) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getProductcontent() == null ? other.getProductcontent() == null : this.getProductcontent().equals(other.getProductcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getProductcontent() == null) ? 0 : getProductcontent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", productcontent=").append(productcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}