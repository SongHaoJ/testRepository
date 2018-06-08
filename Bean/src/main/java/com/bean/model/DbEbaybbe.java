package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbaybbe implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.EBAYIDMANAGEID
     *
     * @mbg.generated
     */
    private BigDecimal ebayidmanageid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.BBENUM
     *
     * @mbg.generated
     */
    private String bbenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.BBEPERCENT
     *
     * @mbg.generated
     */
    private String bbepercent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.BBE2
     *
     * @mbg.generated
     */
    private String bbe2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.BBE3
     *
     * @mbg.generated
     */
    private String bbe3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebaybbe.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.SEQUENCEID
     *
     * @return the value of db_ebaybbe.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.SEQUENCEID
     *
     * @param sequenceid the value for db_ebaybbe.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.EBAYIDMANAGEID
     *
     * @return the value of db_ebaybbe.EBAYIDMANAGEID
     *
     * @mbg.generated
     */
    public BigDecimal getEbayidmanageid() {
        return ebayidmanageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.EBAYIDMANAGEID
     *
     * @param ebayidmanageid the value for db_ebaybbe.EBAYIDMANAGEID
     *
     * @mbg.generated
     */
    public void setEbayidmanageid(BigDecimal ebayidmanageid) {
        this.ebayidmanageid = ebayidmanageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.BBENUM
     *
     * @return the value of db_ebaybbe.BBENUM
     *
     * @mbg.generated
     */
    public String getBbenum() {
        return bbenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.BBENUM
     *
     * @param bbenum the value for db_ebaybbe.BBENUM
     *
     * @mbg.generated
     */
    public void setBbenum(String bbenum) {
        this.bbenum = bbenum == null ? null : bbenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.BBEPERCENT
     *
     * @return the value of db_ebaybbe.BBEPERCENT
     *
     * @mbg.generated
     */
    public String getBbepercent() {
        return bbepercent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.BBEPERCENT
     *
     * @param bbepercent the value for db_ebaybbe.BBEPERCENT
     *
     * @mbg.generated
     */
    public void setBbepercent(String bbepercent) {
        this.bbepercent = bbepercent == null ? null : bbepercent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.BBE2
     *
     * @return the value of db_ebaybbe.BBE2
     *
     * @mbg.generated
     */
    public String getBbe2() {
        return bbe2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.BBE2
     *
     * @param bbe2 the value for db_ebaybbe.BBE2
     *
     * @mbg.generated
     */
    public void setBbe2(String bbe2) {
        this.bbe2 = bbe2 == null ? null : bbe2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.BBE3
     *
     * @return the value of db_ebaybbe.BBE3
     *
     * @mbg.generated
     */
    public String getBbe3() {
        return bbe3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.BBE3
     *
     * @param bbe3 the value for db_ebaybbe.BBE3
     *
     * @mbg.generated
     */
    public void setBbe3(String bbe3) {
        this.bbe3 = bbe3 == null ? null : bbe3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.CORPID
     *
     * @return the value of db_ebaybbe.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.CORPID
     *
     * @param corpid the value for db_ebaybbe.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.OPENFLAG
     *
     * @return the value of db_ebaybbe.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.OPENFLAG
     *
     * @param openflag the value for db_ebaybbe.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.OPER
     *
     * @return the value of db_ebaybbe.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.OPER
     *
     * @param oper the value for db_ebaybbe.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebaybbe.OPERTIME
     *
     * @return the value of db_ebaybbe.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebaybbe.OPERTIME
     *
     * @param opertime the value for db_ebaybbe.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
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