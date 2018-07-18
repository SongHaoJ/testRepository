package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbPurchaseStock implements Serializable {
    private Long id;

    private Long orderid;

    private String groupid;

    private Long itemid;

    private String productid;

    private Integer arrivenum;

    private Integer stocknum;

    private Integer damagenum;

    private Integer savenumbefore;

    private Integer savenumafter;

    private String stockoper;

    private Date stocktime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getArrivenum() {
        return arrivenum;
    }

    public void setArrivenum(Integer arrivenum) {
        this.arrivenum = arrivenum;
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public Integer getDamagenum() {
        return damagenum;
    }

    public void setDamagenum(Integer damagenum) {
        this.damagenum = damagenum;
    }

    public Integer getSavenumbefore() {
        return savenumbefore;
    }

    public void setSavenumbefore(Integer savenumbefore) {
        this.savenumbefore = savenumbefore;
    }

    public Integer getSavenumafter() {
        return savenumafter;
    }

    public void setSavenumafter(Integer savenumafter) {
        this.savenumafter = savenumafter;
    }

    public String getStockoper() {
        return stockoper;
    }

    public void setStockoper(String stockoper) {
        this.stockoper = stockoper == null ? null : stockoper.trim();
    }

    public Date getStocktime() {
        return stocktime;
    }

    public void setStocktime(Date stocktime) {
        this.stocktime = stocktime;
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
        DbPurchaseStock other = (DbPurchaseStock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getArrivenum() == null ? other.getArrivenum() == null : this.getArrivenum().equals(other.getArrivenum()))
            && (this.getStocknum() == null ? other.getStocknum() == null : this.getStocknum().equals(other.getStocknum()))
            && (this.getDamagenum() == null ? other.getDamagenum() == null : this.getDamagenum().equals(other.getDamagenum()))
            && (this.getSavenumbefore() == null ? other.getSavenumbefore() == null : this.getSavenumbefore().equals(other.getSavenumbefore()))
            && (this.getSavenumafter() == null ? other.getSavenumafter() == null : this.getSavenumafter().equals(other.getSavenumafter()))
            && (this.getStockoper() == null ? other.getStockoper() == null : this.getStockoper().equals(other.getStockoper()))
            && (this.getStocktime() == null ? other.getStocktime() == null : this.getStocktime().equals(other.getStocktime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getArrivenum() == null) ? 0 : getArrivenum().hashCode());
        result = prime * result + ((getStocknum() == null) ? 0 : getStocknum().hashCode());
        result = prime * result + ((getDamagenum() == null) ? 0 : getDamagenum().hashCode());
        result = prime * result + ((getSavenumbefore() == null) ? 0 : getSavenumbefore().hashCode());
        result = prime * result + ((getSavenumafter() == null) ? 0 : getSavenumafter().hashCode());
        result = prime * result + ((getStockoper() == null) ? 0 : getStockoper().hashCode());
        result = prime * result + ((getStocktime() == null) ? 0 : getStocktime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", groupid=").append(groupid);
        sb.append(", itemid=").append(itemid);
        sb.append(", productid=").append(productid);
        sb.append(", arrivenum=").append(arrivenum);
        sb.append(", stocknum=").append(stocknum);
        sb.append(", damagenum=").append(damagenum);
        sb.append(", savenumbefore=").append(savenumbefore);
        sb.append(", savenumafter=").append(savenumafter);
        sb.append(", stockoper=").append(stockoper);
        sb.append(", stocktime=").append(stocktime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}