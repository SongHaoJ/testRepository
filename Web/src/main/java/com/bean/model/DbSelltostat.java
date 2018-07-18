package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSelltostat implements Serializable {
    private String sid;

    private String corpid;

    private String orderid;

    private String productid;

    private String productname;

    private BigDecimal ordernum;

    private BigDecimal sellprice;

    private BigDecimal costprice;

    private String customerid;

    private String customername;

    private String customeremail;

    private String storageid;

    private String storagename;

    private String locationid;

    private String locationname;

    private String alertflag;

    private String shoptypeid;

    private String shoptype;

    private String oper;

    private Date opertime;

    private String selloper;

    private String purchaseoper;

    private String ebayitemid;

    private String tradeid;

    private String transactionid;

    private String moneytype;

    private BigDecimal weight;

    private BigDecimal weightamount;

    private String packagingid;

    private String packagingname;

    private String englishname;

    private BigDecimal insurance;

    private Date ordertime;

    private Date purchasetime;

    private Date expresstime;

    private BigDecimal intotal;

    private BigDecimal inexpress;

    private BigDecimal inother1;

    private BigDecimal inother2;

    private BigDecimal outtotal;

    private BigDecimal outexpress;

    private BigDecimal outebayfee;

    private BigDecimal outpaypalfee;

    private BigDecimal outother1;

    private BigDecimal outother2;

    private BigDecimal moneyrate;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private String reserve8;

    private String reserve9;

    private String reserve10;

    private String source;

    private Date createtime;

    private BigDecimal outpackagingfee;

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

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
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

    public String getAlertflag() {
        return alertflag;
    }

    public void setAlertflag(String alertflag) {
        this.alertflag = alertflag == null ? null : alertflag.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
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

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
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

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
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

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(Date purchasetime) {
        this.purchasetime = purchasetime;
    }

    public Date getExpresstime() {
        return expresstime;
    }

    public void setExpresstime(Date expresstime) {
        this.expresstime = expresstime;
    }

    public BigDecimal getIntotal() {
        return intotal;
    }

    public void setIntotal(BigDecimal intotal) {
        this.intotal = intotal;
    }

    public BigDecimal getInexpress() {
        return inexpress;
    }

    public void setInexpress(BigDecimal inexpress) {
        this.inexpress = inexpress;
    }

    public BigDecimal getInother1() {
        return inother1;
    }

    public void setInother1(BigDecimal inother1) {
        this.inother1 = inother1;
    }

    public BigDecimal getInother2() {
        return inother2;
    }

    public void setInother2(BigDecimal inother2) {
        this.inother2 = inother2;
    }

    public BigDecimal getOuttotal() {
        return outtotal;
    }

    public void setOuttotal(BigDecimal outtotal) {
        this.outtotal = outtotal;
    }

    public BigDecimal getOutexpress() {
        return outexpress;
    }

    public void setOutexpress(BigDecimal outexpress) {
        this.outexpress = outexpress;
    }

    public BigDecimal getOutebayfee() {
        return outebayfee;
    }

    public void setOutebayfee(BigDecimal outebayfee) {
        this.outebayfee = outebayfee;
    }

    public BigDecimal getOutpaypalfee() {
        return outpaypalfee;
    }

    public void setOutpaypalfee(BigDecimal outpaypalfee) {
        this.outpaypalfee = outpaypalfee;
    }

    public BigDecimal getOutother1() {
        return outother1;
    }

    public void setOutother1(BigDecimal outother1) {
        this.outother1 = outother1;
    }

    public BigDecimal getOutother2() {
        return outother2;
    }

    public void setOutother2(BigDecimal outother2) {
        this.outother2 = outother2;
    }

    public BigDecimal getMoneyrate() {
        return moneyrate;
    }

    public void setMoneyrate(BigDecimal moneyrate) {
        this.moneyrate = moneyrate;
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

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
    }

    public BigDecimal getReserve7() {
        return reserve7;
    }

    public void setReserve7(BigDecimal reserve7) {
        this.reserve7 = reserve7;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getOutpackagingfee() {
        return outpackagingfee;
    }

    public void setOutpackagingfee(BigDecimal outpackagingfee) {
        this.outpackagingfee = outpackagingfee;
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
        DbSelltostat other = (DbSelltostat) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocationname() == null ? other.getLocationname() == null : this.getLocationname().equals(other.getLocationname()))
            && (this.getAlertflag() == null ? other.getAlertflag() == null : this.getAlertflag().equals(other.getAlertflag()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getWeightamount() == null ? other.getWeightamount() == null : this.getWeightamount().equals(other.getWeightamount()))
            && (this.getPackagingid() == null ? other.getPackagingid() == null : this.getPackagingid().equals(other.getPackagingid()))
            && (this.getPackagingname() == null ? other.getPackagingname() == null : this.getPackagingname().equals(other.getPackagingname()))
            && (this.getEnglishname() == null ? other.getEnglishname() == null : this.getEnglishname().equals(other.getEnglishname()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getPurchasetime() == null ? other.getPurchasetime() == null : this.getPurchasetime().equals(other.getPurchasetime()))
            && (this.getExpresstime() == null ? other.getExpresstime() == null : this.getExpresstime().equals(other.getExpresstime()))
            && (this.getIntotal() == null ? other.getIntotal() == null : this.getIntotal().equals(other.getIntotal()))
            && (this.getInexpress() == null ? other.getInexpress() == null : this.getInexpress().equals(other.getInexpress()))
            && (this.getInother1() == null ? other.getInother1() == null : this.getInother1().equals(other.getInother1()))
            && (this.getInother2() == null ? other.getInother2() == null : this.getInother2().equals(other.getInother2()))
            && (this.getOuttotal() == null ? other.getOuttotal() == null : this.getOuttotal().equals(other.getOuttotal()))
            && (this.getOutexpress() == null ? other.getOutexpress() == null : this.getOutexpress().equals(other.getOutexpress()))
            && (this.getOutebayfee() == null ? other.getOutebayfee() == null : this.getOutebayfee().equals(other.getOutebayfee()))
            && (this.getOutpaypalfee() == null ? other.getOutpaypalfee() == null : this.getOutpaypalfee().equals(other.getOutpaypalfee()))
            && (this.getOutother1() == null ? other.getOutother1() == null : this.getOutother1().equals(other.getOutother1()))
            && (this.getOutother2() == null ? other.getOutother2() == null : this.getOutother2().equals(other.getOutother2()))
            && (this.getMoneyrate() == null ? other.getMoneyrate() == null : this.getMoneyrate().equals(other.getMoneyrate()))
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
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOutpackagingfee() == null ? other.getOutpackagingfee() == null : this.getOutpackagingfee().equals(other.getOutpackagingfee()));
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
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocationname() == null) ? 0 : getLocationname().hashCode());
        result = prime * result + ((getAlertflag() == null) ? 0 : getAlertflag().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getWeightamount() == null) ? 0 : getWeightamount().hashCode());
        result = prime * result + ((getPackagingid() == null) ? 0 : getPackagingid().hashCode());
        result = prime * result + ((getPackagingname() == null) ? 0 : getPackagingname().hashCode());
        result = prime * result + ((getEnglishname() == null) ? 0 : getEnglishname().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getPurchasetime() == null) ? 0 : getPurchasetime().hashCode());
        result = prime * result + ((getExpresstime() == null) ? 0 : getExpresstime().hashCode());
        result = prime * result + ((getIntotal() == null) ? 0 : getIntotal().hashCode());
        result = prime * result + ((getInexpress() == null) ? 0 : getInexpress().hashCode());
        result = prime * result + ((getInother1() == null) ? 0 : getInother1().hashCode());
        result = prime * result + ((getInother2() == null) ? 0 : getInother2().hashCode());
        result = prime * result + ((getOuttotal() == null) ? 0 : getOuttotal().hashCode());
        result = prime * result + ((getOutexpress() == null) ? 0 : getOutexpress().hashCode());
        result = prime * result + ((getOutebayfee() == null) ? 0 : getOutebayfee().hashCode());
        result = prime * result + ((getOutpaypalfee() == null) ? 0 : getOutpaypalfee().hashCode());
        result = prime * result + ((getOutother1() == null) ? 0 : getOutother1().hashCode());
        result = prime * result + ((getOutother2() == null) ? 0 : getOutother2().hashCode());
        result = prime * result + ((getMoneyrate() == null) ? 0 : getMoneyrate().hashCode());
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
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOutpackagingfee() == null) ? 0 : getOutpackagingfee().hashCode());
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
        sb.append(", sellprice=").append(sellprice);
        sb.append(", costprice=").append(costprice);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", locationid=").append(locationid);
        sb.append(", locationname=").append(locationname);
        sb.append(", alertflag=").append(alertflag);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", selloper=").append(selloper);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", weight=").append(weight);
        sb.append(", weightamount=").append(weightamount);
        sb.append(", packagingid=").append(packagingid);
        sb.append(", packagingname=").append(packagingname);
        sb.append(", englishname=").append(englishname);
        sb.append(", insurance=").append(insurance);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", purchasetime=").append(purchasetime);
        sb.append(", expresstime=").append(expresstime);
        sb.append(", intotal=").append(intotal);
        sb.append(", inexpress=").append(inexpress);
        sb.append(", inother1=").append(inother1);
        sb.append(", inother2=").append(inother2);
        sb.append(", outtotal=").append(outtotal);
        sb.append(", outexpress=").append(outexpress);
        sb.append(", outebayfee=").append(outebayfee);
        sb.append(", outpaypalfee=").append(outpaypalfee);
        sb.append(", outother1=").append(outother1);
        sb.append(", outother2=").append(outother2);
        sb.append(", moneyrate=").append(moneyrate);
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
        sb.append(", source=").append(source);
        sb.append(", createtime=").append(createtime);
        sb.append(", outpackagingfee=").append(outpackagingfee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}