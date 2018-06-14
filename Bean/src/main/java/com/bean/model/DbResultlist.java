package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbResultlist implements Serializable {
    private String sid;

    private String sku;

    private String itemid;

    private String keywordid;

    private String keyword;

    private String categoryid;

    private String category;

    private String shopid;

    private String shop;

    private String ebaysku;

    private String ebayitemid;

    private String ebaymoneytype;

    private BigDecimal ebaysellprice;

    private String ebaypicture1;

    private String ebaypicture2;

    private String ebaypicture3;

    private String ebaypicture4;

    private String ebayviewitemurl;

    private String ebaypaymethod;

    private String ebaycategoryid;

    private String ebaycategoryname;

    private Integer ebayquantity;

    private Integer ebayquatitythresthod;

    private Integer ebayquatitythod;

    private String ebaysite;

    private String ebayshopname;

    private String ebayitemstatus;

    private String ebaytitle;

    private Short flag;

    private String openflag;

    private String oper;

    private Date opertime;

    private Date createtime;

    private BigDecimal keywordflag;

    private BigDecimal categoryflag;

    private BigDecimal shopflag;

    private String corpid;

    private String reserve1;

    private String reserve2;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private String ebaycountry;

    private String ebaygallerurl;

    private Date ebaystarttime;

    private Date ebayendtime;

    private String ebaylocation;

    private String ebayitemurl;

    private String ebayshopingtype;

    private BigDecimal ebayshopingcost;

    private String ebayshopingmoneytype;

    private BigDecimal ebaycurrentprice;

    private BigDecimal ebaydayleft;

    private BigDecimal ebayhhleft;

    private BigDecimal ebaymmleft;

    private String ebaydecsr;

    private String reserve3;

    private String reserve4;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getKeywordid() {
        return keywordid;
    }

    public void setKeywordid(String keywordid) {
        this.keywordid = keywordid == null ? null : keywordid.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getEbaysku() {
        return ebaysku;
    }

    public void setEbaysku(String ebaysku) {
        this.ebaysku = ebaysku == null ? null : ebaysku.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public String getEbaymoneytype() {
        return ebaymoneytype;
    }

    public void setEbaymoneytype(String ebaymoneytype) {
        this.ebaymoneytype = ebaymoneytype == null ? null : ebaymoneytype.trim();
    }

    public BigDecimal getEbaysellprice() {
        return ebaysellprice;
    }

    public void setEbaysellprice(BigDecimal ebaysellprice) {
        this.ebaysellprice = ebaysellprice;
    }

    public String getEbaypicture1() {
        return ebaypicture1;
    }

    public void setEbaypicture1(String ebaypicture1) {
        this.ebaypicture1 = ebaypicture1 == null ? null : ebaypicture1.trim();
    }

    public String getEbaypicture2() {
        return ebaypicture2;
    }

    public void setEbaypicture2(String ebaypicture2) {
        this.ebaypicture2 = ebaypicture2 == null ? null : ebaypicture2.trim();
    }

    public String getEbaypicture3() {
        return ebaypicture3;
    }

    public void setEbaypicture3(String ebaypicture3) {
        this.ebaypicture3 = ebaypicture3 == null ? null : ebaypicture3.trim();
    }

    public String getEbaypicture4() {
        return ebaypicture4;
    }

    public void setEbaypicture4(String ebaypicture4) {
        this.ebaypicture4 = ebaypicture4 == null ? null : ebaypicture4.trim();
    }

    public String getEbayviewitemurl() {
        return ebayviewitemurl;
    }

    public void setEbayviewitemurl(String ebayviewitemurl) {
        this.ebayviewitemurl = ebayviewitemurl == null ? null : ebayviewitemurl.trim();
    }

    public String getEbaypaymethod() {
        return ebaypaymethod;
    }

    public void setEbaypaymethod(String ebaypaymethod) {
        this.ebaypaymethod = ebaypaymethod == null ? null : ebaypaymethod.trim();
    }

    public String getEbaycategoryid() {
        return ebaycategoryid;
    }

    public void setEbaycategoryid(String ebaycategoryid) {
        this.ebaycategoryid = ebaycategoryid == null ? null : ebaycategoryid.trim();
    }

    public String getEbaycategoryname() {
        return ebaycategoryname;
    }

    public void setEbaycategoryname(String ebaycategoryname) {
        this.ebaycategoryname = ebaycategoryname == null ? null : ebaycategoryname.trim();
    }

    public Integer getEbayquantity() {
        return ebayquantity;
    }

    public void setEbayquantity(Integer ebayquantity) {
        this.ebayquantity = ebayquantity;
    }

    public Integer getEbayquatitythresthod() {
        return ebayquatitythresthod;
    }

    public void setEbayquatitythresthod(Integer ebayquatitythresthod) {
        this.ebayquatitythresthod = ebayquatitythresthod;
    }

    public Integer getEbayquatitythod() {
        return ebayquatitythod;
    }

    public void setEbayquatitythod(Integer ebayquatitythod) {
        this.ebayquatitythod = ebayquatitythod;
    }

    public String getEbaysite() {
        return ebaysite;
    }

    public void setEbaysite(String ebaysite) {
        this.ebaysite = ebaysite == null ? null : ebaysite.trim();
    }

    public String getEbayshopname() {
        return ebayshopname;
    }

    public void setEbayshopname(String ebayshopname) {
        this.ebayshopname = ebayshopname == null ? null : ebayshopname.trim();
    }

    public String getEbayitemstatus() {
        return ebayitemstatus;
    }

    public void setEbayitemstatus(String ebayitemstatus) {
        this.ebayitemstatus = ebayitemstatus == null ? null : ebayitemstatus.trim();
    }

    public String getEbaytitle() {
        return ebaytitle;
    }

    public void setEbaytitle(String ebaytitle) {
        this.ebaytitle = ebaytitle == null ? null : ebaytitle.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getKeywordflag() {
        return keywordflag;
    }

    public void setKeywordflag(BigDecimal keywordflag) {
        this.keywordflag = keywordflag;
    }

    public BigDecimal getCategoryflag() {
        return categoryflag;
    }

    public void setCategoryflag(BigDecimal categoryflag) {
        this.categoryflag = categoryflag;
    }

    public BigDecimal getShopflag() {
        return shopflag;
    }

    public void setShopflag(BigDecimal shopflag) {
        this.shopflag = shopflag;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
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

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
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

    public String getEbaycountry() {
        return ebaycountry;
    }

    public void setEbaycountry(String ebaycountry) {
        this.ebaycountry = ebaycountry == null ? null : ebaycountry.trim();
    }

    public String getEbaygallerurl() {
        return ebaygallerurl;
    }

    public void setEbaygallerurl(String ebaygallerurl) {
        this.ebaygallerurl = ebaygallerurl == null ? null : ebaygallerurl.trim();
    }

    public Date getEbaystarttime() {
        return ebaystarttime;
    }

    public void setEbaystarttime(Date ebaystarttime) {
        this.ebaystarttime = ebaystarttime;
    }

    public Date getEbayendtime() {
        return ebayendtime;
    }

    public void setEbayendtime(Date ebayendtime) {
        this.ebayendtime = ebayendtime;
    }

    public String getEbaylocation() {
        return ebaylocation;
    }

    public void setEbaylocation(String ebaylocation) {
        this.ebaylocation = ebaylocation == null ? null : ebaylocation.trim();
    }

    public String getEbayitemurl() {
        return ebayitemurl;
    }

    public void setEbayitemurl(String ebayitemurl) {
        this.ebayitemurl = ebayitemurl == null ? null : ebayitemurl.trim();
    }

    public String getEbayshopingtype() {
        return ebayshopingtype;
    }

    public void setEbayshopingtype(String ebayshopingtype) {
        this.ebayshopingtype = ebayshopingtype == null ? null : ebayshopingtype.trim();
    }

    public BigDecimal getEbayshopingcost() {
        return ebayshopingcost;
    }

    public void setEbayshopingcost(BigDecimal ebayshopingcost) {
        this.ebayshopingcost = ebayshopingcost;
    }

    public String getEbayshopingmoneytype() {
        return ebayshopingmoneytype;
    }

    public void setEbayshopingmoneytype(String ebayshopingmoneytype) {
        this.ebayshopingmoneytype = ebayshopingmoneytype == null ? null : ebayshopingmoneytype.trim();
    }

    public BigDecimal getEbaycurrentprice() {
        return ebaycurrentprice;
    }

    public void setEbaycurrentprice(BigDecimal ebaycurrentprice) {
        this.ebaycurrentprice = ebaycurrentprice;
    }

    public BigDecimal getEbaydayleft() {
        return ebaydayleft;
    }

    public void setEbaydayleft(BigDecimal ebaydayleft) {
        this.ebaydayleft = ebaydayleft;
    }

    public BigDecimal getEbayhhleft() {
        return ebayhhleft;
    }

    public void setEbayhhleft(BigDecimal ebayhhleft) {
        this.ebayhhleft = ebayhhleft;
    }

    public BigDecimal getEbaymmleft() {
        return ebaymmleft;
    }

    public void setEbaymmleft(BigDecimal ebaymmleft) {
        this.ebaymmleft = ebaymmleft;
    }

    public String getEbaydecsr() {
        return ebaydecsr;
    }

    public void setEbaydecsr(String ebaydecsr) {
        this.ebaydecsr = ebaydecsr == null ? null : ebaydecsr.trim();
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
        DbResultlist other = (DbResultlist) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getKeywordid() == null ? other.getKeywordid() == null : this.getKeywordid().equals(other.getKeywordid()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShop() == null ? other.getShop() == null : this.getShop().equals(other.getShop()))
            && (this.getEbaysku() == null ? other.getEbaysku() == null : this.getEbaysku().equals(other.getEbaysku()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbaymoneytype() == null ? other.getEbaymoneytype() == null : this.getEbaymoneytype().equals(other.getEbaymoneytype()))
            && (this.getEbaysellprice() == null ? other.getEbaysellprice() == null : this.getEbaysellprice().equals(other.getEbaysellprice()))
            && (this.getEbaypicture1() == null ? other.getEbaypicture1() == null : this.getEbaypicture1().equals(other.getEbaypicture1()))
            && (this.getEbaypicture2() == null ? other.getEbaypicture2() == null : this.getEbaypicture2().equals(other.getEbaypicture2()))
            && (this.getEbaypicture3() == null ? other.getEbaypicture3() == null : this.getEbaypicture3().equals(other.getEbaypicture3()))
            && (this.getEbaypicture4() == null ? other.getEbaypicture4() == null : this.getEbaypicture4().equals(other.getEbaypicture4()))
            && (this.getEbayviewitemurl() == null ? other.getEbayviewitemurl() == null : this.getEbayviewitemurl().equals(other.getEbayviewitemurl()))
            && (this.getEbaypaymethod() == null ? other.getEbaypaymethod() == null : this.getEbaypaymethod().equals(other.getEbaypaymethod()))
            && (this.getEbaycategoryid() == null ? other.getEbaycategoryid() == null : this.getEbaycategoryid().equals(other.getEbaycategoryid()))
            && (this.getEbaycategoryname() == null ? other.getEbaycategoryname() == null : this.getEbaycategoryname().equals(other.getEbaycategoryname()))
            && (this.getEbayquantity() == null ? other.getEbayquantity() == null : this.getEbayquantity().equals(other.getEbayquantity()))
            && (this.getEbayquatitythresthod() == null ? other.getEbayquatitythresthod() == null : this.getEbayquatitythresthod().equals(other.getEbayquatitythresthod()))
            && (this.getEbayquatitythod() == null ? other.getEbayquatitythod() == null : this.getEbayquatitythod().equals(other.getEbayquatitythod()))
            && (this.getEbaysite() == null ? other.getEbaysite() == null : this.getEbaysite().equals(other.getEbaysite()))
            && (this.getEbayshopname() == null ? other.getEbayshopname() == null : this.getEbayshopname().equals(other.getEbayshopname()))
            && (this.getEbayitemstatus() == null ? other.getEbayitemstatus() == null : this.getEbayitemstatus().equals(other.getEbayitemstatus()))
            && (this.getEbaytitle() == null ? other.getEbaytitle() == null : this.getEbaytitle().equals(other.getEbaytitle()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getKeywordflag() == null ? other.getKeywordflag() == null : this.getKeywordflag().equals(other.getKeywordflag()))
            && (this.getCategoryflag() == null ? other.getCategoryflag() == null : this.getCategoryflag().equals(other.getCategoryflag()))
            && (this.getShopflag() == null ? other.getShopflag() == null : this.getShopflag().equals(other.getShopflag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getEbaycountry() == null ? other.getEbaycountry() == null : this.getEbaycountry().equals(other.getEbaycountry()))
            && (this.getEbaygallerurl() == null ? other.getEbaygallerurl() == null : this.getEbaygallerurl().equals(other.getEbaygallerurl()))
            && (this.getEbaystarttime() == null ? other.getEbaystarttime() == null : this.getEbaystarttime().equals(other.getEbaystarttime()))
            && (this.getEbayendtime() == null ? other.getEbayendtime() == null : this.getEbayendtime().equals(other.getEbayendtime()))
            && (this.getEbaylocation() == null ? other.getEbaylocation() == null : this.getEbaylocation().equals(other.getEbaylocation()))
            && (this.getEbayitemurl() == null ? other.getEbayitemurl() == null : this.getEbayitemurl().equals(other.getEbayitemurl()))
            && (this.getEbayshopingtype() == null ? other.getEbayshopingtype() == null : this.getEbayshopingtype().equals(other.getEbayshopingtype()))
            && (this.getEbayshopingcost() == null ? other.getEbayshopingcost() == null : this.getEbayshopingcost().equals(other.getEbayshopingcost()))
            && (this.getEbayshopingmoneytype() == null ? other.getEbayshopingmoneytype() == null : this.getEbayshopingmoneytype().equals(other.getEbayshopingmoneytype()))
            && (this.getEbaycurrentprice() == null ? other.getEbaycurrentprice() == null : this.getEbaycurrentprice().equals(other.getEbaycurrentprice()))
            && (this.getEbaydayleft() == null ? other.getEbaydayleft() == null : this.getEbaydayleft().equals(other.getEbaydayleft()))
            && (this.getEbayhhleft() == null ? other.getEbayhhleft() == null : this.getEbayhhleft().equals(other.getEbayhhleft()))
            && (this.getEbaymmleft() == null ? other.getEbaymmleft() == null : this.getEbaymmleft().equals(other.getEbaymmleft()))
            && (this.getEbaydecsr() == null ? other.getEbaydecsr() == null : this.getEbaydecsr().equals(other.getEbaydecsr()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getKeywordid() == null) ? 0 : getKeywordid().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShop() == null) ? 0 : getShop().hashCode());
        result = prime * result + ((getEbaysku() == null) ? 0 : getEbaysku().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbaymoneytype() == null) ? 0 : getEbaymoneytype().hashCode());
        result = prime * result + ((getEbaysellprice() == null) ? 0 : getEbaysellprice().hashCode());
        result = prime * result + ((getEbaypicture1() == null) ? 0 : getEbaypicture1().hashCode());
        result = prime * result + ((getEbaypicture2() == null) ? 0 : getEbaypicture2().hashCode());
        result = prime * result + ((getEbaypicture3() == null) ? 0 : getEbaypicture3().hashCode());
        result = prime * result + ((getEbaypicture4() == null) ? 0 : getEbaypicture4().hashCode());
        result = prime * result + ((getEbayviewitemurl() == null) ? 0 : getEbayviewitemurl().hashCode());
        result = prime * result + ((getEbaypaymethod() == null) ? 0 : getEbaypaymethod().hashCode());
        result = prime * result + ((getEbaycategoryid() == null) ? 0 : getEbaycategoryid().hashCode());
        result = prime * result + ((getEbaycategoryname() == null) ? 0 : getEbaycategoryname().hashCode());
        result = prime * result + ((getEbayquantity() == null) ? 0 : getEbayquantity().hashCode());
        result = prime * result + ((getEbayquatitythresthod() == null) ? 0 : getEbayquatitythresthod().hashCode());
        result = prime * result + ((getEbayquatitythod() == null) ? 0 : getEbayquatitythod().hashCode());
        result = prime * result + ((getEbaysite() == null) ? 0 : getEbaysite().hashCode());
        result = prime * result + ((getEbayshopname() == null) ? 0 : getEbayshopname().hashCode());
        result = prime * result + ((getEbayitemstatus() == null) ? 0 : getEbayitemstatus().hashCode());
        result = prime * result + ((getEbaytitle() == null) ? 0 : getEbaytitle().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getKeywordflag() == null) ? 0 : getKeywordflag().hashCode());
        result = prime * result + ((getCategoryflag() == null) ? 0 : getCategoryflag().hashCode());
        result = prime * result + ((getShopflag() == null) ? 0 : getShopflag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getEbaycountry() == null) ? 0 : getEbaycountry().hashCode());
        result = prime * result + ((getEbaygallerurl() == null) ? 0 : getEbaygallerurl().hashCode());
        result = prime * result + ((getEbaystarttime() == null) ? 0 : getEbaystarttime().hashCode());
        result = prime * result + ((getEbayendtime() == null) ? 0 : getEbayendtime().hashCode());
        result = prime * result + ((getEbaylocation() == null) ? 0 : getEbaylocation().hashCode());
        result = prime * result + ((getEbayitemurl() == null) ? 0 : getEbayitemurl().hashCode());
        result = prime * result + ((getEbayshopingtype() == null) ? 0 : getEbayshopingtype().hashCode());
        result = prime * result + ((getEbayshopingcost() == null) ? 0 : getEbayshopingcost().hashCode());
        result = prime * result + ((getEbayshopingmoneytype() == null) ? 0 : getEbayshopingmoneytype().hashCode());
        result = prime * result + ((getEbaycurrentprice() == null) ? 0 : getEbaycurrentprice().hashCode());
        result = prime * result + ((getEbaydayleft() == null) ? 0 : getEbaydayleft().hashCode());
        result = prime * result + ((getEbayhhleft() == null) ? 0 : getEbayhhleft().hashCode());
        result = prime * result + ((getEbaymmleft() == null) ? 0 : getEbaymmleft().hashCode());
        result = prime * result + ((getEbaydecsr() == null) ? 0 : getEbaydecsr().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sku=").append(sku);
        sb.append(", itemid=").append(itemid);
        sb.append(", keywordid=").append(keywordid);
        sb.append(", keyword=").append(keyword);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", category=").append(category);
        sb.append(", shopid=").append(shopid);
        sb.append(", shop=").append(shop);
        sb.append(", ebaysku=").append(ebaysku);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebaymoneytype=").append(ebaymoneytype);
        sb.append(", ebaysellprice=").append(ebaysellprice);
        sb.append(", ebaypicture1=").append(ebaypicture1);
        sb.append(", ebaypicture2=").append(ebaypicture2);
        sb.append(", ebaypicture3=").append(ebaypicture3);
        sb.append(", ebaypicture4=").append(ebaypicture4);
        sb.append(", ebayviewitemurl=").append(ebayviewitemurl);
        sb.append(", ebaypaymethod=").append(ebaypaymethod);
        sb.append(", ebaycategoryid=").append(ebaycategoryid);
        sb.append(", ebaycategoryname=").append(ebaycategoryname);
        sb.append(", ebayquantity=").append(ebayquantity);
        sb.append(", ebayquatitythresthod=").append(ebayquatitythresthod);
        sb.append(", ebayquatitythod=").append(ebayquatitythod);
        sb.append(", ebaysite=").append(ebaysite);
        sb.append(", ebayshopname=").append(ebayshopname);
        sb.append(", ebayitemstatus=").append(ebayitemstatus);
        sb.append(", ebaytitle=").append(ebaytitle);
        sb.append(", flag=").append(flag);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createtime=").append(createtime);
        sb.append(", keywordflag=").append(keywordflag);
        sb.append(", categoryflag=").append(categoryflag);
        sb.append(", shopflag=").append(shopflag);
        sb.append(", corpid=").append(corpid);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", ebaycountry=").append(ebaycountry);
        sb.append(", ebaygallerurl=").append(ebaygallerurl);
        sb.append(", ebaystarttime=").append(ebaystarttime);
        sb.append(", ebayendtime=").append(ebayendtime);
        sb.append(", ebaylocation=").append(ebaylocation);
        sb.append(", ebayitemurl=").append(ebayitemurl);
        sb.append(", ebayshopingtype=").append(ebayshopingtype);
        sb.append(", ebayshopingcost=").append(ebayshopingcost);
        sb.append(", ebayshopingmoneytype=").append(ebayshopingmoneytype);
        sb.append(", ebaycurrentprice=").append(ebaycurrentprice);
        sb.append(", ebaydayleft=").append(ebaydayleft);
        sb.append(", ebayhhleft=").append(ebayhhleft);
        sb.append(", ebaymmleft=").append(ebaymmleft);
        sb.append(", ebaydecsr=").append(ebaydecsr);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}