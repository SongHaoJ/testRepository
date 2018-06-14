package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShopmessagereportforms implements Serializable {
    private BigDecimal sequenceid;

    private String shopid;

    private String shopname;

    private BigDecimal itemid;

    private String price;

    private String shippingcost;

    private BigDecimal totalquantity;

    private String quantityavailable;

    private Date listingstart;

    private Date listingend;

    private String format;

    private String categorynumber;

    private String categoryname;

    private BigDecimal impressions;

    private BigDecimal clicks;

    private BigDecimal clickthrough;

    private BigDecimal solditems;

    private BigDecimal sellthrough;

    private BigDecimal impressionsthrough;

    private BigDecimal watchers;

    private String sales;

    private Date createtime;

    private String oper;

    private String operid;

    private String openflag;

    private String siteid;

    private String sitename;

    private String ebaysku;

    private String selloper;

    private BigDecimal watcherthrough;

    private BigDecimal refund;

    private BigDecimal refundrate;

    private BigDecimal grossprofit;

    private BigDecimal floats;

    private String rankimpre;

    private String rankclick;

    private String ranksold;

    private String rankwatch;

    private String moneytype;

    private String photourl;

    private String title;

    private String viewitem;

    private String note;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
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

    public BigDecimal getItemid() {
        return itemid;
    }

    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getShippingcost() {
        return shippingcost;
    }

    public void setShippingcost(String shippingcost) {
        this.shippingcost = shippingcost == null ? null : shippingcost.trim();
    }

    public BigDecimal getTotalquantity() {
        return totalquantity;
    }

    public void setTotalquantity(BigDecimal totalquantity) {
        this.totalquantity = totalquantity;
    }

    public String getQuantityavailable() {
        return quantityavailable;
    }

    public void setQuantityavailable(String quantityavailable) {
        this.quantityavailable = quantityavailable == null ? null : quantityavailable.trim();
    }

    public Date getListingstart() {
        return listingstart;
    }

    public void setListingstart(Date listingstart) {
        this.listingstart = listingstart;
    }

    public Date getListingend() {
        return listingend;
    }

    public void setListingend(Date listingend) {
        this.listingend = listingend;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getCategorynumber() {
        return categorynumber;
    }

    public void setCategorynumber(String categorynumber) {
        this.categorynumber = categorynumber == null ? null : categorynumber.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public BigDecimal getImpressions() {
        return impressions;
    }

    public void setImpressions(BigDecimal impressions) {
        this.impressions = impressions;
    }

    public BigDecimal getClicks() {
        return clicks;
    }

    public void setClicks(BigDecimal clicks) {
        this.clicks = clicks;
    }

    public BigDecimal getClickthrough() {
        return clickthrough;
    }

    public void setClickthrough(BigDecimal clickthrough) {
        this.clickthrough = clickthrough;
    }

    public BigDecimal getSolditems() {
        return solditems;
    }

    public void setSolditems(BigDecimal solditems) {
        this.solditems = solditems;
    }

    public BigDecimal getSellthrough() {
        return sellthrough;
    }

    public void setSellthrough(BigDecimal sellthrough) {
        this.sellthrough = sellthrough;
    }

    public BigDecimal getImpressionsthrough() {
        return impressionsthrough;
    }

    public void setImpressionsthrough(BigDecimal impressionsthrough) {
        this.impressionsthrough = impressionsthrough;
    }

    public BigDecimal getWatchers() {
        return watchers;
    }

    public void setWatchers(BigDecimal watchers) {
        this.watchers = watchers;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales == null ? null : sales.trim();
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

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid == null ? null : operid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public String getEbaysku() {
        return ebaysku;
    }

    public void setEbaysku(String ebaysku) {
        this.ebaysku = ebaysku == null ? null : ebaysku.trim();
    }

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public BigDecimal getWatcherthrough() {
        return watcherthrough;
    }

    public void setWatcherthrough(BigDecimal watcherthrough) {
        this.watcherthrough = watcherthrough;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public BigDecimal getRefundrate() {
        return refundrate;
    }

    public void setRefundrate(BigDecimal refundrate) {
        this.refundrate = refundrate;
    }

    public BigDecimal getGrossprofit() {
        return grossprofit;
    }

    public void setGrossprofit(BigDecimal grossprofit) {
        this.grossprofit = grossprofit;
    }

    public BigDecimal getFloats() {
        return floats;
    }

    public void setFloats(BigDecimal floats) {
        this.floats = floats;
    }

    public String getRankimpre() {
        return rankimpre;
    }

    public void setRankimpre(String rankimpre) {
        this.rankimpre = rankimpre == null ? null : rankimpre.trim();
    }

    public String getRankclick() {
        return rankclick;
    }

    public void setRankclick(String rankclick) {
        this.rankclick = rankclick == null ? null : rankclick.trim();
    }

    public String getRanksold() {
        return ranksold;
    }

    public void setRanksold(String ranksold) {
        this.ranksold = ranksold == null ? null : ranksold.trim();
    }

    public String getRankwatch() {
        return rankwatch;
    }

    public void setRankwatch(String rankwatch) {
        this.rankwatch = rankwatch == null ? null : rankwatch.trim();
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getViewitem() {
        return viewitem;
    }

    public void setViewitem(String viewitem) {
        this.viewitem = viewitem == null ? null : viewitem.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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
        DbShopmessagereportforms other = (DbShopmessagereportforms) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getShippingcost() == null ? other.getShippingcost() == null : this.getShippingcost().equals(other.getShippingcost()))
            && (this.getTotalquantity() == null ? other.getTotalquantity() == null : this.getTotalquantity().equals(other.getTotalquantity()))
            && (this.getQuantityavailable() == null ? other.getQuantityavailable() == null : this.getQuantityavailable().equals(other.getQuantityavailable()))
            && (this.getListingstart() == null ? other.getListingstart() == null : this.getListingstart().equals(other.getListingstart()))
            && (this.getListingend() == null ? other.getListingend() == null : this.getListingend().equals(other.getListingend()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getCategorynumber() == null ? other.getCategorynumber() == null : this.getCategorynumber().equals(other.getCategorynumber()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getImpressions() == null ? other.getImpressions() == null : this.getImpressions().equals(other.getImpressions()))
            && (this.getClicks() == null ? other.getClicks() == null : this.getClicks().equals(other.getClicks()))
            && (this.getClickthrough() == null ? other.getClickthrough() == null : this.getClickthrough().equals(other.getClickthrough()))
            && (this.getSolditems() == null ? other.getSolditems() == null : this.getSolditems().equals(other.getSolditems()))
            && (this.getSellthrough() == null ? other.getSellthrough() == null : this.getSellthrough().equals(other.getSellthrough()))
            && (this.getImpressionsthrough() == null ? other.getImpressionsthrough() == null : this.getImpressionsthrough().equals(other.getImpressionsthrough()))
            && (this.getWatchers() == null ? other.getWatchers() == null : this.getWatchers().equals(other.getWatchers()))
            && (this.getSales() == null ? other.getSales() == null : this.getSales().equals(other.getSales()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getSiteid() == null ? other.getSiteid() == null : this.getSiteid().equals(other.getSiteid()))
            && (this.getSitename() == null ? other.getSitename() == null : this.getSitename().equals(other.getSitename()))
            && (this.getEbaysku() == null ? other.getEbaysku() == null : this.getEbaysku().equals(other.getEbaysku()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getWatcherthrough() == null ? other.getWatcherthrough() == null : this.getWatcherthrough().equals(other.getWatcherthrough()))
            && (this.getRefund() == null ? other.getRefund() == null : this.getRefund().equals(other.getRefund()))
            && (this.getRefundrate() == null ? other.getRefundrate() == null : this.getRefundrate().equals(other.getRefundrate()))
            && (this.getGrossprofit() == null ? other.getGrossprofit() == null : this.getGrossprofit().equals(other.getGrossprofit()))
            && (this.getFloats() == null ? other.getFloats() == null : this.getFloats().equals(other.getFloats()))
            && (this.getRankimpre() == null ? other.getRankimpre() == null : this.getRankimpre().equals(other.getRankimpre()))
            && (this.getRankclick() == null ? other.getRankclick() == null : this.getRankclick().equals(other.getRankclick()))
            && (this.getRanksold() == null ? other.getRanksold() == null : this.getRanksold().equals(other.getRanksold()))
            && (this.getRankwatch() == null ? other.getRankwatch() == null : this.getRankwatch().equals(other.getRankwatch()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getPhotourl() == null ? other.getPhotourl() == null : this.getPhotourl().equals(other.getPhotourl()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getViewitem() == null ? other.getViewitem() == null : this.getViewitem().equals(other.getViewitem()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getShippingcost() == null) ? 0 : getShippingcost().hashCode());
        result = prime * result + ((getTotalquantity() == null) ? 0 : getTotalquantity().hashCode());
        result = prime * result + ((getQuantityavailable() == null) ? 0 : getQuantityavailable().hashCode());
        result = prime * result + ((getListingstart() == null) ? 0 : getListingstart().hashCode());
        result = prime * result + ((getListingend() == null) ? 0 : getListingend().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getCategorynumber() == null) ? 0 : getCategorynumber().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getImpressions() == null) ? 0 : getImpressions().hashCode());
        result = prime * result + ((getClicks() == null) ? 0 : getClicks().hashCode());
        result = prime * result + ((getClickthrough() == null) ? 0 : getClickthrough().hashCode());
        result = prime * result + ((getSolditems() == null) ? 0 : getSolditems().hashCode());
        result = prime * result + ((getSellthrough() == null) ? 0 : getSellthrough().hashCode());
        result = prime * result + ((getImpressionsthrough() == null) ? 0 : getImpressionsthrough().hashCode());
        result = prime * result + ((getWatchers() == null) ? 0 : getWatchers().hashCode());
        result = prime * result + ((getSales() == null) ? 0 : getSales().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getSiteid() == null) ? 0 : getSiteid().hashCode());
        result = prime * result + ((getSitename() == null) ? 0 : getSitename().hashCode());
        result = prime * result + ((getEbaysku() == null) ? 0 : getEbaysku().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getWatcherthrough() == null) ? 0 : getWatcherthrough().hashCode());
        result = prime * result + ((getRefund() == null) ? 0 : getRefund().hashCode());
        result = prime * result + ((getRefundrate() == null) ? 0 : getRefundrate().hashCode());
        result = prime * result + ((getGrossprofit() == null) ? 0 : getGrossprofit().hashCode());
        result = prime * result + ((getFloats() == null) ? 0 : getFloats().hashCode());
        result = prime * result + ((getRankimpre() == null) ? 0 : getRankimpre().hashCode());
        result = prime * result + ((getRankclick() == null) ? 0 : getRankclick().hashCode());
        result = prime * result + ((getRanksold() == null) ? 0 : getRanksold().hashCode());
        result = prime * result + ((getRankwatch() == null) ? 0 : getRankwatch().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getPhotourl() == null) ? 0 : getPhotourl().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getViewitem() == null) ? 0 : getViewitem().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", itemid=").append(itemid);
        sb.append(", price=").append(price);
        sb.append(", shippingcost=").append(shippingcost);
        sb.append(", totalquantity=").append(totalquantity);
        sb.append(", quantityavailable=").append(quantityavailable);
        sb.append(", listingstart=").append(listingstart);
        sb.append(", listingend=").append(listingend);
        sb.append(", format=").append(format);
        sb.append(", categorynumber=").append(categorynumber);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", impressions=").append(impressions);
        sb.append(", clicks=").append(clicks);
        sb.append(", clickthrough=").append(clickthrough);
        sb.append(", solditems=").append(solditems);
        sb.append(", sellthrough=").append(sellthrough);
        sb.append(", impressionsthrough=").append(impressionsthrough);
        sb.append(", watchers=").append(watchers);
        sb.append(", sales=").append(sales);
        sb.append(", createtime=").append(createtime);
        sb.append(", oper=").append(oper);
        sb.append(", operid=").append(operid);
        sb.append(", openflag=").append(openflag);
        sb.append(", siteid=").append(siteid);
        sb.append(", sitename=").append(sitename);
        sb.append(", ebaysku=").append(ebaysku);
        sb.append(", selloper=").append(selloper);
        sb.append(", watcherthrough=").append(watcherthrough);
        sb.append(", refund=").append(refund);
        sb.append(", refundrate=").append(refundrate);
        sb.append(", grossprofit=").append(grossprofit);
        sb.append(", floats=").append(floats);
        sb.append(", rankimpre=").append(rankimpre);
        sb.append(", rankclick=").append(rankclick);
        sb.append(", ranksold=").append(ranksold);
        sb.append(", rankwatch=").append(rankwatch);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", photourl=").append(photourl);
        sb.append(", title=").append(title);
        sb.append(", viewitem=").append(viewitem);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}