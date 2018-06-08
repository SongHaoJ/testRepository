package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalculateTemp1 implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.EBAYITEMID
     *
     * @mbg.generated
     */
    private String ebayitemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.EBAYQUANTITYSOLD
     *
     * @mbg.generated
     */
    private BigDecimal ebayquantitysold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.EBAYHITCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal ebayhitcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.UPDATETIME1
     *
     * @mbg.generated
     */
    private String updatetime1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.UPDATETIME
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp1.CALCULATEFLAG
     *
     * @mbg.generated
     */
    private String calculateflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.SID
     *
     * @return the value of db_calculate_temp1.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.SID
     *
     * @param sid the value for db_calculate_temp1.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.EBAYITEMID
     *
     * @return the value of db_calculate_temp1.EBAYITEMID
     *
     * @mbg.generated
     */
    public String getEbayitemid() {
        return ebayitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.EBAYITEMID
     *
     * @param ebayitemid the value for db_calculate_temp1.EBAYITEMID
     *
     * @mbg.generated
     */
    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.EBAYQUANTITYSOLD
     *
     * @return the value of db_calculate_temp1.EBAYQUANTITYSOLD
     *
     * @mbg.generated
     */
    public BigDecimal getEbayquantitysold() {
        return ebayquantitysold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.EBAYQUANTITYSOLD
     *
     * @param ebayquantitysold the value for db_calculate_temp1.EBAYQUANTITYSOLD
     *
     * @mbg.generated
     */
    public void setEbayquantitysold(BigDecimal ebayquantitysold) {
        this.ebayquantitysold = ebayquantitysold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.EBAYHITCOUNT
     *
     * @return the value of db_calculate_temp1.EBAYHITCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getEbayhitcount() {
        return ebayhitcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.EBAYHITCOUNT
     *
     * @param ebayhitcount the value for db_calculate_temp1.EBAYHITCOUNT
     *
     * @mbg.generated
     */
    public void setEbayhitcount(BigDecimal ebayhitcount) {
        this.ebayhitcount = ebayhitcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.UPDATETIME1
     *
     * @return the value of db_calculate_temp1.UPDATETIME1
     *
     * @mbg.generated
     */
    public String getUpdatetime1() {
        return updatetime1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.UPDATETIME1
     *
     * @param updatetime1 the value for db_calculate_temp1.UPDATETIME1
     *
     * @mbg.generated
     */
    public void setUpdatetime1(String updatetime1) {
        this.updatetime1 = updatetime1 == null ? null : updatetime1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.UPDATETIME
     *
     * @return the value of db_calculate_temp1.UPDATETIME
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.UPDATETIME
     *
     * @param updatetime the value for db_calculate_temp1.UPDATETIME
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp1.CALCULATEFLAG
     *
     * @return the value of db_calculate_temp1.CALCULATEFLAG
     *
     * @mbg.generated
     */
    public String getCalculateflag() {
        return calculateflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp1.CALCULATEFLAG
     *
     * @param calculateflag the value for db_calculate_temp1.CALCULATEFLAG
     *
     * @mbg.generated
     */
    public void setCalculateflag(String calculateflag) {
        this.calculateflag = calculateflag == null ? null : calculateflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
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
        DbCalculateTemp1 other = (DbCalculateTemp1) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbayquantitysold() == null ? other.getEbayquantitysold() == null : this.getEbayquantitysold().equals(other.getEbayquantitysold()))
            && (this.getEbayhitcount() == null ? other.getEbayhitcount() == null : this.getEbayhitcount().equals(other.getEbayhitcount()))
            && (this.getUpdatetime1() == null ? other.getUpdatetime1() == null : this.getUpdatetime1().equals(other.getUpdatetime1()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbayquantitysold() == null) ? 0 : getEbayquantitysold().hashCode());
        result = prime * result + ((getEbayhitcount() == null) ? 0 : getEbayhitcount().hashCode());
        result = prime * result + ((getUpdatetime1() == null) ? 0 : getUpdatetime1().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebayquantitysold=").append(ebayquantitysold);
        sb.append(", ebayhitcount=").append(ebayhitcount);
        sb.append(", updatetime1=").append(updatetime1);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}