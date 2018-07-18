package com.bean.model;

import java.io.Serializable;

public class DbFbaproduct implements Serializable {
    private String sellersku;

    private String asin;

    private String fnsku;

    private Long totalsupplyquantity;

    private Long instocksupplyquantity;

    private String condition;

    private String immediately;

    private String productid;

    private String fbaskutitle;

    private String productname;

    private String storageid;

    private String storage;

    private String locationid;

    private String location;

    private String shopid;

    private String shopname;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String reserve6;

    private static final long serialVersionUID = 1L;

    public String getSellersku() {
        return sellersku;
    }

    public void setSellersku(String sellersku) {
        this.sellersku = sellersku == null ? null : sellersku.trim();
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin == null ? null : asin.trim();
    }

    public String getFnsku() {
        return fnsku;
    }

    public void setFnsku(String fnsku) {
        this.fnsku = fnsku == null ? null : fnsku.trim();
    }

    public Long getTotalsupplyquantity() {
        return totalsupplyquantity;
    }

    public void setTotalsupplyquantity(Long totalsupplyquantity) {
        this.totalsupplyquantity = totalsupplyquantity;
    }

    public Long getInstocksupplyquantity() {
        return instocksupplyquantity;
    }

    public void setInstocksupplyquantity(Long instocksupplyquantity) {
        this.instocksupplyquantity = instocksupplyquantity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public String getImmediately() {
        return immediately;
    }

    public void setImmediately(String immediately) {
        this.immediately = immediately == null ? null : immediately.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getFbaskutitle() {
        return fbaskutitle;
    }

    public void setFbaskutitle(String fbaskutitle) {
        this.fbaskutitle = fbaskutitle == null ? null : fbaskutitle.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
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

    public String getReserve6() {
        return reserve6;
    }

    public void setReserve6(String reserve6) {
        this.reserve6 = reserve6 == null ? null : reserve6.trim();
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
        DbFbaproduct other = (DbFbaproduct) that;
        return (this.getSellersku() == null ? other.getSellersku() == null : this.getSellersku().equals(other.getSellersku()))
            && (this.getAsin() == null ? other.getAsin() == null : this.getAsin().equals(other.getAsin()))
            && (this.getFnsku() == null ? other.getFnsku() == null : this.getFnsku().equals(other.getFnsku()))
            && (this.getTotalsupplyquantity() == null ? other.getTotalsupplyquantity() == null : this.getTotalsupplyquantity().equals(other.getTotalsupplyquantity()))
            && (this.getInstocksupplyquantity() == null ? other.getInstocksupplyquantity() == null : this.getInstocksupplyquantity().equals(other.getInstocksupplyquantity()))
            && (this.getCondition() == null ? other.getCondition() == null : this.getCondition().equals(other.getCondition()))
            && (this.getImmediately() == null ? other.getImmediately() == null : this.getImmediately().equals(other.getImmediately()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getFbaskutitle() == null ? other.getFbaskutitle() == null : this.getFbaskutitle().equals(other.getFbaskutitle()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSellersku() == null) ? 0 : getSellersku().hashCode());
        result = prime * result + ((getAsin() == null) ? 0 : getAsin().hashCode());
        result = prime * result + ((getFnsku() == null) ? 0 : getFnsku().hashCode());
        result = prime * result + ((getTotalsupplyquantity() == null) ? 0 : getTotalsupplyquantity().hashCode());
        result = prime * result + ((getInstocksupplyquantity() == null) ? 0 : getInstocksupplyquantity().hashCode());
        result = prime * result + ((getCondition() == null) ? 0 : getCondition().hashCode());
        result = prime * result + ((getImmediately() == null) ? 0 : getImmediately().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getFbaskutitle() == null) ? 0 : getFbaskutitle().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sellersku=").append(sellersku);
        sb.append(", asin=").append(asin);
        sb.append(", fnsku=").append(fnsku);
        sb.append(", totalsupplyquantity=").append(totalsupplyquantity);
        sb.append(", instocksupplyquantity=").append(instocksupplyquantity);
        sb.append(", condition=").append(condition);
        sb.append(", immediately=").append(immediately);
        sb.append(", productid=").append(productid);
        sb.append(", fbaskutitle=").append(fbaskutitle);
        sb.append(", productname=").append(productname);
        sb.append(", storageid=").append(storageid);
        sb.append(", storage=").append(storage);
        sb.append(", locationid=").append(locationid);
        sb.append(", location=").append(location);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}