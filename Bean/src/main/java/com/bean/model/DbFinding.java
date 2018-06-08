package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbFinding implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.ID
     *
     * @mbg.generated
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.CATEGORYNAME
     *
     * @mbg.generated
     */
    private String categoryname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.TASKFLAG
     *
     * @mbg.generated
     */
    private BigDecimal taskflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.LASTRUNTIME
     *
     * @mbg.generated
     */
    private BigDecimal lastruntime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.FLAG
     *
     * @mbg.generated
     */
    private BigDecimal flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_finding.ITEMCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal itemcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_finding
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.ID
     *
     * @return the value of db_finding.ID
     *
     * @mbg.generated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.ID
     *
     * @param id the value for db_finding.ID
     *
     * @mbg.generated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.OPER
     *
     * @return the value of db_finding.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.OPER
     *
     * @param oper the value for db_finding.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.CONTENT
     *
     * @return the value of db_finding.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.CONTENT
     *
     * @param content the value for db_finding.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.OPENFLAG
     *
     * @return the value of db_finding.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.OPENFLAG
     *
     * @param openflag the value for db_finding.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.CATEGORYNAME
     *
     * @return the value of db_finding.CATEGORYNAME
     *
     * @mbg.generated
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.CATEGORYNAME
     *
     * @param categoryname the value for db_finding.CATEGORYNAME
     *
     * @mbg.generated
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.RESERVE3
     *
     * @return the value of db_finding.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.RESERVE3
     *
     * @param reserve3 the value for db_finding.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.RESERVE2
     *
     * @return the value of db_finding.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.RESERVE2
     *
     * @param reserve2 the value for db_finding.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.CREATETIME
     *
     * @return the value of db_finding.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.CREATETIME
     *
     * @param createtime the value for db_finding.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.RESERVE1
     *
     * @return the value of db_finding.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.RESERVE1
     *
     * @param reserve1 the value for db_finding.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.OPERTIME
     *
     * @return the value of db_finding.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.OPERTIME
     *
     * @param opertime the value for db_finding.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.TASKFLAG
     *
     * @return the value of db_finding.TASKFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getTaskflag() {
        return taskflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.TASKFLAG
     *
     * @param taskflag the value for db_finding.TASKFLAG
     *
     * @mbg.generated
     */
    public void setTaskflag(BigDecimal taskflag) {
        this.taskflag = taskflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.LASTRUNTIME
     *
     * @return the value of db_finding.LASTRUNTIME
     *
     * @mbg.generated
     */
    public BigDecimal getLastruntime() {
        return lastruntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.LASTRUNTIME
     *
     * @param lastruntime the value for db_finding.LASTRUNTIME
     *
     * @mbg.generated
     */
    public void setLastruntime(BigDecimal lastruntime) {
        this.lastruntime = lastruntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.FLAG
     *
     * @return the value of db_finding.FLAG
     *
     * @mbg.generated
     */
    public BigDecimal getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.FLAG
     *
     * @param flag the value for db_finding.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_finding.ITEMCOUNT
     *
     * @return the value of db_finding.ITEMCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getItemcount() {
        return itemcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_finding.ITEMCOUNT
     *
     * @param itemcount the value for db_finding.ITEMCOUNT
     *
     * @mbg.generated
     */
    public void setItemcount(BigDecimal itemcount) {
        this.itemcount = itemcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_finding
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
        DbFinding other = (DbFinding) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTaskflag() == null ? other.getTaskflag() == null : this.getTaskflag().equals(other.getTaskflag()))
            && (this.getLastruntime() == null ? other.getLastruntime() == null : this.getLastruntime().equals(other.getLastruntime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getItemcount() == null ? other.getItemcount() == null : this.getItemcount().equals(other.getItemcount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_finding
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTaskflag() == null) ? 0 : getTaskflag().hashCode());
        result = prime * result + ((getLastruntime() == null) ? 0 : getLastruntime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getItemcount() == null) ? 0 : getItemcount().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_finding
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
        sb.append(", oper=").append(oper);
        sb.append(", content=").append(content);
        sb.append(", openflag=").append(openflag);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", createtime=").append(createtime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", opertime=").append(opertime);
        sb.append(", taskflag=").append(taskflag);
        sb.append(", lastruntime=").append(lastruntime);
        sb.append(", flag=").append(flag);
        sb.append(", itemcount=").append(itemcount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}