package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProject implements Serializable {
    private String sid;

    private String descr;

    private String flag;

    private String oper;

    private Date opertime;

    private String translategroup;

    private String pricegroup;

    private String contentgroup;

    private String picgroup;

    private String designgroup;

    private String checkgroup;

    private String publicgroup;

    private String reserve5;

    private Date endtime;

    private BigDecimal datediff;

    private String corpid;

    private String name;

    private String shoptype;

    private String salesource;

    private String productid;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String productsku;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
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

    public String getTranslategroup() {
        return translategroup;
    }

    public void setTranslategroup(String translategroup) {
        this.translategroup = translategroup == null ? null : translategroup.trim();
    }

    public String getPricegroup() {
        return pricegroup;
    }

    public void setPricegroup(String pricegroup) {
        this.pricegroup = pricegroup == null ? null : pricegroup.trim();
    }

    public String getContentgroup() {
        return contentgroup;
    }

    public void setContentgroup(String contentgroup) {
        this.contentgroup = contentgroup == null ? null : contentgroup.trim();
    }

    public String getPicgroup() {
        return picgroup;
    }

    public void setPicgroup(String picgroup) {
        this.picgroup = picgroup == null ? null : picgroup.trim();
    }

    public String getDesigngroup() {
        return designgroup;
    }

    public void setDesigngroup(String designgroup) {
        this.designgroup = designgroup == null ? null : designgroup.trim();
    }

    public String getCheckgroup() {
        return checkgroup;
    }

    public void setCheckgroup(String checkgroup) {
        this.checkgroup = checkgroup == null ? null : checkgroup.trim();
    }

    public String getPublicgroup() {
        return publicgroup;
    }

    public void setPublicgroup(String publicgroup) {
        this.publicgroup = publicgroup == null ? null : publicgroup.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getDatediff() {
        return datediff;
    }

    public void setDatediff(BigDecimal datediff) {
        this.datediff = datediff;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getSalesource() {
        return salesource;
    }

    public void setSalesource(String salesource) {
        this.salesource = salesource == null ? null : salesource.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
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

    public String getProductsku() {
        return productsku;
    }

    public void setProductsku(String productsku) {
        this.productsku = productsku == null ? null : productsku.trim();
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
        DbProject other = (DbProject) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTranslategroup() == null ? other.getTranslategroup() == null : this.getTranslategroup().equals(other.getTranslategroup()))
            && (this.getPricegroup() == null ? other.getPricegroup() == null : this.getPricegroup().equals(other.getPricegroup()))
            && (this.getContentgroup() == null ? other.getContentgroup() == null : this.getContentgroup().equals(other.getContentgroup()))
            && (this.getPicgroup() == null ? other.getPicgroup() == null : this.getPicgroup().equals(other.getPicgroup()))
            && (this.getDesigngroup() == null ? other.getDesigngroup() == null : this.getDesigngroup().equals(other.getDesigngroup()))
            && (this.getCheckgroup() == null ? other.getCheckgroup() == null : this.getCheckgroup().equals(other.getCheckgroup()))
            && (this.getPublicgroup() == null ? other.getPublicgroup() == null : this.getPublicgroup().equals(other.getPublicgroup()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getDatediff() == null ? other.getDatediff() == null : this.getDatediff().equals(other.getDatediff()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getProductsku() == null ? other.getProductsku() == null : this.getProductsku().equals(other.getProductsku()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTranslategroup() == null) ? 0 : getTranslategroup().hashCode());
        result = prime * result + ((getPricegroup() == null) ? 0 : getPricegroup().hashCode());
        result = prime * result + ((getContentgroup() == null) ? 0 : getContentgroup().hashCode());
        result = prime * result + ((getPicgroup() == null) ? 0 : getPicgroup().hashCode());
        result = prime * result + ((getDesigngroup() == null) ? 0 : getDesigngroup().hashCode());
        result = prime * result + ((getCheckgroup() == null) ? 0 : getCheckgroup().hashCode());
        result = prime * result + ((getPublicgroup() == null) ? 0 : getPublicgroup().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getDatediff() == null) ? 0 : getDatediff().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getProductsku() == null) ? 0 : getProductsku().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", descr=").append(descr);
        sb.append(", flag=").append(flag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", translategroup=").append(translategroup);
        sb.append(", pricegroup=").append(pricegroup);
        sb.append(", contentgroup=").append(contentgroup);
        sb.append(", picgroup=").append(picgroup);
        sb.append(", designgroup=").append(designgroup);
        sb.append(", checkgroup=").append(checkgroup);
        sb.append(", publicgroup=").append(publicgroup);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", endtime=").append(endtime);
        sb.append(", datediff=").append(datediff);
        sb.append(", corpid=").append(corpid);
        sb.append(", name=").append(name);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", productid=").append(productid);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", productsku=").append(productsku);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}