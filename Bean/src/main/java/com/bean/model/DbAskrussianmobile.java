package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbAskrussianmobile implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.ORDERID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.SHOPID
     *
     * @mbg.generated
     */
    private String shopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.SHOPNAME
     *
     * @mbg.generated
     */
    private String shopname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.ERRORFLAG
     *
     * @mbg.generated
     */
    private String errorflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.SENDTIME
     *
     * @mbg.generated
     */
    private Date sendtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_askrussianmobile.ERRORDESCR
     *
     * @mbg.generated
     */
    private String errordescr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_askrussianmobile
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.ORDERID
     *
     * @return the value of db_askrussianmobile.ORDERID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.ORDERID
     *
     * @param orderid the value for db_askrussianmobile.ORDERID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.SHOPID
     *
     * @return the value of db_askrussianmobile.SHOPID
     *
     * @mbg.generated
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.SHOPID
     *
     * @param shopid the value for db_askrussianmobile.SHOPID
     *
     * @mbg.generated
     */
    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.SHOPNAME
     *
     * @return the value of db_askrussianmobile.SHOPNAME
     *
     * @mbg.generated
     */
    public String getShopname() {
        return shopname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.SHOPNAME
     *
     * @param shopname the value for db_askrussianmobile.SHOPNAME
     *
     * @mbg.generated
     */
    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.ERRORFLAG
     *
     * @return the value of db_askrussianmobile.ERRORFLAG
     *
     * @mbg.generated
     */
    public String getErrorflag() {
        return errorflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.ERRORFLAG
     *
     * @param errorflag the value for db_askrussianmobile.ERRORFLAG
     *
     * @mbg.generated
     */
    public void setErrorflag(String errorflag) {
        this.errorflag = errorflag == null ? null : errorflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.SENDTIME
     *
     * @return the value of db_askrussianmobile.SENDTIME
     *
     * @mbg.generated
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.SENDTIME
     *
     * @param sendtime the value for db_askrussianmobile.SENDTIME
     *
     * @mbg.generated
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.CONTENT
     *
     * @return the value of db_askrussianmobile.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.CONTENT
     *
     * @param content the value for db_askrussianmobile.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_askrussianmobile.ERRORDESCR
     *
     * @return the value of db_askrussianmobile.ERRORDESCR
     *
     * @mbg.generated
     */
    public String getErrordescr() {
        return errordescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_askrussianmobile.ERRORDESCR
     *
     * @param errordescr the value for db_askrussianmobile.ERRORDESCR
     *
     * @mbg.generated
     */
    public void setErrordescr(String errordescr) {
        this.errordescr = errordescr == null ? null : errordescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_askrussianmobile
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
        DbAskrussianmobile other = (DbAskrussianmobile) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getErrorflag() == null ? other.getErrorflag() == null : this.getErrorflag().equals(other.getErrorflag()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getErrordescr() == null ? other.getErrordescr() == null : this.getErrordescr().equals(other.getErrordescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_askrussianmobile
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getErrorflag() == null) ? 0 : getErrorflag().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getErrordescr() == null) ? 0 : getErrordescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_askrussianmobile
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", errorflag=").append(errorflag);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", content=").append(content);
        sb.append(", errordescr=").append(errordescr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}