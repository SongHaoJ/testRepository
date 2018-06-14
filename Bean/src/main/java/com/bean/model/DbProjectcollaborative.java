package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbProjectcollaborative implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal projectid;

    private String coper;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getProjectid() {
        return projectid;
    }

    public void setProjectid(BigDecimal projectid) {
        this.projectid = projectid;
    }

    public String getCoper() {
        return coper;
    }

    public void setCoper(String coper) {
        this.coper = coper == null ? null : coper.trim();
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
        DbProjectcollaborative other = (DbProjectcollaborative) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProjectid() == null ? other.getProjectid() == null : this.getProjectid().equals(other.getProjectid()))
            && (this.getCoper() == null ? other.getCoper() == null : this.getCoper().equals(other.getCoper()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProjectid() == null) ? 0 : getProjectid().hashCode());
        result = prime * result + ((getCoper() == null) ? 0 : getCoper().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", projectid=").append(projectid);
        sb.append(", coper=").append(coper);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}