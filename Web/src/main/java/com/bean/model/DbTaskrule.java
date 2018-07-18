package com.bean.model;

import java.io.Serializable;

public class DbTaskrule implements Serializable {
    private Long id;

    private Short expresstypeid;

    private Short bansendflag;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(Short expresstypeid) {
        this.expresstypeid = expresstypeid;
    }

    public Short getBansendflag() {
        return bansendflag;
    }

    public void setBansendflag(Short bansendflag) {
        this.bansendflag = bansendflag;
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
        DbTaskrule other = (DbTaskrule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getBansendflag() == null ? other.getBansendflag() == null : this.getBansendflag().equals(other.getBansendflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getBansendflag() == null) ? 0 : getBansendflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", bansendflag=").append(bansendflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}