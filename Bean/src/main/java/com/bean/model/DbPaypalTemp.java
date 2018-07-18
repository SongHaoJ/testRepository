package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPaypalTemp implements Serializable {
    private String sequenceid;

    private String transactionid;

    private String address;

    private String oper;

    private Date opertime;

    private String emailaddress;

    private String status;

    private BigDecimal feeamount;

    private BigDecimal grossamount;

    private BigDecimal netamount;

    private Date paytime;

    private String filed1;

    private String filed2;

    private BigDecimal filed3;

    private BigDecimal filed4;

    private String corpid;

    private String openflag;

    private String customerprovince;

    private String customercity;

    private String customercountry;

    private String customerstreet;

    private String apiuser;

    private String apipassword;

    private String apitoken;

    private String filed5;

    private String filed6;

    private String filed7;

    private String filed8;

    private String filed9;

    private String filed10;

    private BigDecimal filed11;

    private BigDecimal filed12;

    private BigDecimal filed13;

    private String paypalcustomeraddress;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    public BigDecimal getGrossamount() {
        return grossamount;
    }

    public void setGrossamount(BigDecimal grossamount) {
        this.grossamount = grossamount;
    }

    public BigDecimal getNetamount() {
        return netamount;
    }

    public void setNetamount(BigDecimal netamount) {
        this.netamount = netamount;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }

    public BigDecimal getFiled3() {
        return filed3;
    }

    public void setFiled3(BigDecimal filed3) {
        this.filed3 = filed3;
    }

    public BigDecimal getFiled4() {
        return filed4;
    }

    public void setFiled4(BigDecimal filed4) {
        this.filed4 = filed4;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    public String getCustomerstreet() {
        return customerstreet;
    }

    public void setCustomerstreet(String customerstreet) {
        this.customerstreet = customerstreet == null ? null : customerstreet.trim();
    }

    public String getApiuser() {
        return apiuser;
    }

    public void setApiuser(String apiuser) {
        this.apiuser = apiuser == null ? null : apiuser.trim();
    }

    public String getApipassword() {
        return apipassword;
    }

    public void setApipassword(String apipassword) {
        this.apipassword = apipassword == null ? null : apipassword.trim();
    }

    public String getApitoken() {
        return apitoken;
    }

    public void setApitoken(String apitoken) {
        this.apitoken = apitoken == null ? null : apitoken.trim();
    }

    public String getFiled5() {
        return filed5;
    }

    public void setFiled5(String filed5) {
        this.filed5 = filed5 == null ? null : filed5.trim();
    }

    public String getFiled6() {
        return filed6;
    }

    public void setFiled6(String filed6) {
        this.filed6 = filed6 == null ? null : filed6.trim();
    }

    public String getFiled7() {
        return filed7;
    }

    public void setFiled7(String filed7) {
        this.filed7 = filed7 == null ? null : filed7.trim();
    }

    public String getFiled8() {
        return filed8;
    }

    public void setFiled8(String filed8) {
        this.filed8 = filed8 == null ? null : filed8.trim();
    }

    public String getFiled9() {
        return filed9;
    }

    public void setFiled9(String filed9) {
        this.filed9 = filed9 == null ? null : filed9.trim();
    }

    public String getFiled10() {
        return filed10;
    }

    public void setFiled10(String filed10) {
        this.filed10 = filed10 == null ? null : filed10.trim();
    }

    public BigDecimal getFiled11() {
        return filed11;
    }

    public void setFiled11(BigDecimal filed11) {
        this.filed11 = filed11;
    }

    public BigDecimal getFiled12() {
        return filed12;
    }

    public void setFiled12(BigDecimal filed12) {
        this.filed12 = filed12;
    }

    public BigDecimal getFiled13() {
        return filed13;
    }

    public void setFiled13(BigDecimal filed13) {
        this.filed13 = filed13;
    }

    public String getPaypalcustomeraddress() {
        return paypalcustomeraddress;
    }

    public void setPaypalcustomeraddress(String paypalcustomeraddress) {
        this.paypalcustomeraddress = paypalcustomeraddress == null ? null : paypalcustomeraddress.trim();
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
        DbPaypalTemp other = (DbPaypalTemp) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getEmailaddress() == null ? other.getEmailaddress() == null : this.getEmailaddress().equals(other.getEmailaddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFeeamount() == null ? other.getFeeamount() == null : this.getFeeamount().equals(other.getFeeamount()))
            && (this.getGrossamount() == null ? other.getGrossamount() == null : this.getGrossamount().equals(other.getGrossamount()))
            && (this.getNetamount() == null ? other.getNetamount() == null : this.getNetamount().equals(other.getNetamount()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomerstreet() == null ? other.getCustomerstreet() == null : this.getCustomerstreet().equals(other.getCustomerstreet()))
            && (this.getApiuser() == null ? other.getApiuser() == null : this.getApiuser().equals(other.getApiuser()))
            && (this.getApipassword() == null ? other.getApipassword() == null : this.getApipassword().equals(other.getApipassword()))
            && (this.getApitoken() == null ? other.getApitoken() == null : this.getApitoken().equals(other.getApitoken()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getFiled6() == null ? other.getFiled6() == null : this.getFiled6().equals(other.getFiled6()))
            && (this.getFiled7() == null ? other.getFiled7() == null : this.getFiled7().equals(other.getFiled7()))
            && (this.getFiled8() == null ? other.getFiled8() == null : this.getFiled8().equals(other.getFiled8()))
            && (this.getFiled9() == null ? other.getFiled9() == null : this.getFiled9().equals(other.getFiled9()))
            && (this.getFiled10() == null ? other.getFiled10() == null : this.getFiled10().equals(other.getFiled10()))
            && (this.getFiled11() == null ? other.getFiled11() == null : this.getFiled11().equals(other.getFiled11()))
            && (this.getFiled12() == null ? other.getFiled12() == null : this.getFiled12().equals(other.getFiled12()))
            && (this.getFiled13() == null ? other.getFiled13() == null : this.getFiled13().equals(other.getFiled13()))
            && (this.getPaypalcustomeraddress() == null ? other.getPaypalcustomeraddress() == null : this.getPaypalcustomeraddress().equals(other.getPaypalcustomeraddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getEmailaddress() == null) ? 0 : getEmailaddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFeeamount() == null) ? 0 : getFeeamount().hashCode());
        result = prime * result + ((getGrossamount() == null) ? 0 : getGrossamount().hashCode());
        result = prime * result + ((getNetamount() == null) ? 0 : getNetamount().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomerstreet() == null) ? 0 : getCustomerstreet().hashCode());
        result = prime * result + ((getApiuser() == null) ? 0 : getApiuser().hashCode());
        result = prime * result + ((getApipassword() == null) ? 0 : getApipassword().hashCode());
        result = prime * result + ((getApitoken() == null) ? 0 : getApitoken().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getFiled6() == null) ? 0 : getFiled6().hashCode());
        result = prime * result + ((getFiled7() == null) ? 0 : getFiled7().hashCode());
        result = prime * result + ((getFiled8() == null) ? 0 : getFiled8().hashCode());
        result = prime * result + ((getFiled9() == null) ? 0 : getFiled9().hashCode());
        result = prime * result + ((getFiled10() == null) ? 0 : getFiled10().hashCode());
        result = prime * result + ((getFiled11() == null) ? 0 : getFiled11().hashCode());
        result = prime * result + ((getFiled12() == null) ? 0 : getFiled12().hashCode());
        result = prime * result + ((getFiled13() == null) ? 0 : getFiled13().hashCode());
        result = prime * result + ((getPaypalcustomeraddress() == null) ? 0 : getPaypalcustomeraddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", address=").append(address);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", emailaddress=").append(emailaddress);
        sb.append(", status=").append(status);
        sb.append(", feeamount=").append(feeamount);
        sb.append(", grossamount=").append(grossamount);
        sb.append(", netamount=").append(netamount);
        sb.append(", paytime=").append(paytime);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", filed4=").append(filed4);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customerstreet=").append(customerstreet);
        sb.append(", apiuser=").append(apiuser);
        sb.append(", apipassword=").append(apipassword);
        sb.append(", apitoken=").append(apitoken);
        sb.append(", filed5=").append(filed5);
        sb.append(", filed6=").append(filed6);
        sb.append(", filed7=").append(filed7);
        sb.append(", filed8=").append(filed8);
        sb.append(", filed9=").append(filed9);
        sb.append(", filed10=").append(filed10);
        sb.append(", filed11=").append(filed11);
        sb.append(", filed12=").append(filed12);
        sb.append(", filed13=").append(filed13);
        sb.append(", paypalcustomeraddress=").append(paypalcustomeraddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}