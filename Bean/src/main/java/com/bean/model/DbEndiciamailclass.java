package com.bean.model;

import java.io.Serializable;

public class DbEndiciamailclass implements Serializable {
    private String dbclass;

    private static final long serialVersionUID = 1L;

    public String getDbclass() {
        return dbclass;
    }

    public void setDbclass(String dbclass) {
        this.dbclass = dbclass == null ? null : dbclass.trim();
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
        return (this.getDbclass() == null ? other.getDbclass() == null : this.getDbclass().equals(other.getDbclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDbclass() == null) ? 0 : getDbclass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dbclass=").append(dbclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}