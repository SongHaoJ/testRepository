package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbEbayforexpress implements Serializable {
    private String sequenceid;

    private String oper;

    private String ebayexpresstype;

    private String ebayexpressid;

    private String mabangexpressid;

    private String openflag;

    private Date opertime;

    private String mabangexpresstype;

    private String site;

    private String siteflag;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getEbayexpresstype() {
        return ebayexpresstype;
    }

    public void setEbayexpresstype(String ebayexpresstype) {
        this.ebayexpresstype = ebayexpresstype == null ? null : ebayexpresstype.trim();
    }

    public String getEbayexpressid() {
        return ebayexpressid;
    }

    public void setEbayexpressid(String ebayexpressid) {
        this.ebayexpressid = ebayexpressid == null ? null : ebayexpressid.trim();
    }

    public String getMabangexpressid() {
        return mabangexpressid;
    }

    public void setMabangexpressid(String mabangexpressid) {
        this.mabangexpressid = mabangexpressid == null ? null : mabangexpressid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getMabangexpresstype() {
        return mabangexpresstype;
    }

    public void setMabangexpresstype(String mabangexpresstype) {
        this.mabangexpresstype = mabangexpresstype == null ? null : mabangexpresstype.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getSiteflag() {
        return siteflag;
    }

    public void setSiteflag(String siteflag) {
        this.siteflag = siteflag == null ? null : siteflag.trim();
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
        DbEbayforexpress other = (DbEbayforexpress) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getEbayexpresstype() == null ? other.getEbayexpresstype() == null : this.getEbayexpresstype().equals(other.getEbayexpresstype()))
            && (this.getEbayexpressid() == null ? other.getEbayexpressid() == null : this.getEbayexpressid().equals(other.getEbayexpressid()))
            && (this.getMabangexpressid() == null ? other.getMabangexpressid() == null : this.getMabangexpressid().equals(other.getMabangexpressid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getMabangexpresstype() == null ? other.getMabangexpresstype() == null : this.getMabangexpresstype().equals(other.getMabangexpresstype()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getSiteflag() == null ? other.getSiteflag() == null : this.getSiteflag().equals(other.getSiteflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getEbayexpresstype() == null) ? 0 : getEbayexpresstype().hashCode());
        result = prime * result + ((getEbayexpressid() == null) ? 0 : getEbayexpressid().hashCode());
        result = prime * result + ((getMabangexpressid() == null) ? 0 : getMabangexpressid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getMabangexpresstype() == null) ? 0 : getMabangexpresstype().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getSiteflag() == null) ? 0 : getSiteflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", oper=").append(oper);
        sb.append(", ebayexpresstype=").append(ebayexpresstype);
        sb.append(", ebayexpressid=").append(ebayexpressid);
        sb.append(", mabangexpressid=").append(mabangexpressid);
        sb.append(", openflag=").append(openflag);
        sb.append(", opertime=").append(opertime);
        sb.append(", mabangexpresstype=").append(mabangexpresstype);
        sb.append(", site=").append(site);
        sb.append(", siteflag=").append(siteflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}