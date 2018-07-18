package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbOrderTemp1 implements Serializable {
    private String orderid;

    private String corpid;

    private String tradeid;

    private String tradetype;

    private String groupid;

    private String tradeurl;

    private String customerid;

    private String customername;

    private String customersex;

    private String customerage;

    private String customerbirthday;

    private String customerfirstname;

    private String customerlastname;

    private String customertype;

    private String customertel1;

    private String customertel2;

    private String customeremail;

    private String customerqq;

    private String customermsn;

    private String customercountry;

    private String customerprovince;

    private String customercity;

    private String customeraddress;

    private String customerzipcode;

    private String customerfax;

    private String customerreserve1;

    private String customerreserve2;

    private String customerreserve3;

    private String customerreserve4;

    private String customerreserve5;

    private String customerreserve6;

    private String customerreserve7;

    private String customerreserve8;

    private String customerreserve9;

    private String customerreserve10;

    private String shoptypeid;

    private String shoptype;

    private String salesource;

    private String moneytype;

    private BigDecimal moneyask;

    private BigDecimal moneyaction;

    private BigDecimal moneyexpressask;

    private BigDecimal moneyexpressaction;

    private BigDecimal moneyorigin1;

    private BigDecimal moneyorigin2;

    private BigDecimal moneyorigin3;

    private BigDecimal moneyorigin4;

    private Date ordertime;

    private Date uploadtime;

    private Date paytime;

    private Date expresstime;

    private String expresstype;

    private String expressid;

    private String expressunit;

    private BigDecimal expressweight;

    private String payid;

    private String payoper;

    private String expressoper;

    private String stockoper;

    private String oper;

    private Date opertime;

    private String stype;

    private String status;

    private String statusdescr;

    private String content;

    private String descr1;

    private String descr2;

    private String descr3;

    private BigDecimal delaydays;

    private String ordertypeid;

    private String ordertypename;

    private String color;

    private String alertflag;

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

    private String reserve11;

    private String reserve12;

    private String reserve13;

    private String reserve14;

    private String reserve15;

    private String reserve16;

    private String reserve17;

    private String reserve18;

    private String reserve19;

    private String reserve20;

    private BigDecimal insurance;

    private String notestoyourself;

    private String postageservice;

    private String packagingid;

    private String packagingname;

    private BigDecimal packagingweight;

    private String packagingclass;

    private BigDecimal orderweight;

    private String expresstypeid;

    private String oper1;

    private String oper2;

    private String storageid;

    private String locationid;

    private BigDecimal sellnum;

    private BigDecimal ordernum;

    private String location;

    private String storage;

    private String ordersource;

    private String refundflag;

    private BigDecimal refundrmb;

    private BigDecimal refundloss;

    private BigDecimal refundoriginal;

    private String bansendflag;

    private String slreserve1;

    private String slreserve2;

    private String slreserve3;

    private String slreserve4;

    private BigDecimal slreserve5;

    private BigDecimal slreserve6;

    private BigDecimal slreserve7;

    private BigDecimal slreserve8;

    private BigDecimal slreserve9;

    private BigDecimal slreserve10;

    private String xbreserve1;

    private String xbreserve2;

    private String xbreserve3;

    private String xbreserve4;

    private BigDecimal xbreserve5;

    private BigDecimal xbreserve6;

    private BigDecimal xbreserve7;

    private BigDecimal xbreserve8;

    private String qlreserve1;

    private String qlreserve2;

    private String qlreserve3;

    private String qlreserve4;

    private BigDecimal qlreserve5;

    private BigDecimal qlreserve6;

    private BigDecimal qlreserve7;

    private BigDecimal qlreserve8;

    private BigDecimal moneyrate;

    private BigDecimal originordermoney;

    private BigDecimal originexpressmoney;

    private BigDecimal origininsurance;

    private BigDecimal originfinalvaluefee;

    private BigDecimal actionorderweight;

    private BigDecimal finalvaluefee;

    private BigDecimal ordermoney;

    private Date xbtime1;

    private Date xbtime2;

    private Date xbtime3;

    private String calculateflag;

    private BigDecimal basemoney;

    private BigDecimal baseweight;

    private BigDecimal unitmoney;

    private BigDecimal fixedmoney1;

    private BigDecimal fixedmoney2;

    private BigDecimal unitweight;

    private String paypacountry;

    private String paypalstatus;

    private BigDecimal paypalfeeamount;

    private BigDecimal paypalgrossamount;

    private BigDecimal paypalnetamount;

    private String paypalstreet;

    private String paypalstreet1;

    private String paypalstreet2;

    private String paypalcity;

    private String paypalprovince;

    private String ebaycustomeraddress;

    private String paypalcustomeraddress;

    private String paypalflag;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype == null ? null : tradetype.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getTradeurl() {
        return tradeurl;
    }

    public void setTradeurl(String tradeurl) {
        this.tradeurl = tradeurl == null ? null : tradeurl.trim();
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

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex == null ? null : customersex.trim();
    }

    public String getCustomerage() {
        return customerage;
    }

    public void setCustomerage(String customerage) {
        this.customerage = customerage == null ? null : customerage.trim();
    }

    public String getCustomerbirthday() {
        return customerbirthday;
    }

    public void setCustomerbirthday(String customerbirthday) {
        this.customerbirthday = customerbirthday == null ? null : customerbirthday.trim();
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }

    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname == null ? null : customerfirstname.trim();
    }

    public String getCustomerlastname() {
        return customerlastname;
    }

    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname == null ? null : customerlastname.trim();
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype == null ? null : customertype.trim();
    }

    public String getCustomertel1() {
        return customertel1;
    }

    public void setCustomertel1(String customertel1) {
        this.customertel1 = customertel1 == null ? null : customertel1.trim();
    }

    public String getCustomertel2() {
        return customertel2;
    }

    public void setCustomertel2(String customertel2) {
        this.customertel2 = customertel2 == null ? null : customertel2.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomerqq() {
        return customerqq;
    }

    public void setCustomerqq(String customerqq) {
        this.customerqq = customerqq == null ? null : customerqq.trim();
    }

    public String getCustomermsn() {
        return customermsn;
    }

    public void setCustomermsn(String customermsn) {
        this.customermsn = customermsn == null ? null : customermsn.trim();
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getCustomerprovince() {
        return customerprovince;
    }

    public void setCustomerprovince(String customerprovince) {
        this.customerprovince = customerprovince == null ? null : customerprovince.trim();
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity == null ? null : customercity.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public String getCustomerzipcode() {
        return customerzipcode;
    }

    public void setCustomerzipcode(String customerzipcode) {
        this.customerzipcode = customerzipcode == null ? null : customerzipcode.trim();
    }

    public String getCustomerfax() {
        return customerfax;
    }

    public void setCustomerfax(String customerfax) {
        this.customerfax = customerfax == null ? null : customerfax.trim();
    }

    public String getCustomerreserve1() {
        return customerreserve1;
    }

    public void setCustomerreserve1(String customerreserve1) {
        this.customerreserve1 = customerreserve1 == null ? null : customerreserve1.trim();
    }

    public String getCustomerreserve2() {
        return customerreserve2;
    }

    public void setCustomerreserve2(String customerreserve2) {
        this.customerreserve2 = customerreserve2 == null ? null : customerreserve2.trim();
    }

    public String getCustomerreserve3() {
        return customerreserve3;
    }

    public void setCustomerreserve3(String customerreserve3) {
        this.customerreserve3 = customerreserve3 == null ? null : customerreserve3.trim();
    }

    public String getCustomerreserve4() {
        return customerreserve4;
    }

    public void setCustomerreserve4(String customerreserve4) {
        this.customerreserve4 = customerreserve4 == null ? null : customerreserve4.trim();
    }

    public String getCustomerreserve5() {
        return customerreserve5;
    }

    public void setCustomerreserve5(String customerreserve5) {
        this.customerreserve5 = customerreserve5 == null ? null : customerreserve5.trim();
    }

    public String getCustomerreserve6() {
        return customerreserve6;
    }

    public void setCustomerreserve6(String customerreserve6) {
        this.customerreserve6 = customerreserve6 == null ? null : customerreserve6.trim();
    }

    public String getCustomerreserve7() {
        return customerreserve7;
    }

    public void setCustomerreserve7(String customerreserve7) {
        this.customerreserve7 = customerreserve7 == null ? null : customerreserve7.trim();
    }

    public String getCustomerreserve8() {
        return customerreserve8;
    }

    public void setCustomerreserve8(String customerreserve8) {
        this.customerreserve8 = customerreserve8 == null ? null : customerreserve8.trim();
    }

    public String getCustomerreserve9() {
        return customerreserve9;
    }

    public void setCustomerreserve9(String customerreserve9) {
        this.customerreserve9 = customerreserve9 == null ? null : customerreserve9.trim();
    }

    public String getCustomerreserve10() {
        return customerreserve10;
    }

    public void setCustomerreserve10(String customerreserve10) {
        this.customerreserve10 = customerreserve10 == null ? null : customerreserve10.trim();
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

    public String getSalesource() {
        return salesource;
    }

    public void setSalesource(String salesource) {
        this.salesource = salesource == null ? null : salesource.trim();
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public BigDecimal getMoneyask() {
        return moneyask;
    }

    public void setMoneyask(BigDecimal moneyask) {
        this.moneyask = moneyask;
    }

    public BigDecimal getMoneyaction() {
        return moneyaction;
    }

    public void setMoneyaction(BigDecimal moneyaction) {
        this.moneyaction = moneyaction;
    }

    public BigDecimal getMoneyexpressask() {
        return moneyexpressask;
    }

    public void setMoneyexpressask(BigDecimal moneyexpressask) {
        this.moneyexpressask = moneyexpressask;
    }

    public BigDecimal getMoneyexpressaction() {
        return moneyexpressaction;
    }

    public void setMoneyexpressaction(BigDecimal moneyexpressaction) {
        this.moneyexpressaction = moneyexpressaction;
    }

    public BigDecimal getMoneyorigin1() {
        return moneyorigin1;
    }

    public void setMoneyorigin1(BigDecimal moneyorigin1) {
        this.moneyorigin1 = moneyorigin1;
    }

    public BigDecimal getMoneyorigin2() {
        return moneyorigin2;
    }

    public void setMoneyorigin2(BigDecimal moneyorigin2) {
        this.moneyorigin2 = moneyorigin2;
    }

    public BigDecimal getMoneyorigin3() {
        return moneyorigin3;
    }

    public void setMoneyorigin3(BigDecimal moneyorigin3) {
        this.moneyorigin3 = moneyorigin3;
    }

    public BigDecimal getMoneyorigin4() {
        return moneyorigin4;
    }

    public void setMoneyorigin4(BigDecimal moneyorigin4) {
        this.moneyorigin4 = moneyorigin4;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getExpresstime() {
        return expresstime;
    }

    public void setExpresstime(Date expresstime) {
        this.expresstime = expresstime;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpressunit() {
        return expressunit;
    }

    public void setExpressunit(String expressunit) {
        this.expressunit = expressunit == null ? null : expressunit.trim();
    }

    public BigDecimal getExpressweight() {
        return expressweight;
    }

    public void setExpressweight(BigDecimal expressweight) {
        this.expressweight = expressweight;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public String getPayoper() {
        return payoper;
    }

    public void setPayoper(String payoper) {
        this.payoper = payoper == null ? null : payoper.trim();
    }

    public String getExpressoper() {
        return expressoper;
    }

    public void setExpressoper(String expressoper) {
        this.expressoper = expressoper == null ? null : expressoper.trim();
    }

    public String getStockoper() {
        return stockoper;
    }

    public void setStockoper(String stockoper) {
        this.stockoper = stockoper == null ? null : stockoper.trim();
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

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusdescr() {
        return statusdescr;
    }

    public void setStatusdescr(String statusdescr) {
        this.statusdescr = statusdescr == null ? null : statusdescr.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public BigDecimal getDelaydays() {
        return delaydays;
    }

    public void setDelaydays(BigDecimal delaydays) {
        this.delaydays = delaydays;
    }

    public String getOrdertypeid() {
        return ordertypeid;
    }

    public void setOrdertypeid(String ordertypeid) {
        this.ordertypeid = ordertypeid == null ? null : ordertypeid.trim();
    }

    public String getOrdertypename() {
        return ordertypename;
    }

    public void setOrdertypename(String ordertypename) {
        this.ordertypename = ordertypename == null ? null : ordertypename.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getAlertflag() {
        return alertflag;
    }

    public void setAlertflag(String alertflag) {
        this.alertflag = alertflag == null ? null : alertflag.trim();
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

    public String getReserve14() {
        return reserve14;
    }

    public void setReserve14(String reserve14) {
        this.reserve14 = reserve14 == null ? null : reserve14.trim();
    }

    public String getReserve15() {
        return reserve15;
    }

    public void setReserve15(String reserve15) {
        this.reserve15 = reserve15 == null ? null : reserve15.trim();
    }

    public String getReserve16() {
        return reserve16;
    }

    public void setReserve16(String reserve16) {
        this.reserve16 = reserve16 == null ? null : reserve16.trim();
    }

    public String getReserve17() {
        return reserve17;
    }

    public void setReserve17(String reserve17) {
        this.reserve17 = reserve17 == null ? null : reserve17.trim();
    }

    public String getReserve18() {
        return reserve18;
    }

    public void setReserve18(String reserve18) {
        this.reserve18 = reserve18 == null ? null : reserve18.trim();
    }

    public String getReserve19() {
        return reserve19;
    }

    public void setReserve19(String reserve19) {
        this.reserve19 = reserve19 == null ? null : reserve19.trim();
    }

    public String getReserve20() {
        return reserve20;
    }

    public void setReserve20(String reserve20) {
        this.reserve20 = reserve20 == null ? null : reserve20.trim();
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public String getNotestoyourself() {
        return notestoyourself;
    }

    public void setNotestoyourself(String notestoyourself) {
        this.notestoyourself = notestoyourself == null ? null : notestoyourself.trim();
    }

    public String getPostageservice() {
        return postageservice;
    }

    public void setPostageservice(String postageservice) {
        this.postageservice = postageservice == null ? null : postageservice.trim();
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

    public String getPackagingclass() {
        return packagingclass;
    }

    public void setPackagingclass(String packagingclass) {
        this.packagingclass = packagingclass == null ? null : packagingclass.trim();
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

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public BigDecimal getSellnum() {
        return sellnum;
    }

    public void setSellnum(BigDecimal sellnum) {
        this.sellnum = sellnum;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(String ordersource) {
        this.ordersource = ordersource == null ? null : ordersource.trim();
    }

    public String getRefundflag() {
        return refundflag;
    }

    public void setRefundflag(String refundflag) {
        this.refundflag = refundflag == null ? null : refundflag.trim();
    }

    public BigDecimal getRefundrmb() {
        return refundrmb;
    }

    public void setRefundrmb(BigDecimal refundrmb) {
        this.refundrmb = refundrmb;
    }

    public BigDecimal getRefundloss() {
        return refundloss;
    }

    public void setRefundloss(BigDecimal refundloss) {
        this.refundloss = refundloss;
    }

    public BigDecimal getRefundoriginal() {
        return refundoriginal;
    }

    public void setRefundoriginal(BigDecimal refundoriginal) {
        this.refundoriginal = refundoriginal;
    }

    public String getBansendflag() {
        return bansendflag;
    }

    public void setBansendflag(String bansendflag) {
        this.bansendflag = bansendflag == null ? null : bansendflag.trim();
    }

    public String getSlreserve1() {
        return slreserve1;
    }

    public void setSlreserve1(String slreserve1) {
        this.slreserve1 = slreserve1 == null ? null : slreserve1.trim();
    }

    public String getSlreserve2() {
        return slreserve2;
    }

    public void setSlreserve2(String slreserve2) {
        this.slreserve2 = slreserve2 == null ? null : slreserve2.trim();
    }

    public String getSlreserve3() {
        return slreserve3;
    }

    public void setSlreserve3(String slreserve3) {
        this.slreserve3 = slreserve3 == null ? null : slreserve3.trim();
    }

    public String getSlreserve4() {
        return slreserve4;
    }

    public void setSlreserve4(String slreserve4) {
        this.slreserve4 = slreserve4 == null ? null : slreserve4.trim();
    }

    public BigDecimal getSlreserve5() {
        return slreserve5;
    }

    public void setSlreserve5(BigDecimal slreserve5) {
        this.slreserve5 = slreserve5;
    }

    public BigDecimal getSlreserve6() {
        return slreserve6;
    }

    public void setSlreserve6(BigDecimal slreserve6) {
        this.slreserve6 = slreserve6;
    }

    public BigDecimal getSlreserve7() {
        return slreserve7;
    }

    public void setSlreserve7(BigDecimal slreserve7) {
        this.slreserve7 = slreserve7;
    }

    public BigDecimal getSlreserve8() {
        return slreserve8;
    }

    public void setSlreserve8(BigDecimal slreserve8) {
        this.slreserve8 = slreserve8;
    }

    public BigDecimal getSlreserve9() {
        return slreserve9;
    }

    public void setSlreserve9(BigDecimal slreserve9) {
        this.slreserve9 = slreserve9;
    }

    public BigDecimal getSlreserve10() {
        return slreserve10;
    }

    public void setSlreserve10(BigDecimal slreserve10) {
        this.slreserve10 = slreserve10;
    }

    public String getXbreserve1() {
        return xbreserve1;
    }

    public void setXbreserve1(String xbreserve1) {
        this.xbreserve1 = xbreserve1 == null ? null : xbreserve1.trim();
    }

    public String getXbreserve2() {
        return xbreserve2;
    }

    public void setXbreserve2(String xbreserve2) {
        this.xbreserve2 = xbreserve2 == null ? null : xbreserve2.trim();
    }

    public String getXbreserve3() {
        return xbreserve3;
    }

    public void setXbreserve3(String xbreserve3) {
        this.xbreserve3 = xbreserve3 == null ? null : xbreserve3.trim();
    }

    public String getXbreserve4() {
        return xbreserve4;
    }

    public void setXbreserve4(String xbreserve4) {
        this.xbreserve4 = xbreserve4 == null ? null : xbreserve4.trim();
    }

    public BigDecimal getXbreserve5() {
        return xbreserve5;
    }

    public void setXbreserve5(BigDecimal xbreserve5) {
        this.xbreserve5 = xbreserve5;
    }

    public BigDecimal getXbreserve6() {
        return xbreserve6;
    }

    public void setXbreserve6(BigDecimal xbreserve6) {
        this.xbreserve6 = xbreserve6;
    }

    public BigDecimal getXbreserve7() {
        return xbreserve7;
    }

    public void setXbreserve7(BigDecimal xbreserve7) {
        this.xbreserve7 = xbreserve7;
    }

    public BigDecimal getXbreserve8() {
        return xbreserve8;
    }

    public void setXbreserve8(BigDecimal xbreserve8) {
        this.xbreserve8 = xbreserve8;
    }

    public String getQlreserve1() {
        return qlreserve1;
    }

    public void setQlreserve1(String qlreserve1) {
        this.qlreserve1 = qlreserve1 == null ? null : qlreserve1.trim();
    }

    public String getQlreserve2() {
        return qlreserve2;
    }

    public void setQlreserve2(String qlreserve2) {
        this.qlreserve2 = qlreserve2 == null ? null : qlreserve2.trim();
    }

    public String getQlreserve3() {
        return qlreserve3;
    }

    public void setQlreserve3(String qlreserve3) {
        this.qlreserve3 = qlreserve3 == null ? null : qlreserve3.trim();
    }

    public String getQlreserve4() {
        return qlreserve4;
    }

    public void setQlreserve4(String qlreserve4) {
        this.qlreserve4 = qlreserve4 == null ? null : qlreserve4.trim();
    }

    public BigDecimal getQlreserve5() {
        return qlreserve5;
    }

    public void setQlreserve5(BigDecimal qlreserve5) {
        this.qlreserve5 = qlreserve5;
    }

    public BigDecimal getQlreserve6() {
        return qlreserve6;
    }

    public void setQlreserve6(BigDecimal qlreserve6) {
        this.qlreserve6 = qlreserve6;
    }

    public BigDecimal getQlreserve7() {
        return qlreserve7;
    }

    public void setQlreserve7(BigDecimal qlreserve7) {
        this.qlreserve7 = qlreserve7;
    }

    public BigDecimal getQlreserve8() {
        return qlreserve8;
    }

    public void setQlreserve8(BigDecimal qlreserve8) {
        this.qlreserve8 = qlreserve8;
    }

    public BigDecimal getMoneyrate() {
        return moneyrate;
    }

    public void setMoneyrate(BigDecimal moneyrate) {
        this.moneyrate = moneyrate;
    }

    public BigDecimal getOriginordermoney() {
        return originordermoney;
    }

    public void setOriginordermoney(BigDecimal originordermoney) {
        this.originordermoney = originordermoney;
    }

    public BigDecimal getOriginexpressmoney() {
        return originexpressmoney;
    }

    public void setOriginexpressmoney(BigDecimal originexpressmoney) {
        this.originexpressmoney = originexpressmoney;
    }

    public BigDecimal getOrigininsurance() {
        return origininsurance;
    }

    public void setOrigininsurance(BigDecimal origininsurance) {
        this.origininsurance = origininsurance;
    }

    public BigDecimal getOriginfinalvaluefee() {
        return originfinalvaluefee;
    }

    public void setOriginfinalvaluefee(BigDecimal originfinalvaluefee) {
        this.originfinalvaluefee = originfinalvaluefee;
    }

    public BigDecimal getActionorderweight() {
        return actionorderweight;
    }

    public void setActionorderweight(BigDecimal actionorderweight) {
        this.actionorderweight = actionorderweight;
    }

    public BigDecimal getFinalvaluefee() {
        return finalvaluefee;
    }

    public void setFinalvaluefee(BigDecimal finalvaluefee) {
        this.finalvaluefee = finalvaluefee;
    }

    public BigDecimal getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(BigDecimal ordermoney) {
        this.ordermoney = ordermoney;
    }

    public Date getXbtime1() {
        return xbtime1;
    }

    public void setXbtime1(Date xbtime1) {
        this.xbtime1 = xbtime1;
    }

    public Date getXbtime2() {
        return xbtime2;
    }

    public void setXbtime2(Date xbtime2) {
        this.xbtime2 = xbtime2;
    }

    public Date getXbtime3() {
        return xbtime3;
    }

    public void setXbtime3(Date xbtime3) {
        this.xbtime3 = xbtime3;
    }

    public String getCalculateflag() {
        return calculateflag;
    }

    public void setCalculateflag(String calculateflag) {
        this.calculateflag = calculateflag == null ? null : calculateflag.trim();
    }

    public BigDecimal getBasemoney() {
        return basemoney;
    }

    public void setBasemoney(BigDecimal basemoney) {
        this.basemoney = basemoney;
    }

    public BigDecimal getBaseweight() {
        return baseweight;
    }

    public void setBaseweight(BigDecimal baseweight) {
        this.baseweight = baseweight;
    }

    public BigDecimal getUnitmoney() {
        return unitmoney;
    }

    public void setUnitmoney(BigDecimal unitmoney) {
        this.unitmoney = unitmoney;
    }

    public BigDecimal getFixedmoney1() {
        return fixedmoney1;
    }

    public void setFixedmoney1(BigDecimal fixedmoney1) {
        this.fixedmoney1 = fixedmoney1;
    }

    public BigDecimal getFixedmoney2() {
        return fixedmoney2;
    }

    public void setFixedmoney2(BigDecimal fixedmoney2) {
        this.fixedmoney2 = fixedmoney2;
    }

    public BigDecimal getUnitweight() {
        return unitweight;
    }

    public void setUnitweight(BigDecimal unitweight) {
        this.unitweight = unitweight;
    }

    public String getPaypacountry() {
        return paypacountry;
    }

    public void setPaypacountry(String paypacountry) {
        this.paypacountry = paypacountry == null ? null : paypacountry.trim();
    }

    public String getPaypalstatus() {
        return paypalstatus;
    }

    public void setPaypalstatus(String paypalstatus) {
        this.paypalstatus = paypalstatus == null ? null : paypalstatus.trim();
    }

    public BigDecimal getPaypalfeeamount() {
        return paypalfeeamount;
    }

    public void setPaypalfeeamount(BigDecimal paypalfeeamount) {
        this.paypalfeeamount = paypalfeeamount;
    }

    public BigDecimal getPaypalgrossamount() {
        return paypalgrossamount;
    }

    public void setPaypalgrossamount(BigDecimal paypalgrossamount) {
        this.paypalgrossamount = paypalgrossamount;
    }

    public BigDecimal getPaypalnetamount() {
        return paypalnetamount;
    }

    public void setPaypalnetamount(BigDecimal paypalnetamount) {
        this.paypalnetamount = paypalnetamount;
    }

    public String getPaypalstreet() {
        return paypalstreet;
    }

    public void setPaypalstreet(String paypalstreet) {
        this.paypalstreet = paypalstreet == null ? null : paypalstreet.trim();
    }

    public String getPaypalstreet1() {
        return paypalstreet1;
    }

    public void setPaypalstreet1(String paypalstreet1) {
        this.paypalstreet1 = paypalstreet1 == null ? null : paypalstreet1.trim();
    }

    public String getPaypalstreet2() {
        return paypalstreet2;
    }

    public void setPaypalstreet2(String paypalstreet2) {
        this.paypalstreet2 = paypalstreet2 == null ? null : paypalstreet2.trim();
    }

    public String getPaypalcity() {
        return paypalcity;
    }

    public void setPaypalcity(String paypalcity) {
        this.paypalcity = paypalcity == null ? null : paypalcity.trim();
    }

    public String getPaypalprovince() {
        return paypalprovince;
    }

    public void setPaypalprovince(String paypalprovince) {
        this.paypalprovince = paypalprovince == null ? null : paypalprovince.trim();
    }

    public String getEbaycustomeraddress() {
        return ebaycustomeraddress;
    }

    public void setEbaycustomeraddress(String ebaycustomeraddress) {
        this.ebaycustomeraddress = ebaycustomeraddress == null ? null : ebaycustomeraddress.trim();
    }

    public String getPaypalcustomeraddress() {
        return paypalcustomeraddress;
    }

    public void setPaypalcustomeraddress(String paypalcustomeraddress) {
        this.paypalcustomeraddress = paypalcustomeraddress == null ? null : paypalcustomeraddress.trim();
    }

    public String getPaypalflag() {
        return paypalflag;
    }

    public void setPaypalflag(String paypalflag) {
        this.paypalflag = paypalflag == null ? null : paypalflag.trim();
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
        DbOrderTemp1 other = (DbOrderTemp1) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getTradetype() == null ? other.getTradetype() == null : this.getTradetype().equals(other.getTradetype()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getTradeurl() == null ? other.getTradeurl() == null : this.getTradeurl().equals(other.getTradeurl()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomersex() == null ? other.getCustomersex() == null : this.getCustomersex().equals(other.getCustomersex()))
            && (this.getCustomerage() == null ? other.getCustomerage() == null : this.getCustomerage().equals(other.getCustomerage()))
            && (this.getCustomerbirthday() == null ? other.getCustomerbirthday() == null : this.getCustomerbirthday().equals(other.getCustomerbirthday()))
            && (this.getCustomerfirstname() == null ? other.getCustomerfirstname() == null : this.getCustomerfirstname().equals(other.getCustomerfirstname()))
            && (this.getCustomerlastname() == null ? other.getCustomerlastname() == null : this.getCustomerlastname().equals(other.getCustomerlastname()))
            && (this.getCustomertype() == null ? other.getCustomertype() == null : this.getCustomertype().equals(other.getCustomertype()))
            && (this.getCustomertel1() == null ? other.getCustomertel1() == null : this.getCustomertel1().equals(other.getCustomertel1()))
            && (this.getCustomertel2() == null ? other.getCustomertel2() == null : this.getCustomertel2().equals(other.getCustomertel2()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomerqq() == null ? other.getCustomerqq() == null : this.getCustomerqq().equals(other.getCustomerqq()))
            && (this.getCustomermsn() == null ? other.getCustomermsn() == null : this.getCustomermsn().equals(other.getCustomermsn()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomerfax() == null ? other.getCustomerfax() == null : this.getCustomerfax().equals(other.getCustomerfax()))
            && (this.getCustomerreserve1() == null ? other.getCustomerreserve1() == null : this.getCustomerreserve1().equals(other.getCustomerreserve1()))
            && (this.getCustomerreserve2() == null ? other.getCustomerreserve2() == null : this.getCustomerreserve2().equals(other.getCustomerreserve2()))
            && (this.getCustomerreserve3() == null ? other.getCustomerreserve3() == null : this.getCustomerreserve3().equals(other.getCustomerreserve3()))
            && (this.getCustomerreserve4() == null ? other.getCustomerreserve4() == null : this.getCustomerreserve4().equals(other.getCustomerreserve4()))
            && (this.getCustomerreserve5() == null ? other.getCustomerreserve5() == null : this.getCustomerreserve5().equals(other.getCustomerreserve5()))
            && (this.getCustomerreserve6() == null ? other.getCustomerreserve6() == null : this.getCustomerreserve6().equals(other.getCustomerreserve6()))
            && (this.getCustomerreserve7() == null ? other.getCustomerreserve7() == null : this.getCustomerreserve7().equals(other.getCustomerreserve7()))
            && (this.getCustomerreserve8() == null ? other.getCustomerreserve8() == null : this.getCustomerreserve8().equals(other.getCustomerreserve8()))
            && (this.getCustomerreserve9() == null ? other.getCustomerreserve9() == null : this.getCustomerreserve9().equals(other.getCustomerreserve9()))
            && (this.getCustomerreserve10() == null ? other.getCustomerreserve10() == null : this.getCustomerreserve10().equals(other.getCustomerreserve10()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getMoneyask() == null ? other.getMoneyask() == null : this.getMoneyask().equals(other.getMoneyask()))
            && (this.getMoneyaction() == null ? other.getMoneyaction() == null : this.getMoneyaction().equals(other.getMoneyaction()))
            && (this.getMoneyexpressask() == null ? other.getMoneyexpressask() == null : this.getMoneyexpressask().equals(other.getMoneyexpressask()))
            && (this.getMoneyexpressaction() == null ? other.getMoneyexpressaction() == null : this.getMoneyexpressaction().equals(other.getMoneyexpressaction()))
            && (this.getMoneyorigin1() == null ? other.getMoneyorigin1() == null : this.getMoneyorigin1().equals(other.getMoneyorigin1()))
            && (this.getMoneyorigin2() == null ? other.getMoneyorigin2() == null : this.getMoneyorigin2().equals(other.getMoneyorigin2()))
            && (this.getMoneyorigin3() == null ? other.getMoneyorigin3() == null : this.getMoneyorigin3().equals(other.getMoneyorigin3()))
            && (this.getMoneyorigin4() == null ? other.getMoneyorigin4() == null : this.getMoneyorigin4().equals(other.getMoneyorigin4()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getUploadtime() == null ? other.getUploadtime() == null : this.getUploadtime().equals(other.getUploadtime()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getExpresstime() == null ? other.getExpresstime() == null : this.getExpresstime().equals(other.getExpresstime()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getExpressunit() == null ? other.getExpressunit() == null : this.getExpressunit().equals(other.getExpressunit()))
            && (this.getExpressweight() == null ? other.getExpressweight() == null : this.getExpressweight().equals(other.getExpressweight()))
            && (this.getPayid() == null ? other.getPayid() == null : this.getPayid().equals(other.getPayid()))
            && (this.getPayoper() == null ? other.getPayoper() == null : this.getPayoper().equals(other.getPayoper()))
            && (this.getExpressoper() == null ? other.getExpressoper() == null : this.getExpressoper().equals(other.getExpressoper()))
            && (this.getStockoper() == null ? other.getStockoper() == null : this.getStockoper().equals(other.getStockoper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStatusdescr() == null ? other.getStatusdescr() == null : this.getStatusdescr().equals(other.getStatusdescr()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescr1() == null ? other.getDescr1() == null : this.getDescr1().equals(other.getDescr1()))
            && (this.getDescr2() == null ? other.getDescr2() == null : this.getDescr2().equals(other.getDescr2()))
            && (this.getDescr3() == null ? other.getDescr3() == null : this.getDescr3().equals(other.getDescr3()))
            && (this.getDelaydays() == null ? other.getDelaydays() == null : this.getDelaydays().equals(other.getDelaydays()))
            && (this.getOrdertypeid() == null ? other.getOrdertypeid() == null : this.getOrdertypeid().equals(other.getOrdertypeid()))
            && (this.getOrdertypename() == null ? other.getOrdertypename() == null : this.getOrdertypename().equals(other.getOrdertypename()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getAlertflag() == null ? other.getAlertflag() == null : this.getAlertflag().equals(other.getAlertflag()))
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
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getReserve17() == null ? other.getReserve17() == null : this.getReserve17().equals(other.getReserve17()))
            && (this.getReserve18() == null ? other.getReserve18() == null : this.getReserve18().equals(other.getReserve18()))
            && (this.getReserve19() == null ? other.getReserve19() == null : this.getReserve19().equals(other.getReserve19()))
            && (this.getReserve20() == null ? other.getReserve20() == null : this.getReserve20().equals(other.getReserve20()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getNotestoyourself() == null ? other.getNotestoyourself() == null : this.getNotestoyourself().equals(other.getNotestoyourself()))
            && (this.getPostageservice() == null ? other.getPostageservice() == null : this.getPostageservice().equals(other.getPostageservice()))
            && (this.getPackagingid() == null ? other.getPackagingid() == null : this.getPackagingid().equals(other.getPackagingid()))
            && (this.getPackagingname() == null ? other.getPackagingname() == null : this.getPackagingname().equals(other.getPackagingname()))
            && (this.getPackagingweight() == null ? other.getPackagingweight() == null : this.getPackagingweight().equals(other.getPackagingweight()))
            && (this.getPackagingclass() == null ? other.getPackagingclass() == null : this.getPackagingclass().equals(other.getPackagingclass()))
            && (this.getOrderweight() == null ? other.getOrderweight() == null : this.getOrderweight().equals(other.getOrderweight()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getSellnum() == null ? other.getSellnum() == null : this.getSellnum().equals(other.getSellnum()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getOrdersource() == null ? other.getOrdersource() == null : this.getOrdersource().equals(other.getOrdersource()))
            && (this.getRefundflag() == null ? other.getRefundflag() == null : this.getRefundflag().equals(other.getRefundflag()))
            && (this.getRefundrmb() == null ? other.getRefundrmb() == null : this.getRefundrmb().equals(other.getRefundrmb()))
            && (this.getRefundloss() == null ? other.getRefundloss() == null : this.getRefundloss().equals(other.getRefundloss()))
            && (this.getRefundoriginal() == null ? other.getRefundoriginal() == null : this.getRefundoriginal().equals(other.getRefundoriginal()))
            && (this.getBansendflag() == null ? other.getBansendflag() == null : this.getBansendflag().equals(other.getBansendflag()))
            && (this.getSlreserve1() == null ? other.getSlreserve1() == null : this.getSlreserve1().equals(other.getSlreserve1()))
            && (this.getSlreserve2() == null ? other.getSlreserve2() == null : this.getSlreserve2().equals(other.getSlreserve2()))
            && (this.getSlreserve3() == null ? other.getSlreserve3() == null : this.getSlreserve3().equals(other.getSlreserve3()))
            && (this.getSlreserve4() == null ? other.getSlreserve4() == null : this.getSlreserve4().equals(other.getSlreserve4()))
            && (this.getSlreserve5() == null ? other.getSlreserve5() == null : this.getSlreserve5().equals(other.getSlreserve5()))
            && (this.getSlreserve6() == null ? other.getSlreserve6() == null : this.getSlreserve6().equals(other.getSlreserve6()))
            && (this.getSlreserve7() == null ? other.getSlreserve7() == null : this.getSlreserve7().equals(other.getSlreserve7()))
            && (this.getSlreserve8() == null ? other.getSlreserve8() == null : this.getSlreserve8().equals(other.getSlreserve8()))
            && (this.getSlreserve9() == null ? other.getSlreserve9() == null : this.getSlreserve9().equals(other.getSlreserve9()))
            && (this.getSlreserve10() == null ? other.getSlreserve10() == null : this.getSlreserve10().equals(other.getSlreserve10()))
            && (this.getXbreserve1() == null ? other.getXbreserve1() == null : this.getXbreserve1().equals(other.getXbreserve1()))
            && (this.getXbreserve2() == null ? other.getXbreserve2() == null : this.getXbreserve2().equals(other.getXbreserve2()))
            && (this.getXbreserve3() == null ? other.getXbreserve3() == null : this.getXbreserve3().equals(other.getXbreserve3()))
            && (this.getXbreserve4() == null ? other.getXbreserve4() == null : this.getXbreserve4().equals(other.getXbreserve4()))
            && (this.getXbreserve5() == null ? other.getXbreserve5() == null : this.getXbreserve5().equals(other.getXbreserve5()))
            && (this.getXbreserve6() == null ? other.getXbreserve6() == null : this.getXbreserve6().equals(other.getXbreserve6()))
            && (this.getXbreserve7() == null ? other.getXbreserve7() == null : this.getXbreserve7().equals(other.getXbreserve7()))
            && (this.getXbreserve8() == null ? other.getXbreserve8() == null : this.getXbreserve8().equals(other.getXbreserve8()))
            && (this.getQlreserve1() == null ? other.getQlreserve1() == null : this.getQlreserve1().equals(other.getQlreserve1()))
            && (this.getQlreserve2() == null ? other.getQlreserve2() == null : this.getQlreserve2().equals(other.getQlreserve2()))
            && (this.getQlreserve3() == null ? other.getQlreserve3() == null : this.getQlreserve3().equals(other.getQlreserve3()))
            && (this.getQlreserve4() == null ? other.getQlreserve4() == null : this.getQlreserve4().equals(other.getQlreserve4()))
            && (this.getQlreserve5() == null ? other.getQlreserve5() == null : this.getQlreserve5().equals(other.getQlreserve5()))
            && (this.getQlreserve6() == null ? other.getQlreserve6() == null : this.getQlreserve6().equals(other.getQlreserve6()))
            && (this.getQlreserve7() == null ? other.getQlreserve7() == null : this.getQlreserve7().equals(other.getQlreserve7()))
            && (this.getQlreserve8() == null ? other.getQlreserve8() == null : this.getQlreserve8().equals(other.getQlreserve8()))
            && (this.getMoneyrate() == null ? other.getMoneyrate() == null : this.getMoneyrate().equals(other.getMoneyrate()))
            && (this.getOriginordermoney() == null ? other.getOriginordermoney() == null : this.getOriginordermoney().equals(other.getOriginordermoney()))
            && (this.getOriginexpressmoney() == null ? other.getOriginexpressmoney() == null : this.getOriginexpressmoney().equals(other.getOriginexpressmoney()))
            && (this.getOrigininsurance() == null ? other.getOrigininsurance() == null : this.getOrigininsurance().equals(other.getOrigininsurance()))
            && (this.getOriginfinalvaluefee() == null ? other.getOriginfinalvaluefee() == null : this.getOriginfinalvaluefee().equals(other.getOriginfinalvaluefee()))
            && (this.getActionorderweight() == null ? other.getActionorderweight() == null : this.getActionorderweight().equals(other.getActionorderweight()))
            && (this.getFinalvaluefee() == null ? other.getFinalvaluefee() == null : this.getFinalvaluefee().equals(other.getFinalvaluefee()))
            && (this.getOrdermoney() == null ? other.getOrdermoney() == null : this.getOrdermoney().equals(other.getOrdermoney()))
            && (this.getXbtime1() == null ? other.getXbtime1() == null : this.getXbtime1().equals(other.getXbtime1()))
            && (this.getXbtime2() == null ? other.getXbtime2() == null : this.getXbtime2().equals(other.getXbtime2()))
            && (this.getXbtime3() == null ? other.getXbtime3() == null : this.getXbtime3().equals(other.getXbtime3()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()))
            && (this.getBasemoney() == null ? other.getBasemoney() == null : this.getBasemoney().equals(other.getBasemoney()))
            && (this.getBaseweight() == null ? other.getBaseweight() == null : this.getBaseweight().equals(other.getBaseweight()))
            && (this.getUnitmoney() == null ? other.getUnitmoney() == null : this.getUnitmoney().equals(other.getUnitmoney()))
            && (this.getFixedmoney1() == null ? other.getFixedmoney1() == null : this.getFixedmoney1().equals(other.getFixedmoney1()))
            && (this.getFixedmoney2() == null ? other.getFixedmoney2() == null : this.getFixedmoney2().equals(other.getFixedmoney2()))
            && (this.getUnitweight() == null ? other.getUnitweight() == null : this.getUnitweight().equals(other.getUnitweight()))
            && (this.getPaypacountry() == null ? other.getPaypacountry() == null : this.getPaypacountry().equals(other.getPaypacountry()))
            && (this.getPaypalstatus() == null ? other.getPaypalstatus() == null : this.getPaypalstatus().equals(other.getPaypalstatus()))
            && (this.getPaypalfeeamount() == null ? other.getPaypalfeeamount() == null : this.getPaypalfeeamount().equals(other.getPaypalfeeamount()))
            && (this.getPaypalgrossamount() == null ? other.getPaypalgrossamount() == null : this.getPaypalgrossamount().equals(other.getPaypalgrossamount()))
            && (this.getPaypalnetamount() == null ? other.getPaypalnetamount() == null : this.getPaypalnetamount().equals(other.getPaypalnetamount()))
            && (this.getPaypalstreet() == null ? other.getPaypalstreet() == null : this.getPaypalstreet().equals(other.getPaypalstreet()))
            && (this.getPaypalstreet1() == null ? other.getPaypalstreet1() == null : this.getPaypalstreet1().equals(other.getPaypalstreet1()))
            && (this.getPaypalstreet2() == null ? other.getPaypalstreet2() == null : this.getPaypalstreet2().equals(other.getPaypalstreet2()))
            && (this.getPaypalcity() == null ? other.getPaypalcity() == null : this.getPaypalcity().equals(other.getPaypalcity()))
            && (this.getPaypalprovince() == null ? other.getPaypalprovince() == null : this.getPaypalprovince().equals(other.getPaypalprovince()))
            && (this.getEbaycustomeraddress() == null ? other.getEbaycustomeraddress() == null : this.getEbaycustomeraddress().equals(other.getEbaycustomeraddress()))
            && (this.getPaypalcustomeraddress() == null ? other.getPaypalcustomeraddress() == null : this.getPaypalcustomeraddress().equals(other.getPaypalcustomeraddress()))
            && (this.getPaypalflag() == null ? other.getPaypalflag() == null : this.getPaypalflag().equals(other.getPaypalflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getTradetype() == null) ? 0 : getTradetype().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getTradeurl() == null) ? 0 : getTradeurl().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomersex() == null) ? 0 : getCustomersex().hashCode());
        result = prime * result + ((getCustomerage() == null) ? 0 : getCustomerage().hashCode());
        result = prime * result + ((getCustomerbirthday() == null) ? 0 : getCustomerbirthday().hashCode());
        result = prime * result + ((getCustomerfirstname() == null) ? 0 : getCustomerfirstname().hashCode());
        result = prime * result + ((getCustomerlastname() == null) ? 0 : getCustomerlastname().hashCode());
        result = prime * result + ((getCustomertype() == null) ? 0 : getCustomertype().hashCode());
        result = prime * result + ((getCustomertel1() == null) ? 0 : getCustomertel1().hashCode());
        result = prime * result + ((getCustomertel2() == null) ? 0 : getCustomertel2().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomerqq() == null) ? 0 : getCustomerqq().hashCode());
        result = prime * result + ((getCustomermsn() == null) ? 0 : getCustomermsn().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomerfax() == null) ? 0 : getCustomerfax().hashCode());
        result = prime * result + ((getCustomerreserve1() == null) ? 0 : getCustomerreserve1().hashCode());
        result = prime * result + ((getCustomerreserve2() == null) ? 0 : getCustomerreserve2().hashCode());
        result = prime * result + ((getCustomerreserve3() == null) ? 0 : getCustomerreserve3().hashCode());
        result = prime * result + ((getCustomerreserve4() == null) ? 0 : getCustomerreserve4().hashCode());
        result = prime * result + ((getCustomerreserve5() == null) ? 0 : getCustomerreserve5().hashCode());
        result = prime * result + ((getCustomerreserve6() == null) ? 0 : getCustomerreserve6().hashCode());
        result = prime * result + ((getCustomerreserve7() == null) ? 0 : getCustomerreserve7().hashCode());
        result = prime * result + ((getCustomerreserve8() == null) ? 0 : getCustomerreserve8().hashCode());
        result = prime * result + ((getCustomerreserve9() == null) ? 0 : getCustomerreserve9().hashCode());
        result = prime * result + ((getCustomerreserve10() == null) ? 0 : getCustomerreserve10().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getMoneyask() == null) ? 0 : getMoneyask().hashCode());
        result = prime * result + ((getMoneyaction() == null) ? 0 : getMoneyaction().hashCode());
        result = prime * result + ((getMoneyexpressask() == null) ? 0 : getMoneyexpressask().hashCode());
        result = prime * result + ((getMoneyexpressaction() == null) ? 0 : getMoneyexpressaction().hashCode());
        result = prime * result + ((getMoneyorigin1() == null) ? 0 : getMoneyorigin1().hashCode());
        result = prime * result + ((getMoneyorigin2() == null) ? 0 : getMoneyorigin2().hashCode());
        result = prime * result + ((getMoneyorigin3() == null) ? 0 : getMoneyorigin3().hashCode());
        result = prime * result + ((getMoneyorigin4() == null) ? 0 : getMoneyorigin4().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getUploadtime() == null) ? 0 : getUploadtime().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getExpresstime() == null) ? 0 : getExpresstime().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getExpressunit() == null) ? 0 : getExpressunit().hashCode());
        result = prime * result + ((getExpressweight() == null) ? 0 : getExpressweight().hashCode());
        result = prime * result + ((getPayid() == null) ? 0 : getPayid().hashCode());
        result = prime * result + ((getPayoper() == null) ? 0 : getPayoper().hashCode());
        result = prime * result + ((getExpressoper() == null) ? 0 : getExpressoper().hashCode());
        result = prime * result + ((getStockoper() == null) ? 0 : getStockoper().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStatusdescr() == null) ? 0 : getStatusdescr().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDescr1() == null) ? 0 : getDescr1().hashCode());
        result = prime * result + ((getDescr2() == null) ? 0 : getDescr2().hashCode());
        result = prime * result + ((getDescr3() == null) ? 0 : getDescr3().hashCode());
        result = prime * result + ((getDelaydays() == null) ? 0 : getDelaydays().hashCode());
        result = prime * result + ((getOrdertypeid() == null) ? 0 : getOrdertypeid().hashCode());
        result = prime * result + ((getOrdertypename() == null) ? 0 : getOrdertypename().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getAlertflag() == null) ? 0 : getAlertflag().hashCode());
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
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getReserve17() == null) ? 0 : getReserve17().hashCode());
        result = prime * result + ((getReserve18() == null) ? 0 : getReserve18().hashCode());
        result = prime * result + ((getReserve19() == null) ? 0 : getReserve19().hashCode());
        result = prime * result + ((getReserve20() == null) ? 0 : getReserve20().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getNotestoyourself() == null) ? 0 : getNotestoyourself().hashCode());
        result = prime * result + ((getPostageservice() == null) ? 0 : getPostageservice().hashCode());
        result = prime * result + ((getPackagingid() == null) ? 0 : getPackagingid().hashCode());
        result = prime * result + ((getPackagingname() == null) ? 0 : getPackagingname().hashCode());
        result = prime * result + ((getPackagingweight() == null) ? 0 : getPackagingweight().hashCode());
        result = prime * result + ((getPackagingclass() == null) ? 0 : getPackagingclass().hashCode());
        result = prime * result + ((getOrderweight() == null) ? 0 : getOrderweight().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getSellnum() == null) ? 0 : getSellnum().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getOrdersource() == null) ? 0 : getOrdersource().hashCode());
        result = prime * result + ((getRefundflag() == null) ? 0 : getRefundflag().hashCode());
        result = prime * result + ((getRefundrmb() == null) ? 0 : getRefundrmb().hashCode());
        result = prime * result + ((getRefundloss() == null) ? 0 : getRefundloss().hashCode());
        result = prime * result + ((getRefundoriginal() == null) ? 0 : getRefundoriginal().hashCode());
        result = prime * result + ((getBansendflag() == null) ? 0 : getBansendflag().hashCode());
        result = prime * result + ((getSlreserve1() == null) ? 0 : getSlreserve1().hashCode());
        result = prime * result + ((getSlreserve2() == null) ? 0 : getSlreserve2().hashCode());
        result = prime * result + ((getSlreserve3() == null) ? 0 : getSlreserve3().hashCode());
        result = prime * result + ((getSlreserve4() == null) ? 0 : getSlreserve4().hashCode());
        result = prime * result + ((getSlreserve5() == null) ? 0 : getSlreserve5().hashCode());
        result = prime * result + ((getSlreserve6() == null) ? 0 : getSlreserve6().hashCode());
        result = prime * result + ((getSlreserve7() == null) ? 0 : getSlreserve7().hashCode());
        result = prime * result + ((getSlreserve8() == null) ? 0 : getSlreserve8().hashCode());
        result = prime * result + ((getSlreserve9() == null) ? 0 : getSlreserve9().hashCode());
        result = prime * result + ((getSlreserve10() == null) ? 0 : getSlreserve10().hashCode());
        result = prime * result + ((getXbreserve1() == null) ? 0 : getXbreserve1().hashCode());
        result = prime * result + ((getXbreserve2() == null) ? 0 : getXbreserve2().hashCode());
        result = prime * result + ((getXbreserve3() == null) ? 0 : getXbreserve3().hashCode());
        result = prime * result + ((getXbreserve4() == null) ? 0 : getXbreserve4().hashCode());
        result = prime * result + ((getXbreserve5() == null) ? 0 : getXbreserve5().hashCode());
        result = prime * result + ((getXbreserve6() == null) ? 0 : getXbreserve6().hashCode());
        result = prime * result + ((getXbreserve7() == null) ? 0 : getXbreserve7().hashCode());
        result = prime * result + ((getXbreserve8() == null) ? 0 : getXbreserve8().hashCode());
        result = prime * result + ((getQlreserve1() == null) ? 0 : getQlreserve1().hashCode());
        result = prime * result + ((getQlreserve2() == null) ? 0 : getQlreserve2().hashCode());
        result = prime * result + ((getQlreserve3() == null) ? 0 : getQlreserve3().hashCode());
        result = prime * result + ((getQlreserve4() == null) ? 0 : getQlreserve4().hashCode());
        result = prime * result + ((getQlreserve5() == null) ? 0 : getQlreserve5().hashCode());
        result = prime * result + ((getQlreserve6() == null) ? 0 : getQlreserve6().hashCode());
        result = prime * result + ((getQlreserve7() == null) ? 0 : getQlreserve7().hashCode());
        result = prime * result + ((getQlreserve8() == null) ? 0 : getQlreserve8().hashCode());
        result = prime * result + ((getMoneyrate() == null) ? 0 : getMoneyrate().hashCode());
        result = prime * result + ((getOriginordermoney() == null) ? 0 : getOriginordermoney().hashCode());
        result = prime * result + ((getOriginexpressmoney() == null) ? 0 : getOriginexpressmoney().hashCode());
        result = prime * result + ((getOrigininsurance() == null) ? 0 : getOrigininsurance().hashCode());
        result = prime * result + ((getOriginfinalvaluefee() == null) ? 0 : getOriginfinalvaluefee().hashCode());
        result = prime * result + ((getActionorderweight() == null) ? 0 : getActionorderweight().hashCode());
        result = prime * result + ((getFinalvaluefee() == null) ? 0 : getFinalvaluefee().hashCode());
        result = prime * result + ((getOrdermoney() == null) ? 0 : getOrdermoney().hashCode());
        result = prime * result + ((getXbtime1() == null) ? 0 : getXbtime1().hashCode());
        result = prime * result + ((getXbtime2() == null) ? 0 : getXbtime2().hashCode());
        result = prime * result + ((getXbtime3() == null) ? 0 : getXbtime3().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        result = prime * result + ((getBasemoney() == null) ? 0 : getBasemoney().hashCode());
        result = prime * result + ((getBaseweight() == null) ? 0 : getBaseweight().hashCode());
        result = prime * result + ((getUnitmoney() == null) ? 0 : getUnitmoney().hashCode());
        result = prime * result + ((getFixedmoney1() == null) ? 0 : getFixedmoney1().hashCode());
        result = prime * result + ((getFixedmoney2() == null) ? 0 : getFixedmoney2().hashCode());
        result = prime * result + ((getUnitweight() == null) ? 0 : getUnitweight().hashCode());
        result = prime * result + ((getPaypacountry() == null) ? 0 : getPaypacountry().hashCode());
        result = prime * result + ((getPaypalstatus() == null) ? 0 : getPaypalstatus().hashCode());
        result = prime * result + ((getPaypalfeeamount() == null) ? 0 : getPaypalfeeamount().hashCode());
        result = prime * result + ((getPaypalgrossamount() == null) ? 0 : getPaypalgrossamount().hashCode());
        result = prime * result + ((getPaypalnetamount() == null) ? 0 : getPaypalnetamount().hashCode());
        result = prime * result + ((getPaypalstreet() == null) ? 0 : getPaypalstreet().hashCode());
        result = prime * result + ((getPaypalstreet1() == null) ? 0 : getPaypalstreet1().hashCode());
        result = prime * result + ((getPaypalstreet2() == null) ? 0 : getPaypalstreet2().hashCode());
        result = prime * result + ((getPaypalcity() == null) ? 0 : getPaypalcity().hashCode());
        result = prime * result + ((getPaypalprovince() == null) ? 0 : getPaypalprovince().hashCode());
        result = prime * result + ((getEbaycustomeraddress() == null) ? 0 : getEbaycustomeraddress().hashCode());
        result = prime * result + ((getPaypalcustomeraddress() == null) ? 0 : getPaypalcustomeraddress().hashCode());
        result = prime * result + ((getPaypalflag() == null) ? 0 : getPaypalflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", corpid=").append(corpid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", tradetype=").append(tradetype);
        sb.append(", groupid=").append(groupid);
        sb.append(", tradeurl=").append(tradeurl);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", customersex=").append(customersex);
        sb.append(", customerage=").append(customerage);
        sb.append(", customerbirthday=").append(customerbirthday);
        sb.append(", customerfirstname=").append(customerfirstname);
        sb.append(", customerlastname=").append(customerlastname);
        sb.append(", customertype=").append(customertype);
        sb.append(", customertel1=").append(customertel1);
        sb.append(", customertel2=").append(customertel2);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customerqq=").append(customerqq);
        sb.append(", customermsn=").append(customermsn);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customerfax=").append(customerfax);
        sb.append(", customerreserve1=").append(customerreserve1);
        sb.append(", customerreserve2=").append(customerreserve2);
        sb.append(", customerreserve3=").append(customerreserve3);
        sb.append(", customerreserve4=").append(customerreserve4);
        sb.append(", customerreserve5=").append(customerreserve5);
        sb.append(", customerreserve6=").append(customerreserve6);
        sb.append(", customerreserve7=").append(customerreserve7);
        sb.append(", customerreserve8=").append(customerreserve8);
        sb.append(", customerreserve9=").append(customerreserve9);
        sb.append(", customerreserve10=").append(customerreserve10);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", moneyask=").append(moneyask);
        sb.append(", moneyaction=").append(moneyaction);
        sb.append(", moneyexpressask=").append(moneyexpressask);
        sb.append(", moneyexpressaction=").append(moneyexpressaction);
        sb.append(", moneyorigin1=").append(moneyorigin1);
        sb.append(", moneyorigin2=").append(moneyorigin2);
        sb.append(", moneyorigin3=").append(moneyorigin3);
        sb.append(", moneyorigin4=").append(moneyorigin4);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", paytime=").append(paytime);
        sb.append(", expresstime=").append(expresstime);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", expressid=").append(expressid);
        sb.append(", expressunit=").append(expressunit);
        sb.append(", expressweight=").append(expressweight);
        sb.append(", payid=").append(payid);
        sb.append(", payoper=").append(payoper);
        sb.append(", expressoper=").append(expressoper);
        sb.append(", stockoper=").append(stockoper);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", stype=").append(stype);
        sb.append(", status=").append(status);
        sb.append(", statusdescr=").append(statusdescr);
        sb.append(", content=").append(content);
        sb.append(", descr1=").append(descr1);
        sb.append(", descr2=").append(descr2);
        sb.append(", descr3=").append(descr3);
        sb.append(", delaydays=").append(delaydays);
        sb.append(", ordertypeid=").append(ordertypeid);
        sb.append(", ordertypename=").append(ordertypename);
        sb.append(", color=").append(color);
        sb.append(", alertflag=").append(alertflag);
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
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", reserve17=").append(reserve17);
        sb.append(", reserve18=").append(reserve18);
        sb.append(", reserve19=").append(reserve19);
        sb.append(", reserve20=").append(reserve20);
        sb.append(", insurance=").append(insurance);
        sb.append(", notestoyourself=").append(notestoyourself);
        sb.append(", postageservice=").append(postageservice);
        sb.append(", packagingid=").append(packagingid);
        sb.append(", packagingname=").append(packagingname);
        sb.append(", packagingweight=").append(packagingweight);
        sb.append(", packagingclass=").append(packagingclass);
        sb.append(", orderweight=").append(orderweight);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", storageid=").append(storageid);
        sb.append(", locationid=").append(locationid);
        sb.append(", sellnum=").append(sellnum);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", location=").append(location);
        sb.append(", storage=").append(storage);
        sb.append(", ordersource=").append(ordersource);
        sb.append(", refundflag=").append(refundflag);
        sb.append(", refundrmb=").append(refundrmb);
        sb.append(", refundloss=").append(refundloss);
        sb.append(", refundoriginal=").append(refundoriginal);
        sb.append(", bansendflag=").append(bansendflag);
        sb.append(", slreserve1=").append(slreserve1);
        sb.append(", slreserve2=").append(slreserve2);
        sb.append(", slreserve3=").append(slreserve3);
        sb.append(", slreserve4=").append(slreserve4);
        sb.append(", slreserve5=").append(slreserve5);
        sb.append(", slreserve6=").append(slreserve6);
        sb.append(", slreserve7=").append(slreserve7);
        sb.append(", slreserve8=").append(slreserve8);
        sb.append(", slreserve9=").append(slreserve9);
        sb.append(", slreserve10=").append(slreserve10);
        sb.append(", xbreserve1=").append(xbreserve1);
        sb.append(", xbreserve2=").append(xbreserve2);
        sb.append(", xbreserve3=").append(xbreserve3);
        sb.append(", xbreserve4=").append(xbreserve4);
        sb.append(", xbreserve5=").append(xbreserve5);
        sb.append(", xbreserve6=").append(xbreserve6);
        sb.append(", xbreserve7=").append(xbreserve7);
        sb.append(", xbreserve8=").append(xbreserve8);
        sb.append(", qlreserve1=").append(qlreserve1);
        sb.append(", qlreserve2=").append(qlreserve2);
        sb.append(", qlreserve3=").append(qlreserve3);
        sb.append(", qlreserve4=").append(qlreserve4);
        sb.append(", qlreserve5=").append(qlreserve5);
        sb.append(", qlreserve6=").append(qlreserve6);
        sb.append(", qlreserve7=").append(qlreserve7);
        sb.append(", qlreserve8=").append(qlreserve8);
        sb.append(", moneyrate=").append(moneyrate);
        sb.append(", originordermoney=").append(originordermoney);
        sb.append(", originexpressmoney=").append(originexpressmoney);
        sb.append(", origininsurance=").append(origininsurance);
        sb.append(", originfinalvaluefee=").append(originfinalvaluefee);
        sb.append(", actionorderweight=").append(actionorderweight);
        sb.append(", finalvaluefee=").append(finalvaluefee);
        sb.append(", ordermoney=").append(ordermoney);
        sb.append(", xbtime1=").append(xbtime1);
        sb.append(", xbtime2=").append(xbtime2);
        sb.append(", xbtime3=").append(xbtime3);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", basemoney=").append(basemoney);
        sb.append(", baseweight=").append(baseweight);
        sb.append(", unitmoney=").append(unitmoney);
        sb.append(", fixedmoney1=").append(fixedmoney1);
        sb.append(", fixedmoney2=").append(fixedmoney2);
        sb.append(", unitweight=").append(unitweight);
        sb.append(", paypacountry=").append(paypacountry);
        sb.append(", paypalstatus=").append(paypalstatus);
        sb.append(", paypalfeeamount=").append(paypalfeeamount);
        sb.append(", paypalgrossamount=").append(paypalgrossamount);
        sb.append(", paypalnetamount=").append(paypalnetamount);
        sb.append(", paypalstreet=").append(paypalstreet);
        sb.append(", paypalstreet1=").append(paypalstreet1);
        sb.append(", paypalstreet2=").append(paypalstreet2);
        sb.append(", paypalcity=").append(paypalcity);
        sb.append(", paypalprovince=").append(paypalprovince);
        sb.append(", ebaycustomeraddress=").append(ebaycustomeraddress);
        sb.append(", paypalcustomeraddress=").append(paypalcustomeraddress);
        sb.append(", paypalflag=").append(paypalflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}