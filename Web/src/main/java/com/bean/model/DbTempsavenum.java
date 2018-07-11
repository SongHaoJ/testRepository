package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbTempsavenum implements Serializable {
    private String productid;

    private String oper;

    private String purchaseoper;

    private String nextoper;

    private BigDecimal savenum;

    private BigDecimal purchasenum;

    private String nextnum;

    private Date opertime;

    private Date nextopertime;

    private Date purchseopertime;

    private String flag;

    private BigDecimal checknum;

    private String nextdescr;

    private String purchasedescr;

    private String productname;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public String getNextoper() {
        return nextoper;
    }

    public void setNextoper(String nextoper) {
        this.nextoper = nextoper == null ? null : nextoper.trim();
    }

    public BigDecimal getSavenum() {
        return savenum;
    }

    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    public BigDecimal getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(BigDecimal purchasenum) {
        this.purchasenum = purchasenum;
    }

    public String getNextnum() {
        return nextnum;
    }

    public void setNextnum(String nextnum) {
        this.nextnum = nextnum == null ? null : nextnum.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public Date getNextopertime() {
        return nextopertime;
    }

    public void setNextopertime(Date nextopertime) {
        this.nextopertime = nextopertime;
    }

    public Date getPurchseopertime() {
        return purchseopertime;
    }

    public void setPurchseopertime(Date purchseopertime) {
        this.purchseopertime = purchseopertime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public BigDecimal getChecknum() {
        return checknum;
    }

    public void setChecknum(BigDecimal checknum) {
        this.checknum = checknum;
    }

    public String getNextdescr() {
        return nextdescr;
    }

    public void setNextdescr(String nextdescr) {
        this.nextdescr = nextdescr == null ? null : nextdescr.trim();
    }

    public String getPurchasedescr() {
        return purchasedescr;
    }

    public void setPurchasedescr(String purchasedescr) {
        this.purchasedescr = purchasedescr == null ? null : purchasedescr.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbTempsavenum other = (DbTempsavenum) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getNextoper() == null ? other.getNextoper() == null : this.getNextoper().equals(other.getNextoper()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getPurchasenum() == null ? other.getPurchasenum() == null : this.getPurchasenum().equals(other.getPurchasenum()))
            && (this.getNextnum() == null ? other.getNextnum() == null : this.getNextnum().equals(other.getNextnum()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getNextopertime() == null ? other.getNextopertime() == null : this.getNextopertime().equals(other.getNextopertime()))
            && (this.getPurchseopertime() == null ? other.getPurchseopertime() == null : this.getPurchseopertime().equals(other.getPurchseopertime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getChecknum() == null ? other.getChecknum() == null : this.getChecknum().equals(other.getChecknum()))
            && (this.getNextdescr() == null ? other.getNextdescr() == null : this.getNextdescr().equals(other.getNextdescr()))
            && (this.getPurchasedescr() == null ? other.getPurchasedescr() == null : this.getPurchasedescr().equals(other.getPurchasedescr()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getNextoper() == null) ? 0 : getNextoper().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getPurchasenum() == null) ? 0 : getPurchasenum().hashCode());
        result = prime * result + ((getNextnum() == null) ? 0 : getNextnum().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getNextopertime() == null) ? 0 : getNextopertime().hashCode());
        result = prime * result + ((getPurchseopertime() == null) ? 0 : getPurchseopertime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getChecknum() == null) ? 0 : getChecknum().hashCode());
        result = prime * result + ((getNextdescr() == null) ? 0 : getNextdescr().hashCode());
        result = prime * result + ((getPurchasedescr() == null) ? 0 : getPurchasedescr().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", oper=").append(oper);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", nextoper=").append(nextoper);
        sb.append(", savenum=").append(savenum);
        sb.append(", purchasenum=").append(purchasenum);
        sb.append(", nextnum=").append(nextnum);
        sb.append(", opertime=").append(opertime);
        sb.append(", nextopertime=").append(nextopertime);
        sb.append(", purchseopertime=").append(purchseopertime);
        sb.append(", flag=").append(flag);
        sb.append(", checknum=").append(checknum);
        sb.append(", nextdescr=").append(nextdescr);
        sb.append(", purchasedescr=").append(purchasedescr);
        sb.append(", productname=").append(productname);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}