package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbUnionlog implements Serializable {
    private String sequenceid;

    private String unionorderid;

    private String oper;

    private String reserve1;

    private Date opertime;

    private String sourceorderid;

    private BigDecimal flag;

    private String sourcesellid;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getUnionorderid() {
        return unionorderid;
    }

    public void setUnionorderid(String unionorderid) {
        this.unionorderid = unionorderid == null ? null : unionorderid.trim();
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

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getSourceorderid() {
        return sourceorderid;
    }

    public void setSourceorderid(String sourceorderid) {
        this.sourceorderid = sourceorderid == null ? null : sourceorderid.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getSourcesellid() {
        return sourcesellid;
    }

    public void setSourcesellid(String sourcesellid) {
        this.sourcesellid = sourcesellid == null ? null : sourcesellid.trim();
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
        DbUnionlog other = (DbUnionlog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getUnionorderid() == null ? other.getUnionorderid() == null : this.getUnionorderid().equals(other.getUnionorderid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSourceorderid() == null ? other.getSourceorderid() == null : this.getSourceorderid().equals(other.getSourceorderid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getSourcesellid() == null ? other.getSourcesellid() == null : this.getSourcesellid().equals(other.getSourcesellid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getUnionorderid() == null) ? 0 : getUnionorderid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSourceorderid() == null) ? 0 : getSourceorderid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getSourcesellid() == null) ? 0 : getSourcesellid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", unionorderid=").append(unionorderid);
        sb.append(", oper=").append(oper);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", opertime=").append(opertime);
        sb.append(", sourceorderid=").append(sourceorderid);
        sb.append(", flag=").append(flag);
        sb.append(", sourcesellid=").append(sourcesellid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}