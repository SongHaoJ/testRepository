package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbForumtopic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.STYPE
     *
     * @mbg.generated
     */
    private String stype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.FORUMID
     *
     * @mbg.generated
     */
    private String forumid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.PARENTID
     *
     * @mbg.generated
     */
    private String parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.CLICKCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal clickcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.ANSWERCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal answercount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.ANSWEROPER
     *
     * @mbg.generated
     */
    private String answeroper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.ANSWERTIME
     *
     * @mbg.generated
     */
    private Date answertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.HOTFLAG
     *
     * @mbg.generated
     */
    private String hotflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.PICURL
     *
     * @mbg.generated
     */
    private String picurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.IPADDRESS
     *
     * @mbg.generated
     */
    private String ipaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.RESERVE4
     *
     * @mbg.generated
     */
    private String reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.TOPICNAME
     *
     * @mbg.generated
     */
    private String topicname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_forumtopic.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_forumtopic
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.SEQUENCEID
     *
     * @return the value of db_forumtopic.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.SEQUENCEID
     *
     * @param sequenceid the value for db_forumtopic.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.STYPE
     *
     * @return the value of db_forumtopic.STYPE
     *
     * @mbg.generated
     */
    public String getStype() {
        return stype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.STYPE
     *
     * @param stype the value for db_forumtopic.STYPE
     *
     * @mbg.generated
     */
    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.OPENFLAG
     *
     * @return the value of db_forumtopic.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.OPENFLAG
     *
     * @param openflag the value for db_forumtopic.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.OPER
     *
     * @return the value of db_forumtopic.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.OPER
     *
     * @param oper the value for db_forumtopic.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.OPERTIME
     *
     * @return the value of db_forumtopic.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.OPERTIME
     *
     * @param opertime the value for db_forumtopic.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.FORUMID
     *
     * @return the value of db_forumtopic.FORUMID
     *
     * @mbg.generated
     */
    public String getForumid() {
        return forumid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.FORUMID
     *
     * @param forumid the value for db_forumtopic.FORUMID
     *
     * @mbg.generated
     */
    public void setForumid(String forumid) {
        this.forumid = forumid == null ? null : forumid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.PARENTID
     *
     * @return the value of db_forumtopic.PARENTID
     *
     * @mbg.generated
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.PARENTID
     *
     * @param parentid the value for db_forumtopic.PARENTID
     *
     * @mbg.generated
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.CLICKCOUNT
     *
     * @return the value of db_forumtopic.CLICKCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getClickcount() {
        return clickcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.CLICKCOUNT
     *
     * @param clickcount the value for db_forumtopic.CLICKCOUNT
     *
     * @mbg.generated
     */
    public void setClickcount(BigDecimal clickcount) {
        this.clickcount = clickcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.ANSWERCOUNT
     *
     * @return the value of db_forumtopic.ANSWERCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getAnswercount() {
        return answercount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.ANSWERCOUNT
     *
     * @param answercount the value for db_forumtopic.ANSWERCOUNT
     *
     * @mbg.generated
     */
    public void setAnswercount(BigDecimal answercount) {
        this.answercount = answercount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.ANSWEROPER
     *
     * @return the value of db_forumtopic.ANSWEROPER
     *
     * @mbg.generated
     */
    public String getAnsweroper() {
        return answeroper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.ANSWEROPER
     *
     * @param answeroper the value for db_forumtopic.ANSWEROPER
     *
     * @mbg.generated
     */
    public void setAnsweroper(String answeroper) {
        this.answeroper = answeroper == null ? null : answeroper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.ANSWERTIME
     *
     * @return the value of db_forumtopic.ANSWERTIME
     *
     * @mbg.generated
     */
    public Date getAnswertime() {
        return answertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.ANSWERTIME
     *
     * @param answertime the value for db_forumtopic.ANSWERTIME
     *
     * @mbg.generated
     */
    public void setAnswertime(Date answertime) {
        this.answertime = answertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.HOTFLAG
     *
     * @return the value of db_forumtopic.HOTFLAG
     *
     * @mbg.generated
     */
    public String getHotflag() {
        return hotflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.HOTFLAG
     *
     * @param hotflag the value for db_forumtopic.HOTFLAG
     *
     * @mbg.generated
     */
    public void setHotflag(String hotflag) {
        this.hotflag = hotflag == null ? null : hotflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.PICURL
     *
     * @return the value of db_forumtopic.PICURL
     *
     * @mbg.generated
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.PICURL
     *
     * @param picurl the value for db_forumtopic.PICURL
     *
     * @mbg.generated
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.IPADDRESS
     *
     * @return the value of db_forumtopic.IPADDRESS
     *
     * @mbg.generated
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.IPADDRESS
     *
     * @param ipaddress the value for db_forumtopic.IPADDRESS
     *
     * @mbg.generated
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.RESERVE1
     *
     * @return the value of db_forumtopic.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.RESERVE1
     *
     * @param reserve1 the value for db_forumtopic.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.RESERVE2
     *
     * @return the value of db_forumtopic.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.RESERVE2
     *
     * @param reserve2 the value for db_forumtopic.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.RESERVE3
     *
     * @return the value of db_forumtopic.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.RESERVE3
     *
     * @param reserve3 the value for db_forumtopic.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.RESERVE4
     *
     * @return the value of db_forumtopic.RESERVE4
     *
     * @mbg.generated
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.RESERVE4
     *
     * @param reserve4 the value for db_forumtopic.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.TOPICNAME
     *
     * @return the value of db_forumtopic.TOPICNAME
     *
     * @mbg.generated
     */
    public String getTopicname() {
        return topicname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.TOPICNAME
     *
     * @param topicname the value for db_forumtopic.TOPICNAME
     *
     * @mbg.generated
     */
    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_forumtopic.CONTENT
     *
     * @return the value of db_forumtopic.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_forumtopic.CONTENT
     *
     * @param content the value for db_forumtopic.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumtopic
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumtopic
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumtopic
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