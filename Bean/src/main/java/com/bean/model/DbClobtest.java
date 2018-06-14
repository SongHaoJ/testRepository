package com.bean.model;

import java.io.Serializable;

public class DbClobtest implements Serializable {
    private String cid;

    private String clobvalue;

    private static final long serialVersionUID = 1L;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getClobvalue() {
        return clobvalue;
    }

    public void setClobvalue(String clobvalue) {
        this.clobvalue = clobvalue == null ? null : clobvalue.trim();
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
        DbClobtest other = (DbClobtest) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getClobvalue() == null ? other.getClobvalue() == null : this.getClobvalue().equals(other.getClobvalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getClobvalue() == null) ? 0 : getClobvalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", clobvalue=").append(clobvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}