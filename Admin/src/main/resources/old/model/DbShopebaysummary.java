package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShopebaysummary implements Serializable {
    private String sid;

    private String shoptypeid;

    private String shoptypename;

    private String yyyymmdd;

    private BigDecimal quantitylimitremaining;

    private BigDecimal amountlimitremaining;

    private BigDecimal totalsoldcount;

    private BigDecimal totalsoldvalue;

    private Date opertime;

    private BigDecimal reserve1;

    private BigDecimal reserve2;

    private BigDecimal reserve3;

    private BigDecimal reserve4;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public String getShoptypename() {
        return shoptypename;
    }

    public void setShoptypename(String shoptypename) {
        this.shoptypename = shoptypename == null ? null : shoptypename.trim();
    }

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd == null ? null : yyyymmdd.trim();
    }

    public BigDecimal getQuantitylimitremaining() {
        return quantitylimitremaining;
    }

    public void setQuantitylimitremaining(BigDecimal quantitylimitremaining) {
        this.quantitylimitremaining = quantitylimitremaining;
    }

    public BigDecimal getAmountlimitremaining() {
        return amountlimitremaining;
    }

    public void setAmountlimitremaining(BigDecimal amountlimitremaining) {
        this.amountlimitremaining = amountlimitremaining;
    }

    public BigDecimal getTotalsoldcount() {
        return totalsoldcount;
    }

    public void setTotalsoldcount(BigDecimal totalsoldcount) {
        this.totalsoldcount = totalsoldcount;
    }

    public BigDecimal getTotalsoldvalue() {
        return totalsoldvalue;
    }

    public void setTotalsoldvalue(BigDecimal totalsoldvalue) {
        this.totalsoldvalue = totalsoldvalue;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public BigDecimal getReserve1() {
        return reserve1;
    }

    public void setReserve1(BigDecimal reserve1) {
        this.reserve1 = reserve1;
    }

    public BigDecimal getReserve2() {
        return reserve2;
    }

    public void setReserve2(BigDecimal reserve2) {
        this.reserve2 = reserve2;
    }

    public BigDecimal getReserve3() {
        return reserve3;
    }

    public void setReserve3(BigDecimal reserve3) {
        this.reserve3 = reserve3;
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
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
        DbShopebaysummary other = (DbShopebaysummary) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptypename() == null ? other.getShoptypename() == null : this.getShoptypename().equals(other.getShoptypename()))
            && (this.getYyyymmdd() == null ? other.getYyyymmdd() == null : this.getYyyymmdd().equals(other.getYyyymmdd()))
            && (this.getQuantitylimitremaining() == null ? other.getQuantitylimitremaining() == null : this.getQuantitylimitremaining().equals(other.getQuantitylimitremaining()))
            && (this.getAmountlimitremaining() == null ? other.getAmountlimitremaining() == null : this.getAmountlimitremaining().equals(other.getAmountlimitremaining()))
            && (this.getTotalsoldcount() == null ? other.getTotalsoldcount() == null : this.getTotalsoldcount().equals(other.getTotalsoldcount()))
            && (this.getTotalsoldvalue() == null ? other.getTotalsoldvalue() == null : this.getTotalsoldvalue().equals(other.getTotalsoldvalue()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptypename() == null) ? 0 : getShoptypename().hashCode());
        result = prime * result + ((getYyyymmdd() == null) ? 0 : getYyyymmdd().hashCode());
        result = prime * result + ((getQuantitylimitremaining() == null) ? 0 : getQuantitylimitremaining().hashCode());
        result = prime * result + ((getAmountlimitremaining() == null) ? 0 : getAmountlimitremaining().hashCode());
        result = prime * result + ((getTotalsoldcount() == null) ? 0 : getTotalsoldcount().hashCode());
        result = prime * result + ((getTotalsoldvalue() == null) ? 0 : getTotalsoldvalue().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptypename=").append(shoptypename);
        sb.append(", yyyymmdd=").append(yyyymmdd);
        sb.append(", quantitylimitremaining=").append(quantitylimitremaining);
        sb.append(", amountlimitremaining=").append(amountlimitremaining);
        sb.append(", totalsoldcount=").append(totalsoldcount);
        sb.append(", totalsoldvalue=").append(totalsoldvalue);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}