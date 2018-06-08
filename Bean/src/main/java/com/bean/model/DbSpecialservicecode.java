package com.bean.model;

import java.io.Serializable;

public class DbSpecialservicecode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_specialservicecode.SERVICECODE
     *
     * @mbg.generated
     */
    private String servicecode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_specialservicecode.SERVICENAME
     *
     * @mbg.generated
     */
    private String servicename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_specialservicecode.SERVICEGROUPCODE
     *
     * @mbg.generated
     */
    private String servicegroupcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_specialservicecode.CHARGECODETYPECODE
     *
     * @mbg.generated
     */
    private String chargecodetypecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_specialservicecode
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_specialservicecode.SERVICECODE
     *
     * @return the value of db_specialservicecode.SERVICECODE
     *
     * @mbg.generated
     */
    public String getServicecode() {
        return servicecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_specialservicecode.SERVICECODE
     *
     * @param servicecode the value for db_specialservicecode.SERVICECODE
     *
     * @mbg.generated
     */
    public void setServicecode(String servicecode) {
        this.servicecode = servicecode == null ? null : servicecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_specialservicecode.SERVICENAME
     *
     * @return the value of db_specialservicecode.SERVICENAME
     *
     * @mbg.generated
     */
    public String getServicename() {
        return servicename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_specialservicecode.SERVICENAME
     *
     * @param servicename the value for db_specialservicecode.SERVICENAME
     *
     * @mbg.generated
     */
    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_specialservicecode.SERVICEGROUPCODE
     *
     * @return the value of db_specialservicecode.SERVICEGROUPCODE
     *
     * @mbg.generated
     */
    public String getServicegroupcode() {
        return servicegroupcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_specialservicecode.SERVICEGROUPCODE
     *
     * @param servicegroupcode the value for db_specialservicecode.SERVICEGROUPCODE
     *
     * @mbg.generated
     */
    public void setServicegroupcode(String servicegroupcode) {
        this.servicegroupcode = servicegroupcode == null ? null : servicegroupcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_specialservicecode.CHARGECODETYPECODE
     *
     * @return the value of db_specialservicecode.CHARGECODETYPECODE
     *
     * @mbg.generated
     */
    public String getChargecodetypecode() {
        return chargecodetypecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_specialservicecode.CHARGECODETYPECODE
     *
     * @param chargecodetypecode the value for db_specialservicecode.CHARGECODETYPECODE
     *
     * @mbg.generated
     */
    public void setChargecodetypecode(String chargecodetypecode) {
        this.chargecodetypecode = chargecodetypecode == null ? null : chargecodetypecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_specialservicecode
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
        DbSpecialservicecode other = (DbSpecialservicecode) that;
        return (this.getServicecode() == null ? other.getServicecode() == null : this.getServicecode().equals(other.getServicecode()))
            && (this.getServicename() == null ? other.getServicename() == null : this.getServicename().equals(other.getServicename()))
            && (this.getServicegroupcode() == null ? other.getServicegroupcode() == null : this.getServicegroupcode().equals(other.getServicegroupcode()))
            && (this.getChargecodetypecode() == null ? other.getChargecodetypecode() == null : this.getChargecodetypecode().equals(other.getChargecodetypecode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_specialservicecode
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServicecode() == null) ? 0 : getServicecode().hashCode());
        result = prime * result + ((getServicename() == null) ? 0 : getServicename().hashCode());
        result = prime * result + ((getServicegroupcode() == null) ? 0 : getServicegroupcode().hashCode());
        result = prime * result + ((getChargecodetypecode() == null) ? 0 : getChargecodetypecode().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_specialservicecode
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", servicecode=").append(servicecode);
        sb.append(", servicename=").append(servicename);
        sb.append(", servicegroupcode=").append(servicegroupcode);
        sb.append(", chargecodetypecode=").append(chargecodetypecode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}