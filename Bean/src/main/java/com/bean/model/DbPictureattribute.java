package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPictureattribute implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.UPLOADFLAG
     *
     * @mbg.generated
     */
    private String uploadflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.FTPIP
     *
     * @mbg.generated
     */
    private String ftpip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.FTPUSERNAME
     *
     * @mbg.generated
     */
    private String ftpusername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.FTPPASSWORD
     *
     * @mbg.generated
     */
    private String ftppassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.RESERVE4
     *
     * @mbg.generated
     */
    private BigDecimal reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.RESERVE5
     *
     * @mbg.generated
     */
    private BigDecimal reserve5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.ATTRIBUTEID
     *
     * @mbg.generated
     */
    private String attributeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.THISURL
     *
     * @mbg.generated
     */
    private String thisurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_pictureattribute.FTPURL
     *
     * @mbg.generated
     */
    private String ftpurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_pictureattribute
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.SEQUENCEID
     *
     * @return the value of db_pictureattribute.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.SEQUENCEID
     *
     * @param sequenceid the value for db_pictureattribute.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.NAME
     *
     * @return the value of db_pictureattribute.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.NAME
     *
     * @param name the value for db_pictureattribute.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.UPLOADFLAG
     *
     * @return the value of db_pictureattribute.UPLOADFLAG
     *
     * @mbg.generated
     */
    public String getUploadflag() {
        return uploadflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.UPLOADFLAG
     *
     * @param uploadflag the value for db_pictureattribute.UPLOADFLAG
     *
     * @mbg.generated
     */
    public void setUploadflag(String uploadflag) {
        this.uploadflag = uploadflag == null ? null : uploadflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.FTPIP
     *
     * @return the value of db_pictureattribute.FTPIP
     *
     * @mbg.generated
     */
    public String getFtpip() {
        return ftpip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.FTPIP
     *
     * @param ftpip the value for db_pictureattribute.FTPIP
     *
     * @mbg.generated
     */
    public void setFtpip(String ftpip) {
        this.ftpip = ftpip == null ? null : ftpip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.FTPUSERNAME
     *
     * @return the value of db_pictureattribute.FTPUSERNAME
     *
     * @mbg.generated
     */
    public String getFtpusername() {
        return ftpusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.FTPUSERNAME
     *
     * @param ftpusername the value for db_pictureattribute.FTPUSERNAME
     *
     * @mbg.generated
     */
    public void setFtpusername(String ftpusername) {
        this.ftpusername = ftpusername == null ? null : ftpusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.FTPPASSWORD
     *
     * @return the value of db_pictureattribute.FTPPASSWORD
     *
     * @mbg.generated
     */
    public String getFtppassword() {
        return ftppassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.FTPPASSWORD
     *
     * @param ftppassword the value for db_pictureattribute.FTPPASSWORD
     *
     * @mbg.generated
     */
    public void setFtppassword(String ftppassword) {
        this.ftppassword = ftppassword == null ? null : ftppassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.RESERVE1
     *
     * @return the value of db_pictureattribute.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.RESERVE1
     *
     * @param reserve1 the value for db_pictureattribute.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.RESERVE2
     *
     * @return the value of db_pictureattribute.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.RESERVE2
     *
     * @param reserve2 the value for db_pictureattribute.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.RESERVE3
     *
     * @return the value of db_pictureattribute.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.RESERVE3
     *
     * @param reserve3 the value for db_pictureattribute.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.RESERVE4
     *
     * @return the value of db_pictureattribute.RESERVE4
     *
     * @mbg.generated
     */
    public BigDecimal getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.RESERVE4
     *
     * @param reserve4 the value for db_pictureattribute.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.RESERVE5
     *
     * @return the value of db_pictureattribute.RESERVE5
     *
     * @mbg.generated
     */
    public BigDecimal getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.RESERVE5
     *
     * @param reserve5 the value for db_pictureattribute.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.CORPID
     *
     * @return the value of db_pictureattribute.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.CORPID
     *
     * @param corpid the value for db_pictureattribute.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.OPENFLAG
     *
     * @return the value of db_pictureattribute.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.OPENFLAG
     *
     * @param openflag the value for db_pictureattribute.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.OPER
     *
     * @return the value of db_pictureattribute.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.OPER
     *
     * @param oper the value for db_pictureattribute.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.OPERTIME
     *
     * @return the value of db_pictureattribute.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.OPERTIME
     *
     * @param opertime the value for db_pictureattribute.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.ATTRIBUTEID
     *
     * @return the value of db_pictureattribute.ATTRIBUTEID
     *
     * @mbg.generated
     */
    public String getAttributeid() {
        return attributeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.ATTRIBUTEID
     *
     * @param attributeid the value for db_pictureattribute.ATTRIBUTEID
     *
     * @mbg.generated
     */
    public void setAttributeid(String attributeid) {
        this.attributeid = attributeid == null ? null : attributeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.THISURL
     *
     * @return the value of db_pictureattribute.THISURL
     *
     * @mbg.generated
     */
    public String getThisurl() {
        return thisurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.THISURL
     *
     * @param thisurl the value for db_pictureattribute.THISURL
     *
     * @mbg.generated
     */
    public void setThisurl(String thisurl) {
        this.thisurl = thisurl == null ? null : thisurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_pictureattribute.FTPURL
     *
     * @return the value of db_pictureattribute.FTPURL
     *
     * @mbg.generated
     */
    public String getFtpurl() {
        return ftpurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_pictureattribute.FTPURL
     *
     * @param ftpurl the value for db_pictureattribute.FTPURL
     *
     * @mbg.generated
     */
    public void setFtpurl(String ftpurl) {
        this.ftpurl = ftpurl == null ? null : ftpurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_pictureattribute
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
        DbPictureattribute other = (DbPictureattribute) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUploadflag() == null ? other.getUploadflag() == null : this.getUploadflag().equals(other.getUploadflag()))
            && (this.getFtpip() == null ? other.getFtpip() == null : this.getFtpip().equals(other.getFtpip()))
            && (this.getFtpusername() == null ? other.getFtpusername() == null : this.getFtpusername().equals(other.getFtpusername()))
            && (this.getFtppassword() == null ? other.getFtppassword() == null : this.getFtppassword().equals(other.getFtppassword()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAttributeid() == null ? other.getAttributeid() == null : this.getAttributeid().equals(other.getAttributeid()))
            && (this.getThisurl() == null ? other.getThisurl() == null : this.getThisurl().equals(other.getThisurl()))
            && (this.getFtpurl() == null ? other.getFtpurl() == null : this.getFtpurl().equals(other.getFtpurl()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_pictureattribute
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUploadflag() == null) ? 0 : getUploadflag().hashCode());
        result = prime * result + ((getFtpip() == null) ? 0 : getFtpip().hashCode());
        result = prime * result + ((getFtpusername() == null) ? 0 : getFtpusername().hashCode());
        result = prime * result + ((getFtppassword() == null) ? 0 : getFtppassword().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAttributeid() == null) ? 0 : getAttributeid().hashCode());
        result = prime * result + ((getThisurl() == null) ? 0 : getThisurl().hashCode());
        result = prime * result + ((getFtpurl() == null) ? 0 : getFtpurl().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_pictureattribute
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
        sb.append(", name=").append(name);
        sb.append(", uploadflag=").append(uploadflag);
        sb.append(", ftpip=").append(ftpip);
        sb.append(", ftpusername=").append(ftpusername);
        sb.append(", ftppassword=").append(ftppassword);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", attributeid=").append(attributeid);
        sb.append(", thisurl=").append(thisurl);
        sb.append(", ftpurl=").append(ftpurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}