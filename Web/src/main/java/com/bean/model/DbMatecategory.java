package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbMatecategory implements Serializable {
    private BigDecimal sid;

    private String categroyid;

    private String categroyname;

    private String ebaycategoryid;

    private String ebaycategoryname;

    private String templetid;

    private BigDecimal flag;

    private String site;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getCategroyid() {
        return categroyid;
    }

    public void setCategroyid(String categroyid) {
        this.categroyid = categroyid == null ? null : categroyid.trim();
    }

    public String getCategroyname() {
        return categroyname;
    }

    public void setCategroyname(String categroyname) {
        this.categroyname = categroyname == null ? null : categroyname.trim();
    }

    public String getEbaycategoryid() {
        return ebaycategoryid;
    }

    public void setEbaycategoryid(String ebaycategoryid) {
        this.ebaycategoryid = ebaycategoryid == null ? null : ebaycategoryid.trim();
    }

    public String getEbaycategoryname() {
        return ebaycategoryname;
    }

    public void setEbaycategoryname(String ebaycategoryname) {
        this.ebaycategoryname = ebaycategoryname == null ? null : ebaycategoryname.trim();
    }

    public String getTempletid() {
        return templetid;
    }

    public void setTempletid(String templetid) {
        this.templetid = templetid == null ? null : templetid.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
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
        DbMatecategory other = (DbMatecategory) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCategroyid() == null ? other.getCategroyid() == null : this.getCategroyid().equals(other.getCategroyid()))
            && (this.getCategroyname() == null ? other.getCategroyname() == null : this.getCategroyname().equals(other.getCategroyname()))
            && (this.getEbaycategoryid() == null ? other.getEbaycategoryid() == null : this.getEbaycategoryid().equals(other.getEbaycategoryid()))
            && (this.getEbaycategoryname() == null ? other.getEbaycategoryname() == null : this.getEbaycategoryname().equals(other.getEbaycategoryname()))
            && (this.getTempletid() == null ? other.getTempletid() == null : this.getTempletid().equals(other.getTempletid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCategroyid() == null) ? 0 : getCategroyid().hashCode());
        result = prime * result + ((getCategroyname() == null) ? 0 : getCategroyname().hashCode());
        result = prime * result + ((getEbaycategoryid() == null) ? 0 : getEbaycategoryid().hashCode());
        result = prime * result + ((getEbaycategoryname() == null) ? 0 : getEbaycategoryname().hashCode());
        result = prime * result + ((getTempletid() == null) ? 0 : getTempletid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", categroyid=").append(categroyid);
        sb.append(", categroyname=").append(categroyname);
        sb.append(", ebaycategoryid=").append(ebaycategoryid);
        sb.append(", ebaycategoryname=").append(ebaycategoryname);
        sb.append(", templetid=").append(templetid);
        sb.append(", flag=").append(flag);
        sb.append(", site=").append(site);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}