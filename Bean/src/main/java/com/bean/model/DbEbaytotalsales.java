package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbaytotalsales implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal ebaymanageid;

    private String name;

    private String standardvalue1;

    private String value1;

    private String standardvalue2;

    private String value2;

    private String standardvalue3;

    private String value3;

    private String standardvalue4;

    private String value4;

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

    public String getStandardvalue1() {
        return standardvalue1;
    }

    public void setStandardvalue1(String standardvalue1) {
        this.standardvalue1 = standardvalue1 == null ? null : standardvalue1.trim();
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1 == null ? null : value1.trim();
    }

    public String getStandardvalue2() {
        return standardvalue2;
    }

    public void setStandardvalue2(String standardvalue2) {
        this.standardvalue2 = standardvalue2 == null ? null : standardvalue2.trim();
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2 == null ? null : value2.trim();
    }

    public String getStandardvalue3() {
        return standardvalue3;
    }

    public void setStandardvalue3(String standardvalue3) {
        this.standardvalue3 = standardvalue3 == null ? null : standardvalue3.trim();
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3 == null ? null : value3.trim();
    }

    public String getStandardvalue4() {
        return standardvalue4;
    }

    public void setStandardvalue4(String standardvalue4) {
        this.standardvalue4 = standardvalue4 == null ? null : standardvalue4.trim();
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4 == null ? null : value4.trim();
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
        DbEbaytotalsales other = (DbEbaytotalsales) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getEbaymanageid() == null ? other.getEbaymanageid() == null : this.getEbaymanageid().equals(other.getEbaymanageid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStandardvalue1() == null ? other.getStandardvalue1() == null : this.getStandardvalue1().equals(other.getStandardvalue1()))
            && (this.getValue1() == null ? other.getValue1() == null : this.getValue1().equals(other.getValue1()))
            && (this.getStandardvalue2() == null ? other.getStandardvalue2() == null : this.getStandardvalue2().equals(other.getStandardvalue2()))
            && (this.getValue2() == null ? other.getValue2() == null : this.getValue2().equals(other.getValue2()))
            && (this.getStandardvalue3() == null ? other.getStandardvalue3() == null : this.getStandardvalue3().equals(other.getStandardvalue3()))
            && (this.getValue3() == null ? other.getValue3() == null : this.getValue3().equals(other.getValue3()))
            && (this.getStandardvalue4() == null ? other.getStandardvalue4() == null : this.getStandardvalue4().equals(other.getStandardvalue4()))
            && (this.getValue4() == null ? other.getValue4() == null : this.getValue4().equals(other.getValue4()))
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
        result = prime * result + ((getStandardvalue1() == null) ? 0 : getStandardvalue1().hashCode());
        result = prime * result + ((getValue1() == null) ? 0 : getValue1().hashCode());
        result = prime * result + ((getStandardvalue2() == null) ? 0 : getStandardvalue2().hashCode());
        result = prime * result + ((getValue2() == null) ? 0 : getValue2().hashCode());
        result = prime * result + ((getStandardvalue3() == null) ? 0 : getStandardvalue3().hashCode());
        result = prime * result + ((getValue3() == null) ? 0 : getValue3().hashCode());
        result = prime * result + ((getStandardvalue4() == null) ? 0 : getStandardvalue4().hashCode());
        result = prime * result + ((getValue4() == null) ? 0 : getValue4().hashCode());
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
        sb.append(", standardvalue1=").append(standardvalue1);
        sb.append(", value1=").append(value1);
        sb.append(", standardvalue2=").append(standardvalue2);
        sb.append(", value2=").append(value2);
        sb.append(", standardvalue3=").append(standardvalue3);
        sb.append(", value3=").append(value3);
        sb.append(", standardvalue4=").append(standardvalue4);
        sb.append(", value4=").append(value4);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", corpid=").append(corpid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}