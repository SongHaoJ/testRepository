package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalculateall implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal platformid;

    private String platformname;

    private BigDecimal costtype;

    private BigDecimal expresstypeid;

    private String tocountry;

    private BigDecimal maoli;

    private String oper;

    private Date opertime;

    private BigDecimal corpid;

    private BigDecimal openflag;

    private String name;

    private BigDecimal packagingid;

    private String expresstype;

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

    private BigDecimal costfiled8;

    private BigDecimal costfiled9;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getPlatformid() {
        return platformid;
    }

    public void setPlatformid(BigDecimal platformid) {
        this.platformid = platformid;
    }

    public String getPlatformname() {
        return platformname;
    }

    public void setPlatformname(String platformname) {
        this.platformname = platformname == null ? null : platformname.trim();
    }

    public BigDecimal getCosttype() {
        return costtype;
    }

    public void setCosttype(BigDecimal costtype) {
        this.costtype = costtype;
    }

    public BigDecimal getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(BigDecimal expresstypeid) {
        this.expresstypeid = expresstypeid;
    }

    public String getTocountry() {
        return tocountry;
    }

    public void setTocountry(String tocountry) {
        this.tocountry = tocountry == null ? null : tocountry.trim();
    }

    public BigDecimal getMaoli() {
        return maoli;
    }

    public void setMaoli(BigDecimal maoli) {
        this.maoli = maoli;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPackagingid() {
        return packagingid;
    }

    public void setPackagingid(BigDecimal packagingid) {
        this.packagingid = packagingid;
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
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
        DbCalculateall other = (DbCalculateall) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getPlatformid() == null ? other.getPlatformid() == null : this.getPlatformid().equals(other.getPlatformid()))
            && (this.getPlatformname() == null ? other.getPlatformname() == null : this.getPlatformname().equals(other.getPlatformname()))
            && (this.getCosttype() == null ? other.getCosttype() == null : this.getCosttype().equals(other.getCosttype()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getTocountry() == null ? other.getTocountry() == null : this.getTocountry().equals(other.getTocountry()))
            && (this.getMaoli() == null ? other.getMaoli() == null : this.getMaoli().equals(other.getMaoli()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPackagingid() == null ? other.getPackagingid() == null : this.getPackagingid().equals(other.getPackagingid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
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
            && (this.getCostfiled8() == null ? other.getCostfiled8() == null : this.getCostfiled8().equals(other.getCostfiled8()))
            && (this.getCostfiled9() == null ? other.getCostfiled9() == null : this.getCostfiled9().equals(other.getCostfiled9()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getPlatformid() == null) ? 0 : getPlatformid().hashCode());
        result = prime * result + ((getPlatformname() == null) ? 0 : getPlatformname().hashCode());
        result = prime * result + ((getCosttype() == null) ? 0 : getCosttype().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getTocountry() == null) ? 0 : getTocountry().hashCode());
        result = prime * result + ((getMaoli() == null) ? 0 : getMaoli().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPackagingid() == null) ? 0 : getPackagingid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
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
        sb.append(", platformid=").append(platformid);
        sb.append(", platformname=").append(platformname);
        sb.append(", costtype=").append(costtype);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", tocountry=").append(tocountry);
        sb.append(", maoli=").append(maoli);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", name=").append(name);
        sb.append(", packagingid=").append(packagingid);
        sb.append(", expresstype=").append(expresstype);
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
        sb.append(", costfiled8=").append(costfiled8);
        sb.append(", costfiled9=").append(costfiled9);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}