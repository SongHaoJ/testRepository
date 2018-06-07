package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbReturnmanagermentLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.RETURNID
     *
     * @mbg.generated
     */
    private BigDecimal returnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.REPLAYSTATUS
     *
     * @mbg.generated
     */
    private BigDecimal replaystatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CREATOPER
     *
     * @mbg.generated
     */
    private String creatoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CREATTIME
     *
     * @mbg.generated
     */
    private Date creattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CONTENTID
     *
     * @mbg.generated
     */
    private BigDecimal contentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.ORDERID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.MESSAGEID
     *
     * @mbg.generated
     */
    private String messageid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.SHOPTYPEID
     *
     * @mbg.generated
     */
    private BigDecimal shoptypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.SHOPTYPE
     *
     * @mbg.generated
     */
    private String shoptype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.ORDERSTATUS
     *
     * @mbg.generated
     */
    private String orderstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.ORDERSOURCE
     *
     * @mbg.generated
     */
    private String ordersource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.ORDERTIME
     *
     * @mbg.generated
     */
    private BigDecimal ordertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.OPERTYPE
     *
     * @mbg.generated
     */
    private BigDecimal opertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CUSTOMERCOUNTRYID
     *
     * @mbg.generated
     */
    private String customercountryid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CUSTOMERCOUNTRYEN
     *
     * @mbg.generated
     */
    private String customercountryen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.DISPOSEFLAG
     *
     * @mbg.generated
     */
    private BigDecimal disposeflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.RETURNPROSTATUS
     *
     * @mbg.generated
     */
    private BigDecimal returnprostatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.RETURNMONEYSTATUS
     *
     * @mbg.generated
     */
    private BigDecimal returnmoneystatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CUSTOMERNAME
     *
     * @mbg.generated
     */
    private String customername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.CUSTOMERCOUNTRY
     *
     * @mbg.generated
     */
    private String customercountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_returnmanagerment_log.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.SEQUENCEID
     *
     * @return the value of db_returnmanagerment_log.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.SEQUENCEID
     *
     * @param sequenceid the value for db_returnmanagerment_log.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.RETURNID
     *
     * @return the value of db_returnmanagerment_log.RETURNID
     *
     * @mbg.generated
     */
    public BigDecimal getReturnid() {
        return returnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.RETURNID
     *
     * @param returnid the value for db_returnmanagerment_log.RETURNID
     *
     * @mbg.generated
     */
    public void setReturnid(BigDecimal returnid) {
        this.returnid = returnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.NAME
     *
     * @return the value of db_returnmanagerment_log.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.NAME
     *
     * @param name the value for db_returnmanagerment_log.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.REPLAYSTATUS
     *
     * @return the value of db_returnmanagerment_log.REPLAYSTATUS
     *
     * @mbg.generated
     */
    public BigDecimal getReplaystatus() {
        return replaystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.REPLAYSTATUS
     *
     * @param replaystatus the value for db_returnmanagerment_log.REPLAYSTATUS
     *
     * @mbg.generated
     */
    public void setReplaystatus(BigDecimal replaystatus) {
        this.replaystatus = replaystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.OPENFLAG
     *
     * @return the value of db_returnmanagerment_log.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.OPENFLAG
     *
     * @param openflag the value for db_returnmanagerment_log.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CREATOPER
     *
     * @return the value of db_returnmanagerment_log.CREATOPER
     *
     * @mbg.generated
     */
    public String getCreatoper() {
        return creatoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CREATOPER
     *
     * @param creatoper the value for db_returnmanagerment_log.CREATOPER
     *
     * @mbg.generated
     */
    public void setCreatoper(String creatoper) {
        this.creatoper = creatoper == null ? null : creatoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CREATTIME
     *
     * @return the value of db_returnmanagerment_log.CREATTIME
     *
     * @mbg.generated
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CREATTIME
     *
     * @param creattime the value for db_returnmanagerment_log.CREATTIME
     *
     * @mbg.generated
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.OPER
     *
     * @return the value of db_returnmanagerment_log.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.OPER
     *
     * @param oper the value for db_returnmanagerment_log.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.OPERTIME
     *
     * @return the value of db_returnmanagerment_log.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.OPERTIME
     *
     * @param opertime the value for db_returnmanagerment_log.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CONTENTID
     *
     * @return the value of db_returnmanagerment_log.CONTENTID
     *
     * @mbg.generated
     */
    public BigDecimal getContentid() {
        return contentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CONTENTID
     *
     * @param contentid the value for db_returnmanagerment_log.CONTENTID
     *
     * @mbg.generated
     */
    public void setContentid(BigDecimal contentid) {
        this.contentid = contentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.ORDERID
     *
     * @return the value of db_returnmanagerment_log.ORDERID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.ORDERID
     *
     * @param orderid the value for db_returnmanagerment_log.ORDERID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.MESSAGEID
     *
     * @return the value of db_returnmanagerment_log.MESSAGEID
     *
     * @mbg.generated
     */
    public String getMessageid() {
        return messageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.MESSAGEID
     *
     * @param messageid the value for db_returnmanagerment_log.MESSAGEID
     *
     * @mbg.generated
     */
    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.SHOPTYPEID
     *
     * @return the value of db_returnmanagerment_log.SHOPTYPEID
     *
     * @mbg.generated
     */
    public BigDecimal getShoptypeid() {
        return shoptypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.SHOPTYPEID
     *
     * @param shoptypeid the value for db_returnmanagerment_log.SHOPTYPEID
     *
     * @mbg.generated
     */
    public void setShoptypeid(BigDecimal shoptypeid) {
        this.shoptypeid = shoptypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.SHOPTYPE
     *
     * @return the value of db_returnmanagerment_log.SHOPTYPE
     *
     * @mbg.generated
     */
    public String getShoptype() {
        return shoptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.SHOPTYPE
     *
     * @param shoptype the value for db_returnmanagerment_log.SHOPTYPE
     *
     * @mbg.generated
     */
    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.ORDERSTATUS
     *
     * @return the value of db_returnmanagerment_log.ORDERSTATUS
     *
     * @mbg.generated
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.ORDERSTATUS
     *
     * @param orderstatus the value for db_returnmanagerment_log.ORDERSTATUS
     *
     * @mbg.generated
     */
    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.ORDERSOURCE
     *
     * @return the value of db_returnmanagerment_log.ORDERSOURCE
     *
     * @mbg.generated
     */
    public String getOrdersource() {
        return ordersource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.ORDERSOURCE
     *
     * @param ordersource the value for db_returnmanagerment_log.ORDERSOURCE
     *
     * @mbg.generated
     */
    public void setOrdersource(String ordersource) {
        this.ordersource = ordersource == null ? null : ordersource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.ORDERTIME
     *
     * @return the value of db_returnmanagerment_log.ORDERTIME
     *
     * @mbg.generated
     */
    public BigDecimal getOrdertime() {
        return ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.ORDERTIME
     *
     * @param ordertime the value for db_returnmanagerment_log.ORDERTIME
     *
     * @mbg.generated
     */
    public void setOrdertime(BigDecimal ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.OPERTYPE
     *
     * @return the value of db_returnmanagerment_log.OPERTYPE
     *
     * @mbg.generated
     */
    public BigDecimal getOpertype() {
        return opertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.OPERTYPE
     *
     * @param opertype the value for db_returnmanagerment_log.OPERTYPE
     *
     * @mbg.generated
     */
    public void setOpertype(BigDecimal opertype) {
        this.opertype = opertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CUSTOMERCOUNTRYID
     *
     * @return the value of db_returnmanagerment_log.CUSTOMERCOUNTRYID
     *
     * @mbg.generated
     */
    public String getCustomercountryid() {
        return customercountryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CUSTOMERCOUNTRYID
     *
     * @param customercountryid the value for db_returnmanagerment_log.CUSTOMERCOUNTRYID
     *
     * @mbg.generated
     */
    public void setCustomercountryid(String customercountryid) {
        this.customercountryid = customercountryid == null ? null : customercountryid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CUSTOMERCOUNTRYEN
     *
     * @return the value of db_returnmanagerment_log.CUSTOMERCOUNTRYEN
     *
     * @mbg.generated
     */
    public String getCustomercountryen() {
        return customercountryen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CUSTOMERCOUNTRYEN
     *
     * @param customercountryen the value for db_returnmanagerment_log.CUSTOMERCOUNTRYEN
     *
     * @mbg.generated
     */
    public void setCustomercountryen(String customercountryen) {
        this.customercountryen = customercountryen == null ? null : customercountryen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.DISPOSEFLAG
     *
     * @return the value of db_returnmanagerment_log.DISPOSEFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getDisposeflag() {
        return disposeflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.DISPOSEFLAG
     *
     * @param disposeflag the value for db_returnmanagerment_log.DISPOSEFLAG
     *
     * @mbg.generated
     */
    public void setDisposeflag(BigDecimal disposeflag) {
        this.disposeflag = disposeflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.RETURNPROSTATUS
     *
     * @return the value of db_returnmanagerment_log.RETURNPROSTATUS
     *
     * @mbg.generated
     */
    public BigDecimal getReturnprostatus() {
        return returnprostatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.RETURNPROSTATUS
     *
     * @param returnprostatus the value for db_returnmanagerment_log.RETURNPROSTATUS
     *
     * @mbg.generated
     */
    public void setReturnprostatus(BigDecimal returnprostatus) {
        this.returnprostatus = returnprostatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.RETURNMONEYSTATUS
     *
     * @return the value of db_returnmanagerment_log.RETURNMONEYSTATUS
     *
     * @mbg.generated
     */
    public BigDecimal getReturnmoneystatus() {
        return returnmoneystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.RETURNMONEYSTATUS
     *
     * @param returnmoneystatus the value for db_returnmanagerment_log.RETURNMONEYSTATUS
     *
     * @mbg.generated
     */
    public void setReturnmoneystatus(BigDecimal returnmoneystatus) {
        this.returnmoneystatus = returnmoneystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CUSTOMERNAME
     *
     * @return the value of db_returnmanagerment_log.CUSTOMERNAME
     *
     * @mbg.generated
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CUSTOMERNAME
     *
     * @param customername the value for db_returnmanagerment_log.CUSTOMERNAME
     *
     * @mbg.generated
     */
    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.CUSTOMERCOUNTRY
     *
     * @return the value of db_returnmanagerment_log.CUSTOMERCOUNTRY
     *
     * @mbg.generated
     */
    public String getCustomercountry() {
        return customercountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.CUSTOMERCOUNTRY
     *
     * @param customercountry the value for db_returnmanagerment_log.CUSTOMERCOUNTRY
     *
     * @mbg.generated
     */
    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry == null ? null : customercountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_returnmanagerment_log.DESCR
     *
     * @return the value of db_returnmanagerment_log.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_returnmanagerment_log.DESCR
     *
     * @param descr the value for db_returnmanagerment_log.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
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
        DbReturnmanagermentLog other = (DbReturnmanagermentLog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getReturnid() == null ? other.getReturnid() == null : this.getReturnid().equals(other.getReturnid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getReplaystatus() == null ? other.getReplaystatus() == null : this.getReplaystatus().equals(other.getReplaystatus()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCreatoper() == null ? other.getCreatoper() == null : this.getCreatoper().equals(other.getCreatoper()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getContentid() == null ? other.getContentid() == null : this.getContentid().equals(other.getContentid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getOrdersource() == null ? other.getOrdersource() == null : this.getOrdersource().equals(other.getOrdersource()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getCustomercountryid() == null ? other.getCustomercountryid() == null : this.getCustomercountryid().equals(other.getCustomercountryid()))
            && (this.getCustomercountryen() == null ? other.getCustomercountryen() == null : this.getCustomercountryen().equals(other.getCustomercountryen()))
            && (this.getDisposeflag() == null ? other.getDisposeflag() == null : this.getDisposeflag().equals(other.getDisposeflag()))
            && (this.getReturnprostatus() == null ? other.getReturnprostatus() == null : this.getReturnprostatus().equals(other.getReturnprostatus()))
            && (this.getReturnmoneystatus() == null ? other.getReturnmoneystatus() == null : this.getReturnmoneystatus().equals(other.getReturnmoneystatus()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomercountry() == null ? other.getCustomercountry() == null : this.getCustomercountry().equals(other.getCustomercountry()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getReturnid() == null) ? 0 : getReturnid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getReplaystatus() == null) ? 0 : getReplaystatus().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCreatoper() == null) ? 0 : getCreatoper().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getContentid() == null) ? 0 : getContentid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getOrdersource() == null) ? 0 : getOrdersource().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getCustomercountryid() == null) ? 0 : getCustomercountryid().hashCode());
        result = prime * result + ((getCustomercountryen() == null) ? 0 : getCustomercountryen().hashCode());
        result = prime * result + ((getDisposeflag() == null) ? 0 : getDisposeflag().hashCode());
        result = prime * result + ((getReturnprostatus() == null) ? 0 : getReturnprostatus().hashCode());
        result = prime * result + ((getReturnmoneystatus() == null) ? 0 : getReturnmoneystatus().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomercountry() == null) ? 0 : getCustomercountry().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
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
        sb.append(", returnid=").append(returnid);
        sb.append(", name=").append(name);
        sb.append(", replaystatus=").append(replaystatus);
        sb.append(", openflag=").append(openflag);
        sb.append(", creatoper=").append(creatoper);
        sb.append(", creattime=").append(creattime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", contentid=").append(contentid);
        sb.append(", orderid=").append(orderid);
        sb.append(", messageid=").append(messageid);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", ordersource=").append(ordersource);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", opertype=").append(opertype);
        sb.append(", customercountryid=").append(customercountryid);
        sb.append(", customercountryen=").append(customercountryen);
        sb.append(", disposeflag=").append(disposeflag);
        sb.append(", returnprostatus=").append(returnprostatus);
        sb.append(", returnmoneystatus=").append(returnmoneystatus);
        sb.append(", customername=").append(customername);
        sb.append(", customercountry=").append(customercountry);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}