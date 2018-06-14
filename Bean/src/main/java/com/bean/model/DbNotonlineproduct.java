package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbNotonlineproduct implements Serializable {
    private String itemid;

    private Date updatetime;

    private String ebaysku;

    private String shop;

    private String shopflag;

    private static final long serialVersionUID = 1L;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getEbaysku() {
        return ebaysku;
    }

    public void setEbaysku(String ebaysku) {
        this.ebaysku = ebaysku == null ? null : ebaysku.trim();
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getShopflag() {
        return shopflag;
    }

    public void setShopflag(String shopflag) {
        this.shopflag = shopflag == null ? null : shopflag.trim();
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
        DbNotonlineproduct other = (DbNotonlineproduct) that;
        return (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getEbaysku() == null ? other.getEbaysku() == null : this.getEbaysku().equals(other.getEbaysku()))
            && (this.getShop() == null ? other.getShop() == null : this.getShop().equals(other.getShop()))
            && (this.getShopflag() == null ? other.getShopflag() == null : this.getShopflag().equals(other.getShopflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getEbaysku() == null) ? 0 : getEbaysku().hashCode());
        result = prime * result + ((getShop() == null) ? 0 : getShop().hashCode());
        result = prime * result + ((getShopflag() == null) ? 0 : getShopflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemid=").append(itemid);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", ebaysku=").append(ebaysku);
        sb.append(", shop=").append(shop);
        sb.append(", shopflag=").append(shopflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}