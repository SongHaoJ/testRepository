package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbSellshopdescr implements Serializable {
    private BigDecimal sequenceid;

    private String sellsku;

    private String shopuserid;

    private BigDecimal sellshopdescrid;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getSellsku() {
        return sellsku;
    }

    public void setSellsku(String sellsku) {
        this.sellsku = sellsku == null ? null : sellsku.trim();
    }

    public String getShopuserid() {
        return shopuserid;
    }

    public void setShopuserid(String shopuserid) {
        this.shopuserid = shopuserid == null ? null : shopuserid.trim();
    }

    public BigDecimal getSellshopdescrid() {
        return sellshopdescrid;
    }

    public void setSellshopdescrid(BigDecimal sellshopdescrid) {
        this.sellshopdescrid = sellshopdescrid;
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
        DbSellshopdescr other = (DbSellshopdescr) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSellsku() == null ? other.getSellsku() == null : this.getSellsku().equals(other.getSellsku()))
            && (this.getShopuserid() == null ? other.getShopuserid() == null : this.getShopuserid().equals(other.getShopuserid()))
            && (this.getSellshopdescrid() == null ? other.getSellshopdescrid() == null : this.getSellshopdescrid().equals(other.getSellshopdescrid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSellsku() == null) ? 0 : getSellsku().hashCode());
        result = prime * result + ((getShopuserid() == null) ? 0 : getShopuserid().hashCode());
        result = prime * result + ((getSellshopdescrid() == null) ? 0 : getSellshopdescrid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", sellsku=").append(sellsku);
        sb.append(", shopuserid=").append(shopuserid);
        sb.append(", sellshopdescrid=").append(sellshopdescrid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}