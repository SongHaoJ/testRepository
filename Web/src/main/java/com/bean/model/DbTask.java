package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbTask implements Serializable {
    private String sid;

    private String title;

    private String question;

    private String stype;

    private String stypename;

    private String oper;

    private Date opertime;

    private String tooper;

    private Date toopertime;

    private String answer;

    private String status;

    private String statusname;

    private String statusflag;

    private String slevel;

    private String checkresult;

    private BigDecimal scores;

    private String checkdescr;

    private String checkoper;

    private Date checktime;

    private String publicflag;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private Date endtime;

    private BigDecimal datediff;

    private String corpid;

    private String openflag;

    private String member;

    private String customertype;

    private String customername;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private String alias1;

    private String alias2;

    private String alias3;

    private String alias4;

    private String appointmember;

    private String reserve8;

    private String reserve9;

    private String reserve10;

    private String reserve11;

    private BigDecimal reserve12;

    private BigDecimal reserve13;

    private BigDecimal reserve14;

    private BigDecimal reserve15;

    private BigDecimal reserve16;

    private BigDecimal reserve17;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getStypename() {
        return stypename;
    }

    public void setStypename(String stypename) {
        this.stypename = stypename == null ? null : stypename.trim();
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

    public String getTooper() {
        return tooper;
    }

    public void setTooper(String tooper) {
        this.tooper = tooper == null ? null : tooper.trim();
    }

    public Date getToopertime() {
        return toopertime;
    }

    public void setToopertime(Date toopertime) {
        this.toopertime = toopertime;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
    }

    public String getStatusflag() {
        return statusflag;
    }

    public void setStatusflag(String statusflag) {
        this.statusflag = statusflag == null ? null : statusflag.trim();
    }

    public String getSlevel() {
        return slevel;
    }

    public void setSlevel(String slevel) {
        this.slevel = slevel == null ? null : slevel.trim();
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public BigDecimal getScores() {
        return scores;
    }

    public void setScores(BigDecimal scores) {
        this.scores = scores;
    }

    public String getCheckdescr() {
        return checkdescr;
    }

    public void setCheckdescr(String checkdescr) {
        this.checkdescr = checkdescr == null ? null : checkdescr.trim();
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

    public String getPublicflag() {
        return publicflag;
    }

    public void setPublicflag(String publicflag) {
        this.publicflag = publicflag == null ? null : publicflag.trim();
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

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getDatediff() {
        return datediff;
    }

    public void setDatediff(BigDecimal datediff) {
        this.datediff = datediff;
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

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype == null ? null : customertype.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
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

    public String getAlias1() {
        return alias1;
    }

    public void setAlias1(String alias1) {
        this.alias1 = alias1 == null ? null : alias1.trim();
    }

    public String getAlias2() {
        return alias2;
    }

    public void setAlias2(String alias2) {
        this.alias2 = alias2 == null ? null : alias2.trim();
    }

    public String getAlias3() {
        return alias3;
    }

    public void setAlias3(String alias3) {
        this.alias3 = alias3 == null ? null : alias3.trim();
    }

    public String getAlias4() {
        return alias4;
    }

    public void setAlias4(String alias4) {
        this.alias4 = alias4 == null ? null : alias4.trim();
    }

    public String getAppointmember() {
        return appointmember;
    }

    public void setAppointmember(String appointmember) {
        this.appointmember = appointmember == null ? null : appointmember.trim();
    }

    public String getReserve8() {
        return reserve8;
    }

    public void setReserve8(String reserve8) {
        this.reserve8 = reserve8 == null ? null : reserve8.trim();
    }

    public String getReserve9() {
        return reserve9;
    }

    public void setReserve9(String reserve9) {
        this.reserve9 = reserve9 == null ? null : reserve9.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }

    public String getReserve11() {
        return reserve11;
    }

    public void setReserve11(String reserve11) {
        this.reserve11 = reserve11 == null ? null : reserve11.trim();
    }

    public BigDecimal getReserve12() {
        return reserve12;
    }

    public void setReserve12(BigDecimal reserve12) {
        this.reserve12 = reserve12;
    }

    public BigDecimal getReserve13() {
        return reserve13;
    }

    public void setReserve13(BigDecimal reserve13) {
        this.reserve13 = reserve13;
    }

    public BigDecimal getReserve14() {
        return reserve14;
    }

    public void setReserve14(BigDecimal reserve14) {
        this.reserve14 = reserve14;
    }

    public BigDecimal getReserve15() {
        return reserve15;
    }

    public void setReserve15(BigDecimal reserve15) {
        this.reserve15 = reserve15;
    }

    public BigDecimal getReserve16() {
        return reserve16;
    }

    public void setReserve16(BigDecimal reserve16) {
        this.reserve16 = reserve16;
    }

    public BigDecimal getReserve17() {
        return reserve17;
    }

    public void setReserve17(BigDecimal reserve17) {
        this.reserve17 = reserve17;
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
        DbTask other = (DbTask) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getStypename() == null ? other.getStypename() == null : this.getStypename().equals(other.getStypename()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTooper() == null ? other.getTooper() == null : this.getTooper().equals(other.getTooper()))
            && (this.getToopertime() == null ? other.getToopertime() == null : this.getToopertime().equals(other.getToopertime()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStatusname() == null ? other.getStatusname() == null : this.getStatusname().equals(other.getStatusname()))
            && (this.getStatusflag() == null ? other.getStatusflag() == null : this.getStatusflag().equals(other.getStatusflag()))
            && (this.getSlevel() == null ? other.getSlevel() == null : this.getSlevel().equals(other.getSlevel()))
            && (this.getCheckresult() == null ? other.getCheckresult() == null : this.getCheckresult().equals(other.getCheckresult()))
            && (this.getScores() == null ? other.getScores() == null : this.getScores().equals(other.getScores()))
            && (this.getCheckdescr() == null ? other.getCheckdescr() == null : this.getCheckdescr().equals(other.getCheckdescr()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getPublicflag() == null ? other.getPublicflag() == null : this.getPublicflag().equals(other.getPublicflag()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getDatediff() == null ? other.getDatediff() == null : this.getDatediff().equals(other.getDatediff()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getMember() == null ? other.getMember() == null : this.getMember().equals(other.getMember()))
            && (this.getCustomertype() == null ? other.getCustomertype() == null : this.getCustomertype().equals(other.getCustomertype()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getAlias1() == null ? other.getAlias1() == null : this.getAlias1().equals(other.getAlias1()))
            && (this.getAlias2() == null ? other.getAlias2() == null : this.getAlias2().equals(other.getAlias2()))
            && (this.getAlias3() == null ? other.getAlias3() == null : this.getAlias3().equals(other.getAlias3()))
            && (this.getAlias4() == null ? other.getAlias4() == null : this.getAlias4().equals(other.getAlias4()))
            && (this.getAppointmember() == null ? other.getAppointmember() == null : this.getAppointmember().equals(other.getAppointmember()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getReserve17() == null ? other.getReserve17() == null : this.getReserve17().equals(other.getReserve17()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getStypename() == null) ? 0 : getStypename().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTooper() == null) ? 0 : getTooper().hashCode());
        result = prime * result + ((getToopertime() == null) ? 0 : getToopertime().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStatusname() == null) ? 0 : getStatusname().hashCode());
        result = prime * result + ((getStatusflag() == null) ? 0 : getStatusflag().hashCode());
        result = prime * result + ((getSlevel() == null) ? 0 : getSlevel().hashCode());
        result = prime * result + ((getCheckresult() == null) ? 0 : getCheckresult().hashCode());
        result = prime * result + ((getScores() == null) ? 0 : getScores().hashCode());
        result = prime * result + ((getCheckdescr() == null) ? 0 : getCheckdescr().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getPublicflag() == null) ? 0 : getPublicflag().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getDatediff() == null) ? 0 : getDatediff().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getMember() == null) ? 0 : getMember().hashCode());
        result = prime * result + ((getCustomertype() == null) ? 0 : getCustomertype().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getAlias1() == null) ? 0 : getAlias1().hashCode());
        result = prime * result + ((getAlias2() == null) ? 0 : getAlias2().hashCode());
        result = prime * result + ((getAlias3() == null) ? 0 : getAlias3().hashCode());
        result = prime * result + ((getAlias4() == null) ? 0 : getAlias4().hashCode());
        result = prime * result + ((getAppointmember() == null) ? 0 : getAppointmember().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getReserve17() == null) ? 0 : getReserve17().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", title=").append(title);
        sb.append(", question=").append(question);
        sb.append(", stype=").append(stype);
        sb.append(", stypename=").append(stypename);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", tooper=").append(tooper);
        sb.append(", toopertime=").append(toopertime);
        sb.append(", answer=").append(answer);
        sb.append(", status=").append(status);
        sb.append(", statusname=").append(statusname);
        sb.append(", statusflag=").append(statusflag);
        sb.append(", slevel=").append(slevel);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", scores=").append(scores);
        sb.append(", checkdescr=").append(checkdescr);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checktime=").append(checktime);
        sb.append(", publicflag=").append(publicflag);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", endtime=").append(endtime);
        sb.append(", datediff=").append(datediff);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", member=").append(member);
        sb.append(", customertype=").append(customertype);
        sb.append(", customername=").append(customername);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", alias1=").append(alias1);
        sb.append(", alias2=").append(alias2);
        sb.append(", alias3=").append(alias3);
        sb.append(", alias4=").append(alias4);
        sb.append(", appointmember=").append(appointmember);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", reserve17=").append(reserve17);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}