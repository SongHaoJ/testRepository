package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProtocolLog implements Serializable {
    private String sequenceid;

    private String oper;

    private Date warntime;

    private String openflag;

    private String picture3;

    private Date backtime;

    private BigDecimal timetype;

    private Date repeattime;

    private String createoper;

    private BigDecimal reserve8;

    private Date reserve10;

    private BigDecimal reserve9;

    private String picture1;

    private Date endtime;

    private BigDecimal reserve6;

    private String checkoper;

    private Date starttime;

    private String urgent;

    private Date reserve11;

    private BigDecimal reserve7;

    private Date checktime;

    private String reserve14;

    private Date createtime;

    private String executor;

    private Date opertime;

    private String typeflag;

    private Date reserve13;

    private String picture2;

    private String action;

    private Date reserve12;

    private String flag;

    private String status;

    private String sku;

    private String actionid;

    private String reserve3;

    private String reserve2;

    private String name;

    private String checknotreason;

    private String backreason;

    private String reserve5;

    private String descr;

    private String note;

    private String title;

    private String reserve1;

    private String reserve4;

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

    public Date getWarntime() {
        return warntime;
    }

    public void setWarntime(Date warntime) {
        this.warntime = warntime;
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3 == null ? null : picture3.trim();
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    public BigDecimal getTimetype() {
        return timetype;
    }

    public void setTimetype(BigDecimal timetype) {
        this.timetype = timetype;
    }

    public Date getRepeattime() {
        return repeattime;
    }

    public void setRepeattime(Date repeattime) {
        this.repeattime = repeattime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public BigDecimal getReserve8() {
        return reserve8;
    }

    public void setReserve8(BigDecimal reserve8) {
        this.reserve8 = reserve8;
    }

    public Date getReserve10() {
        return reserve10;
    }

    public void setReserve10(Date reserve10) {
        this.reserve10 = reserve10;
    }

    public BigDecimal getReserve9() {
        return reserve9;
    }

    public void setReserve9(BigDecimal reserve9) {
        this.reserve9 = reserve9;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent == null ? null : urgent.trim();
    }

    public Date getReserve11() {
        return reserve11;
    }

    public void setReserve11(Date reserve11) {
        this.reserve11 = reserve11;
    }

    public BigDecimal getReserve7() {
        return reserve7;
    }

    public void setReserve7(BigDecimal reserve7) {
        this.reserve7 = reserve7;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getReserve14() {
        return reserve14;
    }

    public void setReserve14(String reserve14) {
        this.reserve14 = reserve14 == null ? null : reserve14.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor == null ? null : executor.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getTypeflag() {
        return typeflag;
    }

    public void setTypeflag(String typeflag) {
        this.typeflag = typeflag == null ? null : typeflag.trim();
    }

    public Date getReserve13() {
        return reserve13;
    }

    public void setReserve13(Date reserve13) {
        this.reserve13 = reserve13;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2 == null ? null : picture2.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Date getReserve12() {
        return reserve12;
    }

    public void setReserve12(Date reserve12) {
        this.reserve12 = reserve12;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid == null ? null : actionid.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getChecknotreason() {
        return checknotreason;
    }

    public void setChecknotreason(String checknotreason) {
        this.checknotreason = checknotreason == null ? null : checknotreason.trim();
    }

    public String getBackreason() {
        return backreason;
    }

    public void setBackreason(String backreason) {
        this.backreason = backreason == null ? null : backreason.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
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
        DbProtocolLog other = (DbProtocolLog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getWarntime() == null ? other.getWarntime() == null : this.getWarntime().equals(other.getWarntime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getPicture3() == null ? other.getPicture3() == null : this.getPicture3().equals(other.getPicture3()))
            && (this.getBacktime() == null ? other.getBacktime() == null : this.getBacktime().equals(other.getBacktime()))
            && (this.getTimetype() == null ? other.getTimetype() == null : this.getTimetype().equals(other.getTimetype()))
            && (this.getRepeattime() == null ? other.getRepeattime() == null : this.getRepeattime().equals(other.getRepeattime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getPicture1() == null ? other.getPicture1() == null : this.getPicture1().equals(other.getPicture1()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getUrgent() == null ? other.getUrgent() == null : this.getUrgent().equals(other.getUrgent()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getExecutor() == null ? other.getExecutor() == null : this.getExecutor().equals(other.getExecutor()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTypeflag() == null ? other.getTypeflag() == null : this.getTypeflag().equals(other.getTypeflag()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getPicture2() == null ? other.getPicture2() == null : this.getPicture2().equals(other.getPicture2()))
            && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getActionid() == null ? other.getActionid() == null : this.getActionid().equals(other.getActionid()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getChecknotreason() == null ? other.getChecknotreason() == null : this.getChecknotreason().equals(other.getChecknotreason()))
            && (this.getBackreason() == null ? other.getBackreason() == null : this.getBackreason().equals(other.getBackreason()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getWarntime() == null) ? 0 : getWarntime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getPicture3() == null) ? 0 : getPicture3().hashCode());
        result = prime * result + ((getBacktime() == null) ? 0 : getBacktime().hashCode());
        result = prime * result + ((getTimetype() == null) ? 0 : getTimetype().hashCode());
        result = prime * result + ((getRepeattime() == null) ? 0 : getRepeattime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getPicture1() == null) ? 0 : getPicture1().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getUrgent() == null) ? 0 : getUrgent().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getExecutor() == null) ? 0 : getExecutor().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTypeflag() == null) ? 0 : getTypeflag().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getPicture2() == null) ? 0 : getPicture2().hashCode());
        result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getActionid() == null) ? 0 : getActionid().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getChecknotreason() == null) ? 0 : getChecknotreason().hashCode());
        result = prime * result + ((getBackreason() == null) ? 0 : getBackreason().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
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
        sb.append(", oper=").append(oper);
        sb.append(", warntime=").append(warntime);
        sb.append(", openflag=").append(openflag);
        sb.append(", picture3=").append(picture3);
        sb.append(", backtime=").append(backtime);
        sb.append(", timetype=").append(timetype);
        sb.append(", repeattime=").append(repeattime);
        sb.append(", createoper=").append(createoper);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", picture1=").append(picture1);
        sb.append(", endtime=").append(endtime);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", starttime=").append(starttime);
        sb.append(", urgent=").append(urgent);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", checktime=").append(checktime);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", createtime=").append(createtime);
        sb.append(", executor=").append(executor);
        sb.append(", opertime=").append(opertime);
        sb.append(", typeflag=").append(typeflag);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", picture2=").append(picture2);
        sb.append(", action=").append(action);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", flag=").append(flag);
        sb.append(", status=").append(status);
        sb.append(", sku=").append(sku);
        sb.append(", actionid=").append(actionid);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", name=").append(name);
        sb.append(", checknotreason=").append(checknotreason);
        sb.append(", backreason=").append(backreason);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", descr=").append(descr);
        sb.append(", note=").append(note);
        sb.append(", title=").append(title);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}