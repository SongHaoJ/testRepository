package com.bean.model;

import java.io.Serializable;

public class DbShiptolocation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shiptolocation.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shiptolocation.EBAYITEMID
     *
     * @mbg.generated
     */
    private String ebayitemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shiptolocation.EBAYSHIPTO
     *
     * @mbg.generated
     */
    private String ebayshipto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shiptolocation.FLAG
     *
     * @mbg.generated
     */
    private String flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shiptolocation.SID
     *
     * @return the value of db_shiptolocation.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shiptolocation.SID
     *
     * @param sid the value for db_shiptolocation.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shiptolocation.EBAYITEMID
     *
     * @return the value of db_shiptolocation.EBAYITEMID
     *
     * @mbg.generated
     */
    public String getEbayitemid() {
        return ebayitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shiptolocation.EBAYITEMID
     *
     * @param ebayitemid the value for db_shiptolocation.EBAYITEMID
     *
     * @mbg.generated
     */
    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shiptolocation.EBAYSHIPTO
     *
     * @return the value of db_shiptolocation.EBAYSHIPTO
     *
     * @mbg.generated
     */
    public String getEbayshipto() {
        return ebayshipto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shiptolocation.EBAYSHIPTO
     *
     * @param ebayshipto the value for db_shiptolocation.EBAYSHIPTO
     *
     * @mbg.generated
     */
    public void setEbayshipto(String ebayshipto) {
        this.ebayshipto = ebayshipto == null ? null : ebayshipto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shiptolocation.FLAG
     *
     * @return the value of db_shiptolocation.FLAG
     *
     * @mbg.generated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shiptolocation.FLAG
     *
     * @param flag the value for db_shiptolocation.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
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
        DbShiptolocation other = (DbShiptolocation) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbayshipto() == null ? other.getEbayshipto() == null : this.getEbayshipto().equals(other.getEbayshipto()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbayshipto() == null) ? 0 : getEbayshipto().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
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
        sb.append(", ebayshipto=").append(ebayshipto);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}