package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbProductalert implements Serializable {
    private String squenceid;

    private BigDecimal alertstar1;

    private BigDecimal alertend1;

    private BigDecimal alertstatic1;

    private BigDecimal alertstar2;

    private BigDecimal alertend2;

    private BigDecimal alertstatic2;

    private BigDecimal alertstar3;

    private BigDecimal alertend3;

    private BigDecimal alertstatic3;

    private static final long serialVersionUID = 1L;

    public String getSquenceid() {
        return squenceid;
    }

    public void setSquenceid(String squenceid) {
        this.squenceid = squenceid == null ? null : squenceid.trim();
    }

    public BigDecimal getAlertstar1() {
        return alertstar1;
    }

    public void setAlertstar1(BigDecimal alertstar1) {
        this.alertstar1 = alertstar1;
    }

    public BigDecimal getAlertend1() {
        return alertend1;
    }

    public void setAlertend1(BigDecimal alertend1) {
        this.alertend1 = alertend1;
    }

    public BigDecimal getAlertstatic1() {
        return alertstatic1;
    }

    public void setAlertstatic1(BigDecimal alertstatic1) {
        this.alertstatic1 = alertstatic1;
    }

    public BigDecimal getAlertstar2() {
        return alertstar2;
    }

    public void setAlertstar2(BigDecimal alertstar2) {
        this.alertstar2 = alertstar2;
    }

    public BigDecimal getAlertend2() {
        return alertend2;
    }

    public void setAlertend2(BigDecimal alertend2) {
        this.alertend2 = alertend2;
    }

    public BigDecimal getAlertstatic2() {
        return alertstatic2;
    }

    public void setAlertstatic2(BigDecimal alertstatic2) {
        this.alertstatic2 = alertstatic2;
    }

    public BigDecimal getAlertstar3() {
        return alertstar3;
    }

    public void setAlertstar3(BigDecimal alertstar3) {
        this.alertstar3 = alertstar3;
    }

    public BigDecimal getAlertend3() {
        return alertend3;
    }

    public void setAlertend3(BigDecimal alertend3) {
        this.alertend3 = alertend3;
    }

    public BigDecimal getAlertstatic3() {
        return alertstatic3;
    }

    public void setAlertstatic3(BigDecimal alertstatic3) {
        this.alertstatic3 = alertstatic3;
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
        DbProductalert other = (DbProductalert) that;
        return (this.getSquenceid() == null ? other.getSquenceid() == null : this.getSquenceid().equals(other.getSquenceid()))
            && (this.getAlertstar1() == null ? other.getAlertstar1() == null : this.getAlertstar1().equals(other.getAlertstar1()))
            && (this.getAlertend1() == null ? other.getAlertend1() == null : this.getAlertend1().equals(other.getAlertend1()))
            && (this.getAlertstatic1() == null ? other.getAlertstatic1() == null : this.getAlertstatic1().equals(other.getAlertstatic1()))
            && (this.getAlertstar2() == null ? other.getAlertstar2() == null : this.getAlertstar2().equals(other.getAlertstar2()))
            && (this.getAlertend2() == null ? other.getAlertend2() == null : this.getAlertend2().equals(other.getAlertend2()))
            && (this.getAlertstatic2() == null ? other.getAlertstatic2() == null : this.getAlertstatic2().equals(other.getAlertstatic2()))
            && (this.getAlertstar3() == null ? other.getAlertstar3() == null : this.getAlertstar3().equals(other.getAlertstar3()))
            && (this.getAlertend3() == null ? other.getAlertend3() == null : this.getAlertend3().equals(other.getAlertend3()))
            && (this.getAlertstatic3() == null ? other.getAlertstatic3() == null : this.getAlertstatic3().equals(other.getAlertstatic3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSquenceid() == null) ? 0 : getSquenceid().hashCode());
        result = prime * result + ((getAlertstar1() == null) ? 0 : getAlertstar1().hashCode());
        result = prime * result + ((getAlertend1() == null) ? 0 : getAlertend1().hashCode());
        result = prime * result + ((getAlertstatic1() == null) ? 0 : getAlertstatic1().hashCode());
        result = prime * result + ((getAlertstar2() == null) ? 0 : getAlertstar2().hashCode());
        result = prime * result + ((getAlertend2() == null) ? 0 : getAlertend2().hashCode());
        result = prime * result + ((getAlertstatic2() == null) ? 0 : getAlertstatic2().hashCode());
        result = prime * result + ((getAlertstar3() == null) ? 0 : getAlertstar3().hashCode());
        result = prime * result + ((getAlertend3() == null) ? 0 : getAlertend3().hashCode());
        result = prime * result + ((getAlertstatic3() == null) ? 0 : getAlertstatic3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", squenceid=").append(squenceid);
        sb.append(", alertstar1=").append(alertstar1);
        sb.append(", alertend1=").append(alertend1);
        sb.append(", alertstatic1=").append(alertstatic1);
        sb.append(", alertstar2=").append(alertstar2);
        sb.append(", alertend2=").append(alertend2);
        sb.append(", alertstatic2=").append(alertstatic2);
        sb.append(", alertstar3=").append(alertstar3);
        sb.append(", alertend3=").append(alertend3);
        sb.append(", alertstatic3=").append(alertstatic3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}