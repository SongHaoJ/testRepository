package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalculateitem implements Serializable {
    private String sid;

    private BigDecimal quantitysold1;

    private BigDecimal quantitysold3;

    private BigDecimal quantitysold7;

    private BigDecimal quantitysold10;

    private BigDecimal quantitysold15;

    private BigDecimal quantitysold30;

    private BigDecimal quantityall;

    private BigDecimal sellnumberavg;

    private BigDecimal downcount;

    private BigDecimal hitcount1;

    private BigDecimal hitcount3;

    private BigDecimal hitcount7;

    private BigDecimal hitcount10;

    private BigDecimal hitcount15;

    private BigDecimal hitcount30;

    private BigDecimal tarnsformrate10;

    private BigDecimal tarnsformrate15;

    private BigDecimal tarnsformrate30;

    private BigDecimal quantitysold60;

    private String updatetime1;

    private Date updatetime;

    private String ebayitemid;

    private BigDecimal hitcount56;

    private BigDecimal tarnsformrate28;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public BigDecimal getQuantitysold1() {
        return quantitysold1;
    }

    public void setQuantitysold1(BigDecimal quantitysold1) {
        this.quantitysold1 = quantitysold1;
    }

    public BigDecimal getQuantitysold3() {
        return quantitysold3;
    }

    public void setQuantitysold3(BigDecimal quantitysold3) {
        this.quantitysold3 = quantitysold3;
    }

    public BigDecimal getQuantitysold7() {
        return quantitysold7;
    }

    public void setQuantitysold7(BigDecimal quantitysold7) {
        this.quantitysold7 = quantitysold7;
    }

    public BigDecimal getQuantitysold10() {
        return quantitysold10;
    }

    public void setQuantitysold10(BigDecimal quantitysold10) {
        this.quantitysold10 = quantitysold10;
    }

    public BigDecimal getQuantitysold15() {
        return quantitysold15;
    }

    public void setQuantitysold15(BigDecimal quantitysold15) {
        this.quantitysold15 = quantitysold15;
    }

    public BigDecimal getQuantitysold30() {
        return quantitysold30;
    }

    public void setQuantitysold30(BigDecimal quantitysold30) {
        this.quantitysold30 = quantitysold30;
    }

    public BigDecimal getQuantityall() {
        return quantityall;
    }

    public void setQuantityall(BigDecimal quantityall) {
        this.quantityall = quantityall;
    }

    public BigDecimal getSellnumberavg() {
        return sellnumberavg;
    }

    public void setSellnumberavg(BigDecimal sellnumberavg) {
        this.sellnumberavg = sellnumberavg;
    }

    public BigDecimal getDowncount() {
        return downcount;
    }

    public void setDowncount(BigDecimal downcount) {
        this.downcount = downcount;
    }

    public BigDecimal getHitcount1() {
        return hitcount1;
    }

    public void setHitcount1(BigDecimal hitcount1) {
        this.hitcount1 = hitcount1;
    }

    public BigDecimal getHitcount3() {
        return hitcount3;
    }

    public void setHitcount3(BigDecimal hitcount3) {
        this.hitcount3 = hitcount3;
    }

    public BigDecimal getHitcount7() {
        return hitcount7;
    }

    public void setHitcount7(BigDecimal hitcount7) {
        this.hitcount7 = hitcount7;
    }

    public BigDecimal getHitcount10() {
        return hitcount10;
    }

    public void setHitcount10(BigDecimal hitcount10) {
        this.hitcount10 = hitcount10;
    }

    public BigDecimal getHitcount15() {
        return hitcount15;
    }

    public void setHitcount15(BigDecimal hitcount15) {
        this.hitcount15 = hitcount15;
    }

    public BigDecimal getHitcount30() {
        return hitcount30;
    }

    public void setHitcount30(BigDecimal hitcount30) {
        this.hitcount30 = hitcount30;
    }

    public BigDecimal getTarnsformrate10() {
        return tarnsformrate10;
    }

    public void setTarnsformrate10(BigDecimal tarnsformrate10) {
        this.tarnsformrate10 = tarnsformrate10;
    }

    public BigDecimal getTarnsformrate15() {
        return tarnsformrate15;
    }

    public void setTarnsformrate15(BigDecimal tarnsformrate15) {
        this.tarnsformrate15 = tarnsformrate15;
    }

    public BigDecimal getTarnsformrate30() {
        return tarnsformrate30;
    }

    public void setTarnsformrate30(BigDecimal tarnsformrate30) {
        this.tarnsformrate30 = tarnsformrate30;
    }

    public BigDecimal getQuantitysold60() {
        return quantitysold60;
    }

    public void setQuantitysold60(BigDecimal quantitysold60) {
        this.quantitysold60 = quantitysold60;
    }

    public String getUpdatetime1() {
        return updatetime1;
    }

    public void setUpdatetime1(String updatetime1) {
        this.updatetime1 = updatetime1 == null ? null : updatetime1.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public BigDecimal getHitcount56() {
        return hitcount56;
    }

    public void setHitcount56(BigDecimal hitcount56) {
        this.hitcount56 = hitcount56;
    }

    public BigDecimal getTarnsformrate28() {
        return tarnsformrate28;
    }

    public void setTarnsformrate28(BigDecimal tarnsformrate28) {
        this.tarnsformrate28 = tarnsformrate28;
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
        DbCalculateitem other = (DbCalculateitem) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getQuantitysold1() == null ? other.getQuantitysold1() == null : this.getQuantitysold1().equals(other.getQuantitysold1()))
            && (this.getQuantitysold3() == null ? other.getQuantitysold3() == null : this.getQuantitysold3().equals(other.getQuantitysold3()))
            && (this.getQuantitysold7() == null ? other.getQuantitysold7() == null : this.getQuantitysold7().equals(other.getQuantitysold7()))
            && (this.getQuantitysold10() == null ? other.getQuantitysold10() == null : this.getQuantitysold10().equals(other.getQuantitysold10()))
            && (this.getQuantitysold15() == null ? other.getQuantitysold15() == null : this.getQuantitysold15().equals(other.getQuantitysold15()))
            && (this.getQuantitysold30() == null ? other.getQuantitysold30() == null : this.getQuantitysold30().equals(other.getQuantitysold30()))
            && (this.getQuantityall() == null ? other.getQuantityall() == null : this.getQuantityall().equals(other.getQuantityall()))
            && (this.getSellnumberavg() == null ? other.getSellnumberavg() == null : this.getSellnumberavg().equals(other.getSellnumberavg()))
            && (this.getDowncount() == null ? other.getDowncount() == null : this.getDowncount().equals(other.getDowncount()))
            && (this.getHitcount1() == null ? other.getHitcount1() == null : this.getHitcount1().equals(other.getHitcount1()))
            && (this.getHitcount3() == null ? other.getHitcount3() == null : this.getHitcount3().equals(other.getHitcount3()))
            && (this.getHitcount7() == null ? other.getHitcount7() == null : this.getHitcount7().equals(other.getHitcount7()))
            && (this.getHitcount10() == null ? other.getHitcount10() == null : this.getHitcount10().equals(other.getHitcount10()))
            && (this.getHitcount15() == null ? other.getHitcount15() == null : this.getHitcount15().equals(other.getHitcount15()))
            && (this.getHitcount30() == null ? other.getHitcount30() == null : this.getHitcount30().equals(other.getHitcount30()))
            && (this.getTarnsformrate10() == null ? other.getTarnsformrate10() == null : this.getTarnsformrate10().equals(other.getTarnsformrate10()))
            && (this.getTarnsformrate15() == null ? other.getTarnsformrate15() == null : this.getTarnsformrate15().equals(other.getTarnsformrate15()))
            && (this.getTarnsformrate30() == null ? other.getTarnsformrate30() == null : this.getTarnsformrate30().equals(other.getTarnsformrate30()))
            && (this.getQuantitysold60() == null ? other.getQuantitysold60() == null : this.getQuantitysold60().equals(other.getQuantitysold60()))
            && (this.getUpdatetime1() == null ? other.getUpdatetime1() == null : this.getUpdatetime1().equals(other.getUpdatetime1()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getHitcount56() == null ? other.getHitcount56() == null : this.getHitcount56().equals(other.getHitcount56()))
            && (this.getTarnsformrate28() == null ? other.getTarnsformrate28() == null : this.getTarnsformrate28().equals(other.getTarnsformrate28()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getQuantitysold1() == null) ? 0 : getQuantitysold1().hashCode());
        result = prime * result + ((getQuantitysold3() == null) ? 0 : getQuantitysold3().hashCode());
        result = prime * result + ((getQuantitysold7() == null) ? 0 : getQuantitysold7().hashCode());
        result = prime * result + ((getQuantitysold10() == null) ? 0 : getQuantitysold10().hashCode());
        result = prime * result + ((getQuantitysold15() == null) ? 0 : getQuantitysold15().hashCode());
        result = prime * result + ((getQuantitysold30() == null) ? 0 : getQuantitysold30().hashCode());
        result = prime * result + ((getQuantityall() == null) ? 0 : getQuantityall().hashCode());
        result = prime * result + ((getSellnumberavg() == null) ? 0 : getSellnumberavg().hashCode());
        result = prime * result + ((getDowncount() == null) ? 0 : getDowncount().hashCode());
        result = prime * result + ((getHitcount1() == null) ? 0 : getHitcount1().hashCode());
        result = prime * result + ((getHitcount3() == null) ? 0 : getHitcount3().hashCode());
        result = prime * result + ((getHitcount7() == null) ? 0 : getHitcount7().hashCode());
        result = prime * result + ((getHitcount10() == null) ? 0 : getHitcount10().hashCode());
        result = prime * result + ((getHitcount15() == null) ? 0 : getHitcount15().hashCode());
        result = prime * result + ((getHitcount30() == null) ? 0 : getHitcount30().hashCode());
        result = prime * result + ((getTarnsformrate10() == null) ? 0 : getTarnsformrate10().hashCode());
        result = prime * result + ((getTarnsformrate15() == null) ? 0 : getTarnsformrate15().hashCode());
        result = prime * result + ((getTarnsformrate30() == null) ? 0 : getTarnsformrate30().hashCode());
        result = prime * result + ((getQuantitysold60() == null) ? 0 : getQuantitysold60().hashCode());
        result = prime * result + ((getUpdatetime1() == null) ? 0 : getUpdatetime1().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getHitcount56() == null) ? 0 : getHitcount56().hashCode());
        result = prime * result + ((getTarnsformrate28() == null) ? 0 : getTarnsformrate28().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", quantitysold1=").append(quantitysold1);
        sb.append(", quantitysold3=").append(quantitysold3);
        sb.append(", quantitysold7=").append(quantitysold7);
        sb.append(", quantitysold10=").append(quantitysold10);
        sb.append(", quantitysold15=").append(quantitysold15);
        sb.append(", quantitysold30=").append(quantitysold30);
        sb.append(", quantityall=").append(quantityall);
        sb.append(", sellnumberavg=").append(sellnumberavg);
        sb.append(", downcount=").append(downcount);
        sb.append(", hitcount1=").append(hitcount1);
        sb.append(", hitcount3=").append(hitcount3);
        sb.append(", hitcount7=").append(hitcount7);
        sb.append(", hitcount10=").append(hitcount10);
        sb.append(", hitcount15=").append(hitcount15);
        sb.append(", hitcount30=").append(hitcount30);
        sb.append(", tarnsformrate10=").append(tarnsformrate10);
        sb.append(", tarnsformrate15=").append(tarnsformrate15);
        sb.append(", tarnsformrate30=").append(tarnsformrate30);
        sb.append(", quantitysold60=").append(quantitysold60);
        sb.append(", updatetime1=").append(updatetime1);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", hitcount56=").append(hitcount56);
        sb.append(", tarnsformrate28=").append(tarnsformrate28);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}