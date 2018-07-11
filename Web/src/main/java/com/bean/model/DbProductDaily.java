package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbProductDaily implements Serializable {
    private String sequenceid;

    private String yyyy;

    private String yyyymm;

    private String yyyymmdd;

    private BigDecimal allsavenum;

    private BigDecimal allcost;

    private String field1;

    private String field2;

    private String field3;

    private String categoryid;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getYyyy() {
        return yyyy;
    }

    public void setYyyy(String yyyy) {
        this.yyyy = yyyy == null ? null : yyyy.trim();
    }

    public String getYyyymm() {
        return yyyymm;
    }

    public void setYyyymm(String yyyymm) {
        this.yyyymm = yyyymm == null ? null : yyyymm.trim();
    }

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd == null ? null : yyyymmdd.trim();
    }

    public BigDecimal getAllsavenum() {
        return allsavenum;
    }

    public void setAllsavenum(BigDecimal allsavenum) {
        this.allsavenum = allsavenum;
    }

    public BigDecimal getAllcost() {
        return allcost;
    }

    public void setAllcost(BigDecimal allcost) {
        this.allcost = allcost;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
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
        DbProductDaily other = (DbProductDaily) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getYyyy() == null ? other.getYyyy() == null : this.getYyyy().equals(other.getYyyy()))
            && (this.getYyyymm() == null ? other.getYyyymm() == null : this.getYyyymm().equals(other.getYyyymm()))
            && (this.getYyyymmdd() == null ? other.getYyyymmdd() == null : this.getYyyymmdd().equals(other.getYyyymmdd()))
            && (this.getAllsavenum() == null ? other.getAllsavenum() == null : this.getAllsavenum().equals(other.getAllsavenum()))
            && (this.getAllcost() == null ? other.getAllcost() == null : this.getAllcost().equals(other.getAllcost()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getYyyy() == null) ? 0 : getYyyy().hashCode());
        result = prime * result + ((getYyyymm() == null) ? 0 : getYyyymm().hashCode());
        result = prime * result + ((getYyyymmdd() == null) ? 0 : getYyyymmdd().hashCode());
        result = prime * result + ((getAllsavenum() == null) ? 0 : getAllsavenum().hashCode());
        result = prime * result + ((getAllcost() == null) ? 0 : getAllcost().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", yyyy=").append(yyyy);
        sb.append(", yyyymm=").append(yyyymm);
        sb.append(", yyyymmdd=").append(yyyymmdd);
        sb.append(", allsavenum=").append(allsavenum);
        sb.append(", allcost=").append(allcost);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}