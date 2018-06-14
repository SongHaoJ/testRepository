package com.bean.model;

import java.io.Serializable;

public class DbProductanditemid implements Serializable {
    private String sequenceid;

    private String productindexid;

    private String itemid;

    private String enmityid;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getProductindexid() {
        return productindexid;
    }

    public void setProductindexid(String productindexid) {
        this.productindexid = productindexid == null ? null : productindexid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getEnmityid() {
        return enmityid;
    }

    public void setEnmityid(String enmityid) {
        this.enmityid = enmityid == null ? null : enmityid.trim();
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
        DbProductanditemid other = (DbProductanditemid) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductindexid() == null ? other.getProductindexid() == null : this.getProductindexid().equals(other.getProductindexid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getEnmityid() == null ? other.getEnmityid() == null : this.getEnmityid().equals(other.getEnmityid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductindexid() == null) ? 0 : getProductindexid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getEnmityid() == null) ? 0 : getEnmityid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", productindexid=").append(productindexid);
        sb.append(", itemid=").append(itemid);
        sb.append(", enmityid=").append(enmityid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}