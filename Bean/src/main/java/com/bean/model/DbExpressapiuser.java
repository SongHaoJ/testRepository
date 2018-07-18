package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbExpressapiuser implements Serializable {
    private BigDecimal id;

    private String oper;

    private String postcode;

    private String token;

    private BigDecimal openflag;

    private String countrycode;

    private String postcode1;

    private String account;

    private String district;

    private String fax;

    private String accountnick;

    private String city;

    private String company;

    private String token1;

    private String token2;

    private String firstname;

    private String tel;

    private String lastname;

    private String province;

    private BigDecimal flag1;

    private String address1;

    private String email;

    private String token3;

    private BigDecimal flag2;

    private String country;

    private String pwd;

    private Date opertime;

    private String address;

    private BigDecimal accounttype;

    private BigDecimal flag3;

    private BigDecimal flag;

    private String sender;

    private BigDecimal apiid;

    private String ordertype;

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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getPostcode1() {
        return postcode1;
    }

    public void setPostcode1(String postcode1) {
        this.postcode1 = postcode1 == null ? null : postcode1.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAccountnick() {
        return accountnick;
    }

    public void setAccountnick(String accountnick) {
        this.accountnick = accountnick == null ? null : accountnick.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getToken1() {
        return token1;
    }

    public void setToken1(String token1) {
        this.token1 = token1 == null ? null : token1.trim();
    }

    public String getToken2() {
        return token2;
    }

    public void setToken2(String token2) {
        this.token2 = token2 == null ? null : token2.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public BigDecimal getFlag1() {
        return flag1;
    }

    public void setFlag1(BigDecimal flag1) {
        this.flag1 = flag1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getToken3() {
        return token3;
    }

    public void setToken3(String token3) {
        this.token3 = token3 == null ? null : token3.trim();
    }

    public BigDecimal getFlag2() {
        return flag2;
    }

    public void setFlag2(BigDecimal flag2) {
        this.flag2 = flag2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(BigDecimal accounttype) {
        this.accounttype = accounttype;
    }

    public BigDecimal getFlag3() {
        return flag3;
    }

    public void setFlag3(BigDecimal flag3) {
        this.flag3 = flag3;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public BigDecimal getApiid() {
        return apiid;
    }

    public void setApiid(BigDecimal apiid) {
        this.apiid = apiid;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
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
        DbExpressapiuser other = (DbExpressapiuser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getPostcode1() == null ? other.getPostcode1() == null : this.getPostcode1().equals(other.getPostcode1()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getAccountnick() == null ? other.getAccountnick() == null : this.getAccountnick().equals(other.getAccountnick()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getToken1() == null ? other.getToken1() == null : this.getToken1().equals(other.getToken1()))
            && (this.getToken2() == null ? other.getToken2() == null : this.getToken2().equals(other.getToken2()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getFlag1() == null ? other.getFlag1() == null : this.getFlag1().equals(other.getFlag1()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getToken3() == null ? other.getToken3() == null : this.getToken3().equals(other.getToken3()))
            && (this.getFlag2() == null ? other.getFlag2() == null : this.getFlag2().equals(other.getFlag2()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAccounttype() == null ? other.getAccounttype() == null : this.getAccounttype().equals(other.getAccounttype()))
            && (this.getFlag3() == null ? other.getFlag3() == null : this.getFlag3().equals(other.getFlag3()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getApiid() == null ? other.getApiid() == null : this.getApiid().equals(other.getApiid()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getPostcode1() == null) ? 0 : getPostcode1().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getAccountnick() == null) ? 0 : getAccountnick().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getToken1() == null) ? 0 : getToken1().hashCode());
        result = prime * result + ((getToken2() == null) ? 0 : getToken2().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getFlag1() == null) ? 0 : getFlag1().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getToken3() == null) ? 0 : getToken3().hashCode());
        result = prime * result + ((getFlag2() == null) ? 0 : getFlag2().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAccounttype() == null) ? 0 : getAccounttype().hashCode());
        result = prime * result + ((getFlag3() == null) ? 0 : getFlag3().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getApiid() == null) ? 0 : getApiid().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
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
        sb.append(", postcode=").append(postcode);
        sb.append(", token=").append(token);
        sb.append(", openflag=").append(openflag);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", postcode1=").append(postcode1);
        sb.append(", account=").append(account);
        sb.append(", district=").append(district);
        sb.append(", fax=").append(fax);
        sb.append(", accountnick=").append(accountnick);
        sb.append(", city=").append(city);
        sb.append(", company=").append(company);
        sb.append(", token1=").append(token1);
        sb.append(", token2=").append(token2);
        sb.append(", firstname=").append(firstname);
        sb.append(", tel=").append(tel);
        sb.append(", lastname=").append(lastname);
        sb.append(", province=").append(province);
        sb.append(", flag1=").append(flag1);
        sb.append(", address1=").append(address1);
        sb.append(", email=").append(email);
        sb.append(", token3=").append(token3);
        sb.append(", flag2=").append(flag2);
        sb.append(", country=").append(country);
        sb.append(", pwd=").append(pwd);
        sb.append(", opertime=").append(opertime);
        sb.append(", address=").append(address);
        sb.append(", accounttype=").append(accounttype);
        sb.append(", flag3=").append(flag3);
        sb.append(", flag=").append(flag);
        sb.append(", sender=").append(sender);
        sb.append(", apiid=").append(apiid);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}