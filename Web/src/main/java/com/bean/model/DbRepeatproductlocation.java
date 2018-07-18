package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbRepeatproductlocation implements Serializable {
    private Long id;

    private String productid;

    private String originstorageid;

    private String originstoragename;

    private String originlocationid;

    private String originlocationname;

    private String storageid;

    private String storagename;

    private String locationid;

    private String locationname;

    private Short flag;

    private String error;

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

    public String getOriginstorageid() {
        return originstorageid;
    }

    public void setOriginstorageid(String originstorageid) {
        this.originstorageid = originstorageid == null ? null : originstorageid.trim();
    }

    public String getOriginstoragename() {
        return originstoragename;
    }

    public void setOriginstoragename(String originstoragename) {
        this.originstoragename = originstoragename == null ? null : originstoragename.trim();
    }

    public String getOriginlocationid() {
        return originlocationid;
    }

    public void setOriginlocationid(String originlocationid) {
        this.originlocationid = originlocationid == null ? null : originlocationid.trim();
    }

    public String getOriginlocationname() {
        return originlocationname;
    }

    public void setOriginlocationname(String originlocationname) {
        this.originlocationname = originlocationname == null ? null : originlocationname.trim();
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

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
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
        DbRepeatproductlocation other = (DbRepeatproductlocation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOriginstorageid() == null ? other.getOriginstorageid() == null : this.getOriginstorageid().equals(other.getOriginstorageid()))
            && (this.getOriginstoragename() == null ? other.getOriginstoragename() == null : this.getOriginstoragename().equals(other.getOriginstoragename()))
            && (this.getOriginlocationid() == null ? other.getOriginlocationid() == null : this.getOriginlocationid().equals(other.getOriginlocationid()))
            && (this.getOriginlocationname() == null ? other.getOriginlocationname() == null : this.getOriginlocationname().equals(other.getOriginlocationname()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocationname() == null ? other.getLocationname() == null : this.getLocationname().equals(other.getLocationname()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOriginstorageid() == null) ? 0 : getOriginstorageid().hashCode());
        result = prime * result + ((getOriginstoragename() == null) ? 0 : getOriginstoragename().hashCode());
        result = prime * result + ((getOriginlocationid() == null) ? 0 : getOriginlocationid().hashCode());
        result = prime * result + ((getOriginlocationname() == null) ? 0 : getOriginlocationname().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocationname() == null) ? 0 : getLocationname().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
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
        sb.append(", originstorageid=").append(originstorageid);
        sb.append(", originstoragename=").append(originstoragename);
        sb.append(", originlocationid=").append(originlocationid);
        sb.append(", originlocationname=").append(originlocationname);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", locationid=").append(locationid);
        sb.append(", locationname=").append(locationname);
        sb.append(", flag=").append(flag);
        sb.append(", error=").append(error);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}