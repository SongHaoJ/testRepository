package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProjectbbs implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.LIMITTIME
     *
     * @mbg.generated
     */
    private BigDecimal limittime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.PRINCIPALOPER
     *
     * @mbg.generated
     */
    private String principaloper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.CREATEOPER
     *
     * @mbg.generated
     */
    private String createoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.OPERNFLAG
     *
     * @mbg.generated
     */
    private String opernflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.PERCENTAGE
     *
     * @mbg.generated
     */
    private BigDecimal percentage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.CLIPARTFLAG
     *
     * @mbg.generated
     */
    private BigDecimal clipartflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.SALESFLAG
     *
     * @mbg.generated
     */
    private BigDecimal salesflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.CHECKFLAG
     *
     * @mbg.generated
     */
    private BigDecimal checkflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.ESTIMATEDSTARTTIME
     *
     * @mbg.generated
     */
    private Date estimatedstarttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.ESTIMATEDENDTIME
     *
     * @mbg.generated
     */
    private Date estimatedendtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.STARTTIME
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.ENDTIME
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.STATUS
     *
     * @mbg.generated
     */
    private BigDecimal status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_projectbbs.PROJECTNAME
     *
     * @mbg.generated
     */
    private String projectname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_projectbbs
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.SEQUENCEID
     *
     * @return the value of db_projectbbs.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.SEQUENCEID
     *
     * @param sequenceid the value for db_projectbbs.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.LIMITTIME
     *
     * @return the value of db_projectbbs.LIMITTIME
     *
     * @mbg.generated
     */
    public BigDecimal getLimittime() {
        return limittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.LIMITTIME
     *
     * @param limittime the value for db_projectbbs.LIMITTIME
     *
     * @mbg.generated
     */
    public void setLimittime(BigDecimal limittime) {
        this.limittime = limittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.PRINCIPALOPER
     *
     * @return the value of db_projectbbs.PRINCIPALOPER
     *
     * @mbg.generated
     */
    public String getPrincipaloper() {
        return principaloper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.PRINCIPALOPER
     *
     * @param principaloper the value for db_projectbbs.PRINCIPALOPER
     *
     * @mbg.generated
     */
    public void setPrincipaloper(String principaloper) {
        this.principaloper = principaloper == null ? null : principaloper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.OPER
     *
     * @return the value of db_projectbbs.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.OPER
     *
     * @param oper the value for db_projectbbs.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.OPERTIME
     *
     * @return the value of db_projectbbs.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.OPERTIME
     *
     * @param opertime the value for db_projectbbs.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.CREATEOPER
     *
     * @return the value of db_projectbbs.CREATEOPER
     *
     * @mbg.generated
     */
    public String getCreateoper() {
        return createoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.CREATEOPER
     *
     * @param createoper the value for db_projectbbs.CREATEOPER
     *
     * @mbg.generated
     */
    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.CREATETIME
     *
     * @return the value of db_projectbbs.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.CREATETIME
     *
     * @param createtime the value for db_projectbbs.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.CORPID
     *
     * @return the value of db_projectbbs.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.CORPID
     *
     * @param corpid the value for db_projectbbs.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.OPERNFLAG
     *
     * @return the value of db_projectbbs.OPERNFLAG
     *
     * @mbg.generated
     */
    public String getOpernflag() {
        return opernflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.OPERNFLAG
     *
     * @param opernflag the value for db_projectbbs.OPERNFLAG
     *
     * @mbg.generated
     */
    public void setOpernflag(String opernflag) {
        this.opernflag = opernflag == null ? null : opernflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.PERCENTAGE
     *
     * @return the value of db_projectbbs.PERCENTAGE
     *
     * @mbg.generated
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.PERCENTAGE
     *
     * @param percentage the value for db_projectbbs.PERCENTAGE
     *
     * @mbg.generated
     */
    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.CLIPARTFLAG
     *
     * @return the value of db_projectbbs.CLIPARTFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getClipartflag() {
        return clipartflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.CLIPARTFLAG
     *
     * @param clipartflag the value for db_projectbbs.CLIPARTFLAG
     *
     * @mbg.generated
     */
    public void setClipartflag(BigDecimal clipartflag) {
        this.clipartflag = clipartflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.SALESFLAG
     *
     * @return the value of db_projectbbs.SALESFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getSalesflag() {
        return salesflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.SALESFLAG
     *
     * @param salesflag the value for db_projectbbs.SALESFLAG
     *
     * @mbg.generated
     */
    public void setSalesflag(BigDecimal salesflag) {
        this.salesflag = salesflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.CHECKFLAG
     *
     * @return the value of db_projectbbs.CHECKFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getCheckflag() {
        return checkflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.CHECKFLAG
     *
     * @param checkflag the value for db_projectbbs.CHECKFLAG
     *
     * @mbg.generated
     */
    public void setCheckflag(BigDecimal checkflag) {
        this.checkflag = checkflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.ESTIMATEDSTARTTIME
     *
     * @return the value of db_projectbbs.ESTIMATEDSTARTTIME
     *
     * @mbg.generated
     */
    public Date getEstimatedstarttime() {
        return estimatedstarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.ESTIMATEDSTARTTIME
     *
     * @param estimatedstarttime the value for db_projectbbs.ESTIMATEDSTARTTIME
     *
     * @mbg.generated
     */
    public void setEstimatedstarttime(Date estimatedstarttime) {
        this.estimatedstarttime = estimatedstarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.ESTIMATEDENDTIME
     *
     * @return the value of db_projectbbs.ESTIMATEDENDTIME
     *
     * @mbg.generated
     */
    public Date getEstimatedendtime() {
        return estimatedendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.ESTIMATEDENDTIME
     *
     * @param estimatedendtime the value for db_projectbbs.ESTIMATEDENDTIME
     *
     * @mbg.generated
     */
    public void setEstimatedendtime(Date estimatedendtime) {
        this.estimatedendtime = estimatedendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.STARTTIME
     *
     * @return the value of db_projectbbs.STARTTIME
     *
     * @mbg.generated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.STARTTIME
     *
     * @param starttime the value for db_projectbbs.STARTTIME
     *
     * @mbg.generated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.ENDTIME
     *
     * @return the value of db_projectbbs.ENDTIME
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.ENDTIME
     *
     * @param endtime the value for db_projectbbs.ENDTIME
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.STATUS
     *
     * @return the value of db_projectbbs.STATUS
     *
     * @mbg.generated
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.STATUS
     *
     * @param status the value for db_projectbbs.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_projectbbs.PROJECTNAME
     *
     * @return the value of db_projectbbs.PROJECTNAME
     *
     * @mbg.generated
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_projectbbs.PROJECTNAME
     *
     * @param projectname the value for db_projectbbs.PROJECTNAME
     *
     * @mbg.generated
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectbbs
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
        DbProjectbbs other = (DbProjectbbs) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getLimittime() == null ? other.getLimittime() == null : this.getLimittime().equals(other.getLimittime()))
            && (this.getPrincipaloper() == null ? other.getPrincipaloper() == null : this.getPrincipaloper().equals(other.getPrincipaloper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpernflag() == null ? other.getOpernflag() == null : this.getOpernflag().equals(other.getOpernflag()))
            && (this.getPercentage() == null ? other.getPercentage() == null : this.getPercentage().equals(other.getPercentage()))
            && (this.getClipartflag() == null ? other.getClipartflag() == null : this.getClipartflag().equals(other.getClipartflag()))
            && (this.getSalesflag() == null ? other.getSalesflag() == null : this.getSalesflag().equals(other.getSalesflag()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()))
            && (this.getEstimatedstarttime() == null ? other.getEstimatedstarttime() == null : this.getEstimatedstarttime().equals(other.getEstimatedstarttime()))
            && (this.getEstimatedendtime() == null ? other.getEstimatedendtime() == null : this.getEstimatedendtime().equals(other.getEstimatedendtime()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProjectname() == null ? other.getProjectname() == null : this.getProjectname().equals(other.getProjectname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectbbs
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getLimittime() == null) ? 0 : getLimittime().hashCode());
        result = prime * result + ((getPrincipaloper() == null) ? 0 : getPrincipaloper().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpernflag() == null) ? 0 : getOpernflag().hashCode());
        result = prime * result + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        result = prime * result + ((getClipartflag() == null) ? 0 : getClipartflag().hashCode());
        result = prime * result + ((getSalesflag() == null) ? 0 : getSalesflag().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        result = prime * result + ((getEstimatedstarttime() == null) ? 0 : getEstimatedstarttime().hashCode());
        result = prime * result + ((getEstimatedendtime() == null) ? 0 : getEstimatedendtime().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getProjectname() == null) ? 0 : getProjectname().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectbbs
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", limittime=").append(limittime);
        sb.append(", principaloper=").append(principaloper);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", corpid=").append(corpid);
        sb.append(", opernflag=").append(opernflag);
        sb.append(", percentage=").append(percentage);
        sb.append(", clipartflag=").append(clipartflag);
        sb.append(", salesflag=").append(salesflag);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", estimatedstarttime=").append(estimatedstarttime);
        sb.append(", estimatedendtime=").append(estimatedendtime);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", status=").append(status);
        sb.append(", projectname=").append(projectname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}