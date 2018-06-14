package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbShippinglocation implements Serializable {
    private BigDecimal sid;

    private BigDecimal shippingserviceid;

    private String shipingtolocation;

    private Short flag;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public BigDecimal getShippingserviceid() {
        return shippingserviceid;
    }

    public void setShippingserviceid(BigDecimal shippingserviceid) {
        this.shippingserviceid = shippingserviceid;
    }

    public String getShipingtolocation() {
        return shipingtolocation;
    }

    public void setShipingtolocation(String shipingtolocation) {
        this.shipingtolocation = shipingtolocation == null ? null : shipingtolocation.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
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
        DbShippinglocation other = (DbShippinglocation) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getShippingserviceid() == null ? other.getShippingserviceid() == null : this.getShippingserviceid().equals(other.getShippingserviceid()))
            && (this.getShipingtolocation() == null ? other.getShipingtolocation() == null : this.getShipingtolocation().equals(other.getShipingtolocation()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getShippingserviceid() == null) ? 0 : getShippingserviceid().hashCode());
        result = prime * result + ((getShipingtolocation() == null) ? 0 : getShipingtolocation().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", shippingserviceid=").append(shippingserviceid);
        sb.append(", shipingtolocation=").append(shipingtolocation);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}