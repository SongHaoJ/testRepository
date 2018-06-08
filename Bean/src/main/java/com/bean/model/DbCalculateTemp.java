package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalculateTemp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.EBAYITEMID
     *
     * @mbg.generated
     */
    private String ebayitemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.EBAYQUANTITY
     *
     * @mbg.generated
     */
    private BigDecimal ebayquantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.EBAYHITCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal ebayhitcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.UPDATETIME1
     *
     * @mbg.generated
     */
    private String updatetime1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.UPDATETIME
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_calculate_temp.CALCULATEFLAG
     *
     * @mbg.generated
     */
    private String calculateflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_calculate_temp
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.SID
     *
     * @return the value of db_calculate_temp.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.SID
     *
     * @param sid the value for db_calculate_temp.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.EBAYITEMID
     *
     * @return the value of db_calculate_temp.EBAYITEMID
     *
     * @mbg.generated
     */
    public String getEbayitemid() {
        return ebayitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.EBAYITEMID
     *
     * @param ebayitemid the value for db_calculate_temp.EBAYITEMID
     *
     * @mbg.generated
     */
    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.EBAYQUANTITY
     *
     * @return the value of db_calculate_temp.EBAYQUANTITY
     *
     * @mbg.generated
     */
    public BigDecimal getEbayquantity() {
        return ebayquantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.EBAYQUANTITY
     *
     * @param ebayquantity the value for db_calculate_temp.EBAYQUANTITY
     *
     * @mbg.generated
     */
    public void setEbayquantity(BigDecimal ebayquantity) {
        this.ebayquantity = ebayquantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.EBAYHITCOUNT
     *
     * @return the value of db_calculate_temp.EBAYHITCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getEbayhitcount() {
        return ebayhitcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.EBAYHITCOUNT
     *
     * @param ebayhitcount the value for db_calculate_temp.EBAYHITCOUNT
     *
     * @mbg.generated
     */
    public void setEbayhitcount(BigDecimal ebayhitcount) {
        this.ebayhitcount = ebayhitcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.UPDATETIME1
     *
     * @return the value of db_calculate_temp.UPDATETIME1
     *
     * @mbg.generated
     */
    public String getUpdatetime1() {
        return updatetime1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.UPDATETIME1
     *
     * @param updatetime1 the value for db_calculate_temp.UPDATETIME1
     *
     * @mbg.generated
     */
    public void setUpdatetime1(String updatetime1) {
        this.updatetime1 = updatetime1 == null ? null : updatetime1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.UPDATETIME
     *
     * @return the value of db_calculate_temp.UPDATETIME
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.UPDATETIME
     *
     * @param updatetime the value for db_calculate_temp.UPDATETIME
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_calculate_temp.CALCULATEFLAG
     *
     * @return the value of db_calculate_temp.CALCULATEFLAG
     *
     * @mbg.generated
     */
    public String getCalculateflag() {
        return calculateflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_calculate_temp.CALCULATEFLAG
     *
     * @param calculateflag the value for db_calculate_temp.CALCULATEFLAG
     *
     * @mbg.generated
     */
    public void setCalculateflag(String calculateflag) {
        this.calculateflag = calculateflag == null ? null : calculateflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp
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
        DbCalculateTemp other = (DbCalculateTemp) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbayquantity() == null ? other.getEbayquantity() == null : this.getEbayquantity().equals(other.getEbayquantity()))
            && (this.getEbayhitcount() == null ? other.getEbayhitcount() == null : this.getEbayhitcount().equals(other.getEbayhitcount()))
            && (this.getUpdatetime1() == null ? other.getUpdatetime1() == null : this.getUpdatetime1().equals(other.getUpdatetime1()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbayquantity() == null) ? 0 : getEbayquantity().hashCode());
        result = prime * result + ((getEbayhitcount() == null) ? 0 : getEbayhitcount().hashCode());
        result = prime * result + ((getUpdatetime1() == null) ? 0 : getUpdatetime1().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp
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
        sb.append(", ebayquantity=").append(ebayquantity);
        sb.append(", ebayhitcount=").append(ebayhitcount);
        sb.append(", updatetime1=").append(updatetime1);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}