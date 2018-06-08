package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbShoppingpics implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shoppingpics.ID
     *
     * @mbg.generated
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shoppingpics.ITEMID
     *
     * @mbg.generated
     */
    private BigDecimal itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shoppingpics.SKU
     *
     * @mbg.generated
     */
    private String sku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shoppingpics.PIC
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_shoppingpics
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shoppingpics.ID
     *
     * @return the value of db_shoppingpics.ID
     *
     * @mbg.generated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shoppingpics.ID
     *
     * @param id the value for db_shoppingpics.ID
     *
     * @mbg.generated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shoppingpics.ITEMID
     *
     * @return the value of db_shoppingpics.ITEMID
     *
     * @mbg.generated
     */
    public BigDecimal getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shoppingpics.ITEMID
     *
     * @param itemid the value for db_shoppingpics.ITEMID
     *
     * @mbg.generated
     */
    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shoppingpics.SKU
     *
     * @return the value of db_shoppingpics.SKU
     *
     * @mbg.generated
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shoppingpics.SKU
     *
     * @param sku the value for db_shoppingpics.SKU
     *
     * @mbg.generated
     */
    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shoppingpics.PIC
     *
     * @return the value of db_shoppingpics.PIC
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shoppingpics.PIC
     *
     * @param pic the value for db_shoppingpics.PIC
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shoppingpics
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
        DbShoppingpics other = (DbShoppingpics) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shoppingpics
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shoppingpics
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemid=").append(itemid);
        sb.append(", sku=").append(sku);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}