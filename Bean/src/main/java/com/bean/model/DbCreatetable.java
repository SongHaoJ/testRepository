package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbCreatetable implements Serializable {
    private BigDecimal lastruntime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getLastruntime() {
        return lastruntime;
    }

    public void setLastruntime(BigDecimal lastruntime) {
        this.lastruntime = lastruntime;
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
        DbCreatetable other = (DbCreatetable) that;
        return (this.getLastruntime() == null ? other.getLastruntime() == null : this.getLastruntime().equals(other.getLastruntime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLastruntime() == null) ? 0 : getLastruntime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lastruntime=").append(lastruntime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}