package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchaseflowdevelop implements Serializable {
    private BigDecimal sequenceid;

    private Date orderstime;

    private String follow;

    private String groupid;

    private String manufactureid;

    private String manufacture;

    private String paymenttype;

    private BigDecimal amountrmb;

    private BigDecimal deposits;

    private BigDecimal amountusd;

    private BigDecimal status;

    private BigDecimal ftcbm;

    private BigDecimal delivery;

    private BigDecimal arrivalperiod;

    private Date sendtime;

    private String portcity;

    private Date actualsendtime;

    private Date lcltime;

    private Date outporttime;

    private Date toporttime;

    private Date towarehousetime;

    private Date inwarehousetime;

    private Date createdate;

    private String createoper;

    private Date opertime;

    private String oper;

    private BigDecimal openflag;

    private String position;

    private String withasingle;

    private String photoqc;

    private Date completetime;

    private String receipt;

    private BigDecimal drawback;

    private String expresstype;

    private String expresstypeid;

    private Date depositstime;

    private String ronumber;

    private Date cutofftime;

    private String containerinfo;

    private String packageinglist;

    private String billoflading;

    private BigDecimal transportfare;

    private BigDecimal sendmoney;

    private Date sendpaytime;

    private BigDecimal toportmoney;

    private Date toportpaytime;

    private BigDecimal finalmoney;

    private Date finalpaytime;

    private String followdescr;

    private String expressid;

    private BigDecimal depositsflag;

    private BigDecimal sendmoneyflag;

    private BigDecimal toportmoneyflag;

    private BigDecimal finalmoneyflag;

    private String stockoper;

    private BigDecimal urgent;

    private Date arrivedate;

    private BigDecimal samplenum;

    private BigDecimal amountrmbflag;

    private BigDecimal poconfirm;

    private Date checktime;

    private Date verifytime;

    private Date topurposeporttime;

    private BigDecimal boxnum;

    private BigDecimal amount;

    private BigDecimal discount1;

    private BigDecimal ordernum;

    private BigDecimal classnum;

    private BigDecimal developtotalvolume;

    private String district;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public Date getOrderstime() {
        return orderstime;
    }

    public void setOrderstime(Date orderstime) {
        this.orderstime = orderstime;
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow == null ? null : follow.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
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

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
    }

    public BigDecimal getAmountrmb() {
        return amountrmb;
    }

    public void setAmountrmb(BigDecimal amountrmb) {
        this.amountrmb = amountrmb;
    }

    public BigDecimal getDeposits() {
        return deposits;
    }

    public void setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
    }

    public BigDecimal getAmountusd() {
        return amountusd;
    }

    public void setAmountusd(BigDecimal amountusd) {
        this.amountusd = amountusd;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getFtcbm() {
        return ftcbm;
    }

    public void setFtcbm(BigDecimal ftcbm) {
        this.ftcbm = ftcbm;
    }

    public BigDecimal getDelivery() {
        return delivery;
    }

    public void setDelivery(BigDecimal delivery) {
        this.delivery = delivery;
    }

    public BigDecimal getArrivalperiod() {
        return arrivalperiod;
    }

    public void setArrivalperiod(BigDecimal arrivalperiod) {
        this.arrivalperiod = arrivalperiod;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getPortcity() {
        return portcity;
    }

    public void setPortcity(String portcity) {
        this.portcity = portcity == null ? null : portcity.trim();
    }

    public Date getActualsendtime() {
        return actualsendtime;
    }

    public void setActualsendtime(Date actualsendtime) {
        this.actualsendtime = actualsendtime;
    }

    public Date getLcltime() {
        return lcltime;
    }

    public void setLcltime(Date lcltime) {
        this.lcltime = lcltime;
    }

    public Date getOutporttime() {
        return outporttime;
    }

    public void setOutporttime(Date outporttime) {
        this.outporttime = outporttime;
    }

    public Date getToporttime() {
        return toporttime;
    }

    public void setToporttime(Date toporttime) {
        this.toporttime = toporttime;
    }

    public Date getTowarehousetime() {
        return towarehousetime;
    }

    public void setTowarehousetime(Date towarehousetime) {
        this.towarehousetime = towarehousetime;
    }

    public Date getInwarehousetime() {
        return inwarehousetime;
    }

    public void setInwarehousetime(Date inwarehousetime) {
        this.inwarehousetime = inwarehousetime;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getWithasingle() {
        return withasingle;
    }

    public void setWithasingle(String withasingle) {
        this.withasingle = withasingle == null ? null : withasingle.trim();
    }

    public String getPhotoqc() {
        return photoqc;
    }

    public void setPhotoqc(String photoqc) {
        this.photoqc = photoqc == null ? null : photoqc.trim();
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt == null ? null : receipt.trim();
    }

    public BigDecimal getDrawback() {
        return drawback;
    }

    public void setDrawback(BigDecimal drawback) {
        this.drawback = drawback;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
    }

    public Date getDepositstime() {
        return depositstime;
    }

    public void setDepositstime(Date depositstime) {
        this.depositstime = depositstime;
    }

    public String getRonumber() {
        return ronumber;
    }

    public void setRonumber(String ronumber) {
        this.ronumber = ronumber == null ? null : ronumber.trim();
    }

    public Date getCutofftime() {
        return cutofftime;
    }

    public void setCutofftime(Date cutofftime) {
        this.cutofftime = cutofftime;
    }

    public String getContainerinfo() {
        return containerinfo;
    }

    public void setContainerinfo(String containerinfo) {
        this.containerinfo = containerinfo == null ? null : containerinfo.trim();
    }

    public String getPackageinglist() {
        return packageinglist;
    }

    public void setPackageinglist(String packageinglist) {
        this.packageinglist = packageinglist == null ? null : packageinglist.trim();
    }

    public String getBilloflading() {
        return billoflading;
    }

    public void setBilloflading(String billoflading) {
        this.billoflading = billoflading == null ? null : billoflading.trim();
    }

    public BigDecimal getTransportfare() {
        return transportfare;
    }

    public void setTransportfare(BigDecimal transportfare) {
        this.transportfare = transportfare;
    }

    public BigDecimal getSendmoney() {
        return sendmoney;
    }

    public void setSendmoney(BigDecimal sendmoney) {
        this.sendmoney = sendmoney;
    }

    public Date getSendpaytime() {
        return sendpaytime;
    }

    public void setSendpaytime(Date sendpaytime) {
        this.sendpaytime = sendpaytime;
    }

    public BigDecimal getToportmoney() {
        return toportmoney;
    }

    public void setToportmoney(BigDecimal toportmoney) {
        this.toportmoney = toportmoney;
    }

    public Date getToportpaytime() {
        return toportpaytime;
    }

    public void setToportpaytime(Date toportpaytime) {
        this.toportpaytime = toportpaytime;
    }

    public BigDecimal getFinalmoney() {
        return finalmoney;
    }

    public void setFinalmoney(BigDecimal finalmoney) {
        this.finalmoney = finalmoney;
    }

    public Date getFinalpaytime() {
        return finalpaytime;
    }

    public void setFinalpaytime(Date finalpaytime) {
        this.finalpaytime = finalpaytime;
    }

    public String getFollowdescr() {
        return followdescr;
    }

    public void setFollowdescr(String followdescr) {
        this.followdescr = followdescr == null ? null : followdescr.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public BigDecimal getDepositsflag() {
        return depositsflag;
    }

    public void setDepositsflag(BigDecimal depositsflag) {
        this.depositsflag = depositsflag;
    }

    public BigDecimal getSendmoneyflag() {
        return sendmoneyflag;
    }

    public void setSendmoneyflag(BigDecimal sendmoneyflag) {
        this.sendmoneyflag = sendmoneyflag;
    }

    public BigDecimal getToportmoneyflag() {
        return toportmoneyflag;
    }

    public void setToportmoneyflag(BigDecimal toportmoneyflag) {
        this.toportmoneyflag = toportmoneyflag;
    }

    public BigDecimal getFinalmoneyflag() {
        return finalmoneyflag;
    }

    public void setFinalmoneyflag(BigDecimal finalmoneyflag) {
        this.finalmoneyflag = finalmoneyflag;
    }

    public String getStockoper() {
        return stockoper;
    }

    public void setStockoper(String stockoper) {
        this.stockoper = stockoper == null ? null : stockoper.trim();
    }

    public BigDecimal getUrgent() {
        return urgent;
    }

    public void setUrgent(BigDecimal urgent) {
        this.urgent = urgent;
    }

    public Date getArrivedate() {
        return arrivedate;
    }

    public void setArrivedate(Date arrivedate) {
        this.arrivedate = arrivedate;
    }

    public BigDecimal getSamplenum() {
        return samplenum;
    }

    public void setSamplenum(BigDecimal samplenum) {
        this.samplenum = samplenum;
    }

    public BigDecimal getAmountrmbflag() {
        return amountrmbflag;
    }

    public void setAmountrmbflag(BigDecimal amountrmbflag) {
        this.amountrmbflag = amountrmbflag;
    }

    public BigDecimal getPoconfirm() {
        return poconfirm;
    }

    public void setPoconfirm(BigDecimal poconfirm) {
        this.poconfirm = poconfirm;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }

    public Date getTopurposeporttime() {
        return topurposeporttime;
    }

    public void setTopurposeporttime(Date topurposeporttime) {
        this.topurposeporttime = topurposeporttime;
    }

    public BigDecimal getBoxnum() {
        return boxnum;
    }

    public void setBoxnum(BigDecimal boxnum) {
        this.boxnum = boxnum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getDiscount1() {
        return discount1;
    }

    public void setDiscount1(BigDecimal discount1) {
        this.discount1 = discount1;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getClassnum() {
        return classnum;
    }

    public void setClassnum(BigDecimal classnum) {
        this.classnum = classnum;
    }

    public BigDecimal getDeveloptotalvolume() {
        return developtotalvolume;
    }

    public void setDeveloptotalvolume(BigDecimal developtotalvolume) {
        this.developtotalvolume = developtotalvolume;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
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
        DbPurchaseflowdevelop other = (DbPurchaseflowdevelop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderstime() == null ? other.getOrderstime() == null : this.getOrderstime().equals(other.getOrderstime()))
            && (this.getFollow() == null ? other.getFollow() == null : this.getFollow().equals(other.getFollow()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getPaymenttype() == null ? other.getPaymenttype() == null : this.getPaymenttype().equals(other.getPaymenttype()))
            && (this.getAmountrmb() == null ? other.getAmountrmb() == null : this.getAmountrmb().equals(other.getAmountrmb()))
            && (this.getDeposits() == null ? other.getDeposits() == null : this.getDeposits().equals(other.getDeposits()))
            && (this.getAmountusd() == null ? other.getAmountusd() == null : this.getAmountusd().equals(other.getAmountusd()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFtcbm() == null ? other.getFtcbm() == null : this.getFtcbm().equals(other.getFtcbm()))
            && (this.getDelivery() == null ? other.getDelivery() == null : this.getDelivery().equals(other.getDelivery()))
            && (this.getArrivalperiod() == null ? other.getArrivalperiod() == null : this.getArrivalperiod().equals(other.getArrivalperiod()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getPortcity() == null ? other.getPortcity() == null : this.getPortcity().equals(other.getPortcity()))
            && (this.getActualsendtime() == null ? other.getActualsendtime() == null : this.getActualsendtime().equals(other.getActualsendtime()))
            && (this.getLcltime() == null ? other.getLcltime() == null : this.getLcltime().equals(other.getLcltime()))
            && (this.getOutporttime() == null ? other.getOutporttime() == null : this.getOutporttime().equals(other.getOutporttime()))
            && (this.getToporttime() == null ? other.getToporttime() == null : this.getToporttime().equals(other.getToporttime()))
            && (this.getTowarehousetime() == null ? other.getTowarehousetime() == null : this.getTowarehousetime().equals(other.getTowarehousetime()))
            && (this.getInwarehousetime() == null ? other.getInwarehousetime() == null : this.getInwarehousetime().equals(other.getInwarehousetime()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getWithasingle() == null ? other.getWithasingle() == null : this.getWithasingle().equals(other.getWithasingle()))
            && (this.getPhotoqc() == null ? other.getPhotoqc() == null : this.getPhotoqc().equals(other.getPhotoqc()))
            && (this.getCompletetime() == null ? other.getCompletetime() == null : this.getCompletetime().equals(other.getCompletetime()))
            && (this.getReceipt() == null ? other.getReceipt() == null : this.getReceipt().equals(other.getReceipt()))
            && (this.getDrawback() == null ? other.getDrawback() == null : this.getDrawback().equals(other.getDrawback()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getDepositstime() == null ? other.getDepositstime() == null : this.getDepositstime().equals(other.getDepositstime()))
            && (this.getRonumber() == null ? other.getRonumber() == null : this.getRonumber().equals(other.getRonumber()))
            && (this.getCutofftime() == null ? other.getCutofftime() == null : this.getCutofftime().equals(other.getCutofftime()))
            && (this.getContainerinfo() == null ? other.getContainerinfo() == null : this.getContainerinfo().equals(other.getContainerinfo()))
            && (this.getPackageinglist() == null ? other.getPackageinglist() == null : this.getPackageinglist().equals(other.getPackageinglist()))
            && (this.getBilloflading() == null ? other.getBilloflading() == null : this.getBilloflading().equals(other.getBilloflading()))
            && (this.getTransportfare() == null ? other.getTransportfare() == null : this.getTransportfare().equals(other.getTransportfare()))
            && (this.getSendmoney() == null ? other.getSendmoney() == null : this.getSendmoney().equals(other.getSendmoney()))
            && (this.getSendpaytime() == null ? other.getSendpaytime() == null : this.getSendpaytime().equals(other.getSendpaytime()))
            && (this.getToportmoney() == null ? other.getToportmoney() == null : this.getToportmoney().equals(other.getToportmoney()))
            && (this.getToportpaytime() == null ? other.getToportpaytime() == null : this.getToportpaytime().equals(other.getToportpaytime()))
            && (this.getFinalmoney() == null ? other.getFinalmoney() == null : this.getFinalmoney().equals(other.getFinalmoney()))
            && (this.getFinalpaytime() == null ? other.getFinalpaytime() == null : this.getFinalpaytime().equals(other.getFinalpaytime()))
            && (this.getFollowdescr() == null ? other.getFollowdescr() == null : this.getFollowdescr().equals(other.getFollowdescr()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getDepositsflag() == null ? other.getDepositsflag() == null : this.getDepositsflag().equals(other.getDepositsflag()))
            && (this.getSendmoneyflag() == null ? other.getSendmoneyflag() == null : this.getSendmoneyflag().equals(other.getSendmoneyflag()))
            && (this.getToportmoneyflag() == null ? other.getToportmoneyflag() == null : this.getToportmoneyflag().equals(other.getToportmoneyflag()))
            && (this.getFinalmoneyflag() == null ? other.getFinalmoneyflag() == null : this.getFinalmoneyflag().equals(other.getFinalmoneyflag()))
            && (this.getStockoper() == null ? other.getStockoper() == null : this.getStockoper().equals(other.getStockoper()))
            && (this.getUrgent() == null ? other.getUrgent() == null : this.getUrgent().equals(other.getUrgent()))
            && (this.getArrivedate() == null ? other.getArrivedate() == null : this.getArrivedate().equals(other.getArrivedate()))
            && (this.getSamplenum() == null ? other.getSamplenum() == null : this.getSamplenum().equals(other.getSamplenum()))
            && (this.getAmountrmbflag() == null ? other.getAmountrmbflag() == null : this.getAmountrmbflag().equals(other.getAmountrmbflag()))
            && (this.getPoconfirm() == null ? other.getPoconfirm() == null : this.getPoconfirm().equals(other.getPoconfirm()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getVerifytime() == null ? other.getVerifytime() == null : this.getVerifytime().equals(other.getVerifytime()))
            && (this.getTopurposeporttime() == null ? other.getTopurposeporttime() == null : this.getTopurposeporttime().equals(other.getTopurposeporttime()))
            && (this.getBoxnum() == null ? other.getBoxnum() == null : this.getBoxnum().equals(other.getBoxnum()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDiscount1() == null ? other.getDiscount1() == null : this.getDiscount1().equals(other.getDiscount1()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getClassnum() == null ? other.getClassnum() == null : this.getClassnum().equals(other.getClassnum()))
            && (this.getDeveloptotalvolume() == null ? other.getDeveloptotalvolume() == null : this.getDeveloptotalvolume().equals(other.getDeveloptotalvolume()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderstime() == null) ? 0 : getOrderstime().hashCode());
        result = prime * result + ((getFollow() == null) ? 0 : getFollow().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getPaymenttype() == null) ? 0 : getPaymenttype().hashCode());
        result = prime * result + ((getAmountrmb() == null) ? 0 : getAmountrmb().hashCode());
        result = prime * result + ((getDeposits() == null) ? 0 : getDeposits().hashCode());
        result = prime * result + ((getAmountusd() == null) ? 0 : getAmountusd().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFtcbm() == null) ? 0 : getFtcbm().hashCode());
        result = prime * result + ((getDelivery() == null) ? 0 : getDelivery().hashCode());
        result = prime * result + ((getArrivalperiod() == null) ? 0 : getArrivalperiod().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getPortcity() == null) ? 0 : getPortcity().hashCode());
        result = prime * result + ((getActualsendtime() == null) ? 0 : getActualsendtime().hashCode());
        result = prime * result + ((getLcltime() == null) ? 0 : getLcltime().hashCode());
        result = prime * result + ((getOutporttime() == null) ? 0 : getOutporttime().hashCode());
        result = prime * result + ((getToporttime() == null) ? 0 : getToporttime().hashCode());
        result = prime * result + ((getTowarehousetime() == null) ? 0 : getTowarehousetime().hashCode());
        result = prime * result + ((getInwarehousetime() == null) ? 0 : getInwarehousetime().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getWithasingle() == null) ? 0 : getWithasingle().hashCode());
        result = prime * result + ((getPhotoqc() == null) ? 0 : getPhotoqc().hashCode());
        result = prime * result + ((getCompletetime() == null) ? 0 : getCompletetime().hashCode());
        result = prime * result + ((getReceipt() == null) ? 0 : getReceipt().hashCode());
        result = prime * result + ((getDrawback() == null) ? 0 : getDrawback().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getDepositstime() == null) ? 0 : getDepositstime().hashCode());
        result = prime * result + ((getRonumber() == null) ? 0 : getRonumber().hashCode());
        result = prime * result + ((getCutofftime() == null) ? 0 : getCutofftime().hashCode());
        result = prime * result + ((getContainerinfo() == null) ? 0 : getContainerinfo().hashCode());
        result = prime * result + ((getPackageinglist() == null) ? 0 : getPackageinglist().hashCode());
        result = prime * result + ((getBilloflading() == null) ? 0 : getBilloflading().hashCode());
        result = prime * result + ((getTransportfare() == null) ? 0 : getTransportfare().hashCode());
        result = prime * result + ((getSendmoney() == null) ? 0 : getSendmoney().hashCode());
        result = prime * result + ((getSendpaytime() == null) ? 0 : getSendpaytime().hashCode());
        result = prime * result + ((getToportmoney() == null) ? 0 : getToportmoney().hashCode());
        result = prime * result + ((getToportpaytime() == null) ? 0 : getToportpaytime().hashCode());
        result = prime * result + ((getFinalmoney() == null) ? 0 : getFinalmoney().hashCode());
        result = prime * result + ((getFinalpaytime() == null) ? 0 : getFinalpaytime().hashCode());
        result = prime * result + ((getFollowdescr() == null) ? 0 : getFollowdescr().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getDepositsflag() == null) ? 0 : getDepositsflag().hashCode());
        result = prime * result + ((getSendmoneyflag() == null) ? 0 : getSendmoneyflag().hashCode());
        result = prime * result + ((getToportmoneyflag() == null) ? 0 : getToportmoneyflag().hashCode());
        result = prime * result + ((getFinalmoneyflag() == null) ? 0 : getFinalmoneyflag().hashCode());
        result = prime * result + ((getStockoper() == null) ? 0 : getStockoper().hashCode());
        result = prime * result + ((getUrgent() == null) ? 0 : getUrgent().hashCode());
        result = prime * result + ((getArrivedate() == null) ? 0 : getArrivedate().hashCode());
        result = prime * result + ((getSamplenum() == null) ? 0 : getSamplenum().hashCode());
        result = prime * result + ((getAmountrmbflag() == null) ? 0 : getAmountrmbflag().hashCode());
        result = prime * result + ((getPoconfirm() == null) ? 0 : getPoconfirm().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getVerifytime() == null) ? 0 : getVerifytime().hashCode());
        result = prime * result + ((getTopurposeporttime() == null) ? 0 : getTopurposeporttime().hashCode());
        result = prime * result + ((getBoxnum() == null) ? 0 : getBoxnum().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDiscount1() == null) ? 0 : getDiscount1().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getClassnum() == null) ? 0 : getClassnum().hashCode());
        result = prime * result + ((getDeveloptotalvolume() == null) ? 0 : getDeveloptotalvolume().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", orderstime=").append(orderstime);
        sb.append(", follow=").append(follow);
        sb.append(", groupid=").append(groupid);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", paymenttype=").append(paymenttype);
        sb.append(", amountrmb=").append(amountrmb);
        sb.append(", deposits=").append(deposits);
        sb.append(", amountusd=").append(amountusd);
        sb.append(", status=").append(status);
        sb.append(", ftcbm=").append(ftcbm);
        sb.append(", delivery=").append(delivery);
        sb.append(", arrivalperiod=").append(arrivalperiod);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", portcity=").append(portcity);
        sb.append(", actualsendtime=").append(actualsendtime);
        sb.append(", lcltime=").append(lcltime);
        sb.append(", outporttime=").append(outporttime);
        sb.append(", toporttime=").append(toporttime);
        sb.append(", towarehousetime=").append(towarehousetime);
        sb.append(", inwarehousetime=").append(inwarehousetime);
        sb.append(", createdate=").append(createdate);
        sb.append(", createoper=").append(createoper);
        sb.append(", opertime=").append(opertime);
        sb.append(", oper=").append(oper);
        sb.append(", openflag=").append(openflag);
        sb.append(", position=").append(position);
        sb.append(", withasingle=").append(withasingle);
        sb.append(", photoqc=").append(photoqc);
        sb.append(", completetime=").append(completetime);
        sb.append(", receipt=").append(receipt);
        sb.append(", drawback=").append(drawback);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", depositstime=").append(depositstime);
        sb.append(", ronumber=").append(ronumber);
        sb.append(", cutofftime=").append(cutofftime);
        sb.append(", containerinfo=").append(containerinfo);
        sb.append(", packageinglist=").append(packageinglist);
        sb.append(", billoflading=").append(billoflading);
        sb.append(", transportfare=").append(transportfare);
        sb.append(", sendmoney=").append(sendmoney);
        sb.append(", sendpaytime=").append(sendpaytime);
        sb.append(", toportmoney=").append(toportmoney);
        sb.append(", toportpaytime=").append(toportpaytime);
        sb.append(", finalmoney=").append(finalmoney);
        sb.append(", finalpaytime=").append(finalpaytime);
        sb.append(", followdescr=").append(followdescr);
        sb.append(", expressid=").append(expressid);
        sb.append(", depositsflag=").append(depositsflag);
        sb.append(", sendmoneyflag=").append(sendmoneyflag);
        sb.append(", toportmoneyflag=").append(toportmoneyflag);
        sb.append(", finalmoneyflag=").append(finalmoneyflag);
        sb.append(", stockoper=").append(stockoper);
        sb.append(", urgent=").append(urgent);
        sb.append(", arrivedate=").append(arrivedate);
        sb.append(", samplenum=").append(samplenum);
        sb.append(", amountrmbflag=").append(amountrmbflag);
        sb.append(", poconfirm=").append(poconfirm);
        sb.append(", checktime=").append(checktime);
        sb.append(", verifytime=").append(verifytime);
        sb.append(", topurposeporttime=").append(topurposeporttime);
        sb.append(", boxnum=").append(boxnum);
        sb.append(", amount=").append(amount);
        sb.append(", discount1=").append(discount1);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", classnum=").append(classnum);
        sb.append(", developtotalvolume=").append(developtotalvolume);
        sb.append(", district=").append(district);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}