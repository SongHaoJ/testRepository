package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbUploadfile implements Serializable {
    private String sequenceid;

    private String oper;

    private BigDecimal opertype;

    private BigDecimal flag;

    private Date paydate;

    private String mobile;

    private String groupid;

    private BigDecimal smsflag;

    private BigDecimal state;

    private Date uploadtime;

    private BigDecimal recordnum;

    private BigDecimal successnum;

    private BigDecimal errornum;

    private Date processtime;

    private String corpid;

    private String sourcetype;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String shopid;

    private String shopname;

    private String filetype;

    private String shopitemid;

    private String fileurl;

    private String successurl;

    private String errorurl;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getOpertype() {
        return opertype;
    }

    public void setOpertype(BigDecimal opertype) {
        this.opertype = opertype;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public BigDecimal getSmsflag() {
        return smsflag;
    }

    public void setSmsflag(BigDecimal smsflag) {
        this.smsflag = smsflag;
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public BigDecimal getSuccessnum() {
        return successnum;
    }

    public void setSuccessnum(BigDecimal successnum) {
        this.successnum = successnum;
    }

    public BigDecimal getErrornum() {
        return errornum;
    }

    public void setErrornum(BigDecimal errornum) {
        this.errornum = errornum;
    }

    public Date getProcesstime() {
        return processtime;
    }

    public void setProcesstime(Date processtime) {
        this.processtime = processtime;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype == null ? null : sourcetype.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
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

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getShopitemid() {
        return shopitemid;
    }

    public void setShopitemid(String shopitemid) {
        this.shopitemid = shopitemid == null ? null : shopitemid.trim();
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public String getSuccessurl() {
        return successurl;
    }

    public void setSuccessurl(String successurl) {
        this.successurl = successurl == null ? null : successurl.trim();
    }

    public String getErrorurl() {
        return errorurl;
    }

    public void setErrorurl(String errorurl) {
        this.errorurl = errorurl == null ? null : errorurl.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbUploadfile other = (DbUploadfile) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getPaydate() == null ? other.getPaydate() == null : this.getPaydate().equals(other.getPaydate()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getSmsflag() == null ? other.getSmsflag() == null : this.getSmsflag().equals(other.getSmsflag()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getUploadtime() == null ? other.getUploadtime() == null : this.getUploadtime().equals(other.getUploadtime()))
            && (this.getRecordnum() == null ? other.getRecordnum() == null : this.getRecordnum().equals(other.getRecordnum()))
            && (this.getSuccessnum() == null ? other.getSuccessnum() == null : this.getSuccessnum().equals(other.getSuccessnum()))
            && (this.getErrornum() == null ? other.getErrornum() == null : this.getErrornum().equals(other.getErrornum()))
            && (this.getProcesstime() == null ? other.getProcesstime() == null : this.getProcesstime().equals(other.getProcesstime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getSourcetype() == null ? other.getSourcetype() == null : this.getSourcetype().equals(other.getSourcetype()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getFiletype() == null ? other.getFiletype() == null : this.getFiletype().equals(other.getFiletype()))
            && (this.getShopitemid() == null ? other.getShopitemid() == null : this.getShopitemid().equals(other.getShopitemid()))
            && (this.getFileurl() == null ? other.getFileurl() == null : this.getFileurl().equals(other.getFileurl()))
            && (this.getSuccessurl() == null ? other.getSuccessurl() == null : this.getSuccessurl().equals(other.getSuccessurl()))
            && (this.getErrorurl() == null ? other.getErrorurl() == null : this.getErrorurl().equals(other.getErrorurl()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getPaydate() == null) ? 0 : getPaydate().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getSmsflag() == null) ? 0 : getSmsflag().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getUploadtime() == null) ? 0 : getUploadtime().hashCode());
        result = prime * result + ((getRecordnum() == null) ? 0 : getRecordnum().hashCode());
        result = prime * result + ((getSuccessnum() == null) ? 0 : getSuccessnum().hashCode());
        result = prime * result + ((getErrornum() == null) ? 0 : getErrornum().hashCode());
        result = prime * result + ((getProcesstime() == null) ? 0 : getProcesstime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getSourcetype() == null) ? 0 : getSourcetype().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getFiletype() == null) ? 0 : getFiletype().hashCode());
        result = prime * result + ((getShopitemid() == null) ? 0 : getShopitemid().hashCode());
        result = prime * result + ((getFileurl() == null) ? 0 : getFileurl().hashCode());
        result = prime * result + ((getSuccessurl() == null) ? 0 : getSuccessurl().hashCode());
        result = prime * result + ((getErrorurl() == null) ? 0 : getErrorurl().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", oper=").append(oper);
        sb.append(", opertype=").append(opertype);
        sb.append(", flag=").append(flag);
        sb.append(", paydate=").append(paydate);
        sb.append(", mobile=").append(mobile);
        sb.append(", groupid=").append(groupid);
        sb.append(", smsflag=").append(smsflag);
        sb.append(", state=").append(state);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", recordnum=").append(recordnum);
        sb.append(", successnum=").append(successnum);
        sb.append(", errornum=").append(errornum);
        sb.append(", processtime=").append(processtime);
        sb.append(", corpid=").append(corpid);
        sb.append(", sourcetype=").append(sourcetype);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", filetype=").append(filetype);
        sb.append(", shopitemid=").append(shopitemid);
        sb.append(", fileurl=").append(fileurl);
        sb.append(", successurl=").append(successurl);
        sb.append(", errorurl=").append(errorurl);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}