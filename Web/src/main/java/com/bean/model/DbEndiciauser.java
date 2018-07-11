package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEndiciauser implements Serializable {
    private String sequenceid;

    private String requesterid;

    private String accountid;

    private String fromcompany;

    private String returnaddress;

    private String fromcity;

    private String fromstate;

    private String frompostalcode;

    private String fromzip4;

    private String fromcountry;

    private String fromphone;

    private String fromemail;

    private Short flag;

    private String oper;

    private Date opertime;

    private Integer updateflag;

    private Integer recreditamount;

    private BigDecimal postagebalance;

    private BigDecimal ascendingbalance;

    private String passphrase;

    private String fromname;

    private String updatedescr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getRequesterid() {
        return requesterid;
    }

    public void setRequesterid(String requesterid) {
        this.requesterid = requesterid == null ? null : requesterid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getFromcompany() {
        return fromcompany;
    }

    public void setFromcompany(String fromcompany) {
        this.fromcompany = fromcompany == null ? null : fromcompany.trim();
    }

    public String getReturnaddress() {
        return returnaddress;
    }

    public void setReturnaddress(String returnaddress) {
        this.returnaddress = returnaddress == null ? null : returnaddress.trim();
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity == null ? null : fromcity.trim();
    }

    public String getFromstate() {
        return fromstate;
    }

    public void setFromstate(String fromstate) {
        this.fromstate = fromstate == null ? null : fromstate.trim();
    }

    public String getFrompostalcode() {
        return frompostalcode;
    }

    public void setFrompostalcode(String frompostalcode) {
        this.frompostalcode = frompostalcode == null ? null : frompostalcode.trim();
    }

    public String getFromzip4() {
        return fromzip4;
    }

    public void setFromzip4(String fromzip4) {
        this.fromzip4 = fromzip4 == null ? null : fromzip4.trim();
    }

    public String getFromcountry() {
        return fromcountry;
    }

    public void setFromcountry(String fromcountry) {
        this.fromcountry = fromcountry == null ? null : fromcountry.trim();
    }

    public String getFromphone() {
        return fromphone;
    }

    public void setFromphone(String fromphone) {
        this.fromphone = fromphone == null ? null : fromphone.trim();
    }

    public String getFromemail() {
        return fromemail;
    }

    public void setFromemail(String fromemail) {
        this.fromemail = fromemail == null ? null : fromemail.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
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

    public Integer getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(Integer updateflag) {
        this.updateflag = updateflag;
    }

    public Integer getRecreditamount() {
        return recreditamount;
    }

    public void setRecreditamount(Integer recreditamount) {
        this.recreditamount = recreditamount;
    }

    public BigDecimal getPostagebalance() {
        return postagebalance;
    }

    public void setPostagebalance(BigDecimal postagebalance) {
        this.postagebalance = postagebalance;
    }

    public BigDecimal getAscendingbalance() {
        return ascendingbalance;
    }

    public void setAscendingbalance(BigDecimal ascendingbalance) {
        this.ascendingbalance = ascendingbalance;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase == null ? null : passphrase.trim();
    }

    public String getFromname() {
        return fromname;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname == null ? null : fromname.trim();
    }

    public String getUpdatedescr() {
        return updatedescr;
    }

    public void setUpdatedescr(String updatedescr) {
        this.updatedescr = updatedescr == null ? null : updatedescr.trim();
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
        DbEndiciauser other = (DbEndiciauser) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getRequesterid() == null ? other.getRequesterid() == null : this.getRequesterid().equals(other.getRequesterid()))
            && (this.getAccountid() == null ? other.getAccountid() == null : this.getAccountid().equals(other.getAccountid()))
            && (this.getFromcompany() == null ? other.getFromcompany() == null : this.getFromcompany().equals(other.getFromcompany()))
            && (this.getReturnaddress() == null ? other.getReturnaddress() == null : this.getReturnaddress().equals(other.getReturnaddress()))
            && (this.getFromcity() == null ? other.getFromcity() == null : this.getFromcity().equals(other.getFromcity()))
            && (this.getFromstate() == null ? other.getFromstate() == null : this.getFromstate().equals(other.getFromstate()))
            && (this.getFrompostalcode() == null ? other.getFrompostalcode() == null : this.getFrompostalcode().equals(other.getFrompostalcode()))
            && (this.getFromzip4() == null ? other.getFromzip4() == null : this.getFromzip4().equals(other.getFromzip4()))
            && (this.getFromcountry() == null ? other.getFromcountry() == null : this.getFromcountry().equals(other.getFromcountry()))
            && (this.getFromphone() == null ? other.getFromphone() == null : this.getFromphone().equals(other.getFromphone()))
            && (this.getFromemail() == null ? other.getFromemail() == null : this.getFromemail().equals(other.getFromemail()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getRecreditamount() == null ? other.getRecreditamount() == null : this.getRecreditamount().equals(other.getRecreditamount()))
            && (this.getPostagebalance() == null ? other.getPostagebalance() == null : this.getPostagebalance().equals(other.getPostagebalance()))
            && (this.getAscendingbalance() == null ? other.getAscendingbalance() == null : this.getAscendingbalance().equals(other.getAscendingbalance()))
            && (this.getPassphrase() == null ? other.getPassphrase() == null : this.getPassphrase().equals(other.getPassphrase()))
            && (this.getFromname() == null ? other.getFromname() == null : this.getFromname().equals(other.getFromname()))
            && (this.getUpdatedescr() == null ? other.getUpdatedescr() == null : this.getUpdatedescr().equals(other.getUpdatedescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getRequesterid() == null) ? 0 : getRequesterid().hashCode());
        result = prime * result + ((getAccountid() == null) ? 0 : getAccountid().hashCode());
        result = prime * result + ((getFromcompany() == null) ? 0 : getFromcompany().hashCode());
        result = prime * result + ((getReturnaddress() == null) ? 0 : getReturnaddress().hashCode());
        result = prime * result + ((getFromcity() == null) ? 0 : getFromcity().hashCode());
        result = prime * result + ((getFromstate() == null) ? 0 : getFromstate().hashCode());
        result = prime * result + ((getFrompostalcode() == null) ? 0 : getFrompostalcode().hashCode());
        result = prime * result + ((getFromzip4() == null) ? 0 : getFromzip4().hashCode());
        result = prime * result + ((getFromcountry() == null) ? 0 : getFromcountry().hashCode());
        result = prime * result + ((getFromphone() == null) ? 0 : getFromphone().hashCode());
        result = prime * result + ((getFromemail() == null) ? 0 : getFromemail().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getRecreditamount() == null) ? 0 : getRecreditamount().hashCode());
        result = prime * result + ((getPostagebalance() == null) ? 0 : getPostagebalance().hashCode());
        result = prime * result + ((getAscendingbalance() == null) ? 0 : getAscendingbalance().hashCode());
        result = prime * result + ((getPassphrase() == null) ? 0 : getPassphrase().hashCode());
        result = prime * result + ((getFromname() == null) ? 0 : getFromname().hashCode());
        result = prime * result + ((getUpdatedescr() == null) ? 0 : getUpdatedescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", requesterid=").append(requesterid);
        sb.append(", accountid=").append(accountid);
        sb.append(", fromcompany=").append(fromcompany);
        sb.append(", returnaddress=").append(returnaddress);
        sb.append(", fromcity=").append(fromcity);
        sb.append(", fromstate=").append(fromstate);
        sb.append(", frompostalcode=").append(frompostalcode);
        sb.append(", fromzip4=").append(fromzip4);
        sb.append(", fromcountry=").append(fromcountry);
        sb.append(", fromphone=").append(fromphone);
        sb.append(", fromemail=").append(fromemail);
        sb.append(", flag=").append(flag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", recreditamount=").append(recreditamount);
        sb.append(", postagebalance=").append(postagebalance);
        sb.append(", ascendingbalance=").append(ascendingbalance);
        sb.append(", passphrase=").append(passphrase);
        sb.append(", fromname=").append(fromname);
        sb.append(", updatedescr=").append(updatedescr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}