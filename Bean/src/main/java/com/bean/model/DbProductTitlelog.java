package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductTitlelog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.QTY
     *
     * @mbg.generated
     */
    private String qty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.FILED4
     *
     * @mbg.generated
     */
    private BigDecimal filed4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.FILED5
     *
     * @mbg.generated
     */
    private BigDecimal filed5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.TITLE
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.FILED1
     *
     * @mbg.generated
     */
    private String filed1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.FILED2
     *
     * @mbg.generated
     */
    private String filed2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.FILED3
     *
     * @mbg.generated
     */
    private String filed3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_product_titlelog.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_product_titlelog
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.SEQUENCEID
     *
     * @return the value of db_product_titlelog.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.SEQUENCEID
     *
     * @param sequenceid the value for db_product_titlelog.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.QTY
     *
     * @return the value of db_product_titlelog.QTY
     *
     * @mbg.generated
     */
    public String getQty() {
        return qty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.QTY
     *
     * @param qty the value for db_product_titlelog.QTY
     *
     * @mbg.generated
     */
    public void setQty(String qty) {
        this.qty = qty == null ? null : qty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.OPER
     *
     * @return the value of db_product_titlelog.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.OPER
     *
     * @param oper the value for db_product_titlelog.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.OPERTIME
     *
     * @return the value of db_product_titlelog.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.OPERTIME
     *
     * @param opertime the value for db_product_titlelog.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.FILED4
     *
     * @return the value of db_product_titlelog.FILED4
     *
     * @mbg.generated
     */
    public BigDecimal getFiled4() {
        return filed4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.FILED4
     *
     * @param filed4 the value for db_product_titlelog.FILED4
     *
     * @mbg.generated
     */
    public void setFiled4(BigDecimal filed4) {
        this.filed4 = filed4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.FILED5
     *
     * @return the value of db_product_titlelog.FILED5
     *
     * @mbg.generated
     */
    public BigDecimal getFiled5() {
        return filed5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.FILED5
     *
     * @param filed5 the value for db_product_titlelog.FILED5
     *
     * @mbg.generated
     */
    public void setFiled5(BigDecimal filed5) {
        this.filed5 = filed5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.SID
     *
     * @return the value of db_product_titlelog.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.SID
     *
     * @param sid the value for db_product_titlelog.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.TITLE
     *
     * @return the value of db_product_titlelog.TITLE
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.TITLE
     *
     * @param title the value for db_product_titlelog.TITLE
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.FILED1
     *
     * @return the value of db_product_titlelog.FILED1
     *
     * @mbg.generated
     */
    public String getFiled1() {
        return filed1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.FILED1
     *
     * @param filed1 the value for db_product_titlelog.FILED1
     *
     * @mbg.generated
     */
    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.FILED2
     *
     * @return the value of db_product_titlelog.FILED2
     *
     * @mbg.generated
     */
    public String getFiled2() {
        return filed2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.FILED2
     *
     * @param filed2 the value for db_product_titlelog.FILED2
     *
     * @mbg.generated
     */
    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.FILED3
     *
     * @return the value of db_product_titlelog.FILED3
     *
     * @mbg.generated
     */
    public String getFiled3() {
        return filed3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.FILED3
     *
     * @param filed3 the value for db_product_titlelog.FILED3
     *
     * @mbg.generated
     */
    public void setFiled3(String filed3) {
        this.filed3 = filed3 == null ? null : filed3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_product_titlelog.DESCR
     *
     * @return the value of db_product_titlelog.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_product_titlelog.DESCR
     *
     * @param descr the value for db_product_titlelog.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_product_titlelog
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
        DbProductTitlelog other = (DbProductTitlelog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getQty() == null ? other.getQty() == null : this.getQty().equals(other.getQty()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_product_titlelog
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getQty() == null) ? 0 : getQty().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_product_titlelog
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
        sb.append(", qty=").append(qty);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", filed4=").append(filed4);
        sb.append(", filed5=").append(filed5);
        sb.append(", sid=").append(sid);
        sb.append(", title=").append(title);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}