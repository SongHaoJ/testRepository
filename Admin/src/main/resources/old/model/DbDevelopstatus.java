package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbDevelopstatus implements Serializable {
    private BigDecimal statusid;

    private BigDecimal sortby;

    private String flag;

    private String status;

    private static final long serialVersionUID = 1L;

    public BigDecimal getStatusid() {
        return statusid;
    }

    public void setStatusid(BigDecimal statusid) {
        this.statusid = statusid;
    }

    public BigDecimal getSortby() {
        return sortby;
    }

    public void setSortby(BigDecimal sortby) {
        this.sortby = sortby;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        DbDevelopstatus other = (DbDevelopstatus) that;
        return (this.getStatusid() == null ? other.getStatusid() == null : this.getStatusid().equals(other.getStatusid()))
            && (this.getSortby() == null ? other.getSortby() == null : this.getSortby().equals(other.getSortby()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStatusid() == null) ? 0 : getStatusid().hashCode());
        result = prime * result + ((getSortby() == null) ? 0 : getSortby().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statusid=").append(statusid);
        sb.append(", sortby=").append(sortby);
        sb.append(", flag=").append(flag);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}