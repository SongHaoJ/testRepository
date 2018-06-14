package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShoppingitemlist implements Serializable {
    private String id;

    private BigDecimal hitcount1;

    private String pricetype;

    private BigDecimal hitcount56;

    private BigDecimal hitcount14;

    private BigDecimal quantitysold56;

    private BigDecimal runtime;

    private BigDecimal hitcount7;

    private BigDecimal price;

    private BigDecimal quantitysold14;

    private BigDecimal quantitysold3;

    private BigDecimal hitcount3;

    private BigDecimal quantitysold28;

    private Date updatetime;

    private BigDecimal hitcount28;

    private BigDecimal hitcount21;

    private BigDecimal hitcounttotal;

    private BigDecimal quantitysold1;

    private BigDecimal quantitysold21;

    private BigDecimal itemid;

    private BigDecimal quantitysold7;

    private BigDecimal quantitysoldtotal;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getHitcount1() {
        return hitcount1;
    }

    public void setHitcount1(BigDecimal hitcount1) {
        this.hitcount1 = hitcount1;
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype == null ? null : pricetype.trim();
    }

    public BigDecimal getHitcount56() {
        return hitcount56;
    }

    public void setHitcount56(BigDecimal hitcount56) {
        this.hitcount56 = hitcount56;
    }

    public BigDecimal getHitcount14() {
        return hitcount14;
    }

    public void setHitcount14(BigDecimal hitcount14) {
        this.hitcount14 = hitcount14;
    }

    public BigDecimal getQuantitysold56() {
        return quantitysold56;
    }

    public void setQuantitysold56(BigDecimal quantitysold56) {
        this.quantitysold56 = quantitysold56;
    }

    public BigDecimal getRuntime() {
        return runtime;
    }

    public void setRuntime(BigDecimal runtime) {
        this.runtime = runtime;
    }

    public BigDecimal getHitcount7() {
        return hitcount7;
    }

    public void setHitcount7(BigDecimal hitcount7) {
        this.hitcount7 = hitcount7;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantitysold14() {
        return quantitysold14;
    }

    public void setQuantitysold14(BigDecimal quantitysold14) {
        this.quantitysold14 = quantitysold14;
    }

    public BigDecimal getQuantitysold3() {
        return quantitysold3;
    }

    public void setQuantitysold3(BigDecimal quantitysold3) {
        this.quantitysold3 = quantitysold3;
    }

    public BigDecimal getHitcount3() {
        return hitcount3;
    }

    public void setHitcount3(BigDecimal hitcount3) {
        this.hitcount3 = hitcount3;
    }

    public BigDecimal getQuantitysold28() {
        return quantitysold28;
    }

    public void setQuantitysold28(BigDecimal quantitysold28) {
        this.quantitysold28 = quantitysold28;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getHitcount28() {
        return hitcount28;
    }

    public void setHitcount28(BigDecimal hitcount28) {
        this.hitcount28 = hitcount28;
    }

    public BigDecimal getHitcount21() {
        return hitcount21;
    }

    public void setHitcount21(BigDecimal hitcount21) {
        this.hitcount21 = hitcount21;
    }

    public BigDecimal getHitcounttotal() {
        return hitcounttotal;
    }

    public void setHitcounttotal(BigDecimal hitcounttotal) {
        this.hitcounttotal = hitcounttotal;
    }

    public BigDecimal getQuantitysold1() {
        return quantitysold1;
    }

    public void setQuantitysold1(BigDecimal quantitysold1) {
        this.quantitysold1 = quantitysold1;
    }

    public BigDecimal getQuantitysold21() {
        return quantitysold21;
    }

    public void setQuantitysold21(BigDecimal quantitysold21) {
        this.quantitysold21 = quantitysold21;
    }

    public BigDecimal getItemid() {
        return itemid;
    }

    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    public BigDecimal getQuantitysold7() {
        return quantitysold7;
    }

    public void setQuantitysold7(BigDecimal quantitysold7) {
        this.quantitysold7 = quantitysold7;
    }

    public BigDecimal getQuantitysoldtotal() {
        return quantitysoldtotal;
    }

    public void setQuantitysoldtotal(BigDecimal quantitysoldtotal) {
        this.quantitysoldtotal = quantitysoldtotal;
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
        DbShoppingitemlist other = (DbShoppingitemlist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHitcount1() == null ? other.getHitcount1() == null : this.getHitcount1().equals(other.getHitcount1()))
            && (this.getPricetype() == null ? other.getPricetype() == null : this.getPricetype().equals(other.getPricetype()))
            && (this.getHitcount56() == null ? other.getHitcount56() == null : this.getHitcount56().equals(other.getHitcount56()))
            && (this.getHitcount14() == null ? other.getHitcount14() == null : this.getHitcount14().equals(other.getHitcount14()))
            && (this.getQuantitysold56() == null ? other.getQuantitysold56() == null : this.getQuantitysold56().equals(other.getQuantitysold56()))
            && (this.getRuntime() == null ? other.getRuntime() == null : this.getRuntime().equals(other.getRuntime()))
            && (this.getHitcount7() == null ? other.getHitcount7() == null : this.getHitcount7().equals(other.getHitcount7()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getQuantitysold14() == null ? other.getQuantitysold14() == null : this.getQuantitysold14().equals(other.getQuantitysold14()))
            && (this.getQuantitysold3() == null ? other.getQuantitysold3() == null : this.getQuantitysold3().equals(other.getQuantitysold3()))
            && (this.getHitcount3() == null ? other.getHitcount3() == null : this.getHitcount3().equals(other.getHitcount3()))
            && (this.getQuantitysold28() == null ? other.getQuantitysold28() == null : this.getQuantitysold28().equals(other.getQuantitysold28()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getHitcount28() == null ? other.getHitcount28() == null : this.getHitcount28().equals(other.getHitcount28()))
            && (this.getHitcount21() == null ? other.getHitcount21() == null : this.getHitcount21().equals(other.getHitcount21()))
            && (this.getHitcounttotal() == null ? other.getHitcounttotal() == null : this.getHitcounttotal().equals(other.getHitcounttotal()))
            && (this.getQuantitysold1() == null ? other.getQuantitysold1() == null : this.getQuantitysold1().equals(other.getQuantitysold1()))
            && (this.getQuantitysold21() == null ? other.getQuantitysold21() == null : this.getQuantitysold21().equals(other.getQuantitysold21()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getQuantitysold7() == null ? other.getQuantitysold7() == null : this.getQuantitysold7().equals(other.getQuantitysold7()))
            && (this.getQuantitysoldtotal() == null ? other.getQuantitysoldtotal() == null : this.getQuantitysoldtotal().equals(other.getQuantitysoldtotal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHitcount1() == null) ? 0 : getHitcount1().hashCode());
        result = prime * result + ((getPricetype() == null) ? 0 : getPricetype().hashCode());
        result = prime * result + ((getHitcount56() == null) ? 0 : getHitcount56().hashCode());
        result = prime * result + ((getHitcount14() == null) ? 0 : getHitcount14().hashCode());
        result = prime * result + ((getQuantitysold56() == null) ? 0 : getQuantitysold56().hashCode());
        result = prime * result + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        result = prime * result + ((getHitcount7() == null) ? 0 : getHitcount7().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getQuantitysold14() == null) ? 0 : getQuantitysold14().hashCode());
        result = prime * result + ((getQuantitysold3() == null) ? 0 : getQuantitysold3().hashCode());
        result = prime * result + ((getHitcount3() == null) ? 0 : getHitcount3().hashCode());
        result = prime * result + ((getQuantitysold28() == null) ? 0 : getQuantitysold28().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getHitcount28() == null) ? 0 : getHitcount28().hashCode());
        result = prime * result + ((getHitcount21() == null) ? 0 : getHitcount21().hashCode());
        result = prime * result + ((getHitcounttotal() == null) ? 0 : getHitcounttotal().hashCode());
        result = prime * result + ((getQuantitysold1() == null) ? 0 : getQuantitysold1().hashCode());
        result = prime * result + ((getQuantitysold21() == null) ? 0 : getQuantitysold21().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getQuantitysold7() == null) ? 0 : getQuantitysold7().hashCode());
        result = prime * result + ((getQuantitysoldtotal() == null) ? 0 : getQuantitysoldtotal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hitcount1=").append(hitcount1);
        sb.append(", pricetype=").append(pricetype);
        sb.append(", hitcount56=").append(hitcount56);
        sb.append(", hitcount14=").append(hitcount14);
        sb.append(", quantitysold56=").append(quantitysold56);
        sb.append(", runtime=").append(runtime);
        sb.append(", hitcount7=").append(hitcount7);
        sb.append(", price=").append(price);
        sb.append(", quantitysold14=").append(quantitysold14);
        sb.append(", quantitysold3=").append(quantitysold3);
        sb.append(", hitcount3=").append(hitcount3);
        sb.append(", quantitysold28=").append(quantitysold28);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", hitcount28=").append(hitcount28);
        sb.append(", hitcount21=").append(hitcount21);
        sb.append(", hitcounttotal=").append(hitcounttotal);
        sb.append(", quantitysold1=").append(quantitysold1);
        sb.append(", quantitysold21=").append(quantitysold21);
        sb.append(", itemid=").append(itemid);
        sb.append(", quantitysold7=").append(quantitysold7);
        sb.append(", quantitysoldtotal=").append(quantitysoldtotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}