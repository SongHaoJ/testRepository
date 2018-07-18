package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbayExpresspublished implements Serializable {
    private BigDecimal sequenceid;

    private String shoppingserviceid;

    private String oper;

    private String shoppingtimemin;

    private String openflag;

    private String expresstype;

    private Date opertime;

    private String site;

    private String shoppingtimemax;

    private String shoppingservice;

    private String internationalservice;

    private String weightrequired;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getShoppingserviceid() {
        return shoppingserviceid;
    }

    public void setShoppingserviceid(String shoppingserviceid) {
        this.shoppingserviceid = shoppingserviceid == null ? null : shoppingserviceid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getShoppingtimemin() {
        return shoppingtimemin;
    }

    public void setShoppingtimemin(String shoppingtimemin) {
        this.shoppingtimemin = shoppingtimemin == null ? null : shoppingtimemin.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getShoppingtimemax() {
        return shoppingtimemax;
    }

    public void setShoppingtimemax(String shoppingtimemax) {
        this.shoppingtimemax = shoppingtimemax == null ? null : shoppingtimemax.trim();
    }

    public String getShoppingservice() {
        return shoppingservice;
    }

    public void setShoppingservice(String shoppingservice) {
        this.shoppingservice = shoppingservice == null ? null : shoppingservice.trim();
    }

    public String getInternationalservice() {
        return internationalservice;
    }

    public void setInternationalservice(String internationalservice) {
        this.internationalservice = internationalservice == null ? null : internationalservice.trim();
    }

    public String getWeightrequired() {
        return weightrequired;
    }

    public void setWeightrequired(String weightrequired) {
        this.weightrequired = weightrequired == null ? null : weightrequired.trim();
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
        DbEbayExpresspublished other = (DbEbayExpresspublished) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getShoppingserviceid() == null ? other.getShoppingserviceid() == null : this.getShoppingserviceid().equals(other.getShoppingserviceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getShoppingtimemin() == null ? other.getShoppingtimemin() == null : this.getShoppingtimemin().equals(other.getShoppingtimemin()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getShoppingtimemax() == null ? other.getShoppingtimemax() == null : this.getShoppingtimemax().equals(other.getShoppingtimemax()))
            && (this.getShoppingservice() == null ? other.getShoppingservice() == null : this.getShoppingservice().equals(other.getShoppingservice()))
            && (this.getInternationalservice() == null ? other.getInternationalservice() == null : this.getInternationalservice().equals(other.getInternationalservice()))
            && (this.getWeightrequired() == null ? other.getWeightrequired() == null : this.getWeightrequired().equals(other.getWeightrequired()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getShoppingserviceid() == null) ? 0 : getShoppingserviceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getShoppingtimemin() == null) ? 0 : getShoppingtimemin().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getShoppingtimemax() == null) ? 0 : getShoppingtimemax().hashCode());
        result = prime * result + ((getShoppingservice() == null) ? 0 : getShoppingservice().hashCode());
        result = prime * result + ((getInternationalservice() == null) ? 0 : getInternationalservice().hashCode());
        result = prime * result + ((getWeightrequired() == null) ? 0 : getWeightrequired().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", shoppingserviceid=").append(shoppingserviceid);
        sb.append(", oper=").append(oper);
        sb.append(", shoppingtimemin=").append(shoppingtimemin);
        sb.append(", openflag=").append(openflag);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", opertime=").append(opertime);
        sb.append(", site=").append(site);
        sb.append(", shoppingtimemax=").append(shoppingtimemax);
        sb.append(", shoppingservice=").append(shoppingservice);
        sb.append(", internationalservice=").append(internationalservice);
        sb.append(", weightrequired=").append(weightrequired);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}