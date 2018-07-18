package com.bean.model;

import java.io.Serializable;

public class DbFpxcountry implements Serializable {
    private String sid;

    private String countrycn;

    private String countryen;

    private String openflag;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getCountrycn() {
        return countrycn;
    }

    public void setCountrycn(String countrycn) {
        this.countrycn = countrycn == null ? null : countrycn.trim();
    }

    public String getCountryen() {
        return countryen;
    }

    public void setCountryen(String countryen) {
        this.countryen = countryen == null ? null : countryen.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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
        DbFpxcountry other = (DbFpxcountry) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCountrycn() == null ? other.getCountrycn() == null : this.getCountrycn().equals(other.getCountrycn()))
            && (this.getCountryen() == null ? other.getCountryen() == null : this.getCountryen().equals(other.getCountryen()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCountrycn() == null) ? 0 : getCountrycn().hashCode());
        result = prime * result + ((getCountryen() == null) ? 0 : getCountryen().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", countrycn=").append(countrycn);
        sb.append(", countryen=").append(countryen);
        sb.append(", openflag=").append(openflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}