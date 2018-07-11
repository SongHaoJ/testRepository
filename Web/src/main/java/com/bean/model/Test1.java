package com.bean.model;

import java.io.Serializable;

public class Test1 implements Serializable {
    private Integer id;

    private String t1;

    private String t2;

    private String url;

    private String token;

    private Integer stockid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1 == null ? null : t1.trim();
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2 == null ? null : t2.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
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
        Test1 other = (Test1) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getT1() == null ? other.getT1() == null : this.getT1().equals(other.getT1()))
            && (this.getT2() == null ? other.getT2() == null : this.getT2().equals(other.getT2()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getStockid() == null ? other.getStockid() == null : this.getStockid().equals(other.getStockid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getT1() == null) ? 0 : getT1().hashCode());
        result = prime * result + ((getT2() == null) ? 0 : getT2().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getStockid() == null) ? 0 : getStockid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", t1=").append(t1);
        sb.append(", t2=").append(t2);
        sb.append(", url=").append(url);
        sb.append(", token=").append(token);
        sb.append(", stockid=").append(stockid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}