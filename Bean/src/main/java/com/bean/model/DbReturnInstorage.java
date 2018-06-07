package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbReturnInstorage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.RETURNSID
     *
     * @mbg.generated
     */
    private BigDecimal returnsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.ORDERID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.ORDERNUM
     *
     * @mbg.generated
     */
    private BigDecimal ordernum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.RETURNNUM
     *
     * @mbg.generated
     */
    private BigDecimal returnnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.INNUM
     *
     * @mbg.generated
     */
    private BigDecimal innum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.FLAG
     *
     * @mbg.generated
     */
    private String flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.FLAGDESCR
     *
     * @mbg.generated
     */
    private String flagdescr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.COSTPRICE
     *
     * @mbg.generated
     */
    private BigDecimal costprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.AMOUNT
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.MANUFACTUREID
     *
     * @mbg.generated
     */
    private String manufactureid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.MANUFACTURE
     *
     * @mbg.generated
     */
    private String manufacture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.PRODUCTNAME
     *
     * @mbg.generated
     */
    private String productname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_return_instorage.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_return_instorage
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.SEQUENCEID
     *
     * @return the value of db_return_instorage.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.SEQUENCEID
     *
     * @param sequenceid the value for db_return_instorage.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.RETURNSID
     *
     * @return the value of db_return_instorage.RETURNSID
     *
     * @mbg.generated
     */
    public BigDecimal getReturnsid() {
        return returnsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.RETURNSID
     *
     * @param returnsid the value for db_return_instorage.RETURNSID
     *
     * @mbg.generated
     */
    public void setReturnsid(BigDecimal returnsid) {
        this.returnsid = returnsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.ORDERID
     *
     * @return the value of db_return_instorage.ORDERID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.ORDERID
     *
     * @param orderid the value for db_return_instorage.ORDERID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.PRODUCTID
     *
     * @return the value of db_return_instorage.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.PRODUCTID
     *
     * @param productid the value for db_return_instorage.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.ORDERNUM
     *
     * @return the value of db_return_instorage.ORDERNUM
     *
     * @mbg.generated
     */
    public BigDecimal getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.ORDERNUM
     *
     * @param ordernum the value for db_return_instorage.ORDERNUM
     *
     * @mbg.generated
     */
    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.RETURNNUM
     *
     * @return the value of db_return_instorage.RETURNNUM
     *
     * @mbg.generated
     */
    public BigDecimal getReturnnum() {
        return returnnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.RETURNNUM
     *
     * @param returnnum the value for db_return_instorage.RETURNNUM
     *
     * @mbg.generated
     */
    public void setReturnnum(BigDecimal returnnum) {
        this.returnnum = returnnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.INNUM
     *
     * @return the value of db_return_instorage.INNUM
     *
     * @mbg.generated
     */
    public BigDecimal getInnum() {
        return innum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.INNUM
     *
     * @param innum the value for db_return_instorage.INNUM
     *
     * @mbg.generated
     */
    public void setInnum(BigDecimal innum) {
        this.innum = innum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.OPER
     *
     * @return the value of db_return_instorage.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.OPER
     *
     * @param oper the value for db_return_instorage.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.OPERTIME
     *
     * @return the value of db_return_instorage.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.OPERTIME
     *
     * @param opertime the value for db_return_instorage.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.FLAG
     *
     * @return the value of db_return_instorage.FLAG
     *
     * @mbg.generated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.FLAG
     *
     * @param flag the value for db_return_instorage.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.FLAGDESCR
     *
     * @return the value of db_return_instorage.FLAGDESCR
     *
     * @mbg.generated
     */
    public String getFlagdescr() {
        return flagdescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.FLAGDESCR
     *
     * @param flagdescr the value for db_return_instorage.FLAGDESCR
     *
     * @mbg.generated
     */
    public void setFlagdescr(String flagdescr) {
        this.flagdescr = flagdescr == null ? null : flagdescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.COSTPRICE
     *
     * @return the value of db_return_instorage.COSTPRICE
     *
     * @mbg.generated
     */
    public BigDecimal getCostprice() {
        return costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.COSTPRICE
     *
     * @param costprice the value for db_return_instorage.COSTPRICE
     *
     * @mbg.generated
     */
    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.AMOUNT
     *
     * @return the value of db_return_instorage.AMOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.AMOUNT
     *
     * @param amount the value for db_return_instorage.AMOUNT
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.MANUFACTUREID
     *
     * @return the value of db_return_instorage.MANUFACTUREID
     *
     * @mbg.generated
     */
    public String getManufactureid() {
        return manufactureid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.MANUFACTUREID
     *
     * @param manufactureid the value for db_return_instorage.MANUFACTUREID
     *
     * @mbg.generated
     */
    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.MANUFACTURE
     *
     * @return the value of db_return_instorage.MANUFACTURE
     *
     * @mbg.generated
     */
    public String getManufacture() {
        return manufacture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.MANUFACTURE
     *
     * @param manufacture the value for db_return_instorage.MANUFACTURE
     *
     * @mbg.generated
     */
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.PRODUCTNAME
     *
     * @return the value of db_return_instorage.PRODUCTNAME
     *
     * @mbg.generated
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.PRODUCTNAME
     *
     * @param productname the value for db_return_instorage.PRODUCTNAME
     *
     * @mbg.generated
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_return_instorage.DESCR
     *
     * @return the value of db_return_instorage.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_return_instorage.DESCR
     *
     * @param descr the value for db_return_instorage.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_return_instorage
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
        DbReturnInstorage other = (DbReturnInstorage) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getReturnsid() == null ? other.getReturnsid() == null : this.getReturnsid().equals(other.getReturnsid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getReturnnum() == null ? other.getReturnnum() == null : this.getReturnnum().equals(other.getReturnnum()))
            && (this.getInnum() == null ? other.getInnum() == null : this.getInnum().equals(other.getInnum()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getFlagdescr() == null ? other.getFlagdescr() == null : this.getFlagdescr().equals(other.getFlagdescr()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_return_instorage
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getReturnsid() == null) ? 0 : getReturnsid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getReturnnum() == null) ? 0 : getReturnnum().hashCode());
        result = prime * result + ((getInnum() == null) ? 0 : getInnum().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getFlagdescr() == null) ? 0 : getFlagdescr().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_return_instorage
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
        sb.append(", returnsid=").append(returnsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", productid=").append(productid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", returnnum=").append(returnnum);
        sb.append(", innum=").append(innum);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", flag=").append(flag);
        sb.append(", flagdescr=").append(flagdescr);
        sb.append(", costprice=").append(costprice);
        sb.append(", amount=").append(amount);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", productname=").append(productname);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}