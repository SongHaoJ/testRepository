package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbFeedback implements Serializable {
    private String feedbackid;

    private String customerid;

    private String transactionid;

    private String itemid;

    private String productid;

    private String productname;

    private String feedbacktypeid;

    private String feedbacktype;

    private String content;

    private Date feedbacktime;

    private Date createtime;

    private String shoptypeid;

    private String shoptype;

    private String expresstypeid;

    private String expresstype;

    private String stype;

    private String oper;

    private Date opertime;

    private String answer;

    private String manufactureid;

    private String manufacture;

    private BigDecimal money;

    private BigDecimal returnmoney;

    private String paypalid;

    private BigDecimal ordernum;

    private BigDecimal sellnum;

    private String website;

    private String purchaseoper;

    private String selloper;

    private String serviceoper;

    private String pickupoper;

    private String country;

    private String orderid;

    private Date ordertime;

    private Date expresstime;

    private String status;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private String ifreturn;

    private BigDecimal itemprice;

    private String itempricetype;

    private static final long serialVersionUID = 1L;

    public String getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid == null ? null : feedbackid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getFeedbacktypeid() {
        return feedbacktypeid;
    }

    public void setFeedbacktypeid(String feedbacktypeid) {
        this.feedbacktypeid = feedbacktypeid == null ? null : feedbacktypeid.trim();
    }

    public String getFeedbacktype() {
        return feedbacktype;
    }

    public void setFeedbacktype(String feedbacktype) {
        this.feedbacktype = feedbacktype == null ? null : feedbacktype.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getReturnmoney() {
        return returnmoney;
    }

    public void setReturnmoney(BigDecimal returnmoney) {
        this.returnmoney = returnmoney;
    }

    public String getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(String paypalid) {
        this.paypalid = paypalid == null ? null : paypalid.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getSellnum() {
        return sellnum;
    }

    public void setSellnum(BigDecimal sellnum) {
        this.sellnum = sellnum;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public String getServiceoper() {
        return serviceoper;
    }

    public void setServiceoper(String serviceoper) {
        this.serviceoper = serviceoper == null ? null : serviceoper.trim();
    }

    public String getPickupoper() {
        return pickupoper;
    }

    public void setPickupoper(String pickupoper) {
        this.pickupoper = pickupoper == null ? null : pickupoper.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getExpresstime() {
        return expresstime;
    }

    public void setExpresstime(Date expresstime) {
        this.expresstime = expresstime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
    }

    public BigDecimal getReserve7() {
        return reserve7;
    }

    public void setReserve7(BigDecimal reserve7) {
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

    public BigDecimal getReserve10() {
        return reserve10;
    }

    public void setReserve10(BigDecimal reserve10) {
        this.reserve10 = reserve10;
    }

    public String getIfreturn() {
        return ifreturn;
    }

    public void setIfreturn(String ifreturn) {
        this.ifreturn = ifreturn == null ? null : ifreturn.trim();
    }

    public BigDecimal getItemprice() {
        return itemprice;
    }

    public void setItemprice(BigDecimal itemprice) {
        this.itemprice = itemprice;
    }

    public String getItempricetype() {
        return itempricetype;
    }

    public void setItempricetype(String itempricetype) {
        this.itempricetype = itempricetype == null ? null : itempricetype.trim();
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
        DbFeedback other = (DbFeedback) that;
        return (this.getFeedbackid() == null ? other.getFeedbackid() == null : this.getFeedbackid().equals(other.getFeedbackid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getFeedbacktypeid() == null ? other.getFeedbacktypeid() == null : this.getFeedbacktypeid().equals(other.getFeedbacktypeid()))
            && (this.getFeedbacktype() == null ? other.getFeedbacktype() == null : this.getFeedbacktype().equals(other.getFeedbacktype()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getFeedbacktime() == null ? other.getFeedbacktime() == null : this.getFeedbacktime().equals(other.getFeedbacktime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getReturnmoney() == null ? other.getReturnmoney() == null : this.getReturnmoney().equals(other.getReturnmoney()))
            && (this.getPaypalid() == null ? other.getPaypalid() == null : this.getPaypalid().equals(other.getPaypalid()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getSellnum() == null ? other.getSellnum() == null : this.getSellnum().equals(other.getSellnum()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getServiceoper() == null ? other.getServiceoper() == null : this.getServiceoper().equals(other.getServiceoper()))
            && (this.getPickupoper() == null ? other.getPickupoper() == null : this.getPickupoper().equals(other.getPickupoper()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getExpresstime() == null ? other.getExpresstime() == null : this.getExpresstime().equals(other.getExpresstime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getIfreturn() == null ? other.getIfreturn() == null : this.getIfreturn().equals(other.getIfreturn()))
            && (this.getItemprice() == null ? other.getItemprice() == null : this.getItemprice().equals(other.getItemprice()))
            && (this.getItempricetype() == null ? other.getItempricetype() == null : this.getItempricetype().equals(other.getItempricetype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeedbackid() == null) ? 0 : getFeedbackid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getFeedbacktypeid() == null) ? 0 : getFeedbacktypeid().hashCode());
        result = prime * result + ((getFeedbacktype() == null) ? 0 : getFeedbacktype().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getFeedbacktime() == null) ? 0 : getFeedbacktime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getReturnmoney() == null) ? 0 : getReturnmoney().hashCode());
        result = prime * result + ((getPaypalid() == null) ? 0 : getPaypalid().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getSellnum() == null) ? 0 : getSellnum().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getServiceoper() == null) ? 0 : getServiceoper().hashCode());
        result = prime * result + ((getPickupoper() == null) ? 0 : getPickupoper().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getExpresstime() == null) ? 0 : getExpresstime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getIfreturn() == null) ? 0 : getIfreturn().hashCode());
        result = prime * result + ((getItemprice() == null) ? 0 : getItemprice().hashCode());
        result = prime * result + ((getItempricetype() == null) ? 0 : getItempricetype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackid=").append(feedbackid);
        sb.append(", customerid=").append(customerid);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", itemid=").append(itemid);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", feedbacktypeid=").append(feedbacktypeid);
        sb.append(", feedbacktype=").append(feedbacktype);
        sb.append(", content=").append(content);
        sb.append(", feedbacktime=").append(feedbacktime);
        sb.append(", createtime=").append(createtime);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", stype=").append(stype);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", answer=").append(answer);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", money=").append(money);
        sb.append(", returnmoney=").append(returnmoney);
        sb.append(", paypalid=").append(paypalid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", sellnum=").append(sellnum);
        sb.append(", website=").append(website);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", selloper=").append(selloper);
        sb.append(", serviceoper=").append(serviceoper);
        sb.append(", pickupoper=").append(pickupoper);
        sb.append(", country=").append(country);
        sb.append(", orderid=").append(orderid);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", expresstime=").append(expresstime);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", ifreturn=").append(ifreturn);
        sb.append(", itemprice=").append(itemprice);
        sb.append(", itempricetype=").append(itempricetype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}