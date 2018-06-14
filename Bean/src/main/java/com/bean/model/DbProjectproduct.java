package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProjectproduct implements Serializable {
    private String sid;

    private String projectid;

    private String productid;

    private String stype;

    private String slevel;

    private String flag;

    private String translateflag;

    private String priceflag;

    private String contentflag;

    private String picflag;

    private String designflag;

    private String publicflag;

    private String translateoper;

    private String priceoper;

    private String contentoper;

    private String picoper;

    private String designoper;

    private String publicoper;

    private Date endtime;

    private BigDecimal datediff;

    private Date translatetime;

    private Date pricetime;

    private Date contenttime;

    private Date pictime;

    private Date designtime;

    private Date publictime;

    private String oper;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String checkflag;

    private String checkoper;

    private Date checktime;

    private String corpid;

    private String productname;

    private String descr;

    private String shoptype;

    private String salesource;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getSlevel() {
        return slevel;
    }

    public void setSlevel(String slevel) {
        this.slevel = slevel == null ? null : slevel.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getTranslateflag() {
        return translateflag;
    }

    public void setTranslateflag(String translateflag) {
        this.translateflag = translateflag == null ? null : translateflag.trim();
    }

    public String getPriceflag() {
        return priceflag;
    }

    public void setPriceflag(String priceflag) {
        this.priceflag = priceflag == null ? null : priceflag.trim();
    }

    public String getContentflag() {
        return contentflag;
    }

    public void setContentflag(String contentflag) {
        this.contentflag = contentflag == null ? null : contentflag.trim();
    }

    public String getPicflag() {
        return picflag;
    }

    public void setPicflag(String picflag) {
        this.picflag = picflag == null ? null : picflag.trim();
    }

    public String getDesignflag() {
        return designflag;
    }

    public void setDesignflag(String designflag) {
        this.designflag = designflag == null ? null : designflag.trim();
    }

    public String getPublicflag() {
        return publicflag;
    }

    public void setPublicflag(String publicflag) {
        this.publicflag = publicflag == null ? null : publicflag.trim();
    }

    public String getTranslateoper() {
        return translateoper;
    }

    public void setTranslateoper(String translateoper) {
        this.translateoper = translateoper == null ? null : translateoper.trim();
    }

    public String getPriceoper() {
        return priceoper;
    }

    public void setPriceoper(String priceoper) {
        this.priceoper = priceoper == null ? null : priceoper.trim();
    }

    public String getContentoper() {
        return contentoper;
    }

    public void setContentoper(String contentoper) {
        this.contentoper = contentoper == null ? null : contentoper.trim();
    }

    public String getPicoper() {
        return picoper;
    }

    public void setPicoper(String picoper) {
        this.picoper = picoper == null ? null : picoper.trim();
    }

    public String getDesignoper() {
        return designoper;
    }

    public void setDesignoper(String designoper) {
        this.designoper = designoper == null ? null : designoper.trim();
    }

    public String getPublicoper() {
        return publicoper;
    }

    public void setPublicoper(String publicoper) {
        this.publicoper = publicoper == null ? null : publicoper.trim();
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

    public Date getTranslatetime() {
        return translatetime;
    }

    public void setTranslatetime(Date translatetime) {
        this.translatetime = translatetime;
    }

    public Date getPricetime() {
        return pricetime;
    }

    public void setPricetime(Date pricetime) {
        this.pricetime = pricetime;
    }

    public Date getContenttime() {
        return contenttime;
    }

    public void setContenttime(Date contenttime) {
        this.contenttime = contenttime;
    }

    public Date getPictime() {
        return pictime;
    }

    public void setPictime(Date pictime) {
        this.pictime = pictime;
    }

    public Date getDesigntime() {
        return designtime;
    }

    public void setDesigntime(Date designtime) {
        this.designtime = designtime;
    }

    public Date getPublictime() {
        return publictime;
    }

    public void setPublictime(Date publictime) {
        this.publictime = publictime;
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

    public String getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag == null ? null : checkflag.trim();
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbProjectproduct other = (DbProjectproduct) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getProjectid() == null ? other.getProjectid() == null : this.getProjectid().equals(other.getProjectid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getSlevel() == null ? other.getSlevel() == null : this.getSlevel().equals(other.getSlevel()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getTranslateflag() == null ? other.getTranslateflag() == null : this.getTranslateflag().equals(other.getTranslateflag()))
            && (this.getPriceflag() == null ? other.getPriceflag() == null : this.getPriceflag().equals(other.getPriceflag()))
            && (this.getContentflag() == null ? other.getContentflag() == null : this.getContentflag().equals(other.getContentflag()))
            && (this.getPicflag() == null ? other.getPicflag() == null : this.getPicflag().equals(other.getPicflag()))
            && (this.getDesignflag() == null ? other.getDesignflag() == null : this.getDesignflag().equals(other.getDesignflag()))
            && (this.getPublicflag() == null ? other.getPublicflag() == null : this.getPublicflag().equals(other.getPublicflag()))
            && (this.getTranslateoper() == null ? other.getTranslateoper() == null : this.getTranslateoper().equals(other.getTranslateoper()))
            && (this.getPriceoper() == null ? other.getPriceoper() == null : this.getPriceoper().equals(other.getPriceoper()))
            && (this.getContentoper() == null ? other.getContentoper() == null : this.getContentoper().equals(other.getContentoper()))
            && (this.getPicoper() == null ? other.getPicoper() == null : this.getPicoper().equals(other.getPicoper()))
            && (this.getDesignoper() == null ? other.getDesignoper() == null : this.getDesignoper().equals(other.getDesignoper()))
            && (this.getPublicoper() == null ? other.getPublicoper() == null : this.getPublicoper().equals(other.getPublicoper()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getDatediff() == null ? other.getDatediff() == null : this.getDatediff().equals(other.getDatediff()))
            && (this.getTranslatetime() == null ? other.getTranslatetime() == null : this.getTranslatetime().equals(other.getTranslatetime()))
            && (this.getPricetime() == null ? other.getPricetime() == null : this.getPricetime().equals(other.getPricetime()))
            && (this.getContenttime() == null ? other.getContenttime() == null : this.getContenttime().equals(other.getContenttime()))
            && (this.getPictime() == null ? other.getPictime() == null : this.getPictime().equals(other.getPictime()))
            && (this.getDesigntime() == null ? other.getDesigntime() == null : this.getDesigntime().equals(other.getDesigntime()))
            && (this.getPublictime() == null ? other.getPublictime() == null : this.getPublictime().equals(other.getPublictime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getProjectid() == null) ? 0 : getProjectid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getSlevel() == null) ? 0 : getSlevel().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getTranslateflag() == null) ? 0 : getTranslateflag().hashCode());
        result = prime * result + ((getPriceflag() == null) ? 0 : getPriceflag().hashCode());
        result = prime * result + ((getContentflag() == null) ? 0 : getContentflag().hashCode());
        result = prime * result + ((getPicflag() == null) ? 0 : getPicflag().hashCode());
        result = prime * result + ((getDesignflag() == null) ? 0 : getDesignflag().hashCode());
        result = prime * result + ((getPublicflag() == null) ? 0 : getPublicflag().hashCode());
        result = prime * result + ((getTranslateoper() == null) ? 0 : getTranslateoper().hashCode());
        result = prime * result + ((getPriceoper() == null) ? 0 : getPriceoper().hashCode());
        result = prime * result + ((getContentoper() == null) ? 0 : getContentoper().hashCode());
        result = prime * result + ((getPicoper() == null) ? 0 : getPicoper().hashCode());
        result = prime * result + ((getDesignoper() == null) ? 0 : getDesignoper().hashCode());
        result = prime * result + ((getPublicoper() == null) ? 0 : getPublicoper().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getDatediff() == null) ? 0 : getDatediff().hashCode());
        result = prime * result + ((getTranslatetime() == null) ? 0 : getTranslatetime().hashCode());
        result = prime * result + ((getPricetime() == null) ? 0 : getPricetime().hashCode());
        result = prime * result + ((getContenttime() == null) ? 0 : getContenttime().hashCode());
        result = prime * result + ((getPictime() == null) ? 0 : getPictime().hashCode());
        result = prime * result + ((getDesigntime() == null) ? 0 : getDesigntime().hashCode());
        result = prime * result + ((getPublictime() == null) ? 0 : getPublictime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", projectid=").append(projectid);
        sb.append(", productid=").append(productid);
        sb.append(", stype=").append(stype);
        sb.append(", slevel=").append(slevel);
        sb.append(", flag=").append(flag);
        sb.append(", translateflag=").append(translateflag);
        sb.append(", priceflag=").append(priceflag);
        sb.append(", contentflag=").append(contentflag);
        sb.append(", picflag=").append(picflag);
        sb.append(", designflag=").append(designflag);
        sb.append(", publicflag=").append(publicflag);
        sb.append(", translateoper=").append(translateoper);
        sb.append(", priceoper=").append(priceoper);
        sb.append(", contentoper=").append(contentoper);
        sb.append(", picoper=").append(picoper);
        sb.append(", designoper=").append(designoper);
        sb.append(", publicoper=").append(publicoper);
        sb.append(", endtime=").append(endtime);
        sb.append(", datediff=").append(datediff);
        sb.append(", translatetime=").append(translatetime);
        sb.append(", pricetime=").append(pricetime);
        sb.append(", contenttime=").append(contenttime);
        sb.append(", pictime=").append(pictime);
        sb.append(", designtime=").append(designtime);
        sb.append(", publictime=").append(publictime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checktime=").append(checktime);
        sb.append(", corpid=").append(corpid);
        sb.append(", productname=").append(productname);
        sb.append(", descr=").append(descr);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}