package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbTestexpress implements Serializable {
    private String dbPackage;

    private String labelstr;

    private BigDecimal cnminiparcel10x10;

    private BigDecimal a6;

    private BigDecimal a4;

    private String sid;

    private String expresstype;

    private String currency;

    private BigDecimal a7;

    private static final long serialVersionUID = 1L;

    public String getDbPackage() {
        return dbPackage;
    }

    public void setDbPackage(String dbPackage) {
        this.dbPackage = dbPackage == null ? null : dbPackage.trim();
    }

    public String getLabelstr() {
        return labelstr;
    }

    public void setLabelstr(String labelstr) {
        this.labelstr = labelstr == null ? null : labelstr.trim();
    }

    public BigDecimal getCnminiparcel10x10() {
        return cnminiparcel10x10;
    }

    public void setCnminiparcel10x10(BigDecimal cnminiparcel10x10) {
        this.cnminiparcel10x10 = cnminiparcel10x10;
    }

    public BigDecimal getA6() {
        return a6;
    }

    public void setA6(BigDecimal a6) {
        this.a6 = a6;
    }

    public BigDecimal getA4() {
        return a4;
    }

    public void setA4(BigDecimal a4) {
        this.a4 = a4;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getA7() {
        return a7;
    }

    public void setA7(BigDecimal a7) {
        this.a7 = a7;
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
        DbTestexpress other = (DbTestexpress) that;
        return (this.getDbPackage() == null ? other.getDbPackage() == null : this.getDbPackage().equals(other.getDbPackage()))
            && (this.getLabelstr() == null ? other.getLabelstr() == null : this.getLabelstr().equals(other.getLabelstr()))
            && (this.getCnminiparcel10x10() == null ? other.getCnminiparcel10x10() == null : this.getCnminiparcel10x10().equals(other.getCnminiparcel10x10()))
            && (this.getA6() == null ? other.getA6() == null : this.getA6().equals(other.getA6()))
            && (this.getA4() == null ? other.getA4() == null : this.getA4().equals(other.getA4()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getA7() == null ? other.getA7() == null : this.getA7().equals(other.getA7()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDbPackage() == null) ? 0 : getDbPackage().hashCode());
        result = prime * result + ((getLabelstr() == null) ? 0 : getLabelstr().hashCode());
        result = prime * result + ((getCnminiparcel10x10() == null) ? 0 : getCnminiparcel10x10().hashCode());
        result = prime * result + ((getA6() == null) ? 0 : getA6().hashCode());
        result = prime * result + ((getA4() == null) ? 0 : getA4().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getA7() == null) ? 0 : getA7().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dbPackage=").append(dbPackage);
        sb.append(", labelstr=").append(labelstr);
        sb.append(", cnminiparcel10x10=").append(cnminiparcel10x10);
        sb.append(", a6=").append(a6);
        sb.append(", a4=").append(a4);
        sb.append(", sid=").append(sid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", currency=").append(currency);
        sb.append(", a7=").append(a7);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}