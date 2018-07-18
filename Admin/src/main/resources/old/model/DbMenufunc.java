package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbMenufunc implements Serializable {
    private String funid;

    private String funname;

    private String fundesc;

    private BigDecimal ifwinopen;

    private BigDecimal ifparent;

    private String parentid;

    private BigDecimal sort;

    private BigDecimal type;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String url;

    private static final long serialVersionUID = 1L;

    public String getFunid() {
        return funid;
    }

    public void setFunid(String funid) {
        this.funid = funid == null ? null : funid.trim();
    }

    public String getFunname() {
        return funname;
    }

    public void setFunname(String funname) {
        this.funname = funname == null ? null : funname.trim();
    }

    public String getFundesc() {
        return fundesc;
    }

    public void setFundesc(String fundesc) {
        this.fundesc = fundesc == null ? null : fundesc.trim();
    }

    public BigDecimal getIfwinopen() {
        return ifwinopen;
    }

    public void setIfwinopen(BigDecimal ifwinopen) {
        this.ifwinopen = ifwinopen;
    }

    public BigDecimal getIfparent() {
        return ifparent;
    }

    public void setIfparent(BigDecimal ifparent) {
        this.ifparent = ifparent;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
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

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        DbMenufunc other = (DbMenufunc) that;
        return (this.getFunid() == null ? other.getFunid() == null : this.getFunid().equals(other.getFunid()))
            && (this.getFunname() == null ? other.getFunname() == null : this.getFunname().equals(other.getFunname()))
            && (this.getFundesc() == null ? other.getFundesc() == null : this.getFundesc().equals(other.getFundesc()))
            && (this.getIfwinopen() == null ? other.getIfwinopen() == null : this.getIfwinopen().equals(other.getIfwinopen()))
            && (this.getIfparent() == null ? other.getIfparent() == null : this.getIfparent().equals(other.getIfparent()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFunid() == null) ? 0 : getFunid().hashCode());
        result = prime * result + ((getFunname() == null) ? 0 : getFunname().hashCode());
        result = prime * result + ((getFundesc() == null) ? 0 : getFundesc().hashCode());
        result = prime * result + ((getIfwinopen() == null) ? 0 : getIfwinopen().hashCode());
        result = prime * result + ((getIfparent() == null) ? 0 : getIfparent().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funid=").append(funid);
        sb.append(", funname=").append(funname);
        sb.append(", fundesc=").append(fundesc);
        sb.append(", ifwinopen=").append(ifwinopen);
        sb.append(", ifparent=").append(ifparent);
        sb.append(", parentid=").append(parentid);
        sb.append(", sort=").append(sort);
        sb.append(", type=").append(type);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}