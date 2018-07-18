package com.bean.model;

import java.io.Serializable;

public class DbSpecialservicecode implements Serializable {
    private String servicecode;

    private String servicegroupcode;

    private String servicename;

    private String chargecodetypecode;

    private static final long serialVersionUID = 1L;

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode == null ? null : servicecode.trim();
    }

    public String getServicegroupcode() {
        return servicegroupcode;
    }

    public void setServicegroupcode(String servicegroupcode) {
        this.servicegroupcode = servicegroupcode == null ? null : servicegroupcode.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public String getChargecodetypecode() {
        return chargecodetypecode;
    }

    public void setChargecodetypecode(String chargecodetypecode) {
        this.chargecodetypecode = chargecodetypecode == null ? null : chargecodetypecode.trim();
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
        DbSpecialservicecode other = (DbSpecialservicecode) that;
        return (this.getServicecode() == null ? other.getServicecode() == null : this.getServicecode().equals(other.getServicecode()))
            && (this.getServicegroupcode() == null ? other.getServicegroupcode() == null : this.getServicegroupcode().equals(other.getServicegroupcode()))
            && (this.getServicename() == null ? other.getServicename() == null : this.getServicename().equals(other.getServicename()))
            && (this.getChargecodetypecode() == null ? other.getChargecodetypecode() == null : this.getChargecodetypecode().equals(other.getChargecodetypecode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServicecode() == null) ? 0 : getServicecode().hashCode());
        result = prime * result + ((getServicegroupcode() == null) ? 0 : getServicegroupcode().hashCode());
        result = prime * result + ((getServicename() == null) ? 0 : getServicename().hashCode());
        result = prime * result + ((getChargecodetypecode() == null) ? 0 : getChargecodetypecode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", servicecode=").append(servicecode);
        sb.append(", servicegroupcode=").append(servicegroupcode);
        sb.append(", servicename=").append(servicename);
        sb.append(", chargecodetypecode=").append(chargecodetypecode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}