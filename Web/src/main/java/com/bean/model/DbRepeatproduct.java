package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbRepeatproduct implements Serializable {
    private BigDecimal sequenceid;

    private String title;

    private String salsemoney;

    private String publisnum;

    private String changerate;

    private String priceavg;

    private String offer;

    private BigDecimal topsalsenum;

    private BigDecimal topsalsemoney;

    private BigDecimal openflag;

    private String oper;

    private Date opertime;

    private BigDecimal corpid;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSalsemoney() {
        return salsemoney;
    }

    public void setSalsemoney(String salsemoney) {
        this.salsemoney = salsemoney == null ? null : salsemoney.trim();
    }

    public String getPublisnum() {
        return publisnum;
    }

    public void setPublisnum(String publisnum) {
        this.publisnum = publisnum == null ? null : publisnum.trim();
    }

    public String getChangerate() {
        return changerate;
    }

    public void setChangerate(String changerate) {
        this.changerate = changerate == null ? null : changerate.trim();
    }

    public String getPriceavg() {
        return priceavg;
    }

    public void setPriceavg(String priceavg) {
        this.priceavg = priceavg == null ? null : priceavg.trim();
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer == null ? null : offer.trim();
    }

    public BigDecimal getTopsalsenum() {
        return topsalsenum;
    }

    public void setTopsalsenum(BigDecimal topsalsenum) {
        this.topsalsenum = topsalsenum;
    }

    public BigDecimal getTopsalsemoney() {
        return topsalsemoney;
    }

    public void setTopsalsemoney(BigDecimal topsalsemoney) {
        this.topsalsemoney = topsalsemoney;
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
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

    public BigDecimal getCorpid() {
        return corpid;
    }

    public void setCorpid(BigDecimal corpid) {
        this.corpid = corpid;
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
        DbRepeatproduct other = (DbRepeatproduct) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSalsemoney() == null ? other.getSalsemoney() == null : this.getSalsemoney().equals(other.getSalsemoney()))
            && (this.getPublisnum() == null ? other.getPublisnum() == null : this.getPublisnum().equals(other.getPublisnum()))
            && (this.getChangerate() == null ? other.getChangerate() == null : this.getChangerate().equals(other.getChangerate()))
            && (this.getPriceavg() == null ? other.getPriceavg() == null : this.getPriceavg().equals(other.getPriceavg()))
            && (this.getOffer() == null ? other.getOffer() == null : this.getOffer().equals(other.getOffer()))
            && (this.getTopsalsenum() == null ? other.getTopsalsenum() == null : this.getTopsalsenum().equals(other.getTopsalsenum()))
            && (this.getTopsalsemoney() == null ? other.getTopsalsemoney() == null : this.getTopsalsemoney().equals(other.getTopsalsemoney()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSalsemoney() == null) ? 0 : getSalsemoney().hashCode());
        result = prime * result + ((getPublisnum() == null) ? 0 : getPublisnum().hashCode());
        result = prime * result + ((getChangerate() == null) ? 0 : getChangerate().hashCode());
        result = prime * result + ((getPriceavg() == null) ? 0 : getPriceavg().hashCode());
        result = prime * result + ((getOffer() == null) ? 0 : getOffer().hashCode());
        result = prime * result + ((getTopsalsenum() == null) ? 0 : getTopsalsenum().hashCode());
        result = prime * result + ((getTopsalsemoney() == null) ? 0 : getTopsalsemoney().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", title=").append(title);
        sb.append(", salsemoney=").append(salsemoney);
        sb.append(", publisnum=").append(publisnum);
        sb.append(", changerate=").append(changerate);
        sb.append(", priceavg=").append(priceavg);
        sb.append(", offer=").append(offer);
        sb.append(", topsalsenum=").append(topsalsenum);
        sb.append(", topsalsemoney=").append(topsalsemoney);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}