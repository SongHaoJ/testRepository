package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbRelistitem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.SID
     *
     * @mbg.generated
     */
    private BigDecimal sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.SHOPID
     *
     * @mbg.generated
     */
    private String shopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.CHECKOPER
     *
     * @mbg.generated
     */
    private String checkoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.ITEMID
     *
     * @mbg.generated
     */
    private String itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.SITE
     *
     * @mbg.generated
     */
    private String site;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.CHECKTIME
     *
     * @mbg.generated
     */
    private Date checktime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.ERROR
     *
     * @mbg.generated
     */
    private String error;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_relistitem.CHECKDESCR
     *
     * @mbg.generated
     */
    private String checkdescr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_relistitem
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.SID
     *
     * @return the value of db_relistitem.SID
     *
     * @mbg.generated
     */
    public BigDecimal getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.SID
     *
     * @param sid the value for db_relistitem.SID
     *
     * @mbg.generated
     */
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.OPER
     *
     * @return the value of db_relistitem.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.OPER
     *
     * @param oper the value for db_relistitem.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.SHOPID
     *
     * @return the value of db_relistitem.SHOPID
     *
     * @mbg.generated
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.SHOPID
     *
     * @param shopid the value for db_relistitem.SHOPID
     *
     * @mbg.generated
     */
    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.CHECKOPER
     *
     * @return the value of db_relistitem.CHECKOPER
     *
     * @mbg.generated
     */
    public String getCheckoper() {
        return checkoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.CHECKOPER
     *
     * @param checkoper the value for db_relistitem.CHECKOPER
     *
     * @mbg.generated
     */
    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.OPENFLAG
     *
     * @return the value of db_relistitem.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.OPENFLAG
     *
     * @param openflag the value for db_relistitem.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.ITEMID
     *
     * @return the value of db_relistitem.ITEMID
     *
     * @mbg.generated
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.ITEMID
     *
     * @param itemid the value for db_relistitem.ITEMID
     *
     * @mbg.generated
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.OPERTIME
     *
     * @return the value of db_relistitem.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.OPERTIME
     *
     * @param opertime the value for db_relistitem.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.SITE
     *
     * @return the value of db_relistitem.SITE
     *
     * @mbg.generated
     */
    public String getSite() {
        return site;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.SITE
     *
     * @param site the value for db_relistitem.SITE
     *
     * @mbg.generated
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.CHECKTIME
     *
     * @return the value of db_relistitem.CHECKTIME
     *
     * @mbg.generated
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.CHECKTIME
     *
     * @param checktime the value for db_relistitem.CHECKTIME
     *
     * @mbg.generated
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.ERROR
     *
     * @return the value of db_relistitem.ERROR
     *
     * @mbg.generated
     */
    public String getError() {
        return error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.ERROR
     *
     * @param error the value for db_relistitem.ERROR
     *
     * @mbg.generated
     */
    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_relistitem.CHECKDESCR
     *
     * @return the value of db_relistitem.CHECKDESCR
     *
     * @mbg.generated
     */
    public String getCheckdescr() {
        return checkdescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_relistitem.CHECKDESCR
     *
     * @param checkdescr the value for db_relistitem.CHECKDESCR
     *
     * @mbg.generated
     */
    public void setCheckdescr(String checkdescr) {
        this.checkdescr = checkdescr == null ? null : checkdescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_relistitem
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
        DbRelistitem other = (DbRelistitem) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()))
            && (this.getCheckdescr() == null ? other.getCheckdescr() == null : this.getCheckdescr().equals(other.getCheckdescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_relistitem
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        result = prime * result + ((getCheckdescr() == null) ? 0 : getCheckdescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_relistitem
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", oper=").append(oper);
        sb.append(", shopid=").append(shopid);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", openflag=").append(openflag);
        sb.append(", itemid=").append(itemid);
        sb.append(", opertime=").append(opertime);
        sb.append(", site=").append(site);
        sb.append(", checktime=").append(checktime);
        sb.append(", error=").append(error);
        sb.append(", checkdescr=").append(checkdescr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}