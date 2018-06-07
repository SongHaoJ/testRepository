package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCheckstocklog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.OLDSAVENUM
     *
     * @mbg.generated
     */
    private BigDecimal oldsavenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.NEWSAVENUM
     *
     * @mbg.generated
     */
    private BigDecimal newsavenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.PRODUCTNAME
     *
     * @mbg.generated
     */
    private String productname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_checkstocklog.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_checkstocklog
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.SEQUENCEID
     *
     * @return the value of db_checkstocklog.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.SEQUENCEID
     *
     * @param sequenceid the value for db_checkstocklog.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.SID
     *
     * @return the value of db_checkstocklog.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.SID
     *
     * @param sid the value for db_checkstocklog.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.PRODUCTID
     *
     * @return the value of db_checkstocklog.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.PRODUCTID
     *
     * @param productid the value for db_checkstocklog.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.OLDSAVENUM
     *
     * @return the value of db_checkstocklog.OLDSAVENUM
     *
     * @mbg.generated
     */
    public BigDecimal getOldsavenum() {
        return oldsavenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.OLDSAVENUM
     *
     * @param oldsavenum the value for db_checkstocklog.OLDSAVENUM
     *
     * @mbg.generated
     */
    public void setOldsavenum(BigDecimal oldsavenum) {
        this.oldsavenum = oldsavenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.NEWSAVENUM
     *
     * @return the value of db_checkstocklog.NEWSAVENUM
     *
     * @mbg.generated
     */
    public BigDecimal getNewsavenum() {
        return newsavenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.NEWSAVENUM
     *
     * @param newsavenum the value for db_checkstocklog.NEWSAVENUM
     *
     * @mbg.generated
     */
    public void setNewsavenum(BigDecimal newsavenum) {
        this.newsavenum = newsavenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.OPER
     *
     * @return the value of db_checkstocklog.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.OPER
     *
     * @param oper the value for db_checkstocklog.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.OPERTIME
     *
     * @return the value of db_checkstocklog.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.OPERTIME
     *
     * @param opertime the value for db_checkstocklog.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.RESERVE1
     *
     * @return the value of db_checkstocklog.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.RESERVE1
     *
     * @param reserve1 the value for db_checkstocklog.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.RESERVE2
     *
     * @return the value of db_checkstocklog.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.RESERVE2
     *
     * @param reserve2 the value for db_checkstocklog.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.RESERVE3
     *
     * @return the value of db_checkstocklog.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.RESERVE3
     *
     * @param reserve3 the value for db_checkstocklog.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.CORPID
     *
     * @return the value of db_checkstocklog.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.CORPID
     *
     * @param corpid the value for db_checkstocklog.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.PRODUCTNAME
     *
     * @return the value of db_checkstocklog.PRODUCTNAME
     *
     * @mbg.generated
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.PRODUCTNAME
     *
     * @param productname the value for db_checkstocklog.PRODUCTNAME
     *
     * @mbg.generated
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_checkstocklog.DESCR
     *
     * @return the value of db_checkstocklog.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_checkstocklog.DESCR
     *
     * @param descr the value for db_checkstocklog.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_checkstocklog
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
        DbCheckstocklog other = (DbCheckstocklog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOldsavenum() == null ? other.getOldsavenum() == null : this.getOldsavenum().equals(other.getOldsavenum()))
            && (this.getNewsavenum() == null ? other.getNewsavenum() == null : this.getNewsavenum().equals(other.getNewsavenum()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_checkstocklog
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOldsavenum() == null) ? 0 : getOldsavenum().hashCode());
        result = prime * result + ((getNewsavenum() == null) ? 0 : getNewsavenum().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_checkstocklog
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
        sb.append(", sid=").append(sid);
        sb.append(", productid=").append(productid);
        sb.append(", oldsavenum=").append(oldsavenum);
        sb.append(", newsavenum=").append(newsavenum);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", corpid=").append(corpid);
        sb.append(", productname=").append(productname);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}