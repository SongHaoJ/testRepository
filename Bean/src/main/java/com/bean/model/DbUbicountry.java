package com.bean.model;

import java.io.Serializable;

public class DbUbicountry implements Serializable {
    private String id;

    private String countrychina;

    private String countryenglish;

    private String countrycode;

    private String country;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCountrychina() {
        return countrychina;
    }

    public void setCountrychina(String countrychina) {
        this.countrychina = countrychina == null ? null : countrychina.trim();
    }

    public String getCountryenglish() {
        return countryenglish;
    }

    public void setCountryenglish(String countryenglish) {
        this.countryenglish = countryenglish == null ? null : countryenglish.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
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
        DbUbicountry other = (DbUbicountry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCountrychina() == null ? other.getCountrychina() == null : this.getCountrychina().equals(other.getCountrychina()))
            && (this.getCountryenglish() == null ? other.getCountryenglish() == null : this.getCountryenglish().equals(other.getCountryenglish()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCountrychina() == null) ? 0 : getCountrychina().hashCode());
        result = prime * result + ((getCountryenglish() == null) ? 0 : getCountryenglish().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countrychina=").append(countrychina);
        sb.append(", countryenglish=").append(countryenglish);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", country=").append(country);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}