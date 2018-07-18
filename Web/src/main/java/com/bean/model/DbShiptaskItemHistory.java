package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbShiptaskItemHistory implements Serializable {
    private Long id;

    private Long taskid;

    private String groupid;

    private String storageid;

    private String storagename;

    private String locationid;

    private String locationname;

    private String basket;

    private String resolvebasket;

    private String shipbaskethead;

    private String orderid;

    private String itemid;

    private String productid;

    private Long ordernum;

    private Long detailnum;

    private Long pickednum;

    private Long resolvenum;

    private Short type;

    private Short flag;

    private String content;

    private Date ordertime;

    private String pickoper;

    private Date picktime;

    private String createoper;

    private Date createtime;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename == null ? null : storagename.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Long getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Long ordernum) {
        this.ordernum = ordernum;
    }

    public Long getDetailnum() {
        return detailnum;
    }

    public void setDetailnum(Long detailnum) {
        this.detailnum = detailnum;
    }

    public Long getPickednum() {
        return pickednum;
    }

    public void setPickednum(Long pickednum) {
        this.pickednum = pickednum;
    }

    public Long getResolvenum() {
        return resolvenum;
    }

    public void setResolvenum(Long resolvenum) {
        this.resolvenum = resolvenum;
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

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        DbShiptaskItemHistory other = (DbShiptaskItemHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocationname() == null ? other.getLocationname() == null : this.getLocationname().equals(other.getLocationname()))
            && (this.getBasket() == null ? other.getBasket() == null : this.getBasket().equals(other.getBasket()))
            && (this.getResolvebasket() == null ? other.getResolvebasket() == null : this.getResolvebasket().equals(other.getResolvebasket()))
            && (this.getShipbaskethead() == null ? other.getShipbaskethead() == null : this.getShipbaskethead().equals(other.getShipbaskethead()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getDetailnum() == null ? other.getDetailnum() == null : this.getDetailnum().equals(other.getDetailnum()))
            && (this.getPickednum() == null ? other.getPickednum() == null : this.getPickednum().equals(other.getPickednum()))
            && (this.getResolvenum() == null ? other.getResolvenum() == null : this.getResolvenum().equals(other.getResolvenum()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getPickoper() == null ? other.getPickoper() == null : this.getPickoper().equals(other.getPickoper()))
            && (this.getPicktime() == null ? other.getPicktime() == null : this.getPicktime().equals(other.getPicktime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocationname() == null) ? 0 : getLocationname().hashCode());
        result = prime * result + ((getBasket() == null) ? 0 : getBasket().hashCode());
        result = prime * result + ((getResolvebasket() == null) ? 0 : getResolvebasket().hashCode());
        result = prime * result + ((getShipbaskethead() == null) ? 0 : getShipbaskethead().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getDetailnum() == null) ? 0 : getDetailnum().hashCode());
        result = prime * result + ((getPickednum() == null) ? 0 : getPickednum().hashCode());
        result = prime * result + ((getResolvenum() == null) ? 0 : getResolvenum().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getPickoper() == null) ? 0 : getPickoper().hashCode());
        result = prime * result + ((getPicktime() == null) ? 0 : getPicktime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskid=").append(taskid);
        sb.append(", groupid=").append(groupid);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", locationid=").append(locationid);
        sb.append(", locationname=").append(locationname);
        sb.append(", basket=").append(basket);
        sb.append(", resolvebasket=").append(resolvebasket);
        sb.append(", shipbaskethead=").append(shipbaskethead);
        sb.append(", orderid=").append(orderid);
        sb.append(", itemid=").append(itemid);
        sb.append(", productid=").append(productid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", detailnum=").append(detailnum);
        sb.append(", pickednum=").append(pickednum);
        sb.append(", resolvenum=").append(resolvenum);
        sb.append(", type=").append(type);
        sb.append(", flag=").append(flag);
        sb.append(", content=").append(content);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", pickoper=").append(pickoper);
        sb.append(", picktime=").append(picktime);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}