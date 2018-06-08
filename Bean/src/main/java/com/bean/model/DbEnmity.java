package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEnmity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.SHOPNAME
     *
     * @mbg.generated
     */
    private String shopname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.STATUS
     *
     * @mbg.generated
     */
    private BigDecimal status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.CORPID
     *
     * @mbg.generated
     */
    private BigDecimal corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.EBAYITEMID
     *
     * @mbg.generated
     */
    private String ebayitemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.USERNAME
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.USERNEME
     *
     * @mbg.generated
     */
    private String userneme;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_enmity.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_enmity
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.SEQUENCEID
     *
     * @return the value of db_enmity.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.SEQUENCEID
     *
     * @param sequenceid the value for db_enmity.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.SHOPNAME
     *
     * @return the value of db_enmity.SHOPNAME
     *
     * @mbg.generated
     */
    public String getShopname() {
        return shopname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.SHOPNAME
     *
     * @param shopname the value for db_enmity.SHOPNAME
     *
     * @mbg.generated
     */
    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.OPER
     *
     * @return the value of db_enmity.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.OPER
     *
     * @param oper the value for db_enmity.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.OPERTIME
     *
     * @return the value of db_enmity.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.OPERTIME
     *
     * @param opertime the value for db_enmity.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.OPENFLAG
     *
     * @return the value of db_enmity.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.OPENFLAG
     *
     * @param openflag the value for db_enmity.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.STATUS
     *
     * @return the value of db_enmity.STATUS
     *
     * @mbg.generated
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.STATUS
     *
     * @param status the value for db_enmity.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.CORPID
     *
     * @return the value of db_enmity.CORPID
     *
     * @mbg.generated
     */
    public BigDecimal getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.CORPID
     *
     * @param corpid the value for db_enmity.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(BigDecimal corpid) {
        this.corpid = corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.EBAYITEMID
     *
     * @return the value of db_enmity.EBAYITEMID
     *
     * @mbg.generated
     */
    public String getEbayitemid() {
        return ebayitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.EBAYITEMID
     *
     * @param ebayitemid the value for db_enmity.EBAYITEMID
     *
     * @mbg.generated
     */
    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.USERNAME
     *
     * @return the value of db_enmity.USERNAME
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.USERNAME
     *
     * @param username the value for db_enmity.USERNAME
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.USERNEME
     *
     * @return the value of db_enmity.USERNEME
     *
     * @mbg.generated
     */
    public String getUserneme() {
        return userneme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.USERNEME
     *
     * @param userneme the value for db_enmity.USERNEME
     *
     * @mbg.generated
     */
    public void setUserneme(String userneme) {
        this.userneme = userneme == null ? null : userneme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_enmity.DESCR
     *
     * @return the value of db_enmity.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_enmity.DESCR
     *
     * @param descr the value for db_enmity.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_enmity
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
        DbEnmity other = (DbEnmity) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserneme() == null ? other.getUserneme() == null : this.getUserneme().equals(other.getUserneme()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_enmity
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserneme() == null) ? 0 : getUserneme().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_enmity
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
        sb.append(", shopname=").append(shopname);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", status=").append(status);
        sb.append(", corpid=").append(corpid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", username=").append(username);
        sb.append(", userneme=").append(userneme);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}