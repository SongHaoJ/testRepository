package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProjectsku implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal projectid;

    private String sku;

    private BigDecimal skutype;

    private String sid;

    private Date checktime;

    private BigDecimal checkflag;

    private Date createtime;

    private String imgurl;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getProjectid() {
        return projectid;
    }

    public void setProjectid(BigDecimal projectid) {
        this.projectid = projectid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getSkutype() {
        return skutype;
    }

    public void setSkutype(BigDecimal skutype) {
        this.skutype = skutype;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public BigDecimal getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(BigDecimal checkflag) {
        this.checkflag = checkflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
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
        DbProjectsku other = (DbProjectsku) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProjectid() == null ? other.getProjectid() == null : this.getProjectid().equals(other.getProjectid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getSkutype() == null ? other.getSkutype() == null : this.getSkutype().equals(other.getSkutype()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getImgurl() == null ? other.getImgurl() == null : this.getImgurl().equals(other.getImgurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProjectid() == null) ? 0 : getProjectid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getSkutype() == null) ? 0 : getSkutype().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getImgurl() == null) ? 0 : getImgurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", projectid=").append(projectid);
        sb.append(", sku=").append(sku);
        sb.append(", skutype=").append(skutype);
        sb.append(", sid=").append(sid);
        sb.append(", checktime=").append(checktime);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", createtime=").append(createtime);
        sb.append(", imgurl=").append(imgurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}