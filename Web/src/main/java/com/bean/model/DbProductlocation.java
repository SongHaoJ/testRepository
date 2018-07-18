package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbProductlocation implements Serializable {
    private Long id;

    private String productid;

    private String productsku;

    private String productname;

    private String productpic;

    private String storageid;

    private String storagename;

    private String locationnameold;

    private String locationnamenow;

    private Short status;

    private String handleoper;

    private Date handletime;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductsku() {
        return productsku;
    }

    public void setProductsku(String productsku) {
        this.productsku = productsku == null ? null : productsku.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductpic() {
        return productpic;
    }

    public void setProductpic(String productpic) {
        this.productpic = productpic == null ? null : productpic.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename == null ? null : storagename.trim();
    }

    public String getLocationnameold() {
        return locationnameold;
    }

    public void setLocationnameold(String locationnameold) {
        this.locationnameold = locationnameold == null ? null : locationnameold.trim();
    }

    public String getLocationnamenow() {
        return locationnamenow;
    }

    public void setLocationnamenow(String locationnamenow) {
        this.locationnamenow = locationnamenow == null ? null : locationnamenow.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getHandleoper() {
        return handleoper;
    }

    public void setHandleoper(String handleoper) {
        this.handleoper = handleoper == null ? null : handleoper.trim();
    }

    public Date getHandletime() {
        return handletime;
    }

    public void setHandletime(Date handletime) {
        this.handletime = handletime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
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
        DbProductlocation other = (DbProductlocation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductsku() == null ? other.getProductsku() == null : this.getProductsku().equals(other.getProductsku()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getProductpic() == null ? other.getProductpic() == null : this.getProductpic().equals(other.getProductpic()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getLocationnameold() == null ? other.getLocationnameold() == null : this.getLocationnameold().equals(other.getLocationnameold()))
            && (this.getLocationnamenow() == null ? other.getLocationnamenow() == null : this.getLocationnamenow().equals(other.getLocationnamenow()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getHandleoper() == null ? other.getHandleoper() == null : this.getHandleoper().equals(other.getHandleoper()))
            && (this.getHandletime() == null ? other.getHandletime() == null : this.getHandletime().equals(other.getHandletime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductsku() == null) ? 0 : getProductsku().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getProductpic() == null) ? 0 : getProductpic().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getLocationnameold() == null) ? 0 : getLocationnameold().hashCode());
        result = prime * result + ((getLocationnamenow() == null) ? 0 : getLocationnamenow().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getHandleoper() == null) ? 0 : getHandleoper().hashCode());
        result = prime * result + ((getHandletime() == null) ? 0 : getHandletime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productid=").append(productid);
        sb.append(", productsku=").append(productsku);
        sb.append(", productname=").append(productname);
        sb.append(", productpic=").append(productpic);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", locationnameold=").append(locationnameold);
        sb.append(", locationnamenow=").append(locationnamenow);
        sb.append(", status=").append(status);
        sb.append(", handleoper=").append(handleoper);
        sb.append(", handletime=").append(handletime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}