package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalprice implements Serializable {
    private String sequenceid;

    private String productid;

    private BigDecimal price;

    private String tocountry;

    private Date createtime;

    private BigDecimal corpid;

    private BigDecimal openflag;

    private BigDecimal pricermb;

    private String moneryrate;

    private String calculateallid;

    private String calculateall;

    private BigDecimal platfromid;

    private BigDecimal expresstypeid;

    private String platfromname;

    private String expresstype;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTocountry() {
        return tocountry;
    }

    public void setTocountry(String tocountry) {
        this.tocountry = tocountry == null ? null : tocountry.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public BigDecimal getPricermb() {
        return pricermb;
    }

    public void setPricermb(BigDecimal pricermb) {
        this.pricermb = pricermb;
    }

    public String getMoneryrate() {
        return moneryrate;
    }

    public void setMoneryrate(String moneryrate) {
        this.moneryrate = moneryrate == null ? null : moneryrate.trim();
    }

    public String getCalculateallid() {
        return calculateallid;
    }

    public void setCalculateallid(String calculateallid) {
        this.calculateallid = calculateallid == null ? null : calculateallid.trim();
    }

    public String getCalculateall() {
        return calculateall;
    }

    public void setCalculateall(String calculateall) {
        this.calculateall = calculateall == null ? null : calculateall.trim();
    }

    public BigDecimal getPlatfromid() {
        return platfromid;
    }

    public void setPlatfromid(BigDecimal platfromid) {
        this.platfromid = platfromid;
    }

    public BigDecimal getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(BigDecimal expresstypeid) {
        this.expresstypeid = expresstypeid;
    }

    public String getPlatfromname() {
        return platfromname;
    }

    public void setPlatfromname(String platfromname) {
        this.platfromname = platfromname == null ? null : platfromname.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
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
        DbCalprice other = (DbCalprice) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTocountry() == null ? other.getTocountry() == null : this.getTocountry().equals(other.getTocountry()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getPricermb() == null ? other.getPricermb() == null : this.getPricermb().equals(other.getPricermb()))
            && (this.getMoneryrate() == null ? other.getMoneryrate() == null : this.getMoneryrate().equals(other.getMoneryrate()))
            && (this.getCalculateallid() == null ? other.getCalculateallid() == null : this.getCalculateallid().equals(other.getCalculateallid()))
            && (this.getCalculateall() == null ? other.getCalculateall() == null : this.getCalculateall().equals(other.getCalculateall()))
            && (this.getPlatfromid() == null ? other.getPlatfromid() == null : this.getPlatfromid().equals(other.getPlatfromid()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getPlatfromname() == null ? other.getPlatfromname() == null : this.getPlatfromname().equals(other.getPlatfromname()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTocountry() == null) ? 0 : getTocountry().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getPricermb() == null) ? 0 : getPricermb().hashCode());
        result = prime * result + ((getMoneryrate() == null) ? 0 : getMoneryrate().hashCode());
        result = prime * result + ((getCalculateallid() == null) ? 0 : getCalculateallid().hashCode());
        result = prime * result + ((getCalculateall() == null) ? 0 : getCalculateall().hashCode());
        result = prime * result + ((getPlatfromid() == null) ? 0 : getPlatfromid().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getPlatfromname() == null) ? 0 : getPlatfromname().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
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
        sb.append(", price=").append(price);
        sb.append(", tocountry=").append(tocountry);
        sb.append(", createtime=").append(createtime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", pricermb=").append(pricermb);
        sb.append(", moneryrate=").append(moneryrate);
        sb.append(", calculateallid=").append(calculateallid);
        sb.append(", calculateall=").append(calculateall);
        sb.append(", platfromid=").append(platfromid);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", platfromname=").append(platfromname);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}