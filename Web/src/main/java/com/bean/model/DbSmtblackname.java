package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSmtblackname implements Serializable {
    private BigDecimal sid;

    private String name;

    private String oper;

    private String reserve1;

    private String reserve4;

    private Date opertime;

    private String reserve3;

    private String reserve2;

    private String descr;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbSmtblackname other = (DbSmtblackname) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", name=").append(name);
        sb.append(", oper=").append(oper);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}