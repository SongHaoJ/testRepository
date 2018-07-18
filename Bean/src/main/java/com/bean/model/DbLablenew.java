package com.bean.model;

import java.io.Serializable;

public class DbLablenew implements Serializable {
    private String lableid;

    private String lablename;

    private Short lablecount;

    private Short type;

    private static final long serialVersionUID = 1L;

    public String getLableid() {
        return lableid;
    }

    public void setLableid(String lableid) {
        this.lableid = lableid == null ? null : lableid.trim();
    }

    public String getLablename() {
        return lablename;
    }

    public void setLablename(String lablename) {
        this.lablename = lablename == null ? null : lablename.trim();
    }

    public Short getLablecount() {
        return lablecount;
    }

    public void setLablecount(Short lablecount) {
        this.lablecount = lablecount;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
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
        DbLablenew other = (DbLablenew) that;
        return (this.getLableid() == null ? other.getLableid() == null : this.getLableid().equals(other.getLableid()))
            && (this.getLablename() == null ? other.getLablename() == null : this.getLablename().equals(other.getLablename()))
            && (this.getLablecount() == null ? other.getLablecount() == null : this.getLablecount().equals(other.getLablecount()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLableid() == null) ? 0 : getLableid().hashCode());
        result = prime * result + ((getLablename() == null) ? 0 : getLablename().hashCode());
        result = prime * result + ((getLablecount() == null) ? 0 : getLablecount().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lableid=").append(lableid);
        sb.append(", lablename=").append(lablename);
        sb.append(", lablecount=").append(lablecount);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}