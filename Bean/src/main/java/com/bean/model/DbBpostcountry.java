package com.bean.model;

import java.io.Serializable;

public class DbBpostcountry implements Serializable {
    private String sid;

    private String name;

    private String simple;

    private String expresstype;

    private String openflag;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
        this.simple = simple == null ? null : simple.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
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
        DbBpostcountry other = (DbBpostcountry) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSimple() == null ? other.getSimple() == null : this.getSimple().equals(other.getSimple()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSimple() == null) ? 0 : getSimple().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", simple=").append(simple);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", openflag=").append(openflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}