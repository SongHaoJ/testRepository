package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbStatusconfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_statusconfig.SID
     *
     * @mbg.generated
     */
    private BigDecimal sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_statusconfig.STATUSID
     *
     * @mbg.generated
     */
    private BigDecimal statusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_statusconfig.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_statusconfig.FLAG
     *
     * @mbg.generated
     */
    private BigDecimal flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_statusconfig.FOLLOWOPER
     *
     * @mbg.generated
     */
    private String followoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_statusconfig.FOLLOWTIME
     *
     * @mbg.generated
     */
    private Date followtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_statusconfig
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_statusconfig.SID
     *
     * @return the value of db_statusconfig.SID
     *
     * @mbg.generated
     */
    public BigDecimal getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_statusconfig.SID
     *
     * @param sid the value for db_statusconfig.SID
     *
     * @mbg.generated
     */
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_statusconfig.STATUSID
     *
     * @return the value of db_statusconfig.STATUSID
     *
     * @mbg.generated
     */
    public BigDecimal getStatusid() {
        return statusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_statusconfig.STATUSID
     *
     * @param statusid the value for db_statusconfig.STATUSID
     *
     * @mbg.generated
     */
    public void setStatusid(BigDecimal statusid) {
        this.statusid = statusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_statusconfig.NAME
     *
     * @return the value of db_statusconfig.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_statusconfig.NAME
     *
     * @param name the value for db_statusconfig.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_statusconfig.FLAG
     *
     * @return the value of db_statusconfig.FLAG
     *
     * @mbg.generated
     */
    public BigDecimal getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_statusconfig.FLAG
     *
     * @param flag the value for db_statusconfig.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_statusconfig.FOLLOWOPER
     *
     * @return the value of db_statusconfig.FOLLOWOPER
     *
     * @mbg.generated
     */
    public String getFollowoper() {
        return followoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_statusconfig.FOLLOWOPER
     *
     * @param followoper the value for db_statusconfig.FOLLOWOPER
     *
     * @mbg.generated
     */
    public void setFollowoper(String followoper) {
        this.followoper = followoper == null ? null : followoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_statusconfig.FOLLOWTIME
     *
     * @return the value of db_statusconfig.FOLLOWTIME
     *
     * @mbg.generated
     */
    public Date getFollowtime() {
        return followtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_statusconfig.FOLLOWTIME
     *
     * @param followtime the value for db_statusconfig.FOLLOWTIME
     *
     * @mbg.generated
     */
    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_statusconfig
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
        DbStatusconfig other = (DbStatusconfig) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getStatusid() == null ? other.getStatusid() == null : this.getStatusid().equals(other.getStatusid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getFollowoper() == null ? other.getFollowoper() == null : this.getFollowoper().equals(other.getFollowoper()))
            && (this.getFollowtime() == null ? other.getFollowtime() == null : this.getFollowtime().equals(other.getFollowtime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_statusconfig
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getStatusid() == null) ? 0 : getStatusid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getFollowoper() == null) ? 0 : getFollowoper().hashCode());
        result = prime * result + ((getFollowtime() == null) ? 0 : getFollowtime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_statusconfig
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
        sb.append(", statusid=").append(statusid);
        sb.append(", name=").append(name);
        sb.append(", flag=").append(flag);
        sb.append(", followoper=").append(followoper);
        sb.append(", followtime=").append(followtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}