package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCompanyconfig implements Serializable {
    private String sequenceid;

    private String expresstypeid;

    private String expresstypename;

    private String companyid;

    private String companyname;

    private String descr;

    private BigDecimal basemoney;

    private BigDecimal baseweight;

    private BigDecimal unitmoney;

    private BigDecimal unitweight;

    private BigDecimal discount;

    private BigDecimal overweight;

    private String oper;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
    }

    public String getExpresstypename() {
        return expresstypename;
    }

    public void setExpresstypename(String expresstypename) {
        this.expresstypename = expresstypename == null ? null : expresstypename.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
    }

    public BigDecimal getReserve7() {
        return reserve7;
    }

    public void setReserve7(BigDecimal reserve7) {
        this.reserve7 = reserve7;
    }

    public BigDecimal getReserve8() {
        return reserve8;
    }

    public void setReserve8(BigDecimal reserve8) {
        this.reserve8 = reserve8;
    }

    public BigDecimal getReserve9() {
        return reserve9;
    }

    public void setReserve9(BigDecimal reserve9) {
        this.reserve9 = reserve9;
    }

    public BigDecimal getReserve10() {
        return reserve10;
    }

    public void setReserve10(BigDecimal reserve10) {
        this.reserve10 = reserve10;
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
        DbCompanyconfig other = (DbCompanyconfig) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getExpresstypename() == null ? other.getExpresstypename() == null : this.getExpresstypename().equals(other.getExpresstypename()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getBasemoney() == null ? other.getBasemoney() == null : this.getBasemoney().equals(other.getBasemoney()))
            && (this.getBaseweight() == null ? other.getBaseweight() == null : this.getBaseweight().equals(other.getBaseweight()))
            && (this.getUnitmoney() == null ? other.getUnitmoney() == null : this.getUnitmoney().equals(other.getUnitmoney()))
            && (this.getUnitweight() == null ? other.getUnitweight() == null : this.getUnitweight().equals(other.getUnitweight()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getOverweight() == null ? other.getOverweight() == null : this.getOverweight().equals(other.getOverweight()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getExpresstypename() == null) ? 0 : getExpresstypename().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getBasemoney() == null) ? 0 : getBasemoney().hashCode());
        result = prime * result + ((getBaseweight() == null) ? 0 : getBaseweight().hashCode());
        result = prime * result + ((getUnitmoney() == null) ? 0 : getUnitmoney().hashCode());
        result = prime * result + ((getUnitweight() == null) ? 0 : getUnitweight().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getOverweight() == null) ? 0 : getOverweight().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", expresstypename=").append(expresstypename);
        sb.append(", companyid=").append(companyid);
        sb.append(", companyname=").append(companyname);
        sb.append(", descr=").append(descr);
        sb.append(", basemoney=").append(basemoney);
        sb.append(", baseweight=").append(baseweight);
        sb.append(", unitmoney=").append(unitmoney);
        sb.append(", unitweight=").append(unitweight);
        sb.append(", discount=").append(discount);
        sb.append(", overweight=").append(overweight);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}