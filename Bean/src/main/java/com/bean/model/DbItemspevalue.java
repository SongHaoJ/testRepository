package com.bean.model;

import java.io.Serializable;

public class DbItemspevalue implements Serializable {
    private String sid;

    private String ebayitemspeid;

    private String ebayitemspename;

    private String flag;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getEbayitemspeid() {
        return ebayitemspeid;
    }

    public void setEbayitemspeid(String ebayitemspeid) {
        this.ebayitemspeid = ebayitemspeid == null ? null : ebayitemspeid.trim();
    }

    public String getEbayitemspename() {
        return ebayitemspename;
    }

    public void setEbayitemspename(String ebayitemspename) {
        this.ebayitemspename = ebayitemspename == null ? null : ebayitemspename.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
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
        DbItemspevalue other = (DbItemspevalue) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemspeid() == null ? other.getEbayitemspeid() == null : this.getEbayitemspeid().equals(other.getEbayitemspeid()))
            && (this.getEbayitemspename() == null ? other.getEbayitemspename() == null : this.getEbayitemspename().equals(other.getEbayitemspename()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemspeid() == null) ? 0 : getEbayitemspeid().hashCode());
        result = prime * result + ((getEbayitemspename() == null) ? 0 : getEbayitemspename().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", ebayitemspeid=").append(ebayitemspeid);
        sb.append(", ebayitemspename=").append(ebayitemspename);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}