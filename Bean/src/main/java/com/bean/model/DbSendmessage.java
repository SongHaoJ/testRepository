package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSendmessage implements Serializable {
    private String sequenceid;

    private String groupid;

    private Date createtime;

    private String createoper;

    private String status;

    private String checkoper;

    private Date checktime;

    private BigDecimal recordenum;

    private BigDecimal successnum;

    private BigDecimal errornum;

    private Date sendtime;

    private String reserve1;

    private String reserve2;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal returnid;

    private String title;

    private String reserve3;

    private String reserve4;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public BigDecimal getRecordenum() {
        return recordenum;
    }

    public void setRecordenum(BigDecimal recordenum) {
        this.recordenum = recordenum;
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

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
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

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
    }

    public BigDecimal getReserve7() {
        return reserve7;
    }

    public void setReserve7(BigDecimal reserve7) {
        this.reserve7 = reserve7;
    }

    public BigDecimal getReserve8() {
        return reserve8;
    }

    public void setReserve8(BigDecimal reserve8) {
        this.reserve8 = reserve8;
    }

    public BigDecimal getReturnid() {
        return returnid;
    }

    public void setReturnid(BigDecimal returnid) {
        this.returnid = returnid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
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
        DbSendmessage other = (DbSendmessage) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getRecordenum() == null ? other.getRecordenum() == null : this.getRecordenum().equals(other.getRecordenum()))
            && (this.getSuccessnum() == null ? other.getSuccessnum() == null : this.getSuccessnum().equals(other.getSuccessnum()))
            && (this.getErrornum() == null ? other.getErrornum() == null : this.getErrornum().equals(other.getErrornum()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReturnid() == null ? other.getReturnid() == null : this.getReturnid().equals(other.getReturnid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getRecordenum() == null) ? 0 : getRecordenum().hashCode());
        result = prime * result + ((getSuccessnum() == null) ? 0 : getSuccessnum().hashCode());
        result = prime * result + ((getErrornum() == null) ? 0 : getErrornum().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReturnid() == null) ? 0 : getReturnid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", groupid=").append(groupid);
        sb.append(", createtime=").append(createtime);
        sb.append(", createoper=").append(createoper);
        sb.append(", status=").append(status);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checktime=").append(checktime);
        sb.append(", recordenum=").append(recordenum);
        sb.append(", successnum=").append(successnum);
        sb.append(", errornum=").append(errornum);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", returnid=").append(returnid);
        sb.append(", title=").append(title);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}