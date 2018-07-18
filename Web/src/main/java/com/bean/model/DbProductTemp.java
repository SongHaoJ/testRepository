package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductTemp implements Serializable {
    private String sequenceid;

    private String sid;

    private String corpid;

    private String name;

    private String content;

    private String descr;

    private String projectid;

    private String categoryid;

    private String unit;

    private String status;

    private String brandid;

    private String brand;

    private String manufactureid;

    private String manufacture;

    private String origin;

    private String originarea;

    private String translate1;

    private String translate2;

    private String translate3;

    private String translate4;

    private String othercontent;

    private BigDecimal stockprice;

    private BigDecimal costprice;

    private BigDecimal sellprice;

    private BigDecimal batchprice1;

    private BigDecimal batchprice2;

    private BigDecimal batchprice3;

    private BigDecimal batchprice4;

    private String storageid;

    private String storage;

    private String locationid;

    private String location;

    private BigDecimal weight;

    private String sizes;

    private String color;

    private String barcode;

    private String availtime;

    private String alias1;

    private String alias2;

    private String alias3;

    private String picture1;

    private String picture2;

    private String picture3;

    private String picture4;

    private String buyflag;

    private BigDecimal buynum;

    private String shoptype;

    private String salesource;

    private BigDecimal savenum;

    private BigDecimal ordernum;

    private BigDecimal alertnum;

    private String levels;

    private String openflag;

    private String oper;

    private Date opertime;

    private String translateflag;

    private String priceflag;

    private String contentflag;

    private String picflag;

    private String designflag;

    private String publicflag;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String reserve6;

    private String reserve7;

    private String reserve8;

    private String reserve9;

    private String reserve10;

    private String manufactureid2;

    private String manufacture2;

    private String manufactureid3;

    private String manufacture3;

    private String checkstockoper;

    private Date checkstocktime;

    private BigDecimal price1;

    private BigDecimal price2;

    private BigDecimal price3;

    private BigDecimal price4;

    private BigDecimal price5;

    private BigDecimal price6;

    private BigDecimal price7;

    private BigDecimal price8;

    private String itemno;

    private String clobcontent;

    private String clobdescr;

    private String clobtranslate;

    private String oper1;

    private String oper2;

    private String oper3;

    private String oper4;

    private String oper5;

    private String oper6;

    private String alertflag;

    private String alertdescr;

    private String packagingid;

    private String packagingname;

    private BigDecimal packagingweight;

    private String dbClass;

    private String errorflag;

    private String errorinfo;

    private String groupid;

    private BigDecimal declaredvalue;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBrandid() {
        return brandid;
    }

    public void setBrandid(String brandid) {
        this.brandid = brandid == null ? null : brandid.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getOriginarea() {
        return originarea;
    }

    public void setOriginarea(String originarea) {
        this.originarea = originarea == null ? null : originarea.trim();
    }

    public String getTranslate1() {
        return translate1;
    }

    public void setTranslate1(String translate1) {
        this.translate1 = translate1 == null ? null : translate1.trim();
    }

    public String getTranslate2() {
        return translate2;
    }

    public void setTranslate2(String translate2) {
        this.translate2 = translate2 == null ? null : translate2.trim();
    }

    public String getTranslate3() {
        return translate3;
    }

    public void setTranslate3(String translate3) {
        this.translate3 = translate3 == null ? null : translate3.trim();
    }

    public String getTranslate4() {
        return translate4;
    }

    public void setTranslate4(String translate4) {
        this.translate4 = translate4 == null ? null : translate4.trim();
    }

    public String getOthercontent() {
        return othercontent;
    }

    public void setOthercontent(String othercontent) {
        this.othercontent = othercontent == null ? null : othercontent.trim();
    }

    public BigDecimal getStockprice() {
        return stockprice;
    }

    public void setStockprice(BigDecimal stockprice) {
        this.stockprice = stockprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getBatchprice1() {
        return batchprice1;
    }

    public void setBatchprice1(BigDecimal batchprice1) {
        this.batchprice1 = batchprice1;
    }

    public BigDecimal getBatchprice2() {
        return batchprice2;
    }

    public void setBatchprice2(BigDecimal batchprice2) {
        this.batchprice2 = batchprice2;
    }

    public BigDecimal getBatchprice3() {
        return batchprice3;
    }

    public void setBatchprice3(BigDecimal batchprice3) {
        this.batchprice3 = batchprice3;
    }

    public BigDecimal getBatchprice4() {
        return batchprice4;
    }

    public void setBatchprice4(BigDecimal batchprice4) {
        this.batchprice4 = batchprice4;
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes == null ? null : sizes.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getAvailtime() {
        return availtime;
    }

    public void setAvailtime(String availtime) {
        this.availtime = availtime == null ? null : availtime.trim();
    }

    public String getAlias1() {
        return alias1;
    }

    public void setAlias1(String alias1) {
        this.alias1 = alias1 == null ? null : alias1.trim();
    }

    public String getAlias2() {
        return alias2;
    }

    public void setAlias2(String alias2) {
        this.alias2 = alias2 == null ? null : alias2.trim();
    }

    public String getAlias3() {
        return alias3;
    }

    public void setAlias3(String alias3) {
        this.alias3 = alias3 == null ? null : alias3.trim();
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2 == null ? null : picture2.trim();
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3 == null ? null : picture3.trim();
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4 == null ? null : picture4.trim();
    }

    public String getBuyflag() {
        return buyflag;
    }

    public void setBuyflag(String buyflag) {
        this.buyflag = buyflag == null ? null : buyflag.trim();
    }

    public BigDecimal getBuynum() {
        return buynum;
    }

    public void setBuynum(BigDecimal buynum) {
        this.buynum = buynum;
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getSalesource() {
        return salesource;
    }

    public void setSalesource(String salesource) {
        this.salesource = salesource == null ? null : salesource.trim();
    }

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getAlertnum() {
        return alertnum;
    }

    public void setAlertnum(BigDecimal alertnum) {
        this.alertnum = alertnum;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels == null ? null : levels.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public String getTranslateflag() {
        return translateflag;
    }

    public void setTranslateflag(String translateflag) {
        this.translateflag = translateflag == null ? null : translateflag.trim();
    }

    public String getPriceflag() {
        return priceflag;
    }

    public void setPriceflag(String priceflag) {
        this.priceflag = priceflag == null ? null : priceflag.trim();
    }

    public String getContentflag() {
        return contentflag;
    }

    public void setContentflag(String contentflag) {
        this.contentflag = contentflag == null ? null : contentflag.trim();
    }

    public String getPicflag() {
        return picflag;
    }

    public void setPicflag(String picflag) {
        this.picflag = picflag == null ? null : picflag.trim();
    }

    public String getDesignflag() {
        return designflag;
    }

    public void setDesignflag(String designflag) {
        this.designflag = designflag == null ? null : designflag.trim();
    }

    public String getPublicflag() {
        return publicflag;
    }

    public void setPublicflag(String publicflag) {
        this.publicflag = publicflag == null ? null : publicflag.trim();
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

    public String getReserve7() {
        return reserve7;
    }

    public void setReserve7(String reserve7) {
        this.reserve7 = reserve7 == null ? null : reserve7.trim();
    }

    public String getReserve8() {
        return reserve8;
    }

    public void setReserve8(String reserve8) {
        this.reserve8 = reserve8 == null ? null : reserve8.trim();
    }

    public String getReserve9() {
        return reserve9;
    }

    public void setReserve9(String reserve9) {
        this.reserve9 = reserve9 == null ? null : reserve9.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }

    public String getManufactureid2() {
        return manufactureid2;
    }

    public void setManufactureid2(String manufactureid2) {
        this.manufactureid2 = manufactureid2 == null ? null : manufactureid2.trim();
    }

    public String getManufacture2() {
        return manufacture2;
    }

    public void setManufacture2(String manufacture2) {
        this.manufacture2 = manufacture2 == null ? null : manufacture2.trim();
    }

    public String getManufactureid3() {
        return manufactureid3;
    }

    public void setManufactureid3(String manufactureid3) {
        this.manufactureid3 = manufactureid3 == null ? null : manufactureid3.trim();
    }

    public String getManufacture3() {
        return manufacture3;
    }

    public void setManufacture3(String manufacture3) {
        this.manufacture3 = manufacture3 == null ? null : manufacture3.trim();
    }

    public String getCheckstockoper() {
        return checkstockoper;
    }

    public void setCheckstockoper(String checkstockoper) {
        this.checkstockoper = checkstockoper == null ? null : checkstockoper.trim();
    }

    public Date getCheckstocktime() {
        return checkstocktime;
    }

    public void setCheckstocktime(Date checkstocktime) {
        this.checkstocktime = checkstocktime;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }

    public BigDecimal getPrice3() {
        return price3;
    }

    public void setPrice3(BigDecimal price3) {
        this.price3 = price3;
    }

    public BigDecimal getPrice4() {
        return price4;
    }

    public void setPrice4(BigDecimal price4) {
        this.price4 = price4;
    }

    public BigDecimal getPrice5() {
        return price5;
    }

    public void setPrice5(BigDecimal price5) {
        this.price5 = price5;
    }

    public BigDecimal getPrice6() {
        return price6;
    }

    public void setPrice6(BigDecimal price6) {
        this.price6 = price6;
    }

    public BigDecimal getPrice7() {
        return price7;
    }

    public void setPrice7(BigDecimal price7) {
        this.price7 = price7;
    }

    public BigDecimal getPrice8() {
        return price8;
    }

    public void setPrice8(BigDecimal price8) {
        this.price8 = price8;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    public String getClobcontent() {
        return clobcontent;
    }

    public void setClobcontent(String clobcontent) {
        this.clobcontent = clobcontent == null ? null : clobcontent.trim();
    }

    public String getClobdescr() {
        return clobdescr;
    }

    public void setClobdescr(String clobdescr) {
        this.clobdescr = clobdescr == null ? null : clobdescr.trim();
    }

    public String getClobtranslate() {
        return clobtranslate;
    }

    public void setClobtranslate(String clobtranslate) {
        this.clobtranslate = clobtranslate == null ? null : clobtranslate.trim();
    }

    public String getOper1() {
        return oper1;
    }

    public void setOper1(String oper1) {
        this.oper1 = oper1 == null ? null : oper1.trim();
    }

    public String getOper2() {
        return oper2;
    }

    public void setOper2(String oper2) {
        this.oper2 = oper2 == null ? null : oper2.trim();
    }

    public String getOper3() {
        return oper3;
    }

    public void setOper3(String oper3) {
        this.oper3 = oper3 == null ? null : oper3.trim();
    }

    public String getOper4() {
        return oper4;
    }

    public void setOper4(String oper4) {
        this.oper4 = oper4 == null ? null : oper4.trim();
    }

    public String getOper5() {
        return oper5;
    }

    public void setOper5(String oper5) {
        this.oper5 = oper5 == null ? null : oper5.trim();
    }

    public String getOper6() {
        return oper6;
    }

    public void setOper6(String oper6) {
        this.oper6 = oper6 == null ? null : oper6.trim();
    }

    public String getAlertflag() {
        return alertflag;
    }

    public void setAlertflag(String alertflag) {
        this.alertflag = alertflag == null ? null : alertflag.trim();
    }

    public String getAlertdescr() {
        return alertdescr;
    }

    public void setAlertdescr(String alertdescr) {
        this.alertdescr = alertdescr == null ? null : alertdescr.trim();
    }

    public String getPackagingid() {
        return packagingid;
    }

    public void setPackagingid(String packagingid) {
        this.packagingid = packagingid == null ? null : packagingid.trim();
    }

    public String getPackagingname() {
        return packagingname;
    }

    public void setPackagingname(String packagingname) {
        this.packagingname = packagingname == null ? null : packagingname.trim();
    }

    public BigDecimal getPackagingweight() {
        return packagingweight;
    }

    public void setPackagingweight(BigDecimal packagingweight) {
        this.packagingweight = packagingweight;
    }

    public String getDbClass() {
        return dbClass;
    }

    public void setDbClass(String dbClass) {
        this.dbClass = dbClass == null ? null : dbClass.trim();
    }

    public String getErrorflag() {
        return errorflag;
    }

    public void setErrorflag(String errorflag) {
        this.errorflag = errorflag == null ? null : errorflag.trim();
    }

    public String getErrorinfo() {
        return errorinfo;
    }

    public void setErrorinfo(String errorinfo) {
        this.errorinfo = errorinfo == null ? null : errorinfo.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public BigDecimal getDeclaredvalue() {
        return declaredvalue;
    }

    public void setDeclaredvalue(BigDecimal declaredvalue) {
        this.declaredvalue = declaredvalue;
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
        DbProductTemp other = (DbProductTemp) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getProjectid() == null ? other.getProjectid() == null : this.getProjectid().equals(other.getProjectid()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getOriginarea() == null ? other.getOriginarea() == null : this.getOriginarea().equals(other.getOriginarea()))
            && (this.getTranslate1() == null ? other.getTranslate1() == null : this.getTranslate1().equals(other.getTranslate1()))
            && (this.getTranslate2() == null ? other.getTranslate2() == null : this.getTranslate2().equals(other.getTranslate2()))
            && (this.getTranslate3() == null ? other.getTranslate3() == null : this.getTranslate3().equals(other.getTranslate3()))
            && (this.getTranslate4() == null ? other.getTranslate4() == null : this.getTranslate4().equals(other.getTranslate4()))
            && (this.getOthercontent() == null ? other.getOthercontent() == null : this.getOthercontent().equals(other.getOthercontent()))
            && (this.getStockprice() == null ? other.getStockprice() == null : this.getStockprice().equals(other.getStockprice()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getBatchprice1() == null ? other.getBatchprice1() == null : this.getBatchprice1().equals(other.getBatchprice1()))
            && (this.getBatchprice2() == null ? other.getBatchprice2() == null : this.getBatchprice2().equals(other.getBatchprice2()))
            && (this.getBatchprice3() == null ? other.getBatchprice3() == null : this.getBatchprice3().equals(other.getBatchprice3()))
            && (this.getBatchprice4() == null ? other.getBatchprice4() == null : this.getBatchprice4().equals(other.getBatchprice4()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getSizes() == null ? other.getSizes() == null : this.getSizes().equals(other.getSizes()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getAvailtime() == null ? other.getAvailtime() == null : this.getAvailtime().equals(other.getAvailtime()))
            && (this.getAlias1() == null ? other.getAlias1() == null : this.getAlias1().equals(other.getAlias1()))
            && (this.getAlias2() == null ? other.getAlias2() == null : this.getAlias2().equals(other.getAlias2()))
            && (this.getAlias3() == null ? other.getAlias3() == null : this.getAlias3().equals(other.getAlias3()))
            && (this.getPicture1() == null ? other.getPicture1() == null : this.getPicture1().equals(other.getPicture1()))
            && (this.getPicture2() == null ? other.getPicture2() == null : this.getPicture2().equals(other.getPicture2()))
            && (this.getPicture3() == null ? other.getPicture3() == null : this.getPicture3().equals(other.getPicture3()))
            && (this.getPicture4() == null ? other.getPicture4() == null : this.getPicture4().equals(other.getPicture4()))
            && (this.getBuyflag() == null ? other.getBuyflag() == null : this.getBuyflag().equals(other.getBuyflag()))
            && (this.getBuynum() == null ? other.getBuynum() == null : this.getBuynum().equals(other.getBuynum()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getAlertnum() == null ? other.getAlertnum() == null : this.getAlertnum().equals(other.getAlertnum()))
            && (this.getLevels() == null ? other.getLevels() == null : this.getLevels().equals(other.getLevels()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTranslateflag() == null ? other.getTranslateflag() == null : this.getTranslateflag().equals(other.getTranslateflag()))
            && (this.getPriceflag() == null ? other.getPriceflag() == null : this.getPriceflag().equals(other.getPriceflag()))
            && (this.getContentflag() == null ? other.getContentflag() == null : this.getContentflag().equals(other.getContentflag()))
            && (this.getPicflag() == null ? other.getPicflag() == null : this.getPicflag().equals(other.getPicflag()))
            && (this.getDesignflag() == null ? other.getDesignflag() == null : this.getDesignflag().equals(other.getDesignflag()))
            && (this.getPublicflag() == null ? other.getPublicflag() == null : this.getPublicflag().equals(other.getPublicflag()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getManufactureid2() == null ? other.getManufactureid2() == null : this.getManufactureid2().equals(other.getManufactureid2()))
            && (this.getManufacture2() == null ? other.getManufacture2() == null : this.getManufacture2().equals(other.getManufacture2()))
            && (this.getManufactureid3() == null ? other.getManufactureid3() == null : this.getManufactureid3().equals(other.getManufactureid3()))
            && (this.getManufacture3() == null ? other.getManufacture3() == null : this.getManufacture3().equals(other.getManufacture3()))
            && (this.getCheckstockoper() == null ? other.getCheckstockoper() == null : this.getCheckstockoper().equals(other.getCheckstockoper()))
            && (this.getCheckstocktime() == null ? other.getCheckstocktime() == null : this.getCheckstocktime().equals(other.getCheckstocktime()))
            && (this.getPrice1() == null ? other.getPrice1() == null : this.getPrice1().equals(other.getPrice1()))
            && (this.getPrice2() == null ? other.getPrice2() == null : this.getPrice2().equals(other.getPrice2()))
            && (this.getPrice3() == null ? other.getPrice3() == null : this.getPrice3().equals(other.getPrice3()))
            && (this.getPrice4() == null ? other.getPrice4() == null : this.getPrice4().equals(other.getPrice4()))
            && (this.getPrice5() == null ? other.getPrice5() == null : this.getPrice5().equals(other.getPrice5()))
            && (this.getPrice6() == null ? other.getPrice6() == null : this.getPrice6().equals(other.getPrice6()))
            && (this.getPrice7() == null ? other.getPrice7() == null : this.getPrice7().equals(other.getPrice7()))
            && (this.getPrice8() == null ? other.getPrice8() == null : this.getPrice8().equals(other.getPrice8()))
            && (this.getItemno() == null ? other.getItemno() == null : this.getItemno().equals(other.getItemno()))
            && (this.getClobcontent() == null ? other.getClobcontent() == null : this.getClobcontent().equals(other.getClobcontent()))
            && (this.getClobdescr() == null ? other.getClobdescr() == null : this.getClobdescr().equals(other.getClobdescr()))
            && (this.getClobtranslate() == null ? other.getClobtranslate() == null : this.getClobtranslate().equals(other.getClobtranslate()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getOper3() == null ? other.getOper3() == null : this.getOper3().equals(other.getOper3()))
            && (this.getOper4() == null ? other.getOper4() == null : this.getOper4().equals(other.getOper4()))
            && (this.getOper5() == null ? other.getOper5() == null : this.getOper5().equals(other.getOper5()))
            && (this.getOper6() == null ? other.getOper6() == null : this.getOper6().equals(other.getOper6()))
            && (this.getAlertflag() == null ? other.getAlertflag() == null : this.getAlertflag().equals(other.getAlertflag()))
            && (this.getAlertdescr() == null ? other.getAlertdescr() == null : this.getAlertdescr().equals(other.getAlertdescr()))
            && (this.getPackagingid() == null ? other.getPackagingid() == null : this.getPackagingid().equals(other.getPackagingid()))
            && (this.getPackagingname() == null ? other.getPackagingname() == null : this.getPackagingname().equals(other.getPackagingname()))
            && (this.getPackagingweight() == null ? other.getPackagingweight() == null : this.getPackagingweight().equals(other.getPackagingweight()))
            && (this.getDbClass() == null ? other.getDbClass() == null : this.getDbClass().equals(other.getDbClass()))
            && (this.getErrorflag() == null ? other.getErrorflag() == null : this.getErrorflag().equals(other.getErrorflag()))
            && (this.getErrorinfo() == null ? other.getErrorinfo() == null : this.getErrorinfo().equals(other.getErrorinfo()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getDeclaredvalue() == null ? other.getDeclaredvalue() == null : this.getDeclaredvalue().equals(other.getDeclaredvalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getProjectid() == null) ? 0 : getProjectid().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getOriginarea() == null) ? 0 : getOriginarea().hashCode());
        result = prime * result + ((getTranslate1() == null) ? 0 : getTranslate1().hashCode());
        result = prime * result + ((getTranslate2() == null) ? 0 : getTranslate2().hashCode());
        result = prime * result + ((getTranslate3() == null) ? 0 : getTranslate3().hashCode());
        result = prime * result + ((getTranslate4() == null) ? 0 : getTranslate4().hashCode());
        result = prime * result + ((getOthercontent() == null) ? 0 : getOthercontent().hashCode());
        result = prime * result + ((getStockprice() == null) ? 0 : getStockprice().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getBatchprice1() == null) ? 0 : getBatchprice1().hashCode());
        result = prime * result + ((getBatchprice2() == null) ? 0 : getBatchprice2().hashCode());
        result = prime * result + ((getBatchprice3() == null) ? 0 : getBatchprice3().hashCode());
        result = prime * result + ((getBatchprice4() == null) ? 0 : getBatchprice4().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getSizes() == null) ? 0 : getSizes().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getAvailtime() == null) ? 0 : getAvailtime().hashCode());
        result = prime * result + ((getAlias1() == null) ? 0 : getAlias1().hashCode());
        result = prime * result + ((getAlias2() == null) ? 0 : getAlias2().hashCode());
        result = prime * result + ((getAlias3() == null) ? 0 : getAlias3().hashCode());
        result = prime * result + ((getPicture1() == null) ? 0 : getPicture1().hashCode());
        result = prime * result + ((getPicture2() == null) ? 0 : getPicture2().hashCode());
        result = prime * result + ((getPicture3() == null) ? 0 : getPicture3().hashCode());
        result = prime * result + ((getPicture4() == null) ? 0 : getPicture4().hashCode());
        result = prime * result + ((getBuyflag() == null) ? 0 : getBuyflag().hashCode());
        result = prime * result + ((getBuynum() == null) ? 0 : getBuynum().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getAlertnum() == null) ? 0 : getAlertnum().hashCode());
        result = prime * result + ((getLevels() == null) ? 0 : getLevels().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTranslateflag() == null) ? 0 : getTranslateflag().hashCode());
        result = prime * result + ((getPriceflag() == null) ? 0 : getPriceflag().hashCode());
        result = prime * result + ((getContentflag() == null) ? 0 : getContentflag().hashCode());
        result = prime * result + ((getPicflag() == null) ? 0 : getPicflag().hashCode());
        result = prime * result + ((getDesignflag() == null) ? 0 : getDesignflag().hashCode());
        result = prime * result + ((getPublicflag() == null) ? 0 : getPublicflag().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getManufactureid2() == null) ? 0 : getManufactureid2().hashCode());
        result = prime * result + ((getManufacture2() == null) ? 0 : getManufacture2().hashCode());
        result = prime * result + ((getManufactureid3() == null) ? 0 : getManufactureid3().hashCode());
        result = prime * result + ((getManufacture3() == null) ? 0 : getManufacture3().hashCode());
        result = prime * result + ((getCheckstockoper() == null) ? 0 : getCheckstockoper().hashCode());
        result = prime * result + ((getCheckstocktime() == null) ? 0 : getCheckstocktime().hashCode());
        result = prime * result + ((getPrice1() == null) ? 0 : getPrice1().hashCode());
        result = prime * result + ((getPrice2() == null) ? 0 : getPrice2().hashCode());
        result = prime * result + ((getPrice3() == null) ? 0 : getPrice3().hashCode());
        result = prime * result + ((getPrice4() == null) ? 0 : getPrice4().hashCode());
        result = prime * result + ((getPrice5() == null) ? 0 : getPrice5().hashCode());
        result = prime * result + ((getPrice6() == null) ? 0 : getPrice6().hashCode());
        result = prime * result + ((getPrice7() == null) ? 0 : getPrice7().hashCode());
        result = prime * result + ((getPrice8() == null) ? 0 : getPrice8().hashCode());
        result = prime * result + ((getItemno() == null) ? 0 : getItemno().hashCode());
        result = prime * result + ((getClobcontent() == null) ? 0 : getClobcontent().hashCode());
        result = prime * result + ((getClobdescr() == null) ? 0 : getClobdescr().hashCode());
        result = prime * result + ((getClobtranslate() == null) ? 0 : getClobtranslate().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getOper3() == null) ? 0 : getOper3().hashCode());
        result = prime * result + ((getOper4() == null) ? 0 : getOper4().hashCode());
        result = prime * result + ((getOper5() == null) ? 0 : getOper5().hashCode());
        result = prime * result + ((getOper6() == null) ? 0 : getOper6().hashCode());
        result = prime * result + ((getAlertflag() == null) ? 0 : getAlertflag().hashCode());
        result = prime * result + ((getAlertdescr() == null) ? 0 : getAlertdescr().hashCode());
        result = prime * result + ((getPackagingid() == null) ? 0 : getPackagingid().hashCode());
        result = prime * result + ((getPackagingname() == null) ? 0 : getPackagingname().hashCode());
        result = prime * result + ((getPackagingweight() == null) ? 0 : getPackagingweight().hashCode());
        result = prime * result + ((getDbClass() == null) ? 0 : getDbClass().hashCode());
        result = prime * result + ((getErrorflag() == null) ? 0 : getErrorflag().hashCode());
        result = prime * result + ((getErrorinfo() == null) ? 0 : getErrorinfo().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getDeclaredvalue() == null) ? 0 : getDeclaredvalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", sid=").append(sid);
        sb.append(", corpid=").append(corpid);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", descr=").append(descr);
        sb.append(", projectid=").append(projectid);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", unit=").append(unit);
        sb.append(", status=").append(status);
        sb.append(", brandid=").append(brandid);
        sb.append(", brand=").append(brand);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", origin=").append(origin);
        sb.append(", originarea=").append(originarea);
        sb.append(", translate1=").append(translate1);
        sb.append(", translate2=").append(translate2);
        sb.append(", translate3=").append(translate3);
        sb.append(", translate4=").append(translate4);
        sb.append(", othercontent=").append(othercontent);
        sb.append(", stockprice=").append(stockprice);
        sb.append(", costprice=").append(costprice);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", batchprice1=").append(batchprice1);
        sb.append(", batchprice2=").append(batchprice2);
        sb.append(", batchprice3=").append(batchprice3);
        sb.append(", batchprice4=").append(batchprice4);
        sb.append(", storageid=").append(storageid);
        sb.append(", storage=").append(storage);
        sb.append(", locationid=").append(locationid);
        sb.append(", location=").append(location);
        sb.append(", weight=").append(weight);
        sb.append(", sizes=").append(sizes);
        sb.append(", color=").append(color);
        sb.append(", barcode=").append(barcode);
        sb.append(", availtime=").append(availtime);
        sb.append(", alias1=").append(alias1);
        sb.append(", alias2=").append(alias2);
        sb.append(", alias3=").append(alias3);
        sb.append(", picture1=").append(picture1);
        sb.append(", picture2=").append(picture2);
        sb.append(", picture3=").append(picture3);
        sb.append(", picture4=").append(picture4);
        sb.append(", buyflag=").append(buyflag);
        sb.append(", buynum=").append(buynum);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", savenum=").append(savenum);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", alertnum=").append(alertnum);
        sb.append(", levels=").append(levels);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", translateflag=").append(translateflag);
        sb.append(", priceflag=").append(priceflag);
        sb.append(", contentflag=").append(contentflag);
        sb.append(", picflag=").append(picflag);
        sb.append(", designflag=").append(designflag);
        sb.append(", publicflag=").append(publicflag);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", manufactureid2=").append(manufactureid2);
        sb.append(", manufacture2=").append(manufacture2);
        sb.append(", manufactureid3=").append(manufactureid3);
        sb.append(", manufacture3=").append(manufacture3);
        sb.append(", checkstockoper=").append(checkstockoper);
        sb.append(", checkstocktime=").append(checkstocktime);
        sb.append(", price1=").append(price1);
        sb.append(", price2=").append(price2);
        sb.append(", price3=").append(price3);
        sb.append(", price4=").append(price4);
        sb.append(", price5=").append(price5);
        sb.append(", price6=").append(price6);
        sb.append(", price7=").append(price7);
        sb.append(", price8=").append(price8);
        sb.append(", itemno=").append(itemno);
        sb.append(", clobcontent=").append(clobcontent);
        sb.append(", clobdescr=").append(clobdescr);
        sb.append(", clobtranslate=").append(clobtranslate);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", oper3=").append(oper3);
        sb.append(", oper4=").append(oper4);
        sb.append(", oper5=").append(oper5);
        sb.append(", oper6=").append(oper6);
        sb.append(", alertflag=").append(alertflag);
        sb.append(", alertdescr=").append(alertdescr);
        sb.append(", packagingid=").append(packagingid);
        sb.append(", packagingname=").append(packagingname);
        sb.append(", packagingweight=").append(packagingweight);
        sb.append(", dbClass=").append(dbClass);
        sb.append(", errorflag=").append(errorflag);
        sb.append(", errorinfo=").append(errorinfo);
        sb.append(", groupid=").append(groupid);
        sb.append(", declaredvalue=").append(declaredvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}