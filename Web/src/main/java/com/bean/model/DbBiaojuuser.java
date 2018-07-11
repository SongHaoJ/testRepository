package com.bean.model;

import java.io.Serializable;

public class DbBiaojuuser implements Serializable {
    private Integer id;

    private String biaojutoken;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiaojutoken() {
        return biaojutoken;
    }

    public void setBiaojutoken(String biaojutoken) {
        this.biaojutoken = biaojutoken == null ? null : biaojutoken.trim();
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
        DbBiaojuuser other = (DbBiaojuuser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBiaojutoken() == null ? other.getBiaojutoken() == null : this.getBiaojutoken().equals(other.getBiaojutoken()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBiaojutoken() == null) ? 0 : getBiaojutoken().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", biaojutoken=").append(biaojutoken);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}