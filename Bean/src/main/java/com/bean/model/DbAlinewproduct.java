package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbAlinewproduct implements Serializable {
    private String aliitemid;

    private String productid;

    private String flag;

    private Date downtime;

    private Date updatetime;

    private String shopid;

    private String groupid;

    private static final long serialVersionUID = 1L;

    public String getAliitemid() {
        return aliitemid;
    }

    public void setAliitemid(String aliitemid) {
        this.aliitemid = aliitemid == null ? null : aliitemid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getDowntime() {
        return downtime;
    }

    public void setDowntime(Date downtime) {
        this.downtime = downtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
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
        DbAlinewproduct other = (DbAlinewproduct) that;
        return (this.getAliitemid() == null ? other.getAliitemid() == null : this.getAliitemid().equals(other.getAliitemid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getDowntime() == null ? other.getDowntime() == null : this.getDowntime().equals(other.getDowntime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAliitemid() == null) ? 0 : getAliitemid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getDowntime() == null) ? 0 : getDowntime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aliitemid=").append(aliitemid);
        sb.append(", productid=").append(productid);
        sb.append(", flag=").append(flag);
        sb.append(", downtime=").append(downtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", shopid=").append(shopid);
        sb.append(", groupid=").append(groupid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}