package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProjectbbs implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal limittime;

    private String principaloper;

    private String oper;

    private Date opertime;

    private String createoper;

    private Date createtime;

    private String corpid;

    private String opernflag;

    private BigDecimal percentage;

    private BigDecimal clipartflag;

    private BigDecimal salesflag;

    private BigDecimal checkflag;

    private Date estimatedstarttime;

    private Date estimatedendtime;

    private Date starttime;

    private Date endtime;

    private BigDecimal status;

    private String projectname;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getLimittime() {
        return limittime;
    }

    public void setLimittime(BigDecimal limittime) {
        this.limittime = limittime;
    }

    public String getPrincipaloper() {
        return principaloper;
    }

    public void setPrincipaloper(String principaloper) {
        this.principaloper = principaloper == null ? null : principaloper.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpernflag() {
        return opernflag;
    }

    public void setOpernflag(String opernflag) {
        this.opernflag = opernflag == null ? null : opernflag.trim();
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getClipartflag() {
        return clipartflag;
    }

    public void setClipartflag(BigDecimal clipartflag) {
        this.clipartflag = clipartflag;
    }

    public BigDecimal getSalesflag() {
        return salesflag;
    }

    public void setSalesflag(BigDecimal salesflag) {
        this.salesflag = salesflag;
    }

    public BigDecimal getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(BigDecimal checkflag) {
        this.checkflag = checkflag;
    }

    public Date getEstimatedstarttime() {
        return estimatedstarttime;
    }

    public void setEstimatedstarttime(Date estimatedstarttime) {
        this.estimatedstarttime = estimatedstarttime;
    }

    public Date getEstimatedendtime() {
        return estimatedendtime;
    }

    public void setEstimatedendtime(Date estimatedendtime) {
        this.estimatedendtime = estimatedendtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

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