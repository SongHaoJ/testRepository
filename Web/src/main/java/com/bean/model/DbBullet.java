package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbBullet implements Serializable {
    private String sequenceid;

    private String spcode;

    private BigDecimal target;

    private Date smsdate;

    private BigDecimal bullettype;

    private String oper;

    private Date opertime;

    private String openflag;

    private BigDecimal myid;

    private String btitle;

    private String content;

    private String boper;

    private String bgroup;

    private String bclass;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSpcode() {
        return spcode;
    }

    public void setSpcode(String spcode) {
        this.spcode = spcode == null ? null : spcode.trim();
    }

    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    public Date getSmsdate() {
        return smsdate;
    }

    public void setSmsdate(Date smsdate) {
        this.smsdate = smsdate;
    }

    public BigDecimal getBullettype() {
        return bullettype;
    }

    public void setBullettype(BigDecimal bullettype) {
        this.bullettype = bullettype;
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

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public BigDecimal getMyid() {
        return myid;
    }

    public void setMyid(BigDecimal myid) {
        this.myid = myid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle == null ? null : btitle.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getBoper() {
        return boper;
    }

    public void setBoper(String boper) {
        this.boper = boper == null ? null : boper.trim();
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup == null ? null : bgroup.trim();
    }

    public String getBclass() {
        return bclass;
    }

    public void setBclass(String bclass) {
        this.bclass = bclass == null ? null : bclass.trim();
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
        DbBullet other = (DbBullet) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSpcode() == null ? other.getSpcode() == null : this.getSpcode().equals(other.getSpcode()))
            && (this.getTarget() == null ? other.getTarget() == null : this.getTarget().equals(other.getTarget()))
            && (this.getSmsdate() == null ? other.getSmsdate() == null : this.getSmsdate().equals(other.getSmsdate()))
            && (this.getBullettype() == null ? other.getBullettype() == null : this.getBullettype().equals(other.getBullettype()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getMyid() == null ? other.getMyid() == null : this.getMyid().equals(other.getMyid()))
            && (this.getBtitle() == null ? other.getBtitle() == null : this.getBtitle().equals(other.getBtitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getBoper() == null ? other.getBoper() == null : this.getBoper().equals(other.getBoper()))
            && (this.getBgroup() == null ? other.getBgroup() == null : this.getBgroup().equals(other.getBgroup()))
            && (this.getBclass() == null ? other.getBclass() == null : this.getBclass().equals(other.getBclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSpcode() == null) ? 0 : getSpcode().hashCode());
        result = prime * result + ((getTarget() == null) ? 0 : getTarget().hashCode());
        result = prime * result + ((getSmsdate() == null) ? 0 : getSmsdate().hashCode());
        result = prime * result + ((getBullettype() == null) ? 0 : getBullettype().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getMyid() == null) ? 0 : getMyid().hashCode());
        result = prime * result + ((getBtitle() == null) ? 0 : getBtitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getBoper() == null) ? 0 : getBoper().hashCode());
        result = prime * result + ((getBgroup() == null) ? 0 : getBgroup().hashCode());
        result = prime * result + ((getBclass() == null) ? 0 : getBclass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", spcode=").append(spcode);
        sb.append(", target=").append(target);
        sb.append(", smsdate=").append(smsdate);
        sb.append(", bullettype=").append(bullettype);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", myid=").append(myid);
        sb.append(", btitle=").append(btitle);
        sb.append(", content=").append(content);
        sb.append(", boper=").append(boper);
        sb.append(", bgroup=").append(bgroup);
        sb.append(", bclass=").append(bclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}