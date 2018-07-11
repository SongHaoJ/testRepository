package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbFunctionconfig implements Serializable {
    private BigDecimal sid;

    private String name;

    private String oper;

    private String spbasecode;

    private BigDecimal openflag;

    private Date opertime;

    private String creatoper;

    private BigDecimal status;

    private BigDecimal functionid;

    private Date creattime;

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

    public String getSpbasecode() {
        return spbasecode;
    }

    public void setSpbasecode(String spbasecode) {
        this.spbasecode = spbasecode == null ? null : spbasecode.trim();
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getCreatoper() {
        return creatoper;
    }

    public void setCreatoper(String creatoper) {
        this.creatoper = creatoper == null ? null : creatoper.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getFunctionid() {
        return functionid;
    }

    public void setFunctionid(BigDecimal functionid) {
        this.functionid = functionid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
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
        DbFunctionconfig other = (DbFunctionconfig) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getSpbasecode() == null ? other.getSpbasecode() == null : this.getSpbasecode().equals(other.getSpbasecode()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreatoper() == null ? other.getCreatoper() == null : this.getCreatoper().equals(other.getCreatoper()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFunctionid() == null ? other.getFunctionid() == null : this.getFunctionid().equals(other.getFunctionid()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getSpbasecode() == null) ? 0 : getSpbasecode().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreatoper() == null) ? 0 : getCreatoper().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFunctionid() == null) ? 0 : getFunctionid().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
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
        sb.append(", spbasecode=").append(spbasecode);
        sb.append(", openflag=").append(openflag);
        sb.append(", opertime=").append(opertime);
        sb.append(", creatoper=").append(creatoper);
        sb.append(", status=").append(status);
        sb.append(", functionid=").append(functionid);
        sb.append(", creattime=").append(creattime);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}