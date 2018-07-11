package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbDevelopaccount implements Serializable {
    private Long id;

    private String name;

    private String clentid;

    private String appsecretkey;

    private Long openflag;

    private String shopids;

    private String platfrom;

    private Date createtime;

    private Date updatetime;

    private String devid;

    private String runame;

    private String url;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClentid() {
        return clentid;
    }

    public void setClentid(String clentid) {
        this.clentid = clentid == null ? null : clentid.trim();
    }

    public String getAppsecretkey() {
        return appsecretkey;
    }

    public void setAppsecretkey(String appsecretkey) {
        this.appsecretkey = appsecretkey == null ? null : appsecretkey.trim();
    }

    public Long getOpenflag() {
        return openflag;
    }

    public void setOpenflag(Long openflag) {
        this.openflag = openflag;
    }

    public String getShopids() {
        return shopids;
    }

    public void setShopids(String shopids) {
        this.shopids = shopids == null ? null : shopids.trim();
    }

    public String getPlatfrom() {
        return platfrom;
    }

    public void setPlatfrom(String platfrom) {
        this.platfrom = platfrom == null ? null : platfrom.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid == null ? null : devid.trim();
    }

    public String getRuname() {
        return runame;
    }

    public void setRuname(String runame) {
        this.runame = runame == null ? null : runame.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        DbDevelopaccount other = (DbDevelopaccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getClentid() == null ? other.getClentid() == null : this.getClentid().equals(other.getClentid()))
            && (this.getAppsecretkey() == null ? other.getAppsecretkey() == null : this.getAppsecretkey().equals(other.getAppsecretkey()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getShopids() == null ? other.getShopids() == null : this.getShopids().equals(other.getShopids()))
            && (this.getPlatfrom() == null ? other.getPlatfrom() == null : this.getPlatfrom().equals(other.getPlatfrom()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getDevid() == null ? other.getDevid() == null : this.getDevid().equals(other.getDevid()))
            && (this.getRuname() == null ? other.getRuname() == null : this.getRuname().equals(other.getRuname()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getClentid() == null) ? 0 : getClentid().hashCode());
        result = prime * result + ((getAppsecretkey() == null) ? 0 : getAppsecretkey().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getShopids() == null) ? 0 : getShopids().hashCode());
        result = prime * result + ((getPlatfrom() == null) ? 0 : getPlatfrom().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getDevid() == null) ? 0 : getDevid().hashCode());
        result = prime * result + ((getRuname() == null) ? 0 : getRuname().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", clentid=").append(clentid);
        sb.append(", appsecretkey=").append(appsecretkey);
        sb.append(", openflag=").append(openflag);
        sb.append(", shopids=").append(shopids);
        sb.append(", platfrom=").append(platfrom);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", devid=").append(devid);
        sb.append(", runame=").append(runame);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}