package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPictureattribute implements Serializable {
    private String sequenceid;

    private String name;

    private String uploadflag;

    private String ftpip;

    private String ftpusername;

    private String ftppassword;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private String corpid;

    private String openflag;

    private String oper;

    private Date opertime;

    private String attributeid;

    private String thisurl;

    private String ftpurl;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUploadflag() {
        return uploadflag;
    }

    public void setUploadflag(String uploadflag) {
        this.uploadflag = uploadflag == null ? null : uploadflag.trim();
    }

    public String getFtpip() {
        return ftpip;
    }

    public void setFtpip(String ftpip) {
        this.ftpip = ftpip == null ? null : ftpip.trim();
    }

    public String getFtpusername() {
        return ftpusername;
    }

    public void setFtpusername(String ftpusername) {
        this.ftpusername = ftpusername == null ? null : ftpusername.trim();
    }

    public String getFtppassword() {
        return ftppassword;
    }

    public void setFtppassword(String ftppassword) {
        this.ftppassword = ftppassword == null ? null : ftppassword.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public String getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(String attributeid) {
        this.attributeid = attributeid == null ? null : attributeid.trim();
    }

    public String getThisurl() {
        return thisurl;
    }

    public void setThisurl(String thisurl) {
        this.thisurl = thisurl == null ? null : thisurl.trim();
    }

    public String getFtpurl() {
        return ftpurl;
    }

    public void setFtpurl(String ftpurl) {
        this.ftpurl = ftpurl == null ? null : ftpurl.trim();
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