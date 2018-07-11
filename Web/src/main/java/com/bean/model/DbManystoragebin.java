package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbManystoragebin implements Serializable {
    private String sequenceid;

    private String productid;

    private String storageid;

    private Date createtime;

    private String createoper;

    private Date opertime;

    private String oper;

    private String openflag;

    private String corpid;

    private String name;

    private String storagebinflag;

    private String mainsku;

    private String productname;

    private String storagename;

    private String descr;

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

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStoragebinflag() {
        return storagebinflag;
    }

    public void setStoragebinflag(String storagebinflag) {
        this.storagebinflag = storagebinflag == null ? null : storagebinflag.trim();
    }

    public String getMainsku() {
        return mainsku;
    }

    public void setMainsku(String mainsku) {
        this.mainsku = mainsku == null ? null : mainsku.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename == null ? null : storagename.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbManystoragebin other = (DbManystoragebin) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStoragebinflag() == null ? other.getStoragebinflag() == null : this.getStoragebinflag().equals(other.getStoragebinflag()))
            && (this.getMainsku() == null ? other.getMainsku() == null : this.getMainsku().equals(other.getMainsku()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStoragebinflag() == null) ? 0 : getStoragebinflag().hashCode());
        result = prime * result + ((getMainsku() == null) ? 0 : getMainsku().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
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
        sb.append(", storageid=").append(storageid);
        sb.append(", createtime=").append(createtime);
        sb.append(", createoper=").append(createoper);
        sb.append(", opertime=").append(opertime);
        sb.append(", oper=").append(oper);
        sb.append(", openflag=").append(openflag);
        sb.append(", corpid=").append(corpid);
        sb.append(", name=").append(name);
        sb.append(", storagebinflag=").append(storagebinflag);
        sb.append(", mainsku=").append(mainsku);
        sb.append(", productname=").append(productname);
        sb.append(", storagename=").append(storagename);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}