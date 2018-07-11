package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbMultiWarehouse implements Serializable {
    private String sequenceid;

    private String mainsku;

    private String productid;

    private String storageid;

    private String storagename;

    private String openflag;

    private String defaultflag;

    private String oper;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String countryjc;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getMainsku() {
        return mainsku;
    }

    public void setMainsku(String mainsku) {
        this.mainsku = mainsku == null ? null : mainsku.trim();
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

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename == null ? null : storagename.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getDefaultflag() {
        return defaultflag;
    }

    public void setDefaultflag(String defaultflag) {
        this.defaultflag = defaultflag == null ? null : defaultflag.trim();
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

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getCountryjc() {
        return countryjc;
    }

    public void setCountryjc(String countryjc) {
        this.countryjc = countryjc == null ? null : countryjc.trim();
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
        DbMultiWarehouse other = (DbMultiWarehouse) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getMainsku() == null ? other.getMainsku() == null : this.getMainsku().equals(other.getMainsku()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getDefaultflag() == null ? other.getDefaultflag() == null : this.getDefaultflag().equals(other.getDefaultflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getCountryjc() == null ? other.getCountryjc() == null : this.getCountryjc().equals(other.getCountryjc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getMainsku() == null) ? 0 : getMainsku().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getDefaultflag() == null) ? 0 : getDefaultflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getCountryjc() == null) ? 0 : getCountryjc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", mainsku=").append(mainsku);
        sb.append(", productid=").append(productid);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", openflag=").append(openflag);
        sb.append(", defaultflag=").append(defaultflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", countryjc=").append(countryjc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}