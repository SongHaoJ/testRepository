package com.bean.model;

import java.io.Serializable;

public class DbDefaultMenufunc implements Serializable {
    private String classid;

    private String funid;

    private static final long serialVersionUID = 1L;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getFunid() {
        return funid;
    }

    public void setFunid(String funid) {
        this.funid = funid == null ? null : funid.trim();
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
        DbDefaultMenufunc other = (DbDefaultMenufunc) that;
        return (this.getClassid() == null ? other.getClassid() == null : this.getClassid().equals(other.getClassid()))
            && (this.getFunid() == null ? other.getFunid() == null : this.getFunid().equals(other.getFunid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassid() == null) ? 0 : getClassid().hashCode());
        result = prime * result + ((getFunid() == null) ? 0 : getFunid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classid=").append(classid);
        sb.append(", funid=").append(funid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}