package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbAddaction implements Serializable {
    private String sequenceid;

    private String function3;

    private String function11;

    private String function8;

    private String searchname;

    private String function9;

    private BigDecimal sort;

    private String function13;

    private String function6;

    private String function7;

    private String function12;

    private String functionname;

    private String function2;

    private String function4;

    private String function14;

    private String sqlwhere;

    private String function1;

    private String function10;

    private String searchid;

    private String descr;

    private String functionid;

    private String function15;

    private String function5;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getFunction3() {
        return function3;
    }

    public void setFunction3(String function3) {
        this.function3 = function3 == null ? null : function3.trim();
    }

    public String getFunction11() {
        return function11;
    }

    public void setFunction11(String function11) {
        this.function11 = function11 == null ? null : function11.trim();
    }

    public String getFunction8() {
        return function8;
    }

    public void setFunction8(String function8) {
        this.function8 = function8 == null ? null : function8.trim();
    }

    public String getSearchname() {
        return searchname;
    }

    public void setSearchname(String searchname) {
        this.searchname = searchname == null ? null : searchname.trim();
    }

    public String getFunction9() {
        return function9;
    }

    public void setFunction9(String function9) {
        this.function9 = function9 == null ? null : function9.trim();
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public String getFunction13() {
        return function13;
    }

    public void setFunction13(String function13) {
        this.function13 = function13 == null ? null : function13.trim();
    }

    public String getFunction6() {
        return function6;
    }

    public void setFunction6(String function6) {
        this.function6 = function6 == null ? null : function6.trim();
    }

    public String getFunction7() {
        return function7;
    }

    public void setFunction7(String function7) {
        this.function7 = function7 == null ? null : function7.trim();
    }

    public String getFunction12() {
        return function12;
    }

    public void setFunction12(String function12) {
        this.function12 = function12 == null ? null : function12.trim();
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    public String getFunction2() {
        return function2;
    }

    public void setFunction2(String function2) {
        this.function2 = function2 == null ? null : function2.trim();
    }

    public String getFunction4() {
        return function4;
    }

    public void setFunction4(String function4) {
        this.function4 = function4 == null ? null : function4.trim();
    }

    public String getFunction14() {
        return function14;
    }

    public void setFunction14(String function14) {
        this.function14 = function14 == null ? null : function14.trim();
    }

    public String getSqlwhere() {
        return sqlwhere;
    }

    public void setSqlwhere(String sqlwhere) {
        this.sqlwhere = sqlwhere == null ? null : sqlwhere.trim();
    }

    public String getFunction1() {
        return function1;
    }

    public void setFunction1(String function1) {
        this.function1 = function1 == null ? null : function1.trim();
    }

    public String getFunction10() {
        return function10;
    }

    public void setFunction10(String function10) {
        this.function10 = function10 == null ? null : function10.trim();
    }

    public String getSearchid() {
        return searchid;
    }

    public void setSearchid(String searchid) {
        this.searchid = searchid == null ? null : searchid.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getFunctionid() {
        return functionid;
    }

    public void setFunctionid(String functionid) {
        this.functionid = functionid == null ? null : functionid.trim();
    }

    public String getFunction15() {
        return function15;
    }

    public void setFunction15(String function15) {
        this.function15 = function15 == null ? null : function15.trim();
    }

    public String getFunction5() {
        return function5;
    }

    public void setFunction5(String function5) {
        this.function5 = function5 == null ? null : function5.trim();
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
        DbAddaction other = (DbAddaction) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getFunction3() == null ? other.getFunction3() == null : this.getFunction3().equals(other.getFunction3()))
            && (this.getFunction11() == null ? other.getFunction11() == null : this.getFunction11().equals(other.getFunction11()))
            && (this.getFunction8() == null ? other.getFunction8() == null : this.getFunction8().equals(other.getFunction8()))
            && (this.getSearchname() == null ? other.getSearchname() == null : this.getSearchname().equals(other.getSearchname()))
            && (this.getFunction9() == null ? other.getFunction9() == null : this.getFunction9().equals(other.getFunction9()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getFunction13() == null ? other.getFunction13() == null : this.getFunction13().equals(other.getFunction13()))
            && (this.getFunction6() == null ? other.getFunction6() == null : this.getFunction6().equals(other.getFunction6()))
            && (this.getFunction7() == null ? other.getFunction7() == null : this.getFunction7().equals(other.getFunction7()))
            && (this.getFunction12() == null ? other.getFunction12() == null : this.getFunction12().equals(other.getFunction12()))
            && (this.getFunctionname() == null ? other.getFunctionname() == null : this.getFunctionname().equals(other.getFunctionname()))
            && (this.getFunction2() == null ? other.getFunction2() == null : this.getFunction2().equals(other.getFunction2()))
            && (this.getFunction4() == null ? other.getFunction4() == null : this.getFunction4().equals(other.getFunction4()))
            && (this.getFunction14() == null ? other.getFunction14() == null : this.getFunction14().equals(other.getFunction14()))
            && (this.getSqlwhere() == null ? other.getSqlwhere() == null : this.getSqlwhere().equals(other.getSqlwhere()))
            && (this.getFunction1() == null ? other.getFunction1() == null : this.getFunction1().equals(other.getFunction1()))
            && (this.getFunction10() == null ? other.getFunction10() == null : this.getFunction10().equals(other.getFunction10()))
            && (this.getSearchid() == null ? other.getSearchid() == null : this.getSearchid().equals(other.getSearchid()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getFunctionid() == null ? other.getFunctionid() == null : this.getFunctionid().equals(other.getFunctionid()))
            && (this.getFunction15() == null ? other.getFunction15() == null : this.getFunction15().equals(other.getFunction15()))
            && (this.getFunction5() == null ? other.getFunction5() == null : this.getFunction5().equals(other.getFunction5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getFunction3() == null) ? 0 : getFunction3().hashCode());
        result = prime * result + ((getFunction11() == null) ? 0 : getFunction11().hashCode());
        result = prime * result + ((getFunction8() == null) ? 0 : getFunction8().hashCode());
        result = prime * result + ((getSearchname() == null) ? 0 : getSearchname().hashCode());
        result = prime * result + ((getFunction9() == null) ? 0 : getFunction9().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getFunction13() == null) ? 0 : getFunction13().hashCode());
        result = prime * result + ((getFunction6() == null) ? 0 : getFunction6().hashCode());
        result = prime * result + ((getFunction7() == null) ? 0 : getFunction7().hashCode());
        result = prime * result + ((getFunction12() == null) ? 0 : getFunction12().hashCode());
        result = prime * result + ((getFunctionname() == null) ? 0 : getFunctionname().hashCode());
        result = prime * result + ((getFunction2() == null) ? 0 : getFunction2().hashCode());
        result = prime * result + ((getFunction4() == null) ? 0 : getFunction4().hashCode());
        result = prime * result + ((getFunction14() == null) ? 0 : getFunction14().hashCode());
        result = prime * result + ((getSqlwhere() == null) ? 0 : getSqlwhere().hashCode());
        result = prime * result + ((getFunction1() == null) ? 0 : getFunction1().hashCode());
        result = prime * result + ((getFunction10() == null) ? 0 : getFunction10().hashCode());
        result = prime * result + ((getSearchid() == null) ? 0 : getSearchid().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getFunctionid() == null) ? 0 : getFunctionid().hashCode());
        result = prime * result + ((getFunction15() == null) ? 0 : getFunction15().hashCode());
        result = prime * result + ((getFunction5() == null) ? 0 : getFunction5().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", function3=").append(function3);
        sb.append(", function11=").append(function11);
        sb.append(", function8=").append(function8);
        sb.append(", searchname=").append(searchname);
        sb.append(", function9=").append(function9);
        sb.append(", sort=").append(sort);
        sb.append(", function13=").append(function13);
        sb.append(", function6=").append(function6);
        sb.append(", function7=").append(function7);
        sb.append(", function12=").append(function12);
        sb.append(", functionname=").append(functionname);
        sb.append(", function2=").append(function2);
        sb.append(", function4=").append(function4);
        sb.append(", function14=").append(function14);
        sb.append(", sqlwhere=").append(sqlwhere);
        sb.append(", function1=").append(function1);
        sb.append(", function10=").append(function10);
        sb.append(", searchid=").append(searchid);
        sb.append(", descr=").append(descr);
        sb.append(", functionid=").append(functionid);
        sb.append(", function15=").append(function15);
        sb.append(", function5=").append(function5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}