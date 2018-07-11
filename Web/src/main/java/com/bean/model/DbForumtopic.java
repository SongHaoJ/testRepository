package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbForumtopic implements Serializable {
    private String sequenceid;

    private String stype;

    private String openflag;

    private String oper;

    private Date opertime;

    private String forumid;

    private String parentid;

    private BigDecimal clickcount;

    private BigDecimal answercount;

    private String answeroper;

    private Date answertime;

    private String hotflag;

    private String picurl;

    private String ipaddress;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String topicname;

    private String content;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
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

    public String getForumid() {
        return forumid;
    }

    public void setForumid(String forumid) {
        this.forumid = forumid == null ? null : forumid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public BigDecimal getClickcount() {
        return clickcount;
    }

    public void setClickcount(BigDecimal clickcount) {
        this.clickcount = clickcount;
    }

    public BigDecimal getAnswercount() {
        return answercount;
    }

    public void setAnswercount(BigDecimal answercount) {
        this.answercount = answercount;
    }

    public String getAnsweroper() {
        return answeroper;
    }

    public void setAnsweroper(String answeroper) {
        this.answeroper = answeroper == null ? null : answeroper.trim();
    }

    public Date getAnswertime() {
        return answertime;
    }

    public void setAnswertime(Date answertime) {
        this.answertime = answertime;
    }

    public String getHotflag() {
        return hotflag;
    }

    public void setHotflag(String hotflag) {
        this.hotflag = hotflag == null ? null : hotflag.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
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

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        DbForumtopic other = (DbForumtopic) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getForumid() == null ? other.getForumid() == null : this.getForumid().equals(other.getForumid()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getClickcount() == null ? other.getClickcount() == null : this.getClickcount().equals(other.getClickcount()))
            && (this.getAnswercount() == null ? other.getAnswercount() == null : this.getAnswercount().equals(other.getAnswercount()))
            && (this.getAnsweroper() == null ? other.getAnsweroper() == null : this.getAnsweroper().equals(other.getAnsweroper()))
            && (this.getAnswertime() == null ? other.getAnswertime() == null : this.getAnswertime().equals(other.getAnswertime()))
            && (this.getHotflag() == null ? other.getHotflag() == null : this.getHotflag().equals(other.getHotflag()))
            && (this.getPicurl() == null ? other.getPicurl() == null : this.getPicurl().equals(other.getPicurl()))
            && (this.getIpaddress() == null ? other.getIpaddress() == null : this.getIpaddress().equals(other.getIpaddress()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getTopicname() == null ? other.getTopicname() == null : this.getTopicname().equals(other.getTopicname()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getForumid() == null) ? 0 : getForumid().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getClickcount() == null) ? 0 : getClickcount().hashCode());
        result = prime * result + ((getAnswercount() == null) ? 0 : getAnswercount().hashCode());
        result = prime * result + ((getAnsweroper() == null) ? 0 : getAnsweroper().hashCode());
        result = prime * result + ((getAnswertime() == null) ? 0 : getAnswertime().hashCode());
        result = prime * result + ((getHotflag() == null) ? 0 : getHotflag().hashCode());
        result = prime * result + ((getPicurl() == null) ? 0 : getPicurl().hashCode());
        result = prime * result + ((getIpaddress() == null) ? 0 : getIpaddress().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getTopicname() == null) ? 0 : getTopicname().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", stype=").append(stype);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", forumid=").append(forumid);
        sb.append(", parentid=").append(parentid);
        sb.append(", clickcount=").append(clickcount);
        sb.append(", answercount=").append(answercount);
        sb.append(", answeroper=").append(answeroper);
        sb.append(", answertime=").append(answertime);
        sb.append(", hotflag=").append(hotflag);
        sb.append(", picurl=").append(picurl);
        sb.append(", ipaddress=").append(ipaddress);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", topicname=").append(topicname);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}