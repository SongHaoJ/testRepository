package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbBullettype implements Serializable {
    private BigDecimal bullettype;

    private String descr;

    private static final long serialVersionUID = 1L;

    public BigDecimal getBullettype() {
        return bullettype;
    }

    public void setBullettype(BigDecimal bullettype) {
        this.bullettype = bullettype;
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
        DbBullettype other = (DbBullettype) that;
        return (this.getBullettype() == null ? other.getBullettype() == null : this.getBullettype().equals(other.getBullettype()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBullettype() == null) ? 0 : getBullettype().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bullettype=").append(bullettype);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}