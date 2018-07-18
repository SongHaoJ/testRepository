package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductdevelopnew implements Serializable {
    private String sku;

    private String oper;

    private String packagingname;

    private String picture3;

    private BigDecimal costprice;

    private BigDecimal volume;

    private String groupid;

    private String producttitle;

    private String iclass;

    private String stype;

    private String productname;

    private String descr;

    private BigDecimal alertnum;

    private BigDecimal savenum;

    private Date createtime;

    private Date opertime;

    private String categoryid;

    private String locationid;

    private String manufacture;

    private String status;

    private String storage;

    private String packageoper;

    private String location;

    private String picture4;

    private String openflag;

    private BigDecimal sellprice;

    private BigDecimal alertday;

    private String purchaseoper;

    private BigDecimal declaredvalue;

    private BigDecimal length;

    private String pickupoper;

    private BigDecimal high;

    private String packagingid;

    private BigDecimal savedate;

    private BigDecimal packagingweight;

    private String picture1;

    private String productnameen;

    private String content;

    private BigDecimal weight;

    private BigDecimal purchaseday;

    private BigDecimal linkitemid;

    private String applyoper;

    private String namechn;

    private String storageid;

    private String selloper;

    private String manufactureid;

    private BigDecimal width;

    private String picture2;

    private BigDecimal packagingfee;

    private static final long serialVersionUID = 1L;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getPackagingname() {
        return packagingname;
    }

    public void setPackagingname(String packagingname) {
        this.packagingname = packagingname == null ? null : packagingname.trim();
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3 == null ? null : picture3.trim();
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle == null ? null : producttitle.trim();
    }

    public String getIclass() {
        return iclass;
    }

    public void setIclass(String iclass) {
        this.iclass = iclass == null ? null : iclass.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public BigDecimal getAlertnum() {
        return alertnum;
    }

    public void setAlertnum(BigDecimal alertnum) {
        this.alertnum = alertnum;
    }

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getPackageoper() {
        return packageoper;
    }

    public void setPackageoper(String packageoper) {
        this.packageoper = packageoper == null ? null : packageoper.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4 == null ? null : picture4.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getAlertday() {
        return alertday;
    }

    public void setAlertday(BigDecimal alertday) {
        this.alertday = alertday;
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public BigDecimal getDeclaredvalue() {
        return declaredvalue;
    }

    public void setDeclaredvalue(BigDecimal declaredvalue) {
        this.declaredvalue = declaredvalue;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public String getPickupoper() {
        return pickupoper;
    }

    public void setPickupoper(String pickupoper) {
        this.pickupoper = pickupoper == null ? null : pickupoper.trim();
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public String getPackagingid() {
        return packagingid;
    }

    public void setPackagingid(String packagingid) {
        this.packagingid = packagingid == null ? null : packagingid.trim();
    }

    public BigDecimal getSavedate() {
        return savedate;
    }

    public void setSavedate(BigDecimal savedate) {
        this.savedate = savedate;
    }

    public BigDecimal getPackagingweight() {
        return packagingweight;
    }

    public void setPackagingweight(BigDecimal packagingweight) {
        this.packagingweight = packagingweight;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
    }

    public String getProductnameen() {
        return productnameen;
    }

    public void setProductnameen(String productnameen) {
        this.productnameen = productnameen == null ? null : productnameen.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPurchaseday() {
        return purchaseday;
    }

    public void setPurchaseday(BigDecimal purchaseday) {
        this.purchaseday = purchaseday;
    }

    public BigDecimal getLinkitemid() {
        return linkitemid;
    }

    public void setLinkitemid(BigDecimal linkitemid) {
        this.linkitemid = linkitemid;
    }

    public String getApplyoper() {
        return applyoper;
    }

    public void setApplyoper(String applyoper) {
        this.applyoper = applyoper == null ? null : applyoper.trim();
    }

    public String getNamechn() {
        return namechn;
    }

    public void setNamechn(String namechn) {
        this.namechn = namechn == null ? null : namechn.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2 == null ? null : picture2.trim();
    }

    public BigDecimal getPackagingfee() {
        return packagingfee;
    }

    public void setPackagingfee(BigDecimal packagingfee) {
        this.packagingfee = packagingfee;
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
        DbProductdevelopnew other = (DbProductdevelopnew) that;
        return (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getPackagingname() == null ? other.getPackagingname() == null : this.getPackagingname().equals(other.getPackagingname()))
            && (this.getPicture3() == null ? other.getPicture3() == null : this.getPicture3().equals(other.getPicture3()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getProducttitle() == null ? other.getProducttitle() == null : this.getProducttitle().equals(other.getProducttitle()))
            && (this.getIclass() == null ? other.getIclass() == null : this.getIclass().equals(other.getIclass()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getAlertnum() == null ? other.getAlertnum() == null : this.getAlertnum().equals(other.getAlertnum()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getPackageoper() == null ? other.getPackageoper() == null : this.getPackageoper().equals(other.getPackageoper()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getPicture4() == null ? other.getPicture4() == null : this.getPicture4().equals(other.getPicture4()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getAlertday() == null ? other.getAlertday() == null : this.getAlertday().equals(other.getAlertday()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getDeclaredvalue() == null ? other.getDeclaredvalue() == null : this.getDeclaredvalue().equals(other.getDeclaredvalue()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getPickupoper() == null ? other.getPickupoper() == null : this.getPickupoper().equals(other.getPickupoper()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getPackagingid() == null ? other.getPackagingid() == null : this.getPackagingid().equals(other.getPackagingid()))
            && (this.getSavedate() == null ? other.getSavedate() == null : this.getSavedate().equals(other.getSavedate()))
            && (this.getPackagingweight() == null ? other.getPackagingweight() == null : this.getPackagingweight().equals(other.getPackagingweight()))
            && (this.getPicture1() == null ? other.getPicture1() == null : this.getPicture1().equals(other.getPicture1()))
            && (this.getProductnameen() == null ? other.getProductnameen() == null : this.getProductnameen().equals(other.getProductnameen()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getPurchaseday() == null ? other.getPurchaseday() == null : this.getPurchaseday().equals(other.getPurchaseday()))
            && (this.getLinkitemid() == null ? other.getLinkitemid() == null : this.getLinkitemid().equals(other.getLinkitemid()))
            && (this.getApplyoper() == null ? other.getApplyoper() == null : this.getApplyoper().equals(other.getApplyoper()))
            && (this.getNamechn() == null ? other.getNamechn() == null : this.getNamechn().equals(other.getNamechn()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getPicture2() == null ? other.getPicture2() == null : this.getPicture2().equals(other.getPicture2()))
            && (this.getPackagingfee() == null ? other.getPackagingfee() == null : this.getPackagingfee().equals(other.getPackagingfee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getPackagingname() == null) ? 0 : getPackagingname().hashCode());
        result = prime * result + ((getPicture3() == null) ? 0 : getPicture3().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getProducttitle() == null) ? 0 : getProducttitle().hashCode());
        result = prime * result + ((getIclass() == null) ? 0 : getIclass().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getAlertnum() == null) ? 0 : getAlertnum().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getPackageoper() == null) ? 0 : getPackageoper().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getPicture4() == null) ? 0 : getPicture4().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getAlertday() == null) ? 0 : getAlertday().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getDeclaredvalue() == null) ? 0 : getDeclaredvalue().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getPickupoper() == null) ? 0 : getPickupoper().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getPackagingid() == null) ? 0 : getPackagingid().hashCode());
        result = prime * result + ((getSavedate() == null) ? 0 : getSavedate().hashCode());
        result = prime * result + ((getPackagingweight() == null) ? 0 : getPackagingweight().hashCode());
        result = prime * result + ((getPicture1() == null) ? 0 : getPicture1().hashCode());
        result = prime * result + ((getProductnameen() == null) ? 0 : getProductnameen().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getPurchaseday() == null) ? 0 : getPurchaseday().hashCode());
        result = prime * result + ((getLinkitemid() == null) ? 0 : getLinkitemid().hashCode());
        result = prime * result + ((getApplyoper() == null) ? 0 : getApplyoper().hashCode());
        result = prime * result + ((getNamechn() == null) ? 0 : getNamechn().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getPicture2() == null) ? 0 : getPicture2().hashCode());
        result = prime * result + ((getPackagingfee() == null) ? 0 : getPackagingfee().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sku=").append(sku);
        sb.append(", oper=").append(oper);
        sb.append(", packagingname=").append(packagingname);
        sb.append(", picture3=").append(picture3);
        sb.append(", costprice=").append(costprice);
        sb.append(", volume=").append(volume);
        sb.append(", groupid=").append(groupid);
        sb.append(", producttitle=").append(producttitle);
        sb.append(", iclass=").append(iclass);
        sb.append(", stype=").append(stype);
        sb.append(", productname=").append(productname);
        sb.append(", descr=").append(descr);
        sb.append(", alertnum=").append(alertnum);
        sb.append(", savenum=").append(savenum);
        sb.append(", createtime=").append(createtime);
        sb.append(", opertime=").append(opertime);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", locationid=").append(locationid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", status=").append(status);
        sb.append(", storage=").append(storage);
        sb.append(", packageoper=").append(packageoper);
        sb.append(", location=").append(location);
        sb.append(", picture4=").append(picture4);
        sb.append(", openflag=").append(openflag);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", alertday=").append(alertday);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", declaredvalue=").append(declaredvalue);
        sb.append(", length=").append(length);
        sb.append(", pickupoper=").append(pickupoper);
        sb.append(", high=").append(high);
        sb.append(", packagingid=").append(packagingid);
        sb.append(", savedate=").append(savedate);
        sb.append(", packagingweight=").append(packagingweight);
        sb.append(", picture1=").append(picture1);
        sb.append(", productnameen=").append(productnameen);
        sb.append(", content=").append(content);
        sb.append(", weight=").append(weight);
        sb.append(", purchaseday=").append(purchaseday);
        sb.append(", linkitemid=").append(linkitemid);
        sb.append(", applyoper=").append(applyoper);
        sb.append(", namechn=").append(namechn);
        sb.append(", storageid=").append(storageid);
        sb.append(", selloper=").append(selloper);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", width=").append(width);
        sb.append(", picture2=").append(picture2);
        sb.append(", packagingfee=").append(packagingfee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}