package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbaybbe implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal ebayidmanageid;

    private String bbenum;

    private String bbepercent;

    private String bbe2;

    private String bbe3;

    private String corpid;

    private String openflag;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getEbayidmanageid() {
        return ebayidmanageid;
    }

    public void setEbayidmanageid(BigDecimal ebayidmanageid) {
        this.ebayidmanageid = ebayidmanageid;
    }

    public String getBbenum() {
        return bbenum;
    }

    public void setBbenum(String bbenum) {
        this.bbenum = bbenum == null ? null : bbenum.trim();
    }

    public String getBbepercent() {
        return bbepercent;
    }

    public void setBbepercent(String bbepercent) {
        this.bbepercent = bbepercent == null ? null : bbepercent.trim();
    }

    public String getBbe2() {
        return bbe2;
    }

    public void setBbe2(String bbe2) {
        this.bbe2 = bbe2 == null ? null : bbe2.trim();
    }

    public String getBbe3() {
        return bbe3;
    }

    public void setBbe3(String bbe3) {
        this.bbe3 = bbe3 == null ? null : bbe3.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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
        DbEbaybbe other = (DbEbaybbe) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getEbayidmanageid() == null ? other.getEbayidmanageid() == null : this.getEbayidmanageid().equals(other.getEbayidmanageid()))
            && (this.getBbenum() == null ? other.getBbenum() == null : this.getBbenum().equals(other.getBbenum()))
            && (this.getBbepercent() == null ? other.getBbepercent() == null : this.getBbepercent().equals(other.getBbepercent()))
            && (this.getBbe2() == null ? other.getBbe2() == null : this.getBbe2().equals(other.getBbe2()))
            && (this.getBbe3() == null ? other.getBbe3() == null : this.getBbe3().equals(other.getBbe3()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getEbayidmanageid() == null) ? 0 : getEbayidmanageid().hashCode());
        result = prime * result + ((getBbenum() == null) ? 0 : getBbenum().hashCode());
        result = prime * result + ((getBbepercent() == null) ? 0 : getBbepercent().hashCode());
        result = prime * result + ((getBbe2() == null) ? 0 : getBbe2().hashCode());
        result = prime * result + ((getBbe3() == null) ? 0 : getBbe3().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
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
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", ebayidmanageid=").append(ebayidmanageid);
        sb.append(", bbenum=").append(bbenum);
        sb.append(", bbepercent=").append(bbepercent);
        sb.append(", bbe2=").append(bbe2);
        sb.append(", bbe3=").append(bbe3);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}