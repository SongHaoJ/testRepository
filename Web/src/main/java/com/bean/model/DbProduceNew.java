package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbProduceNew implements Serializable {
    private String sequenceid;

    private String productid;

    private BigDecimal gstprice;

    private BigDecimal oceanshipprice;

    private BigDecimal expressprice;

    private BigDecimal profit;

    private BigDecimal storerent;

    private BigDecimal dhnumber;

    private String country;

    private BigDecimal rate;

    private String newproductid;

    private BigDecimal expressfee;

    private BigDecimal status;

    private String generaldelivery;

    private BigDecimal generaldeliveryfee;

    private String expeditedcourier;

    private BigDecimal expeditedcourierfee;

    private BigDecimal warehouserental;

    private BigDecimal handlingcharges;

    private String qualityrating;

    private Long sellstatus;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public BigDecimal getGstprice() {
        return gstprice;
    }

    public void setGstprice(BigDecimal gstprice) {
        this.gstprice = gstprice;
    }

    public BigDecimal getOceanshipprice() {
        return oceanshipprice;
    }

    public void setOceanshipprice(BigDecimal oceanshipprice) {
        this.oceanshipprice = oceanshipprice;
    }

    public BigDecimal getExpressprice() {
        return expressprice;
    }

    public void setExpressprice(BigDecimal expressprice) {
        this.expressprice = expressprice;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getStorerent() {
        return storerent;
    }

    public void setStorerent(BigDecimal storerent) {
        this.storerent = storerent;
    }

    public BigDecimal getDhnumber() {
        return dhnumber;
    }

    public void setDhnumber(BigDecimal dhnumber) {
        this.dhnumber = dhnumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getNewproductid() {
        return newproductid;
    }

    public void setNewproductid(String newproductid) {
        this.newproductid = newproductid == null ? null : newproductid.trim();
    }

    public BigDecimal getExpressfee() {
        return expressfee;
    }

    public void setExpressfee(BigDecimal expressfee) {
        this.expressfee = expressfee;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getGeneraldelivery() {
        return generaldelivery;
    }

    public void setGeneraldelivery(String generaldelivery) {
        this.generaldelivery = generaldelivery == null ? null : generaldelivery.trim();
    }

    public BigDecimal getGeneraldeliveryfee() {
        return generaldeliveryfee;
    }

    public void setGeneraldeliveryfee(BigDecimal generaldeliveryfee) {
        this.generaldeliveryfee = generaldeliveryfee;
    }

    public String getExpeditedcourier() {
        return expeditedcourier;
    }

    public void setExpeditedcourier(String expeditedcourier) {
        this.expeditedcourier = expeditedcourier == null ? null : expeditedcourier.trim();
    }

    public BigDecimal getExpeditedcourierfee() {
        return expeditedcourierfee;
    }

    public void setExpeditedcourierfee(BigDecimal expeditedcourierfee) {
        this.expeditedcourierfee = expeditedcourierfee;
    }

    public BigDecimal getWarehouserental() {
        return warehouserental;
    }

    public void setWarehouserental(BigDecimal warehouserental) {
        this.warehouserental = warehouserental;
    }

    public BigDecimal getHandlingcharges() {
        return handlingcharges;
    }

    public void setHandlingcharges(BigDecimal handlingcharges) {
        this.handlingcharges = handlingcharges;
    }

    public String getQualityrating() {
        return qualityrating;
    }

    public void setQualityrating(String qualityrating) {
        this.qualityrating = qualityrating == null ? null : qualityrating.trim();
    }

    public Long getSellstatus() {
        return sellstatus;
    }

    public void setSellstatus(Long sellstatus) {
        this.sellstatus = sellstatus;
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
        DbProduceNew other = (DbProduceNew) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getGstprice() == null ? other.getGstprice() == null : this.getGstprice().equals(other.getGstprice()))
            && (this.getOceanshipprice() == null ? other.getOceanshipprice() == null : this.getOceanshipprice().equals(other.getOceanshipprice()))
            && (this.getExpressprice() == null ? other.getExpressprice() == null : this.getExpressprice().equals(other.getExpressprice()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getStorerent() == null ? other.getStorerent() == null : this.getStorerent().equals(other.getStorerent()))
            && (this.getDhnumber() == null ? other.getDhnumber() == null : this.getDhnumber().equals(other.getDhnumber()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getNewproductid() == null ? other.getNewproductid() == null : this.getNewproductid().equals(other.getNewproductid()))
            && (this.getExpressfee() == null ? other.getExpressfee() == null : this.getExpressfee().equals(other.getExpressfee()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGeneraldelivery() == null ? other.getGeneraldelivery() == null : this.getGeneraldelivery().equals(other.getGeneraldelivery()))
            && (this.getGeneraldeliveryfee() == null ? other.getGeneraldeliveryfee() == null : this.getGeneraldeliveryfee().equals(other.getGeneraldeliveryfee()))
            && (this.getExpeditedcourier() == null ? other.getExpeditedcourier() == null : this.getExpeditedcourier().equals(other.getExpeditedcourier()))
            && (this.getExpeditedcourierfee() == null ? other.getExpeditedcourierfee() == null : this.getExpeditedcourierfee().equals(other.getExpeditedcourierfee()))
            && (this.getWarehouserental() == null ? other.getWarehouserental() == null : this.getWarehouserental().equals(other.getWarehouserental()))
            && (this.getHandlingcharges() == null ? other.getHandlingcharges() == null : this.getHandlingcharges().equals(other.getHandlingcharges()))
            && (this.getQualityrating() == null ? other.getQualityrating() == null : this.getQualityrating().equals(other.getQualityrating()))
            && (this.getSellstatus() == null ? other.getSellstatus() == null : this.getSellstatus().equals(other.getSellstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getGstprice() == null) ? 0 : getGstprice().hashCode());
        result = prime * result + ((getOceanshipprice() == null) ? 0 : getOceanshipprice().hashCode());
        result = prime * result + ((getExpressprice() == null) ? 0 : getExpressprice().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getStorerent() == null) ? 0 : getStorerent().hashCode());
        result = prime * result + ((getDhnumber() == null) ? 0 : getDhnumber().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getNewproductid() == null) ? 0 : getNewproductid().hashCode());
        result = prime * result + ((getExpressfee() == null) ? 0 : getExpressfee().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGeneraldelivery() == null) ? 0 : getGeneraldelivery().hashCode());
        result = prime * result + ((getGeneraldeliveryfee() == null) ? 0 : getGeneraldeliveryfee().hashCode());
        result = prime * result + ((getExpeditedcourier() == null) ? 0 : getExpeditedcourier().hashCode());
        result = prime * result + ((getExpeditedcourierfee() == null) ? 0 : getExpeditedcourierfee().hashCode());
        result = prime * result + ((getWarehouserental() == null) ? 0 : getWarehouserental().hashCode());
        result = prime * result + ((getHandlingcharges() == null) ? 0 : getHandlingcharges().hashCode());
        result = prime * result + ((getQualityrating() == null) ? 0 : getQualityrating().hashCode());
        result = prime * result + ((getSellstatus() == null) ? 0 : getSellstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", productid=").append(productid);
        sb.append(", gstprice=").append(gstprice);
        sb.append(", oceanshipprice=").append(oceanshipprice);
        sb.append(", expressprice=").append(expressprice);
        sb.append(", profit=").append(profit);
        sb.append(", storerent=").append(storerent);
        sb.append(", dhnumber=").append(dhnumber);
        sb.append(", country=").append(country);
        sb.append(", rate=").append(rate);
        sb.append(", newproductid=").append(newproductid);
        sb.append(", expressfee=").append(expressfee);
        sb.append(", status=").append(status);
        sb.append(", generaldelivery=").append(generaldelivery);
        sb.append(", generaldeliveryfee=").append(generaldeliveryfee);
        sb.append(", expeditedcourier=").append(expeditedcourier);
        sb.append(", expeditedcourierfee=").append(expeditedcourierfee);
        sb.append(", warehouserental=").append(warehouserental);
        sb.append(", handlingcharges=").append(handlingcharges);
        sb.append(", qualityrating=").append(qualityrating);
        sb.append(", sellstatus=").append(sellstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}