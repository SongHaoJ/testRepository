package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSalescoefficientlog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.RANK
     *
     * @mbg.generated
     */
    private String rank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.RANGE1
     *
     * @mbg.generated
     */
    private BigDecimal range1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.RANGE2
     *
     * @mbg.generated
     */
    private BigDecimal range2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.OPERTYPE
     *
     * @mbg.generated
     */
    private String opertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.FILED1
     *
     * @mbg.generated
     */
    private String filed1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.FILED2
     *
     * @mbg.generated
     */
    private String filed2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.FILED3
     *
     * @mbg.generated
     */
    private BigDecimal filed3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.FILED4
     *
     * @mbg.generated
     */
    private BigDecimal filed4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.FILED5
     *
     * @mbg.generated
     */
    private BigDecimal filed5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.ALERTNUM
     *
     * @mbg.generated
     */
    private BigDecimal alertnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.PURCHASENUM
     *
     * @mbg.generated
     */
    private BigDecimal purchasenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.SORT
     *
     * @mbg.generated
     */
    private BigDecimal sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_salescoefficientlog.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_salescoefficientlog
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.SEQUENCEID
     *
     * @return the value of db_salescoefficientlog.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.SEQUENCEID
     *
     * @param sequenceid the value for db_salescoefficientlog.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.RANK
     *
     * @return the value of db_salescoefficientlog.RANK
     *
     * @mbg.generated
     */
    public String getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.RANK
     *
     * @param rank the value for db_salescoefficientlog.RANK
     *
     * @mbg.generated
     */
    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.RANGE1
     *
     * @return the value of db_salescoefficientlog.RANGE1
     *
     * @mbg.generated
     */
    public BigDecimal getRange1() {
        return range1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.RANGE1
     *
     * @param range1 the value for db_salescoefficientlog.RANGE1
     *
     * @mbg.generated
     */
    public void setRange1(BigDecimal range1) {
        this.range1 = range1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.RANGE2
     *
     * @return the value of db_salescoefficientlog.RANGE2
     *
     * @mbg.generated
     */
    public BigDecimal getRange2() {
        return range2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.RANGE2
     *
     * @param range2 the value for db_salescoefficientlog.RANGE2
     *
     * @mbg.generated
     */
    public void setRange2(BigDecimal range2) {
        this.range2 = range2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.OPER
     *
     * @return the value of db_salescoefficientlog.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.OPER
     *
     * @param oper the value for db_salescoefficientlog.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.OPERTIME
     *
     * @return the value of db_salescoefficientlog.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.OPERTIME
     *
     * @param opertime the value for db_salescoefficientlog.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.OPENFLAG
     *
     * @return the value of db_salescoefficientlog.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.OPENFLAG
     *
     * @param openflag the value for db_salescoefficientlog.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.CORPID
     *
     * @return the value of db_salescoefficientlog.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.CORPID
     *
     * @param corpid the value for db_salescoefficientlog.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.OPERTYPE
     *
     * @return the value of db_salescoefficientlog.OPERTYPE
     *
     * @mbg.generated
     */
    public String getOpertype() {
        return opertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.OPERTYPE
     *
     * @param opertype the value for db_salescoefficientlog.OPERTYPE
     *
     * @mbg.generated
     */
    public void setOpertype(String opertype) {
        this.opertype = opertype == null ? null : opertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.FILED1
     *
     * @return the value of db_salescoefficientlog.FILED1
     *
     * @mbg.generated
     */
    public String getFiled1() {
        return filed1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.FILED1
     *
     * @param filed1 the value for db_salescoefficientlog.FILED1
     *
     * @mbg.generated
     */
    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.FILED2
     *
     * @return the value of db_salescoefficientlog.FILED2
     *
     * @mbg.generated
     */
    public String getFiled2() {
        return filed2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.FILED2
     *
     * @param filed2 the value for db_salescoefficientlog.FILED2
     *
     * @mbg.generated
     */
    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.FILED3
     *
     * @return the value of db_salescoefficientlog.FILED3
     *
     * @mbg.generated
     */
    public BigDecimal getFiled3() {
        return filed3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.FILED3
     *
     * @param filed3 the value for db_salescoefficientlog.FILED3
     *
     * @mbg.generated
     */
    public void setFiled3(BigDecimal filed3) {
        this.filed3 = filed3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.FILED4
     *
     * @return the value of db_salescoefficientlog.FILED4
     *
     * @mbg.generated
     */
    public BigDecimal getFiled4() {
        return filed4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.FILED4
     *
     * @param filed4 the value for db_salescoefficientlog.FILED4
     *
     * @mbg.generated
     */
    public void setFiled4(BigDecimal filed4) {
        this.filed4 = filed4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.FILED5
     *
     * @return the value of db_salescoefficientlog.FILED5
     *
     * @mbg.generated
     */
    public BigDecimal getFiled5() {
        return filed5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.FILED5
     *
     * @param filed5 the value for db_salescoefficientlog.FILED5
     *
     * @mbg.generated
     */
    public void setFiled5(BigDecimal filed5) {
        this.filed5 = filed5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.ALERTNUM
     *
     * @return the value of db_salescoefficientlog.ALERTNUM
     *
     * @mbg.generated
     */
    public BigDecimal getAlertnum() {
        return alertnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.ALERTNUM
     *
     * @param alertnum the value for db_salescoefficientlog.ALERTNUM
     *
     * @mbg.generated
     */
    public void setAlertnum(BigDecimal alertnum) {
        this.alertnum = alertnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.PURCHASENUM
     *
     * @return the value of db_salescoefficientlog.PURCHASENUM
     *
     * @mbg.generated
     */
    public BigDecimal getPurchasenum() {
        return purchasenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.PURCHASENUM
     *
     * @param purchasenum the value for db_salescoefficientlog.PURCHASENUM
     *
     * @mbg.generated
     */
    public void setPurchasenum(BigDecimal purchasenum) {
        this.purchasenum = purchasenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.SORT
     *
     * @return the value of db_salescoefficientlog.SORT
     *
     * @mbg.generated
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.SORT
     *
     * @param sort the value for db_salescoefficientlog.SORT
     *
     * @mbg.generated
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_salescoefficientlog.CONTENT
     *
     * @return the value of db_salescoefficientlog.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_salescoefficientlog.CONTENT
     *
     * @param content the value for db_salescoefficientlog.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficientlog
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
        DbSalescoefficientlog other = (DbSalescoefficientlog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getRange1() == null ? other.getRange1() == null : this.getRange1().equals(other.getRange1()))
            && (this.getRange2() == null ? other.getRange2() == null : this.getRange2().equals(other.getRange2()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getAlertnum() == null ? other.getAlertnum() == null : this.getAlertnum().equals(other.getAlertnum()))
            && (this.getPurchasenum() == null ? other.getPurchasenum() == null : this.getPurchasenum().equals(other.getPurchasenum()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficientlog
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getRange1() == null) ? 0 : getRange1().hashCode());
        result = prime * result + ((getRange2() == null) ? 0 : getRange2().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getAlertnum() == null) ? 0 : getAlertnum().hashCode());
        result = prime * result + ((getPurchasenum() == null) ? 0 : getPurchasenum().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficientlog
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
        sb.append(", rank=").append(rank);
        sb.append(", range1=").append(range1);
        sb.append(", range2=").append(range2);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", corpid=").append(corpid);
        sb.append(", opertype=").append(opertype);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", filed4=").append(filed4);
        sb.append(", filed5=").append(filed5);
        sb.append(", alertnum=").append(alertnum);
        sb.append(", purchasenum=").append(purchasenum);
        sb.append(", sort=").append(sort);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}