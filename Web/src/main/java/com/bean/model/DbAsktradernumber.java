package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbAsktradernumber implements Serializable {
    private String sequenceid;

    private String orderid;

    private String expressid;

    private BigDecimal errflag;

    private String errdescr;

    private String pdfurl;

    private String expresstypeid;

    private String expresstype;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

    private String field6;

    private String field7;

    private String field8;

    private String field9;

    private String field10;

    private String shoptypeid;

    private String shoptype;

    private Date ordertime;

    private String oper;

    private String opertime;

    private String customername;

    private String customercountry;

    private String customerprovince;

    private String customercity;

    private String customeraddress;

    private String customerzipcode;

    private String customertel1;

    private String customeremail;

    private String customerid;

    private String ordertype;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public BigDecimal getErrflag() {
        return errflag;
    }

    public void setErrflag(BigDecimal errflag) {
        this.errflag = errflag;
    }

    public String getErrdescr() {
        return errdescr;
    }

    public void setErrdescr(String errdescr) {
        this.errdescr = errdescr == null ? null : errdescr.trim();
    }

    public String getPdfurl() {
        return pdfurl;
    }

    public void setPdfurl(String pdfurl) {
        this.pdfurl = pdfurl == null ? null : pdfurl.trim();
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
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

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7 == null ? null : field7.trim();
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8 == null ? null : field8.trim();
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9 == null ? null : field9.trim();
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10 == null ? null : field10.trim();
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

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime == null ? null : opertime.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
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

    public String getCustomertel1() {
        return customertel1;
    }

    public void setCustomertel1(String customertel1) {
        this.customertel1 = customertel1 == null ? null : customertel1.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
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
        DbAsktradernumber other = (DbAsktradernumber) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getErrflag() == null ? other.getErrflag() == null : this.getErrflag().equals(other.getErrflag()))
            && (this.getErrdescr() == null ? other.getErrdescr() == null : this.getErrdescr().equals(other.getErrdescr()))
            && (this.getPdfurl() == null ? other.getPdfurl() == null : this.getPdfurl().equals(other.getPdfurl()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getField4() == null ? other.getField4() == null : this.getField4().equals(other.getField4()))
            && (this.getField5() == null ? other.getField5() == null : this.getField5().equals(other.getField5()))
            && (this.getField6() == null ? other.getField6() == null : this.getField6().equals(other.getField6()))
            && (this.getField7() == null ? other.getField7() == null : this.getField7().equals(other.getField7()))
            && (this.getField8() == null ? other.getField8() == null : this.getField8().equals(other.getField8()))
            && (this.getField9() == null ? other.getField9() == null : this.getField9().equals(other.getField9()))
            && (this.getField10() == null ? other.getField10() == null : this.getField10().equals(other.getField10()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomertel1() == null ? other.getCustomertel1() == null : this.getCustomertel1().equals(other.getCustomertel1()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getErrflag() == null) ? 0 : getErrflag().hashCode());
        result = prime * result + ((getErrdescr() == null) ? 0 : getErrdescr().hashCode());
        result = prime * result + ((getPdfurl() == null) ? 0 : getPdfurl().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getField4() == null) ? 0 : getField4().hashCode());
        result = prime * result + ((getField5() == null) ? 0 : getField5().hashCode());
        result = prime * result + ((getField6() == null) ? 0 : getField6().hashCode());
        result = prime * result + ((getField7() == null) ? 0 : getField7().hashCode());
        result = prime * result + ((getField8() == null) ? 0 : getField8().hashCode());
        result = prime * result + ((getField9() == null) ? 0 : getField9().hashCode());
        result = prime * result + ((getField10() == null) ? 0 : getField10().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomertel1() == null) ? 0 : getCustomertel1().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", orderid=").append(orderid);
        sb.append(", expressid=").append(expressid);
        sb.append(", errflag=").append(errflag);
        sb.append(", errdescr=").append(errdescr);
        sb.append(", pdfurl=").append(pdfurl);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append(", field6=").append(field6);
        sb.append(", field7=").append(field7);
        sb.append(", field8=").append(field8);
        sb.append(", field9=").append(field9);
        sb.append(", field10=").append(field10);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", customername=").append(customername);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customertel1=").append(customertel1);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customerid=").append(customerid);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}