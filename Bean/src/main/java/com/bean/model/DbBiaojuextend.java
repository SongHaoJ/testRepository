package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbBiaojuextend implements Serializable {
    private Integer id;

    private Integer supplierid;

    private String suppliername;

    private Short openflag;

    private Short tokenflag;

    private String account;

    private String password;

    private String token;

    private String sender;

    private String company;

    private String province;

    private String city;

    private String district;

    private String postcode;

    private String tel;

    private String email;

    private String fax;

    private String countrycode;

    private String oper;

    private Date opertime;

    private String accountset;

    private String descr;

    private String address;

    private String address1;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

    private String field6;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Short getOpenflag() {
        return openflag;
    }

    public void setOpenflag(Short openflag) {
        this.openflag = openflag;
    }

    public Short getTokenflag() {
        return tokenflag;
    }

    public void setTokenflag(Short tokenflag) {
        this.tokenflag = tokenflag;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
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

    public String getAccountset() {
        return accountset;
    }

    public void setAccountset(String accountset) {
        this.accountset = accountset == null ? null : accountset.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6 == null ? null : field6.trim();
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
        DbBiaojuextend other = (DbBiaojuextend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplierid() == null ? other.getSupplierid() == null : this.getSupplierid().equals(other.getSupplierid()))
            && (this.getSuppliername() == null ? other.getSuppliername() == null : this.getSuppliername().equals(other.getSuppliername()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getTokenflag() == null ? other.getTokenflag() == null : this.getTokenflag().equals(other.getTokenflag()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAccountset() == null ? other.getAccountset() == null : this.getAccountset().equals(other.getAccountset()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getField4() == null ? other.getField4() == null : this.getField4().equals(other.getField4()))
            && (this.getField5() == null ? other.getField5() == null : this.getField5().equals(other.getField5()))
            && (this.getField6() == null ? other.getField6() == null : this.getField6().equals(other.getField6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplierid() == null) ? 0 : getSupplierid().hashCode());
        result = prime * result + ((getSuppliername() == null) ? 0 : getSuppliername().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getTokenflag() == null) ? 0 : getTokenflag().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAccountset() == null) ? 0 : getAccountset().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getField4() == null) ? 0 : getField4().hashCode());
        result = prime * result + ((getField5() == null) ? 0 : getField5().hashCode());
        result = prime * result + ((getField6() == null) ? 0 : getField6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", suppliername=").append(suppliername);
        sb.append(", openflag=").append(openflag);
        sb.append(", tokenflag=").append(tokenflag);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", token=").append(token);
        sb.append(", sender=").append(sender);
        sb.append(", company=").append(company);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", postcode=").append(postcode);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", fax=").append(fax);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", accountset=").append(accountset);
        sb.append(", descr=").append(descr);
        sb.append(", address=").append(address);
        sb.append(", address1=").append(address1);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append(", field6=").append(field6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}