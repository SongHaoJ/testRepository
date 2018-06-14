package com.bean.model;

import java.io.Serializable;

public class DbEndiciamailpieceshape implements Serializable {
    private String sid;

    private String mailpieceshape;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getMailpieceshape() {
        return mailpieceshape;
    }

    public void setMailpieceshape(String mailpieceshape) {
        this.mailpieceshape = mailpieceshape == null ? null : mailpieceshape.trim();
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
        DbEndiciamailpieceshape other = (DbEndiciamailpieceshape) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getMailpieceshape() == null ? other.getMailpieceshape() == null : this.getMailpieceshape().equals(other.getMailpieceshape()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getMailpieceshape() == null) ? 0 : getMailpieceshape().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", mailpieceshape=").append(mailpieceshape);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}