package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbStatusconfig implements Serializable {
    private BigDecimal sid;

    private BigDecimal statusid;

    private String name;

    private BigDecimal flag;

    private String followoper;

    private Date followtime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public BigDecimal getStatusid() {
        return statusid;
    }

    public void setStatusid(BigDecimal statusid) {
        this.statusid = statusid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getFollowoper() {
        return followoper;
    }

    public void setFollowoper(String followoper) {
        this.followoper = followoper == null ? null : followoper.trim();
    }

    public Date getFollowtime() {
        return followtime;
    }

    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
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
        DbStatusconfig other = (DbStatusconfig) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getStatusid() == null ? other.getStatusid() == null : this.getStatusid().equals(other.getStatusid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getFollowoper() == null ? other.getFollowoper() == null : this.getFollowoper().equals(other.getFollowoper()))
            && (this.getFollowtime() == null ? other.getFollowtime() == null : this.getFollowtime().equals(other.getFollowtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getStatusid() == null) ? 0 : getStatusid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getFollowoper() == null) ? 0 : getFollowoper().hashCode());
        result = prime * result + ((getFollowtime() == null) ? 0 : getFollowtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", statusid=").append(statusid);
        sb.append(", name=").append(name);
        sb.append(", flag=").append(flag);
        sb.append(", followoper=").append(followoper);
        sb.append(", followtime=").append(followtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}