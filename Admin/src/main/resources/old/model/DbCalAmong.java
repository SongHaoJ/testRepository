package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbCalAmong implements Serializable {
    private String sequenceid;

    private String sid;

    private BigDecimal weight;

    private BigDecimal costprice;

    private String currency;

    private BigDecimal exchangerate;

    private BigDecimal defaultrate;

    private BigDecimal paypalcost;

    private BigDecimal pagecharge;

    private BigDecimal fixedcharge;

    private String expresstypefeeid;

    private BigDecimal expresstypefiled8;

    private BigDecimal packweight;

    private BigDecimal packcost;

    private BigDecimal maoli;

    private String tocountry;

    private BigDecimal cid;

    private String name;

    private BigDecimal freight;

    private BigDecimal totalprice;

    private BigDecimal basemoney;

    private BigDecimal baseweight;

    private BigDecimal unitmoney;

    private BigDecimal unitweight;

    private BigDecimal fixedmoney1;

    private BigDecimal fixedmoney2;

    private BigDecimal xbreserve8;

    private BigDecimal xbreserve7;

    private String calculateflag;

    private BigDecimal slreserve7;

    private BigDecimal ebayfee;

    private BigDecimal paypalfee;

    private BigDecimal finalcost;

    private BigDecimal finalcostrmb;

    private BigDecimal costfiled8;

    private BigDecimal costfiled9;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    public BigDecimal getDefaultrate() {
        return defaultrate;
    }

    public void setDefaultrate(BigDecimal defaultrate) {
        this.defaultrate = defaultrate;
    }

    public BigDecimal getPaypalcost() {
        return paypalcost;
    }

    public void setPaypalcost(BigDecimal paypalcost) {
        this.paypalcost = paypalcost;
    }

    public BigDecimal getPagecharge() {
        return pagecharge;
    }

    public void setPagecharge(BigDecimal pagecharge) {
        this.pagecharge = pagecharge;
    }

    public BigDecimal getFixedcharge() {
        return fixedcharge;
    }

    public void setFixedcharge(BigDecimal fixedcharge) {
        this.fixedcharge = fixedcharge;
    }

    public String getExpresstypefeeid() {
        return expresstypefeeid;
    }

    public void setExpresstypefeeid(String expresstypefeeid) {
        this.expresstypefeeid = expresstypefeeid == null ? null : expresstypefeeid.trim();
    }

    public BigDecimal getExpresstypefiled8() {
        return expresstypefiled8;
    }

    public void setExpresstypefiled8(BigDecimal expresstypefiled8) {
        this.expresstypefiled8 = expresstypefiled8;
    }

    public BigDecimal getPackweight() {
        return packweight;
    }

    public void setPackweight(BigDecimal packweight) {
        this.packweight = packweight;
    }

    public BigDecimal getPackcost() {
        return packcost;
    }

    public void setPackcost(BigDecimal packcost) {
        this.packcost = packcost;
    }

    public BigDecimal getMaoli() {
        return maoli;
    }

    public void setMaoli(BigDecimal maoli) {
        this.maoli = maoli;
    }

    public String getTocountry() {
        return tocountry;
    }

    public void setTocountry(String tocountry) {
        this.tocountry = tocountry == null ? null : tocountry.trim();
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public BigDecimal getBasemoney() {
        return basemoney;
    }

    public void setBasemoney(BigDecimal basemoney) {
        this.basemoney = basemoney;
    }

    public BigDecimal getBaseweight() {
        return baseweight;
    }

    public void setBaseweight(BigDecimal baseweight) {
        this.baseweight = baseweight;
    }

    public BigDecimal getUnitmoney() {
        return unitmoney;
    }

    public void setUnitmoney(BigDecimal unitmoney) {
        this.unitmoney = unitmoney;
    }

    public BigDecimal getUnitweight() {
        return unitweight;
    }

    public void setUnitweight(BigDecimal unitweight) {
        this.unitweight = unitweight;
    }

    public BigDecimal getFixedmoney1() {
        return fixedmoney1;
    }

    public void setFixedmoney1(BigDecimal fixedmoney1) {
        this.fixedmoney1 = fixedmoney1;
    }

    public BigDecimal getFixedmoney2() {
        return fixedmoney2;
    }

    public void setFixedmoney2(BigDecimal fixedmoney2) {
        this.fixedmoney2 = fixedmoney2;
    }

    public BigDecimal getXbreserve8() {
        return xbreserve8;
    }

    public void setXbreserve8(BigDecimal xbreserve8) {
        this.xbreserve8 = xbreserve8;
    }

    public BigDecimal getXbreserve7() {
        return xbreserve7;
    }

    public void setXbreserve7(BigDecimal xbreserve7) {
        this.xbreserve7 = xbreserve7;
    }

    public String getCalculateflag() {
        return calculateflag;
    }

    public void setCalculateflag(String calculateflag) {
        this.calculateflag = calculateflag == null ? null : calculateflag.trim();
    }

    public BigDecimal getSlreserve7() {
        return slreserve7;
    }

    public void setSlreserve7(BigDecimal slreserve7) {
        this.slreserve7 = slreserve7;
    }

    public BigDecimal getEbayfee() {
        return ebayfee;
    }

    public void setEbayfee(BigDecimal ebayfee) {
        this.ebayfee = ebayfee;
    }

    public BigDecimal getPaypalfee() {
        return paypalfee;
    }

    public void setPaypalfee(BigDecimal paypalfee) {
        this.paypalfee = paypalfee;
    }

    public BigDecimal getFinalcost() {
        return finalcost;
    }

    public void setFinalcost(BigDecimal finalcost) {
        this.finalcost = finalcost;
    }

    public BigDecimal getFinalcostrmb() {
        return finalcostrmb;
    }

    public void setFinalcostrmb(BigDecimal finalcostrmb) {
        this.finalcostrmb = finalcostrmb;
    }

    public BigDecimal getCostfiled8() {
        return costfiled8;
    }

    public void setCostfiled8(BigDecimal costfiled8) {
        this.costfiled8 = costfiled8;
    }

    public BigDecimal getCostfiled9() {
        return costfiled9;
    }

    public void setCostfiled9(BigDecimal costfiled9) {
        this.costfiled9 = costfiled9;
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
        DbCalAmong other = (DbCalAmong) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getExchangerate() == null ? other.getExchangerate() == null : this.getExchangerate().equals(other.getExchangerate()))
            && (this.getDefaultrate() == null ? other.getDefaultrate() == null : this.getDefaultrate().equals(other.getDefaultrate()))
            && (this.getPaypalcost() == null ? other.getPaypalcost() == null : this.getPaypalcost().equals(other.getPaypalcost()))
            && (this.getPagecharge() == null ? other.getPagecharge() == null : this.getPagecharge().equals(other.getPagecharge()))
            && (this.getFixedcharge() == null ? other.getFixedcharge() == null : this.getFixedcharge().equals(other.getFixedcharge()))
            && (this.getExpresstypefeeid() == null ? other.getExpresstypefeeid() == null : this.getExpresstypefeeid().equals(other.getExpresstypefeeid()))
            && (this.getExpresstypefiled8() == null ? other.getExpresstypefiled8() == null : this.getExpresstypefiled8().equals(other.getExpresstypefiled8()))
            && (this.getPackweight() == null ? other.getPackweight() == null : this.getPackweight().equals(other.getPackweight()))
            && (this.getPackcost() == null ? other.getPackcost() == null : this.getPackcost().equals(other.getPackcost()))
            && (this.getMaoli() == null ? other.getMaoli() == null : this.getMaoli().equals(other.getMaoli()))
            && (this.getTocountry() == null ? other.getTocountry() == null : this.getTocountry().equals(other.getTocountry()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getTotalprice() == null ? other.getTotalprice() == null : this.getTotalprice().equals(other.getTotalprice()))
            && (this.getBasemoney() == null ? other.getBasemoney() == null : this.getBasemoney().equals(other.getBasemoney()))
            && (this.getBaseweight() == null ? other.getBaseweight() == null : this.getBaseweight().equals(other.getBaseweight()))
            && (this.getUnitmoney() == null ? other.getUnitmoney() == null : this.getUnitmoney().equals(other.getUnitmoney()))
            && (this.getUnitweight() == null ? other.getUnitweight() == null : this.getUnitweight().equals(other.getUnitweight()))
            && (this.getFixedmoney1() == null ? other.getFixedmoney1() == null : this.getFixedmoney1().equals(other.getFixedmoney1()))
            && (this.getFixedmoney2() == null ? other.getFixedmoney2() == null : this.getFixedmoney2().equals(other.getFixedmoney2()))
            && (this.getXbreserve8() == null ? other.getXbreserve8() == null : this.getXbreserve8().equals(other.getXbreserve8()))
            && (this.getXbreserve7() == null ? other.getXbreserve7() == null : this.getXbreserve7().equals(other.getXbreserve7()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()))
            && (this.getSlreserve7() == null ? other.getSlreserve7() == null : this.getSlreserve7().equals(other.getSlreserve7()))
            && (this.getEbayfee() == null ? other.getEbayfee() == null : this.getEbayfee().equals(other.getEbayfee()))
            && (this.getPaypalfee() == null ? other.getPaypalfee() == null : this.getPaypalfee().equals(other.getPaypalfee()))
            && (this.getFinalcost() == null ? other.getFinalcost() == null : this.getFinalcost().equals(other.getFinalcost()))
            && (this.getFinalcostrmb() == null ? other.getFinalcostrmb() == null : this.getFinalcostrmb().equals(other.getFinalcostrmb()))
            && (this.getCostfiled8() == null ? other.getCostfiled8() == null : this.getCostfiled8().equals(other.getCostfiled8()))
            && (this.getCostfiled9() == null ? other.getCostfiled9() == null : this.getCostfiled9().equals(other.getCostfiled9()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getExchangerate() == null) ? 0 : getExchangerate().hashCode());
        result = prime * result + ((getDefaultrate() == null) ? 0 : getDefaultrate().hashCode());
        result = prime * result + ((getPaypalcost() == null) ? 0 : getPaypalcost().hashCode());
        result = prime * result + ((getPagecharge() == null) ? 0 : getPagecharge().hashCode());
        result = prime * result + ((getFixedcharge() == null) ? 0 : getFixedcharge().hashCode());
        result = prime * result + ((getExpresstypefeeid() == null) ? 0 : getExpresstypefeeid().hashCode());
        result = prime * result + ((getExpresstypefiled8() == null) ? 0 : getExpresstypefiled8().hashCode());
        result = prime * result + ((getPackweight() == null) ? 0 : getPackweight().hashCode());
        result = prime * result + ((getPackcost() == null) ? 0 : getPackcost().hashCode());
        result = prime * result + ((getMaoli() == null) ? 0 : getMaoli().hashCode());
        result = prime * result + ((getTocountry() == null) ? 0 : getTocountry().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getTotalprice() == null) ? 0 : getTotalprice().hashCode());
        result = prime * result + ((getBasemoney() == null) ? 0 : getBasemoney().hashCode());
        result = prime * result + ((getBaseweight() == null) ? 0 : getBaseweight().hashCode());
        result = prime * result + ((getUnitmoney() == null) ? 0 : getUnitmoney().hashCode());
        result = prime * result + ((getUnitweight() == null) ? 0 : getUnitweight().hashCode());
        result = prime * result + ((getFixedmoney1() == null) ? 0 : getFixedmoney1().hashCode());
        result = prime * result + ((getFixedmoney2() == null) ? 0 : getFixedmoney2().hashCode());
        result = prime * result + ((getXbreserve8() == null) ? 0 : getXbreserve8().hashCode());
        result = prime * result + ((getXbreserve7() == null) ? 0 : getXbreserve7().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        result = prime * result + ((getSlreserve7() == null) ? 0 : getSlreserve7().hashCode());
        result = prime * result + ((getEbayfee() == null) ? 0 : getEbayfee().hashCode());
        result = prime * result + ((getPaypalfee() == null) ? 0 : getPaypalfee().hashCode());
        result = prime * result + ((getFinalcost() == null) ? 0 : getFinalcost().hashCode());
        result = prime * result + ((getFinalcostrmb() == null) ? 0 : getFinalcostrmb().hashCode());
        result = prime * result + ((getCostfiled8() == null) ? 0 : getCostfiled8().hashCode());
        result = prime * result + ((getCostfiled9() == null) ? 0 : getCostfiled9().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", sid=").append(sid);
        sb.append(", weight=").append(weight);
        sb.append(", costprice=").append(costprice);
        sb.append(", currency=").append(currency);
        sb.append(", exchangerate=").append(exchangerate);
        sb.append(", defaultrate=").append(defaultrate);
        sb.append(", paypalcost=").append(paypalcost);
        sb.append(", pagecharge=").append(pagecharge);
        sb.append(", fixedcharge=").append(fixedcharge);
        sb.append(", expresstypefeeid=").append(expresstypefeeid);
        sb.append(", expresstypefiled8=").append(expresstypefiled8);
        sb.append(", packweight=").append(packweight);
        sb.append(", packcost=").append(packcost);
        sb.append(", maoli=").append(maoli);
        sb.append(", tocountry=").append(tocountry);
        sb.append(", cid=").append(cid);
        sb.append(", name=").append(name);
        sb.append(", freight=").append(freight);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", basemoney=").append(basemoney);
        sb.append(", baseweight=").append(baseweight);
        sb.append(", unitmoney=").append(unitmoney);
        sb.append(", unitweight=").append(unitweight);
        sb.append(", fixedmoney1=").append(fixedmoney1);
        sb.append(", fixedmoney2=").append(fixedmoney2);
        sb.append(", xbreserve8=").append(xbreserve8);
        sb.append(", xbreserve7=").append(xbreserve7);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", slreserve7=").append(slreserve7);
        sb.append(", ebayfee=").append(ebayfee);
        sb.append(", paypalfee=").append(paypalfee);
        sb.append(", finalcost=").append(finalcost);
        sb.append(", finalcostrmb=").append(finalcostrmb);
        sb.append(", costfiled8=").append(costfiled8);
        sb.append(", costfiled9=").append(costfiled9);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}