package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbStoragetask implements Serializable {
    private BigDecimal id;

    private String stocksku;

    private String namecn;

    private String storageid;

    private String storagename;

    private String locationid;

    private String locationname;

    private String car;

    private String carlocation;

    private String area;

    private String image;

    private Short storagetype;

    private Short status;

    private BigDecimal arrivenum;

    private BigDecimal storagenum;

    private BigDecimal destroynum;

    private BigDecimal purchasenum;

    private BigDecimal printnum;

    private String groupid;

    private String itemid;

    private String signedoper;

    private Date signedtime;

    private String labelingoper;

    private Date labelingstarttime;

    private Date labelingendtime;

    private String checkoper;

    private Date checkstarttime;

    private Date checkendtime;

    private String splitoper;

    private Date splittime;

    private String storageoper;

    private Date storagestarttime;

    private Date storageendtime;

    private String basketid;

    private Short callflag;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getStocksku() {
        return stocksku;
    }

    public void setStocksku(String stocksku) {
        this.stocksku = stocksku == null ? null : stocksku.trim();
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
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

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car == null ? null : car.trim();
    }

    public String getCarlocation() {
        return carlocation;
    }

    public void setCarlocation(String carlocation) {
        this.carlocation = carlocation == null ? null : carlocation.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Short getStoragetype() {
        return storagetype;
    }

    public void setStoragetype(Short storagetype) {
        this.storagetype = storagetype;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public BigDecimal getArrivenum() {
        return arrivenum;
    }

    public void setArrivenum(BigDecimal arrivenum) {
        this.arrivenum = arrivenum;
    }

    public BigDecimal getStoragenum() {
        return storagenum;
    }

    public void setStoragenum(BigDecimal storagenum) {
        this.storagenum = storagenum;
    }

    public BigDecimal getDestroynum() {
        return destroynum;
    }

    public void setDestroynum(BigDecimal destroynum) {
        this.destroynum = destroynum;
    }

    public BigDecimal getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(BigDecimal purchasenum) {
        this.purchasenum = purchasenum;
    }

    public BigDecimal getPrintnum() {
        return printnum;
    }

    public void setPrintnum(BigDecimal printnum) {
        this.printnum = printnum;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getSignedoper() {
        return signedoper;
    }

    public void setSignedoper(String signedoper) {
        this.signedoper = signedoper == null ? null : signedoper.trim();
    }

    public Date getSignedtime() {
        return signedtime;
    }

    public void setSignedtime(Date signedtime) {
        this.signedtime = signedtime;
    }

    public String getLabelingoper() {
        return labelingoper;
    }

    public void setLabelingoper(String labelingoper) {
        this.labelingoper = labelingoper == null ? null : labelingoper.trim();
    }

    public Date getLabelingstarttime() {
        return labelingstarttime;
    }

    public void setLabelingstarttime(Date labelingstarttime) {
        this.labelingstarttime = labelingstarttime;
    }

    public Date getLabelingendtime() {
        return labelingendtime;
    }

    public void setLabelingendtime(Date labelingendtime) {
        this.labelingendtime = labelingendtime;
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public Date getCheckstarttime() {
        return checkstarttime;
    }

    public void setCheckstarttime(Date checkstarttime) {
        this.checkstarttime = checkstarttime;
    }

    public Date getCheckendtime() {
        return checkendtime;
    }

    public void setCheckendtime(Date checkendtime) {
        this.checkendtime = checkendtime;
    }

    public String getSplitoper() {
        return splitoper;
    }

    public void setSplitoper(String splitoper) {
        this.splitoper = splitoper == null ? null : splitoper.trim();
    }

    public Date getSplittime() {
        return splittime;
    }

    public void setSplittime(Date splittime) {
        this.splittime = splittime;
    }

    public String getStorageoper() {
        return storageoper;
    }

    public void setStorageoper(String storageoper) {
        this.storageoper = storageoper == null ? null : storageoper.trim();
    }

    public Date getStoragestarttime() {
        return storagestarttime;
    }

    public void setStoragestarttime(Date storagestarttime) {
        this.storagestarttime = storagestarttime;
    }

    public Date getStorageendtime() {
        return storageendtime;
    }

    public void setStorageendtime(Date storageendtime) {
        this.storageendtime = storageendtime;
    }

    public String getBasketid() {
        return basketid;
    }

    public void setBasketid(String basketid) {
        this.basketid = basketid == null ? null : basketid.trim();
    }

    public Short getCallflag() {
        return callflag;
    }

    public void setCallflag(Short callflag) {
        this.callflag = callflag;
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
        DbStoragetask other = (DbStoragetask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStocksku() == null ? other.getStocksku() == null : this.getStocksku().equals(other.getStocksku()))
            && (this.getNamecn() == null ? other.getNamecn() == null : this.getNamecn().equals(other.getNamecn()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocationname() == null ? other.getLocationname() == null : this.getLocationname().equals(other.getLocationname()))
            && (this.getCar() == null ? other.getCar() == null : this.getCar().equals(other.getCar()))
            && (this.getCarlocation() == null ? other.getCarlocation() == null : this.getCarlocation().equals(other.getCarlocation()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getStoragetype() == null ? other.getStoragetype() == null : this.getStoragetype().equals(other.getStoragetype()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getArrivenum() == null ? other.getArrivenum() == null : this.getArrivenum().equals(other.getArrivenum()))
            && (this.getStoragenum() == null ? other.getStoragenum() == null : this.getStoragenum().equals(other.getStoragenum()))
            && (this.getDestroynum() == null ? other.getDestroynum() == null : this.getDestroynum().equals(other.getDestroynum()))
            && (this.getPurchasenum() == null ? other.getPurchasenum() == null : this.getPurchasenum().equals(other.getPurchasenum()))
            && (this.getPrintnum() == null ? other.getPrintnum() == null : this.getPrintnum().equals(other.getPrintnum()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getSignedoper() == null ? other.getSignedoper() == null : this.getSignedoper().equals(other.getSignedoper()))
            && (this.getSignedtime() == null ? other.getSignedtime() == null : this.getSignedtime().equals(other.getSignedtime()))
            && (this.getLabelingoper() == null ? other.getLabelingoper() == null : this.getLabelingoper().equals(other.getLabelingoper()))
            && (this.getLabelingstarttime() == null ? other.getLabelingstarttime() == null : this.getLabelingstarttime().equals(other.getLabelingstarttime()))
            && (this.getLabelingendtime() == null ? other.getLabelingendtime() == null : this.getLabelingendtime().equals(other.getLabelingendtime()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getCheckstarttime() == null ? other.getCheckstarttime() == null : this.getCheckstarttime().equals(other.getCheckstarttime()))
            && (this.getCheckendtime() == null ? other.getCheckendtime() == null : this.getCheckendtime().equals(other.getCheckendtime()))
            && (this.getSplitoper() == null ? other.getSplitoper() == null : this.getSplitoper().equals(other.getSplitoper()))
            && (this.getSplittime() == null ? other.getSplittime() == null : this.getSplittime().equals(other.getSplittime()))
            && (this.getStorageoper() == null ? other.getStorageoper() == null : this.getStorageoper().equals(other.getStorageoper()))
            && (this.getStoragestarttime() == null ? other.getStoragestarttime() == null : this.getStoragestarttime().equals(other.getStoragestarttime()))
            && (this.getStorageendtime() == null ? other.getStorageendtime() == null : this.getStorageendtime().equals(other.getStorageendtime()))
            && (this.getBasketid() == null ? other.getBasketid() == null : this.getBasketid().equals(other.getBasketid()))
            && (this.getCallflag() == null ? other.getCallflag() == null : this.getCallflag().equals(other.getCallflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStocksku() == null) ? 0 : getStocksku().hashCode());
        result = prime * result + ((getNamecn() == null) ? 0 : getNamecn().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocationname() == null) ? 0 : getLocationname().hashCode());
        result = prime * result + ((getCar() == null) ? 0 : getCar().hashCode());
        result = prime * result + ((getCarlocation() == null) ? 0 : getCarlocation().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getStoragetype() == null) ? 0 : getStoragetype().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getArrivenum() == null) ? 0 : getArrivenum().hashCode());
        result = prime * result + ((getStoragenum() == null) ? 0 : getStoragenum().hashCode());
        result = prime * result + ((getDestroynum() == null) ? 0 : getDestroynum().hashCode());
        result = prime * result + ((getPurchasenum() == null) ? 0 : getPurchasenum().hashCode());
        result = prime * result + ((getPrintnum() == null) ? 0 : getPrintnum().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getSignedoper() == null) ? 0 : getSignedoper().hashCode());
        result = prime * result + ((getSignedtime() == null) ? 0 : getSignedtime().hashCode());
        result = prime * result + ((getLabelingoper() == null) ? 0 : getLabelingoper().hashCode());
        result = prime * result + ((getLabelingstarttime() == null) ? 0 : getLabelingstarttime().hashCode());
        result = prime * result + ((getLabelingendtime() == null) ? 0 : getLabelingendtime().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getCheckstarttime() == null) ? 0 : getCheckstarttime().hashCode());
        result = prime * result + ((getCheckendtime() == null) ? 0 : getCheckendtime().hashCode());
        result = prime * result + ((getSplitoper() == null) ? 0 : getSplitoper().hashCode());
        result = prime * result + ((getSplittime() == null) ? 0 : getSplittime().hashCode());
        result = prime * result + ((getStorageoper() == null) ? 0 : getStorageoper().hashCode());
        result = prime * result + ((getStoragestarttime() == null) ? 0 : getStoragestarttime().hashCode());
        result = prime * result + ((getStorageendtime() == null) ? 0 : getStorageendtime().hashCode());
        result = prime * result + ((getBasketid() == null) ? 0 : getBasketid().hashCode());
        result = prime * result + ((getCallflag() == null) ? 0 : getCallflag().hashCode());
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
        sb.append(", stocksku=").append(stocksku);
        sb.append(", namecn=").append(namecn);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", locationid=").append(locationid);
        sb.append(", locationname=").append(locationname);
        sb.append(", car=").append(car);
        sb.append(", carlocation=").append(carlocation);
        sb.append(", area=").append(area);
        sb.append(", image=").append(image);
        sb.append(", storagetype=").append(storagetype);
        sb.append(", status=").append(status);
        sb.append(", arrivenum=").append(arrivenum);
        sb.append(", storagenum=").append(storagenum);
        sb.append(", destroynum=").append(destroynum);
        sb.append(", purchasenum=").append(purchasenum);
        sb.append(", printnum=").append(printnum);
        sb.append(", groupid=").append(groupid);
        sb.append(", itemid=").append(itemid);
        sb.append(", signedoper=").append(signedoper);
        sb.append(", signedtime=").append(signedtime);
        sb.append(", labelingoper=").append(labelingoper);
        sb.append(", labelingstarttime=").append(labelingstarttime);
        sb.append(", labelingendtime=").append(labelingendtime);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checkstarttime=").append(checkstarttime);
        sb.append(", checkendtime=").append(checkendtime);
        sb.append(", splitoper=").append(splitoper);
        sb.append(", splittime=").append(splittime);
        sb.append(", storageoper=").append(storageoper);
        sb.append(", storagestarttime=").append(storagestarttime);
        sb.append(", storageendtime=").append(storageendtime);
        sb.append(", basketid=").append(basketid);
        sb.append(", callflag=").append(callflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}