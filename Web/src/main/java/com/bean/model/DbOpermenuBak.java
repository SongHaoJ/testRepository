package com.bean.model;

import java.io.Serializable;

public class DbOpermenuBak implements Serializable {
    private String oper;

    private String menuid;

    private static final long serialVersionUID = 1L;

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
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
        DbOpermenuBak other = (DbOpermenuBak) that;
        return (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oper=").append(oper);
        sb.append(", menuid=").append(menuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}