package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class StatProductdetilDaily implements Serializable {
    private String sequenceid;

    private String yyyy;

    private String yyyymm;

    private String yyyymmdd;

    private String productid;

    private String productname;

    private String categoryid;

    private String oper1;

    private String oper2;

    private String oper3;

    private String oper4;

    private String oper5;

    private String oper6;

    private String orderid;

    private BigDecimal orderprice;

    private BigDecimal skusellprice;

    private BigDecimal ordernum;

    private BigDecimal skuallprice;

    private BigDecimal orderexpressrate;

    private BigDecimal skuexpressrate;

    private BigDecimal ebayorderrate;

    private BigDecimal ebayskurate;

    private BigDecimal orderpaypalrate;

    private BigDecimal skupaypalrate;

    private BigDecimal orderweight;

    private String expresstypeid;

    private String expresstype;

    private BigDecimal orderexpresstyperate;

    private BigDecimal skuexpresstyperate;

    private BigDecimal productweight;

    private String productlocationid;

    private String manufacture;

    private String manufactureid;

    private String productstorage;

    private String productstatus;

    private BigDecimal productcostprice;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String shoptype;

    private String shoptypeid;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getYyyy() {
        return yyyy;
    }

    public void setYyyy(String yyyy) {
        this.yyyy = yyyy == null ? null : yyyy.trim();
    }

    public String getYyyymm() {
        return yyyymm;
    }

    public void setYyyymm(String yyyymm) {
        this.yyyymm = yyyymm == null ? null : yyyymm.trim();
    }

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd == null ? null : yyyymmdd.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public BigDecimal getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }

    public BigDecimal getSkusellprice() {
        return skusellprice;
    }

    public void setSkusellprice(BigDecimal skusellprice) {
        this.skusellprice = skusellprice;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getSkuallprice() {
        return skuallprice;
    }

    public void setSkuallprice(BigDecimal skuallprice) {
        this.skuallprice = skuallprice;
    }

    public BigDecimal getOrderexpressrate() {
        return orderexpressrate;
    }

    public void setOrderexpressrate(BigDecimal orderexpressrate) {
        this.orderexpressrate = orderexpressrate;
    }

    public BigDecimal getSkuexpressrate() {
        return skuexpressrate;
    }

    public void setSkuexpressrate(BigDecimal skuexpressrate) {
        this.skuexpressrate = skuexpressrate;
    }

    public BigDecimal getEbayorderrate() {
        return ebayorderrate;
    }

    public void setEbayorderrate(BigDecimal ebayorderrate) {
        this.ebayorderrate = ebayorderrate;
    }

    public BigDecimal getEbayskurate() {
        return ebayskurate;
    }

    public void setEbayskurate(BigDecimal ebayskurate) {
        this.ebayskurate = ebayskurate;
    }

    public BigDecimal getOrderpaypalrate() {
        return orderpaypalrate;
    }

    public void setOrderpaypalrate(BigDecimal orderpaypalrate) {
        this.orderpaypalrate = orderpaypalrate;
    }

    public BigDecimal getSkupaypalrate() {
        return skupaypalrate;
    }

    public void setSkupaypalrate(BigDecimal skupaypalrate) {
        this.skupaypalrate = skupaypalrate;
    }

    public BigDecimal getOrderweight() {
        return orderweight;
    }

    public void setOrderweight(BigDecimal orderweight) {
        this.orderweight = orderweight;
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public BigDecimal getOrderexpresstyperate() {
        return orderexpresstyperate;
    }

    public void setOrderexpresstyperate(BigDecimal orderexpresstyperate) {
        this.orderexpresstyperate = orderexpresstyperate;
    }

    public BigDecimal getSkuexpresstyperate() {
        return skuexpresstyperate;
    }

    public void setSkuexpresstyperate(BigDecimal skuexpresstyperate) {
        this.skuexpresstyperate = skuexpresstyperate;
    }

    public BigDecimal getProductweight() {
        return productweight;
    }

    public void setProductweight(BigDecimal productweight) {
        this.productweight = productweight;
    }

    public String getProductlocationid() {
        return productlocationid;
    }

    public void setProductlocationid(String productlocationid) {
        this.productlocationid = productlocationid == null ? null : productlocationid.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public String getProductstorage() {
        return productstorage;
    }

    public void setProductstorage(String productstorage) {
        this.productstorage = productstorage == null ? null : productstorage.trim();
    }

    public String getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(String productstatus) {
        this.productstatus = productstatus == null ? null : productstatus.trim();
    }

    public BigDecimal getProductcostprice() {
        return productcostprice;
    }

    public void setProductcostprice(BigDecimal productcostprice) {
        this.productcostprice = productcostprice;
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

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
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
        StatProductdetilDaily other = (StatProductdetilDaily) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getYyyy() == null ? other.getYyyy() == null : this.getYyyy().equals(other.getYyyy()))
            && (this.getYyyymm() == null ? other.getYyyymm() == null : this.getYyyymm().equals(other.getYyyymm()))
            && (this.getYyyymmdd() == null ? other.getYyyymmdd() == null : this.getYyyymmdd().equals(other.getYyyymmdd()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getOper3() == null ? other.getOper3() == null : this.getOper3().equals(other.getOper3()))
            && (this.getOper4() == null ? other.getOper4() == null : this.getOper4().equals(other.getOper4()))
            && (this.getOper5() == null ? other.getOper5() == null : this.getOper5().equals(other.getOper5()))
            && (this.getOper6() == null ? other.getOper6() == null : this.getOper6().equals(other.getOper6()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrderprice() == null ? other.getOrderprice() == null : this.getOrderprice().equals(other.getOrderprice()))
            && (this.getSkusellprice() == null ? other.getSkusellprice() == null : this.getSkusellprice().equals(other.getSkusellprice()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getSkuallprice() == null ? other.getSkuallprice() == null : this.getSkuallprice().equals(other.getSkuallprice()))
            && (this.getOrderexpressrate() == null ? other.getOrderexpressrate() == null : this.getOrderexpressrate().equals(other.getOrderexpressrate()))
            && (this.getSkuexpressrate() == null ? other.getSkuexpressrate() == null : this.getSkuexpressrate().equals(other.getSkuexpressrate()))
            && (this.getEbayorderrate() == null ? other.getEbayorderrate() == null : this.getEbayorderrate().equals(other.getEbayorderrate()))
            && (this.getEbayskurate() == null ? other.getEbayskurate() == null : this.getEbayskurate().equals(other.getEbayskurate()))
            && (this.getOrderpaypalrate() == null ? other.getOrderpaypalrate() == null : this.getOrderpaypalrate().equals(other.getOrderpaypalrate()))
            && (this.getSkupaypalrate() == null ? other.getSkupaypalrate() == null : this.getSkupaypalrate().equals(other.getSkupaypalrate()))
            && (this.getOrderweight() == null ? other.getOrderweight() == null : this.getOrderweight().equals(other.getOrderweight()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getOrderexpresstyperate() == null ? other.getOrderexpresstyperate() == null : this.getOrderexpresstyperate().equals(other.getOrderexpresstyperate()))
            && (this.getSkuexpresstyperate() == null ? other.getSkuexpresstyperate() == null : this.getSkuexpresstyperate().equals(other.getSkuexpresstyperate()))
            && (this.getProductweight() == null ? other.getProductweight() == null : this.getProductweight().equals(other.getProductweight()))
            && (this.getProductlocationid() == null ? other.getProductlocationid() == null : this.getProductlocationid().equals(other.getProductlocationid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getProductstorage() == null ? other.getProductstorage() == null : this.getProductstorage().equals(other.getProductstorage()))
            && (this.getProductstatus() == null ? other.getProductstatus() == null : this.getProductstatus().equals(other.getProductstatus()))
            && (this.getProductcostprice() == null ? other.getProductcostprice() == null : this.getProductcostprice().equals(other.getProductcostprice()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getYyyy() == null) ? 0 : getYyyy().hashCode());
        result = prime * result + ((getYyyymm() == null) ? 0 : getYyyymm().hashCode());
        result = prime * result + ((getYyyymmdd() == null) ? 0 : getYyyymmdd().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getOper3() == null) ? 0 : getOper3().hashCode());
        result = prime * result + ((getOper4() == null) ? 0 : getOper4().hashCode());
        result = prime * result + ((getOper5() == null) ? 0 : getOper5().hashCode());
        result = prime * result + ((getOper6() == null) ? 0 : getOper6().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrderprice() == null) ? 0 : getOrderprice().hashCode());
        result = prime * result + ((getSkusellprice() == null) ? 0 : getSkusellprice().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getSkuallprice() == null) ? 0 : getSkuallprice().hashCode());
        result = prime * result + ((getOrderexpressrate() == null) ? 0 : getOrderexpressrate().hashCode());
        result = prime * result + ((getSkuexpressrate() == null) ? 0 : getSkuexpressrate().hashCode());
        result = prime * result + ((getEbayorderrate() == null) ? 0 : getEbayorderrate().hashCode());
        result = prime * result + ((getEbayskurate() == null) ? 0 : getEbayskurate().hashCode());
        result = prime * result + ((getOrderpaypalrate() == null) ? 0 : getOrderpaypalrate().hashCode());
        result = prime * result + ((getSkupaypalrate() == null) ? 0 : getSkupaypalrate().hashCode());
        result = prime * result + ((getOrderweight() == null) ? 0 : getOrderweight().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getOrderexpresstyperate() == null) ? 0 : getOrderexpresstyperate().hashCode());
        result = prime * result + ((getSkuexpresstyperate() == null) ? 0 : getSkuexpresstyperate().hashCode());
        result = prime * result + ((getProductweight() == null) ? 0 : getProductweight().hashCode());
        result = prime * result + ((getProductlocationid() == null) ? 0 : getProductlocationid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getProductstorage() == null) ? 0 : getProductstorage().hashCode());
        result = prime * result + ((getProductstatus() == null) ? 0 : getProductstatus().hashCode());
        result = prime * result + ((getProductcostprice() == null) ? 0 : getProductcostprice().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", yyyy=").append(yyyy);
        sb.append(", yyyymm=").append(yyyymm);
        sb.append(", yyyymmdd=").append(yyyymmdd);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", oper3=").append(oper3);
        sb.append(", oper4=").append(oper4);
        sb.append(", oper5=").append(oper5);
        sb.append(", oper6=").append(oper6);
        sb.append(", orderid=").append(orderid);
        sb.append(", orderprice=").append(orderprice);
        sb.append(", skusellprice=").append(skusellprice);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", skuallprice=").append(skuallprice);
        sb.append(", orderexpressrate=").append(orderexpressrate);
        sb.append(", skuexpressrate=").append(skuexpressrate);
        sb.append(", ebayorderrate=").append(ebayorderrate);
        sb.append(", ebayskurate=").append(ebayskurate);
        sb.append(", orderpaypalrate=").append(orderpaypalrate);
        sb.append(", skupaypalrate=").append(skupaypalrate);
        sb.append(", orderweight=").append(orderweight);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", orderexpresstyperate=").append(orderexpresstyperate);
        sb.append(", skuexpresstyperate=").append(skuexpresstyperate);
        sb.append(", productweight=").append(productweight);
        sb.append(", productlocationid=").append(productlocationid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", productstorage=").append(productstorage);
        sb.append(", productstatus=").append(productstatus);
        sb.append(", productcostprice=").append(productcostprice);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}