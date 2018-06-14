package com.bean.model;

import java.io.Serializable;

public class DbCountry implements Serializable {
    private String countryid;

    private String countryname;

    private String countrynameen;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

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

    public String getCountrynameen() {
        return countrynameen;
    }

    public void setCountrynameen(String countrynameen) {
        this.countrynameen = countrynameen == null ? null : countrynameen.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
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
        DbCountry other = (DbCountry) that;
        return (this.getCountryid() == null ? other.getCountryid() == null : this.getCountryid().equals(other.getCountryid()))
            && (this.getCountryname() == null ? other.getCountryname() == null : this.getCountryname().equals(other.getCountryname()))
            && (this.getCountrynameen() == null ? other.getCountrynameen() == null : this.getCountrynameen().equals(other.getCountrynameen()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryid() == null) ? 0 : getCountryid().hashCode());
        result = prime * result + ((getCountryname() == null) ? 0 : getCountryname().hashCode());
        result = prime * result + ((getCountrynameen() == null) ? 0 : getCountrynameen().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countryid=").append(countryid);
        sb.append(", countryname=").append(countryname);
        sb.append(", countrynameen=").append(countrynameen);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}