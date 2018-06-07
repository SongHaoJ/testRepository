package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbBullettype implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bullettype.BULLETTYPE
     *
     * @mbg.generated
     */
    private BigDecimal bullettype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bullettype.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_bullettype
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bullettype.BULLETTYPE
     *
     * @return the value of db_bullettype.BULLETTYPE
     *
     * @mbg.generated
     */
    public BigDecimal getBullettype() {
        return bullettype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bullettype.BULLETTYPE
     *
     * @param bullettype the value for db_bullettype.BULLETTYPE
     *
     * @mbg.generated
     */
    public void setBullettype(BigDecimal bullettype) {
        this.bullettype = bullettype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bullettype.DESCR
     *
     * @return the value of db_bullettype.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bullettype.DESCR
     *
     * @param descr the value for db_bullettype.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bullettype
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
        DbBullettype other = (DbBullettype) that;
        return (this.getBullettype() == null ? other.getBullettype() == null : this.getBullettype().equals(other.getBullettype()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bullettype
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBullettype() == null) ? 0 : getBullettype().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bullettype
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bullettype=").append(bullettype);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}