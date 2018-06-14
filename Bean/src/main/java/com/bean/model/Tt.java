package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Tt implements Serializable {
    private BigDecimal id;

    private String t1;

    private String t2;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1 == null ? null : t1.trim();
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2 == null ? null : t2.trim();
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
        Tt other = (Tt) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getT1() == null ? other.getT1() == null : this.getT1().equals(other.getT1()))
            && (this.getT2() == null ? other.getT2() == null : this.getT2().equals(other.getT2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getT1() == null) ? 0 : getT1().hashCode());
        result = prime * result + ((getT2() == null) ? 0 : getT2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", t1=").append(t1);
        sb.append(", t2=").append(t2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}