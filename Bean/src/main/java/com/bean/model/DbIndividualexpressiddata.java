package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbIndividualexpressiddata implements Serializable {
    private String expressid;

    private String expresstype;

    private String corpid;

    private String openflag;

    private String oper;

    private Date opertime;

    private String createoper;

    private Date createtime;

    private BigDecimal version;

    private String expresstypeid;

    private String targetordeirid;

    private static final long serialVersionUID = 1L;

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
    }

    public String getTargetordeirid() {
        return targetordeirid;
    }

    public void setTargetordeirid(String targetordeirid) {
        this.targetordeirid = targetordeirid == null ? null : targetordeirid.trim();
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
        DbIndividualexpressiddata other = (DbIndividualexpressiddata) that;
        return (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getTargetordeirid() == null ? other.getTargetordeirid() == null : this.getTargetordeirid().equals(other.getTargetordeirid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getTargetordeirid() == null) ? 0 : getTargetordeirid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressid=").append(expressid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", version=").append(version);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", targetordeirid=").append(targetordeirid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}