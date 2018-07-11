package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbResultdetail implements Serializable {
    private String sid;

    private String categoryid;

    private String category;

    private String keywordid;

    private String keyword;

    private String shopid;

    private String shopname;

    private String ebayitemid;

    private Date updatetime;

    private Date createtime;

    private BigDecimal ebaysort;

    private BigDecimal keywordflag;

    private BigDecimal categoryflag;

    private BigDecimal shopflag;

    private BigDecimal keywordtotal;

    private BigDecimal categorytotal;

    private BigDecimal shoptotal;

    private BigDecimal flag;

    private String reserve1;

    private String reserve2;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private Date firstdowntime;

    private BigDecimal itemflag;

    private String reserve3;

    private String reserve4;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
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

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getEbaysort() {
        return ebaysort;
    }

    public void setEbaysort(BigDecimal ebaysort) {
        this.ebaysort = ebaysort;
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

    public BigDecimal getKeywordtotal() {
        return keywordtotal;
    }

    public void setKeywordtotal(BigDecimal keywordtotal) {
        this.keywordtotal = keywordtotal;
    }

    public BigDecimal getCategorytotal() {
        return categorytotal;
    }

    public void setCategorytotal(BigDecimal categorytotal) {
        this.categorytotal = categorytotal;
    }

    public BigDecimal getShoptotal() {
        return shoptotal;
    }

    public void setShoptotal(BigDecimal shoptotal) {
        this.shoptotal = shoptotal;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
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

    public Date getFirstdowntime() {
        return firstdowntime;
    }

    public void setFirstdowntime(Date firstdowntime) {
        this.firstdowntime = firstdowntime;
    }

    public BigDecimal getItemflag() {
        return itemflag;
    }

    public void setItemflag(BigDecimal itemflag) {
        this.itemflag = itemflag;
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
        DbResultdetail other = (DbResultdetail) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getKeywordid() == null ? other.getKeywordid() == null : this.getKeywordid().equals(other.getKeywordid()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getEbaysort() == null ? other.getEbaysort() == null : this.getEbaysort().equals(other.getEbaysort()))
            && (this.getKeywordflag() == null ? other.getKeywordflag() == null : this.getKeywordflag().equals(other.getKeywordflag()))
            && (this.getCategoryflag() == null ? other.getCategoryflag() == null : this.getCategoryflag().equals(other.getCategoryflag()))
            && (this.getShopflag() == null ? other.getShopflag() == null : this.getShopflag().equals(other.getShopflag()))
            && (this.getKeywordtotal() == null ? other.getKeywordtotal() == null : this.getKeywordtotal().equals(other.getKeywordtotal()))
            && (this.getCategorytotal() == null ? other.getCategorytotal() == null : this.getCategorytotal().equals(other.getCategorytotal()))
            && (this.getShoptotal() == null ? other.getShoptotal() == null : this.getShoptotal().equals(other.getShoptotal()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getFirstdowntime() == null ? other.getFirstdowntime() == null : this.getFirstdowntime().equals(other.getFirstdowntime()))
            && (this.getItemflag() == null ? other.getItemflag() == null : this.getItemflag().equals(other.getItemflag()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getKeywordid() == null) ? 0 : getKeywordid().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getEbaysort() == null) ? 0 : getEbaysort().hashCode());
        result = prime * result + ((getKeywordflag() == null) ? 0 : getKeywordflag().hashCode());
        result = prime * result + ((getCategoryflag() == null) ? 0 : getCategoryflag().hashCode());
        result = prime * result + ((getShopflag() == null) ? 0 : getShopflag().hashCode());
        result = prime * result + ((getKeywordtotal() == null) ? 0 : getKeywordtotal().hashCode());
        result = prime * result + ((getCategorytotal() == null) ? 0 : getCategorytotal().hashCode());
        result = prime * result + ((getShoptotal() == null) ? 0 : getShoptotal().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getFirstdowntime() == null) ? 0 : getFirstdowntime().hashCode());
        result = prime * result + ((getItemflag() == null) ? 0 : getItemflag().hashCode());
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
        sb.append(", categoryid=").append(categoryid);
        sb.append(", category=").append(category);
        sb.append(", keywordid=").append(keywordid);
        sb.append(", keyword=").append(keyword);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", createtime=").append(createtime);
        sb.append(", ebaysort=").append(ebaysort);
        sb.append(", keywordflag=").append(keywordflag);
        sb.append(", categoryflag=").append(categoryflag);
        sb.append(", shopflag=").append(shopflag);
        sb.append(", keywordtotal=").append(keywordtotal);
        sb.append(", categorytotal=").append(categorytotal);
        sb.append(", shoptotal=").append(shoptotal);
        sb.append(", flag=").append(flag);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", firstdowntime=").append(firstdowntime);
        sb.append(", itemflag=").append(itemflag);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}