package com.bean.model;

import java.io.Serializable;

public class DbTaskbasket implements Serializable {
    private String basket;

    private String shipoper;

    private String storageid;

    private String resolveoper;

    private Short type;

    private Short flag;

    private Long timel;

    private static final long serialVersionUID = 1L;

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket == null ? null : basket.trim();
    }

    public String getShipoper() {
        return shipoper;
    }

    public void setShipoper(String shipoper) {
        this.shipoper = shipoper == null ? null : shipoper.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getResolveoper() {
        return resolveoper;
    }

    public void setResolveoper(String resolveoper) {
        this.resolveoper = resolveoper == null ? null : resolveoper.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Long getTimel() {
        return timel;
    }

    public void setTimel(Long timel) {
        this.timel = timel;
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
        DbTaskbasket other = (DbTaskbasket) that;
        return (this.getBasket() == null ? other.getBasket() == null : this.getBasket().equals(other.getBasket()))
            && (this.getShipoper() == null ? other.getShipoper() == null : this.getShipoper().equals(other.getShipoper()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getResolveoper() == null ? other.getResolveoper() == null : this.getResolveoper().equals(other.getResolveoper()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getTimel() == null ? other.getTimel() == null : this.getTimel().equals(other.getTimel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBasket() == null) ? 0 : getBasket().hashCode());
        result = prime * result + ((getShipoper() == null) ? 0 : getShipoper().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getResolveoper() == null) ? 0 : getResolveoper().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getTimel() == null) ? 0 : getTimel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", basket=").append(basket);
        sb.append(", shipoper=").append(shipoper);
        sb.append(", storageid=").append(storageid);
        sb.append(", resolveoper=").append(resolveoper);
        sb.append(", type=").append(type);
        sb.append(", flag=").append(flag);
        sb.append(", timel=").append(timel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}