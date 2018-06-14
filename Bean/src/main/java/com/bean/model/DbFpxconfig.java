package com.bean.model;

import java.io.Serializable;

public class DbFpxconfig implements Serializable {
    private String sid;

    private String token;

    private String shippername;

    private String shippercompanyname;

    private String shipperaddress;

    private String shipperpostcode;

    private String shippertelephone;

    private String shipperfax;

    private String insurtype;

    private String cargocode;

    private String paymentcode;

    private String initialcountrycode;

    private String productcode;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String openflag;

    private String reserve4;

    private String reserve5;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getShippername() {
        return shippername;
    }

    public void setShippername(String shippername) {
        this.shippername = shippername == null ? null : shippername.trim();
    }

    public String getShippercompanyname() {
        return shippercompanyname;
    }

    public void setShippercompanyname(String shippercompanyname) {
        this.shippercompanyname = shippercompanyname == null ? null : shippercompanyname.trim();
    }

    public String getShipperaddress() {
        return shipperaddress;
    }

    public void setShipperaddress(String shipperaddress) {
        this.shipperaddress = shipperaddress == null ? null : shipperaddress.trim();
    }

    public String getShipperpostcode() {
        return shipperpostcode;
    }

    public void setShipperpostcode(String shipperpostcode) {
        this.shipperpostcode = shipperpostcode == null ? null : shipperpostcode.trim();
    }

    public String getShippertelephone() {
        return shippertelephone;
    }

    public void setShippertelephone(String shippertelephone) {
        this.shippertelephone = shippertelephone == null ? null : shippertelephone.trim();
    }

    public String getShipperfax() {
        return shipperfax;
    }

    public void setShipperfax(String shipperfax) {
        this.shipperfax = shipperfax == null ? null : shipperfax.trim();
    }

    public String getInsurtype() {
        return insurtype;
    }

    public void setInsurtype(String insurtype) {
        this.insurtype = insurtype == null ? null : insurtype.trim();
    }

    public String getCargocode() {
        return cargocode;
    }

    public void setCargocode(String cargocode) {
        this.cargocode = cargocode == null ? null : cargocode.trim();
    }

    public String getPaymentcode() {
        return paymentcode;
    }

    public void setPaymentcode(String paymentcode) {
        this.paymentcode = paymentcode == null ? null : paymentcode.trim();
    }

    public String getInitialcountrycode() {
        return initialcountrycode;
    }

    public void setInitialcountrycode(String initialcountrycode) {
        this.initialcountrycode = initialcountrycode == null ? null : initialcountrycode.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
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

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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
        DbFpxconfig other = (DbFpxconfig) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getShippername() == null ? other.getShippername() == null : this.getShippername().equals(other.getShippername()))
            && (this.getShippercompanyname() == null ? other.getShippercompanyname() == null : this.getShippercompanyname().equals(other.getShippercompanyname()))
            && (this.getShipperaddress() == null ? other.getShipperaddress() == null : this.getShipperaddress().equals(other.getShipperaddress()))
            && (this.getShipperpostcode() == null ? other.getShipperpostcode() == null : this.getShipperpostcode().equals(other.getShipperpostcode()))
            && (this.getShippertelephone() == null ? other.getShippertelephone() == null : this.getShippertelephone().equals(other.getShippertelephone()))
            && (this.getShipperfax() == null ? other.getShipperfax() == null : this.getShipperfax().equals(other.getShipperfax()))
            && (this.getInsurtype() == null ? other.getInsurtype() == null : this.getInsurtype().equals(other.getInsurtype()))
            && (this.getCargocode() == null ? other.getCargocode() == null : this.getCargocode().equals(other.getCargocode()))
            && (this.getPaymentcode() == null ? other.getPaymentcode() == null : this.getPaymentcode().equals(other.getPaymentcode()))
            && (this.getInitialcountrycode() == null ? other.getInitialcountrycode() == null : this.getInitialcountrycode().equals(other.getInitialcountrycode()))
            && (this.getProductcode() == null ? other.getProductcode() == null : this.getProductcode().equals(other.getProductcode()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getShippername() == null) ? 0 : getShippername().hashCode());
        result = prime * result + ((getShippercompanyname() == null) ? 0 : getShippercompanyname().hashCode());
        result = prime * result + ((getShipperaddress() == null) ? 0 : getShipperaddress().hashCode());
        result = prime * result + ((getShipperpostcode() == null) ? 0 : getShipperpostcode().hashCode());
        result = prime * result + ((getShippertelephone() == null) ? 0 : getShippertelephone().hashCode());
        result = prime * result + ((getShipperfax() == null) ? 0 : getShipperfax().hashCode());
        result = prime * result + ((getInsurtype() == null) ? 0 : getInsurtype().hashCode());
        result = prime * result + ((getCargocode() == null) ? 0 : getCargocode().hashCode());
        result = prime * result + ((getPaymentcode() == null) ? 0 : getPaymentcode().hashCode());
        result = prime * result + ((getInitialcountrycode() == null) ? 0 : getInitialcountrycode().hashCode());
        result = prime * result + ((getProductcode() == null) ? 0 : getProductcode().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", token=").append(token);
        sb.append(", shippername=").append(shippername);
        sb.append(", shippercompanyname=").append(shippercompanyname);
        sb.append(", shipperaddress=").append(shipperaddress);
        sb.append(", shipperpostcode=").append(shipperpostcode);
        sb.append(", shippertelephone=").append(shippertelephone);
        sb.append(", shipperfax=").append(shipperfax);
        sb.append(", insurtype=").append(insurtype);
        sb.append(", cargocode=").append(cargocode);
        sb.append(", paymentcode=").append(paymentcode);
        sb.append(", initialcountrycode=").append(initialcountrycode);
        sb.append(", productcode=").append(productcode);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", openflag=").append(openflag);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}