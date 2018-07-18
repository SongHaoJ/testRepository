package com.bean.model;

import java.io.Serializable;

public class DbOpergroup implements Serializable {
    private String oper;

    private String opername;

    private String operimg;

    private Short opergroup;

    private String operstatus;

    private Short operflag;

    private Long sorttime;

    private Short workflag;

    private String storageid;

    private static final long serialVersionUID = 1L;

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername == null ? null : opername.trim();
    }

    public String getOperimg() {
        return operimg;
    }

    public void setOperimg(String operimg) {
        this.operimg = operimg == null ? null : operimg.trim();
    }

    public Short getOpergroup() {
        return opergroup;
    }

    public void setOpergroup(Short opergroup) {
        this.opergroup = opergroup;
    }

    public String getOperstatus() {
        return operstatus;
    }

    public void setOperstatus(String operstatus) {
        this.operstatus = operstatus == null ? null : operstatus.trim();
    }

    public Short getOperflag() {
        return operflag;
    }

    public void setOperflag(Short operflag) {
        this.operflag = operflag;
    }

    public Long getSorttime() {
        return sorttime;
    }

    public void setSorttime(Long sorttime) {
        this.sorttime = sorttime;
    }

    public Short getWorkflag() {
        return workflag;
    }

    public void setWorkflag(Short workflag) {
        this.workflag = workflag;
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
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
        DbOpergroup other = (DbOpergroup) that;
        return (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpername() == null ? other.getOpername() == null : this.getOpername().equals(other.getOpername()))
            && (this.getOperimg() == null ? other.getOperimg() == null : this.getOperimg().equals(other.getOperimg()))
            && (this.getOpergroup() == null ? other.getOpergroup() == null : this.getOpergroup().equals(other.getOpergroup()))
            && (this.getOperstatus() == null ? other.getOperstatus() == null : this.getOperstatus().equals(other.getOperstatus()))
            && (this.getOperflag() == null ? other.getOperflag() == null : this.getOperflag().equals(other.getOperflag()))
            && (this.getSorttime() == null ? other.getSorttime() == null : this.getSorttime().equals(other.getSorttime()))
            && (this.getWorkflag() == null ? other.getWorkflag() == null : this.getWorkflag().equals(other.getWorkflag()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpername() == null) ? 0 : getOpername().hashCode());
        result = prime * result + ((getOperimg() == null) ? 0 : getOperimg().hashCode());
        result = prime * result + ((getOpergroup() == null) ? 0 : getOpergroup().hashCode());
        result = prime * result + ((getOperstatus() == null) ? 0 : getOperstatus().hashCode());
        result = prime * result + ((getOperflag() == null) ? 0 : getOperflag().hashCode());
        result = prime * result + ((getSorttime() == null) ? 0 : getSorttime().hashCode());
        result = prime * result + ((getWorkflag() == null) ? 0 : getWorkflag().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oper=").append(oper);
        sb.append(", opername=").append(opername);
        sb.append(", operimg=").append(operimg);
        sb.append(", opergroup=").append(opergroup);
        sb.append(", operstatus=").append(operstatus);
        sb.append(", operflag=").append(operflag);
        sb.append(", sorttime=").append(sorttime);
        sb.append(", workflag=").append(workflag);
        sb.append(", storageid=").append(storageid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}