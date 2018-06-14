package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSmtneworder implements Serializable {
    private String orderid;

    private String corpid;

    private String tradeid;

    private String groupid;

    private String buyerid;

    private String customerid;

    private String customertel1;

    private String customertel2;

    private String customeremail;

    private String customercountry;

    private String customercountrycn;

    private String customercountryjc;

    private String customerprovince;

    private String customercity;

    private String customerzipcode;

    private String customerreserve1;

    private String customerreserve2;

    private String customerreserve3;

    private BigDecimal customerreserve4;

    private BigDecimal customerreserve5;

    private String shoptypeid;

    private String shoptype;

    private String moneytype;

    private BigDecimal moneyrate;

    private BigDecimal originordermoney;

    private BigDecimal ordermoney;

    private BigDecimal costmoney;

    private BigDecimal originexpressmoney;

    private BigDecimal expressmoney;

    private String status;

    private String postageservice;

    private Date ordertime;

    private Date createtime;

    private String oper;

    private Date opertime;

    private String selloper;

    private String openflag;

    private BigDecimal messagecount;

    private BigDecimal updateflag;

    private Date updatetime;

    private String flag;

    private String flagdescr;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String customername;

    private String customeraddress;

    private String sku;

    private String product;

    private String content;

    private String noteinfo;

    private String messagecontent;

    private String updatedescr;

    private static final long serialVersionUID = 1L;

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

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid == null ? null : buyerid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
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

    public String getCustomercountryjc() {
        return customercountryjc;
    }

    public void setCustomercountryjc(String customercountryjc) {
        this.customercountryjc = customercountryjc == null ? null : customercountryjc.trim();
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

    public BigDecimal getCustomerreserve4() {
        return customerreserve4;
    }

    public void setCustomerreserve4(BigDecimal customerreserve4) {
        this.customerreserve4 = customerreserve4;
    }

    public BigDecimal getCustomerreserve5() {
        return customerreserve5;
    }

    public void setCustomerreserve5(BigDecimal customerreserve5) {
        this.customerreserve5 = customerreserve5;
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

    public BigDecimal getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(BigDecimal ordermoney) {
        this.ordermoney = ordermoney;
    }

    public BigDecimal getCostmoney() {
        return costmoney;
    }

    public void setCostmoney(BigDecimal costmoney) {
        this.costmoney = costmoney;
    }

    public BigDecimal getOriginexpressmoney() {
        return originexpressmoney;
    }

    public void setOriginexpressmoney(BigDecimal originexpressmoney) {
        this.originexpressmoney = originexpressmoney;
    }

    public BigDecimal getExpressmoney() {
        return expressmoney;
    }

    public void setExpressmoney(BigDecimal expressmoney) {
        this.expressmoney = expressmoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPostageservice() {
        return postageservice;
    }

    public void setPostageservice(String postageservice) {
        this.postageservice = postageservice == null ? null : postageservice.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public BigDecimal getMessagecount() {
        return messagecount;
    }

    public void setMessagecount(BigDecimal messagecount) {
        this.messagecount = messagecount;
    }

    public BigDecimal getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(BigDecimal updateflag) {
        this.updateflag = updateflag;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getFlagdescr() {
        return flagdescr;
    }

    public void setFlagdescr(String flagdescr) {
        this.flagdescr = flagdescr == null ? null : flagdescr.trim();
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

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getNoteinfo() {
        return noteinfo;
    }

    public void setNoteinfo(String noteinfo) {
        this.noteinfo = noteinfo == null ? null : noteinfo.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
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
        DbSmtneworder other = (DbSmtneworder) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getBuyerid() == null ? other.getBuyerid() == null : this.getBuyerid().equals(other.getBuyerid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCustomertel1() == null ? other.getCustomertel1() == null : this.getCustomertel1().equals(other.getCustomertel1()))
            && (this.getCustomertel2() == null ? other.getCustomertel2() == null : this.getCustomertel2().equals(other.getCustomertel2()))
            && (this.getCustomeremail() == null ? other.getCustomeremail() == null : this.getCustomeremail().equals(other.getCustomeremail()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getCustomercountrycn() == null ? other.getCustomercountrycn() == null : this.getCustomercountrycn().equals(other.getCustomercountrycn()))
            && (this.getCustomercountryjc() == null ? other.getCustomercountryjc() == null : this.getCustomercountryjc().equals(other.getCustomercountryjc()))
            && (this.getCustomerprovince() == null ? other.getCustomerprovince() == null : this.getCustomerprovince().equals(other.getCustomerprovince()))
            && (this.getCustomercity() == null ? other.getCustomercity() == null : this.getCustomercity().equals(other.getCustomercity()))
            && (this.getCustomerzipcode() == null ? other.getCustomerzipcode() == null : this.getCustomerzipcode().equals(other.getCustomerzipcode()))
            && (this.getCustomerreserve1() == null ? other.getCustomerreserve1() == null : this.getCustomerreserve1().equals(other.getCustomerreserve1()))
            && (this.getCustomerreserve2() == null ? other.getCustomerreserve2() == null : this.getCustomerreserve2().equals(other.getCustomerreserve2()))
            && (this.getCustomerreserve3() == null ? other.getCustomerreserve3() == null : this.getCustomerreserve3().equals(other.getCustomerreserve3()))
            && (this.getCustomerreserve4() == null ? other.getCustomerreserve4() == null : this.getCustomerreserve4().equals(other.getCustomerreserve4()))
            && (this.getCustomerreserve5() == null ? other.getCustomerreserve5() == null : this.getCustomerreserve5().equals(other.getCustomerreserve5()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getMoneyrate() == null ? other.getMoneyrate() == null : this.getMoneyrate().equals(other.getMoneyrate()))
            && (this.getOriginordermoney() == null ? other.getOriginordermoney() == null : this.getOriginordermoney().equals(other.getOriginordermoney()))
            && (this.getOrdermoney() == null ? other.getOrdermoney() == null : this.getOrdermoney().equals(other.getOrdermoney()))
            && (this.getCostmoney() == null ? other.getCostmoney() == null : this.getCostmoney().equals(other.getCostmoney()))
            && (this.getOriginexpressmoney() == null ? other.getOriginexpressmoney() == null : this.getOriginexpressmoney().equals(other.getOriginexpressmoney()))
            && (this.getExpressmoney() == null ? other.getExpressmoney() == null : this.getExpressmoney().equals(other.getExpressmoney()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPostageservice() == null ? other.getPostageservice() == null : this.getPostageservice().equals(other.getPostageservice()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getMessagecount() == null ? other.getMessagecount() == null : this.getMessagecount().equals(other.getMessagecount()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getFlagdescr() == null ? other.getFlagdescr() == null : this.getFlagdescr().equals(other.getFlagdescr()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomeraddress() == null ? other.getCustomeraddress() == null : this.getCustomeraddress().equals(other.getCustomeraddress()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getNoteinfo() == null ? other.getNoteinfo() == null : this.getNoteinfo().equals(other.getNoteinfo()))
            && (this.getMessagecontent() == null ? other.getMessagecontent() == null : this.getMessagecontent().equals(other.getMessagecontent()))
            && (this.getUpdatedescr() == null ? other.getUpdatedescr() == null : this.getUpdatedescr().equals(other.getUpdatedescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getBuyerid() == null) ? 0 : getBuyerid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCustomertel1() == null) ? 0 : getCustomertel1().hashCode());
        result = prime * result + ((getCustomertel2() == null) ? 0 : getCustomertel2().hashCode());
        result = prime * result + ((getCustomeremail() == null) ? 0 : getCustomeremail().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getCustomercountrycn() == null) ? 0 : getCustomercountrycn().hashCode());
        result = prime * result + ((getCustomercountryjc() == null) ? 0 : getCustomercountryjc().hashCode());
        result = prime * result + ((getCustomerprovince() == null) ? 0 : getCustomerprovince().hashCode());
        result = prime * result + ((getCustomercity() == null) ? 0 : getCustomercity().hashCode());
        result = prime * result + ((getCustomerzipcode() == null) ? 0 : getCustomerzipcode().hashCode());
        result = prime * result + ((getCustomerreserve1() == null) ? 0 : getCustomerreserve1().hashCode());
        result = prime * result + ((getCustomerreserve2() == null) ? 0 : getCustomerreserve2().hashCode());
        result = prime * result + ((getCustomerreserve3() == null) ? 0 : getCustomerreserve3().hashCode());
        result = prime * result + ((getCustomerreserve4() == null) ? 0 : getCustomerreserve4().hashCode());
        result = prime * result + ((getCustomerreserve5() == null) ? 0 : getCustomerreserve5().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getMoneyrate() == null) ? 0 : getMoneyrate().hashCode());
        result = prime * result + ((getOriginordermoney() == null) ? 0 : getOriginordermoney().hashCode());
        result = prime * result + ((getOrdermoney() == null) ? 0 : getOrdermoney().hashCode());
        result = prime * result + ((getCostmoney() == null) ? 0 : getCostmoney().hashCode());
        result = prime * result + ((getOriginexpressmoney() == null) ? 0 : getOriginexpressmoney().hashCode());
        result = prime * result + ((getExpressmoney() == null) ? 0 : getExpressmoney().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPostageservice() == null) ? 0 : getPostageservice().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getMessagecount() == null) ? 0 : getMessagecount().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getFlagdescr() == null) ? 0 : getFlagdescr().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomeraddress() == null) ? 0 : getCustomeraddress().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getNoteinfo() == null) ? 0 : getNoteinfo().hashCode());
        result = prime * result + ((getMessagecontent() == null) ? 0 : getMessagecontent().hashCode());
        result = prime * result + ((getUpdatedescr() == null) ? 0 : getUpdatedescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", corpid=").append(corpid);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", groupid=").append(groupid);
        sb.append(", buyerid=").append(buyerid);
        sb.append(", customerid=").append(customerid);
        sb.append(", customertel1=").append(customertel1);
        sb.append(", customertel2=").append(customertel2);
        sb.append(", customeremail=").append(customeremail);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", customercountrycn=").append(customercountrycn);
        sb.append(", customercountryjc=").append(customercountryjc);
        sb.append(", customerprovince=").append(customerprovince);
        sb.append(", customercity=").append(customercity);
        sb.append(", customerzipcode=").append(customerzipcode);
        sb.append(", customerreserve1=").append(customerreserve1);
        sb.append(", customerreserve2=").append(customerreserve2);
        sb.append(", customerreserve3=").append(customerreserve3);
        sb.append(", customerreserve4=").append(customerreserve4);
        sb.append(", customerreserve5=").append(customerreserve5);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", moneyrate=").append(moneyrate);
        sb.append(", originordermoney=").append(originordermoney);
        sb.append(", ordermoney=").append(ordermoney);
        sb.append(", costmoney=").append(costmoney);
        sb.append(", originexpressmoney=").append(originexpressmoney);
        sb.append(", expressmoney=").append(expressmoney);
        sb.append(", status=").append(status);
        sb.append(", postageservice=").append(postageservice);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", createtime=").append(createtime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", selloper=").append(selloper);
        sb.append(", openflag=").append(openflag);
        sb.append(", messagecount=").append(messagecount);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", flag=").append(flag);
        sb.append(", flagdescr=").append(flagdescr);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", customername=").append(customername);
        sb.append(", customeraddress=").append(customeraddress);
        sb.append(", sku=").append(sku);
        sb.append(", product=").append(product);
        sb.append(", content=").append(content);
        sb.append(", noteinfo=").append(noteinfo);
        sb.append(", messagecontent=").append(messagecontent);
        sb.append(", updatedescr=").append(updatedescr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}