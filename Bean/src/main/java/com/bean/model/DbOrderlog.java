package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbOrderlog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.ORDERID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.TRADEID
     *
     * @mbg.generated
     */
    private String tradeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.OPERTYPE
     *
     * @mbg.generated
     */
    private String opertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.RESERVE4
     *
     * @mbg.generated
     */
    private String reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.ORDEROPER
     *
     * @mbg.generated
     */
    private BigDecimal orderoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_orderlog.RESERVE5
     *
     * @mbg.generated
     */
    private String reserve5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_orderlog
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.SID
     *
     * @return the value of db_orderlog.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.SID
     *
     * @param sid the value for db_orderlog.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.CORPID
     *
     * @return the value of db_orderlog.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.CORPID
     *
     * @param corpid the value for db_orderlog.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.ORDERID
     *
     * @return the value of db_orderlog.ORDERID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.ORDERID
     *
     * @param orderid the value for db_orderlog.ORDERID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.TRADEID
     *
     * @return the value of db_orderlog.TRADEID
     *
     * @mbg.generated
     */
    public String getTradeid() {
        return tradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.TRADEID
     *
     * @param tradeid the value for db_orderlog.TRADEID
     *
     * @mbg.generated
     */
    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.OPERTYPE
     *
     * @return the value of db_orderlog.OPERTYPE
     *
     * @mbg.generated
     */
    public String getOpertype() {
        return opertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.OPERTYPE
     *
     * @param opertype the value for db_orderlog.OPERTYPE
     *
     * @mbg.generated
     */
    public void setOpertype(String opertype) {
        this.opertype = opertype == null ? null : opertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.OPER
     *
     * @return the value of db_orderlog.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.OPER
     *
     * @param oper the value for db_orderlog.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.OPERTIME
     *
     * @return the value of db_orderlog.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.OPERTIME
     *
     * @param opertime the value for db_orderlog.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.RESERVE1
     *
     * @return the value of db_orderlog.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.RESERVE1
     *
     * @param reserve1 the value for db_orderlog.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.RESERVE2
     *
     * @return the value of db_orderlog.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.RESERVE2
     *
     * @param reserve2 the value for db_orderlog.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.RESERVE4
     *
     * @return the value of db_orderlog.RESERVE4
     *
     * @mbg.generated
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.RESERVE4
     *
     * @param reserve4 the value for db_orderlog.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.ORDEROPER
     *
     * @return the value of db_orderlog.ORDEROPER
     *
     * @mbg.generated
     */
    public BigDecimal getOrderoper() {
        return orderoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.ORDEROPER
     *
     * @param orderoper the value for db_orderlog.ORDEROPER
     *
     * @mbg.generated
     */
    public void setOrderoper(BigDecimal orderoper) {
        this.orderoper = orderoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.DESCR
     *
     * @return the value of db_orderlog.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.DESCR
     *
     * @param descr the value for db_orderlog.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.RESERVE3
     *
     * @return the value of db_orderlog.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.RESERVE3
     *
     * @param reserve3 the value for db_orderlog.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_orderlog.RESERVE5
     *
     * @return the value of db_orderlog.RESERVE5
     *
     * @mbg.generated
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_orderlog.RESERVE5
     *
     * @param reserve5 the value for db_orderlog.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlog
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
        DbOrderlog other = (DbOrderlog) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getOrderoper() == null ? other.getOrderoper() == null : this.getOrderoper().equals(other.getOrderoper()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlog
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getOrderoper() == null) ? 0 : getOrderoper().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlog
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", corpid=").append(corpid);
        sb.append(", orderid=").append(orderid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", opertype=").append(opertype);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", orderoper=").append(orderoper);
        sb.append(", descr=").append(descr);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}