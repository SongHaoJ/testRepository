package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbVotoboaccount implements Serializable {
    private String sid;

    private String votoboaccount;

    private String votobotoken;

    private Integer status;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getVotoboaccount() {
        return votoboaccount;
    }

    public void setVotoboaccount(String votoboaccount) {
        this.votoboaccount = votoboaccount == null ? null : votoboaccount.trim();
    }

    public String getVotobotoken() {
        return votobotoken;
    }

    public void setVotobotoken(String votobotoken) {
        this.votobotoken = votobotoken == null ? null : votobotoken.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        DbVotoboaccount other = (DbVotoboaccount) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getVotoboaccount() == null ? other.getVotoboaccount() == null : this.getVotoboaccount().equals(other.getVotoboaccount()))
            && (this.getVotobotoken() == null ? other.getVotobotoken() == null : this.getVotobotoken().equals(other.getVotobotoken()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getVotoboaccount() == null) ? 0 : getVotoboaccount().hashCode());
        result = prime * result + ((getVotobotoken() == null) ? 0 : getVotobotoken().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", votoboaccount=").append(votoboaccount);
        sb.append(", votobotoken=").append(votobotoken);
        sb.append(", status=").append(status);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}