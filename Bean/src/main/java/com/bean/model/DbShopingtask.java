package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShopingtask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.ITEMID
     *
     * @mbg.generated
     */
    private BigDecimal itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.TASKID
     *
     * @mbg.generated
     */
    private BigDecimal taskid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.ITEMFLAG
     *
     * @mbg.generated
     */
    private BigDecimal itemflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.USERID
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.SITE
     *
     * @mbg.generated
     */
    private String site;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_shopingtask.LASTRUNTIME
     *
     * @mbg.generated
     */
    private BigDecimal lastruntime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_shopingtask
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.ITEMID
     *
     * @return the value of db_shopingtask.ITEMID
     *
     * @mbg.generated
     */
    public BigDecimal getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.ITEMID
     *
     * @param itemid the value for db_shopingtask.ITEMID
     *
     * @mbg.generated
     */
    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.TASKID
     *
     * @return the value of db_shopingtask.TASKID
     *
     * @mbg.generated
     */
    public BigDecimal getTaskid() {
        return taskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.TASKID
     *
     * @param taskid the value for db_shopingtask.TASKID
     *
     * @mbg.generated
     */
    public void setTaskid(BigDecimal taskid) {
        this.taskid = taskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.ITEMFLAG
     *
     * @return the value of db_shopingtask.ITEMFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getItemflag() {
        return itemflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.ITEMFLAG
     *
     * @param itemflag the value for db_shopingtask.ITEMFLAG
     *
     * @mbg.generated
     */
    public void setItemflag(BigDecimal itemflag) {
        this.itemflag = itemflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.OPER
     *
     * @return the value of db_shopingtask.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.OPER
     *
     * @param oper the value for db_shopingtask.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.CREATETIME
     *
     * @return the value of db_shopingtask.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.CREATETIME
     *
     * @param createtime the value for db_shopingtask.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.OPENFLAG
     *
     * @return the value of db_shopingtask.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.OPENFLAG
     *
     * @param openflag the value for db_shopingtask.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.USERID
     *
     * @return the value of db_shopingtask.USERID
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.USERID
     *
     * @param userid the value for db_shopingtask.USERID
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.OPERTIME
     *
     * @return the value of db_shopingtask.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.OPERTIME
     *
     * @param opertime the value for db_shopingtask.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.SITE
     *
     * @return the value of db_shopingtask.SITE
     *
     * @mbg.generated
     */
    public String getSite() {
        return site;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.SITE
     *
     * @param site the value for db_shopingtask.SITE
     *
     * @mbg.generated
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_shopingtask.LASTRUNTIME
     *
     * @return the value of db_shopingtask.LASTRUNTIME
     *
     * @mbg.generated
     */
    public BigDecimal getLastruntime() {
        return lastruntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_shopingtask.LASTRUNTIME
     *
     * @param lastruntime the value for db_shopingtask.LASTRUNTIME
     *
     * @mbg.generated
     */
    public void setLastruntime(BigDecimal lastruntime) {
        this.lastruntime = lastruntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopingtask
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
        DbShopingtask other = (DbShopingtask) that;
        return (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getItemflag() == null ? other.getItemflag() == null : this.getItemflag().equals(other.getItemflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getLastruntime() == null ? other.getLastruntime() == null : this.getLastruntime().equals(other.getLastruntime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopingtask
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getItemflag() == null) ? 0 : getItemflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getLastruntime() == null) ? 0 : getLastruntime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopingtask
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
        sb.append(", taskid=").append(taskid);
        sb.append(", itemflag=").append(itemflag);
        sb.append(", oper=").append(oper);
        sb.append(", createtime=").append(createtime);
        sb.append(", openflag=").append(openflag);
        sb.append(", userid=").append(userid);
        sb.append(", opertime=").append(opertime);
        sb.append(", site=").append(site);
        sb.append(", lastruntime=").append(lastruntime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}