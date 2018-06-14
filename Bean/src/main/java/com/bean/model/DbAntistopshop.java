package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbAntistopshop implements Serializable {
    private BigDecimal sequenceid;

    private String site;

    private BigDecimal sort;

    private String sellshop;

    private BigDecimal sellmoney;

    private BigDecimal publishnum;

    private BigDecimal dealnum;

    private BigDecimal sellprice;

    private BigDecimal product;

    private BigDecimal avgprice;

    private String subrate;

    private BigDecimal corpid;

    private BigDecimal openflag;

    private String oper;

    private Date opertime;

    private BigDecimal antistopid;

    private BigDecimal resultflag;

    private BigDecimal shopflag;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public String getSellshop() {
        return sellshop;
    }

    public void setSellshop(String sellshop) {
        this.sellshop = sellshop == null ? null : sellshop.trim();
    }

    public BigDecimal getSellmoney() {
        return sellmoney;
    }

    public void setSellmoney(BigDecimal sellmoney) {
        this.sellmoney = sellmoney;
    }

    public BigDecimal getPublishnum() {
        return publishnum;
    }

    public void setPublishnum(BigDecimal publishnum) {
        this.publishnum = publishnum;
    }

    public BigDecimal getDealnum() {
        return dealnum;
    }

    public void setDealnum(BigDecimal dealnum) {
        this.dealnum = dealnum;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public BigDecimal getProduct() {
        return product;
    }

    public void setProduct(BigDecimal product) {
        this.product = product;
    }

    public BigDecimal getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(BigDecimal avgprice) {
        this.avgprice = avgprice;
    }

    public String getSubrate() {
        return subrate;
    }

    public void setSubrate(String subrate) {
        this.subrate = subrate == null ? null : subrate.trim();
    }

    public BigDecimal getCorpid() {
        return corpid;
    }

    public void setCorpid(BigDecimal corpid) {
        this.corpid = corpid;
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
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

    public BigDecimal getAntistopid() {
        return antistopid;
    }

    public void setAntistopid(BigDecimal antistopid) {
        this.antistopid = antistopid;
    }

    public BigDecimal getResultflag() {
        return resultflag;
    }

    public void setResultflag(BigDecimal resultflag) {
        this.resultflag = resultflag;
    }

    public BigDecimal getShopflag() {
        return shopflag;
    }

    public void setShopflag(BigDecimal shopflag) {
        this.shopflag = shopflag;
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
        DbAntistopshop other = (DbAntistopshop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getSellshop() == null ? other.getSellshop() == null : this.getSellshop().equals(other.getSellshop()))
            && (this.getSellmoney() == null ? other.getSellmoney() == null : this.getSellmoney().equals(other.getSellmoney()))
            && (this.getPublishnum() == null ? other.getPublishnum() == null : this.getPublishnum().equals(other.getPublishnum()))
            && (this.getDealnum() == null ? other.getDealnum() == null : this.getDealnum().equals(other.getDealnum()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()))
            && (this.getAvgprice() == null ? other.getAvgprice() == null : this.getAvgprice().equals(other.getAvgprice()))
            && (this.getSubrate() == null ? other.getSubrate() == null : this.getSubrate().equals(other.getSubrate()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAntistopid() == null ? other.getAntistopid() == null : this.getAntistopid().equals(other.getAntistopid()))
            && (this.getResultflag() == null ? other.getResultflag() == null : this.getResultflag().equals(other.getResultflag()))
            && (this.getShopflag() == null ? other.getShopflag() == null : this.getShopflag().equals(other.getShopflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getSellshop() == null) ? 0 : getSellshop().hashCode());
        result = prime * result + ((getSellmoney() == null) ? 0 : getSellmoney().hashCode());
        result = prime * result + ((getPublishnum() == null) ? 0 : getPublishnum().hashCode());
        result = prime * result + ((getDealnum() == null) ? 0 : getDealnum().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        result = prime * result + ((getAvgprice() == null) ? 0 : getAvgprice().hashCode());
        result = prime * result + ((getSubrate() == null) ? 0 : getSubrate().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAntistopid() == null) ? 0 : getAntistopid().hashCode());
        result = prime * result + ((getResultflag() == null) ? 0 : getResultflag().hashCode());
        result = prime * result + ((getShopflag() == null) ? 0 : getShopflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", site=").append(site);
        sb.append(", sort=").append(sort);
        sb.append(", sellshop=").append(sellshop);
        sb.append(", sellmoney=").append(sellmoney);
        sb.append(", publishnum=").append(publishnum);
        sb.append(", dealnum=").append(dealnum);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", product=").append(product);
        sb.append(", avgprice=").append(avgprice);
        sb.append(", subrate=").append(subrate);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", antistopid=").append(antistopid);
        sb.append(", resultflag=").append(resultflag);
        sb.append(", shopflag=").append(shopflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}