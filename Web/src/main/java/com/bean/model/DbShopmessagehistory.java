package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShopmessagehistory implements Serializable {
    private BigDecimal sequenceid;

    private String shopid;

    private String shopname;

    private BigDecimal itemid;

    private BigDecimal impressions;

    private BigDecimal clicks;

    private BigDecimal clickthrough;

    private BigDecimal solditems;

    private BigDecimal sellthrough;

    private BigDecimal impressionthrough;

    private Date createtime;

    private String openflag;

    private String oper;

    private String operid;

    private String siteid;

    private String sitename;

    private Date listingstart;

    private Date listingend;

    private String ebaysku;

    private String selloper;

    private BigDecimal watcherthrough;

    private BigDecimal refund;

    private BigDecimal refundrate;

    private BigDecimal grossprofit;

    private BigDecimal status;

    private String watchers;

    private String sales;

    private String moneytype;

    private String viewitem;

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

    public BigDecimal getImpressionthrough() {
        return impressionthrough;
    }

    public void setImpressionthrough(BigDecimal impressionthrough) {
        this.impressionthrough = impressionthrough;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid == null ? null : operid.trim();
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

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getWatchers() {
        return watchers;
    }

    public void setWatchers(String watchers) {
        this.watchers = watchers == null ? null : watchers.trim();
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales == null ? null : sales.trim();
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public String getViewitem() {
        return viewitem;
    }

    public void setViewitem(String viewitem) {
        this.viewitem = viewitem == null ? null : viewitem.trim();
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
        DbShopmessagehistory other = (DbShopmessagehistory) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getImpressions() == null ? other.getImpressions() == null : this.getImpressions().equals(other.getImpressions()))
            && (this.getClicks() == null ? other.getClicks() == null : this.getClicks().equals(other.getClicks()))
            && (this.getClickthrough() == null ? other.getClickthrough() == null : this.getClickthrough().equals(other.getClickthrough()))
            && (this.getSolditems() == null ? other.getSolditems() == null : this.getSolditems().equals(other.getSolditems()))
            && (this.getSellthrough() == null ? other.getSellthrough() == null : this.getSellthrough().equals(other.getSellthrough()))
            && (this.getImpressionthrough() == null ? other.getImpressionthrough() == null : this.getImpressionthrough().equals(other.getImpressionthrough()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getSiteid() == null ? other.getSiteid() == null : this.getSiteid().equals(other.getSiteid()))
            && (this.getSitename() == null ? other.getSitename() == null : this.getSitename().equals(other.getSitename()))
            && (this.getListingstart() == null ? other.getListingstart() == null : this.getListingstart().equals(other.getListingstart()))
            && (this.getListingend() == null ? other.getListingend() == null : this.getListingend().equals(other.getListingend()))
            && (this.getEbaysku() == null ? other.getEbaysku() == null : this.getEbaysku().equals(other.getEbaysku()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getWatcherthrough() == null ? other.getWatcherthrough() == null : this.getWatcherthrough().equals(other.getWatcherthrough()))
            && (this.getRefund() == null ? other.getRefund() == null : this.getRefund().equals(other.getRefund()))
            && (this.getRefundrate() == null ? other.getRefundrate() == null : this.getRefundrate().equals(other.getRefundrate()))
            && (this.getGrossprofit() == null ? other.getGrossprofit() == null : this.getGrossprofit().equals(other.getGrossprofit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWatchers() == null ? other.getWatchers() == null : this.getWatchers().equals(other.getWatchers()))
            && (this.getSales() == null ? other.getSales() == null : this.getSales().equals(other.getSales()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getViewitem() == null ? other.getViewitem() == null : this.getViewitem().equals(other.getViewitem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getImpressions() == null) ? 0 : getImpressions().hashCode());
        result = prime * result + ((getClicks() == null) ? 0 : getClicks().hashCode());
        result = prime * result + ((getClickthrough() == null) ? 0 : getClickthrough().hashCode());
        result = prime * result + ((getSolditems() == null) ? 0 : getSolditems().hashCode());
        result = prime * result + ((getSellthrough() == null) ? 0 : getSellthrough().hashCode());
        result = prime * result + ((getImpressionthrough() == null) ? 0 : getImpressionthrough().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getSiteid() == null) ? 0 : getSiteid().hashCode());
        result = prime * result + ((getSitename() == null) ? 0 : getSitename().hashCode());
        result = prime * result + ((getListingstart() == null) ? 0 : getListingstart().hashCode());
        result = prime * result + ((getListingend() == null) ? 0 : getListingend().hashCode());
        result = prime * result + ((getEbaysku() == null) ? 0 : getEbaysku().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getWatcherthrough() == null) ? 0 : getWatcherthrough().hashCode());
        result = prime * result + ((getRefund() == null) ? 0 : getRefund().hashCode());
        result = prime * result + ((getRefundrate() == null) ? 0 : getRefundrate().hashCode());
        result = prime * result + ((getGrossprofit() == null) ? 0 : getGrossprofit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWatchers() == null) ? 0 : getWatchers().hashCode());
        result = prime * result + ((getSales() == null) ? 0 : getSales().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getViewitem() == null) ? 0 : getViewitem().hashCode());
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
        sb.append(", impressions=").append(impressions);
        sb.append(", clicks=").append(clicks);
        sb.append(", clickthrough=").append(clickthrough);
        sb.append(", solditems=").append(solditems);
        sb.append(", sellthrough=").append(sellthrough);
        sb.append(", impressionthrough=").append(impressionthrough);
        sb.append(", createtime=").append(createtime);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", operid=").append(operid);
        sb.append(", siteid=").append(siteid);
        sb.append(", sitename=").append(sitename);
        sb.append(", listingstart=").append(listingstart);
        sb.append(", listingend=").append(listingend);
        sb.append(", ebaysku=").append(ebaysku);
        sb.append(", selloper=").append(selloper);
        sb.append(", watcherthrough=").append(watcherthrough);
        sb.append(", refund=").append(refund);
        sb.append(", refundrate=").append(refundrate);
        sb.append(", grossprofit=").append(grossprofit);
        sb.append(", status=").append(status);
        sb.append(", watchers=").append(watchers);
        sb.append(", sales=").append(sales);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", viewitem=").append(viewitem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}