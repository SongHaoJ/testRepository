package com.bean.model;

import java.io.Serializable;

public class DbEdispreference implements Serializable {
    private String consignpreferenceid;

    private String name;

    private Short type;

    private Short pickuptime;

    private String dropoffsiteid;

    private String contact;

    private String company;

    private String countrycode;

    private String province;

    private String city;

    private String district;

    private String street1;

    private String street2;

    private String street3;

    private String postcode;

    private String mobile;

    private static final long serialVersionUID = 1L;

    public String getConsignpreferenceid() {
        return consignpreferenceid;
    }

    public void setConsignpreferenceid(String consignpreferenceid) {
        this.consignpreferenceid = consignpreferenceid == null ? null : consignpreferenceid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(Short pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getDropoffsiteid() {
        return dropoffsiteid;
    }

    public void setDropoffsiteid(String dropoffsiteid) {
        this.dropoffsiteid = dropoffsiteid == null ? null : dropoffsiteid.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
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

    public String getStreet3() {
        return street3;
    }

    public void setStreet3(String street3) {
        this.street3 = street3 == null ? null : street3.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
        DbEdispreference other = (DbEdispreference) that;
        return (this.getConsignpreferenceid() == null ? other.getConsignpreferenceid() == null : this.getConsignpreferenceid().equals(other.getConsignpreferenceid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPickuptime() == null ? other.getPickuptime() == null : this.getPickuptime().equals(other.getPickuptime()))
            && (this.getDropoffsiteid() == null ? other.getDropoffsiteid() == null : this.getDropoffsiteid().equals(other.getDropoffsiteid()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getStreet1() == null ? other.getStreet1() == null : this.getStreet1().equals(other.getStreet1()))
            && (this.getStreet2() == null ? other.getStreet2() == null : this.getStreet2().equals(other.getStreet2()))
            && (this.getStreet3() == null ? other.getStreet3() == null : this.getStreet3().equals(other.getStreet3()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConsignpreferenceid() == null) ? 0 : getConsignpreferenceid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPickuptime() == null) ? 0 : getPickuptime().hashCode());
        result = prime * result + ((getDropoffsiteid() == null) ? 0 : getDropoffsiteid().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        result = prime * result + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        result = prime * result + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", consignpreferenceid=").append(consignpreferenceid);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", pickuptime=").append(pickuptime);
        sb.append(", dropoffsiteid=").append(dropoffsiteid);
        sb.append(", contact=").append(contact);
        sb.append(", company=").append(company);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", street1=").append(street1);
        sb.append(", street2=").append(street2);
        sb.append(", street3=").append(street3);
        sb.append(", postcode=").append(postcode);
        sb.append(", mobile=").append(mobile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}