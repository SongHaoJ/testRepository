package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCompetitionsku implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_competitionsku.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_competitionsku.SKU
     *
     * @mbg.generated
     */
    private String sku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_competitionsku.XSKU
     *
     * @mbg.generated
     */
    private String xsku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_competitionsku.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_competitionsku.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_competitionsku.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_competitionsku
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_competitionsku.SEQUENCEID
     *
     * @return the value of db_competitionsku.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_competitionsku.SEQUENCEID
     *
     * @param sequenceid the value for db_competitionsku.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_competitionsku.SKU
     *
     * @return the value of db_competitionsku.SKU
     *
     * @mbg.generated
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_competitionsku.SKU
     *
     * @param sku the value for db_competitionsku.SKU
     *
     * @mbg.generated
     */
    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_competitionsku.XSKU
     *
     * @return the value of db_competitionsku.XSKU
     *
     * @mbg.generated
     */
    public String getXsku() {
        return xsku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_competitionsku.XSKU
     *
     * @param xsku the value for db_competitionsku.XSKU
     *
     * @mbg.generated
     */
    public void setXsku(String xsku) {
        this.xsku = xsku == null ? null : xsku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_competitionsku.OPER
     *
     * @return the value of db_competitionsku.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_competitionsku.OPER
     *
     * @param oper the value for db_competitionsku.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_competitionsku.OPERTIME
     *
     * @return the value of db_competitionsku.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_competitionsku.OPERTIME
     *
     * @param opertime the value for db_competitionsku.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_competitionsku.CORPID
     *
     * @return the value of db_competitionsku.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_competitionsku.CORPID
     *
     * @param corpid the value for db_competitionsku.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_competitionsku
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
        DbCompetitionsku other = (DbCompetitionsku) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getXsku() == null ? other.getXsku() == null : this.getXsku().equals(other.getXsku()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_competitionsku
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getXsku() == null) ? 0 : getXsku().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_competitionsku
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
        sb.append(", sku=").append(sku);
        sb.append(", xsku=").append(xsku);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}