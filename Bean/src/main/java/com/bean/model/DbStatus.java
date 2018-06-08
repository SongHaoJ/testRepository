package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbStatus implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.SID
     *
     * @mbg.generated
     */
    private BigDecimal sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.FLAG
     *
     * @mbg.generated
     */
    private BigDecimal flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.SORT
     *
     * @mbg.generated
     */
    private BigDecimal sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_status.CHECKFLAG
     *
     * @mbg.generated
     */
    private String checkflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_status
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.SID
     *
     * @return the value of db_status.SID
     *
     * @mbg.generated
     */
    public BigDecimal getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.SID
     *
     * @param sid the value for db_status.SID
     *
     * @mbg.generated
     */
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.NAME
     *
     * @return the value of db_status.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.NAME
     *
     * @param name the value for db_status.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.OPER
     *
     * @return the value of db_status.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.OPER
     *
     * @param oper the value for db_status.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.CORPID
     *
     * @return the value of db_status.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.CORPID
     *
     * @param corpid the value for db_status.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.CREATETIME
     *
     * @return the value of db_status.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.CREATETIME
     *
     * @param createtime the value for db_status.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.FLAG
     *
     * @return the value of db_status.FLAG
     *
     * @mbg.generated
     */
    public BigDecimal getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.FLAG
     *
     * @param flag the value for db_status.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.SORT
     *
     * @return the value of db_status.SORT
     *
     * @mbg.generated
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.SORT
     *
     * @param sort the value for db_status.SORT
     *
     * @mbg.generated
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_status.CHECKFLAG
     *
     * @return the value of db_status.CHECKFLAG
     *
     * @mbg.generated
     */
    public String getCheckflag() {
        return checkflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_status.CHECKFLAG
     *
     * @param checkflag the value for db_status.CHECKFLAG
     *
     * @mbg.generated
     */
    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag == null ? null : checkflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
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
        DbStatus other = (DbStatus) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
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
        sb.append(", name=").append(name);
        sb.append(", oper=").append(oper);
        sb.append(", corpid=").append(corpid);
        sb.append(", createtime=").append(createtime);
        sb.append(", flag=").append(flag);
        sb.append(", sort=").append(sort);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}