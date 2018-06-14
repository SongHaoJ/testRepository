package com.bean.model;

import java.io.Serializable;

public class DbItemspe implements Serializable {
    private String sid;

    private String ebayitemid;

    private String flag;

    private String ebayitemspe;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getEbayitemspe() {
        return ebayitemspe;
    }

    public void setEbayitemspe(String ebayitemspe) {
        this.ebayitemspe = ebayitemspe == null ? null : ebayitemspe.trim();
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
        DbItemspe other = (DbItemspe) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getEbayitemspe() == null ? other.getEbayitemspe() == null : this.getEbayitemspe().equals(other.getEbayitemspe()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getEbayitemspe() == null) ? 0 : getEbayitemspe().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", flag=").append(flag);
        sb.append(", ebayitemspe=").append(ebayitemspe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}