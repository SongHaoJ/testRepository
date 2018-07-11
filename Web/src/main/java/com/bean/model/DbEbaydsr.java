package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbaydsr implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal ebaymanageid;

    private String name;

    private String content;

    private String month3num;

    private String month3proportion;

    private String month12num;

    private String month12proportion;

    private Date opertime;

    private BigDecimal openflag;

    private String oper;

    private BigDecimal corpid;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getEbaymanageid() {
        return ebaymanageid;
    }

    public void setEbaymanageid(BigDecimal ebaymanageid) {
        this.ebaymanageid = ebaymanageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMonth3num() {
        return month3num;
    }

    public void setMonth3num(String month3num) {
        this.month3num = month3num == null ? null : month3num.trim();
    }

    public String getMonth3proportion() {
        return month3proportion;
    }

    public void setMonth3proportion(String month3proportion) {
        this.month3proportion = month3proportion == null ? null : month3proportion.trim();
    }

    public String getMonth12num() {
        return month12num;
    }

    public void setMonth12num(String month12num) {
        this.month12num = month12num == null ? null : month12num.trim();
    }

    public String getMonth12proportion() {
        return month12proportion;
    }

    public void setMonth12proportion(String month12proportion) {
        this.month12proportion = month12proportion == null ? null : month12proportion.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
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
        DbEbaydsr other = (DbEbaydsr) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getEbaymanageid() == null ? other.getEbaymanageid() == null : this.getEbaymanageid().equals(other.getEbaymanageid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getMonth3num() == null ? other.getMonth3num() == null : this.getMonth3num().equals(other.getMonth3num()))
            && (this.getMonth3proportion() == null ? other.getMonth3proportion() == null : this.getMonth3proportion().equals(other.getMonth3proportion()))
            && (this.getMonth12num() == null ? other.getMonth12num() == null : this.getMonth12num().equals(other.getMonth12num()))
            && (this.getMonth12proportion() == null ? other.getMonth12proportion() == null : this.getMonth12proportion().equals(other.getMonth12proportion()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getEbaymanageid() == null) ? 0 : getEbaymanageid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getMonth3num() == null) ? 0 : getMonth3num().hashCode());
        result = prime * result + ((getMonth3proportion() == null) ? 0 : getMonth3proportion().hashCode());
        result = prime * result + ((getMonth12num() == null) ? 0 : getMonth12num().hashCode());
        result = prime * result + ((getMonth12proportion() == null) ? 0 : getMonth12proportion().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
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
        sb.append(", ebaymanageid=").append(ebaymanageid);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", month3num=").append(month3num);
        sb.append(", month3proportion=").append(month3proportion);
        sb.append(", month12num=").append(month12num);
        sb.append(", month12proportion=").append(month12proportion);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", corpid=").append(corpid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}