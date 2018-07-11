package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbAliaddress implements Serializable {
    private String dbOrder;

    private String shopname;

    private String sendercity;

    private String sendercountry;

    private String sendercounty;

    private String sendername;

    private String senderphone;

    private String senderpostcode;

    private String senderprovince;

    private String senderstreetaddress;

    private String pickupcity;

    private String pickupcounty;

    private String pickupcountry;

    private String pickupphone;

    private String pickupname;

    private String pickuppostcode;

    private String pickupprovince;

    private String pickupstreetaddress;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public String getDbOrder() {
        return dbOrder;
    }

    public void setDbOrder(String dbOrder) {
        this.dbOrder = dbOrder == null ? null : dbOrder.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getSendercity() {
        return sendercity;
    }

    public void setSendercity(String sendercity) {
        this.sendercity = sendercity == null ? null : sendercity.trim();
    }

    public String getSendercountry() {
        return sendercountry;
    }

    public void setSendercountry(String sendercountry) {
        this.sendercountry = sendercountry == null ? null : sendercountry.trim();
    }

    public String getSendercounty() {
        return sendercounty;
    }

    public void setSendercounty(String sendercounty) {
        this.sendercounty = sendercounty == null ? null : sendercounty.trim();
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername == null ? null : sendername.trim();
    }

    public String getSenderphone() {
        return senderphone;
    }

    public void setSenderphone(String senderphone) {
        this.senderphone = senderphone == null ? null : senderphone.trim();
    }

    public String getSenderpostcode() {
        return senderpostcode;
    }

    public void setSenderpostcode(String senderpostcode) {
        this.senderpostcode = senderpostcode == null ? null : senderpostcode.trim();
    }

    public String getSenderprovince() {
        return senderprovince;
    }

    public void setSenderprovince(String senderprovince) {
        this.senderprovince = senderprovince == null ? null : senderprovince.trim();
    }

    public String getSenderstreetaddress() {
        return senderstreetaddress;
    }

    public void setSenderstreetaddress(String senderstreetaddress) {
        this.senderstreetaddress = senderstreetaddress == null ? null : senderstreetaddress.trim();
    }

    public String getPickupcity() {
        return pickupcity;
    }

    public void setPickupcity(String pickupcity) {
        this.pickupcity = pickupcity == null ? null : pickupcity.trim();
    }

    public String getPickupcounty() {
        return pickupcounty;
    }

    public void setPickupcounty(String pickupcounty) {
        this.pickupcounty = pickupcounty == null ? null : pickupcounty.trim();
    }

    public String getPickupcountry() {
        return pickupcountry;
    }

    public void setPickupcountry(String pickupcountry) {
        this.pickupcountry = pickupcountry == null ? null : pickupcountry.trim();
    }

    public String getPickupphone() {
        return pickupphone;
    }

    public void setPickupphone(String pickupphone) {
        this.pickupphone = pickupphone == null ? null : pickupphone.trim();
    }

    public String getPickupname() {
        return pickupname;
    }

    public void setPickupname(String pickupname) {
        this.pickupname = pickupname == null ? null : pickupname.trim();
    }

    public String getPickuppostcode() {
        return pickuppostcode;
    }

    public void setPickuppostcode(String pickuppostcode) {
        this.pickuppostcode = pickuppostcode == null ? null : pickuppostcode.trim();
    }

    public String getPickupprovince() {
        return pickupprovince;
    }

    public void setPickupprovince(String pickupprovince) {
        this.pickupprovince = pickupprovince == null ? null : pickupprovince.trim();
    }

    public String getPickupstreetaddress() {
        return pickupstreetaddress;
    }

    public void setPickupstreetaddress(String pickupstreetaddress) {
        this.pickupstreetaddress = pickupstreetaddress == null ? null : pickupstreetaddress.trim();
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
        DbAliaddress other = (DbAliaddress) that;
        return (this.getDbOrder() == null ? other.getDbOrder() == null : this.getDbOrder().equals(other.getDbOrder()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getSendercity() == null ? other.getSendercity() == null : this.getSendercity().equals(other.getSendercity()))
            && (this.getSendercountry() == null ? other.getSendercountry() == null : this.getSendercountry().equals(other.getSendercountry()))
            && (this.getSendercounty() == null ? other.getSendercounty() == null : this.getSendercounty().equals(other.getSendercounty()))
            && (this.getSendername() == null ? other.getSendername() == null : this.getSendername().equals(other.getSendername()))
            && (this.getSenderphone() == null ? other.getSenderphone() == null : this.getSenderphone().equals(other.getSenderphone()))
            && (this.getSenderpostcode() == null ? other.getSenderpostcode() == null : this.getSenderpostcode().equals(other.getSenderpostcode()))
            && (this.getSenderprovince() == null ? other.getSenderprovince() == null : this.getSenderprovince().equals(other.getSenderprovince()))
            && (this.getSenderstreetaddress() == null ? other.getSenderstreetaddress() == null : this.getSenderstreetaddress().equals(other.getSenderstreetaddress()))
            && (this.getPickupcity() == null ? other.getPickupcity() == null : this.getPickupcity().equals(other.getPickupcity()))
            && (this.getPickupcounty() == null ? other.getPickupcounty() == null : this.getPickupcounty().equals(other.getPickupcounty()))
            && (this.getPickupcountry() == null ? other.getPickupcountry() == null : this.getPickupcountry().equals(other.getPickupcountry()))
            && (this.getPickupphone() == null ? other.getPickupphone() == null : this.getPickupphone().equals(other.getPickupphone()))
            && (this.getPickupname() == null ? other.getPickupname() == null : this.getPickupname().equals(other.getPickupname()))
            && (this.getPickuppostcode() == null ? other.getPickuppostcode() == null : this.getPickuppostcode().equals(other.getPickuppostcode()))
            && (this.getPickupprovince() == null ? other.getPickupprovince() == null : this.getPickupprovince().equals(other.getPickupprovince()))
            && (this.getPickupstreetaddress() == null ? other.getPickupstreetaddress() == null : this.getPickupstreetaddress().equals(other.getPickupstreetaddress()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDbOrder() == null) ? 0 : getDbOrder().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getSendercity() == null) ? 0 : getSendercity().hashCode());
        result = prime * result + ((getSendercountry() == null) ? 0 : getSendercountry().hashCode());
        result = prime * result + ((getSendercounty() == null) ? 0 : getSendercounty().hashCode());
        result = prime * result + ((getSendername() == null) ? 0 : getSendername().hashCode());
        result = prime * result + ((getSenderphone() == null) ? 0 : getSenderphone().hashCode());
        result = prime * result + ((getSenderpostcode() == null) ? 0 : getSenderpostcode().hashCode());
        result = prime * result + ((getSenderprovince() == null) ? 0 : getSenderprovince().hashCode());
        result = prime * result + ((getSenderstreetaddress() == null) ? 0 : getSenderstreetaddress().hashCode());
        result = prime * result + ((getPickupcity() == null) ? 0 : getPickupcity().hashCode());
        result = prime * result + ((getPickupcounty() == null) ? 0 : getPickupcounty().hashCode());
        result = prime * result + ((getPickupcountry() == null) ? 0 : getPickupcountry().hashCode());
        result = prime * result + ((getPickupphone() == null) ? 0 : getPickupphone().hashCode());
        result = prime * result + ((getPickupname() == null) ? 0 : getPickupname().hashCode());
        result = prime * result + ((getPickuppostcode() == null) ? 0 : getPickuppostcode().hashCode());
        result = prime * result + ((getPickupprovince() == null) ? 0 : getPickupprovince().hashCode());
        result = prime * result + ((getPickupstreetaddress() == null) ? 0 : getPickupstreetaddress().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dbOrder=").append(dbOrder);
        sb.append(", shopname=").append(shopname);
        sb.append(", sendercity=").append(sendercity);
        sb.append(", sendercountry=").append(sendercountry);
        sb.append(", sendercounty=").append(sendercounty);
        sb.append(", sendername=").append(sendername);
        sb.append(", senderphone=").append(senderphone);
        sb.append(", senderpostcode=").append(senderpostcode);
        sb.append(", senderprovince=").append(senderprovince);
        sb.append(", senderstreetaddress=").append(senderstreetaddress);
        sb.append(", pickupcity=").append(pickupcity);
        sb.append(", pickupcounty=").append(pickupcounty);
        sb.append(", pickupcountry=").append(pickupcountry);
        sb.append(", pickupphone=").append(pickupphone);
        sb.append(", pickupname=").append(pickupname);
        sb.append(", pickuppostcode=").append(pickuppostcode);
        sb.append(", pickupprovince=").append(pickupprovince);
        sb.append(", pickupstreetaddress=").append(pickupstreetaddress);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}