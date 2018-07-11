package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbAutoaddsalenum implements Serializable {
    private String sequenceid;

    private BigDecimal startsalenum;

    private BigDecimal endsalenum;

    private BigDecimal alertnum;

    private BigDecimal purchasenum;

    private String oper;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public BigDecimal getStartsalenum() {
        return startsalenum;
    }

    public void setStartsalenum(BigDecimal startsalenum) {
        this.startsalenum = startsalenum;
    }

    public BigDecimal getEndsalenum() {
        return endsalenum;
    }

    public void setEndsalenum(BigDecimal endsalenum) {
        this.endsalenum = endsalenum;
    }

    public BigDecimal getAlertnum() {
        return alertnum;
    }

    public void setAlertnum(BigDecimal alertnum) {
        this.alertnum = alertnum;
    }

    public BigDecimal getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(BigDecimal purchasenum) {
        this.purchasenum = purchasenum;
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

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
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
        DbAutoaddsalenum other = (DbAutoaddsalenum) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getStartsalenum() == null ? other.getStartsalenum() == null : this.getStartsalenum().equals(other.getStartsalenum()))
            && (this.getEndsalenum() == null ? other.getEndsalenum() == null : this.getEndsalenum().equals(other.getEndsalenum()))
            && (this.getAlertnum() == null ? other.getAlertnum() == null : this.getAlertnum().equals(other.getAlertnum()))
            && (this.getPurchasenum() == null ? other.getPurchasenum() == null : this.getPurchasenum().equals(other.getPurchasenum()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getStartsalenum() == null) ? 0 : getStartsalenum().hashCode());
        result = prime * result + ((getEndsalenum() == null) ? 0 : getEndsalenum().hashCode());
        result = prime * result + ((getAlertnum() == null) ? 0 : getAlertnum().hashCode());
        result = prime * result + ((getPurchasenum() == null) ? 0 : getPurchasenum().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", startsalenum=").append(startsalenum);
        sb.append(", endsalenum=").append(endsalenum);
        sb.append(", alertnum=").append(alertnum);
        sb.append(", purchasenum=").append(purchasenum);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}