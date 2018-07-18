package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbModifylocationTemp implements Serializable {
    private String sequenceid;

    private String productid;

    private String locationname;

    private Date createdate;

    private String filed1;

    private String filed2;

    private String filed3;

    private BigDecimal filed4;

    private BigDecimal filed5;

    private Date filed6;

    private String storageid;

    private String storagename;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3 == null ? null : filed3.trim();
    }

    public BigDecimal getFiled4() {
        return filed4;
    }

    public void setFiled4(BigDecimal filed4) {
        this.filed4 = filed4;
    }

    public BigDecimal getFiled5() {
        return filed5;
    }

    public void setFiled5(BigDecimal filed5) {
        this.filed5 = filed5;
    }

    public Date getFiled6() {
        return filed6;
    }

    public void setFiled6(Date filed6) {
        this.filed6 = filed6;
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
        DbModifylocationTemp other = (DbModifylocationTemp) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getLocationname() == null ? other.getLocationname() == null : this.getLocationname().equals(other.getLocationname()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getFiled6() == null ? other.getFiled6() == null : this.getFiled6().equals(other.getFiled6()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getLocationname() == null) ? 0 : getLocationname().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getFiled6() == null) ? 0 : getFiled6().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", productid=").append(productid);
        sb.append(", locationname=").append(locationname);
        sb.append(", createdate=").append(createdate);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", filed4=").append(filed4);
        sb.append(", filed5=").append(filed5);
        sb.append(", filed6=").append(filed6);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}