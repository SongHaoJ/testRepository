package com.bean.model;

import java.io.Serializable;

public class DbWytinsurancetype implements Serializable {
    private String insurancetype;

    private String name;

    private String categoryid;

    private String expressid;

    private static final long serialVersionUID = 1L;

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype == null ? null : insurancetype.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
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
        DbWytinsurancetype other = (DbWytinsurancetype) that;
        return (this.getInsurancetype() == null ? other.getInsurancetype() == null : this.getInsurancetype().equals(other.getInsurancetype()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInsurancetype() == null) ? 0 : getInsurancetype().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", insurancetype=").append(insurancetype);
        sb.append(", name=").append(name);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", expressid=").append(expressid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}