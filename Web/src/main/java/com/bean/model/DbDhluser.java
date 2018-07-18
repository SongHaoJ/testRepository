package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbDhluser implements Serializable {
    private BigDecimal id;

    private String oper;

    private String phonenumber;

    private String shippingpaymenttype;

    private String companyname;

    private String personname;

    private String siteid;

    private String countrycode;

    private String federaltaxid;

    private String addressline;

    private BigDecimal operflag;

    private String postalcode;

    private Date opertime;

    private String shipperaccountnumber;

    private String city;

    private String countryname;

    private String languagecode;

    private String password;

    private String dutypaymenttype;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getShippingpaymenttype() {
        return shippingpaymenttype;
    }

    public void setShippingpaymenttype(String shippingpaymenttype) {
        this.shippingpaymenttype = shippingpaymenttype == null ? null : shippingpaymenttype.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getFederaltaxid() {
        return federaltaxid;
    }

    public void setFederaltaxid(String federaltaxid) {
        this.federaltaxid = federaltaxid == null ? null : federaltaxid.trim();
    }

    public String getAddressline() {
        return addressline;
    }

    public void setAddressline(String addressline) {
        this.addressline = addressline == null ? null : addressline.trim();
    }

    public BigDecimal getOperflag() {
        return operflag;
    }

    public void setOperflag(BigDecimal operflag) {
        this.operflag = operflag;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getShipperaccountnumber() {
        return shipperaccountnumber;
    }

    public void setShipperaccountnumber(String shipperaccountnumber) {
        this.shipperaccountnumber = shipperaccountnumber == null ? null : shipperaccountnumber.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode == null ? null : languagecode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDutypaymenttype() {
        return dutypaymenttype;
    }

    public void setDutypaymenttype(String dutypaymenttype) {
        this.dutypaymenttype = dutypaymenttype == null ? null : dutypaymenttype.trim();
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
        DbDhluser other = (DbDhluser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getPhonenumber() == null ? other.getPhonenumber() == null : this.getPhonenumber().equals(other.getPhonenumber()))
            && (this.getShippingpaymenttype() == null ? other.getShippingpaymenttype() == null : this.getShippingpaymenttype().equals(other.getShippingpaymenttype()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getPersonname() == null ? other.getPersonname() == null : this.getPersonname().equals(other.getPersonname()))
            && (this.getSiteid() == null ? other.getSiteid() == null : this.getSiteid().equals(other.getSiteid()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getFederaltaxid() == null ? other.getFederaltaxid() == null : this.getFederaltaxid().equals(other.getFederaltaxid()))
            && (this.getAddressline() == null ? other.getAddressline() == null : this.getAddressline().equals(other.getAddressline()))
            && (this.getOperflag() == null ? other.getOperflag() == null : this.getOperflag().equals(other.getOperflag()))
            && (this.getPostalcode() == null ? other.getPostalcode() == null : this.getPostalcode().equals(other.getPostalcode()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getShipperaccountnumber() == null ? other.getShipperaccountnumber() == null : this.getShipperaccountnumber().equals(other.getShipperaccountnumber()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCountryname() == null ? other.getCountryname() == null : this.getCountryname().equals(other.getCountryname()))
            && (this.getLanguagecode() == null ? other.getLanguagecode() == null : this.getLanguagecode().equals(other.getLanguagecode()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getDutypaymenttype() == null ? other.getDutypaymenttype() == null : this.getDutypaymenttype().equals(other.getDutypaymenttype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getPhonenumber() == null) ? 0 : getPhonenumber().hashCode());
        result = prime * result + ((getShippingpaymenttype() == null) ? 0 : getShippingpaymenttype().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getPersonname() == null) ? 0 : getPersonname().hashCode());
        result = prime * result + ((getSiteid() == null) ? 0 : getSiteid().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getFederaltaxid() == null) ? 0 : getFederaltaxid().hashCode());
        result = prime * result + ((getAddressline() == null) ? 0 : getAddressline().hashCode());
        result = prime * result + ((getOperflag() == null) ? 0 : getOperflag().hashCode());
        result = prime * result + ((getPostalcode() == null) ? 0 : getPostalcode().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getShipperaccountnumber() == null) ? 0 : getShipperaccountnumber().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCountryname() == null) ? 0 : getCountryname().hashCode());
        result = prime * result + ((getLanguagecode() == null) ? 0 : getLanguagecode().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getDutypaymenttype() == null) ? 0 : getDutypaymenttype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oper=").append(oper);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", shippingpaymenttype=").append(shippingpaymenttype);
        sb.append(", companyname=").append(companyname);
        sb.append(", personname=").append(personname);
        sb.append(", siteid=").append(siteid);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", federaltaxid=").append(federaltaxid);
        sb.append(", addressline=").append(addressline);
        sb.append(", operflag=").append(operflag);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", opertime=").append(opertime);
        sb.append(", shipperaccountnumber=").append(shipperaccountnumber);
        sb.append(", city=").append(city);
        sb.append(", countryname=").append(countryname);
        sb.append(", languagecode=").append(languagecode);
        sb.append(", password=").append(password);
        sb.append(", dutypaymenttype=").append(dutypaymenttype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}