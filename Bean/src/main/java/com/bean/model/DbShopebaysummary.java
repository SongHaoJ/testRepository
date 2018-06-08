package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShopebaysummary implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.SHOPTYPEID
     *
     * @mbg.generated
     */
    private String shoptypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.SHOPTYPENAME
     *
     * @mbg.generated
     */
    private String shoptypename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.YYYYMMDD
     *
     * @mbg.generated
     */
    private String yyyymmdd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.QUANTITYLIMITREMAINING
     *
     * @mbg.generated
     */
    private BigDecimal quantitylimitremaining;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.AMOUNTLIMITREMAINING
     *
     * @mbg.generated
     */
    private BigDecimal amountlimitremaining;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.TOTALSOLDCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal totalsoldcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.TOTALSOLDVALUE
     *
     * @mbg.generated
     */
    private BigDecimal totalsoldvalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.RESERVE1
     *
     * @mbg.generated
     */
    private BigDecimal reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.RESERVE2
     *
     * @mbg.generated
     */
    private BigDecimal reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.RESERVE3
     *
     * @mbg.generated
     */
    private BigDecimal reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopebaysummary.RESERVE4
     *
     * @mbg.generated
     */
    private BigDecimal reserve4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_shopebaysummary
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.SID
     *
     * @return the value of db_shopebaysummary.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.SID
     *
     * @param sid the value for db_shopebaysummary.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.SHOPTYPEID
     *
     * @return the value of db_shopebaysummary.SHOPTYPEID
     *
     * @mbg.generated
     */
    public String getShoptypeid() {
        return shoptypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.SHOPTYPEID
     *
     * @param shoptypeid the value for db_shopebaysummary.SHOPTYPEID
     *
     * @mbg.generated
     */
    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.SHOPTYPENAME
     *
     * @return the value of db_shopebaysummary.SHOPTYPENAME
     *
     * @mbg.generated
     */
    public String getShoptypename() {
        return shoptypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.SHOPTYPENAME
     *
     * @param shoptypename the value for db_shopebaysummary.SHOPTYPENAME
     *
     * @mbg.generated
     */
    public void setShoptypename(String shoptypename) {
        this.shoptypename = shoptypename == null ? null : shoptypename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.YYYYMMDD
     *
     * @return the value of db_shopebaysummary.YYYYMMDD
     *
     * @mbg.generated
     */
    public String getYyyymmdd() {
        return yyyymmdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.YYYYMMDD
     *
     * @param yyyymmdd the value for db_shopebaysummary.YYYYMMDD
     *
     * @mbg.generated
     */
    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd == null ? null : yyyymmdd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.QUANTITYLIMITREMAINING
     *
     * @return the value of db_shopebaysummary.QUANTITYLIMITREMAINING
     *
     * @mbg.generated
     */
    public BigDecimal getQuantitylimitremaining() {
        return quantitylimitremaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.QUANTITYLIMITREMAINING
     *
     * @param quantitylimitremaining the value for db_shopebaysummary.QUANTITYLIMITREMAINING
     *
     * @mbg.generated
     */
    public void setQuantitylimitremaining(BigDecimal quantitylimitremaining) {
        this.quantitylimitremaining = quantitylimitremaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.AMOUNTLIMITREMAINING
     *
     * @return the value of db_shopebaysummary.AMOUNTLIMITREMAINING
     *
     * @mbg.generated
     */
    public BigDecimal getAmountlimitremaining() {
        return amountlimitremaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.AMOUNTLIMITREMAINING
     *
     * @param amountlimitremaining the value for db_shopebaysummary.AMOUNTLIMITREMAINING
     *
     * @mbg.generated
     */
    public void setAmountlimitremaining(BigDecimal amountlimitremaining) {
        this.amountlimitremaining = amountlimitremaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.TOTALSOLDCOUNT
     *
     * @return the value of db_shopebaysummary.TOTALSOLDCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getTotalsoldcount() {
        return totalsoldcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.TOTALSOLDCOUNT
     *
     * @param totalsoldcount the value for db_shopebaysummary.TOTALSOLDCOUNT
     *
     * @mbg.generated
     */
    public void setTotalsoldcount(BigDecimal totalsoldcount) {
        this.totalsoldcount = totalsoldcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.TOTALSOLDVALUE
     *
     * @return the value of db_shopebaysummary.TOTALSOLDVALUE
     *
     * @mbg.generated
     */
    public BigDecimal getTotalsoldvalue() {
        return totalsoldvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.TOTALSOLDVALUE
     *
     * @param totalsoldvalue the value for db_shopebaysummary.TOTALSOLDVALUE
     *
     * @mbg.generated
     */
    public void setTotalsoldvalue(BigDecimal totalsoldvalue) {
        this.totalsoldvalue = totalsoldvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.OPERTIME
     *
     * @return the value of db_shopebaysummary.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.OPERTIME
     *
     * @param opertime the value for db_shopebaysummary.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.RESERVE1
     *
     * @return the value of db_shopebaysummary.RESERVE1
     *
     * @mbg.generated
     */
    public BigDecimal getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.RESERVE1
     *
     * @param reserve1 the value for db_shopebaysummary.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(BigDecimal reserve1) {
        this.reserve1 = reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.RESERVE2
     *
     * @return the value of db_shopebaysummary.RESERVE2
     *
     * @mbg.generated
     */
    public BigDecimal getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.RESERVE2
     *
     * @param reserve2 the value for db_shopebaysummary.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(BigDecimal reserve2) {
        this.reserve2 = reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.RESERVE3
     *
     * @return the value of db_shopebaysummary.RESERVE3
     *
     * @mbg.generated
     */
    public BigDecimal getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.RESERVE3
     *
     * @param reserve3 the value for db_shopebaysummary.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(BigDecimal reserve3) {
        this.reserve3 = reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopebaysummary.RESERVE4
     *
     * @return the value of db_shopebaysummary.RESERVE4
     *
     * @mbg.generated
     */
    public BigDecimal getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopebaysummary.RESERVE4
     *
     * @param reserve4 the value for db_shopebaysummary.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopebaysummary
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
        DbShopebaysummary other = (DbShopebaysummary) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptypename() == null ? other.getShoptypename() == null : this.getShoptypename().equals(other.getShoptypename()))
            && (this.getYyyymmdd() == null ? other.getYyyymmdd() == null : this.getYyyymmdd().equals(other.getYyyymmdd()))
            && (this.getQuantitylimitremaining() == null ? other.getQuantitylimitremaining() == null : this.getQuantitylimitremaining().equals(other.getQuantitylimitremaining()))
            && (this.getAmountlimitremaining() == null ? other.getAmountlimitremaining() == null : this.getAmountlimitremaining().equals(other.getAmountlimitremaining()))
            && (this.getTotalsoldcount() == null ? other.getTotalsoldcount() == null : this.getTotalsoldcount().equals(other.getTotalsoldcount()))
            && (this.getTotalsoldvalue() == null ? other.getTotalsoldvalue() == null : this.getTotalsoldvalue().equals(other.getTotalsoldvalue()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopebaysummary
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptypename() == null) ? 0 : getShoptypename().hashCode());
        result = prime * result + ((getYyyymmdd() == null) ? 0 : getYyyymmdd().hashCode());
        result = prime * result + ((getQuantitylimitremaining() == null) ? 0 : getQuantitylimitremaining().hashCode());
        result = prime * result + ((getAmountlimitremaining() == null) ? 0 : getAmountlimitremaining().hashCode());
        result = prime * result + ((getTotalsoldcount() == null) ? 0 : getTotalsoldcount().hashCode());
        result = prime * result + ((getTotalsoldvalue() == null) ? 0 : getTotalsoldvalue().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopebaysummary
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
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptypename=").append(shoptypename);
        sb.append(", yyyymmdd=").append(yyyymmdd);
        sb.append(", quantitylimitremaining=").append(quantitylimitremaining);
        sb.append(", amountlimitremaining=").append(amountlimitremaining);
        sb.append(", totalsoldcount=").append(totalsoldcount);
        sb.append(", totalsoldvalue=").append(totalsoldvalue);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}