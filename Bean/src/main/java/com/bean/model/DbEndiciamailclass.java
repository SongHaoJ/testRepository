package com.bean.model;

import java.io.Serializable;

public class DbEndiciamailclass implements Serializable {
    private String dbClass;

    private static final long serialVersionUID = 1L;

    public String getDbClass() {
        return dbClass;
    }

    public void setDbClass(String dbClass) {
        this.dbClass = dbClass == null ? null : dbClass.trim();
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
        DbEndiciamailclass other = (DbEndiciamailclass) that;
        return (this.getDbClass() == null ? other.getDbClass() == null : this.getDbClass().equals(other.getDbClass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDbClass() == null) ? 0 : getDbClass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dbClass=").append(dbClass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}