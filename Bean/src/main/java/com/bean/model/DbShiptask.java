package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbShiptask implements Serializable {
    private Long id;

    private String orderid;

    private String storageid;

    private String basket;

    private String resolvebasket;

    private String shipbaskethead;

    private Short type;

    private Short flag;

    private String content;

    private Date ordertime;

    private String groupid;

    private String pickoper;

    private Date picktime;

    private String resolveoper;

    private Date resolvetime;

    private String shipoper;

    private Date shiptime;

    private String createoper;

    private Date creattime;

    private String oper;

    private Date opertime;

    private String productid;

    private String pickednum;

    private Short printnum;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket == null ? null : basket.trim();
    }

    public String getResolvebasket() {
        return resolvebasket;
    }

    public void setResolvebasket(String resolvebasket) {
        this.resolvebasket = resolvebasket == null ? null : resolvebasket.trim();
    }

    public String getShipbaskethead() {
        return shipbaskethead;
    }

    public void setShipbaskethead(String shipbaskethead) {
        this.shipbaskethead = shipbaskethead == null ? null : shipbaskethead.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getPickoper() {
        return pickoper;
    }

    public void setPickoper(String pickoper) {
        this.pickoper = pickoper == null ? null : pickoper.trim();
    }

    public Date getPicktime() {
        return picktime;
    }

    public void setPicktime(Date picktime) {
        this.picktime = picktime;
    }

    public String getResolveoper() {
        return resolveoper;
    }

    public void setResolveoper(String resolveoper) {
        this.resolveoper = resolveoper == null ? null : resolveoper.trim();
    }

    public Date getResolvetime() {
        return resolvetime;
    }

    public void setResolvetime(Date resolvetime) {
        this.resolvetime = resolvetime;
    }

    public String getShipoper() {
        return shipoper;
    }

    public void setShipoper(String shipoper) {
        this.shipoper = shipoper == null ? null : shipoper.trim();
    }

    public Date getShiptime() {
        return shiptime;
    }

    public void setShiptime(Date shiptime) {
        this.shiptime = shiptime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getPickednum() {
        return pickednum;
    }

    public void setPickednum(String pickednum) {
        this.pickednum = pickednum == null ? null : pickednum.trim();
    }

    public Short getPrintnum() {
        return printnum;
    }

    public void setPrintnum(Short printnum) {
        this.printnum = printnum;
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
        DbShiptask other = (DbShiptask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getBasket() == null ? other.getBasket() == null : this.getBasket().equals(other.getBasket()))
            && (this.getResolvebasket() == null ? other.getResolvebasket() == null : this.getResolvebasket().equals(other.getResolvebasket()))
            && (this.getShipbaskethead() == null ? other.getShipbaskethead() == null : this.getShipbaskethead().equals(other.getShipbaskethead()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getPickoper() == null ? other.getPickoper() == null : this.getPickoper().equals(other.getPickoper()))
            && (this.getPicktime() == null ? other.getPicktime() == null : this.getPicktime().equals(other.getPicktime()))
            && (this.getResolveoper() == null ? other.getResolveoper() == null : this.getResolveoper().equals(other.getResolveoper()))
            && (this.getResolvetime() == null ? other.getResolvetime() == null : this.getResolvetime().equals(other.getResolvetime()))
            && (this.getShipoper() == null ? other.getShipoper() == null : this.getShipoper().equals(other.getShipoper()))
            && (this.getShiptime() == null ? other.getShiptime() == null : this.getShiptime().equals(other.getShiptime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getPickednum() == null ? other.getPickednum() == null : this.getPickednum().equals(other.getPickednum()))
            && (this.getPrintnum() == null ? other.getPrintnum() == null : this.getPrintnum().equals(other.getPrintnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getBasket() == null) ? 0 : getBasket().hashCode());
        result = prime * result + ((getResolvebasket() == null) ? 0 : getResolvebasket().hashCode());
        result = prime * result + ((getShipbaskethead() == null) ? 0 : getShipbaskethead().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getPickoper() == null) ? 0 : getPickoper().hashCode());
        result = prime * result + ((getPicktime() == null) ? 0 : getPicktime().hashCode());
        result = prime * result + ((getResolveoper() == null) ? 0 : getResolveoper().hashCode());
        result = prime * result + ((getResolvetime() == null) ? 0 : getResolvetime().hashCode());
        result = prime * result + ((getShipoper() == null) ? 0 : getShipoper().hashCode());
        result = prime * result + ((getShiptime() == null) ? 0 : getShiptime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getPickednum() == null) ? 0 : getPickednum().hashCode());
        result = prime * result + ((getPrintnum() == null) ? 0 : getPrintnum().hashCode());
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
        sb.append(", storageid=").append(storageid);
        sb.append(", basket=").append(basket);
        sb.append(", resolvebasket=").append(resolvebasket);
        sb.append(", shipbaskethead=").append(shipbaskethead);
        sb.append(", type=").append(type);
        sb.append(", flag=").append(flag);
        sb.append(", content=").append(content);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", groupid=").append(groupid);
        sb.append(", pickoper=").append(pickoper);
        sb.append(", picktime=").append(picktime);
        sb.append(", resolveoper=").append(resolveoper);
        sb.append(", resolvetime=").append(resolvetime);
        sb.append(", shipoper=").append(shipoper);
        sb.append(", shiptime=").append(shiptime);
        sb.append(", createoper=").append(createoper);
        sb.append(", creattime=").append(creattime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", productid=").append(productid);
        sb.append(", pickednum=").append(pickednum);
        sb.append(", printnum=").append(printnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}