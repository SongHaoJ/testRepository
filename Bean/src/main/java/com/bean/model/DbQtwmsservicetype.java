package com.bean.model;

import java.io.Serializable;

public class DbQtwmsservicetype implements Serializable {
    private String serviceid;

    private String servicename;

    private String servicetype;

    private static final long serialVersionUID = 1L;

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
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
        DbQtwmsservicetype other = (DbQtwmsservicetype) that;
        return (this.getServiceid() == null ? other.getServiceid() == null : this.getServiceid().equals(other.getServiceid()))
            && (this.getServicename() == null ? other.getServicename() == null : this.getServicename().equals(other.getServicename()))
            && (this.getServicetype() == null ? other.getServicetype() == null : this.getServicetype().equals(other.getServicetype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServiceid() == null) ? 0 : getServiceid().hashCode());
        result = prime * result + ((getServicename() == null) ? 0 : getServicename().hashCode());
        result = prime * result + ((getServicetype() == null) ? 0 : getServicetype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceid=").append(serviceid);
        sb.append(", servicename=").append(servicename);
        sb.append(", servicetype=").append(servicetype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}