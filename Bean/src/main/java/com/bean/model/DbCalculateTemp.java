package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCalculateTemp implements Serializable {
    private String sid;

    private String ebayitemid;

    private BigDecimal ebayquantity;

    private BigDecimal ebayhitcount;

    private String updatetime1;

    private Date updatetime;

    private String calculateflag;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public BigDecimal getEbayquantity() {
        return ebayquantity;
    }

    public void setEbayquantity(BigDecimal ebayquantity) {
        this.ebayquantity = ebayquantity;
    }

    public BigDecimal getEbayhitcount() {
        return ebayhitcount;
    }

    public void setEbayhitcount(BigDecimal ebayhitcount) {
        this.ebayhitcount = ebayhitcount;
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

    public String getCalculateflag() {
        return calculateflag;
    }

    public void setCalculateflag(String calculateflag) {
        this.calculateflag = calculateflag == null ? null : calculateflag.trim();
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
        DbCalculateTemp other = (DbCalculateTemp) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbayquantity() == null ? other.getEbayquantity() == null : this.getEbayquantity().equals(other.getEbayquantity()))
            && (this.getEbayhitcount() == null ? other.getEbayhitcount() == null : this.getEbayhitcount().equals(other.getEbayhitcount()))
            && (this.getUpdatetime1() == null ? other.getUpdatetime1() == null : this.getUpdatetime1().equals(other.getUpdatetime1()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbayquantity() == null) ? 0 : getEbayquantity().hashCode());
        result = prime * result + ((getEbayhitcount() == null) ? 0 : getEbayhitcount().hashCode());
        result = prime * result + ((getUpdatetime1() == null) ? 0 : getUpdatetime1().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebayquantity=").append(ebayquantity);
        sb.append(", ebayhitcount=").append(ebayhitcount);
        sb.append(", updatetime1=").append(updatetime1);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}