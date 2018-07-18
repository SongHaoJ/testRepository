package com.bean.model;

import java.io.Serializable;

public class DbBirdproduct implements Serializable {
    private String sid;

    private String birdname;

    private String mabangsku;

    private String birdsku;

    private String mabangname;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getBirdname() {
        return birdname;
    }

    public void setBirdname(String birdname) {
        this.birdname = birdname == null ? null : birdname.trim();
    }

    public String getMabangsku() {
        return mabangsku;
    }

    public void setMabangsku(String mabangsku) {
        this.mabangsku = mabangsku == null ? null : mabangsku.trim();
    }

    public String getBirdsku() {
        return birdsku;
    }

    public void setBirdsku(String birdsku) {
        this.birdsku = birdsku == null ? null : birdsku.trim();
    }

    public String getMabangname() {
        return mabangname;
    }

    public void setMabangname(String mabangname) {
        this.mabangname = mabangname == null ? null : mabangname.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbBirdproduct other = (DbBirdproduct) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getBirdname() == null ? other.getBirdname() == null : this.getBirdname().equals(other.getBirdname()))
            && (this.getMabangsku() == null ? other.getMabangsku() == null : this.getMabangsku().equals(other.getMabangsku()))
            && (this.getBirdsku() == null ? other.getBirdsku() == null : this.getBirdsku().equals(other.getBirdsku()))
            && (this.getMabangname() == null ? other.getMabangname() == null : this.getMabangname().equals(other.getMabangname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getBirdname() == null) ? 0 : getBirdname().hashCode());
        result = prime * result + ((getMabangsku() == null) ? 0 : getMabangsku().hashCode());
        result = prime * result + ((getBirdsku() == null) ? 0 : getBirdsku().hashCode());
        result = prime * result + ((getMabangname() == null) ? 0 : getMabangname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", birdname=").append(birdname);
        sb.append(", mabangsku=").append(mabangsku);
        sb.append(", birdsku=").append(birdsku);
        sb.append(", mabangname=").append(mabangname);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}