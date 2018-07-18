package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbEbayinquiry implements Serializable {
    private String sequenceid;

    private Long id;

    private String messageid;

    private String inquiryid;

    private String shopid;

    private String status;

    private String itemid;

    private String itempictureurl;

    private String viewpurchaseditemurl;

    private String transactionid;

    private String orderid;

    private String claimamount;

    private String buyer;

    private String buyerrequested;

    private Date creationdate;

    private String lastaction;

    private String lastactor;

    private Date lastdate;

    private Short apistatus;

    private Date apidate;

    private String apidescr;

    private String lastdescription;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getInquiryid() {
        return inquiryid;
    }

    public void setInquiryid(String inquiryid) {
        this.inquiryid = inquiryid == null ? null : inquiryid.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getItempictureurl() {
        return itempictureurl;
    }

    public void setItempictureurl(String itempictureurl) {
        this.itempictureurl = itempictureurl == null ? null : itempictureurl.trim();
    }

    public String getViewpurchaseditemurl() {
        return viewpurchaseditemurl;
    }

    public void setViewpurchaseditemurl(String viewpurchaseditemurl) {
        this.viewpurchaseditemurl = viewpurchaseditemurl == null ? null : viewpurchaseditemurl.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getClaimamount() {
        return claimamount;
    }

    public void setClaimamount(String claimamount) {
        this.claimamount = claimamount == null ? null : claimamount.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public String getBuyerrequested() {
        return buyerrequested;
    }

    public void setBuyerrequested(String buyerrequested) {
        this.buyerrequested = buyerrequested == null ? null : buyerrequested.trim();
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getLastaction() {
        return lastaction;
    }

    public void setLastaction(String lastaction) {
        this.lastaction = lastaction == null ? null : lastaction.trim();
    }

    public String getLastactor() {
        return lastactor;
    }

    public void setLastactor(String lastactor) {
        this.lastactor = lastactor == null ? null : lastactor.trim();
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public Short getApistatus() {
        return apistatus;
    }

    public void setApistatus(Short apistatus) {
        this.apistatus = apistatus;
    }

    public Date getApidate() {
        return apidate;
    }

    public void setApidate(Date apidate) {
        this.apidate = apidate;
    }

    public String getApidescr() {
        return apidescr;
    }

    public void setApidescr(String apidescr) {
        this.apidescr = apidescr == null ? null : apidescr.trim();
    }

    public String getLastdescription() {
        return lastdescription;
    }

    public void setLastdescription(String lastdescription) {
        this.lastdescription = lastdescription == null ? null : lastdescription.trim();
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
        DbEbayinquiry other = (DbEbayinquiry) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getInquiryid() == null ? other.getInquiryid() == null : this.getInquiryid().equals(other.getInquiryid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getItempictureurl() == null ? other.getItempictureurl() == null : this.getItempictureurl().equals(other.getItempictureurl()))
            && (this.getViewpurchaseditemurl() == null ? other.getViewpurchaseditemurl() == null : this.getViewpurchaseditemurl().equals(other.getViewpurchaseditemurl()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getClaimamount() == null ? other.getClaimamount() == null : this.getClaimamount().equals(other.getClaimamount()))
            && (this.getBuyer() == null ? other.getBuyer() == null : this.getBuyer().equals(other.getBuyer()))
            && (this.getBuyerrequested() == null ? other.getBuyerrequested() == null : this.getBuyerrequested().equals(other.getBuyerrequested()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getLastaction() == null ? other.getLastaction() == null : this.getLastaction().equals(other.getLastaction()))
            && (this.getLastactor() == null ? other.getLastactor() == null : this.getLastactor().equals(other.getLastactor()))
            && (this.getLastdate() == null ? other.getLastdate() == null : this.getLastdate().equals(other.getLastdate()))
            && (this.getApistatus() == null ? other.getApistatus() == null : this.getApistatus().equals(other.getApistatus()))
            && (this.getApidate() == null ? other.getApidate() == null : this.getApidate().equals(other.getApidate()))
            && (this.getApidescr() == null ? other.getApidescr() == null : this.getApidescr().equals(other.getApidescr()))
            && (this.getLastdescription() == null ? other.getLastdescription() == null : this.getLastdescription().equals(other.getLastdescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getInquiryid() == null) ? 0 : getInquiryid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getItempictureurl() == null) ? 0 : getItempictureurl().hashCode());
        result = prime * result + ((getViewpurchaseditemurl() == null) ? 0 : getViewpurchaseditemurl().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getClaimamount() == null) ? 0 : getClaimamount().hashCode());
        result = prime * result + ((getBuyer() == null) ? 0 : getBuyer().hashCode());
        result = prime * result + ((getBuyerrequested() == null) ? 0 : getBuyerrequested().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getLastaction() == null) ? 0 : getLastaction().hashCode());
        result = prime * result + ((getLastactor() == null) ? 0 : getLastactor().hashCode());
        result = prime * result + ((getLastdate() == null) ? 0 : getLastdate().hashCode());
        result = prime * result + ((getApistatus() == null) ? 0 : getApistatus().hashCode());
        result = prime * result + ((getApidate() == null) ? 0 : getApidate().hashCode());
        result = prime * result + ((getApidescr() == null) ? 0 : getApidescr().hashCode());
        result = prime * result + ((getLastdescription() == null) ? 0 : getLastdescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", id=").append(id);
        sb.append(", messageid=").append(messageid);
        sb.append(", inquiryid=").append(inquiryid);
        sb.append(", shopid=").append(shopid);
        sb.append(", status=").append(status);
        sb.append(", itemid=").append(itemid);
        sb.append(", itempictureurl=").append(itempictureurl);
        sb.append(", viewpurchaseditemurl=").append(viewpurchaseditemurl);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", orderid=").append(orderid);
        sb.append(", claimamount=").append(claimamount);
        sb.append(", buyer=").append(buyer);
        sb.append(", buyerrequested=").append(buyerrequested);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", lastaction=").append(lastaction);
        sb.append(", lastactor=").append(lastactor);
        sb.append(", lastdate=").append(lastdate);
        sb.append(", apistatus=").append(apistatus);
        sb.append(", apidate=").append(apidate);
        sb.append(", apidescr=").append(apidescr);
        sb.append(", lastdescription=").append(lastdescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}