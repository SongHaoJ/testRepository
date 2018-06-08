package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbayExpresspublished implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.SHOPPINGSERVICEID
     *
     * @mbg.generated
     */
    private String shoppingserviceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.SHOPPINGTIMEMIN
     *
     * @mbg.generated
     */
    private String shoppingtimemin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.EXPRESSTYPE
     *
     * @mbg.generated
     */
    private String expresstype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.SITE
     *
     * @mbg.generated
     */
    private String site;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.SHOPPINGTIMEMAX
     *
     * @mbg.generated
     */
    private String shoppingtimemax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.SHOPPINGSERVICE
     *
     * @mbg.generated
     */
    private String shoppingservice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.INTERNATIONALSERVICE
     *
     * @mbg.generated
     */
    private String internationalservice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_ebay_expresspublished.WEIGHTREQUIRED
     *
     * @mbg.generated
     */
    private String weightrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_ebay_expresspublished
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.SEQUENCEID
     *
     * @return the value of db_ebay_expresspublished.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.SEQUENCEID
     *
     * @param sequenceid the value for db_ebay_expresspublished.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.SHOPPINGSERVICEID
     *
     * @return the value of db_ebay_expresspublished.SHOPPINGSERVICEID
     *
     * @mbg.generated
     */
    public String getShoppingserviceid() {
        return shoppingserviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.SHOPPINGSERVICEID
     *
     * @param shoppingserviceid the value for db_ebay_expresspublished.SHOPPINGSERVICEID
     *
     * @mbg.generated
     */
    public void setShoppingserviceid(String shoppingserviceid) {
        this.shoppingserviceid = shoppingserviceid == null ? null : shoppingserviceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.OPER
     *
     * @return the value of db_ebay_expresspublished.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.OPER
     *
     * @param oper the value for db_ebay_expresspublished.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.SHOPPINGTIMEMIN
     *
     * @return the value of db_ebay_expresspublished.SHOPPINGTIMEMIN
     *
     * @mbg.generated
     */
    public String getShoppingtimemin() {
        return shoppingtimemin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.SHOPPINGTIMEMIN
     *
     * @param shoppingtimemin the value for db_ebay_expresspublished.SHOPPINGTIMEMIN
     *
     * @mbg.generated
     */
    public void setShoppingtimemin(String shoppingtimemin) {
        this.shoppingtimemin = shoppingtimemin == null ? null : shoppingtimemin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.OPENFLAG
     *
     * @return the value of db_ebay_expresspublished.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.OPENFLAG
     *
     * @param openflag the value for db_ebay_expresspublished.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.EXPRESSTYPE
     *
     * @return the value of db_ebay_expresspublished.EXPRESSTYPE
     *
     * @mbg.generated
     */
    public String getExpresstype() {
        return expresstype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.EXPRESSTYPE
     *
     * @param expresstype the value for db_ebay_expresspublished.EXPRESSTYPE
     *
     * @mbg.generated
     */
    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.OPERTIME
     *
     * @return the value of db_ebay_expresspublished.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.OPERTIME
     *
     * @param opertime the value for db_ebay_expresspublished.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.SITE
     *
     * @return the value of db_ebay_expresspublished.SITE
     *
     * @mbg.generated
     */
    public String getSite() {
        return site;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.SITE
     *
     * @param site the value for db_ebay_expresspublished.SITE
     *
     * @mbg.generated
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.SHOPPINGTIMEMAX
     *
     * @return the value of db_ebay_expresspublished.SHOPPINGTIMEMAX
     *
     * @mbg.generated
     */
    public String getShoppingtimemax() {
        return shoppingtimemax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.SHOPPINGTIMEMAX
     *
     * @param shoppingtimemax the value for db_ebay_expresspublished.SHOPPINGTIMEMAX
     *
     * @mbg.generated
     */
    public void setShoppingtimemax(String shoppingtimemax) {
        this.shoppingtimemax = shoppingtimemax == null ? null : shoppingtimemax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.SHOPPINGSERVICE
     *
     * @return the value of db_ebay_expresspublished.SHOPPINGSERVICE
     *
     * @mbg.generated
     */
    public String getShoppingservice() {
        return shoppingservice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.SHOPPINGSERVICE
     *
     * @param shoppingservice the value for db_ebay_expresspublished.SHOPPINGSERVICE
     *
     * @mbg.generated
     */
    public void setShoppingservice(String shoppingservice) {
        this.shoppingservice = shoppingservice == null ? null : shoppingservice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.INTERNATIONALSERVICE
     *
     * @return the value of db_ebay_expresspublished.INTERNATIONALSERVICE
     *
     * @mbg.generated
     */
    public String getInternationalservice() {
        return internationalservice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.INTERNATIONALSERVICE
     *
     * @param internationalservice the value for db_ebay_expresspublished.INTERNATIONALSERVICE
     *
     * @mbg.generated
     */
    public void setInternationalservice(String internationalservice) {
        this.internationalservice = internationalservice == null ? null : internationalservice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_ebay_expresspublished.WEIGHTREQUIRED
     *
     * @return the value of db_ebay_expresspublished.WEIGHTREQUIRED
     *
     * @mbg.generated
     */
    public String getWeightrequired() {
        return weightrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_ebay_expresspublished.WEIGHTREQUIRED
     *
     * @param weightrequired the value for db_ebay_expresspublished.WEIGHTREQUIRED
     *
     * @mbg.generated
     */
    public void setWeightrequired(String weightrequired) {
        this.weightrequired = weightrequired == null ? null : weightrequired.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebay_expresspublished
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebay_expresspublished
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebay_expresspublished
     *
     * @mbg.generated
     */
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