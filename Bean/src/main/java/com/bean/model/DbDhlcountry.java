package com.bean.model;

import java.io.Serializable;

public class DbDhlcountry implements Serializable {
    private String countrycode;

    private String weightunit;

    private String country;

    private String dimensionalunit;

    private String currencyname;

    private String currencycode;

    private String countrylocationtype;

    private static final long serialVersionUID = 1L;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getWeightunit() {
        return weightunit;
    }

    public void setWeightunit(String weightunit) {
        this.weightunit = weightunit == null ? null : weightunit.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getDimensionalunit() {
        return dimensionalunit;
    }

    public void setDimensionalunit(String dimensionalunit) {
        this.dimensionalunit = dimensionalunit == null ? null : dimensionalunit.trim();
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname == null ? null : currencyname.trim();
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode == null ? null : currencycode.trim();
    }

    public String getCountrylocationtype() {
        return countrylocationtype;
    }

    public void setCountrylocationtype(String countrylocationtype) {
        this.countrylocationtype = countrylocationtype == null ? null : countrylocationtype.trim();
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
        DbDhlcountry other = (DbDhlcountry) that;
        return (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getWeightunit() == null ? other.getWeightunit() == null : this.getWeightunit().equals(other.getWeightunit()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getDimensionalunit() == null ? other.getDimensionalunit() == null : this.getDimensionalunit().equals(other.getDimensionalunit()))
            && (this.getCurrencyname() == null ? other.getCurrencyname() == null : this.getCurrencyname().equals(other.getCurrencyname()))
            && (this.getCurrencycode() == null ? other.getCurrencycode() == null : this.getCurrencycode().equals(other.getCurrencycode()))
            && (this.getCountrylocationtype() == null ? other.getCountrylocationtype() == null : this.getCountrylocationtype().equals(other.getCountrylocationtype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getWeightunit() == null) ? 0 : getWeightunit().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getDimensionalunit() == null) ? 0 : getDimensionalunit().hashCode());
        result = prime * result + ((getCurrencyname() == null) ? 0 : getCurrencyname().hashCode());
        result = prime * result + ((getCurrencycode() == null) ? 0 : getCurrencycode().hashCode());
        result = prime * result + ((getCountrylocationtype() == null) ? 0 : getCountrylocationtype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countrycode=").append(countrycode);
        sb.append(", weightunit=").append(weightunit);
        sb.append(", country=").append(country);
        sb.append(", dimensionalunit=").append(dimensionalunit);
        sb.append(", currencyname=").append(currencyname);
        sb.append(", currencycode=").append(currencycode);
        sb.append(", countrylocationtype=").append(countrylocationtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}