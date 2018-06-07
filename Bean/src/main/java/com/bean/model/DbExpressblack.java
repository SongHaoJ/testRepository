package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbExpressblack implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.RESERVE4
     *
     * @mbg.generated
     */
    private BigDecimal reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.TRACKNUMBERLENGTH
     *
     * @mbg.generated
     */
    private BigDecimal tracknumberlength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.RESERVE3
     *
     * @mbg.generated
     */
    private BigDecimal reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.KEYWORD
     *
     * @mbg.generated
     */
    private String keyword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.TITLE
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_expressblack.RESERVE5
     *
     * @mbg.generated
     */
    private String reserve5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_expressblack
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.SEQUENCEID
     *
     * @return the value of db_expressblack.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.SEQUENCEID
     *
     * @param sequenceid the value for db_expressblack.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.OPER
     *
     * @return the value of db_expressblack.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.OPER
     *
     * @param oper the value for db_expressblack.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.RESERVE1
     *
     * @return the value of db_expressblack.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.RESERVE1
     *
     * @param reserve1 the value for db_expressblack.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.RESERVE4
     *
     * @return the value of db_expressblack.RESERVE4
     *
     * @mbg.generated
     */
    public BigDecimal getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.RESERVE4
     *
     * @param reserve4 the value for db_expressblack.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.TRACKNUMBERLENGTH
     *
     * @return the value of db_expressblack.TRACKNUMBERLENGTH
     *
     * @mbg.generated
     */
    public BigDecimal getTracknumberlength() {
        return tracknumberlength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.TRACKNUMBERLENGTH
     *
     * @param tracknumberlength the value for db_expressblack.TRACKNUMBERLENGTH
     *
     * @mbg.generated
     */
    public void setTracknumberlength(BigDecimal tracknumberlength) {
        this.tracknumberlength = tracknumberlength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.OPERTIME
     *
     * @return the value of db_expressblack.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.OPERTIME
     *
     * @param opertime the value for db_expressblack.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.RESERVE3
     *
     * @return the value of db_expressblack.RESERVE3
     *
     * @mbg.generated
     */
    public BigDecimal getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.RESERVE3
     *
     * @param reserve3 the value for db_expressblack.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(BigDecimal reserve3) {
        this.reserve3 = reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.RESERVE2
     *
     * @return the value of db_expressblack.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.RESERVE2
     *
     * @param reserve2 the value for db_expressblack.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.KEYWORD
     *
     * @return the value of db_expressblack.KEYWORD
     *
     * @mbg.generated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.KEYWORD
     *
     * @param keyword the value for db_expressblack.KEYWORD
     *
     * @mbg.generated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.TITLE
     *
     * @return the value of db_expressblack.TITLE
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.TITLE
     *
     * @param title the value for db_expressblack.TITLE
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_expressblack.RESERVE5
     *
     * @return the value of db_expressblack.RESERVE5
     *
     * @mbg.generated
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_expressblack.RESERVE5
     *
     * @param reserve5 the value for db_expressblack.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressblack
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
        DbExpressblack other = (DbExpressblack) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getTracknumberlength() == null ? other.getTracknumberlength() == null : this.getTracknumberlength().equals(other.getTracknumberlength()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressblack
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getTracknumberlength() == null) ? 0 : getTracknumberlength().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressblack
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
        sb.append(", oper=").append(oper);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", tracknumberlength=").append(tracknumberlength);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", keyword=").append(keyword);
        sb.append(", title=").append(title);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}