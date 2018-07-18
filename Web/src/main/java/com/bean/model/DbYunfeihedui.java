package com.bean.model;

import java.io.Serializable;

public class DbYunfeihedui implements Serializable {
    private String yundanhao;

    private String kezhong;

    private String yunfei;

    private static final long serialVersionUID = 1L;

    public String getYundanhao() {
        return yundanhao;
    }

    public void setYundanhao(String yundanhao) {
        this.yundanhao = yundanhao == null ? null : yundanhao.trim();
    }

    public String getKezhong() {
        return kezhong;
    }

    public void setKezhong(String kezhong) {
        this.kezhong = kezhong == null ? null : kezhong.trim();
    }

    public String getYunfei() {
        return yunfei;
    }

    public void setYunfei(String yunfei) {
        this.yunfei = yunfei == null ? null : yunfei.trim();
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
        DbYunfeihedui other = (DbYunfeihedui) that;
        return (this.getYundanhao() == null ? other.getYundanhao() == null : this.getYundanhao().equals(other.getYundanhao()))
            && (this.getKezhong() == null ? other.getKezhong() == null : this.getKezhong().equals(other.getKezhong()))
            && (this.getYunfei() == null ? other.getYunfei() == null : this.getYunfei().equals(other.getYunfei()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYundanhao() == null) ? 0 : getYundanhao().hashCode());
        result = prime * result + ((getKezhong() == null) ? 0 : getKezhong().hashCode());
        result = prime * result + ((getYunfei() == null) ? 0 : getYunfei().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yundanhao=").append(yundanhao);
        sb.append(", kezhong=").append(kezhong);
        sb.append(", yunfei=").append(yunfei);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}