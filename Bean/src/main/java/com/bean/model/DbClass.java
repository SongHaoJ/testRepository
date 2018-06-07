package com.bean.model;

import java.io.Serializable;

public class DbClass implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_class.ID
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_class.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_class.SPCODE
     *
     * @mbg.generated
     */
    private String spcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_class.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_class.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_class.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_class
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_class.ID
     *
     * @return the value of db_class.ID
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_class.ID
     *
     * @param id the value for db_class.ID
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_class.NAME
     *
     * @return the value of db_class.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_class.NAME
     *
     * @param name the value for db_class.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_class.SPCODE
     *
     * @return the value of db_class.SPCODE
     *
     * @mbg.generated
     */
    public String getSpcode() {
        return spcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_class.SPCODE
     *
     * @param spcode the value for db_class.SPCODE
     *
     * @mbg.generated
     */
    public void setSpcode(String spcode) {
        this.spcode = spcode == null ? null : spcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_class.RESERVE1
     *
     * @return the value of db_class.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_class.RESERVE1
     *
     * @param reserve1 the value for db_class.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_class.RESERVE2
     *
     * @return the value of db_class.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_class.RESERVE2
     *
     * @param reserve2 the value for db_class.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_class.DESCR
     *
     * @return the value of db_class.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_class.DESCR
     *
     * @param descr the value for db_class.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_class
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
        DbClass other = (DbClass) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSpcode() == null ? other.getSpcode() == null : this.getSpcode().equals(other.getSpcode()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_class
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSpcode() == null) ? 0 : getSpcode().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_class
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
        sb.append(", name=").append(name);
        sb.append(", spcode=").append(spcode);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}