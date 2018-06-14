package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbOrderlableTransform implements Serializable {
    private Long id;

    private String orderid;

    private Short flag;

    private Short picnum;

    private Date downloadtime;

    private Date pictime;

    private String expresstype;

    private String pdfurl;

    private String paramdata;

    private String error;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Short getPicnum() {
        return picnum;
    }

    public void setPicnum(Short picnum) {
        this.picnum = picnum;
    }

    public Date getDownloadtime() {
        return downloadtime;
    }

    public void setDownloadtime(Date downloadtime) {
        this.downloadtime = downloadtime;
    }

    public Date getPictime() {
        return pictime;
    }

    public void setPictime(Date pictime) {
        this.pictime = pictime;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getPdfurl() {
        return pdfurl;
    }

    public void setPdfurl(String pdfurl) {
        this.pdfurl = pdfurl == null ? null : pdfurl.trim();
    }

    public String getParamdata() {
        return paramdata;
    }

    public void setParamdata(String paramdata) {
        this.paramdata = paramdata == null ? null : paramdata.trim();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
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
        DbOrderlableTransform other = (DbOrderlableTransform) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getPicnum() == null ? other.getPicnum() == null : this.getPicnum().equals(other.getPicnum()))
            && (this.getDownloadtime() == null ? other.getDownloadtime() == null : this.getDownloadtime().equals(other.getDownloadtime()))
            && (this.getPictime() == null ? other.getPictime() == null : this.getPictime().equals(other.getPictime()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getPdfurl() == null ? other.getPdfurl() == null : this.getPdfurl().equals(other.getPdfurl()))
            && (this.getParamdata() == null ? other.getParamdata() == null : this.getParamdata().equals(other.getParamdata()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getPicnum() == null) ? 0 : getPicnum().hashCode());
        result = prime * result + ((getDownloadtime() == null) ? 0 : getDownloadtime().hashCode());
        result = prime * result + ((getPictime() == null) ? 0 : getPictime().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getPdfurl() == null) ? 0 : getPdfurl().hashCode());
        result = prime * result + ((getParamdata() == null) ? 0 : getParamdata().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", flag=").append(flag);
        sb.append(", picnum=").append(picnum);
        sb.append(", downloadtime=").append(downloadtime);
        sb.append(", pictime=").append(pictime);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", pdfurl=").append(pdfurl);
        sb.append(", paramdata=").append(paramdata);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}