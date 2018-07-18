package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchaseflow implements Serializable {
    private BigDecimal sequenceid;

    private String oper;

    private BigDecimal openflag;

    private Date opertime;

    private String corpid;

    private Date arrivedate;

    private String position;

    private String followupoper;

    private String poorderflag;

    private String company;

    private String productid;

    private String productname;

    private String payment;

    private BigDecimal allmoney;

    private BigDecimal deposit;

    private BigDecimal status;

    private BigDecimal dollar;

    private String posure;

    private String content;

    private Date photoqcdate;

    private String note;

    private BigDecimal samplenum;

    private Date samplearrivedate;

    private BigDecimal ftcbm;

    private Date deliverydate;

    private Date finishorderdate;

    private Date drawbackdate;

    private String city;

    private Date expressdate;

    private String cky;

    private String fpx;

    private String expressid;

    private String ponum;

    private Date loaddate;

    private Date etaharbourdate;

    private Date etaarrivedate;

    private Date arrivestoredate;

    private String containernote;

    private Date augarnereddate;

    private String packinglist;

    private String billoflading;

    private String shipmentupdateinventory;

    private String garneredupdateinventory;

    private Date closedate;

    private String groupid;

    private Date depositdate;

    private String expresstype;

    private String createoper;

    private Date createdate;

    private String drawbackflag;

    private Date shipmentdate;

    private Date arrivaldate;

    private Date finaldate;

    private BigDecimal shipmentmoney;

    private BigDecimal arrivalmoney;

    private BigDecimal finalmoney;

    private String urgent;

    private String moneynote;

    private String picture1;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private BigDecimal reserve6;

    private Date inporttime;

    private Date stocktime;

    private Long reserve9;

    private Long reserve10;

    private Long reserve11;

    private BigDecimal reserve12;

    private BigDecimal reserve13;

    private BigDecimal reserve14;

    private BigDecimal outerlength;

    private BigDecimal outerwidth;

    private BigDecimal outerhigh;

    private BigDecimal outervolume;

    private BigDecimal outergrossweight;

    private BigDecimal outernetweight;

    private String outernorms;

    private String outerlevel;

    private BigDecimal grossweight;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal high;

    private BigDecimal volume;

    private BigDecimal ordernum;

    private String manufacture;

    private String manufactureid;

    private String paymenttype;

    private BigDecimal inportprice;

    private BigDecimal amount;

    private BigDecimal weight;

    private BigDecimal developsid;

    private BigDecimal stockprice;

    private String quantities;

    private String picture2;

    private String picture3;

    private String picture4;

    private BigDecimal costprice;

    private BigDecimal seven;

    private BigDecimal thirty;

    private BigDecimal ninety;

    private String averagedailysales;

    private String oemno;

    private String productstatus;

    private BigDecimal savenum;

    private BigDecimal sellprice;

    private BigDecimal delay;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
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

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public Date getArrivedate() {
        return arrivedate;
    }

    public void setArrivedate(Date arrivedate) {
        this.arrivedate = arrivedate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getFollowupoper() {
        return followupoper;
    }

    public void setFollowupoper(String followupoper) {
        this.followupoper = followupoper == null ? null : followupoper.trim();
    }

    public String getPoorderflag() {
        return poorderflag;
    }

    public void setPoorderflag(String poorderflag) {
        this.poorderflag = poorderflag == null ? null : poorderflag.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public BigDecimal getAllmoney() {
        return allmoney;
    }

    public void setAllmoney(BigDecimal allmoney) {
        this.allmoney = allmoney;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getDollar() {
        return dollar;
    }

    public void setDollar(BigDecimal dollar) {
        this.dollar = dollar;
    }

    public String getPosure() {
        return posure;
    }

    public void setPosure(String posure) {
        this.posure = posure == null ? null : posure.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPhotoqcdate() {
        return photoqcdate;
    }

    public void setPhotoqcdate(Date photoqcdate) {
        this.photoqcdate = photoqcdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getSamplenum() {
        return samplenum;
    }

    public void setSamplenum(BigDecimal samplenum) {
        this.samplenum = samplenum;
    }

    public Date getSamplearrivedate() {
        return samplearrivedate;
    }

    public void setSamplearrivedate(Date samplearrivedate) {
        this.samplearrivedate = samplearrivedate;
    }

    public BigDecimal getFtcbm() {
        return ftcbm;
    }

    public void setFtcbm(BigDecimal ftcbm) {
        this.ftcbm = ftcbm;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Date getFinishorderdate() {
        return finishorderdate;
    }

    public void setFinishorderdate(Date finishorderdate) {
        this.finishorderdate = finishorderdate;
    }

    public Date getDrawbackdate() {
        return drawbackdate;
    }

    public void setDrawbackdate(Date drawbackdate) {
        this.drawbackdate = drawbackdate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getExpressdate() {
        return expressdate;
    }

    public void setExpressdate(Date expressdate) {
        this.expressdate = expressdate;
    }

    public String getCky() {
        return cky;
    }

    public void setCky(String cky) {
        this.cky = cky == null ? null : cky.trim();
    }

    public String getFpx() {
        return fpx;
    }

    public void setFpx(String fpx) {
        this.fpx = fpx == null ? null : fpx.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getPonum() {
        return ponum;
    }

    public void setPonum(String ponum) {
        this.ponum = ponum == null ? null : ponum.trim();
    }

    public Date getLoaddate() {
        return loaddate;
    }

    public void setLoaddate(Date loaddate) {
        this.loaddate = loaddate;
    }

    public Date getEtaharbourdate() {
        return etaharbourdate;
    }

    public void setEtaharbourdate(Date etaharbourdate) {
        this.etaharbourdate = etaharbourdate;
    }

    public Date getEtaarrivedate() {
        return etaarrivedate;
    }

    public void setEtaarrivedate(Date etaarrivedate) {
        this.etaarrivedate = etaarrivedate;
    }

    public Date getArrivestoredate() {
        return arrivestoredate;
    }

    public void setArrivestoredate(Date arrivestoredate) {
        this.arrivestoredate = arrivestoredate;
    }

    public String getContainernote() {
        return containernote;
    }

    public void setContainernote(String containernote) {
        this.containernote = containernote == null ? null : containernote.trim();
    }

    public Date getAugarnereddate() {
        return augarnereddate;
    }

    public void setAugarnereddate(Date augarnereddate) {
        this.augarnereddate = augarnereddate;
    }

    public String getPackinglist() {
        return packinglist;
    }

    public void setPackinglist(String packinglist) {
        this.packinglist = packinglist == null ? null : packinglist.trim();
    }

    public String getBilloflading() {
        return billoflading;
    }

    public void setBilloflading(String billoflading) {
        this.billoflading = billoflading == null ? null : billoflading.trim();
    }

    public String getShipmentupdateinventory() {
        return shipmentupdateinventory;
    }

    public void setShipmentupdateinventory(String shipmentupdateinventory) {
        this.shipmentupdateinventory = shipmentupdateinventory == null ? null : shipmentupdateinventory.trim();
    }

    public String getGarneredupdateinventory() {
        return garneredupdateinventory;
    }

    public void setGarneredupdateinventory(String garneredupdateinventory) {
        this.garneredupdateinventory = garneredupdateinventory == null ? null : garneredupdateinventory.trim();
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public Date getDepositdate() {
        return depositdate;
    }

    public void setDepositdate(Date depositdate) {
        this.depositdate = depositdate;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDrawbackflag() {
        return drawbackflag;
    }

    public void setDrawbackflag(String drawbackflag) {
        this.drawbackflag = drawbackflag == null ? null : drawbackflag.trim();
    }

    public Date getShipmentdate() {
        return shipmentdate;
    }

    public void setShipmentdate(Date shipmentdate) {
        this.shipmentdate = shipmentdate;
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Date getFinaldate() {
        return finaldate;
    }

    public void setFinaldate(Date finaldate) {
        this.finaldate = finaldate;
    }

    public BigDecimal getShipmentmoney() {
        return shipmentmoney;
    }

    public void setShipmentmoney(BigDecimal shipmentmoney) {
        this.shipmentmoney = shipmentmoney;
    }

    public BigDecimal getArrivalmoney() {
        return arrivalmoney;
    }

    public void setArrivalmoney(BigDecimal arrivalmoney) {
        this.arrivalmoney = arrivalmoney;
    }

    public BigDecimal getFinalmoney() {
        return finalmoney;
    }

    public void setFinalmoney(BigDecimal finalmoney) {
        this.finalmoney = finalmoney;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent == null ? null : urgent.trim();
    }

    public String getMoneynote() {
        return moneynote;
    }

    public void setMoneynote(String moneynote) {
        this.moneynote = moneynote == null ? null : moneynote.trim();
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
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

    public Date getInporttime() {
        return inporttime;
    }

    public void setInporttime(Date inporttime) {
        this.inporttime = inporttime;
    }

    public Date getStocktime() {
        return stocktime;
    }

    public void setStocktime(Date stocktime) {
        this.stocktime = stocktime;
    }

    public Long getReserve9() {
        return reserve9;
    }

    public void setReserve9(Long reserve9) {
        this.reserve9 = reserve9;
    }

    public Long getReserve10() {
        return reserve10;
    }

    public void setReserve10(Long reserve10) {
        this.reserve10 = reserve10;
    }

    public Long getReserve11() {
        return reserve11;
    }

    public void setReserve11(Long reserve11) {
        this.reserve11 = reserve11;
    }

    public BigDecimal getReserve12() {
        return reserve12;
    }

    public void setReserve12(BigDecimal reserve12) {
        this.reserve12 = reserve12;
    }

    public BigDecimal getReserve13() {
        return reserve13;
    }

    public void setReserve13(BigDecimal reserve13) {
        this.reserve13 = reserve13;
    }

    public BigDecimal getReserve14() {
        return reserve14;
    }

    public void setReserve14(BigDecimal reserve14) {
        this.reserve14 = reserve14;
    }

    public BigDecimal getOuterlength() {
        return outerlength;
    }

    public void setOuterlength(BigDecimal outerlength) {
        this.outerlength = outerlength;
    }

    public BigDecimal getOuterwidth() {
        return outerwidth;
    }

    public void setOuterwidth(BigDecimal outerwidth) {
        this.outerwidth = outerwidth;
    }

    public BigDecimal getOuterhigh() {
        return outerhigh;
    }

    public void setOuterhigh(BigDecimal outerhigh) {
        this.outerhigh = outerhigh;
    }

    public BigDecimal getOutervolume() {
        return outervolume;
    }

    public void setOutervolume(BigDecimal outervolume) {
        this.outervolume = outervolume;
    }

    public BigDecimal getOutergrossweight() {
        return outergrossweight;
    }

    public void setOutergrossweight(BigDecimal outergrossweight) {
        this.outergrossweight = outergrossweight;
    }

    public BigDecimal getOuternetweight() {
        return outernetweight;
    }

    public void setOuternetweight(BigDecimal outernetweight) {
        this.outernetweight = outernetweight;
    }

    public String getOuternorms() {
        return outernorms;
    }

    public void setOuternorms(String outernorms) {
        this.outernorms = outernorms == null ? null : outernorms.trim();
    }

    public String getOuterlevel() {
        return outerlevel;
    }

    public void setOuterlevel(String outerlevel) {
        this.outerlevel = outerlevel == null ? null : outerlevel.trim();
    }

    public BigDecimal getGrossweight() {
        return grossweight;
    }

    public void setGrossweight(BigDecimal grossweight) {
        this.grossweight = grossweight;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
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

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getDevelopsid() {
        return developsid;
    }

    public void setDevelopsid(BigDecimal developsid) {
        this.developsid = developsid;
    }

    public BigDecimal getStockprice() {
        return stockprice;
    }

    public void setStockprice(BigDecimal stockprice) {
        this.stockprice = stockprice;
    }

    public String getQuantities() {
        return quantities;
    }

    public void setQuantities(String quantities) {
        this.quantities = quantities == null ? null : quantities.trim();
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

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getSeven() {
        return seven;
    }

    public void setSeven(BigDecimal seven) {
        this.seven = seven;
    }

    public BigDecimal getThirty() {
        return thirty;
    }

    public void setThirty(BigDecimal thirty) {
        this.thirty = thirty;
    }

    public BigDecimal getNinety() {
        return ninety;
    }

    public void setNinety(BigDecimal ninety) {
        this.ninety = ninety;
    }

    public String getAveragedailysales() {
        return averagedailysales;
    }

    public void setAveragedailysales(String averagedailysales) {
        this.averagedailysales = averagedailysales == null ? null : averagedailysales.trim();
    }

    public String getOemno() {
        return oemno;
    }

    public void setOemno(String oemno) {
        this.oemno = oemno == null ? null : oemno.trim();
    }

    public String getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(String productstatus) {
        this.productstatus = productstatus == null ? null : productstatus.trim();
    }

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getDelay() {
        return delay;
    }

    public void setDelay(BigDecimal delay) {
        this.delay = delay;
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
        DbPurchaseflow other = (DbPurchaseflow) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getArrivedate() == null ? other.getArrivedate() == null : this.getArrivedate().equals(other.getArrivedate()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getFollowupoper() == null ? other.getFollowupoper() == null : this.getFollowupoper().equals(other.getFollowupoper()))
            && (this.getPoorderflag() == null ? other.getPoorderflag() == null : this.getPoorderflag().equals(other.getPoorderflag()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getAllmoney() == null ? other.getAllmoney() == null : this.getAllmoney().equals(other.getAllmoney()))
            && (this.getDeposit() == null ? other.getDeposit() == null : this.getDeposit().equals(other.getDeposit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDollar() == null ? other.getDollar() == null : this.getDollar().equals(other.getDollar()))
            && (this.getPosure() == null ? other.getPosure() == null : this.getPosure().equals(other.getPosure()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPhotoqcdate() == null ? other.getPhotoqcdate() == null : this.getPhotoqcdate().equals(other.getPhotoqcdate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getSamplenum() == null ? other.getSamplenum() == null : this.getSamplenum().equals(other.getSamplenum()))
            && (this.getSamplearrivedate() == null ? other.getSamplearrivedate() == null : this.getSamplearrivedate().equals(other.getSamplearrivedate()))
            && (this.getFtcbm() == null ? other.getFtcbm() == null : this.getFtcbm().equals(other.getFtcbm()))
            && (this.getDeliverydate() == null ? other.getDeliverydate() == null : this.getDeliverydate().equals(other.getDeliverydate()))
            && (this.getFinishorderdate() == null ? other.getFinishorderdate() == null : this.getFinishorderdate().equals(other.getFinishorderdate()))
            && (this.getDrawbackdate() == null ? other.getDrawbackdate() == null : this.getDrawbackdate().equals(other.getDrawbackdate()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getExpressdate() == null ? other.getExpressdate() == null : this.getExpressdate().equals(other.getExpressdate()))
            && (this.getCky() == null ? other.getCky() == null : this.getCky().equals(other.getCky()))
            && (this.getFpx() == null ? other.getFpx() == null : this.getFpx().equals(other.getFpx()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getPonum() == null ? other.getPonum() == null : this.getPonum().equals(other.getPonum()))
            && (this.getLoaddate() == null ? other.getLoaddate() == null : this.getLoaddate().equals(other.getLoaddate()))
            && (this.getEtaharbourdate() == null ? other.getEtaharbourdate() == null : this.getEtaharbourdate().equals(other.getEtaharbourdate()))
            && (this.getEtaarrivedate() == null ? other.getEtaarrivedate() == null : this.getEtaarrivedate().equals(other.getEtaarrivedate()))
            && (this.getArrivestoredate() == null ? other.getArrivestoredate() == null : this.getArrivestoredate().equals(other.getArrivestoredate()))
            && (this.getContainernote() == null ? other.getContainernote() == null : this.getContainernote().equals(other.getContainernote()))
            && (this.getAugarnereddate() == null ? other.getAugarnereddate() == null : this.getAugarnereddate().equals(other.getAugarnereddate()))
            && (this.getPackinglist() == null ? other.getPackinglist() == null : this.getPackinglist().equals(other.getPackinglist()))
            && (this.getBilloflading() == null ? other.getBilloflading() == null : this.getBilloflading().equals(other.getBilloflading()))
            && (this.getShipmentupdateinventory() == null ? other.getShipmentupdateinventory() == null : this.getShipmentupdateinventory().equals(other.getShipmentupdateinventory()))
            && (this.getGarneredupdateinventory() == null ? other.getGarneredupdateinventory() == null : this.getGarneredupdateinventory().equals(other.getGarneredupdateinventory()))
            && (this.getClosedate() == null ? other.getClosedate() == null : this.getClosedate().equals(other.getClosedate()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getDepositdate() == null ? other.getDepositdate() == null : this.getDepositdate().equals(other.getDepositdate()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getDrawbackflag() == null ? other.getDrawbackflag() == null : this.getDrawbackflag().equals(other.getDrawbackflag()))
            && (this.getShipmentdate() == null ? other.getShipmentdate() == null : this.getShipmentdate().equals(other.getShipmentdate()))
            && (this.getArrivaldate() == null ? other.getArrivaldate() == null : this.getArrivaldate().equals(other.getArrivaldate()))
            && (this.getFinaldate() == null ? other.getFinaldate() == null : this.getFinaldate().equals(other.getFinaldate()))
            && (this.getShipmentmoney() == null ? other.getShipmentmoney() == null : this.getShipmentmoney().equals(other.getShipmentmoney()))
            && (this.getArrivalmoney() == null ? other.getArrivalmoney() == null : this.getArrivalmoney().equals(other.getArrivalmoney()))
            && (this.getFinalmoney() == null ? other.getFinalmoney() == null : this.getFinalmoney().equals(other.getFinalmoney()))
            && (this.getUrgent() == null ? other.getUrgent() == null : this.getUrgent().equals(other.getUrgent()))
            && (this.getMoneynote() == null ? other.getMoneynote() == null : this.getMoneynote().equals(other.getMoneynote()))
            && (this.getPicture1() == null ? other.getPicture1() == null : this.getPicture1().equals(other.getPicture1()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getInporttime() == null ? other.getInporttime() == null : this.getInporttime().equals(other.getInporttime()))
            && (this.getStocktime() == null ? other.getStocktime() == null : this.getStocktime().equals(other.getStocktime()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getOuterlength() == null ? other.getOuterlength() == null : this.getOuterlength().equals(other.getOuterlength()))
            && (this.getOuterwidth() == null ? other.getOuterwidth() == null : this.getOuterwidth().equals(other.getOuterwidth()))
            && (this.getOuterhigh() == null ? other.getOuterhigh() == null : this.getOuterhigh().equals(other.getOuterhigh()))
            && (this.getOutervolume() == null ? other.getOutervolume() == null : this.getOutervolume().equals(other.getOutervolume()))
            && (this.getOutergrossweight() == null ? other.getOutergrossweight() == null : this.getOutergrossweight().equals(other.getOutergrossweight()))
            && (this.getOuternetweight() == null ? other.getOuternetweight() == null : this.getOuternetweight().equals(other.getOuternetweight()))
            && (this.getOuternorms() == null ? other.getOuternorms() == null : this.getOuternorms().equals(other.getOuternorms()))
            && (this.getOuterlevel() == null ? other.getOuterlevel() == null : this.getOuterlevel().equals(other.getOuterlevel()))
            && (this.getGrossweight() == null ? other.getGrossweight() == null : this.getGrossweight().equals(other.getGrossweight()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getPaymenttype() == null ? other.getPaymenttype() == null : this.getPaymenttype().equals(other.getPaymenttype()))
            && (this.getInportprice() == null ? other.getInportprice() == null : this.getInportprice().equals(other.getInportprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getDevelopsid() == null ? other.getDevelopsid() == null : this.getDevelopsid().equals(other.getDevelopsid()))
            && (this.getStockprice() == null ? other.getStockprice() == null : this.getStockprice().equals(other.getStockprice()))
            && (this.getQuantities() == null ? other.getQuantities() == null : this.getQuantities().equals(other.getQuantities()))
            && (this.getPicture2() == null ? other.getPicture2() == null : this.getPicture2().equals(other.getPicture2()))
            && (this.getPicture3() == null ? other.getPicture3() == null : this.getPicture3().equals(other.getPicture3()))
            && (this.getPicture4() == null ? other.getPicture4() == null : this.getPicture4().equals(other.getPicture4()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getSeven() == null ? other.getSeven() == null : this.getSeven().equals(other.getSeven()))
            && (this.getThirty() == null ? other.getThirty() == null : this.getThirty().equals(other.getThirty()))
            && (this.getNinety() == null ? other.getNinety() == null : this.getNinety().equals(other.getNinety()))
            && (this.getAveragedailysales() == null ? other.getAveragedailysales() == null : this.getAveragedailysales().equals(other.getAveragedailysales()))
            && (this.getOemno() == null ? other.getOemno() == null : this.getOemno().equals(other.getOemno()))
            && (this.getProductstatus() == null ? other.getProductstatus() == null : this.getProductstatus().equals(other.getProductstatus()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getDelay() == null ? other.getDelay() == null : this.getDelay().equals(other.getDelay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getArrivedate() == null) ? 0 : getArrivedate().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getFollowupoper() == null) ? 0 : getFollowupoper().hashCode());
        result = prime * result + ((getPoorderflag() == null) ? 0 : getPoorderflag().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getAllmoney() == null) ? 0 : getAllmoney().hashCode());
        result = prime * result + ((getDeposit() == null) ? 0 : getDeposit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDollar() == null) ? 0 : getDollar().hashCode());
        result = prime * result + ((getPosure() == null) ? 0 : getPosure().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPhotoqcdate() == null) ? 0 : getPhotoqcdate().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getSamplenum() == null) ? 0 : getSamplenum().hashCode());
        result = prime * result + ((getSamplearrivedate() == null) ? 0 : getSamplearrivedate().hashCode());
        result = prime * result + ((getFtcbm() == null) ? 0 : getFtcbm().hashCode());
        result = prime * result + ((getDeliverydate() == null) ? 0 : getDeliverydate().hashCode());
        result = prime * result + ((getFinishorderdate() == null) ? 0 : getFinishorderdate().hashCode());
        result = prime * result + ((getDrawbackdate() == null) ? 0 : getDrawbackdate().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getExpressdate() == null) ? 0 : getExpressdate().hashCode());
        result = prime * result + ((getCky() == null) ? 0 : getCky().hashCode());
        result = prime * result + ((getFpx() == null) ? 0 : getFpx().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getPonum() == null) ? 0 : getPonum().hashCode());
        result = prime * result + ((getLoaddate() == null) ? 0 : getLoaddate().hashCode());
        result = prime * result + ((getEtaharbourdate() == null) ? 0 : getEtaharbourdate().hashCode());
        result = prime * result + ((getEtaarrivedate() == null) ? 0 : getEtaarrivedate().hashCode());
        result = prime * result + ((getArrivestoredate() == null) ? 0 : getArrivestoredate().hashCode());
        result = prime * result + ((getContainernote() == null) ? 0 : getContainernote().hashCode());
        result = prime * result + ((getAugarnereddate() == null) ? 0 : getAugarnereddate().hashCode());
        result = prime * result + ((getPackinglist() == null) ? 0 : getPackinglist().hashCode());
        result = prime * result + ((getBilloflading() == null) ? 0 : getBilloflading().hashCode());
        result = prime * result + ((getShipmentupdateinventory() == null) ? 0 : getShipmentupdateinventory().hashCode());
        result = prime * result + ((getGarneredupdateinventory() == null) ? 0 : getGarneredupdateinventory().hashCode());
        result = prime * result + ((getClosedate() == null) ? 0 : getClosedate().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getDepositdate() == null) ? 0 : getDepositdate().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getDrawbackflag() == null) ? 0 : getDrawbackflag().hashCode());
        result = prime * result + ((getShipmentdate() == null) ? 0 : getShipmentdate().hashCode());
        result = prime * result + ((getArrivaldate() == null) ? 0 : getArrivaldate().hashCode());
        result = prime * result + ((getFinaldate() == null) ? 0 : getFinaldate().hashCode());
        result = prime * result + ((getShipmentmoney() == null) ? 0 : getShipmentmoney().hashCode());
        result = prime * result + ((getArrivalmoney() == null) ? 0 : getArrivalmoney().hashCode());
        result = prime * result + ((getFinalmoney() == null) ? 0 : getFinalmoney().hashCode());
        result = prime * result + ((getUrgent() == null) ? 0 : getUrgent().hashCode());
        result = prime * result + ((getMoneynote() == null) ? 0 : getMoneynote().hashCode());
        result = prime * result + ((getPicture1() == null) ? 0 : getPicture1().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getInporttime() == null) ? 0 : getInporttime().hashCode());
        result = prime * result + ((getStocktime() == null) ? 0 : getStocktime().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getOuterlength() == null) ? 0 : getOuterlength().hashCode());
        result = prime * result + ((getOuterwidth() == null) ? 0 : getOuterwidth().hashCode());
        result = prime * result + ((getOuterhigh() == null) ? 0 : getOuterhigh().hashCode());
        result = prime * result + ((getOutervolume() == null) ? 0 : getOutervolume().hashCode());
        result = prime * result + ((getOutergrossweight() == null) ? 0 : getOutergrossweight().hashCode());
        result = prime * result + ((getOuternetweight() == null) ? 0 : getOuternetweight().hashCode());
        result = prime * result + ((getOuternorms() == null) ? 0 : getOuternorms().hashCode());
        result = prime * result + ((getOuterlevel() == null) ? 0 : getOuterlevel().hashCode());
        result = prime * result + ((getGrossweight() == null) ? 0 : getGrossweight().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getPaymenttype() == null) ? 0 : getPaymenttype().hashCode());
        result = prime * result + ((getInportprice() == null) ? 0 : getInportprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getDevelopsid() == null) ? 0 : getDevelopsid().hashCode());
        result = prime * result + ((getStockprice() == null) ? 0 : getStockprice().hashCode());
        result = prime * result + ((getQuantities() == null) ? 0 : getQuantities().hashCode());
        result = prime * result + ((getPicture2() == null) ? 0 : getPicture2().hashCode());
        result = prime * result + ((getPicture3() == null) ? 0 : getPicture3().hashCode());
        result = prime * result + ((getPicture4() == null) ? 0 : getPicture4().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getSeven() == null) ? 0 : getSeven().hashCode());
        result = prime * result + ((getThirty() == null) ? 0 : getThirty().hashCode());
        result = prime * result + ((getNinety() == null) ? 0 : getNinety().hashCode());
        result = prime * result + ((getAveragedailysales() == null) ? 0 : getAveragedailysales().hashCode());
        result = prime * result + ((getOemno() == null) ? 0 : getOemno().hashCode());
        result = prime * result + ((getProductstatus() == null) ? 0 : getProductstatus().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getDelay() == null) ? 0 : getDelay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", oper=").append(oper);
        sb.append(", openflag=").append(openflag);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", arrivedate=").append(arrivedate);
        sb.append(", position=").append(position);
        sb.append(", followupoper=").append(followupoper);
        sb.append(", poorderflag=").append(poorderflag);
        sb.append(", company=").append(company);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", payment=").append(payment);
        sb.append(", allmoney=").append(allmoney);
        sb.append(", deposit=").append(deposit);
        sb.append(", status=").append(status);
        sb.append(", dollar=").append(dollar);
        sb.append(", posure=").append(posure);
        sb.append(", content=").append(content);
        sb.append(", photoqcdate=").append(photoqcdate);
        sb.append(", note=").append(note);
        sb.append(", samplenum=").append(samplenum);
        sb.append(", samplearrivedate=").append(samplearrivedate);
        sb.append(", ftcbm=").append(ftcbm);
        sb.append(", deliverydate=").append(deliverydate);
        sb.append(", finishorderdate=").append(finishorderdate);
        sb.append(", drawbackdate=").append(drawbackdate);
        sb.append(", city=").append(city);
        sb.append(", expressdate=").append(expressdate);
        sb.append(", cky=").append(cky);
        sb.append(", fpx=").append(fpx);
        sb.append(", expressid=").append(expressid);
        sb.append(", ponum=").append(ponum);
        sb.append(", loaddate=").append(loaddate);
        sb.append(", etaharbourdate=").append(etaharbourdate);
        sb.append(", etaarrivedate=").append(etaarrivedate);
        sb.append(", arrivestoredate=").append(arrivestoredate);
        sb.append(", containernote=").append(containernote);
        sb.append(", augarnereddate=").append(augarnereddate);
        sb.append(", packinglist=").append(packinglist);
        sb.append(", billoflading=").append(billoflading);
        sb.append(", shipmentupdateinventory=").append(shipmentupdateinventory);
        sb.append(", garneredupdateinventory=").append(garneredupdateinventory);
        sb.append(", closedate=").append(closedate);
        sb.append(", groupid=").append(groupid);
        sb.append(", depositdate=").append(depositdate);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", createoper=").append(createoper);
        sb.append(", createdate=").append(createdate);
        sb.append(", drawbackflag=").append(drawbackflag);
        sb.append(", shipmentdate=").append(shipmentdate);
        sb.append(", arrivaldate=").append(arrivaldate);
        sb.append(", finaldate=").append(finaldate);
        sb.append(", shipmentmoney=").append(shipmentmoney);
        sb.append(", arrivalmoney=").append(arrivalmoney);
        sb.append(", finalmoney=").append(finalmoney);
        sb.append(", urgent=").append(urgent);
        sb.append(", moneynote=").append(moneynote);
        sb.append(", picture1=").append(picture1);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", inporttime=").append(inporttime);
        sb.append(", stocktime=").append(stocktime);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", outerlength=").append(outerlength);
        sb.append(", outerwidth=").append(outerwidth);
        sb.append(", outerhigh=").append(outerhigh);
        sb.append(", outervolume=").append(outervolume);
        sb.append(", outergrossweight=").append(outergrossweight);
        sb.append(", outernetweight=").append(outernetweight);
        sb.append(", outernorms=").append(outernorms);
        sb.append(", outerlevel=").append(outerlevel);
        sb.append(", grossweight=").append(grossweight);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", high=").append(high);
        sb.append(", volume=").append(volume);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", paymenttype=").append(paymenttype);
        sb.append(", inportprice=").append(inportprice);
        sb.append(", amount=").append(amount);
        sb.append(", weight=").append(weight);
        sb.append(", developsid=").append(developsid);
        sb.append(", stockprice=").append(stockprice);
        sb.append(", quantities=").append(quantities);
        sb.append(", picture2=").append(picture2);
        sb.append(", picture3=").append(picture3);
        sb.append(", picture4=").append(picture4);
        sb.append(", costprice=").append(costprice);
        sb.append(", seven=").append(seven);
        sb.append(", thirty=").append(thirty);
        sb.append(", ninety=").append(ninety);
        sb.append(", averagedailysales=").append(averagedailysales);
        sb.append(", oemno=").append(oemno);
        sb.append(", productstatus=").append(productstatus);
        sb.append(", savenum=").append(savenum);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", delay=").append(delay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}