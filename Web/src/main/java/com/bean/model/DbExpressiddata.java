package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbExpressiddata implements Serializable {
    private String sid;

    private BigDecimal expressidbegin;

    private BigDecimal expressidend;

    private BigDecimal useexpressid;

    private String expresstype;

    private String operflag;

    private String oper;

    private Date opertime;

    private String createoper;

    private Date creattime;

    private String corpid;

    private String prefix;

    private String suffix;

    private String expresstypeid;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public BigDecimal getExpressidbegin() {
        return expressidbegin;
    }

    public void setExpressidbegin(BigDecimal expressidbegin) {
        this.expressidbegin = expressidbegin;
    }

    public BigDecimal getExpressidend() {
        return expressidend;
    }

    public void setExpressidend(BigDecimal expressidend) {
        this.expressidend = expressidend;
    }

    public BigDecimal getUseexpressid() {
        return useexpressid;
    }

    public void setUseexpressid(BigDecimal useexpressid) {
        this.useexpressid = useexpressid;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getOperflag() {
        return operflag;
    }

    public void setOperflag(String operflag) {
        this.operflag = operflag == null ? null : operflag.trim();
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

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
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
        DbExpressiddata other = (DbExpressiddata) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getExpressidbegin() == null ? other.getExpressidbegin() == null : this.getExpressidbegin().equals(other.getExpressidbegin()))
            && (this.getExpressidend() == null ? other.getExpressidend() == null : this.getExpressidend().equals(other.getExpressidend()))
            && (this.getUseexpressid() == null ? other.getUseexpressid() == null : this.getUseexpressid().equals(other.getUseexpressid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getOperflag() == null ? other.getOperflag() == null : this.getOperflag().equals(other.getOperflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getPrefix() == null ? other.getPrefix() == null : this.getPrefix().equals(other.getPrefix()))
            && (this.getSuffix() == null ? other.getSuffix() == null : this.getSuffix().equals(other.getSuffix()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getExpressidbegin() == null) ? 0 : getExpressidbegin().hashCode());
        result = prime * result + ((getExpressidend() == null) ? 0 : getExpressidend().hashCode());
        result = prime * result + ((getUseexpressid() == null) ? 0 : getUseexpressid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getOperflag() == null) ? 0 : getOperflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        result = prime * result + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", expressidbegin=").append(expressidbegin);
        sb.append(", expressidend=").append(expressidend);
        sb.append(", useexpressid=").append(useexpressid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", operflag=").append(operflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createoper=").append(createoper);
        sb.append(", creattime=").append(creattime);
        sb.append(", corpid=").append(corpid);
        sb.append(", prefix=").append(prefix);
        sb.append(", suffix=").append(suffix);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}