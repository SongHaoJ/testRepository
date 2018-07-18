package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbWorkreport implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal workattributeid;

    private BigDecimal workmouldid;

    private String createoper;

    private Date createtime;

    private Date opertime;

    private BigDecimal flag;

    private String corpid;

    private BigDecimal openflag;

    private String oper;

    private BigDecimal status;

    private String protocoltime1;

    private String protocoltime2;

    private BigDecimal alertflag;

    private String fileurl;

    private String title;

    private String workmould;

    private String work1;

    private String work2;

    private String work3;

    private String work4;

    private String work5;

    private String work6;

    private String warmoper;

    private String content;

    private String updateflag;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getWorkattributeid() {
        return workattributeid;
    }

    public void setWorkattributeid(BigDecimal workattributeid) {
        this.workattributeid = workattributeid;
    }

    public BigDecimal getWorkmouldid() {
        return workmouldid;
    }

    public void setWorkmouldid(BigDecimal workmouldid) {
        this.workmouldid = workmouldid;
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

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getProtocoltime1() {
        return protocoltime1;
    }

    public void setProtocoltime1(String protocoltime1) {
        this.protocoltime1 = protocoltime1 == null ? null : protocoltime1.trim();
    }

    public String getProtocoltime2() {
        return protocoltime2;
    }

    public void setProtocoltime2(String protocoltime2) {
        this.protocoltime2 = protocoltime2 == null ? null : protocoltime2.trim();
    }

    public BigDecimal getAlertflag() {
        return alertflag;
    }

    public void setAlertflag(BigDecimal alertflag) {
        this.alertflag = alertflag;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getWorkmould() {
        return workmould;
    }

    public void setWorkmould(String workmould) {
        this.workmould = workmould == null ? null : workmould.trim();
    }

    public String getWork1() {
        return work1;
    }

    public void setWork1(String work1) {
        this.work1 = work1 == null ? null : work1.trim();
    }

    public String getWork2() {
        return work2;
    }

    public void setWork2(String work2) {
        this.work2 = work2 == null ? null : work2.trim();
    }

    public String getWork3() {
        return work3;
    }

    public void setWork3(String work3) {
        this.work3 = work3 == null ? null : work3.trim();
    }

    public String getWork4() {
        return work4;
    }

    public void setWork4(String work4) {
        this.work4 = work4 == null ? null : work4.trim();
    }

    public String getWork5() {
        return work5;
    }

    public void setWork5(String work5) {
        this.work5 = work5 == null ? null : work5.trim();
    }

    public String getWork6() {
        return work6;
    }

    public void setWork6(String work6) {
        this.work6 = work6 == null ? null : work6.trim();
    }

    public String getWarmoper() {
        return warmoper;
    }

    public void setWarmoper(String warmoper) {
        this.warmoper = warmoper == null ? null : warmoper.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(String updateflag) {
        this.updateflag = updateflag == null ? null : updateflag.trim();
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
        DbWorkreport other = (DbWorkreport) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getWorkattributeid() == null ? other.getWorkattributeid() == null : this.getWorkattributeid().equals(other.getWorkattributeid()))
            && (this.getWorkmouldid() == null ? other.getWorkmouldid() == null : this.getWorkmouldid().equals(other.getWorkmouldid()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProtocoltime1() == null ? other.getProtocoltime1() == null : this.getProtocoltime1().equals(other.getProtocoltime1()))
            && (this.getProtocoltime2() == null ? other.getProtocoltime2() == null : this.getProtocoltime2().equals(other.getProtocoltime2()))
            && (this.getAlertflag() == null ? other.getAlertflag() == null : this.getAlertflag().equals(other.getAlertflag()))
            && (this.getFileurl() == null ? other.getFileurl() == null : this.getFileurl().equals(other.getFileurl()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getWorkmould() == null ? other.getWorkmould() == null : this.getWorkmould().equals(other.getWorkmould()))
            && (this.getWork1() == null ? other.getWork1() == null : this.getWork1().equals(other.getWork1()))
            && (this.getWork2() == null ? other.getWork2() == null : this.getWork2().equals(other.getWork2()))
            && (this.getWork3() == null ? other.getWork3() == null : this.getWork3().equals(other.getWork3()))
            && (this.getWork4() == null ? other.getWork4() == null : this.getWork4().equals(other.getWork4()))
            && (this.getWork5() == null ? other.getWork5() == null : this.getWork5().equals(other.getWork5()))
            && (this.getWork6() == null ? other.getWork6() == null : this.getWork6().equals(other.getWork6()))
            && (this.getWarmoper() == null ? other.getWarmoper() == null : this.getWarmoper().equals(other.getWarmoper()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getWorkattributeid() == null) ? 0 : getWorkattributeid().hashCode());
        result = prime * result + ((getWorkmouldid() == null) ? 0 : getWorkmouldid().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getProtocoltime1() == null) ? 0 : getProtocoltime1().hashCode());
        result = prime * result + ((getProtocoltime2() == null) ? 0 : getProtocoltime2().hashCode());
        result = prime * result + ((getAlertflag() == null) ? 0 : getAlertflag().hashCode());
        result = prime * result + ((getFileurl() == null) ? 0 : getFileurl().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getWorkmould() == null) ? 0 : getWorkmould().hashCode());
        result = prime * result + ((getWork1() == null) ? 0 : getWork1().hashCode());
        result = prime * result + ((getWork2() == null) ? 0 : getWork2().hashCode());
        result = prime * result + ((getWork3() == null) ? 0 : getWork3().hashCode());
        result = prime * result + ((getWork4() == null) ? 0 : getWork4().hashCode());
        result = prime * result + ((getWork5() == null) ? 0 : getWork5().hashCode());
        result = prime * result + ((getWork6() == null) ? 0 : getWork6().hashCode());
        result = prime * result + ((getWarmoper() == null) ? 0 : getWarmoper().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", workattributeid=").append(workattributeid);
        sb.append(", workmouldid=").append(workmouldid);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", opertime=").append(opertime);
        sb.append(", flag=").append(flag);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", status=").append(status);
        sb.append(", protocoltime1=").append(protocoltime1);
        sb.append(", protocoltime2=").append(protocoltime2);
        sb.append(", alertflag=").append(alertflag);
        sb.append(", fileurl=").append(fileurl);
        sb.append(", title=").append(title);
        sb.append(", workmould=").append(workmould);
        sb.append(", work1=").append(work1);
        sb.append(", work2=").append(work2);
        sb.append(", work3=").append(work3);
        sb.append(", work4=").append(work4);
        sb.append(", work5=").append(work5);
        sb.append(", work6=").append(work6);
        sb.append(", warmoper=").append(warmoper);
        sb.append(", content=").append(content);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}