package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbOutcategoryorder implements Serializable {
    private String ebayorderid;

    private String deliverywayid;

    private String deliveryinsurancetypeid;

    private String warehouseid;

    private String sellerorderno;

    private String recordid;

    private String phone;

    private String postal;

    private String email;

    private String countryname;

    private Short flag;

    private String trackingnum;

    private Date createtime;

    private Date opertime;

    private String oper;

    private Date updatetime;

    private String name;

    private String regionname;

    private String address1;

    private String address2;

    private String city;

    private String error;

    private static final long serialVersionUID = 1L;

    public String getEbayorderid() {
        return ebayorderid;
    }

    public void setEbayorderid(String ebayorderid) {
        this.ebayorderid = ebayorderid == null ? null : ebayorderid.trim();
    }

    public String getDeliverywayid() {
        return deliverywayid;
    }

    public void setDeliverywayid(String deliverywayid) {
        this.deliverywayid = deliverywayid == null ? null : deliverywayid.trim();
    }

    public String getDeliveryinsurancetypeid() {
        return deliveryinsurancetypeid;
    }

    public void setDeliveryinsurancetypeid(String deliveryinsurancetypeid) {
        this.deliveryinsurancetypeid = deliveryinsurancetypeid == null ? null : deliveryinsurancetypeid.trim();
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    public String getSellerorderno() {
        return sellerorderno;
    }

    public void setSellerorderno(String sellerorderno) {
        this.sellerorderno = sellerorderno == null ? null : sellerorderno.trim();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal == null ? null : postal.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getTrackingnum() {
        return trackingnum;
    }

    public void setTrackingnum(String trackingnum) {
        this.trackingnum = trackingnum == null ? null : trackingnum.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
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
        DbOutcategoryorder other = (DbOutcategoryorder) that;
        return (this.getEbayorderid() == null ? other.getEbayorderid() == null : this.getEbayorderid().equals(other.getEbayorderid()))
            && (this.getDeliverywayid() == null ? other.getDeliverywayid() == null : this.getDeliverywayid().equals(other.getDeliverywayid()))
            && (this.getDeliveryinsurancetypeid() == null ? other.getDeliveryinsurancetypeid() == null : this.getDeliveryinsurancetypeid().equals(other.getDeliveryinsurancetypeid()))
            && (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getSellerorderno() == null ? other.getSellerorderno() == null : this.getSellerorderno().equals(other.getSellerorderno()))
            && (this.getRecordid() == null ? other.getRecordid() == null : this.getRecordid().equals(other.getRecordid()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPostal() == null ? other.getPostal() == null : this.getPostal().equals(other.getPostal()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCountryname() == null ? other.getCountryname() == null : this.getCountryname().equals(other.getCountryname()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getTrackingnum() == null ? other.getTrackingnum() == null : this.getTrackingnum().equals(other.getTrackingnum()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRegionname() == null ? other.getRegionname() == null : this.getRegionname().equals(other.getRegionname()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getAddress2() == null ? other.getAddress2() == null : this.getAddress2().equals(other.getAddress2()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEbayorderid() == null) ? 0 : getEbayorderid().hashCode());
        result = prime * result + ((getDeliverywayid() == null) ? 0 : getDeliverywayid().hashCode());
        result = prime * result + ((getDeliveryinsurancetypeid() == null) ? 0 : getDeliveryinsurancetypeid().hashCode());
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getSellerorderno() == null) ? 0 : getSellerorderno().hashCode());
        result = prime * result + ((getRecordid() == null) ? 0 : getRecordid().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPostal() == null) ? 0 : getPostal().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCountryname() == null) ? 0 : getCountryname().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getTrackingnum() == null) ? 0 : getTrackingnum().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRegionname() == null) ? 0 : getRegionname().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ebayorderid=").append(ebayorderid);
        sb.append(", deliverywayid=").append(deliverywayid);
        sb.append(", deliveryinsurancetypeid=").append(deliveryinsurancetypeid);
        sb.append(", warehouseid=").append(warehouseid);
        sb.append(", sellerorderno=").append(sellerorderno);
        sb.append(", recordid=").append(recordid);
        sb.append(", phone=").append(phone);
        sb.append(", postal=").append(postal);
        sb.append(", email=").append(email);
        sb.append(", countryname=").append(countryname);
        sb.append(", flag=").append(flag);
        sb.append(", trackingnum=").append(trackingnum);
        sb.append(", createtime=").append(createtime);
        sb.append(", opertime=").append(opertime);
        sb.append(", oper=").append(oper);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", name=").append(name);
        sb.append(", regionname=").append(regionname);
        sb.append(", address1=").append(address1);
        sb.append(", address2=").append(address2);
        sb.append(", city=").append(city);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}