package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbException implements Serializable {
    private Long companyid;

    private Long shopid;

    private Long platformid;

    private String platformorderid;

    private String descr;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Long platformid) {
        this.platformid = platformid;
    }

    public String getPlatformorderid() {
        return platformorderid;
    }

    public void setPlatformorderid(String platformorderid) {
        this.platformorderid = platformorderid == null ? null : platformorderid.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
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
        DbException other = (DbException) that;
        return (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getPlatformid() == null ? other.getPlatformid() == null : this.getPlatformid().equals(other.getPlatformid()))
            && (this.getPlatformorderid() == null ? other.getPlatformorderid() == null : this.getPlatformorderid().equals(other.getPlatformorderid()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getPlatformid() == null) ? 0 : getPlatformid().hashCode());
        result = prime * result + ((getPlatformorderid() == null) ? 0 : getPlatformorderid().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyid=").append(companyid);
        sb.append(", shopid=").append(shopid);
        sb.append(", platformid=").append(platformid);
        sb.append(", platformorderid=").append(platformorderid);
        sb.append(", descr=").append(descr);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}