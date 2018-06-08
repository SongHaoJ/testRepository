package com.bean.model;

import java.io.Serializable;

public class DbDownloadcount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_downloadcount.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_downloadcount.STRTIME
     *
     * @mbg.generated
     */
    private String strtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_downloadcount
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_downloadcount.SID
     *
     * @return the value of db_downloadcount.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_downloadcount.SID
     *
     * @param sid the value for db_downloadcount.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_downloadcount.STRTIME
     *
     * @return the value of db_downloadcount.STRTIME
     *
     * @mbg.generated
     */
    public String getStrtime() {
        return strtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_downloadcount.STRTIME
     *
     * @param strtime the value for db_downloadcount.STRTIME
     *
     * @mbg.generated
     */
    public void setStrtime(String strtime) {
        this.strtime = strtime == null ? null : strtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_downloadcount
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
        DbDownloadcount other = (DbDownloadcount) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getStrtime() == null ? other.getStrtime() == null : this.getStrtime().equals(other.getStrtime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_downloadcount
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getStrtime() == null) ? 0 : getStrtime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_downloadcount
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
        sb.append(", strtime=").append(strtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}