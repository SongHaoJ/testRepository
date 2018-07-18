package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPostitem implements Serializable {
    private String sid;

    private String itemid;

    private String shopid;

    private String shopname;

    private BigDecimal pricetype;

    private String site;

    private BigDecimal price;

    private String sku;

    private BigDecimal flag;

    private String error;

    private String oper;

    private Date opertime;

    private String newitemid;

    private String oldsku;

    private String oldshopid;

    private String oldshopname;

    private String templateid;

    private BigDecimal startprice;

    private BigDecimal endprice;

    private String paypaladdress;

    private String newtitle;

    private String oldtitle;

    private String addressflag;

    private BigDecimal photonum;

    private BigDecimal pricesell;

    private BigDecimal expresstype3;

    private String titleflag;

    private String sellpriceflag;

    private String customflag;

    private String savenumflag;

    private String clearanceflag;

    private String expressflag;

    private String pic;

    private BigDecimal listingduration;

    private String priceflag;

    private BigDecimal expresstype4;

    private String relistflag;

    private BigDecimal savenum;

    private BigDecimal expresstype5;

    private String expresstype;

    private BigDecimal expresstype2;

    private String itemflag;

    private BigDecimal sellprice;

    private String skuflag;

    private String freightid;

    private String photoflag;

    private String goodsflag;

    private String auctionflag;

    private BigDecimal expresstype1;

    private String descrflag;

    private BigDecimal expresstype6;

    private String attributestatusflag;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public BigDecimal getPricetype() {
        return pricetype;
    }

    public void setPricetype(BigDecimal pricetype) {
        this.pricetype = pricetype;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
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

    public String getNewitemid() {
        return newitemid;
    }

    public void setNewitemid(String newitemid) {
        this.newitemid = newitemid == null ? null : newitemid.trim();
    }

    public String getOldsku() {
        return oldsku;
    }

    public void setOldsku(String oldsku) {
        this.oldsku = oldsku == null ? null : oldsku.trim();
    }

    public String getOldshopid() {
        return oldshopid;
    }

    public void setOldshopid(String oldshopid) {
        this.oldshopid = oldshopid == null ? null : oldshopid.trim();
    }

    public String getOldshopname() {
        return oldshopname;
    }

    public void setOldshopname(String oldshopname) {
        this.oldshopname = oldshopname == null ? null : oldshopname.trim();
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid == null ? null : templateid.trim();
    }

    public BigDecimal getStartprice() {
        return startprice;
    }

    public void setStartprice(BigDecimal startprice) {
        this.startprice = startprice;
    }

    public BigDecimal getEndprice() {
        return endprice;
    }

    public void setEndprice(BigDecimal endprice) {
        this.endprice = endprice;
    }

    public String getPaypaladdress() {
        return paypaladdress;
    }

    public void setPaypaladdress(String paypaladdress) {
        this.paypaladdress = paypaladdress == null ? null : paypaladdress.trim();
    }

    public String getNewtitle() {
        return newtitle;
    }

    public void setNewtitle(String newtitle) {
        this.newtitle = newtitle == null ? null : newtitle.trim();
    }

    public String getOldtitle() {
        return oldtitle;
    }

    public void setOldtitle(String oldtitle) {
        this.oldtitle = oldtitle == null ? null : oldtitle.trim();
    }

    public String getAddressflag() {
        return addressflag;
    }

    public void setAddressflag(String addressflag) {
        this.addressflag = addressflag == null ? null : addressflag.trim();
    }

    public BigDecimal getPhotonum() {
        return photonum;
    }

    public void setPhotonum(BigDecimal photonum) {
        this.photonum = photonum;
    }

    public BigDecimal getPricesell() {
        return pricesell;
    }

    public void setPricesell(BigDecimal pricesell) {
        this.pricesell = pricesell;
    }

    public BigDecimal getExpresstype3() {
        return expresstype3;
    }

    public void setExpresstype3(BigDecimal expresstype3) {
        this.expresstype3 = expresstype3;
    }

    public String getTitleflag() {
        return titleflag;
    }

    public void setTitleflag(String titleflag) {
        this.titleflag = titleflag == null ? null : titleflag.trim();
    }

    public String getSellpriceflag() {
        return sellpriceflag;
    }

    public void setSellpriceflag(String sellpriceflag) {
        this.sellpriceflag = sellpriceflag == null ? null : sellpriceflag.trim();
    }

    public String getCustomflag() {
        return customflag;
    }

    public void setCustomflag(String customflag) {
        this.customflag = customflag == null ? null : customflag.trim();
    }

    public String getSavenumflag() {
        return savenumflag;
    }

    public void setSavenumflag(String savenumflag) {
        this.savenumflag = savenumflag == null ? null : savenumflag.trim();
    }

    public String getClearanceflag() {
        return clearanceflag;
    }

    public void setClearanceflag(String clearanceflag) {
        this.clearanceflag = clearanceflag == null ? null : clearanceflag.trim();
    }

    public String getExpressflag() {
        return expressflag;
    }

    public void setExpressflag(String expressflag) {
        this.expressflag = expressflag == null ? null : expressflag.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public BigDecimal getListingduration() {
        return listingduration;
    }

    public void setListingduration(BigDecimal listingduration) {
        this.listingduration = listingduration;
    }

    public String getPriceflag() {
        return priceflag;
    }

    public void setPriceflag(String priceflag) {
        this.priceflag = priceflag == null ? null : priceflag.trim();
    }

    public BigDecimal getExpresstype4() {
        return expresstype4;
    }

    public void setExpresstype4(BigDecimal expresstype4) {
        this.expresstype4 = expresstype4;
    }

    public String getRelistflag() {
        return relistflag;
    }

    public void setRelistflag(String relistflag) {
        this.relistflag = relistflag == null ? null : relistflag.trim();
    }

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public BigDecimal getExpresstype5() {
        return expresstype5;
    }

    public void setExpresstype5(BigDecimal expresstype5) {
        this.expresstype5 = expresstype5;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public BigDecimal getExpresstype2() {
        return expresstype2;
    }

    public void setExpresstype2(BigDecimal expresstype2) {
        this.expresstype2 = expresstype2;
    }

    public String getItemflag() {
        return itemflag;
    }

    public void setItemflag(String itemflag) {
        this.itemflag = itemflag == null ? null : itemflag.trim();
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public String getSkuflag() {
        return skuflag;
    }

    public void setSkuflag(String skuflag) {
        this.skuflag = skuflag == null ? null : skuflag.trim();
    }

    public String getFreightid() {
        return freightid;
    }

    public void setFreightid(String freightid) {
        this.freightid = freightid == null ? null : freightid.trim();
    }

    public String getPhotoflag() {
        return photoflag;
    }

    public void setPhotoflag(String photoflag) {
        this.photoflag = photoflag == null ? null : photoflag.trim();
    }

    public String getGoodsflag() {
        return goodsflag;
    }

    public void setGoodsflag(String goodsflag) {
        this.goodsflag = goodsflag == null ? null : goodsflag.trim();
    }

    public String getAuctionflag() {
        return auctionflag;
    }

    public void setAuctionflag(String auctionflag) {
        this.auctionflag = auctionflag == null ? null : auctionflag.trim();
    }

    public BigDecimal getExpresstype1() {
        return expresstype1;
    }

    public void setExpresstype1(BigDecimal expresstype1) {
        this.expresstype1 = expresstype1;
    }

    public String getDescrflag() {
        return descrflag;
    }

    public void setDescrflag(String descrflag) {
        this.descrflag = descrflag == null ? null : descrflag.trim();
    }

    public BigDecimal getExpresstype6() {
        return expresstype6;
    }

    public void setExpresstype6(BigDecimal expresstype6) {
        this.expresstype6 = expresstype6;
    }

    public String getAttributestatusflag() {
        return attributestatusflag;
    }

    public void setAttributestatusflag(String attributestatusflag) {
        this.attributestatusflag = attributestatusflag == null ? null : attributestatusflag.trim();
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
        DbPostitem other = (DbPostitem) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getPricetype() == null ? other.getPricetype() == null : this.getPricetype().equals(other.getPricetype()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getNewitemid() == null ? other.getNewitemid() == null : this.getNewitemid().equals(other.getNewitemid()))
            && (this.getOldsku() == null ? other.getOldsku() == null : this.getOldsku().equals(other.getOldsku()))
            && (this.getOldshopid() == null ? other.getOldshopid() == null : this.getOldshopid().equals(other.getOldshopid()))
            && (this.getOldshopname() == null ? other.getOldshopname() == null : this.getOldshopname().equals(other.getOldshopname()))
            && (this.getTemplateid() == null ? other.getTemplateid() == null : this.getTemplateid().equals(other.getTemplateid()))
            && (this.getStartprice() == null ? other.getStartprice() == null : this.getStartprice().equals(other.getStartprice()))
            && (this.getEndprice() == null ? other.getEndprice() == null : this.getEndprice().equals(other.getEndprice()))
            && (this.getPaypaladdress() == null ? other.getPaypaladdress() == null : this.getPaypaladdress().equals(other.getPaypaladdress()))
            && (this.getNewtitle() == null ? other.getNewtitle() == null : this.getNewtitle().equals(other.getNewtitle()))
            && (this.getOldtitle() == null ? other.getOldtitle() == null : this.getOldtitle().equals(other.getOldtitle()))
            && (this.getAddressflag() == null ? other.getAddressflag() == null : this.getAddressflag().equals(other.getAddressflag()))
            && (this.getPhotonum() == null ? other.getPhotonum() == null : this.getPhotonum().equals(other.getPhotonum()))
            && (this.getPricesell() == null ? other.getPricesell() == null : this.getPricesell().equals(other.getPricesell()))
            && (this.getExpresstype3() == null ? other.getExpresstype3() == null : this.getExpresstype3().equals(other.getExpresstype3()))
            && (this.getTitleflag() == null ? other.getTitleflag() == null : this.getTitleflag().equals(other.getTitleflag()))
            && (this.getSellpriceflag() == null ? other.getSellpriceflag() == null : this.getSellpriceflag().equals(other.getSellpriceflag()))
            && (this.getCustomflag() == null ? other.getCustomflag() == null : this.getCustomflag().equals(other.getCustomflag()))
            && (this.getSavenumflag() == null ? other.getSavenumflag() == null : this.getSavenumflag().equals(other.getSavenumflag()))
            && (this.getClearanceflag() == null ? other.getClearanceflag() == null : this.getClearanceflag().equals(other.getClearanceflag()))
            && (this.getExpressflag() == null ? other.getExpressflag() == null : this.getExpressflag().equals(other.getExpressflag()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getListingduration() == null ? other.getListingduration() == null : this.getListingduration().equals(other.getListingduration()))
            && (this.getPriceflag() == null ? other.getPriceflag() == null : this.getPriceflag().equals(other.getPriceflag()))
            && (this.getExpresstype4() == null ? other.getExpresstype4() == null : this.getExpresstype4().equals(other.getExpresstype4()))
            && (this.getRelistflag() == null ? other.getRelistflag() == null : this.getRelistflag().equals(other.getRelistflag()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getExpresstype5() == null ? other.getExpresstype5() == null : this.getExpresstype5().equals(other.getExpresstype5()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getExpresstype2() == null ? other.getExpresstype2() == null : this.getExpresstype2().equals(other.getExpresstype2()))
            && (this.getItemflag() == null ? other.getItemflag() == null : this.getItemflag().equals(other.getItemflag()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getSkuflag() == null ? other.getSkuflag() == null : this.getSkuflag().equals(other.getSkuflag()))
            && (this.getFreightid() == null ? other.getFreightid() == null : this.getFreightid().equals(other.getFreightid()))
            && (this.getPhotoflag() == null ? other.getPhotoflag() == null : this.getPhotoflag().equals(other.getPhotoflag()))
            && (this.getGoodsflag() == null ? other.getGoodsflag() == null : this.getGoodsflag().equals(other.getGoodsflag()))
            && (this.getAuctionflag() == null ? other.getAuctionflag() == null : this.getAuctionflag().equals(other.getAuctionflag()))
            && (this.getExpresstype1() == null ? other.getExpresstype1() == null : this.getExpresstype1().equals(other.getExpresstype1()))
            && (this.getDescrflag() == null ? other.getDescrflag() == null : this.getDescrflag().equals(other.getDescrflag()))
            && (this.getExpresstype6() == null ? other.getExpresstype6() == null : this.getExpresstype6().equals(other.getExpresstype6()))
            && (this.getAttributestatusflag() == null ? other.getAttributestatusflag() == null : this.getAttributestatusflag().equals(other.getAttributestatusflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getPricetype() == null) ? 0 : getPricetype().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getNewitemid() == null) ? 0 : getNewitemid().hashCode());
        result = prime * result + ((getOldsku() == null) ? 0 : getOldsku().hashCode());
        result = prime * result + ((getOldshopid() == null) ? 0 : getOldshopid().hashCode());
        result = prime * result + ((getOldshopname() == null) ? 0 : getOldshopname().hashCode());
        result = prime * result + ((getTemplateid() == null) ? 0 : getTemplateid().hashCode());
        result = prime * result + ((getStartprice() == null) ? 0 : getStartprice().hashCode());
        result = prime * result + ((getEndprice() == null) ? 0 : getEndprice().hashCode());
        result = prime * result + ((getPaypaladdress() == null) ? 0 : getPaypaladdress().hashCode());
        result = prime * result + ((getNewtitle() == null) ? 0 : getNewtitle().hashCode());
        result = prime * result + ((getOldtitle() == null) ? 0 : getOldtitle().hashCode());
        result = prime * result + ((getAddressflag() == null) ? 0 : getAddressflag().hashCode());
        result = prime * result + ((getPhotonum() == null) ? 0 : getPhotonum().hashCode());
        result = prime * result + ((getPricesell() == null) ? 0 : getPricesell().hashCode());
        result = prime * result + ((getExpresstype3() == null) ? 0 : getExpresstype3().hashCode());
        result = prime * result + ((getTitleflag() == null) ? 0 : getTitleflag().hashCode());
        result = prime * result + ((getSellpriceflag() == null) ? 0 : getSellpriceflag().hashCode());
        result = prime * result + ((getCustomflag() == null) ? 0 : getCustomflag().hashCode());
        result = prime * result + ((getSavenumflag() == null) ? 0 : getSavenumflag().hashCode());
        result = prime * result + ((getClearanceflag() == null) ? 0 : getClearanceflag().hashCode());
        result = prime * result + ((getExpressflag() == null) ? 0 : getExpressflag().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getListingduration() == null) ? 0 : getListingduration().hashCode());
        result = prime * result + ((getPriceflag() == null) ? 0 : getPriceflag().hashCode());
        result = prime * result + ((getExpresstype4() == null) ? 0 : getExpresstype4().hashCode());
        result = prime * result + ((getRelistflag() == null) ? 0 : getRelistflag().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getExpresstype5() == null) ? 0 : getExpresstype5().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getExpresstype2() == null) ? 0 : getExpresstype2().hashCode());
        result = prime * result + ((getItemflag() == null) ? 0 : getItemflag().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getSkuflag() == null) ? 0 : getSkuflag().hashCode());
        result = prime * result + ((getFreightid() == null) ? 0 : getFreightid().hashCode());
        result = prime * result + ((getPhotoflag() == null) ? 0 : getPhotoflag().hashCode());
        result = prime * result + ((getGoodsflag() == null) ? 0 : getGoodsflag().hashCode());
        result = prime * result + ((getAuctionflag() == null) ? 0 : getAuctionflag().hashCode());
        result = prime * result + ((getExpresstype1() == null) ? 0 : getExpresstype1().hashCode());
        result = prime * result + ((getDescrflag() == null) ? 0 : getDescrflag().hashCode());
        result = prime * result + ((getExpresstype6() == null) ? 0 : getExpresstype6().hashCode());
        result = prime * result + ((getAttributestatusflag() == null) ? 0 : getAttributestatusflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", itemid=").append(itemid);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", pricetype=").append(pricetype);
        sb.append(", site=").append(site);
        sb.append(", price=").append(price);
        sb.append(", sku=").append(sku);
        sb.append(", flag=").append(flag);
        sb.append(", error=").append(error);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", newitemid=").append(newitemid);
        sb.append(", oldsku=").append(oldsku);
        sb.append(", oldshopid=").append(oldshopid);
        sb.append(", oldshopname=").append(oldshopname);
        sb.append(", templateid=").append(templateid);
        sb.append(", startprice=").append(startprice);
        sb.append(", endprice=").append(endprice);
        sb.append(", paypaladdress=").append(paypaladdress);
        sb.append(", newtitle=").append(newtitle);
        sb.append(", oldtitle=").append(oldtitle);
        sb.append(", addressflag=").append(addressflag);
        sb.append(", photonum=").append(photonum);
        sb.append(", pricesell=").append(pricesell);
        sb.append(", expresstype3=").append(expresstype3);
        sb.append(", titleflag=").append(titleflag);
        sb.append(", sellpriceflag=").append(sellpriceflag);
        sb.append(", customflag=").append(customflag);
        sb.append(", savenumflag=").append(savenumflag);
        sb.append(", clearanceflag=").append(clearanceflag);
        sb.append(", expressflag=").append(expressflag);
        sb.append(", pic=").append(pic);
        sb.append(", listingduration=").append(listingduration);
        sb.append(", priceflag=").append(priceflag);
        sb.append(", expresstype4=").append(expresstype4);
        sb.append(", relistflag=").append(relistflag);
        sb.append(", savenum=").append(savenum);
        sb.append(", expresstype5=").append(expresstype5);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", expresstype2=").append(expresstype2);
        sb.append(", itemflag=").append(itemflag);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", skuflag=").append(skuflag);
        sb.append(", freightid=").append(freightid);
        sb.append(", photoflag=").append(photoflag);
        sb.append(", goodsflag=").append(goodsflag);
        sb.append(", auctionflag=").append(auctionflag);
        sb.append(", expresstype1=").append(expresstype1);
        sb.append(", descrflag=").append(descrflag);
        sb.append(", expresstype6=").append(expresstype6);
        sb.append(", attributestatusflag=").append(attributestatusflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}