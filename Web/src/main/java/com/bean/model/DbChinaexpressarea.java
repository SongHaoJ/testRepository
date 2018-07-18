package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbChinaexpressarea implements Serializable {
    private String sequenceid;

    private String name;

    private String descr;

    private String oper;

    private Date opertime;

    private BigDecimal basemoney;

    private BigDecimal baseweight;

    private BigDecimal unitmoney;

    private BigDecimal unitweight;

    private BigDecimal discount;

    private BigDecimal overweight;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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

    public BigDecimal getBasemoney() {
        return basemoney;
    }

    public void setBasemoney(BigDecimal basemoney) {
        this.basemoney = basemoney;
    }

    public BigDecimal getBaseweight() {
        return baseweight;
    }

    public void setBaseweight(BigDecimal baseweight) {
        this.baseweight = baseweight;
    }

    public BigDecimal getUnitmoney() {
        return unitmoney;
    }

    public void setUnitmoney(BigDecimal unitmoney) {
        this.unitmoney = unitmoney;
    }

    public BigDecimal getUnitweight() {
        return unitweight;
    }

    public void setUnitweight(BigDecimal unitweight) {
        this.unitweight = unitweight;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getOverweight() {
        return overweight;
    }

    public void setOverweight(BigDecimal overweight) {
        this.overweight = overweight;
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
        DbChinaexpressarea other = (DbChinaexpressarea) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getBasemoney() == null ? other.getBasemoney() == null : this.getBasemoney().equals(other.getBasemoney()))
            && (this.getBaseweight() == null ? other.getBaseweight() == null : this.getBaseweight().equals(other.getBaseweight()))
            && (this.getUnitmoney() == null ? other.getUnitmoney() == null : this.getUnitmoney().equals(other.getUnitmoney()))
            && (this.getUnitweight() == null ? other.getUnitweight() == null : this.getUnitweight().equals(other.getUnitweight()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getOverweight() == null ? other.getOverweight() == null : this.getOverweight().equals(other.getOverweight()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getBasemoney() == null) ? 0 : getBasemoney().hashCode());
        result = prime * result + ((getBaseweight() == null) ? 0 : getBaseweight().hashCode());
        result = prime * result + ((getUnitmoney() == null) ? 0 : getUnitmoney().hashCode());
        result = prime * result + ((getUnitweight() == null) ? 0 : getUnitweight().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getOverweight() == null) ? 0 : getOverweight().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", name=").append(name);
        sb.append(", descr=").append(descr);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", basemoney=").append(basemoney);
        sb.append(", baseweight=").append(baseweight);
        sb.append(", unitmoney=").append(unitmoney);
        sb.append(", unitweight=").append(unitweight);
        sb.append(", discount=").append(discount);
        sb.append(", overweight=").append(overweight);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}