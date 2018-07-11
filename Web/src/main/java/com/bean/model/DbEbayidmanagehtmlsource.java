package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbEbayidmanagehtmlsource implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal ebayidmanageid;

    private BigDecimal sort;

    private String descr;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getEbayidmanageid() {
        return ebayidmanageid;
    }

    public void setEbayidmanageid(BigDecimal ebayidmanageid) {
        this.ebayidmanageid = ebayidmanageid;
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
        DbEbayidmanagehtmlsource other = (DbEbayidmanagehtmlsource) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getEbayidmanageid() == null ? other.getEbayidmanageid() == null : this.getEbayidmanageid().equals(other.getEbayidmanageid()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getEbayidmanageid() == null) ? 0 : getEbayidmanageid().hashCode());
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
        sb.append(", ebayidmanageid=").append(ebayidmanageid);
        sb.append(", sort=").append(sort);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}