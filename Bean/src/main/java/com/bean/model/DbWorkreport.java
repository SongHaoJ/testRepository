package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbWorkreport implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORKATTRIBUTEID
     *
     * @mbg.generated
     */
    private BigDecimal workattributeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORKMOULDID
     *
     * @mbg.generated
     */
    private BigDecimal workmouldid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.CREATEOPER
     *
     * @mbg.generated
     */
    private String createoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.FLAG
     *
     * @mbg.generated
     */
    private BigDecimal flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.STATUS
     *
     * @mbg.generated
     */
    private BigDecimal status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.PROTOCOLTIME1
     *
     * @mbg.generated
     */
    private String protocoltime1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.PROTOCOLTIME2
     *
     * @mbg.generated
     */
    private String protocoltime2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.ALERTFLAG
     *
     * @mbg.generated
     */
    private BigDecimal alertflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.FILEURL
     *
     * @mbg.generated
     */
    private String fileurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.TITLE
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORKMOULD
     *
     * @mbg.generated
     */
    private String workmould;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORK1
     *
     * @mbg.generated
     */
    private String work1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORK2
     *
     * @mbg.generated
     */
    private String work2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORK3
     *
     * @mbg.generated
     */
    private String work3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORK4
     *
     * @mbg.generated
     */
    private String work4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORK5
     *
     * @mbg.generated
     */
    private String work5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WORK6
     *
     * @mbg.generated
     */
    private String work6;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.WARMOPER
     *
     * @mbg.generated
     */
    private String warmoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_workreport.UPDATEFLAG
     *
     * @mbg.generated
     */
    private String updateflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_workreport
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.SEQUENCEID
     *
     * @return the value of db_workreport.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.SEQUENCEID
     *
     * @param sequenceid the value for db_workreport.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORKATTRIBUTEID
     *
     * @return the value of db_workreport.WORKATTRIBUTEID
     *
     * @mbg.generated
     */
    public BigDecimal getWorkattributeid() {
        return workattributeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORKATTRIBUTEID
     *
     * @param workattributeid the value for db_workreport.WORKATTRIBUTEID
     *
     * @mbg.generated
     */
    public void setWorkattributeid(BigDecimal workattributeid) {
        this.workattributeid = workattributeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORKMOULDID
     *
     * @return the value of db_workreport.WORKMOULDID
     *
     * @mbg.generated
     */
    public BigDecimal getWorkmouldid() {
        return workmouldid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORKMOULDID
     *
     * @param workmouldid the value for db_workreport.WORKMOULDID
     *
     * @mbg.generated
     */
    public void setWorkmouldid(BigDecimal workmouldid) {
        this.workmouldid = workmouldid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.CREATEOPER
     *
     * @return the value of db_workreport.CREATEOPER
     *
     * @mbg.generated
     */
    public String getCreateoper() {
        return createoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.CREATEOPER
     *
     * @param createoper the value for db_workreport.CREATEOPER
     *
     * @mbg.generated
     */
    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.CREATETIME
     *
     * @return the value of db_workreport.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.CREATETIME
     *
     * @param createtime the value for db_workreport.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.OPERTIME
     *
     * @return the value of db_workreport.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.OPERTIME
     *
     * @param opertime the value for db_workreport.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.FLAG
     *
     * @return the value of db_workreport.FLAG
     *
     * @mbg.generated
     */
    public BigDecimal getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.FLAG
     *
     * @param flag the value for db_workreport.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.CORPID
     *
     * @return the value of db_workreport.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.CORPID
     *
     * @param corpid the value for db_workreport.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.OPENFLAG
     *
     * @return the value of db_workreport.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.OPENFLAG
     *
     * @param openflag the value for db_workreport.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.OPER
     *
     * @return the value of db_workreport.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.OPER
     *
     * @param oper the value for db_workreport.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.STATUS
     *
     * @return the value of db_workreport.STATUS
     *
     * @mbg.generated
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.STATUS
     *
     * @param status the value for db_workreport.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.PROTOCOLTIME1
     *
     * @return the value of db_workreport.PROTOCOLTIME1
     *
     * @mbg.generated
     */
    public String getProtocoltime1() {
        return protocoltime1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.PROTOCOLTIME1
     *
     * @param protocoltime1 the value for db_workreport.PROTOCOLTIME1
     *
     * @mbg.generated
     */
    public void setProtocoltime1(String protocoltime1) {
        this.protocoltime1 = protocoltime1 == null ? null : protocoltime1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.PROTOCOLTIME2
     *
     * @return the value of db_workreport.PROTOCOLTIME2
     *
     * @mbg.generated
     */
    public String getProtocoltime2() {
        return protocoltime2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.PROTOCOLTIME2
     *
     * @param protocoltime2 the value for db_workreport.PROTOCOLTIME2
     *
     * @mbg.generated
     */
    public void setProtocoltime2(String protocoltime2) {
        this.protocoltime2 = protocoltime2 == null ? null : protocoltime2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.ALERTFLAG
     *
     * @return the value of db_workreport.ALERTFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getAlertflag() {
        return alertflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.ALERTFLAG
     *
     * @param alertflag the value for db_workreport.ALERTFLAG
     *
     * @mbg.generated
     */
    public void setAlertflag(BigDecimal alertflag) {
        this.alertflag = alertflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.FILEURL
     *
     * @return the value of db_workreport.FILEURL
     *
     * @mbg.generated
     */
    public String getFileurl() {
        return fileurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.FILEURL
     *
     * @param fileurl the value for db_workreport.FILEURL
     *
     * @mbg.generated
     */
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.TITLE
     *
     * @return the value of db_workreport.TITLE
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.TITLE
     *
     * @param title the value for db_workreport.TITLE
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORKMOULD
     *
     * @return the value of db_workreport.WORKMOULD
     *
     * @mbg.generated
     */
    public String getWorkmould() {
        return workmould;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORKMOULD
     *
     * @param workmould the value for db_workreport.WORKMOULD
     *
     * @mbg.generated
     */
    public void setWorkmould(String workmould) {
        this.workmould = workmould == null ? null : workmould.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORK1
     *
     * @return the value of db_workreport.WORK1
     *
     * @mbg.generated
     */
    public String getWork1() {
        return work1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORK1
     *
     * @param work1 the value for db_workreport.WORK1
     *
     * @mbg.generated
     */
    public void setWork1(String work1) {
        this.work1 = work1 == null ? null : work1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORK2
     *
     * @return the value of db_workreport.WORK2
     *
     * @mbg.generated
     */
    public String getWork2() {
        return work2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORK2
     *
     * @param work2 the value for db_workreport.WORK2
     *
     * @mbg.generated
     */
    public void setWork2(String work2) {
        this.work2 = work2 == null ? null : work2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORK3
     *
     * @return the value of db_workreport.WORK3
     *
     * @mbg.generated
     */
    public String getWork3() {
        return work3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORK3
     *
     * @param work3 the value for db_workreport.WORK3
     *
     * @mbg.generated
     */
    public void setWork3(String work3) {
        this.work3 = work3 == null ? null : work3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORK4
     *
     * @return the value of db_workreport.WORK4
     *
     * @mbg.generated
     */
    public String getWork4() {
        return work4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORK4
     *
     * @param work4 the value for db_workreport.WORK4
     *
     * @mbg.generated
     */
    public void setWork4(String work4) {
        this.work4 = work4 == null ? null : work4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORK5
     *
     * @return the value of db_workreport.WORK5
     *
     * @mbg.generated
     */
    public String getWork5() {
        return work5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORK5
     *
     * @param work5 the value for db_workreport.WORK5
     *
     * @mbg.generated
     */
    public void setWork5(String work5) {
        this.work5 = work5 == null ? null : work5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WORK6
     *
     * @return the value of db_workreport.WORK6
     *
     * @mbg.generated
     */
    public String getWork6() {
        return work6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WORK6
     *
     * @param work6 the value for db_workreport.WORK6
     *
     * @mbg.generated
     */
    public void setWork6(String work6) {
        this.work6 = work6 == null ? null : work6.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.WARMOPER
     *
     * @return the value of db_workreport.WARMOPER
     *
     * @mbg.generated
     */
    public String getWarmoper() {
        return warmoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.WARMOPER
     *
     * @param warmoper the value for db_workreport.WARMOPER
     *
     * @mbg.generated
     */
    public void setWarmoper(String warmoper) {
        this.warmoper = warmoper == null ? null : warmoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.CONTENT
     *
     * @return the value of db_workreport.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.CONTENT
     *
     * @param content the value for db_workreport.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_workreport.UPDATEFLAG
     *
     * @return the value of db_workreport.UPDATEFLAG
     *
     * @mbg.generated
     */
    public String getUpdateflag() {
        return updateflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_workreport.UPDATEFLAG
     *
     * @param updateflag the value for db_workreport.UPDATEFLAG
     *
     * @mbg.generated
     */
    public void setUpdateflag(String updateflag) {
        this.updateflag = updateflag == null ? null : updateflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_workreport
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_workreport
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_workreport
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