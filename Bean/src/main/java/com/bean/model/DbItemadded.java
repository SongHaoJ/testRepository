package com.bean.model;

import java.io.Serializable;

public class DbItemadded implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_itemadded.ITEMID
     *
     * @mbg.generated
     */
    private String itemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_itemadded
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_itemadded.ITEMID
     *
     * @return the value of db_itemadded.ITEMID
     *
     * @mbg.generated
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_itemadded.ITEMID
     *
     * @param itemid the value for db_itemadded.ITEMID
     *
     * @mbg.generated
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemadded
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
        DbItemadded other = (DbItemadded) that;
        return (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemadded
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemadded
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemid=").append(itemid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}