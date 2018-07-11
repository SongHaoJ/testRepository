package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbProductAvg implements Serializable {
    private String sku;

    private BigDecimal sellnum2;

    private BigDecimal sellnum1;

    private BigDecimal diff3;

    private BigDecimal diff4;

    private BigDecimal sellnum6;

    private BigDecimal qushi;

    private BigDecimal purchaseday;

    private BigDecimal reserve3;

    private BigDecimal sellnum0;

    private String reserve2;

    private String yyyymmdd;

    private BigDecimal diff5;

    private BigDecimal diff2;

    private BigDecimal sellnum5;

    private String reserve1;

    private BigDecimal reserve4;

    private BigDecimal diff1;

    private BigDecimal sellnum4;

    private BigDecimal diff0;

    private BigDecimal diffavg;

    private BigDecimal sellnum3;

    private BigDecimal diff6;

    private BigDecimal days;

    private static final long serialVersionUID = 1L;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getSellnum2() {
        return sellnum2;
    }

    public void setSellnum2(BigDecimal sellnum2) {
        this.sellnum2 = sellnum2;
    }

    public BigDecimal getSellnum1() {
        return sellnum1;
    }

    public void setSellnum1(BigDecimal sellnum1) {
        this.sellnum1 = sellnum1;
    }

    public BigDecimal getDiff3() {
        return diff3;
    }

    public void setDiff3(BigDecimal diff3) {
        this.diff3 = diff3;
    }

    public BigDecimal getDiff4() {
        return diff4;
    }

    public void setDiff4(BigDecimal diff4) {
        this.diff4 = diff4;
    }

    public BigDecimal getSellnum6() {
        return sellnum6;
    }

    public void setSellnum6(BigDecimal sellnum6) {
        this.sellnum6 = sellnum6;
    }

    public BigDecimal getQushi() {
        return qushi;
    }

    public void setQushi(BigDecimal qushi) {
        this.qushi = qushi;
    }

    public BigDecimal getPurchaseday() {
        return purchaseday;
    }

    public void setPurchaseday(BigDecimal purchaseday) {
        this.purchaseday = purchaseday;
    }

    public BigDecimal getReserve3() {
        return reserve3;
    }

    public void setReserve3(BigDecimal reserve3) {
        this.reserve3 = reserve3;
    }

    public BigDecimal getSellnum0() {
        return sellnum0;
    }

    public void setSellnum0(BigDecimal sellnum0) {
        this.sellnum0 = sellnum0;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd == null ? null : yyyymmdd.trim();
    }

    public BigDecimal getDiff5() {
        return diff5;
    }

    public void setDiff5(BigDecimal diff5) {
        this.diff5 = diff5;
    }

    public BigDecimal getDiff2() {
        return diff2;
    }

    public void setDiff2(BigDecimal diff2) {
        this.diff2 = diff2;
    }

    public BigDecimal getSellnum5() {
        return sellnum5;
    }

    public void setSellnum5(BigDecimal sellnum5) {
        this.sellnum5 = sellnum5;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getDiff1() {
        return diff1;
    }

    public void setDiff1(BigDecimal diff1) {
        this.diff1 = diff1;
    }

    public BigDecimal getSellnum4() {
        return sellnum4;
    }

    public void setSellnum4(BigDecimal sellnum4) {
        this.sellnum4 = sellnum4;
    }

    public BigDecimal getDiff0() {
        return diff0;
    }

    public void setDiff0(BigDecimal diff0) {
        this.diff0 = diff0;
    }

    public BigDecimal getDiffavg() {
        return diffavg;
    }

    public void setDiffavg(BigDecimal diffavg) {
        this.diffavg = diffavg;
    }

    public BigDecimal getSellnum3() {
        return sellnum3;
    }

    public void setSellnum3(BigDecimal sellnum3) {
        this.sellnum3 = sellnum3;
    }

    public BigDecimal getDiff6() {
        return diff6;
    }

    public void setDiff6(BigDecimal diff6) {
        this.diff6 = diff6;
    }

    public BigDecimal getDays() {
        return days;
    }

    public void setDays(BigDecimal days) {
        this.days = days;
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
        DbProductAvg other = (DbProductAvg) that;
        return (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getSellnum2() == null ? other.getSellnum2() == null : this.getSellnum2().equals(other.getSellnum2()))
            && (this.getSellnum1() == null ? other.getSellnum1() == null : this.getSellnum1().equals(other.getSellnum1()))
            && (this.getDiff3() == null ? other.getDiff3() == null : this.getDiff3().equals(other.getDiff3()))
            && (this.getDiff4() == null ? other.getDiff4() == null : this.getDiff4().equals(other.getDiff4()))
            && (this.getSellnum6() == null ? other.getSellnum6() == null : this.getSellnum6().equals(other.getSellnum6()))
            && (this.getQushi() == null ? other.getQushi() == null : this.getQushi().equals(other.getQushi()))
            && (this.getPurchaseday() == null ? other.getPurchaseday() == null : this.getPurchaseday().equals(other.getPurchaseday()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getSellnum0() == null ? other.getSellnum0() == null : this.getSellnum0().equals(other.getSellnum0()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getYyyymmdd() == null ? other.getYyyymmdd() == null : this.getYyyymmdd().equals(other.getYyyymmdd()))
            && (this.getDiff5() == null ? other.getDiff5() == null : this.getDiff5().equals(other.getDiff5()))
            && (this.getDiff2() == null ? other.getDiff2() == null : this.getDiff2().equals(other.getDiff2()))
            && (this.getSellnum5() == null ? other.getSellnum5() == null : this.getSellnum5().equals(other.getSellnum5()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getDiff1() == null ? other.getDiff1() == null : this.getDiff1().equals(other.getDiff1()))
            && (this.getSellnum4() == null ? other.getSellnum4() == null : this.getSellnum4().equals(other.getSellnum4()))
            && (this.getDiff0() == null ? other.getDiff0() == null : this.getDiff0().equals(other.getDiff0()))
            && (this.getDiffavg() == null ? other.getDiffavg() == null : this.getDiffavg().equals(other.getDiffavg()))
            && (this.getSellnum3() == null ? other.getSellnum3() == null : this.getSellnum3().equals(other.getSellnum3()))
            && (this.getDiff6() == null ? other.getDiff6() == null : this.getDiff6().equals(other.getDiff6()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getSellnum2() == null) ? 0 : getSellnum2().hashCode());
        result = prime * result + ((getSellnum1() == null) ? 0 : getSellnum1().hashCode());
        result = prime * result + ((getDiff3() == null) ? 0 : getDiff3().hashCode());
        result = prime * result + ((getDiff4() == null) ? 0 : getDiff4().hashCode());
        result = prime * result + ((getSellnum6() == null) ? 0 : getSellnum6().hashCode());
        result = prime * result + ((getQushi() == null) ? 0 : getQushi().hashCode());
        result = prime * result + ((getPurchaseday() == null) ? 0 : getPurchaseday().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getSellnum0() == null) ? 0 : getSellnum0().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getYyyymmdd() == null) ? 0 : getYyyymmdd().hashCode());
        result = prime * result + ((getDiff5() == null) ? 0 : getDiff5().hashCode());
        result = prime * result + ((getDiff2() == null) ? 0 : getDiff2().hashCode());
        result = prime * result + ((getSellnum5() == null) ? 0 : getSellnum5().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getDiff1() == null) ? 0 : getDiff1().hashCode());
        result = prime * result + ((getSellnum4() == null) ? 0 : getSellnum4().hashCode());
        result = prime * result + ((getDiff0() == null) ? 0 : getDiff0().hashCode());
        result = prime * result + ((getDiffavg() == null) ? 0 : getDiffavg().hashCode());
        result = prime * result + ((getSellnum3() == null) ? 0 : getSellnum3().hashCode());
        result = prime * result + ((getDiff6() == null) ? 0 : getDiff6().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sku=").append(sku);
        sb.append(", sellnum2=").append(sellnum2);
        sb.append(", sellnum1=").append(sellnum1);
        sb.append(", diff3=").append(diff3);
        sb.append(", diff4=").append(diff4);
        sb.append(", sellnum6=").append(sellnum6);
        sb.append(", qushi=").append(qushi);
        sb.append(", purchaseday=").append(purchaseday);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", sellnum0=").append(sellnum0);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", yyyymmdd=").append(yyyymmdd);
        sb.append(", diff5=").append(diff5);
        sb.append(", diff2=").append(diff2);
        sb.append(", sellnum5=").append(sellnum5);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", diff1=").append(diff1);
        sb.append(", sellnum4=").append(sellnum4);
        sb.append(", diff0=").append(diff0);
        sb.append(", diffavg=").append(diffavg);
        sb.append(", sellnum3=").append(sellnum3);
        sb.append(", diff6=").append(diff6);
        sb.append(", days=").append(days);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}