package com.bean.model;

import java.io.Serializable;

public class DbPrinteub implements Serializable {
    private String state;

    private String country;

    private String eubflag;

    private static final long serialVersionUID = 1L;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getEubflag() {
        return eubflag;
    }

    public void setEubflag(String eubflag) {
        this.eubflag = eubflag == null ? null : eubflag.trim();
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
        DbPrinteub other = (DbPrinteub) that;
        return (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getEubflag() == null ? other.getEubflag() == null : this.getEubflag().equals(other.getEubflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getEubflag() == null) ? 0 : getEubflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", state=").append(state);
        sb.append(", country=").append(country);
        sb.append(", eubflag=").append(eubflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}