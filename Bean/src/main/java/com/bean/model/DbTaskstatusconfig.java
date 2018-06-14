package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbTaskstatusconfig implements Serializable {
    private String sequenceid;

    private String nodeid;

    private String nodename;

    private String nextnodeid;

    private String nextnodename;

    private String direct;

    private String oper;

    private Date opertime;

    private String corpid;

    private String reserve1;

    private String reserve2;

    private String stype;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getNextnodeid() {
        return nextnodeid;
    }

    public void setNextnodeid(String nextnodeid) {
        this.nextnodeid = nextnodeid == null ? null : nextnodeid.trim();
    }

    public String getNextnodename() {
        return nextnodename;
    }

    public void setNextnodename(String nextnodename) {
        this.nextnodename = nextnodename == null ? null : nextnodename.trim();
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct == null ? null : direct.trim();
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

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
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

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
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
        DbTaskstatusconfig other = (DbTaskstatusconfig) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getNodename() == null ? other.getNodename() == null : this.getNodename().equals(other.getNodename()))
            && (this.getNextnodeid() == null ? other.getNextnodeid() == null : this.getNextnodeid().equals(other.getNextnodeid()))
            && (this.getNextnodename() == null ? other.getNextnodename() == null : this.getNextnodename().equals(other.getNextnodename()))
            && (this.getDirect() == null ? other.getDirect() == null : this.getDirect().equals(other.getDirect()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getNodename() == null) ? 0 : getNodename().hashCode());
        result = prime * result + ((getNextnodeid() == null) ? 0 : getNextnodeid().hashCode());
        result = prime * result + ((getNextnodename() == null) ? 0 : getNextnodename().hashCode());
        result = prime * result + ((getDirect() == null) ? 0 : getDirect().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", nodeid=").append(nodeid);
        sb.append(", nodename=").append(nodename);
        sb.append(", nextnodeid=").append(nextnodeid);
        sb.append(", nextnodename=").append(nextnodename);
        sb.append(", direct=").append(direct);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", stype=").append(stype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}