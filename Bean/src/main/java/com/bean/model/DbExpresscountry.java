package com.bean.model;

import java.io.Serializable;

public class DbExpresscountry implements Serializable {
    private String sequenceid;

    private String expressid;

    private String countryid;

    private String countryname;

    private String name;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid == null ? null : countryid.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        DbExpresscountry other = (DbExpresscountry) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getCountryid() == null ? other.getCountryid() == null : this.getCountryid().equals(other.getCountryid()))
            && (this.getCountryname() == null ? other.getCountryname() == null : this.getCountryname().equals(other.getCountryname()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getCountryid() == null) ? 0 : getCountryid().hashCode());
        result = prime * result + ((getCountryname() == null) ? 0 : getCountryname().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", expressid=").append(expressid);
        sb.append(", countryid=").append(countryid);
        sb.append(", countryname=").append(countryname);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}