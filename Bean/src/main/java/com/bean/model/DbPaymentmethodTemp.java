package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbPaymentmethodTemp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_paymentmethod_temp.SID
     *
     * @mbg.generated
     */
    private BigDecimal sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_paymentmethod_temp.ITEMID
     *
     * @mbg.generated
     */
    private BigDecimal itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_paymentmethod_temp.PAYMENTNAME
     *
     * @mbg.generated
     */
    private String paymentname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_paymentmethod_temp.FLAG
     *
     * @mbg.generated
     */
    private Short flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_paymentmethod_temp
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_paymentmethod_temp.SID
     *
     * @return the value of db_paymentmethod_temp.SID
     *
     * @mbg.generated
     */
    public BigDecimal getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_paymentmethod_temp.SID
     *
     * @param sid the value for db_paymentmethod_temp.SID
     *
     * @mbg.generated
     */
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_paymentmethod_temp.ITEMID
     *
     * @return the value of db_paymentmethod_temp.ITEMID
     *
     * @mbg.generated
     */
    public BigDecimal getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_paymentmethod_temp.ITEMID
     *
     * @param itemid the value for db_paymentmethod_temp.ITEMID
     *
     * @mbg.generated
     */
    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_paymentmethod_temp.PAYMENTNAME
     *
     * @return the value of db_paymentmethod_temp.PAYMENTNAME
     *
     * @mbg.generated
     */
    public String getPaymentname() {
        return paymentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_paymentmethod_temp.PAYMENTNAME
     *
     * @param paymentname the value for db_paymentmethod_temp.PAYMENTNAME
     *
     * @mbg.generated
     */
    public void setPaymentname(String paymentname) {
        this.paymentname = paymentname == null ? null : paymentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_paymentmethod_temp.FLAG
     *
     * @return the value of db_paymentmethod_temp.FLAG
     *
     * @mbg.generated
     */
    public Short getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_paymentmethod_temp.FLAG
     *
     * @param flag the value for db_paymentmethod_temp.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(Short flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentmethod_temp
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
        DbPaymentmethodTemp other = (DbPaymentmethodTemp) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getPaymentname() == null ? other.getPaymentname() == null : this.getPaymentname().equals(other.getPaymentname()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentmethod_temp
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getPaymentname() == null) ? 0 : getPaymentname().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentmethod_temp
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
        sb.append(", itemid=").append(itemid);
        sb.append(", paymentname=").append(paymentname);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}