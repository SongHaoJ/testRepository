package com.bean.model;

import java.io.Serializable;

public class DbExpressandlable implements Serializable {
    private String expressid;

    private String expressname;

    private String lable;

    private static final long serialVersionUID = 1L;

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname == null ? null : expressname.trim();
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable == null ? null : lable.trim();
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
        DbExpressandlable other = (DbExpressandlable) that;
        return (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getExpressname() == null ? other.getExpressname() == null : this.getExpressname().equals(other.getExpressname()))
            && (this.getLable() == null ? other.getLable() == null : this.getLable().equals(other.getLable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getExpressname() == null) ? 0 : getExpressname().hashCode());
        result = prime * result + ((getLable() == null) ? 0 : getLable().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressid=").append(expressid);
        sb.append(", expressname=").append(expressname);
        sb.append(", lable=").append(lable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}