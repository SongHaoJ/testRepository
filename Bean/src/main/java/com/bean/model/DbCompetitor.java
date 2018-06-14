package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCompetitor implements Serializable {
    private BigDecimal sequenceid;

    private String username;

    private String shopname;

    private String evaluate;

    private String location;

    private BigDecimal dayonline;

    private BigDecimal yestonline;

    private BigDecimal weekonline;

    private BigDecimal monthonline;

    private BigDecimal credit;

    private BigDecimal keyflag;

    private BigDecimal salsenum;

    private BigDecimal salsemoney;

    private String oper;

    private Date opertime;

    private String corpid;

    private BigDecimal openflag;

    private BigDecimal status;

    private BigDecimal sellprice;

    private BigDecimal translatrate;

    private BigDecimal feedbackscore;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public BigDecimal getDayonline() {
        return dayonline;
    }

    public void setDayonline(BigDecimal dayonline) {
        this.dayonline = dayonline;
    }

    public BigDecimal getYestonline() {
        return yestonline;
    }

    public void setYestonline(BigDecimal yestonline) {
        this.yestonline = yestonline;
    }

    public BigDecimal getWeekonline() {
        return weekonline;
    }

    public void setWeekonline(BigDecimal weekonline) {
        this.weekonline = weekonline;
    }

    public BigDecimal getMonthonline() {
        return monthonline;
    }

    public void setMonthonline(BigDecimal monthonline) {
        this.monthonline = monthonline;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public BigDecimal getKeyflag() {
        return keyflag;
    }

    public void setKeyflag(BigDecimal keyflag) {
        this.keyflag = keyflag;
    }

    public BigDecimal getSalsenum() {
        return salsenum;
    }

    public void setSalsenum(BigDecimal salsenum) {
        this.salsenum = salsenum;
    }

    public BigDecimal getSalsemoney() {
        return salsemoney;
    }

    public void setSalsemoney(BigDecimal salsemoney) {
        this.salsemoney = salsemoney;
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

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getTranslatrate() {
        return translatrate;
    }

    public void setTranslatrate(BigDecimal translatrate) {
        this.translatrate = translatrate;
    }

    public BigDecimal getFeedbackscore() {
        return feedbackscore;
    }

    public void setFeedbackscore(BigDecimal feedbackscore) {
        this.feedbackscore = feedbackscore;
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
        DbCompetitor other = (DbCompetitor) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getEvaluate() == null ? other.getEvaluate() == null : this.getEvaluate().equals(other.getEvaluate()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getDayonline() == null ? other.getDayonline() == null : this.getDayonline().equals(other.getDayonline()))
            && (this.getYestonline() == null ? other.getYestonline() == null : this.getYestonline().equals(other.getYestonline()))
            && (this.getWeekonline() == null ? other.getWeekonline() == null : this.getWeekonline().equals(other.getWeekonline()))
            && (this.getMonthonline() == null ? other.getMonthonline() == null : this.getMonthonline().equals(other.getMonthonline()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getKeyflag() == null ? other.getKeyflag() == null : this.getKeyflag().equals(other.getKeyflag()))
            && (this.getSalsenum() == null ? other.getSalsenum() == null : this.getSalsenum().equals(other.getSalsenum()))
            && (this.getSalsemoney() == null ? other.getSalsemoney() == null : this.getSalsemoney().equals(other.getSalsemoney()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getTranslatrate() == null ? other.getTranslatrate() == null : this.getTranslatrate().equals(other.getTranslatrate()))
            && (this.getFeedbackscore() == null ? other.getFeedbackscore() == null : this.getFeedbackscore().equals(other.getFeedbackscore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getDayonline() == null) ? 0 : getDayonline().hashCode());
        result = prime * result + ((getYestonline() == null) ? 0 : getYestonline().hashCode());
        result = prime * result + ((getWeekonline() == null) ? 0 : getWeekonline().hashCode());
        result = prime * result + ((getMonthonline() == null) ? 0 : getMonthonline().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getKeyflag() == null) ? 0 : getKeyflag().hashCode());
        result = prime * result + ((getSalsenum() == null) ? 0 : getSalsenum().hashCode());
        result = prime * result + ((getSalsemoney() == null) ? 0 : getSalsemoney().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getTranslatrate() == null) ? 0 : getTranslatrate().hashCode());
        result = prime * result + ((getFeedbackscore() == null) ? 0 : getFeedbackscore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", username=").append(username);
        sb.append(", shopname=").append(shopname);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", location=").append(location);
        sb.append(", dayonline=").append(dayonline);
        sb.append(", yestonline=").append(yestonline);
        sb.append(", weekonline=").append(weekonline);
        sb.append(", monthonline=").append(monthonline);
        sb.append(", credit=").append(credit);
        sb.append(", keyflag=").append(keyflag);
        sb.append(", salsenum=").append(salsenum);
        sb.append(", salsemoney=").append(salsemoney);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", status=").append(status);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", translatrate=").append(translatrate);
        sb.append(", feedbackscore=").append(feedbackscore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}