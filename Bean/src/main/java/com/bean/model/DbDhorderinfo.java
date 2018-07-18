package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbDhorderinfo implements Serializable {
    private String sequenceid;

    private String orderid;

    private String corpid;

    private String tradeid;

    private String maintradeid;

    private String groupid;

    private String customerid;

    private String customername;

    private String customerfirstname;

    private String customerlastname;

    private String customertype;

    private String customertel1;

    private String customertel2;

    private String customeremail;

    private String customercountry;

    private String customercountrycn;

    private String customercountry2;

    private String customerprovince;

    private String customercity;

    private String customeraddress;

    private String customerzipcode;

    private String customerreserve1;

    private String customerreserve2;

    private String customerreserve3;

    private String customerreserve4;

    private BigDecimal customerreserve5;

    private BigDecimal customerreserve6;

    private BigDecimal customerreserve7;

    private BigDecimal customerreserve8;

    private String shoptypeid;

    private String shoptype;

    private String moneytype;

    private BigDecimal moneyask;

    private BigDecimal moneyaction;

    private BigDecimal moneyexpressask;

    private Date ordertime;

    private Date uploadtime;

    private Date paytime;

    private BigDecimal expressweight;

    private String oper;

    private String status;

    private BigDecimal finalvaluefee;

    private String transactionid;

    private String sku;

    private String productname;

    private Long ordernum;

    private BigDecimal costprice;

    private BigDecimal sellprice;

    private BigDecimal amount;

    private String descr2;

    private BigDecimal originsellprice;

    private BigDecimal originexpress;

    private BigDecimal origininsurance;

    private BigDecimal insurance;

    private String shippingservice;

    private String notetoyourself;

    private String ebayitemid;

    private String paypalemail;

    private String paypalid;

    private String orderreserve1;

    private String orderreserve2;

    private String orderreserve3;

    private Long orderreserve4;

    private Long orderreserve5;

    private BigDecimal orderreserve6;

    private BigDecimal orderreserve7;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private Long reserve6;

    private Long reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private String errorflag;

    private String errorinfo;

    private Date opertime;

    private Long recordnum;

    private BigDecimal moneyrate;

    private BigDecimal originordermoney;

    private BigDecimal originexpressmoney;

    private BigDecimal origininsurance1;

    private BigDecimal originfinalvaluefee;

    private String ebaycustomeraddress;

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

    public String getMaintradeid() {
        return maintradeid;
    }

    public void setMaintradeid(String maintradeid) {
        this.maintradeid = maintradeid == null ? null : maintradeid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
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

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getCustomercountrycn() {
        return customercountrycn;
    }

    public void setCustomercountrycn(String customercountrycn) {
        this.customercountrycn = customercountrycn == null ? null : customercountrycn.trim();
    }

    public String getCustomercountry2() {
        return customercountry2;
    }

    public void setCustomercountry2(String customercountry2) {
        this.customercountry2 = customercountry2 == null ? null : customercountry2.trim();
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

    public BigDecimal getCustomerreserve5() {
        return customerreserve5;
    }

    public void setCustomerreserve5(BigDecimal customerreserve5) {
        this.customerreserve5 = customerreserve5;
    }

    public BigDecimal getCustomerreserve6() {
        return customerreserve6;
    }

    public void setCustomerreserve6(BigDecimal customerreserve6) {
        this.customerreserve6 = customerreserve6;
    }

    public BigDecimal getCustomerreserve7() {
        return customerreserve7;
    }

    public void setCustomerreserve7(BigDecimal customerreserve7) {
        this.customerreserve7 = customerreserve7;
    }

    public BigDecimal getCustomerreserve8() {
        return customerreserve8;
    }

    public void setCustomerreserve8(BigDecimal customerreserve8) {
        this.customerreserve8 = customerreserve8;
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

    public BigDecimal getExpressweight() {
        return expressweight;
    }

    public void setExpressweight(BigDecimal expressweight) {
        this.expressweight = expressweight;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getFinalvaluefee() {
        return finalvaluefee;
    }

    public void setFinalvaluefee(BigDecimal finalvaluefee) {
        this.finalvaluefee = finalvaluefee;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Long getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Long ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescr2() {
        return descr2;
    }

    public void setDescr2(String descr2) {
        this.descr2 = descr2 == null ? null : descr2.trim();
    }

    public BigDecimal getOriginsellprice() {
        return originsellprice;
    }

    public void setOriginsellprice(BigDecimal originsellprice) {
        this.originsellprice = originsellprice;
    }

    public BigDecimal getOriginexpress() {
        return originexpress;
    }

    public void setOriginexpress(BigDecimal originexpress) {
        this.originexpress = originexpress;
    }

    public BigDecimal getOrigininsurance() {
        return origininsurance;
    }

    public void setOrigininsurance(BigDecimal origininsurance) {
        this.origininsurance = origininsurance;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public String getShippingservice() {
        return shippingservice;
    }

    public void setShippingservice(String shippingservice) {
        this.shippingservice = shippingservice == null ? null : shippingservice.trim();
    }

    public String getNotetoyourself() {
        return notetoyourself;
    }

    public void setNotetoyourself(String notetoyourself) {
        this.notetoyourself = notetoyourself == null ? null : notetoyourself.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public String getPaypalemail() {
        return paypalemail;
    }

    public void setPaypalemail(String paypalemail) {
        this.paypalemail = paypalemail == null ? null : paypalemail.trim();
    }

    public String getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(String paypalid) {
        this.paypalid = paypalid == null ? null : paypalid.trim();
    }

    public String getOrderreserve1() {
        return orderreserve1;
    }

    public void setOrderreserve1(String orderreserve1) {
        this.orderreserve1 = orderreserve1 == null ? null : orderreserve1.trim();
    }

    public String getOrderreserve2() {
        return orderreserve2;
    }

    public void setOrderreserve2(String orderreserve2) {
        this.orderreserve2 = orderreserve2 == null ? null : orderreserve2.trim();
    }

    public String getOrderreserve3() {
        return orderreserve3;
    }

    public void setOrderreserve3(String orderreserve3) {
        this.orderreserve3 = orderreserve3 == null ? null : orderreserve3.trim();
    }

    public Long getOrderreserve4() {
        return orderreserve4;
    }

    public void setOrderreserve4(Long orderreserve4) {
        this.orderreserve4 = orderreserve4;
    }

    public Long getOrderreserve5() {
        return orderreserve5;
    }

    public void setOrderreserve5(Long orderreserve5) {
        this.orderreserve5 = orderreserve5;
    }

    public BigDecimal getOrderreserve6() {
        return orderreserve6;
    }

    public void setOrderreserve6(BigDecimal orderreserve6) {
        this.orderreserve6 = orderreserve6;
    }

    public BigDecimal getOrderreserve7() {
        return orderreserve7;
    }

    public void setOrderreserve7(BigDecimal orderreserve7) {
        this.orderreserve7 = orderreserve7;
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

    public Long getReserve6() {
        return reserve6;
    }

    public void setReserve6(Long reserve6) {
        this.reserve6 = reserve6;
    }

    public Long getReserve7() {
        return reserve7;
    }

    public void setReserve7(Long reserve7) {
        this.reserve7 = reserve7;
    }

    public BigDecimal getReserve8() {
        return reserve8;
    }

    public void setReserve8(BigDecimal reserve8) {
        this.reserve8 = reserve8;
    }

    public BigDecimal getReserve9() {
        return reserve9;
    }

    public void setReserve9(BigDecimal reserve9) {
        this.reserve9 = reserve9;
    }

    public String getErrorflag() {
        return errorflag;
    }

    public void setErrorflag(String errorflag) {
        this.errorflag = errorflag == null ? null : errorflag.trim();
    }

    public String getErrorinfo() {
        return errorinfo;
    }

    public void setErrorinfo(String errorinfo) {
        this.errorinfo = errorinfo == null ? null : errorinfo.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public Long getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(Long recordnum) {
        this.recordnum = recordnum;
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

    public BigDecimal getOrigininsurance1() {
        return origininsurance1;
    }

    public void setOrigininsurance1(BigDecimal origininsurance1) {
        this.origininsurance1 = origininsurance1;
    }

    public BigDecimal getOriginfinalvaluefee() {
        return originfinalvaluefee;
    }

    public void setOriginfinalvaluefee(BigDecimal originfinalvaluefee) {
        this.originfinalvaluefee = originfinalvaluefee;
    }

    public String getEbaycustomeraddress() {
        return ebaycustomeraddress;
    }

    public void setEbaycustomeraddress(String ebaycustomeraddress) {
        this.ebaycustomeraddress = ebaycustomeraddress == null ? null : ebaycustomeraddress.trim();
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
        DbDhorderinfo other = (DbDhorderinfo) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getMaintradeid() == null ? other.getMaintradeid() == null : this.getMaintradeid().equals(other.getMaintradeid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomerfirstname() == null ? other.getCustomerfirstname() == null : this.getCustomerfirstname().equals(other.getCustomerfirstname()))
            && (this.getCustomerlastname() == null ? other.getCustomerlastname() == null : this.getCustomerlastname().equals(other.getCustomerlastname()))
            && (this.getCustomertype() == null ? other.getCustomertype() == null : this.getCustomertype().equals(other.getCustomertype()))
            && (this.getCustomertel1() == null ? other.getCustomertel1() == null : this.getCustomertel1().equals(other.getCustomertel1()))
            && (this.getCustomertel2() == null ? other.getCustomertel2() == null : this.getCustomertel2().equals(other.getCustomertel2()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomercountrycn() == null ? other.getCustomercountrycn() == null : this.getCustomercountrycn().equals(other.getCustomercountrycn()))
            && (this.getCustomercountry2() == null ? other.getCustomercountry2() == null : this.getCustomercountry2().equals(other.getCustomercountry2()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomerreserve1() == null ? other.getCustomerreserve1() == null : this.getCustomerreserve1().equals(other.getCustomerreserve1()))
            && (this.getCustomerreserve2() == null ? other.getCustomerreserve2() == null : this.getCustomerreserve2().equals(other.getCustomerreserve2()))
            && (this.getCustomerreserve3() == null ? other.getCustomerreserve3() == null : this.getCustomerreserve3().equals(other.getCustomerreserve3()))
            && (this.getCustomerreserve4() == null ? other.getCustomerreserve4() == null : this.getCustomerreserve4().equals(other.getCustomerreserve4()))
            && (this.getCustomerreserve5() == null ? other.getCustomerreserve5() == null : this.getCustomerreserve5().equals(other.getCustomerreserve5()))
            && (this.getCustomerreserve6() == null ? other.getCustomerreserve6() == null : this.getCustomerreserve6().equals(other.getCustomerreserve6()))
            && (this.getCustomerreserve7() == null ? other.getCustomerreserve7() == null : this.getCustomerreserve7().equals(other.getCustomerreserve7()))
            && (this.getCustomerreserve8() == null ? other.getCustomerreserve8() == null : this.getCustomerreserve8().equals(other.getCustomerreserve8()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getMoneyask() == null ? other.getMoneyask() == null : this.getMoneyask().equals(other.getMoneyask()))
            && (this.getMoneyaction() == null ? other.getMoneyaction() == null : this.getMoneyaction().equals(other.getMoneyaction()))
            && (this.getMoneyexpressask() == null ? other.getMoneyexpressask() == null : this.getMoneyexpressask().equals(other.getMoneyexpressask()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getUploadtime() == null ? other.getUploadtime() == null : this.getUploadtime().equals(other.getUploadtime()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getExpressweight() == null ? other.getExpressweight() == null : this.getExpressweight().equals(other.getExpressweight()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFinalvaluefee() == null ? other.getFinalvaluefee() == null : this.getFinalvaluefee().equals(other.getFinalvaluefee()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDescr2() == null ? other.getDescr2() == null : this.getDescr2().equals(other.getDescr2()))
            && (this.getOriginsellprice() == null ? other.getOriginsellprice() == null : this.getOriginsellprice().equals(other.getOriginsellprice()))
            && (this.getOriginexpress() == null ? other.getOriginexpress() == null : this.getOriginexpress().equals(other.getOriginexpress()))
            && (this.getOrigininsurance() == null ? other.getOrigininsurance() == null : this.getOrigininsurance().equals(other.getOrigininsurance()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getShippingservice() == null ? other.getShippingservice() == null : this.getShippingservice().equals(other.getShippingservice()))
            && (this.getNotetoyourself() == null ? other.getNotetoyourself() == null : this.getNotetoyourself().equals(other.getNotetoyourself()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getPaypalemail() == null ? other.getPaypalemail() == null : this.getPaypalemail().equals(other.getPaypalemail()))
            && (this.getPaypalid() == null ? other.getPaypalid() == null : this.getPaypalid().equals(other.getPaypalid()))
            && (this.getOrderreserve1() == null ? other.getOrderreserve1() == null : this.getOrderreserve1().equals(other.getOrderreserve1()))
            && (this.getOrderreserve2() == null ? other.getOrderreserve2() == null : this.getOrderreserve2().equals(other.getOrderreserve2()))
            && (this.getOrderreserve3() == null ? other.getOrderreserve3() == null : this.getOrderreserve3().equals(other.getOrderreserve3()))
            && (this.getOrderreserve4() == null ? other.getOrderreserve4() == null : this.getOrderreserve4().equals(other.getOrderreserve4()))
            && (this.getOrderreserve5() == null ? other.getOrderreserve5() == null : this.getOrderreserve5().equals(other.getOrderreserve5()))
            && (this.getOrderreserve6() == null ? other.getOrderreserve6() == null : this.getOrderreserve6().equals(other.getOrderreserve6()))
            && (this.getOrderreserve7() == null ? other.getOrderreserve7() == null : this.getOrderreserve7().equals(other.getOrderreserve7()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getErrorflag() == null ? other.getErrorflag() == null : this.getErrorflag().equals(other.getErrorflag()))
            && (this.getErrorinfo() == null ? other.getErrorinfo() == null : this.getErrorinfo().equals(other.getErrorinfo()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getRecordnum() == null ? other.getRecordnum() == null : this.getRecordnum().equals(other.getRecordnum()))
            && (this.getMoneyrate() == null ? other.getMoneyrate() == null : this.getMoneyrate().equals(other.getMoneyrate()))
            && (this.getOriginordermoney() == null ? other.getOriginordermoney() == null : this.getOriginordermoney().equals(other.getOriginordermoney()))
            && (this.getOriginexpressmoney() == null ? other.getOriginexpressmoney() == null : this.getOriginexpressmoney().equals(other.getOriginexpressmoney()))
            && (this.getOrigininsurance1() == null ? other.getOrigininsurance1() == null : this.getOrigininsurance1().equals(other.getOrigininsurance1()))
            && (this.getOriginfinalvaluefee() == null ? other.getOriginfinalvaluefee() == null : this.getOriginfinalvaluefee().equals(other.getOriginfinalvaluefee()))
            && (this.getEbaycustomeraddress() == null ? other.getEbaycustomeraddress() == null : this.getEbaycustomeraddress().equals(other.getEbaycustomeraddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getMaintradeid() == null) ? 0 : getMaintradeid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomerfirstname() == null) ? 0 : getCustomerfirstname().hashCode());
        result = prime * result + ((getCustomerlastname() == null) ? 0 : getCustomerlastname().hashCode());
        result = prime * result + ((getCustomertype() == null) ? 0 : getCustomertype().hashCode());
        result = prime * result + ((getCustomertel1() == null) ? 0 : getCustomertel1().hashCode());
        result = prime * result + ((getCustomertel2() == null) ? 0 : getCustomertel2().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomercountrycn() == null) ? 0 : getCustomercountrycn().hashCode());
        result = prime * result + ((getCustomercountry2() == null) ? 0 : getCustomercountry2().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomerreserve1() == null) ? 0 : getCustomerreserve1().hashCode());
        result = prime * result + ((getCustomerreserve2() == null) ? 0 : getCustomerreserve2().hashCode());
        result = prime * result + ((getCustomerreserve3() == null) ? 0 : getCustomerreserve3().hashCode());
        result = prime * result + ((getCustomerreserve4() == null) ? 0 : getCustomerreserve4().hashCode());
        result = prime * result + ((getCustomerreserve5() == null) ? 0 : getCustomerreserve5().hashCode());
        result = prime * result + ((getCustomerreserve6() == null) ? 0 : getCustomerreserve6().hashCode());
        result = prime * result + ((getCustomerreserve7() == null) ? 0 : getCustomerreserve7().hashCode());
        result = prime * result + ((getCustomerreserve8() == null) ? 0 : getCustomerreserve8().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getMoneyask() == null) ? 0 : getMoneyask().hashCode());
        result = prime * result + ((getMoneyaction() == null) ? 0 : getMoneyaction().hashCode());
        result = prime * result + ((getMoneyexpressask() == null) ? 0 : getMoneyexpressask().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getUploadtime() == null) ? 0 : getUploadtime().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getExpressweight() == null) ? 0 : getExpressweight().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFinalvaluefee() == null) ? 0 : getFinalvaluefee().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDescr2() == null) ? 0 : getDescr2().hashCode());
        result = prime * result + ((getOriginsellprice() == null) ? 0 : getOriginsellprice().hashCode());
        result = prime * result + ((getOriginexpress() == null) ? 0 : getOriginexpress().hashCode());
        result = prime * result + ((getOrigininsurance() == null) ? 0 : getOrigininsurance().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getShippingservice() == null) ? 0 : getShippingservice().hashCode());
        result = prime * result + ((getNotetoyourself() == null) ? 0 : getNotetoyourself().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getPaypalemail() == null) ? 0 : getPaypalemail().hashCode());
        result = prime * result + ((getPaypalid() == null) ? 0 : getPaypalid().hashCode());
        result = prime * result + ((getOrderreserve1() == null) ? 0 : getOrderreserve1().hashCode());
        result = prime * result + ((getOrderreserve2() == null) ? 0 : getOrderreserve2().hashCode());
        result = prime * result + ((getOrderreserve3() == null) ? 0 : getOrderreserve3().hashCode());
        result = prime * result + ((getOrderreserve4() == null) ? 0 : getOrderreserve4().hashCode());
        result = prime * result + ((getOrderreserve5() == null) ? 0 : getOrderreserve5().hashCode());
        result = prime * result + ((getOrderreserve6() == null) ? 0 : getOrderreserve6().hashCode());
        result = prime * result + ((getOrderreserve7() == null) ? 0 : getOrderreserve7().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getErrorflag() == null) ? 0 : getErrorflag().hashCode());
        result = prime * result + ((getErrorinfo() == null) ? 0 : getErrorinfo().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getRecordnum() == null) ? 0 : getRecordnum().hashCode());
        result = prime * result + ((getMoneyrate() == null) ? 0 : getMoneyrate().hashCode());
        result = prime * result + ((getOriginordermoney() == null) ? 0 : getOriginordermoney().hashCode());
        result = prime * result + ((getOriginexpressmoney() == null) ? 0 : getOriginexpressmoney().hashCode());
        result = prime * result + ((getOrigininsurance1() == null) ? 0 : getOrigininsurance1().hashCode());
        result = prime * result + ((getOriginfinalvaluefee() == null) ? 0 : getOriginfinalvaluefee().hashCode());
        result = prime * result + ((getEbaycustomeraddress() == null) ? 0 : getEbaycustomeraddress().hashCode());
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
        sb.append(", corpid=").append(corpid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", maintradeid=").append(maintradeid);
        sb.append(", groupid=").append(groupid);
        sb.append(", customerid=").append(customerid);
        sb.append(", customername=").append(customername);
        sb.append(", customerfirstname=").append(customerfirstname);
        sb.append(", customerlastname=").append(customerlastname);
        sb.append(", customertype=").append(customertype);
        sb.append(", customertel1=").append(customertel1);
        sb.append(", customertel2=").append(customertel2);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customercountrycn=").append(customercountrycn);
        sb.append(", customercountry2=").append(customercountry2);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customerreserve1=").append(customerreserve1);
        sb.append(", customerreserve2=").append(customerreserve2);
        sb.append(", customerreserve3=").append(customerreserve3);
        sb.append(", customerreserve4=").append(customerreserve4);
        sb.append(", customerreserve5=").append(customerreserve5);
        sb.append(", customerreserve6=").append(customerreserve6);
        sb.append(", customerreserve7=").append(customerreserve7);
        sb.append(", customerreserve8=").append(customerreserve8);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", moneyask=").append(moneyask);
        sb.append(", moneyaction=").append(moneyaction);
        sb.append(", moneyexpressask=").append(moneyexpressask);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", paytime=").append(paytime);
        sb.append(", expressweight=").append(expressweight);
        sb.append(", oper=").append(oper);
        sb.append(", status=").append(status);
        sb.append(", finalvaluefee=").append(finalvaluefee);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", sku=").append(sku);
        sb.append(", productname=").append(productname);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", costprice=").append(costprice);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", amount=").append(amount);
        sb.append(", descr2=").append(descr2);
        sb.append(", originsellprice=").append(originsellprice);
        sb.append(", originexpress=").append(originexpress);
        sb.append(", origininsurance=").append(origininsurance);
        sb.append(", insurance=").append(insurance);
        sb.append(", shippingservice=").append(shippingservice);
        sb.append(", notetoyourself=").append(notetoyourself);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", paypalemail=").append(paypalemail);
        sb.append(", paypalid=").append(paypalid);
        sb.append(", orderreserve1=").append(orderreserve1);
        sb.append(", orderreserve2=").append(orderreserve2);
        sb.append(", orderreserve3=").append(orderreserve3);
        sb.append(", orderreserve4=").append(orderreserve4);
        sb.append(", orderreserve5=").append(orderreserve5);
        sb.append(", orderreserve6=").append(orderreserve6);
        sb.append(", orderreserve7=").append(orderreserve7);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", errorflag=").append(errorflag);
        sb.append(", errorinfo=").append(errorinfo);
        sb.append(", opertime=").append(opertime);
        sb.append(", recordnum=").append(recordnum);
        sb.append(", moneyrate=").append(moneyrate);
        sb.append(", originordermoney=").append(originordermoney);
        sb.append(", originexpressmoney=").append(originexpressmoney);
        sb.append(", origininsurance1=").append(origininsurance1);
        sb.append(", originfinalvaluefee=").append(originfinalvaluefee);
        sb.append(", ebaycustomeraddress=").append(ebaycustomeraddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}