package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbFbasell implements Serializable {
    private String sid;

    private String corpid;

    private String orderid;

    private String productid;

    private String productname;

    private Integer ordernum;

    private BigDecimal costprice;

    private BigDecimal sellprice;

    private BigDecimal amount;

    private String customerid;

    private Date ordertime;

    private String storageid;

    private String storage;

    private String locationid;

    private String location;

    private String alertflag;

    private String shoptype;

    private String updateflag;

    private String oper;

    private Date opertime;

    private String flag;

    private String descr1;

    private String descr2;

    private String descr3;

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

    private Integer productsavenum;

    private Integer productordernum;

    private Integer productalertnum;

    private String productpic1;

    private String tradeid;

    private String transactionid;

    private BigDecimal originsellprice;

    private String moneytype;

    private String groupid;

    private BigDecimal weight;

    private BigDecimal weightamount;

    private String shoptypeid;

    private String ebayitemid;

    private BigDecimal finalvaluefee;

    private String englishname;

    private BigDecimal originsellmoney;

    private BigDecimal originexpressmoney;

    private BigDecimal originfinalvaluefee;

    private BigDecimal origingiftmoney;

    private static final long serialVersionUID = 1L;

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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
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

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
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

    public String getAlertflag() {
        return alertflag;
    }

    public void setAlertflag(String alertflag) {
        this.alertflag = alertflag == null ? null : alertflag.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(String updateflag) {
        this.updateflag = updateflag == null ? null : updateflag.trim();
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getDescr1() {
        return descr1;
    }

    public void setDescr1(String descr1) {
        this.descr1 = descr1 == null ? null : descr1.trim();
    }

    public String getDescr2() {
        return descr2;
    }

    public void setDescr2(String descr2) {
        this.descr2 = descr2 == null ? null : descr2.trim();
    }

    public String getDescr3() {
        return descr3;
    }

    public void setDescr3(String descr3) {
        this.descr3 = descr3 == null ? null : descr3.trim();
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

    public Integer getProductsavenum() {
        return productsavenum;
    }

    public void setProductsavenum(Integer productsavenum) {
        this.productsavenum = productsavenum;
    }

    public Integer getProductordernum() {
        return productordernum;
    }

    public void setProductordernum(Integer productordernum) {
        this.productordernum = productordernum;
    }

    public Integer getProductalertnum() {
        return productalertnum;
    }

    public void setProductalertnum(Integer productalertnum) {
        this.productalertnum = productalertnum;
    }

    public String getProductpic1() {
        return productpic1;
    }

    public void setProductpic1(String productpic1) {
        this.productpic1 = productpic1 == null ? null : productpic1.trim();
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public BigDecimal getOriginsellprice() {
        return originsellprice;
    }

    public void setOriginsellprice(BigDecimal originsellprice) {
        this.originsellprice = originsellprice;
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeightamount() {
        return weightamount;
    }

    public void setWeightamount(BigDecimal weightamount) {
        this.weightamount = weightamount;
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public BigDecimal getFinalvaluefee() {
        return finalvaluefee;
    }

    public void setFinalvaluefee(BigDecimal finalvaluefee) {
        this.finalvaluefee = finalvaluefee;
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public BigDecimal getOriginsellmoney() {
        return originsellmoney;
    }

    public void setOriginsellmoney(BigDecimal originsellmoney) {
        this.originsellmoney = originsellmoney;
    }

    public BigDecimal getOriginexpressmoney() {
        return originexpressmoney;
    }

    public void setOriginexpressmoney(BigDecimal originexpressmoney) {
        this.originexpressmoney = originexpressmoney;
    }

    public BigDecimal getOriginfinalvaluefee() {
        return originfinalvaluefee;
    }

    public void setOriginfinalvaluefee(BigDecimal originfinalvaluefee) {
        this.originfinalvaluefee = originfinalvaluefee;
    }

    public BigDecimal getOrigingiftmoney() {
        return origingiftmoney;
    }

    public void setOrigingiftmoney(BigDecimal origingiftmoney) {
        this.origingiftmoney = origingiftmoney;
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
        DbFbasell other = (DbFbasell) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getAlertflag() == null ? other.getAlertflag() == null : this.getAlertflag().equals(other.getAlertflag()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getDescr1() == null ? other.getDescr1() == null : this.getDescr1().equals(other.getDescr1()))
            && (this.getDescr2() == null ? other.getDescr2() == null : this.getDescr2().equals(other.getDescr2()))
            && (this.getDescr3() == null ? other.getDescr3() == null : this.getDescr3().equals(other.getDescr3()))
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
            && (this.getProductsavenum() == null ? other.getProductsavenum() == null : this.getProductsavenum().equals(other.getProductsavenum()))
            && (this.getProductordernum() == null ? other.getProductordernum() == null : this.getProductordernum().equals(other.getProductordernum()))
            && (this.getProductalertnum() == null ? other.getProductalertnum() == null : this.getProductalertnum().equals(other.getProductalertnum()))
            && (this.getProductpic1() == null ? other.getProductpic1() == null : this.getProductpic1().equals(other.getProductpic1()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getOriginsellprice() == null ? other.getOriginsellprice() == null : this.getOriginsellprice().equals(other.getOriginsellprice()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getWeightamount() == null ? other.getWeightamount() == null : this.getWeightamount().equals(other.getWeightamount()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getFinalvaluefee() == null ? other.getFinalvaluefee() == null : this.getFinalvaluefee().equals(other.getFinalvaluefee()))
            && (this.getEnglishname() == null ? other.getEnglishname() == null : this.getEnglishname().equals(other.getEnglishname()))
            && (this.getOriginsellmoney() == null ? other.getOriginsellmoney() == null : this.getOriginsellmoney().equals(other.getOriginsellmoney()))
            && (this.getOriginexpressmoney() == null ? other.getOriginexpressmoney() == null : this.getOriginexpressmoney().equals(other.getOriginexpressmoney()))
            && (this.getOriginfinalvaluefee() == null ? other.getOriginfinalvaluefee() == null : this.getOriginfinalvaluefee().equals(other.getOriginfinalvaluefee()))
            && (this.getOrigingiftmoney() == null ? other.getOrigingiftmoney() == null : this.getOrigingiftmoney().equals(other.getOrigingiftmoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getAlertflag() == null) ? 0 : getAlertflag().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getDescr1() == null) ? 0 : getDescr1().hashCode());
        result = prime * result + ((getDescr2() == null) ? 0 : getDescr2().hashCode());
        result = prime * result + ((getDescr3() == null) ? 0 : getDescr3().hashCode());
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
        result = prime * result + ((getProductsavenum() == null) ? 0 : getProductsavenum().hashCode());
        result = prime * result + ((getProductordernum() == null) ? 0 : getProductordernum().hashCode());
        result = prime * result + ((getProductalertnum() == null) ? 0 : getProductalertnum().hashCode());
        result = prime * result + ((getProductpic1() == null) ? 0 : getProductpic1().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getOriginsellprice() == null) ? 0 : getOriginsellprice().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getWeightamount() == null) ? 0 : getWeightamount().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getFinalvaluefee() == null) ? 0 : getFinalvaluefee().hashCode());
        result = prime * result + ((getEnglishname() == null) ? 0 : getEnglishname().hashCode());
        result = prime * result + ((getOriginsellmoney() == null) ? 0 : getOriginsellmoney().hashCode());
        result = prime * result + ((getOriginexpressmoney() == null) ? 0 : getOriginexpressmoney().hashCode());
        result = prime * result + ((getOriginfinalvaluefee() == null) ? 0 : getOriginfinalvaluefee().hashCode());
        result = prime * result + ((getOrigingiftmoney() == null) ? 0 : getOrigingiftmoney().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", corpid=").append(corpid);
        sb.append(", orderid=").append(orderid);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", costprice=").append(costprice);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", amount=").append(amount);
        sb.append(", customerid=").append(customerid);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", storageid=").append(storageid);
        sb.append(", storage=").append(storage);
        sb.append(", locationid=").append(locationid);
        sb.append(", location=").append(location);
        sb.append(", alertflag=").append(alertflag);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", flag=").append(flag);
        sb.append(", descr1=").append(descr1);
        sb.append(", descr2=").append(descr2);
        sb.append(", descr3=").append(descr3);
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
        sb.append(", productsavenum=").append(productsavenum);
        sb.append(", productordernum=").append(productordernum);
        sb.append(", productalertnum=").append(productalertnum);
        sb.append(", productpic1=").append(productpic1);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", originsellprice=").append(originsellprice);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", groupid=").append(groupid);
        sb.append(", weight=").append(weight);
        sb.append(", weightamount=").append(weightamount);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", finalvaluefee=").append(finalvaluefee);
        sb.append(", englishname=").append(englishname);
        sb.append(", originsellmoney=").append(originsellmoney);
        sb.append(", originexpressmoney=").append(originexpressmoney);
        sb.append(", originfinalvaluefee=").append(originfinalvaluefee);
        sb.append(", origingiftmoney=").append(origingiftmoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}