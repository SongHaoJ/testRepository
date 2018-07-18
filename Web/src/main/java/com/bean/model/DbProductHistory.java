package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductHistory implements Serializable {
    private BigDecimal sequenceid;

    private String productid;

    private BigDecimal histprofit;

    private BigDecimal profitt;

    private BigDecimal profits;

    private BigDecimal allordernum;

    private BigDecimal todayordernum;

    private BigDecimal onpassagepurchase;

    private BigDecimal ooslevel;

    private BigDecimal rateofpin;

    private BigDecimal savenum;

    private BigDecimal costprice;

    private BigDecimal alertday;

    private BigDecimal alertnum;

    private BigDecimal weight;

    private BigDecimal todaysavenum;

    private BigDecimal singledaysales;

    private BigDecimal dielibrarycoefficient;

    private BigDecimal todayoutsavenum;

    private BigDecimal minpurchasenum;

    private String locationid;

    private String location;

    private String storngid;

    private String strong;

    private String productname;

    private String oper1;

    private String oper2;

    private String oper3;

    private String oper4;

    private String oper5;

    private String menufunctoryid;

    private String menufunctory;

    private String status;

    private String corpid;

    private Date createtime;

    private BigDecimal histpavgrofit;

    private BigDecimal gstprice;

    private BigDecimal oceanshipprice;

    private BigDecimal fobprice;

    private BigDecimal cifprice;

    private BigDecimal expressprice;

    private BigDecimal profit;

    private BigDecimal bidprofit;

    private BigDecimal fixedprofit;

    private BigDecimal bidebayprice;

    private BigDecimal fixedebayprice;

    private BigDecimal bidnum;

    private BigDecimal storerent;

    private BigDecimal allpurchasenum;

    private BigDecimal manufacturequote;

    private BigDecimal tariffprice;

    private BigDecimal paypalprice;

    private String aliasku;

    private BigDecimal volume;

    private String sizes;

    private BigDecimal sellprice;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal high;

    private BigDecimal sales7;

    private BigDecimal sales30;

    private BigDecimal sales90;

    private String outerlevel;

    private BigDecimal dhnumber;

    private String mainsku;

    private BigDecimal ebayprice;

    private BigDecimal bidavgprice;

    private BigDecimal bidturnoverrate;

    private BigDecimal bidtotalprice;

    private BigDecimal bid7day;

    private BigDecimal bid30day;

    private BigDecimal bid60day;

    private String note1;

    private String note2;

    private String note3;

    private String note4;

    private String note5;

    private String note6;

    private String note7;

    private BigDecimal bidprice;

    private BigDecimal bargainrate;

    private String advertisement;

    private Date opertime;

    private String oper;

    private Date updatetime;

    private BigDecimal tocolsort;

    private BigDecimal tocollong;

    private BigDecimal fixprofit;

    private BigDecimal post;

    private BigDecimal paypalbidfee;

    private BigDecimal paypalfixfee;

    private BigDecimal ebaybidfee;

    private BigDecimal ebayfixfee;

    private Date onlinetime;

    private String sellnumdescrby7d;

    private String sellnumdescrby7c;

    private String sellnumdescrby7b;

    private String sellnumdescrby7a;

    private BigDecimal sellnumby7d;

    private BigDecimal sellnumby7c;

    private BigDecimal sellnumby7b;

    private BigDecimal sellnumby7a;

    private BigDecimal sellthrough;

    private BigDecimal clickthrough;

    private BigDecimal impressions;

    private BigDecimal todayoedernum;

    private BigDecimal monthbidnum;

    private BigDecimal oldordernum;

    private BigDecimal sixdaysales;

    private BigDecimal ndaysales;

    private String manufacture;

    private String manufactureid;

    private String category;

    private String categoryid;

    private BigDecimal purprice;

    private BigDecimal profitpercent;

    private BigDecimal fixprice;

    private BigDecimal savenumcbm;

    private BigDecimal savenumcif;

    private BigDecimal needorder;

    private BigDecimal monthsavenum;

    private BigDecimal productionnumday;

    private BigDecimal productionnum;

    private BigDecimal allotnumday;

    private BigDecimal allotnum;

    private BigDecimal purchasenumday;

    private BigDecimal purchasenum;

    private BigDecimal savenumday;

    private BigDecimal allsavenumday;

    private BigDecimal allsavenum;

    private String selloper;

    private BigDecimal dailymeansales;

    private String puroper;

    private BigDecimal historysavenum;

    private BigDecimal historycifprice;

    private BigDecimal historyprofitamount;

    private BigDecimal classprofit;

    private BigDecimal productcontributions;

    private String monthlyprofitabc;

    private String fprofitabc;

    private BigDecimal turnoverday;

    private BigDecimal monthprofits;

    private BigDecimal refundrate;

    private BigDecimal monthclassprofit;

    private BigDecimal changeamount;

    private BigDecimal literratio;

    private BigDecimal classcontributionratio;

    private BigDecimal monthrefundrate;

    private BigDecimal historyavgprofitratio;

    private BigDecimal historyavgprofit;

    private BigDecimal historynetprofitamount;

    private BigDecimal volumeweight;

    private BigDecimal gst;

    private BigDecimal tariff;

    private BigDecimal savenumstatus;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public BigDecimal getHistprofit() {
        return histprofit;
    }

    public void setHistprofit(BigDecimal histprofit) {
        this.histprofit = histprofit;
    }

    public BigDecimal getProfitt() {
        return profitt;
    }

    public void setProfitt(BigDecimal profitt) {
        this.profitt = profitt;
    }

    public BigDecimal getProfits() {
        return profits;
    }

    public void setProfits(BigDecimal profits) {
        this.profits = profits;
    }

    public BigDecimal getAllordernum() {
        return allordernum;
    }

    public void setAllordernum(BigDecimal allordernum) {
        this.allordernum = allordernum;
    }

    public BigDecimal getTodayordernum() {
        return todayordernum;
    }

    public void setTodayordernum(BigDecimal todayordernum) {
        this.todayordernum = todayordernum;
    }

    public BigDecimal getOnpassagepurchase() {
        return onpassagepurchase;
    }

    public void setOnpassagepurchase(BigDecimal onpassagepurchase) {
        this.onpassagepurchase = onpassagepurchase;
    }

    public BigDecimal getOoslevel() {
        return ooslevel;
    }

    public void setOoslevel(BigDecimal ooslevel) {
        this.ooslevel = ooslevel;
    }

    public BigDecimal getRateofpin() {
        return rateofpin;
    }

    public void setRateofpin(BigDecimal rateofpin) {
        this.rateofpin = rateofpin;
    }

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getAlertday() {
        return alertday;
    }

    public void setAlertday(BigDecimal alertday) {
        this.alertday = alertday;
    }

    public BigDecimal getAlertnum() {
        return alertnum;
    }

    public void setAlertnum(BigDecimal alertnum) {
        this.alertnum = alertnum;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getTodaysavenum() {
        return todaysavenum;
    }

    public void setTodaysavenum(BigDecimal todaysavenum) {
        this.todaysavenum = todaysavenum;
    }

    public BigDecimal getSingledaysales() {
        return singledaysales;
    }

    public void setSingledaysales(BigDecimal singledaysales) {
        this.singledaysales = singledaysales;
    }

    public BigDecimal getDielibrarycoefficient() {
        return dielibrarycoefficient;
    }

    public void setDielibrarycoefficient(BigDecimal dielibrarycoefficient) {
        this.dielibrarycoefficient = dielibrarycoefficient;
    }

    public BigDecimal getTodayoutsavenum() {
        return todayoutsavenum;
    }

    public void setTodayoutsavenum(BigDecimal todayoutsavenum) {
        this.todayoutsavenum = todayoutsavenum;
    }

    public BigDecimal getMinpurchasenum() {
        return minpurchasenum;
    }

    public void setMinpurchasenum(BigDecimal minpurchasenum) {
        this.minpurchasenum = minpurchasenum;
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

    public String getStorngid() {
        return storngid;
    }

    public void setStorngid(String storngid) {
        this.storngid = storngid == null ? null : storngid.trim();
    }

    public String getStrong() {
        return strong;
    }

    public void setStrong(String strong) {
        this.strong = strong == null ? null : strong.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
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

    public String getMenufunctoryid() {
        return menufunctoryid;
    }

    public void setMenufunctoryid(String menufunctoryid) {
        this.menufunctoryid = menufunctoryid == null ? null : menufunctoryid.trim();
    }

    public String getMenufunctory() {
        return menufunctory;
    }

    public void setMenufunctory(String menufunctory) {
        this.menufunctory = menufunctory == null ? null : menufunctory.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getHistpavgrofit() {
        return histpavgrofit;
    }

    public void setHistpavgrofit(BigDecimal histpavgrofit) {
        this.histpavgrofit = histpavgrofit;
    }

    public BigDecimal getGstprice() {
        return gstprice;
    }

    public void setGstprice(BigDecimal gstprice) {
        this.gstprice = gstprice;
    }

    public BigDecimal getOceanshipprice() {
        return oceanshipprice;
    }

    public void setOceanshipprice(BigDecimal oceanshipprice) {
        this.oceanshipprice = oceanshipprice;
    }

    public BigDecimal getFobprice() {
        return fobprice;
    }

    public void setFobprice(BigDecimal fobprice) {
        this.fobprice = fobprice;
    }

    public BigDecimal getCifprice() {
        return cifprice;
    }

    public void setCifprice(BigDecimal cifprice) {
        this.cifprice = cifprice;
    }

    public BigDecimal getExpressprice() {
        return expressprice;
    }

    public void setExpressprice(BigDecimal expressprice) {
        this.expressprice = expressprice;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getBidprofit() {
        return bidprofit;
    }

    public void setBidprofit(BigDecimal bidprofit) {
        this.bidprofit = bidprofit;
    }

    public BigDecimal getFixedprofit() {
        return fixedprofit;
    }

    public void setFixedprofit(BigDecimal fixedprofit) {
        this.fixedprofit = fixedprofit;
    }

    public BigDecimal getBidebayprice() {
        return bidebayprice;
    }

    public void setBidebayprice(BigDecimal bidebayprice) {
        this.bidebayprice = bidebayprice;
    }

    public BigDecimal getFixedebayprice() {
        return fixedebayprice;
    }

    public void setFixedebayprice(BigDecimal fixedebayprice) {
        this.fixedebayprice = fixedebayprice;
    }

    public BigDecimal getBidnum() {
        return bidnum;
    }

    public void setBidnum(BigDecimal bidnum) {
        this.bidnum = bidnum;
    }

    public BigDecimal getStorerent() {
        return storerent;
    }

    public void setStorerent(BigDecimal storerent) {
        this.storerent = storerent;
    }

    public BigDecimal getAllpurchasenum() {
        return allpurchasenum;
    }

    public void setAllpurchasenum(BigDecimal allpurchasenum) {
        this.allpurchasenum = allpurchasenum;
    }

    public BigDecimal getManufacturequote() {
        return manufacturequote;
    }

    public void setManufacturequote(BigDecimal manufacturequote) {
        this.manufacturequote = manufacturequote;
    }

    public BigDecimal getTariffprice() {
        return tariffprice;
    }

    public void setTariffprice(BigDecimal tariffprice) {
        this.tariffprice = tariffprice;
    }

    public BigDecimal getPaypalprice() {
        return paypalprice;
    }

    public void setPaypalprice(BigDecimal paypalprice) {
        this.paypalprice = paypalprice;
    }

    public String getAliasku() {
        return aliasku;
    }

    public void setAliasku(String aliasku) {
        this.aliasku = aliasku == null ? null : aliasku.trim();
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes == null ? null : sizes.trim();
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
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

    public BigDecimal getSales7() {
        return sales7;
    }

    public void setSales7(BigDecimal sales7) {
        this.sales7 = sales7;
    }

    public BigDecimal getSales30() {
        return sales30;
    }

    public void setSales30(BigDecimal sales30) {
        this.sales30 = sales30;
    }

    public BigDecimal getSales90() {
        return sales90;
    }

    public void setSales90(BigDecimal sales90) {
        this.sales90 = sales90;
    }

    public String getOuterlevel() {
        return outerlevel;
    }

    public void setOuterlevel(String outerlevel) {
        this.outerlevel = outerlevel == null ? null : outerlevel.trim();
    }

    public BigDecimal getDhnumber() {
        return dhnumber;
    }

    public void setDhnumber(BigDecimal dhnumber) {
        this.dhnumber = dhnumber;
    }

    public String getMainsku() {
        return mainsku;
    }

    public void setMainsku(String mainsku) {
        this.mainsku = mainsku == null ? null : mainsku.trim();
    }

    public BigDecimal getEbayprice() {
        return ebayprice;
    }

    public void setEbayprice(BigDecimal ebayprice) {
        this.ebayprice = ebayprice;
    }

    public BigDecimal getBidavgprice() {
        return bidavgprice;
    }

    public void setBidavgprice(BigDecimal bidavgprice) {
        this.bidavgprice = bidavgprice;
    }

    public BigDecimal getBidturnoverrate() {
        return bidturnoverrate;
    }

    public void setBidturnoverrate(BigDecimal bidturnoverrate) {
        this.bidturnoverrate = bidturnoverrate;
    }

    public BigDecimal getBidtotalprice() {
        return bidtotalprice;
    }

    public void setBidtotalprice(BigDecimal bidtotalprice) {
        this.bidtotalprice = bidtotalprice;
    }

    public BigDecimal getBid7day() {
        return bid7day;
    }

    public void setBid7day(BigDecimal bid7day) {
        this.bid7day = bid7day;
    }

    public BigDecimal getBid30day() {
        return bid30day;
    }

    public void setBid30day(BigDecimal bid30day) {
        this.bid30day = bid30day;
    }

    public BigDecimal getBid60day() {
        return bid60day;
    }

    public void setBid60day(BigDecimal bid60day) {
        this.bid60day = bid60day;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3 == null ? null : note3.trim();
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4 == null ? null : note4.trim();
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5 == null ? null : note5.trim();
    }

    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6 == null ? null : note6.trim();
    }

    public String getNote7() {
        return note7;
    }

    public void setNote7(String note7) {
        this.note7 = note7 == null ? null : note7.trim();
    }

    public BigDecimal getBidprice() {
        return bidprice;
    }

    public void setBidprice(BigDecimal bidprice) {
        this.bidprice = bidprice;
    }

    public BigDecimal getBargainrate() {
        return bargainrate;
    }

    public void setBargainrate(BigDecimal bargainrate) {
        this.bargainrate = bargainrate;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement == null ? null : advertisement.trim();
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getTocolsort() {
        return tocolsort;
    }

    public void setTocolsort(BigDecimal tocolsort) {
        this.tocolsort = tocolsort;
    }

    public BigDecimal getTocollong() {
        return tocollong;
    }

    public void setTocollong(BigDecimal tocollong) {
        this.tocollong = tocollong;
    }

    public BigDecimal getFixprofit() {
        return fixprofit;
    }

    public void setFixprofit(BigDecimal fixprofit) {
        this.fixprofit = fixprofit;
    }

    public BigDecimal getPost() {
        return post;
    }

    public void setPost(BigDecimal post) {
        this.post = post;
    }

    public BigDecimal getPaypalbidfee() {
        return paypalbidfee;
    }

    public void setPaypalbidfee(BigDecimal paypalbidfee) {
        this.paypalbidfee = paypalbidfee;
    }

    public BigDecimal getPaypalfixfee() {
        return paypalfixfee;
    }

    public void setPaypalfixfee(BigDecimal paypalfixfee) {
        this.paypalfixfee = paypalfixfee;
    }

    public BigDecimal getEbaybidfee() {
        return ebaybidfee;
    }

    public void setEbaybidfee(BigDecimal ebaybidfee) {
        this.ebaybidfee = ebaybidfee;
    }

    public BigDecimal getEbayfixfee() {
        return ebayfixfee;
    }

    public void setEbayfixfee(BigDecimal ebayfixfee) {
        this.ebayfixfee = ebayfixfee;
    }

    public Date getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Date onlinetime) {
        this.onlinetime = onlinetime;
    }

    public String getSellnumdescrby7d() {
        return sellnumdescrby7d;
    }

    public void setSellnumdescrby7d(String sellnumdescrby7d) {
        this.sellnumdescrby7d = sellnumdescrby7d == null ? null : sellnumdescrby7d.trim();
    }

    public String getSellnumdescrby7c() {
        return sellnumdescrby7c;
    }

    public void setSellnumdescrby7c(String sellnumdescrby7c) {
        this.sellnumdescrby7c = sellnumdescrby7c == null ? null : sellnumdescrby7c.trim();
    }

    public String getSellnumdescrby7b() {
        return sellnumdescrby7b;
    }

    public void setSellnumdescrby7b(String sellnumdescrby7b) {
        this.sellnumdescrby7b = sellnumdescrby7b == null ? null : sellnumdescrby7b.trim();
    }

    public String getSellnumdescrby7a() {
        return sellnumdescrby7a;
    }

    public void setSellnumdescrby7a(String sellnumdescrby7a) {
        this.sellnumdescrby7a = sellnumdescrby7a == null ? null : sellnumdescrby7a.trim();
    }

    public BigDecimal getSellnumby7d() {
        return sellnumby7d;
    }

    public void setSellnumby7d(BigDecimal sellnumby7d) {
        this.sellnumby7d = sellnumby7d;
    }

    public BigDecimal getSellnumby7c() {
        return sellnumby7c;
    }

    public void setSellnumby7c(BigDecimal sellnumby7c) {
        this.sellnumby7c = sellnumby7c;
    }

    public BigDecimal getSellnumby7b() {
        return sellnumby7b;
    }

    public void setSellnumby7b(BigDecimal sellnumby7b) {
        this.sellnumby7b = sellnumby7b;
    }

    public BigDecimal getSellnumby7a() {
        return sellnumby7a;
    }

    public void setSellnumby7a(BigDecimal sellnumby7a) {
        this.sellnumby7a = sellnumby7a;
    }

    public BigDecimal getSellthrough() {
        return sellthrough;
    }

    public void setSellthrough(BigDecimal sellthrough) {
        this.sellthrough = sellthrough;
    }

    public BigDecimal getClickthrough() {
        return clickthrough;
    }

    public void setClickthrough(BigDecimal clickthrough) {
        this.clickthrough = clickthrough;
    }

    public BigDecimal getImpressions() {
        return impressions;
    }

    public void setImpressions(BigDecimal impressions) {
        this.impressions = impressions;
    }

    public BigDecimal getTodayoedernum() {
        return todayoedernum;
    }

    public void setTodayoedernum(BigDecimal todayoedernum) {
        this.todayoedernum = todayoedernum;
    }

    public BigDecimal getMonthbidnum() {
        return monthbidnum;
    }

    public void setMonthbidnum(BigDecimal monthbidnum) {
        this.monthbidnum = monthbidnum;
    }

    public BigDecimal getOldordernum() {
        return oldordernum;
    }

    public void setOldordernum(BigDecimal oldordernum) {
        this.oldordernum = oldordernum;
    }

    public BigDecimal getSixdaysales() {
        return sixdaysales;
    }

    public void setSixdaysales(BigDecimal sixdaysales) {
        this.sixdaysales = sixdaysales;
    }

    public BigDecimal getNdaysales() {
        return ndaysales;
    }

    public void setNdaysales(BigDecimal ndaysales) {
        this.ndaysales = ndaysales;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public BigDecimal getPurprice() {
        return purprice;
    }

    public void setPurprice(BigDecimal purprice) {
        this.purprice = purprice;
    }

    public BigDecimal getProfitpercent() {
        return profitpercent;
    }

    public void setProfitpercent(BigDecimal profitpercent) {
        this.profitpercent = profitpercent;
    }

    public BigDecimal getFixprice() {
        return fixprice;
    }

    public void setFixprice(BigDecimal fixprice) {
        this.fixprice = fixprice;
    }

    public BigDecimal getSavenumcbm() {
        return savenumcbm;
    }

    public void setSavenumcbm(BigDecimal savenumcbm) {
        this.savenumcbm = savenumcbm;
    }

    public BigDecimal getSavenumcif() {
        return savenumcif;
    }

    public void setSavenumcif(BigDecimal savenumcif) {
        this.savenumcif = savenumcif;
    }

    public BigDecimal getNeedorder() {
        return needorder;
    }

    public void setNeedorder(BigDecimal needorder) {
        this.needorder = needorder;
    }

    public BigDecimal getMonthsavenum() {
        return monthsavenum;
    }

    public void setMonthsavenum(BigDecimal monthsavenum) {
        this.monthsavenum = monthsavenum;
    }

    public BigDecimal getProductionnumday() {
        return productionnumday;
    }

    public void setProductionnumday(BigDecimal productionnumday) {
        this.productionnumday = productionnumday;
    }

    public BigDecimal getProductionnum() {
        return productionnum;
    }

    public void setProductionnum(BigDecimal productionnum) {
        this.productionnum = productionnum;
    }

    public BigDecimal getAllotnumday() {
        return allotnumday;
    }

    public void setAllotnumday(BigDecimal allotnumday) {
        this.allotnumday = allotnumday;
    }

    public BigDecimal getAllotnum() {
        return allotnum;
    }

    public void setAllotnum(BigDecimal allotnum) {
        this.allotnum = allotnum;
    }

    public BigDecimal getPurchasenumday() {
        return purchasenumday;
    }

    public void setPurchasenumday(BigDecimal purchasenumday) {
        this.purchasenumday = purchasenumday;
    }

    public BigDecimal getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(BigDecimal purchasenum) {
        this.purchasenum = purchasenum;
    }

    public BigDecimal getSavenumday() {
        return savenumday;
    }

    public void setSavenumday(BigDecimal savenumday) {
        this.savenumday = savenumday;
    }

    public BigDecimal getAllsavenumday() {
        return allsavenumday;
    }

    public void setAllsavenumday(BigDecimal allsavenumday) {
        this.allsavenumday = allsavenumday;
    }

    public BigDecimal getAllsavenum() {
        return allsavenum;
    }

    public void setAllsavenum(BigDecimal allsavenum) {
        this.allsavenum = allsavenum;
    }

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public BigDecimal getDailymeansales() {
        return dailymeansales;
    }

    public void setDailymeansales(BigDecimal dailymeansales) {
        this.dailymeansales = dailymeansales;
    }

    public String getPuroper() {
        return puroper;
    }

    public void setPuroper(String puroper) {
        this.puroper = puroper == null ? null : puroper.trim();
    }

    public BigDecimal getHistorysavenum() {
        return historysavenum;
    }

    public void setHistorysavenum(BigDecimal historysavenum) {
        this.historysavenum = historysavenum;
    }

    public BigDecimal getHistorycifprice() {
        return historycifprice;
    }

    public void setHistorycifprice(BigDecimal historycifprice) {
        this.historycifprice = historycifprice;
    }

    public BigDecimal getHistoryprofitamount() {
        return historyprofitamount;
    }

    public void setHistoryprofitamount(BigDecimal historyprofitamount) {
        this.historyprofitamount = historyprofitamount;
    }

    public BigDecimal getClassprofit() {
        return classprofit;
    }

    public void setClassprofit(BigDecimal classprofit) {
        this.classprofit = classprofit;
    }

    public BigDecimal getProductcontributions() {
        return productcontributions;
    }

    public void setProductcontributions(BigDecimal productcontributions) {
        this.productcontributions = productcontributions;
    }

    public String getMonthlyprofitabc() {
        return monthlyprofitabc;
    }

    public void setMonthlyprofitabc(String monthlyprofitabc) {
        this.monthlyprofitabc = monthlyprofitabc == null ? null : monthlyprofitabc.trim();
    }

    public String getFprofitabc() {
        return fprofitabc;
    }

    public void setFprofitabc(String fprofitabc) {
        this.fprofitabc = fprofitabc == null ? null : fprofitabc.trim();
    }

    public BigDecimal getTurnoverday() {
        return turnoverday;
    }

    public void setTurnoverday(BigDecimal turnoverday) {
        this.turnoverday = turnoverday;
    }

    public BigDecimal getMonthprofits() {
        return monthprofits;
    }

    public void setMonthprofits(BigDecimal monthprofits) {
        this.monthprofits = monthprofits;
    }

    public BigDecimal getRefundrate() {
        return refundrate;
    }

    public void setRefundrate(BigDecimal refundrate) {
        this.refundrate = refundrate;
    }

    public BigDecimal getMonthclassprofit() {
        return monthclassprofit;
    }

    public void setMonthclassprofit(BigDecimal monthclassprofit) {
        this.monthclassprofit = monthclassprofit;
    }

    public BigDecimal getChangeamount() {
        return changeamount;
    }

    public void setChangeamount(BigDecimal changeamount) {
        this.changeamount = changeamount;
    }

    public BigDecimal getLiterratio() {
        return literratio;
    }

    public void setLiterratio(BigDecimal literratio) {
        this.literratio = literratio;
    }

    public BigDecimal getClasscontributionratio() {
        return classcontributionratio;
    }

    public void setClasscontributionratio(BigDecimal classcontributionratio) {
        this.classcontributionratio = classcontributionratio;
    }

    public BigDecimal getMonthrefundrate() {
        return monthrefundrate;
    }

    public void setMonthrefundrate(BigDecimal monthrefundrate) {
        this.monthrefundrate = monthrefundrate;
    }

    public BigDecimal getHistoryavgprofitratio() {
        return historyavgprofitratio;
    }

    public void setHistoryavgprofitratio(BigDecimal historyavgprofitratio) {
        this.historyavgprofitratio = historyavgprofitratio;
    }

    public BigDecimal getHistoryavgprofit() {
        return historyavgprofit;
    }

    public void setHistoryavgprofit(BigDecimal historyavgprofit) {
        this.historyavgprofit = historyavgprofit;
    }

    public BigDecimal getHistorynetprofitamount() {
        return historynetprofitamount;
    }

    public void setHistorynetprofitamount(BigDecimal historynetprofitamount) {
        this.historynetprofitamount = historynetprofitamount;
    }

    public BigDecimal getVolumeweight() {
        return volumeweight;
    }

    public void setVolumeweight(BigDecimal volumeweight) {
        this.volumeweight = volumeweight;
    }

    public BigDecimal getGst() {
        return gst;
    }

    public void setGst(BigDecimal gst) {
        this.gst = gst;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getSavenumstatus() {
        return savenumstatus;
    }

    public void setSavenumstatus(BigDecimal savenumstatus) {
        this.savenumstatus = savenumstatus;
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
        DbProductHistory other = (DbProductHistory) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getHistprofit() == null ? other.getHistprofit() == null : this.getHistprofit().equals(other.getHistprofit()))
            && (this.getProfitt() == null ? other.getProfitt() == null : this.getProfitt().equals(other.getProfitt()))
            && (this.getProfits() == null ? other.getProfits() == null : this.getProfits().equals(other.getProfits()))
            && (this.getAllordernum() == null ? other.getAllordernum() == null : this.getAllordernum().equals(other.getAllordernum()))
            && (this.getTodayordernum() == null ? other.getTodayordernum() == null : this.getTodayordernum().equals(other.getTodayordernum()))
            && (this.getOnpassagepurchase() == null ? other.getOnpassagepurchase() == null : this.getOnpassagepurchase().equals(other.getOnpassagepurchase()))
            && (this.getOoslevel() == null ? other.getOoslevel() == null : this.getOoslevel().equals(other.getOoslevel()))
            && (this.getRateofpin() == null ? other.getRateofpin() == null : this.getRateofpin().equals(other.getRateofpin()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getAlertday() == null ? other.getAlertday() == null : this.getAlertday().equals(other.getAlertday()))
            && (this.getAlertnum() == null ? other.getAlertnum() == null : this.getAlertnum().equals(other.getAlertnum()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getTodaysavenum() == null ? other.getTodaysavenum() == null : this.getTodaysavenum().equals(other.getTodaysavenum()))
            && (this.getSingledaysales() == null ? other.getSingledaysales() == null : this.getSingledaysales().equals(other.getSingledaysales()))
            && (this.getDielibrarycoefficient() == null ? other.getDielibrarycoefficient() == null : this.getDielibrarycoefficient().equals(other.getDielibrarycoefficient()))
            && (this.getTodayoutsavenum() == null ? other.getTodayoutsavenum() == null : this.getTodayoutsavenum().equals(other.getTodayoutsavenum()))
            && (this.getMinpurchasenum() == null ? other.getMinpurchasenum() == null : this.getMinpurchasenum().equals(other.getMinpurchasenum()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getStorngid() == null ? other.getStorngid() == null : this.getStorngid().equals(other.getStorngid()))
            && (this.getStrong() == null ? other.getStrong() == null : this.getStrong().equals(other.getStrong()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getOper3() == null ? other.getOper3() == null : this.getOper3().equals(other.getOper3()))
            && (this.getOper4() == null ? other.getOper4() == null : this.getOper4().equals(other.getOper4()))
            && (this.getOper5() == null ? other.getOper5() == null : this.getOper5().equals(other.getOper5()))
            && (this.getMenufunctoryid() == null ? other.getMenufunctoryid() == null : this.getMenufunctoryid().equals(other.getMenufunctoryid()))
            && (this.getMenufunctory() == null ? other.getMenufunctory() == null : this.getMenufunctory().equals(other.getMenufunctory()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getHistpavgrofit() == null ? other.getHistpavgrofit() == null : this.getHistpavgrofit().equals(other.getHistpavgrofit()))
            && (this.getGstprice() == null ? other.getGstprice() == null : this.getGstprice().equals(other.getGstprice()))
            && (this.getOceanshipprice() == null ? other.getOceanshipprice() == null : this.getOceanshipprice().equals(other.getOceanshipprice()))
            && (this.getFobprice() == null ? other.getFobprice() == null : this.getFobprice().equals(other.getFobprice()))
            && (this.getCifprice() == null ? other.getCifprice() == null : this.getCifprice().equals(other.getCifprice()))
            && (this.getExpressprice() == null ? other.getExpressprice() == null : this.getExpressprice().equals(other.getExpressprice()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getBidprofit() == null ? other.getBidprofit() == null : this.getBidprofit().equals(other.getBidprofit()))
            && (this.getFixedprofit() == null ? other.getFixedprofit() == null : this.getFixedprofit().equals(other.getFixedprofit()))
            && (this.getBidebayprice() == null ? other.getBidebayprice() == null : this.getBidebayprice().equals(other.getBidebayprice()))
            && (this.getFixedebayprice() == null ? other.getFixedebayprice() == null : this.getFixedebayprice().equals(other.getFixedebayprice()))
            && (this.getBidnum() == null ? other.getBidnum() == null : this.getBidnum().equals(other.getBidnum()))
            && (this.getStorerent() == null ? other.getStorerent() == null : this.getStorerent().equals(other.getStorerent()))
            && (this.getAllpurchasenum() == null ? other.getAllpurchasenum() == null : this.getAllpurchasenum().equals(other.getAllpurchasenum()))
            && (this.getManufacturequote() == null ? other.getManufacturequote() == null : this.getManufacturequote().equals(other.getManufacturequote()))
            && (this.getTariffprice() == null ? other.getTariffprice() == null : this.getTariffprice().equals(other.getTariffprice()))
            && (this.getPaypalprice() == null ? other.getPaypalprice() == null : this.getPaypalprice().equals(other.getPaypalprice()))
            && (this.getAliasku() == null ? other.getAliasku() == null : this.getAliasku().equals(other.getAliasku()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getSizes() == null ? other.getSizes() == null : this.getSizes().equals(other.getSizes()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getSales7() == null ? other.getSales7() == null : this.getSales7().equals(other.getSales7()))
            && (this.getSales30() == null ? other.getSales30() == null : this.getSales30().equals(other.getSales30()))
            && (this.getSales90() == null ? other.getSales90() == null : this.getSales90().equals(other.getSales90()))
            && (this.getOuterlevel() == null ? other.getOuterlevel() == null : this.getOuterlevel().equals(other.getOuterlevel()))
            && (this.getDhnumber() == null ? other.getDhnumber() == null : this.getDhnumber().equals(other.getDhnumber()))
            && (this.getMainsku() == null ? other.getMainsku() == null : this.getMainsku().equals(other.getMainsku()))
            && (this.getEbayprice() == null ? other.getEbayprice() == null : this.getEbayprice().equals(other.getEbayprice()))
            && (this.getBidavgprice() == null ? other.getBidavgprice() == null : this.getBidavgprice().equals(other.getBidavgprice()))
            && (this.getBidturnoverrate() == null ? other.getBidturnoverrate() == null : this.getBidturnoverrate().equals(other.getBidturnoverrate()))
            && (this.getBidtotalprice() == null ? other.getBidtotalprice() == null : this.getBidtotalprice().equals(other.getBidtotalprice()))
            && (this.getBid7day() == null ? other.getBid7day() == null : this.getBid7day().equals(other.getBid7day()))
            && (this.getBid30day() == null ? other.getBid30day() == null : this.getBid30day().equals(other.getBid30day()))
            && (this.getBid60day() == null ? other.getBid60day() == null : this.getBid60day().equals(other.getBid60day()))
            && (this.getNote1() == null ? other.getNote1() == null : this.getNote1().equals(other.getNote1()))
            && (this.getNote2() == null ? other.getNote2() == null : this.getNote2().equals(other.getNote2()))
            && (this.getNote3() == null ? other.getNote3() == null : this.getNote3().equals(other.getNote3()))
            && (this.getNote4() == null ? other.getNote4() == null : this.getNote4().equals(other.getNote4()))
            && (this.getNote5() == null ? other.getNote5() == null : this.getNote5().equals(other.getNote5()))
            && (this.getNote6() == null ? other.getNote6() == null : this.getNote6().equals(other.getNote6()))
            && (this.getNote7() == null ? other.getNote7() == null : this.getNote7().equals(other.getNote7()))
            && (this.getBidprice() == null ? other.getBidprice() == null : this.getBidprice().equals(other.getBidprice()))
            && (this.getBargainrate() == null ? other.getBargainrate() == null : this.getBargainrate().equals(other.getBargainrate()))
            && (this.getAdvertisement() == null ? other.getAdvertisement() == null : this.getAdvertisement().equals(other.getAdvertisement()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getTocolsort() == null ? other.getTocolsort() == null : this.getTocolsort().equals(other.getTocolsort()))
            && (this.getTocollong() == null ? other.getTocollong() == null : this.getTocollong().equals(other.getTocollong()))
            && (this.getFixprofit() == null ? other.getFixprofit() == null : this.getFixprofit().equals(other.getFixprofit()))
            && (this.getPost() == null ? other.getPost() == null : this.getPost().equals(other.getPost()))
            && (this.getPaypalbidfee() == null ? other.getPaypalbidfee() == null : this.getPaypalbidfee().equals(other.getPaypalbidfee()))
            && (this.getPaypalfixfee() == null ? other.getPaypalfixfee() == null : this.getPaypalfixfee().equals(other.getPaypalfixfee()))
            && (this.getEbaybidfee() == null ? other.getEbaybidfee() == null : this.getEbaybidfee().equals(other.getEbaybidfee()))
            && (this.getEbayfixfee() == null ? other.getEbayfixfee() == null : this.getEbayfixfee().equals(other.getEbayfixfee()))
            && (this.getOnlinetime() == null ? other.getOnlinetime() == null : this.getOnlinetime().equals(other.getOnlinetime()))
            && (this.getSellnumdescrby7d() == null ? other.getSellnumdescrby7d() == null : this.getSellnumdescrby7d().equals(other.getSellnumdescrby7d()))
            && (this.getSellnumdescrby7c() == null ? other.getSellnumdescrby7c() == null : this.getSellnumdescrby7c().equals(other.getSellnumdescrby7c()))
            && (this.getSellnumdescrby7b() == null ? other.getSellnumdescrby7b() == null : this.getSellnumdescrby7b().equals(other.getSellnumdescrby7b()))
            && (this.getSellnumdescrby7a() == null ? other.getSellnumdescrby7a() == null : this.getSellnumdescrby7a().equals(other.getSellnumdescrby7a()))
            && (this.getSellnumby7d() == null ? other.getSellnumby7d() == null : this.getSellnumby7d().equals(other.getSellnumby7d()))
            && (this.getSellnumby7c() == null ? other.getSellnumby7c() == null : this.getSellnumby7c().equals(other.getSellnumby7c()))
            && (this.getSellnumby7b() == null ? other.getSellnumby7b() == null : this.getSellnumby7b().equals(other.getSellnumby7b()))
            && (this.getSellnumby7a() == null ? other.getSellnumby7a() == null : this.getSellnumby7a().equals(other.getSellnumby7a()))
            && (this.getSellthrough() == null ? other.getSellthrough() == null : this.getSellthrough().equals(other.getSellthrough()))
            && (this.getClickthrough() == null ? other.getClickthrough() == null : this.getClickthrough().equals(other.getClickthrough()))
            && (this.getImpressions() == null ? other.getImpressions() == null : this.getImpressions().equals(other.getImpressions()))
            && (this.getTodayoedernum() == null ? other.getTodayoedernum() == null : this.getTodayoedernum().equals(other.getTodayoedernum()))
            && (this.getMonthbidnum() == null ? other.getMonthbidnum() == null : this.getMonthbidnum().equals(other.getMonthbidnum()))
            && (this.getOldordernum() == null ? other.getOldordernum() == null : this.getOldordernum().equals(other.getOldordernum()))
            && (this.getSixdaysales() == null ? other.getSixdaysales() == null : this.getSixdaysales().equals(other.getSixdaysales()))
            && (this.getNdaysales() == null ? other.getNdaysales() == null : this.getNdaysales().equals(other.getNdaysales()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getPurprice() == null ? other.getPurprice() == null : this.getPurprice().equals(other.getPurprice()))
            && (this.getProfitpercent() == null ? other.getProfitpercent() == null : this.getProfitpercent().equals(other.getProfitpercent()))
            && (this.getFixprice() == null ? other.getFixprice() == null : this.getFixprice().equals(other.getFixprice()))
            && (this.getSavenumcbm() == null ? other.getSavenumcbm() == null : this.getSavenumcbm().equals(other.getSavenumcbm()))
            && (this.getSavenumcif() == null ? other.getSavenumcif() == null : this.getSavenumcif().equals(other.getSavenumcif()))
            && (this.getNeedorder() == null ? other.getNeedorder() == null : this.getNeedorder().equals(other.getNeedorder()))
            && (this.getMonthsavenum() == null ? other.getMonthsavenum() == null : this.getMonthsavenum().equals(other.getMonthsavenum()))
            && (this.getProductionnumday() == null ? other.getProductionnumday() == null : this.getProductionnumday().equals(other.getProductionnumday()))
            && (this.getProductionnum() == null ? other.getProductionnum() == null : this.getProductionnum().equals(other.getProductionnum()))
            && (this.getAllotnumday() == null ? other.getAllotnumday() == null : this.getAllotnumday().equals(other.getAllotnumday()))
            && (this.getAllotnum() == null ? other.getAllotnum() == null : this.getAllotnum().equals(other.getAllotnum()))
            && (this.getPurchasenumday() == null ? other.getPurchasenumday() == null : this.getPurchasenumday().equals(other.getPurchasenumday()))
            && (this.getPurchasenum() == null ? other.getPurchasenum() == null : this.getPurchasenum().equals(other.getPurchasenum()))
            && (this.getSavenumday() == null ? other.getSavenumday() == null : this.getSavenumday().equals(other.getSavenumday()))
            && (this.getAllsavenumday() == null ? other.getAllsavenumday() == null : this.getAllsavenumday().equals(other.getAllsavenumday()))
            && (this.getAllsavenum() == null ? other.getAllsavenum() == null : this.getAllsavenum().equals(other.getAllsavenum()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getDailymeansales() == null ? other.getDailymeansales() == null : this.getDailymeansales().equals(other.getDailymeansales()))
            && (this.getPuroper() == null ? other.getPuroper() == null : this.getPuroper().equals(other.getPuroper()))
            && (this.getHistorysavenum() == null ? other.getHistorysavenum() == null : this.getHistorysavenum().equals(other.getHistorysavenum()))
            && (this.getHistorycifprice() == null ? other.getHistorycifprice() == null : this.getHistorycifprice().equals(other.getHistorycifprice()))
            && (this.getHistoryprofitamount() == null ? other.getHistoryprofitamount() == null : this.getHistoryprofitamount().equals(other.getHistoryprofitamount()))
            && (this.getClassprofit() == null ? other.getClassprofit() == null : this.getClassprofit().equals(other.getClassprofit()))
            && (this.getProductcontributions() == null ? other.getProductcontributions() == null : this.getProductcontributions().equals(other.getProductcontributions()))
            && (this.getMonthlyprofitabc() == null ? other.getMonthlyprofitabc() == null : this.getMonthlyprofitabc().equals(other.getMonthlyprofitabc()))
            && (this.getFprofitabc() == null ? other.getFprofitabc() == null : this.getFprofitabc().equals(other.getFprofitabc()))
            && (this.getTurnoverday() == null ? other.getTurnoverday() == null : this.getTurnoverday().equals(other.getTurnoverday()))
            && (this.getMonthprofits() == null ? other.getMonthprofits() == null : this.getMonthprofits().equals(other.getMonthprofits()))
            && (this.getRefundrate() == null ? other.getRefundrate() == null : this.getRefundrate().equals(other.getRefundrate()))
            && (this.getMonthclassprofit() == null ? other.getMonthclassprofit() == null : this.getMonthclassprofit().equals(other.getMonthclassprofit()))
            && (this.getChangeamount() == null ? other.getChangeamount() == null : this.getChangeamount().equals(other.getChangeamount()))
            && (this.getLiterratio() == null ? other.getLiterratio() == null : this.getLiterratio().equals(other.getLiterratio()))
            && (this.getClasscontributionratio() == null ? other.getClasscontributionratio() == null : this.getClasscontributionratio().equals(other.getClasscontributionratio()))
            && (this.getMonthrefundrate() == null ? other.getMonthrefundrate() == null : this.getMonthrefundrate().equals(other.getMonthrefundrate()))
            && (this.getHistoryavgprofitratio() == null ? other.getHistoryavgprofitratio() == null : this.getHistoryavgprofitratio().equals(other.getHistoryavgprofitratio()))
            && (this.getHistoryavgprofit() == null ? other.getHistoryavgprofit() == null : this.getHistoryavgprofit().equals(other.getHistoryavgprofit()))
            && (this.getHistorynetprofitamount() == null ? other.getHistorynetprofitamount() == null : this.getHistorynetprofitamount().equals(other.getHistorynetprofitamount()))
            && (this.getVolumeweight() == null ? other.getVolumeweight() == null : this.getVolumeweight().equals(other.getVolumeweight()))
            && (this.getGst() == null ? other.getGst() == null : this.getGst().equals(other.getGst()))
            && (this.getTariff() == null ? other.getTariff() == null : this.getTariff().equals(other.getTariff()))
            && (this.getSavenumstatus() == null ? other.getSavenumstatus() == null : this.getSavenumstatus().equals(other.getSavenumstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getHistprofit() == null) ? 0 : getHistprofit().hashCode());
        result = prime * result + ((getProfitt() == null) ? 0 : getProfitt().hashCode());
        result = prime * result + ((getProfits() == null) ? 0 : getProfits().hashCode());
        result = prime * result + ((getAllordernum() == null) ? 0 : getAllordernum().hashCode());
        result = prime * result + ((getTodayordernum() == null) ? 0 : getTodayordernum().hashCode());
        result = prime * result + ((getOnpassagepurchase() == null) ? 0 : getOnpassagepurchase().hashCode());
        result = prime * result + ((getOoslevel() == null) ? 0 : getOoslevel().hashCode());
        result = prime * result + ((getRateofpin() == null) ? 0 : getRateofpin().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getAlertday() == null) ? 0 : getAlertday().hashCode());
        result = prime * result + ((getAlertnum() == null) ? 0 : getAlertnum().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getTodaysavenum() == null) ? 0 : getTodaysavenum().hashCode());
        result = prime * result + ((getSingledaysales() == null) ? 0 : getSingledaysales().hashCode());
        result = prime * result + ((getDielibrarycoefficient() == null) ? 0 : getDielibrarycoefficient().hashCode());
        result = prime * result + ((getTodayoutsavenum() == null) ? 0 : getTodayoutsavenum().hashCode());
        result = prime * result + ((getMinpurchasenum() == null) ? 0 : getMinpurchasenum().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getStorngid() == null) ? 0 : getStorngid().hashCode());
        result = prime * result + ((getStrong() == null) ? 0 : getStrong().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getOper3() == null) ? 0 : getOper3().hashCode());
        result = prime * result + ((getOper4() == null) ? 0 : getOper4().hashCode());
        result = prime * result + ((getOper5() == null) ? 0 : getOper5().hashCode());
        result = prime * result + ((getMenufunctoryid() == null) ? 0 : getMenufunctoryid().hashCode());
        result = prime * result + ((getMenufunctory() == null) ? 0 : getMenufunctory().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getHistpavgrofit() == null) ? 0 : getHistpavgrofit().hashCode());
        result = prime * result + ((getGstprice() == null) ? 0 : getGstprice().hashCode());
        result = prime * result + ((getOceanshipprice() == null) ? 0 : getOceanshipprice().hashCode());
        result = prime * result + ((getFobprice() == null) ? 0 : getFobprice().hashCode());
        result = prime * result + ((getCifprice() == null) ? 0 : getCifprice().hashCode());
        result = prime * result + ((getExpressprice() == null) ? 0 : getExpressprice().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getBidprofit() == null) ? 0 : getBidprofit().hashCode());
        result = prime * result + ((getFixedprofit() == null) ? 0 : getFixedprofit().hashCode());
        result = prime * result + ((getBidebayprice() == null) ? 0 : getBidebayprice().hashCode());
        result = prime * result + ((getFixedebayprice() == null) ? 0 : getFixedebayprice().hashCode());
        result = prime * result + ((getBidnum() == null) ? 0 : getBidnum().hashCode());
        result = prime * result + ((getStorerent() == null) ? 0 : getStorerent().hashCode());
        result = prime * result + ((getAllpurchasenum() == null) ? 0 : getAllpurchasenum().hashCode());
        result = prime * result + ((getManufacturequote() == null) ? 0 : getManufacturequote().hashCode());
        result = prime * result + ((getTariffprice() == null) ? 0 : getTariffprice().hashCode());
        result = prime * result + ((getPaypalprice() == null) ? 0 : getPaypalprice().hashCode());
        result = prime * result + ((getAliasku() == null) ? 0 : getAliasku().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getSizes() == null) ? 0 : getSizes().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getSales7() == null) ? 0 : getSales7().hashCode());
        result = prime * result + ((getSales30() == null) ? 0 : getSales30().hashCode());
        result = prime * result + ((getSales90() == null) ? 0 : getSales90().hashCode());
        result = prime * result + ((getOuterlevel() == null) ? 0 : getOuterlevel().hashCode());
        result = prime * result + ((getDhnumber() == null) ? 0 : getDhnumber().hashCode());
        result = prime * result + ((getMainsku() == null) ? 0 : getMainsku().hashCode());
        result = prime * result + ((getEbayprice() == null) ? 0 : getEbayprice().hashCode());
        result = prime * result + ((getBidavgprice() == null) ? 0 : getBidavgprice().hashCode());
        result = prime * result + ((getBidturnoverrate() == null) ? 0 : getBidturnoverrate().hashCode());
        result = prime * result + ((getBidtotalprice() == null) ? 0 : getBidtotalprice().hashCode());
        result = prime * result + ((getBid7day() == null) ? 0 : getBid7day().hashCode());
        result = prime * result + ((getBid30day() == null) ? 0 : getBid30day().hashCode());
        result = prime * result + ((getBid60day() == null) ? 0 : getBid60day().hashCode());
        result = prime * result + ((getNote1() == null) ? 0 : getNote1().hashCode());
        result = prime * result + ((getNote2() == null) ? 0 : getNote2().hashCode());
        result = prime * result + ((getNote3() == null) ? 0 : getNote3().hashCode());
        result = prime * result + ((getNote4() == null) ? 0 : getNote4().hashCode());
        result = prime * result + ((getNote5() == null) ? 0 : getNote5().hashCode());
        result = prime * result + ((getNote6() == null) ? 0 : getNote6().hashCode());
        result = prime * result + ((getNote7() == null) ? 0 : getNote7().hashCode());
        result = prime * result + ((getBidprice() == null) ? 0 : getBidprice().hashCode());
        result = prime * result + ((getBargainrate() == null) ? 0 : getBargainrate().hashCode());
        result = prime * result + ((getAdvertisement() == null) ? 0 : getAdvertisement().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getTocolsort() == null) ? 0 : getTocolsort().hashCode());
        result = prime * result + ((getTocollong() == null) ? 0 : getTocollong().hashCode());
        result = prime * result + ((getFixprofit() == null) ? 0 : getFixprofit().hashCode());
        result = prime * result + ((getPost() == null) ? 0 : getPost().hashCode());
        result = prime * result + ((getPaypalbidfee() == null) ? 0 : getPaypalbidfee().hashCode());
        result = prime * result + ((getPaypalfixfee() == null) ? 0 : getPaypalfixfee().hashCode());
        result = prime * result + ((getEbaybidfee() == null) ? 0 : getEbaybidfee().hashCode());
        result = prime * result + ((getEbayfixfee() == null) ? 0 : getEbayfixfee().hashCode());
        result = prime * result + ((getOnlinetime() == null) ? 0 : getOnlinetime().hashCode());
        result = prime * result + ((getSellnumdescrby7d() == null) ? 0 : getSellnumdescrby7d().hashCode());
        result = prime * result + ((getSellnumdescrby7c() == null) ? 0 : getSellnumdescrby7c().hashCode());
        result = prime * result + ((getSellnumdescrby7b() == null) ? 0 : getSellnumdescrby7b().hashCode());
        result = prime * result + ((getSellnumdescrby7a() == null) ? 0 : getSellnumdescrby7a().hashCode());
        result = prime * result + ((getSellnumby7d() == null) ? 0 : getSellnumby7d().hashCode());
        result = prime * result + ((getSellnumby7c() == null) ? 0 : getSellnumby7c().hashCode());
        result = prime * result + ((getSellnumby7b() == null) ? 0 : getSellnumby7b().hashCode());
        result = prime * result + ((getSellnumby7a() == null) ? 0 : getSellnumby7a().hashCode());
        result = prime * result + ((getSellthrough() == null) ? 0 : getSellthrough().hashCode());
        result = prime * result + ((getClickthrough() == null) ? 0 : getClickthrough().hashCode());
        result = prime * result + ((getImpressions() == null) ? 0 : getImpressions().hashCode());
        result = prime * result + ((getTodayoedernum() == null) ? 0 : getTodayoedernum().hashCode());
        result = prime * result + ((getMonthbidnum() == null) ? 0 : getMonthbidnum().hashCode());
        result = prime * result + ((getOldordernum() == null) ? 0 : getOldordernum().hashCode());
        result = prime * result + ((getSixdaysales() == null) ? 0 : getSixdaysales().hashCode());
        result = prime * result + ((getNdaysales() == null) ? 0 : getNdaysales().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getPurprice() == null) ? 0 : getPurprice().hashCode());
        result = prime * result + ((getProfitpercent() == null) ? 0 : getProfitpercent().hashCode());
        result = prime * result + ((getFixprice() == null) ? 0 : getFixprice().hashCode());
        result = prime * result + ((getSavenumcbm() == null) ? 0 : getSavenumcbm().hashCode());
        result = prime * result + ((getSavenumcif() == null) ? 0 : getSavenumcif().hashCode());
        result = prime * result + ((getNeedorder() == null) ? 0 : getNeedorder().hashCode());
        result = prime * result + ((getMonthsavenum() == null) ? 0 : getMonthsavenum().hashCode());
        result = prime * result + ((getProductionnumday() == null) ? 0 : getProductionnumday().hashCode());
        result = prime * result + ((getProductionnum() == null) ? 0 : getProductionnum().hashCode());
        result = prime * result + ((getAllotnumday() == null) ? 0 : getAllotnumday().hashCode());
        result = prime * result + ((getAllotnum() == null) ? 0 : getAllotnum().hashCode());
        result = prime * result + ((getPurchasenumday() == null) ? 0 : getPurchasenumday().hashCode());
        result = prime * result + ((getPurchasenum() == null) ? 0 : getPurchasenum().hashCode());
        result = prime * result + ((getSavenumday() == null) ? 0 : getSavenumday().hashCode());
        result = prime * result + ((getAllsavenumday() == null) ? 0 : getAllsavenumday().hashCode());
        result = prime * result + ((getAllsavenum() == null) ? 0 : getAllsavenum().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getDailymeansales() == null) ? 0 : getDailymeansales().hashCode());
        result = prime * result + ((getPuroper() == null) ? 0 : getPuroper().hashCode());
        result = prime * result + ((getHistorysavenum() == null) ? 0 : getHistorysavenum().hashCode());
        result = prime * result + ((getHistorycifprice() == null) ? 0 : getHistorycifprice().hashCode());
        result = prime * result + ((getHistoryprofitamount() == null) ? 0 : getHistoryprofitamount().hashCode());
        result = prime * result + ((getClassprofit() == null) ? 0 : getClassprofit().hashCode());
        result = prime * result + ((getProductcontributions() == null) ? 0 : getProductcontributions().hashCode());
        result = prime * result + ((getMonthlyprofitabc() == null) ? 0 : getMonthlyprofitabc().hashCode());
        result = prime * result + ((getFprofitabc() == null) ? 0 : getFprofitabc().hashCode());
        result = prime * result + ((getTurnoverday() == null) ? 0 : getTurnoverday().hashCode());
        result = prime * result + ((getMonthprofits() == null) ? 0 : getMonthprofits().hashCode());
        result = prime * result + ((getRefundrate() == null) ? 0 : getRefundrate().hashCode());
        result = prime * result + ((getMonthclassprofit() == null) ? 0 : getMonthclassprofit().hashCode());
        result = prime * result + ((getChangeamount() == null) ? 0 : getChangeamount().hashCode());
        result = prime * result + ((getLiterratio() == null) ? 0 : getLiterratio().hashCode());
        result = prime * result + ((getClasscontributionratio() == null) ? 0 : getClasscontributionratio().hashCode());
        result = prime * result + ((getMonthrefundrate() == null) ? 0 : getMonthrefundrate().hashCode());
        result = prime * result + ((getHistoryavgprofitratio() == null) ? 0 : getHistoryavgprofitratio().hashCode());
        result = prime * result + ((getHistoryavgprofit() == null) ? 0 : getHistoryavgprofit().hashCode());
        result = prime * result + ((getHistorynetprofitamount() == null) ? 0 : getHistorynetprofitamount().hashCode());
        result = prime * result + ((getVolumeweight() == null) ? 0 : getVolumeweight().hashCode());
        result = prime * result + ((getGst() == null) ? 0 : getGst().hashCode());
        result = prime * result + ((getTariff() == null) ? 0 : getTariff().hashCode());
        result = prime * result + ((getSavenumstatus() == null) ? 0 : getSavenumstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", productid=").append(productid);
        sb.append(", histprofit=").append(histprofit);
        sb.append(", profitt=").append(profitt);
        sb.append(", profits=").append(profits);
        sb.append(", allordernum=").append(allordernum);
        sb.append(", todayordernum=").append(todayordernum);
        sb.append(", onpassagepurchase=").append(onpassagepurchase);
        sb.append(", ooslevel=").append(ooslevel);
        sb.append(", rateofpin=").append(rateofpin);
        sb.append(", savenum=").append(savenum);
        sb.append(", costprice=").append(costprice);
        sb.append(", alertday=").append(alertday);
        sb.append(", alertnum=").append(alertnum);
        sb.append(", weight=").append(weight);
        sb.append(", todaysavenum=").append(todaysavenum);
        sb.append(", singledaysales=").append(singledaysales);
        sb.append(", dielibrarycoefficient=").append(dielibrarycoefficient);
        sb.append(", todayoutsavenum=").append(todayoutsavenum);
        sb.append(", minpurchasenum=").append(minpurchasenum);
        sb.append(", locationid=").append(locationid);
        sb.append(", location=").append(location);
        sb.append(", storngid=").append(storngid);
        sb.append(", strong=").append(strong);
        sb.append(", productname=").append(productname);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", oper3=").append(oper3);
        sb.append(", oper4=").append(oper4);
        sb.append(", oper5=").append(oper5);
        sb.append(", menufunctoryid=").append(menufunctoryid);
        sb.append(", menufunctory=").append(menufunctory);
        sb.append(", status=").append(status);
        sb.append(", corpid=").append(corpid);
        sb.append(", createtime=").append(createtime);
        sb.append(", histpavgrofit=").append(histpavgrofit);
        sb.append(", gstprice=").append(gstprice);
        sb.append(", oceanshipprice=").append(oceanshipprice);
        sb.append(", fobprice=").append(fobprice);
        sb.append(", cifprice=").append(cifprice);
        sb.append(", expressprice=").append(expressprice);
        sb.append(", profit=").append(profit);
        sb.append(", bidprofit=").append(bidprofit);
        sb.append(", fixedprofit=").append(fixedprofit);
        sb.append(", bidebayprice=").append(bidebayprice);
        sb.append(", fixedebayprice=").append(fixedebayprice);
        sb.append(", bidnum=").append(bidnum);
        sb.append(", storerent=").append(storerent);
        sb.append(", allpurchasenum=").append(allpurchasenum);
        sb.append(", manufacturequote=").append(manufacturequote);
        sb.append(", tariffprice=").append(tariffprice);
        sb.append(", paypalprice=").append(paypalprice);
        sb.append(", aliasku=").append(aliasku);
        sb.append(", volume=").append(volume);
        sb.append(", sizes=").append(sizes);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", high=").append(high);
        sb.append(", sales7=").append(sales7);
        sb.append(", sales30=").append(sales30);
        sb.append(", sales90=").append(sales90);
        sb.append(", outerlevel=").append(outerlevel);
        sb.append(", dhnumber=").append(dhnumber);
        sb.append(", mainsku=").append(mainsku);
        sb.append(", ebayprice=").append(ebayprice);
        sb.append(", bidavgprice=").append(bidavgprice);
        sb.append(", bidturnoverrate=").append(bidturnoverrate);
        sb.append(", bidtotalprice=").append(bidtotalprice);
        sb.append(", bid7day=").append(bid7day);
        sb.append(", bid30day=").append(bid30day);
        sb.append(", bid60day=").append(bid60day);
        sb.append(", note1=").append(note1);
        sb.append(", note2=").append(note2);
        sb.append(", note3=").append(note3);
        sb.append(", note4=").append(note4);
        sb.append(", note5=").append(note5);
        sb.append(", note6=").append(note6);
        sb.append(", note7=").append(note7);
        sb.append(", bidprice=").append(bidprice);
        sb.append(", bargainrate=").append(bargainrate);
        sb.append(", advertisement=").append(advertisement);
        sb.append(", opertime=").append(opertime);
        sb.append(", oper=").append(oper);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", tocolsort=").append(tocolsort);
        sb.append(", tocollong=").append(tocollong);
        sb.append(", fixprofit=").append(fixprofit);
        sb.append(", post=").append(post);
        sb.append(", paypalbidfee=").append(paypalbidfee);
        sb.append(", paypalfixfee=").append(paypalfixfee);
        sb.append(", ebaybidfee=").append(ebaybidfee);
        sb.append(", ebayfixfee=").append(ebayfixfee);
        sb.append(", onlinetime=").append(onlinetime);
        sb.append(", sellnumdescrby7d=").append(sellnumdescrby7d);
        sb.append(", sellnumdescrby7c=").append(sellnumdescrby7c);
        sb.append(", sellnumdescrby7b=").append(sellnumdescrby7b);
        sb.append(", sellnumdescrby7a=").append(sellnumdescrby7a);
        sb.append(", sellnumby7d=").append(sellnumby7d);
        sb.append(", sellnumby7c=").append(sellnumby7c);
        sb.append(", sellnumby7b=").append(sellnumby7b);
        sb.append(", sellnumby7a=").append(sellnumby7a);
        sb.append(", sellthrough=").append(sellthrough);
        sb.append(", clickthrough=").append(clickthrough);
        sb.append(", impressions=").append(impressions);
        sb.append(", todayoedernum=").append(todayoedernum);
        sb.append(", monthbidnum=").append(monthbidnum);
        sb.append(", oldordernum=").append(oldordernum);
        sb.append(", sixdaysales=").append(sixdaysales);
        sb.append(", ndaysales=").append(ndaysales);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", category=").append(category);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", purprice=").append(purprice);
        sb.append(", profitpercent=").append(profitpercent);
        sb.append(", fixprice=").append(fixprice);
        sb.append(", savenumcbm=").append(savenumcbm);
        sb.append(", savenumcif=").append(savenumcif);
        sb.append(", needorder=").append(needorder);
        sb.append(", monthsavenum=").append(monthsavenum);
        sb.append(", productionnumday=").append(productionnumday);
        sb.append(", productionnum=").append(productionnum);
        sb.append(", allotnumday=").append(allotnumday);
        sb.append(", allotnum=").append(allotnum);
        sb.append(", purchasenumday=").append(purchasenumday);
        sb.append(", purchasenum=").append(purchasenum);
        sb.append(", savenumday=").append(savenumday);
        sb.append(", allsavenumday=").append(allsavenumday);
        sb.append(", allsavenum=").append(allsavenum);
        sb.append(", selloper=").append(selloper);
        sb.append(", dailymeansales=").append(dailymeansales);
        sb.append(", puroper=").append(puroper);
        sb.append(", historysavenum=").append(historysavenum);
        sb.append(", historycifprice=").append(historycifprice);
        sb.append(", historyprofitamount=").append(historyprofitamount);
        sb.append(", classprofit=").append(classprofit);
        sb.append(", productcontributions=").append(productcontributions);
        sb.append(", monthlyprofitabc=").append(monthlyprofitabc);
        sb.append(", fprofitabc=").append(fprofitabc);
        sb.append(", turnoverday=").append(turnoverday);
        sb.append(", monthprofits=").append(monthprofits);
        sb.append(", refundrate=").append(refundrate);
        sb.append(", monthclassprofit=").append(monthclassprofit);
        sb.append(", changeamount=").append(changeamount);
        sb.append(", literratio=").append(literratio);
        sb.append(", classcontributionratio=").append(classcontributionratio);
        sb.append(", monthrefundrate=").append(monthrefundrate);
        sb.append(", historyavgprofitratio=").append(historyavgprofitratio);
        sb.append(", historyavgprofit=").append(historyavgprofit);
        sb.append(", historynetprofitamount=").append(historynetprofitamount);
        sb.append(", volumeweight=").append(volumeweight);
        sb.append(", gst=").append(gst);
        sb.append(", tariff=").append(tariff);
        sb.append(", savenumstatus=").append(savenumstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}