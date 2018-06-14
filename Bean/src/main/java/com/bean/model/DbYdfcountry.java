package com.bean.model;

import java.io.Serializable;

public class DbYdfcountry implements Serializable {
    private String countryid;

    private String countrycode;

    private String cnname;

    private String enname;

    private String enalias;

    private static final long serialVersionUID = 1L;

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid == null ? null : countryid.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getEnalias() {
        return enalias;
    }

    public void setEnalias(String enalias) {
        this.enalias = enalias == null ? null : enalias.trim();
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
        DbYdfcountry other = (DbYdfcountry) that;
        return (this.getCountryid() == null ? other.getCountryid() == null : this.getCountryid().equals(other.getCountryid()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getCnname() == null ? other.getCnname() == null : this.getCnname().equals(other.getCnname()))
            && (this.getEnname() == null ? other.getEnname() == null : this.getEnname().equals(other.getEnname()))
            && (this.getEnalias() == null ? other.getEnalias() == null : this.getEnalias().equals(other.getEnalias()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryid() == null) ? 0 : getCountryid().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getCnname() == null) ? 0 : getCnname().hashCode());
        result = prime * result + ((getEnname() == null) ? 0 : getEnname().hashCode());
        result = prime * result + ((getEnalias() == null) ? 0 : getEnalias().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countryid=").append(countryid);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", cnname=").append(cnname);
        sb.append(", enname=").append(enname);
        sb.append(", enalias=").append(enalias);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}