package com.bean.model;

import java.io.Serializable;

public class DbAlisupplier implements Serializable {
    private String userid;

    private String companyname;

    private String domaininplatforms;

    private String loginid;

    private String trade;

    private String goodsList;

    private String favorite;

    private String attention;

    private String supplyid;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getDomaininplatforms() {
        return domaininplatforms;
    }

    public void setDomaininplatforms(String domaininplatforms) {
        this.domaininplatforms = domaininplatforms == null ? null : domaininplatforms.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade == null ? null : trade.trim();
    }

    public String getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(String goodsList) {
        this.goodsList = goodsList == null ? null : goodsList.trim();
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite == null ? null : favorite.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(String supplyid) {
        this.supplyid = supplyid == null ? null : supplyid.trim();
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
        DbAlisupplier other = (DbAlisupplier) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getDomaininplatforms() == null ? other.getDomaininplatforms() == null : this.getDomaininplatforms().equals(other.getDomaininplatforms()))
            && (this.getLoginid() == null ? other.getLoginid() == null : this.getLoginid().equals(other.getLoginid()))
            && (this.getTrade() == null ? other.getTrade() == null : this.getTrade().equals(other.getTrade()))
            && (this.getGoodsList() == null ? other.getGoodsList() == null : this.getGoodsList().equals(other.getGoodsList()))
            && (this.getFavorite() == null ? other.getFavorite() == null : this.getFavorite().equals(other.getFavorite()))
            && (this.getAttention() == null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()))
            && (this.getSupplyid() == null ? other.getSupplyid() == null : this.getSupplyid().equals(other.getSupplyid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getDomaininplatforms() == null) ? 0 : getDomaininplatforms().hashCode());
        result = prime * result + ((getLoginid() == null) ? 0 : getLoginid().hashCode());
        result = prime * result + ((getTrade() == null) ? 0 : getTrade().hashCode());
        result = prime * result + ((getGoodsList() == null) ? 0 : getGoodsList().hashCode());
        result = prime * result + ((getFavorite() == null) ? 0 : getFavorite().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        result = prime * result + ((getSupplyid() == null) ? 0 : getSupplyid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", companyname=").append(companyname);
        sb.append(", domaininplatforms=").append(domaininplatforms);
        sb.append(", loginid=").append(loginid);
        sb.append(", trade=").append(trade);
        sb.append(", goodsList=").append(goodsList);
        sb.append(", favorite=").append(favorite);
        sb.append(", attention=").append(attention);
        sb.append(", supplyid=").append(supplyid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}