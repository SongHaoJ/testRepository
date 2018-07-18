package com.bean.model;

import java.io.Serializable;

public class DbShiptaskOrdertype implements Serializable {
    private Short id;

    private String ordertypeid;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getOrdertypeid() {
        return ordertypeid;
    }

    public void setOrdertypeid(String ordertypeid) {
        this.ordertypeid = ordertypeid == null ? null : ordertypeid.trim();
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
        DbShiptaskOrdertype other = (DbShiptaskOrdertype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdertypeid() == null ? other.getOrdertypeid() == null : this.getOrdertypeid().equals(other.getOrdertypeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdertypeid() == null) ? 0 : getOrdertypeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ordertypeid=").append(ordertypeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}