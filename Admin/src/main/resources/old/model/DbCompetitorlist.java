package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCompetitorlist implements Serializable {
    private String sequenceid;

    private String username;

    private String shopname;

    private BigDecimal dayonlinenum;

    private BigDecimal yesterdayonlinenum;

    private BigDecimal weekonlinenum;

    private BigDecimal monthonlinenum;

    private Date creatrtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public BigDecimal getDayonlinenum() {
        return dayonlinenum;
    }

    public void setDayonlinenum(BigDecimal dayonlinenum) {
        this.dayonlinenum = dayonlinenum;
    }

    public BigDecimal getYesterdayonlinenum() {
        return yesterdayonlinenum;
    }

    public void setYesterdayonlinenum(BigDecimal yesterdayonlinenum) {
        this.yesterdayonlinenum = yesterdayonlinenum;
    }

    public BigDecimal getWeekonlinenum() {
        return weekonlinenum;
    }

    public void setWeekonlinenum(BigDecimal weekonlinenum) {
        this.weekonlinenum = weekonlinenum;
    }

    public BigDecimal getMonthonlinenum() {
        return monthonlinenum;
    }

    public void setMonthonlinenum(BigDecimal monthonlinenum) {
        this.monthonlinenum = monthonlinenum;
    }

    public Date getCreatrtime() {
        return creatrtime;
    }

    public void setCreatrtime(Date creatrtime) {
        this.creatrtime = creatrtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
        DbCompetitorlist other = (DbCompetitorlist) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getDayonlinenum() == null ? other.getDayonlinenum() == null : this.getDayonlinenum().equals(other.getDayonlinenum()))
            && (this.getYesterdayonlinenum() == null ? other.getYesterdayonlinenum() == null : this.getYesterdayonlinenum().equals(other.getYesterdayonlinenum()))
            && (this.getWeekonlinenum() == null ? other.getWeekonlinenum() == null : this.getWeekonlinenum().equals(other.getWeekonlinenum()))
            && (this.getMonthonlinenum() == null ? other.getMonthonlinenum() == null : this.getMonthonlinenum().equals(other.getMonthonlinenum()))
            && (this.getCreatrtime() == null ? other.getCreatrtime() == null : this.getCreatrtime().equals(other.getCreatrtime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getDayonlinenum() == null) ? 0 : getDayonlinenum().hashCode());
        result = prime * result + ((getYesterdayonlinenum() == null) ? 0 : getYesterdayonlinenum().hashCode());
        result = prime * result + ((getWeekonlinenum() == null) ? 0 : getWeekonlinenum().hashCode());
        result = prime * result + ((getMonthonlinenum() == null) ? 0 : getMonthonlinenum().hashCode());
        result = prime * result + ((getCreatrtime() == null) ? 0 : getCreatrtime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", username=").append(username);
        sb.append(", shopname=").append(shopname);
        sb.append(", dayonlinenum=").append(dayonlinenum);
        sb.append(", yesterdayonlinenum=").append(yesterdayonlinenum);
        sb.append(", weekonlinenum=").append(weekonlinenum);
        sb.append(", monthonlinenum=").append(monthonlinenum);
        sb.append(", creatrtime=").append(creatrtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}