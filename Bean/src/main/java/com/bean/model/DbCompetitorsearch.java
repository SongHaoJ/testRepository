package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCompetitorsearch implements Serializable {
    private BigDecimal sequenceid;

    private String name;

    private String oper;

    private Date opertime;

    private BigDecimal daysellnum;

    private BigDecimal translatrate;

    private Date publishtime;

    private BigDecimal sellpricestart;

    private BigDecimal sellpriceend;

    private BigDecimal roverlapenum;

    private String openflag;

    private BigDecimal corpid;

    private BigDecimal daysellnum2;

    private BigDecimal translatrate2;

    private Date publishtime2;

    private BigDecimal roverlapenum2;

    private String descr;

    private String sqlfilter;

    private String jsonstr;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public BigDecimal getDaysellnum() {
        return daysellnum;
    }

    public void setDaysellnum(BigDecimal daysellnum) {
        this.daysellnum = daysellnum;
    }

    public BigDecimal getTranslatrate() {
        return translatrate;
    }

    public void setTranslatrate(BigDecimal translatrate) {
        this.translatrate = translatrate;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public BigDecimal getSellpricestart() {
        return sellpricestart;
    }

    public void setSellpricestart(BigDecimal sellpricestart) {
        this.sellpricestart = sellpricestart;
    }

    public BigDecimal getSellpriceend() {
        return sellpriceend;
    }

    public void setSellpriceend(BigDecimal sellpriceend) {
        this.sellpriceend = sellpriceend;
    }

    public BigDecimal getRoverlapenum() {
        return roverlapenum;
    }

    public void setRoverlapenum(BigDecimal roverlapenum) {
        this.roverlapenum = roverlapenum;
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public BigDecimal getCorpid() {
        return corpid;
    }

    public void setCorpid(BigDecimal corpid) {
        this.corpid = corpid;
    }

    public BigDecimal getDaysellnum2() {
        return daysellnum2;
    }

    public void setDaysellnum2(BigDecimal daysellnum2) {
        this.daysellnum2 = daysellnum2;
    }

    public BigDecimal getTranslatrate2() {
        return translatrate2;
    }

    public void setTranslatrate2(BigDecimal translatrate2) {
        this.translatrate2 = translatrate2;
    }

    public Date getPublishtime2() {
        return publishtime2;
    }

    public void setPublishtime2(Date publishtime2) {
        this.publishtime2 = publishtime2;
    }

    public BigDecimal getRoverlapenum2() {
        return roverlapenum2;
    }

    public void setRoverlapenum2(BigDecimal roverlapenum2) {
        this.roverlapenum2 = roverlapenum2;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getSqlfilter() {
        return sqlfilter;
    }

    public void setSqlfilter(String sqlfilter) {
        this.sqlfilter = sqlfilter == null ? null : sqlfilter.trim();
    }

    public String getJsonstr() {
        return jsonstr;
    }

    public void setJsonstr(String jsonstr) {
        this.jsonstr = jsonstr == null ? null : jsonstr.trim();
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
        DbCompetitorsearch other = (DbCompetitorsearch) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getDaysellnum() == null ? other.getDaysellnum() == null : this.getDaysellnum().equals(other.getDaysellnum()))
            && (this.getTranslatrate() == null ? other.getTranslatrate() == null : this.getTranslatrate().equals(other.getTranslatrate()))
            && (this.getPublishtime() == null ? other.getPublishtime() == null : this.getPublishtime().equals(other.getPublishtime()))
            && (this.getSellpricestart() == null ? other.getSellpricestart() == null : this.getSellpricestart().equals(other.getSellpricestart()))
            && (this.getSellpriceend() == null ? other.getSellpriceend() == null : this.getSellpriceend().equals(other.getSellpriceend()))
            && (this.getRoverlapenum() == null ? other.getRoverlapenum() == null : this.getRoverlapenum().equals(other.getRoverlapenum()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getDaysellnum2() == null ? other.getDaysellnum2() == null : this.getDaysellnum2().equals(other.getDaysellnum2()))
            && (this.getTranslatrate2() == null ? other.getTranslatrate2() == null : this.getTranslatrate2().equals(other.getTranslatrate2()))
            && (this.getPublishtime2() == null ? other.getPublishtime2() == null : this.getPublishtime2().equals(other.getPublishtime2()))
            && (this.getRoverlapenum2() == null ? other.getRoverlapenum2() == null : this.getRoverlapenum2().equals(other.getRoverlapenum2()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getSqlfilter() == null ? other.getSqlfilter() == null : this.getSqlfilter().equals(other.getSqlfilter()))
            && (this.getJsonstr() == null ? other.getJsonstr() == null : this.getJsonstr().equals(other.getJsonstr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getDaysellnum() == null) ? 0 : getDaysellnum().hashCode());
        result = prime * result + ((getTranslatrate() == null) ? 0 : getTranslatrate().hashCode());
        result = prime * result + ((getPublishtime() == null) ? 0 : getPublishtime().hashCode());
        result = prime * result + ((getSellpricestart() == null) ? 0 : getSellpricestart().hashCode());
        result = prime * result + ((getSellpriceend() == null) ? 0 : getSellpriceend().hashCode());
        result = prime * result + ((getRoverlapenum() == null) ? 0 : getRoverlapenum().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getDaysellnum2() == null) ? 0 : getDaysellnum2().hashCode());
        result = prime * result + ((getTranslatrate2() == null) ? 0 : getTranslatrate2().hashCode());
        result = prime * result + ((getPublishtime2() == null) ? 0 : getPublishtime2().hashCode());
        result = prime * result + ((getRoverlapenum2() == null) ? 0 : getRoverlapenum2().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getSqlfilter() == null) ? 0 : getSqlfilter().hashCode());
        result = prime * result + ((getJsonstr() == null) ? 0 : getJsonstr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", name=").append(name);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", daysellnum=").append(daysellnum);
        sb.append(", translatrate=").append(translatrate);
        sb.append(", publishtime=").append(publishtime);
        sb.append(", sellpricestart=").append(sellpricestart);
        sb.append(", sellpriceend=").append(sellpriceend);
        sb.append(", roverlapenum=").append(roverlapenum);
        sb.append(", openflag=").append(openflag);
        sb.append(", corpid=").append(corpid);
        sb.append(", daysellnum2=").append(daysellnum2);
        sb.append(", translatrate2=").append(translatrate2);
        sb.append(", publishtime2=").append(publishtime2);
        sb.append(", roverlapenum2=").append(roverlapenum2);
        sb.append(", descr=").append(descr);
        sb.append(", sqlfilter=").append(sqlfilter);
        sb.append(", jsonstr=").append(jsonstr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}