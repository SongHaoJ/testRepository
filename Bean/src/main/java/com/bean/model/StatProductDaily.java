package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class StatProductDaily implements Serializable {
    private String sequenceid;

    private String yyyy;

    private String yyyymm;

    private String yyyymmdd;

    private String productid;

    private String productname;

    private BigDecimal ordernum;

    private BigDecimal amount;

    private BigDecimal cost;

    private BigDecimal number1;

    private BigDecimal number2;

    private BigDecimal number3;

    private BigDecimal cost1;

    private BigDecimal cost2;

    private BigDecimal cost3;

    private String field1;

    private String field2;

    private String field3;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getYyyy() {
        return yyyy;
    }

    public void setYyyy(String yyyy) {
        this.yyyy = yyyy == null ? null : yyyy.trim();
    }

    public String getYyyymm() {
        return yyyymm;
    }

    public void setYyyymm(String yyyymm) {
        this.yyyymm = yyyymm == null ? null : yyyymm.trim();
    }

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd == null ? null : yyyymmdd.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getNumber1() {
        return number1;
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public BigDecimal getNumber2() {
        return number2;
    }

    public void setNumber2(BigDecimal number2) {
        this.number2 = number2;
    }

    public BigDecimal getNumber3() {
        return number3;
    }

    public void setNumber3(BigDecimal number3) {
        this.number3 = number3;
    }

    public BigDecimal getCost1() {
        return cost1;
    }

    public void setCost1(BigDecimal cost1) {
        this.cost1 = cost1;
    }

    public BigDecimal getCost2() {
        return cost2;
    }

    public void setCost2(BigDecimal cost2) {
        this.cost2 = cost2;
    }

    public BigDecimal getCost3() {
        return cost3;
    }

    public void setCost3(BigDecimal cost3) {
        this.cost3 = cost3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
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
        StatProductDaily other = (StatProductDaily) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getYyyy() == null ? other.getYyyy() == null : this.getYyyy().equals(other.getYyyy()))
            && (this.getYyyymm() == null ? other.getYyyymm() == null : this.getYyyymm().equals(other.getYyyymm()))
            && (this.getYyyymmdd() == null ? other.getYyyymmdd() == null : this.getYyyymmdd().equals(other.getYyyymmdd()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getNumber1() == null ? other.getNumber1() == null : this.getNumber1().equals(other.getNumber1()))
            && (this.getNumber2() == null ? other.getNumber2() == null : this.getNumber2().equals(other.getNumber2()))
            && (this.getNumber3() == null ? other.getNumber3() == null : this.getNumber3().equals(other.getNumber3()))
            && (this.getCost1() == null ? other.getCost1() == null : this.getCost1().equals(other.getCost1()))
            && (this.getCost2() == null ? other.getCost2() == null : this.getCost2().equals(other.getCost2()))
            && (this.getCost3() == null ? other.getCost3() == null : this.getCost3().equals(other.getCost3()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getYyyy() == null) ? 0 : getYyyy().hashCode());
        result = prime * result + ((getYyyymm() == null) ? 0 : getYyyymm().hashCode());
        result = prime * result + ((getYyyymmdd() == null) ? 0 : getYyyymmdd().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getNumber1() == null) ? 0 : getNumber1().hashCode());
        result = prime * result + ((getNumber2() == null) ? 0 : getNumber2().hashCode());
        result = prime * result + ((getNumber3() == null) ? 0 : getNumber3().hashCode());
        result = prime * result + ((getCost1() == null) ? 0 : getCost1().hashCode());
        result = prime * result + ((getCost2() == null) ? 0 : getCost2().hashCode());
        result = prime * result + ((getCost3() == null) ? 0 : getCost3().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", yyyy=").append(yyyy);
        sb.append(", yyyymm=").append(yyyymm);
        sb.append(", yyyymmdd=").append(yyyymmdd);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", amount=").append(amount);
        sb.append(", cost=").append(cost);
        sb.append(", number1=").append(number1);
        sb.append(", number2=").append(number2);
        sb.append(", number3=").append(number3);
        sb.append(", cost1=").append(cost1);
        sb.append(", cost2=").append(cost2);
        sb.append(", cost3=").append(cost3);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}