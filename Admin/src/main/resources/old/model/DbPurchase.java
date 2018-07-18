package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchase implements Serializable {
    private String sequenceid;

    private String sid;

    private String productid;

    private String manufacture;

    private BigDecimal ordernum;

    private BigDecimal inportprice;

    private BigDecimal amount;

    private Date inporttime;

    private BigDecimal actualnum;

    private BigDecimal actualprice;

    private BigDecimal actualamount;

    private String stockoper;

    private Date stocktime;

    private String slevel;

    private String status;

    private String oper;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String reserve4;

    private String reserve5;

    private BigDecimal savenum;

    private String corpid;

    private String openflag;

    private String manufactureid;

    private String groupid;

    private BigDecimal receivenum;

    private BigDecimal returnnum;

    private String payflag;

    private BigDecimal discount1;

    private BigDecimal discount2;

    private BigDecimal discount3;

    private BigDecimal discount4;

    private BigDecimal havepayed;

    private BigDecimal notpayed;

    private String paymenttype;

    private BigDecimal sevennum;

    private BigDecimal threenum;

    private BigDecimal ninenum;

    private String creatoper;

    private Date creatdate;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private String reserve10;

    private BigDecimal reserve14;

    private BigDecimal purchaseindexid;

    private String uniteflag;

    private BigDecimal purchaseflag;

    private Date sendtime;

    private String shipnum;

    private BigDecimal giftnum;

    private BigDecimal paymentid;

    private String receiveoper;

    private Date receivetime;

    private String descr;

    private String reserve3;

    private String name;

    private String remarks;

    private String reserve11;

    private String reserve12;

    private String reserve13;

    private String productname;

    private String reserve15;

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

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getInportprice() {
        return inportprice;
    }

    public void setInportprice(BigDecimal inportprice) {
        this.inportprice = inportprice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getInporttime() {
        return inporttime;
    }

    public void setInporttime(Date inporttime) {
        this.inporttime = inporttime;
    }

    public BigDecimal getActualnum() {
        return actualnum;
    }

    public void setActualnum(BigDecimal actualnum) {
        this.actualnum = actualnum;
    }

    public BigDecimal getActualprice() {
        return actualprice;
    }

    public void setActualprice(BigDecimal actualprice) {
        this.actualprice = actualprice;
    }

    public BigDecimal getActualamount() {
        return actualamount;
    }

    public void setActualamount(BigDecimal actualamount) {
        this.actualamount = actualamount;
    }

    public String getStockoper() {
        return stockoper;
    }

    public void setStockoper(String stockoper) {
        this.stockoper = stockoper == null ? null : stockoper.trim();
    }

    public Date getStocktime() {
        return stocktime;
    }

    public void setStocktime(Date stocktime) {
        this.stocktime = stocktime;
    }

    public String getSlevel() {
        return slevel;
    }

    public void setSlevel(String slevel) {
        this.slevel = slevel == null ? null : slevel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public BigDecimal getReceivenum() {
        return receivenum;
    }

    public void setReceivenum(BigDecimal receivenum) {
        this.receivenum = receivenum;
    }

    public BigDecimal getReturnnum() {
        return returnnum;
    }

    public void setReturnnum(BigDecimal returnnum) {
        this.returnnum = returnnum;
    }

    public String getPayflag() {
        return payflag;
    }

    public void setPayflag(String payflag) {
        this.payflag = payflag == null ? null : payflag.trim();
    }

    public BigDecimal getDiscount1() {
        return discount1;
    }

    public void setDiscount1(BigDecimal discount1) {
        this.discount1 = discount1;
    }

    public BigDecimal getDiscount2() {
        return discount2;
    }

    public void setDiscount2(BigDecimal discount2) {
        this.discount2 = discount2;
    }

    public BigDecimal getDiscount3() {
        return discount3;
    }

    public void setDiscount3(BigDecimal discount3) {
        this.discount3 = discount3;
    }

    public BigDecimal getDiscount4() {
        return discount4;
    }

    public void setDiscount4(BigDecimal discount4) {
        this.discount4 = discount4;
    }

    public BigDecimal getHavepayed() {
        return havepayed;
    }

    public void setHavepayed(BigDecimal havepayed) {
        this.havepayed = havepayed;
    }

    public BigDecimal getNotpayed() {
        return notpayed;
    }

    public void setNotpayed(BigDecimal notpayed) {
        this.notpayed = notpayed;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
    }

    public BigDecimal getSevennum() {
        return sevennum;
    }

    public void setSevennum(BigDecimal sevennum) {
        this.sevennum = sevennum;
    }

    public BigDecimal getThreenum() {
        return threenum;
    }

    public void setThreenum(BigDecimal threenum) {
        this.threenum = threenum;
    }

    public BigDecimal getNinenum() {
        return ninenum;
    }

    public void setNinenum(BigDecimal ninenum) {
        this.ninenum = ninenum;
    }

    public String getCreatoper() {
        return creatoper;
    }

    public void setCreatoper(String creatoper) {
        this.creatoper = creatoper == null ? null : creatoper.trim();
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
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

    public BigDecimal getReserve8() {
        return reserve8;
    }

    public void setReserve8(BigDecimal reserve8) {
        this.reserve8 = reserve8;
    }

    public BigDecimal getReserve9() {
        return reserve9;
    }

    public void setReserve9(BigDecimal reserve9) {
        this.reserve9 = reserve9;
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }

    public BigDecimal getReserve14() {
        return reserve14;
    }

    public void setReserve14(BigDecimal reserve14) {
        this.reserve14 = reserve14;
    }

    public BigDecimal getPurchaseindexid() {
        return purchaseindexid;
    }

    public void setPurchaseindexid(BigDecimal purchaseindexid) {
        this.purchaseindexid = purchaseindexid;
    }

    public String getUniteflag() {
        return uniteflag;
    }

    public void setUniteflag(String uniteflag) {
        this.uniteflag = uniteflag == null ? null : uniteflag.trim();
    }

    public BigDecimal getPurchaseflag() {
        return purchaseflag;
    }

    public void setPurchaseflag(BigDecimal purchaseflag) {
        this.purchaseflag = purchaseflag;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getShipnum() {
        return shipnum;
    }

    public void setShipnum(String shipnum) {
        this.shipnum = shipnum == null ? null : shipnum.trim();
    }

    public BigDecimal getGiftnum() {
        return giftnum;
    }

    public void setGiftnum(BigDecimal giftnum) {
        this.giftnum = giftnum;
    }

    public BigDecimal getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public String getReceiveoper() {
        return receiveoper;
    }

    public void setReceiveoper(String receiveoper) {
        this.receiveoper = receiveoper == null ? null : receiveoper.trim();
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getReserve11() {
        return reserve11;
    }

    public void setReserve11(String reserve11) {
        this.reserve11 = reserve11 == null ? null : reserve11.trim();
    }

    public String getReserve12() {
        return reserve12;
    }

    public void setReserve12(String reserve12) {
        this.reserve12 = reserve12 == null ? null : reserve12.trim();
    }

    public String getReserve13() {
        return reserve13;
    }

    public void setReserve13(String reserve13) {
        this.reserve13 = reserve13 == null ? null : reserve13.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getReserve15() {
        return reserve15;
    }

    public void setReserve15(String reserve15) {
        this.reserve15 = reserve15 == null ? null : reserve15.trim();
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
        DbPurchase other = (DbPurchase) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getInportprice() == null ? other.getInportprice() == null : this.getInportprice().equals(other.getInportprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getInporttime() == null ? other.getInporttime() == null : this.getInporttime().equals(other.getInporttime()))
            && (this.getActualnum() == null ? other.getActualnum() == null : this.getActualnum().equals(other.getActualnum()))
            && (this.getActualprice() == null ? other.getActualprice() == null : this.getActualprice().equals(other.getActualprice()))
            && (this.getActualamount() == null ? other.getActualamount() == null : this.getActualamount().equals(other.getActualamount()))
            && (this.getStockoper() == null ? other.getStockoper() == null : this.getStockoper().equals(other.getStockoper()))
            && (this.getStocktime() == null ? other.getStocktime() == null : this.getStocktime().equals(other.getStocktime()))
            && (this.getSlevel() == null ? other.getSlevel() == null : this.getSlevel().equals(other.getSlevel()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getReceivenum() == null ? other.getReceivenum() == null : this.getReceivenum().equals(other.getReceivenum()))
            && (this.getReturnnum() == null ? other.getReturnnum() == null : this.getReturnnum().equals(other.getReturnnum()))
            && (this.getPayflag() == null ? other.getPayflag() == null : this.getPayflag().equals(other.getPayflag()))
            && (this.getDiscount1() == null ? other.getDiscount1() == null : this.getDiscount1().equals(other.getDiscount1()))
            && (this.getDiscount2() == null ? other.getDiscount2() == null : this.getDiscount2().equals(other.getDiscount2()))
            && (this.getDiscount3() == null ? other.getDiscount3() == null : this.getDiscount3().equals(other.getDiscount3()))
            && (this.getDiscount4() == null ? other.getDiscount4() == null : this.getDiscount4().equals(other.getDiscount4()))
            && (this.getHavepayed() == null ? other.getHavepayed() == null : this.getHavepayed().equals(other.getHavepayed()))
            && (this.getNotpayed() == null ? other.getNotpayed() == null : this.getNotpayed().equals(other.getNotpayed()))
            && (this.getPaymenttype() == null ? other.getPaymenttype() == null : this.getPaymenttype().equals(other.getPaymenttype()))
            && (this.getSevennum() == null ? other.getSevennum() == null : this.getSevennum().equals(other.getSevennum()))
            && (this.getThreenum() == null ? other.getThreenum() == null : this.getThreenum().equals(other.getThreenum()))
            && (this.getNinenum() == null ? other.getNinenum() == null : this.getNinenum().equals(other.getNinenum()))
            && (this.getCreatoper() == null ? other.getCreatoper() == null : this.getCreatoper().equals(other.getCreatoper()))
            && (this.getCreatdate() == null ? other.getCreatdate() == null : this.getCreatdate().equals(other.getCreatdate()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getPurchaseindexid() == null ? other.getPurchaseindexid() == null : this.getPurchaseindexid().equals(other.getPurchaseindexid()))
            && (this.getUniteflag() == null ? other.getUniteflag() == null : this.getUniteflag().equals(other.getUniteflag()))
            && (this.getPurchaseflag() == null ? other.getPurchaseflag() == null : this.getPurchaseflag().equals(other.getPurchaseflag()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getShipnum() == null ? other.getShipnum() == null : this.getShipnum().equals(other.getShipnum()))
            && (this.getGiftnum() == null ? other.getGiftnum() == null : this.getGiftnum().equals(other.getGiftnum()))
            && (this.getPaymentid() == null ? other.getPaymentid() == null : this.getPaymentid().equals(other.getPaymentid()))
            && (this.getReceiveoper() == null ? other.getReceiveoper() == null : this.getReceiveoper().equals(other.getReceiveoper()))
            && (this.getReceivetime() == null ? other.getReceivetime() == null : this.getReceivetime().equals(other.getReceivetime()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getInportprice() == null) ? 0 : getInportprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getInporttime() == null) ? 0 : getInporttime().hashCode());
        result = prime * result + ((getActualnum() == null) ? 0 : getActualnum().hashCode());
        result = prime * result + ((getActualprice() == null) ? 0 : getActualprice().hashCode());
        result = prime * result + ((getActualamount() == null) ? 0 : getActualamount().hashCode());
        result = prime * result + ((getStockoper() == null) ? 0 : getStockoper().hashCode());
        result = prime * result + ((getStocktime() == null) ? 0 : getStocktime().hashCode());
        result = prime * result + ((getSlevel() == null) ? 0 : getSlevel().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getReceivenum() == null) ? 0 : getReceivenum().hashCode());
        result = prime * result + ((getReturnnum() == null) ? 0 : getReturnnum().hashCode());
        result = prime * result + ((getPayflag() == null) ? 0 : getPayflag().hashCode());
        result = prime * result + ((getDiscount1() == null) ? 0 : getDiscount1().hashCode());
        result = prime * result + ((getDiscount2() == null) ? 0 : getDiscount2().hashCode());
        result = prime * result + ((getDiscount3() == null) ? 0 : getDiscount3().hashCode());
        result = prime * result + ((getDiscount4() == null) ? 0 : getDiscount4().hashCode());
        result = prime * result + ((getHavepayed() == null) ? 0 : getHavepayed().hashCode());
        result = prime * result + ((getNotpayed() == null) ? 0 : getNotpayed().hashCode());
        result = prime * result + ((getPaymenttype() == null) ? 0 : getPaymenttype().hashCode());
        result = prime * result + ((getSevennum() == null) ? 0 : getSevennum().hashCode());
        result = prime * result + ((getThreenum() == null) ? 0 : getThreenum().hashCode());
        result = prime * result + ((getNinenum() == null) ? 0 : getNinenum().hashCode());
        result = prime * result + ((getCreatoper() == null) ? 0 : getCreatoper().hashCode());
        result = prime * result + ((getCreatdate() == null) ? 0 : getCreatdate().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getPurchaseindexid() == null) ? 0 : getPurchaseindexid().hashCode());
        result = prime * result + ((getUniteflag() == null) ? 0 : getUniteflag().hashCode());
        result = prime * result + ((getPurchaseflag() == null) ? 0 : getPurchaseflag().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getShipnum() == null) ? 0 : getShipnum().hashCode());
        result = prime * result + ((getGiftnum() == null) ? 0 : getGiftnum().hashCode());
        result = prime * result + ((getPaymentid() == null) ? 0 : getPaymentid().hashCode());
        result = prime * result + ((getReceiveoper() == null) ? 0 : getReceiveoper().hashCode());
        result = prime * result + ((getReceivetime() == null) ? 0 : getReceivetime().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
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
        sb.append(", productid=").append(productid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", inportprice=").append(inportprice);
        sb.append(", amount=").append(amount);
        sb.append(", inporttime=").append(inporttime);
        sb.append(", actualnum=").append(actualnum);
        sb.append(", actualprice=").append(actualprice);
        sb.append(", actualamount=").append(actualamount);
        sb.append(", stockoper=").append(stockoper);
        sb.append(", stocktime=").append(stocktime);
        sb.append(", slevel=").append(slevel);
        sb.append(", status=").append(status);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", savenum=").append(savenum);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", groupid=").append(groupid);
        sb.append(", receivenum=").append(receivenum);
        sb.append(", returnnum=").append(returnnum);
        sb.append(", payflag=").append(payflag);
        sb.append(", discount1=").append(discount1);
        sb.append(", discount2=").append(discount2);
        sb.append(", discount3=").append(discount3);
        sb.append(", discount4=").append(discount4);
        sb.append(", havepayed=").append(havepayed);
        sb.append(", notpayed=").append(notpayed);
        sb.append(", paymenttype=").append(paymenttype);
        sb.append(", sevennum=").append(sevennum);
        sb.append(", threenum=").append(threenum);
        sb.append(", ninenum=").append(ninenum);
        sb.append(", creatoper=").append(creatoper);
        sb.append(", creatdate=").append(creatdate);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", purchaseindexid=").append(purchaseindexid);
        sb.append(", uniteflag=").append(uniteflag);
        sb.append(", purchaseflag=").append(purchaseflag);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", shipnum=").append(shipnum);
        sb.append(", giftnum=").append(giftnum);
        sb.append(", paymentid=").append(paymentid);
        sb.append(", receiveoper=").append(receiveoper);
        sb.append(", receivetime=").append(receivetime);
        sb.append(", descr=").append(descr);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", name=").append(name);
        sb.append(", remarks=").append(remarks);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", productname=").append(productname);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}