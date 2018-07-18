package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbOriginaliorder implements Serializable {
    private BigDecimal id;

    private String orderid;

    private Long companyid;

    private String buyerloginid;

    private String buyeruserid;

    private String buyername;

    private Long shopid;

    private Date createdtime;

    private String orderstatus;

    private String firstname;

    private String lastname;

    private Date paidtime;

    private Long timeoutlefttime;

    private Date closetime;

    private String fundstatus;

    private String salesrecordnumber;

    private String street1;

    private String street2;

    private String city;

    private String province;

    private String countryen;

    private String countrycn;

    private String countrycode;

    private String phone1;

    private String phone2;

    private String postalcode;

    private String email;

    private BigDecimal itemtotalorigin;

    private BigDecimal shippingcostorigin;

    private BigDecimal ordertotalorigin;

    private BigDecimal platformfeeorigin;

    private BigDecimal insurancefeeorigin;

    private String currencyid;

    private BigDecimal paypalfeeorigin;

    private String paypalcurrencyid;

    private String paypalid;

    private String shippingservice;

    private String buyercheckoutmessage;

    private BigDecimal importid;

    private String shippingservicetype;

    private String issuestatus;

    private String frozenstatus;

    private String sellersignerfullname;

    private Long paidflag;

    private BigDecimal alliancefee;

    private String logisticsno;

    private String logisticsservicename;

    private Long issave;

    private Date opertime;

    private String itemjson;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public String getBuyerloginid() {
        return buyerloginid;
    }

    public void setBuyerloginid(String buyerloginid) {
        this.buyerloginid = buyerloginid == null ? null : buyerloginid.trim();
    }

    public String getBuyeruserid() {
        return buyeruserid;
    }

    public void setBuyeruserid(String buyeruserid) {
        this.buyeruserid = buyeruserid == null ? null : buyeruserid.trim();
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public Date getPaidtime() {
        return paidtime;
    }

    public void setPaidtime(Date paidtime) {
        this.paidtime = paidtime;
    }

    public Long getTimeoutlefttime() {
        return timeoutlefttime;
    }

    public void setTimeoutlefttime(Long timeoutlefttime) {
        this.timeoutlefttime = timeoutlefttime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public String getFundstatus() {
        return fundstatus;
    }

    public void setFundstatus(String fundstatus) {
        this.fundstatus = fundstatus == null ? null : fundstatus.trim();
    }

    public String getSalesrecordnumber() {
        return salesrecordnumber;
    }

    public void setSalesrecordnumber(String salesrecordnumber) {
        this.salesrecordnumber = salesrecordnumber == null ? null : salesrecordnumber.trim();
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1 == null ? null : street1.trim();
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2 == null ? null : street2.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountryen() {
        return countryen;
    }

    public void setCountryen(String countryen) {
        this.countryen = countryen == null ? null : countryen.trim();
    }

    public String getCountrycn() {
        return countrycn;
    }

    public void setCountrycn(String countrycn) {
        this.countrycn = countrycn == null ? null : countrycn.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getItemtotalorigin() {
        return itemtotalorigin;
    }

    public void setItemtotalorigin(BigDecimal itemtotalorigin) {
        this.itemtotalorigin = itemtotalorigin;
    }

    public BigDecimal getShippingcostorigin() {
        return shippingcostorigin;
    }

    public void setShippingcostorigin(BigDecimal shippingcostorigin) {
        this.shippingcostorigin = shippingcostorigin;
    }

    public BigDecimal getOrdertotalorigin() {
        return ordertotalorigin;
    }

    public void setOrdertotalorigin(BigDecimal ordertotalorigin) {
        this.ordertotalorigin = ordertotalorigin;
    }

    public BigDecimal getPlatformfeeorigin() {
        return platformfeeorigin;
    }

    public void setPlatformfeeorigin(BigDecimal platformfeeorigin) {
        this.platformfeeorigin = platformfeeorigin;
    }

    public BigDecimal getInsurancefeeorigin() {
        return insurancefeeorigin;
    }

    public void setInsurancefeeorigin(BigDecimal insurancefeeorigin) {
        this.insurancefeeorigin = insurancefeeorigin;
    }

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid == null ? null : currencyid.trim();
    }

    public BigDecimal getPaypalfeeorigin() {
        return paypalfeeorigin;
    }

    public void setPaypalfeeorigin(BigDecimal paypalfeeorigin) {
        this.paypalfeeorigin = paypalfeeorigin;
    }

    public String getPaypalcurrencyid() {
        return paypalcurrencyid;
    }

    public void setPaypalcurrencyid(String paypalcurrencyid) {
        this.paypalcurrencyid = paypalcurrencyid == null ? null : paypalcurrencyid.trim();
    }

    public String getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(String paypalid) {
        this.paypalid = paypalid == null ? null : paypalid.trim();
    }

    public String getShippingservice() {
        return shippingservice;
    }

    public void setShippingservice(String shippingservice) {
        this.shippingservice = shippingservice == null ? null : shippingservice.trim();
    }

    public String getBuyercheckoutmessage() {
        return buyercheckoutmessage;
    }

    public void setBuyercheckoutmessage(String buyercheckoutmessage) {
        this.buyercheckoutmessage = buyercheckoutmessage == null ? null : buyercheckoutmessage.trim();
    }

    public BigDecimal getImportid() {
        return importid;
    }

    public void setImportid(BigDecimal importid) {
        this.importid = importid;
    }

    public String getShippingservicetype() {
        return shippingservicetype;
    }

    public void setShippingservicetype(String shippingservicetype) {
        this.shippingservicetype = shippingservicetype == null ? null : shippingservicetype.trim();
    }

    public String getIssuestatus() {
        return issuestatus;
    }

    public void setIssuestatus(String issuestatus) {
        this.issuestatus = issuestatus == null ? null : issuestatus.trim();
    }

    public String getFrozenstatus() {
        return frozenstatus;
    }

    public void setFrozenstatus(String frozenstatus) {
        this.frozenstatus = frozenstatus == null ? null : frozenstatus.trim();
    }

    public String getSellersignerfullname() {
        return sellersignerfullname;
    }

    public void setSellersignerfullname(String sellersignerfullname) {
        this.sellersignerfullname = sellersignerfullname == null ? null : sellersignerfullname.trim();
    }

    public Long getPaidflag() {
        return paidflag;
    }

    public void setPaidflag(Long paidflag) {
        this.paidflag = paidflag;
    }

    public BigDecimal getAlliancefee() {
        return alliancefee;
    }

    public void setAlliancefee(BigDecimal alliancefee) {
        this.alliancefee = alliancefee;
    }

    public String getLogisticsno() {
        return logisticsno;
    }

    public void setLogisticsno(String logisticsno) {
        this.logisticsno = logisticsno == null ? null : logisticsno.trim();
    }

    public String getLogisticsservicename() {
        return logisticsservicename;
    }

    public void setLogisticsservicename(String logisticsservicename) {
        this.logisticsservicename = logisticsservicename == null ? null : logisticsservicename.trim();
    }

    public Long getIssave() {
        return issave;
    }

    public void setIssave(Long issave) {
        this.issave = issave;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getItemjson() {
        return itemjson;
    }

    public void setItemjson(String itemjson) {
        this.itemjson = itemjson == null ? null : itemjson.trim();
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
        DbOriginaliorder other = (DbOriginaliorder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getBuyerloginid() == null ? other.getBuyerloginid() == null : this.getBuyerloginid().equals(other.getBuyerloginid()))
            && (this.getBuyeruserid() == null ? other.getBuyeruserid() == null : this.getBuyeruserid().equals(other.getBuyeruserid()))
            && (this.getBuyername() == null ? other.getBuyername() == null : this.getBuyername().equals(other.getBuyername()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getCreatedtime() == null ? other.getCreatedtime() == null : this.getCreatedtime().equals(other.getCreatedtime()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getPaidtime() == null ? other.getPaidtime() == null : this.getPaidtime().equals(other.getPaidtime()))
            && (this.getTimeoutlefttime() == null ? other.getTimeoutlefttime() == null : this.getTimeoutlefttime().equals(other.getTimeoutlefttime()))
            && (this.getClosetime() == null ? other.getClosetime() == null : this.getClosetime().equals(other.getClosetime()))
            && (this.getFundstatus() == null ? other.getFundstatus() == null : this.getFundstatus().equals(other.getFundstatus()))
            && (this.getSalesrecordnumber() == null ? other.getSalesrecordnumber() == null : this.getSalesrecordnumber().equals(other.getSalesrecordnumber()))
            && (this.getStreet1() == null ? other.getStreet1() == null : this.getStreet1().equals(other.getStreet1()))
            && (this.getStreet2() == null ? other.getStreet2() == null : this.getStreet2().equals(other.getStreet2()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCountryen() == null ? other.getCountryen() == null : this.getCountryen().equals(other.getCountryen()))
            && (this.getCountrycn() == null ? other.getCountrycn() == null : this.getCountrycn().equals(other.getCountrycn()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getPhone1() == null ? other.getPhone1() == null : this.getPhone1().equals(other.getPhone1()))
            && (this.getPhone2() == null ? other.getPhone2() == null : this.getPhone2().equals(other.getPhone2()))
            && (this.getPostalcode() == null ? other.getPostalcode() == null : this.getPostalcode().equals(other.getPostalcode()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getItemtotalorigin() == null ? other.getItemtotalorigin() == null : this.getItemtotalorigin().equals(other.getItemtotalorigin()))
            && (this.getShippingcostorigin() == null ? other.getShippingcostorigin() == null : this.getShippingcostorigin().equals(other.getShippingcostorigin()))
            && (this.getOrdertotalorigin() == null ? other.getOrdertotalorigin() == null : this.getOrdertotalorigin().equals(other.getOrdertotalorigin()))
            && (this.getPlatformfeeorigin() == null ? other.getPlatformfeeorigin() == null : this.getPlatformfeeorigin().equals(other.getPlatformfeeorigin()))
            && (this.getInsurancefeeorigin() == null ? other.getInsurancefeeorigin() == null : this.getInsurancefeeorigin().equals(other.getInsurancefeeorigin()))
            && (this.getCurrencyid() == null ? other.getCurrencyid() == null : this.getCurrencyid().equals(other.getCurrencyid()))
            && (this.getPaypalfeeorigin() == null ? other.getPaypalfeeorigin() == null : this.getPaypalfeeorigin().equals(other.getPaypalfeeorigin()))
            && (this.getPaypalcurrencyid() == null ? other.getPaypalcurrencyid() == null : this.getPaypalcurrencyid().equals(other.getPaypalcurrencyid()))
            && (this.getPaypalid() == null ? other.getPaypalid() == null : this.getPaypalid().equals(other.getPaypalid()))
            && (this.getShippingservice() == null ? other.getShippingservice() == null : this.getShippingservice().equals(other.getShippingservice()))
            && (this.getBuyercheckoutmessage() == null ? other.getBuyercheckoutmessage() == null : this.getBuyercheckoutmessage().equals(other.getBuyercheckoutmessage()))
            && (this.getImportid() == null ? other.getImportid() == null : this.getImportid().equals(other.getImportid()))
            && (this.getShippingservicetype() == null ? other.getShippingservicetype() == null : this.getShippingservicetype().equals(other.getShippingservicetype()))
            && (this.getIssuestatus() == null ? other.getIssuestatus() == null : this.getIssuestatus().equals(other.getIssuestatus()))
            && (this.getFrozenstatus() == null ? other.getFrozenstatus() == null : this.getFrozenstatus().equals(other.getFrozenstatus()))
            && (this.getSellersignerfullname() == null ? other.getSellersignerfullname() == null : this.getSellersignerfullname().equals(other.getSellersignerfullname()))
            && (this.getPaidflag() == null ? other.getPaidflag() == null : this.getPaidflag().equals(other.getPaidflag()))
            && (this.getAlliancefee() == null ? other.getAlliancefee() == null : this.getAlliancefee().equals(other.getAlliancefee()))
            && (this.getLogisticsno() == null ? other.getLogisticsno() == null : this.getLogisticsno().equals(other.getLogisticsno()))
            && (this.getLogisticsservicename() == null ? other.getLogisticsservicename() == null : this.getLogisticsservicename().equals(other.getLogisticsservicename()))
            && (this.getIssave() == null ? other.getIssave() == null : this.getIssave().equals(other.getIssave()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getItemjson() == null ? other.getItemjson() == null : this.getItemjson().equals(other.getItemjson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getBuyerloginid() == null) ? 0 : getBuyerloginid().hashCode());
        result = prime * result + ((getBuyeruserid() == null) ? 0 : getBuyeruserid().hashCode());
        result = prime * result + ((getBuyername() == null) ? 0 : getBuyername().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getCreatedtime() == null) ? 0 : getCreatedtime().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getPaidtime() == null) ? 0 : getPaidtime().hashCode());
        result = prime * result + ((getTimeoutlefttime() == null) ? 0 : getTimeoutlefttime().hashCode());
        result = prime * result + ((getClosetime() == null) ? 0 : getClosetime().hashCode());
        result = prime * result + ((getFundstatus() == null) ? 0 : getFundstatus().hashCode());
        result = prime * result + ((getSalesrecordnumber() == null) ? 0 : getSalesrecordnumber().hashCode());
        result = prime * result + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        result = prime * result + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCountryen() == null) ? 0 : getCountryen().hashCode());
        result = prime * result + ((getCountrycn() == null) ? 0 : getCountrycn().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getPhone1() == null) ? 0 : getPhone1().hashCode());
        result = prime * result + ((getPhone2() == null) ? 0 : getPhone2().hashCode());
        result = prime * result + ((getPostalcode() == null) ? 0 : getPostalcode().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getItemtotalorigin() == null) ? 0 : getItemtotalorigin().hashCode());
        result = prime * result + ((getShippingcostorigin() == null) ? 0 : getShippingcostorigin().hashCode());
        result = prime * result + ((getOrdertotalorigin() == null) ? 0 : getOrdertotalorigin().hashCode());
        result = prime * result + ((getPlatformfeeorigin() == null) ? 0 : getPlatformfeeorigin().hashCode());
        result = prime * result + ((getInsurancefeeorigin() == null) ? 0 : getInsurancefeeorigin().hashCode());
        result = prime * result + ((getCurrencyid() == null) ? 0 : getCurrencyid().hashCode());
        result = prime * result + ((getPaypalfeeorigin() == null) ? 0 : getPaypalfeeorigin().hashCode());
        result = prime * result + ((getPaypalcurrencyid() == null) ? 0 : getPaypalcurrencyid().hashCode());
        result = prime * result + ((getPaypalid() == null) ? 0 : getPaypalid().hashCode());
        result = prime * result + ((getShippingservice() == null) ? 0 : getShippingservice().hashCode());
        result = prime * result + ((getBuyercheckoutmessage() == null) ? 0 : getBuyercheckoutmessage().hashCode());
        result = prime * result + ((getImportid() == null) ? 0 : getImportid().hashCode());
        result = prime * result + ((getShippingservicetype() == null) ? 0 : getShippingservicetype().hashCode());
        result = prime * result + ((getIssuestatus() == null) ? 0 : getIssuestatus().hashCode());
        result = prime * result + ((getFrozenstatus() == null) ? 0 : getFrozenstatus().hashCode());
        result = prime * result + ((getSellersignerfullname() == null) ? 0 : getSellersignerfullname().hashCode());
        result = prime * result + ((getPaidflag() == null) ? 0 : getPaidflag().hashCode());
        result = prime * result + ((getAlliancefee() == null) ? 0 : getAlliancefee().hashCode());
        result = prime * result + ((getLogisticsno() == null) ? 0 : getLogisticsno().hashCode());
        result = prime * result + ((getLogisticsservicename() == null) ? 0 : getLogisticsservicename().hashCode());
        result = prime * result + ((getIssave() == null) ? 0 : getIssave().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getItemjson() == null) ? 0 : getItemjson().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", companyid=").append(companyid);
        sb.append(", buyerloginid=").append(buyerloginid);
        sb.append(", buyeruserid=").append(buyeruserid);
        sb.append(", buyername=").append(buyername);
        sb.append(", shopid=").append(shopid);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", paidtime=").append(paidtime);
        sb.append(", timeoutlefttime=").append(timeoutlefttime);
        sb.append(", closetime=").append(closetime);
        sb.append(", fundstatus=").append(fundstatus);
        sb.append(", salesrecordnumber=").append(salesrecordnumber);
        sb.append(", street1=").append(street1);
        sb.append(", street2=").append(street2);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", countryen=").append(countryen);
        sb.append(", countrycn=").append(countrycn);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", phone1=").append(phone1);
        sb.append(", phone2=").append(phone2);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", email=").append(email);
        sb.append(", itemtotalorigin=").append(itemtotalorigin);
        sb.append(", shippingcostorigin=").append(shippingcostorigin);
        sb.append(", ordertotalorigin=").append(ordertotalorigin);
        sb.append(", platformfeeorigin=").append(platformfeeorigin);
        sb.append(", insurancefeeorigin=").append(insurancefeeorigin);
        sb.append(", currencyid=").append(currencyid);
        sb.append(", paypalfeeorigin=").append(paypalfeeorigin);
        sb.append(", paypalcurrencyid=").append(paypalcurrencyid);
        sb.append(", paypalid=").append(paypalid);
        sb.append(", shippingservice=").append(shippingservice);
        sb.append(", buyercheckoutmessage=").append(buyercheckoutmessage);
        sb.append(", importid=").append(importid);
        sb.append(", shippingservicetype=").append(shippingservicetype);
        sb.append(", issuestatus=").append(issuestatus);
        sb.append(", frozenstatus=").append(frozenstatus);
        sb.append(", sellersignerfullname=").append(sellersignerfullname);
        sb.append(", paidflag=").append(paidflag);
        sb.append(", alliancefee=").append(alliancefee);
        sb.append(", logisticsno=").append(logisticsno);
        sb.append(", logisticsservicename=").append(logisticsservicename);
        sb.append(", issave=").append(issave);
        sb.append(", opertime=").append(opertime);
        sb.append(", itemjson=").append(itemjson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}