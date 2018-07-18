package com.bean.model;

import java.io.Serializable;

public class DbCkycountry implements Serializable {
    private String namecn;

    private String nameen;

    private String namejc;

    private static final long serialVersionUID = 1L;

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }

    public String getNamejc() {
        return namejc;
    }

    public void setNamejc(String namejc) {
        this.namejc = namejc == null ? null : namejc.trim();
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
        DbCkycountry other = (DbCkycountry) that;
        return (this.getNamecn() == null ? other.getNamecn() == null : this.getNamecn().equals(other.getNamecn()))
            && (this.getNameen() == null ? other.getNameen() == null : this.getNameen().equals(other.getNameen()))
            && (this.getNamejc() == null ? other.getNamejc() == null : this.getNamejc().equals(other.getNamejc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNamecn() == null) ? 0 : getNamecn().hashCode());
        result = prime * result + ((getNameen() == null) ? 0 : getNameen().hashCode());
        result = prime * result + ((getNamejc() == null) ? 0 : getNamejc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", namecn=").append(namecn);
        sb.append(", nameen=").append(nameen);
        sb.append(", namejc=").append(namejc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}