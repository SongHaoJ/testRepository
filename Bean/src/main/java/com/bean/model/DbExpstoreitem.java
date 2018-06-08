package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbExpstoreitem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expstoreitem.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expstoreitem.EXPSTOREID
     *
     * @mbg.generated
     */
    private BigDecimal expstoreid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expstoreitem.SKU
     *
     * @mbg.generated
     */
    private String sku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expstoreitem.ORDERNUM
     *
     * @mbg.generated
     */
    private BigDecimal ordernum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expstoreitem.PRICE
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expstoreitem.SAVELOG
     *
     * @mbg.generated
     */
    private String savelog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_expstoreitem
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expstoreitem.SEQUENCEID
     *
     * @return the value of db_expstoreitem.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expstoreitem.SEQUENCEID
     *
     * @param sequenceid the value for db_expstoreitem.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expstoreitem.EXPSTOREID
     *
     * @return the value of db_expstoreitem.EXPSTOREID
     *
     * @mbg.generated
     */
    public BigDecimal getExpstoreid() {
        return expstoreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expstoreitem.EXPSTOREID
     *
     * @param expstoreid the value for db_expstoreitem.EXPSTOREID
     *
     * @mbg.generated
     */
    public void setExpstoreid(BigDecimal expstoreid) {
        this.expstoreid = expstoreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expstoreitem.SKU
     *
     * @return the value of db_expstoreitem.SKU
     *
     * @mbg.generated
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expstoreitem.SKU
     *
     * @param sku the value for db_expstoreitem.SKU
     *
     * @mbg.generated
     */
    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expstoreitem.ORDERNUM
     *
     * @return the value of db_expstoreitem.ORDERNUM
     *
     * @mbg.generated
     */
    public BigDecimal getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expstoreitem.ORDERNUM
     *
     * @param ordernum the value for db_expstoreitem.ORDERNUM
     *
     * @mbg.generated
     */
    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expstoreitem.PRICE
     *
     * @return the value of db_expstoreitem.PRICE
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expstoreitem.PRICE
     *
     * @param price the value for db_expstoreitem.PRICE
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expstoreitem.SAVELOG
     *
     * @return the value of db_expstoreitem.SAVELOG
     *
     * @mbg.generated
     */
    public String getSavelog() {
        return savelog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expstoreitem.SAVELOG
     *
     * @param savelog the value for db_expstoreitem.SAVELOG
     *
     * @mbg.generated
     */
    public void setSavelog(String savelog) {
        this.savelog = savelog == null ? null : savelog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expstoreitem
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
        DbExpstoreitem other = (DbExpstoreitem) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getExpstoreid() == null ? other.getExpstoreid() == null : this.getExpstoreid().equals(other.getExpstoreid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSavelog() == null ? other.getSavelog() == null : this.getSavelog().equals(other.getSavelog()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expstoreitem
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getExpstoreid() == null) ? 0 : getExpstoreid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSavelog() == null) ? 0 : getSavelog().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expstoreitem
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
        sb.append(", expstoreid=").append(expstoreid);
        sb.append(", sku=").append(sku);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", price=").append(price);
        sb.append(", savelog=").append(savelog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}