package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProject implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.DESCR
     *
     * @mbg.generated
     */
    private String descr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.FLAG
     *
     * @mbg.generated
     */
    private String flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.TRANSLATEGROUP
     *
     * @mbg.generated
     */
    private String translategroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.PRICEGROUP
     *
     * @mbg.generated
     */
    private String pricegroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.CONTENTGROUP
     *
     * @mbg.generated
     */
    private String contentgroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.PICGROUP
     *
     * @mbg.generated
     */
    private String picgroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.DESIGNGROUP
     *
     * @mbg.generated
     */
    private String designgroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.CHECKGROUP
     *
     * @mbg.generated
     */
    private String checkgroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.PUBLICGROUP
     *
     * @mbg.generated
     */
    private String publicgroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.RESERVE5
     *
     * @mbg.generated
     */
    private String reserve5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.ENDTIME
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.DATEDIFF
     *
     * @mbg.generated
     */
    private BigDecimal datediff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.SHOPTYPE
     *
     * @mbg.generated
     */
    private String shoptype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.SALESOURCE
     *
     * @mbg.generated
     */
    private String salesource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.RESERVE4
     *
     * @mbg.generated
     */
    private String reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_project.PRODUCTSKU
     *
     * @mbg.generated
     */
    private String productsku;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_project
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.SID
     *
     * @return the value of db_project.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.SID
     *
     * @param sid the value for db_project.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.DESCR
     *
     * @return the value of db_project.DESCR
     *
     * @mbg.generated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.DESCR
     *
     * @param descr the value for db_project.DESCR
     *
     * @mbg.generated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.FLAG
     *
     * @return the value of db_project.FLAG
     *
     * @mbg.generated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.FLAG
     *
     * @param flag the value for db_project.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.OPER
     *
     * @return the value of db_project.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.OPER
     *
     * @param oper the value for db_project.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.OPERTIME
     *
     * @return the value of db_project.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.OPERTIME
     *
     * @param opertime the value for db_project.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.TRANSLATEGROUP
     *
     * @return the value of db_project.TRANSLATEGROUP
     *
     * @mbg.generated
     */
    public String getTranslategroup() {
        return translategroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.TRANSLATEGROUP
     *
     * @param translategroup the value for db_project.TRANSLATEGROUP
     *
     * @mbg.generated
     */
    public void setTranslategroup(String translategroup) {
        this.translategroup = translategroup == null ? null : translategroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.PRICEGROUP
     *
     * @return the value of db_project.PRICEGROUP
     *
     * @mbg.generated
     */
    public String getPricegroup() {
        return pricegroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.PRICEGROUP
     *
     * @param pricegroup the value for db_project.PRICEGROUP
     *
     * @mbg.generated
     */
    public void setPricegroup(String pricegroup) {
        this.pricegroup = pricegroup == null ? null : pricegroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.CONTENTGROUP
     *
     * @return the value of db_project.CONTENTGROUP
     *
     * @mbg.generated
     */
    public String getContentgroup() {
        return contentgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.CONTENTGROUP
     *
     * @param contentgroup the value for db_project.CONTENTGROUP
     *
     * @mbg.generated
     */
    public void setContentgroup(String contentgroup) {
        this.contentgroup = contentgroup == null ? null : contentgroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.PICGROUP
     *
     * @return the value of db_project.PICGROUP
     *
     * @mbg.generated
     */
    public String getPicgroup() {
        return picgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.PICGROUP
     *
     * @param picgroup the value for db_project.PICGROUP
     *
     * @mbg.generated
     */
    public void setPicgroup(String picgroup) {
        this.picgroup = picgroup == null ? null : picgroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.DESIGNGROUP
     *
     * @return the value of db_project.DESIGNGROUP
     *
     * @mbg.generated
     */
    public String getDesigngroup() {
        return designgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.DESIGNGROUP
     *
     * @param designgroup the value for db_project.DESIGNGROUP
     *
     * @mbg.generated
     */
    public void setDesigngroup(String designgroup) {
        this.designgroup = designgroup == null ? null : designgroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.CHECKGROUP
     *
     * @return the value of db_project.CHECKGROUP
     *
     * @mbg.generated
     */
    public String getCheckgroup() {
        return checkgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.CHECKGROUP
     *
     * @param checkgroup the value for db_project.CHECKGROUP
     *
     * @mbg.generated
     */
    public void setCheckgroup(String checkgroup) {
        this.checkgroup = checkgroup == null ? null : checkgroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.PUBLICGROUP
     *
     * @return the value of db_project.PUBLICGROUP
     *
     * @mbg.generated
     */
    public String getPublicgroup() {
        return publicgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.PUBLICGROUP
     *
     * @param publicgroup the value for db_project.PUBLICGROUP
     *
     * @mbg.generated
     */
    public void setPublicgroup(String publicgroup) {
        this.publicgroup = publicgroup == null ? null : publicgroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.RESERVE5
     *
     * @return the value of db_project.RESERVE5
     *
     * @mbg.generated
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.RESERVE5
     *
     * @param reserve5 the value for db_project.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.ENDTIME
     *
     * @return the value of db_project.ENDTIME
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.ENDTIME
     *
     * @param endtime the value for db_project.ENDTIME
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.DATEDIFF
     *
     * @return the value of db_project.DATEDIFF
     *
     * @mbg.generated
     */
    public BigDecimal getDatediff() {
        return datediff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.DATEDIFF
     *
     * @param datediff the value for db_project.DATEDIFF
     *
     * @mbg.generated
     */
    public void setDatediff(BigDecimal datediff) {
        this.datediff = datediff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.CORPID
     *
     * @return the value of db_project.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.CORPID
     *
     * @param corpid the value for db_project.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.NAME
     *
     * @return the value of db_project.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.NAME
     *
     * @param name the value for db_project.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.SHOPTYPE
     *
     * @return the value of db_project.SHOPTYPE
     *
     * @mbg.generated
     */
    public String getShoptype() {
        return shoptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.SHOPTYPE
     *
     * @param shoptype the value for db_project.SHOPTYPE
     *
     * @mbg.generated
     */
    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.SALESOURCE
     *
     * @return the value of db_project.SALESOURCE
     *
     * @mbg.generated
     */
    public String getSalesource() {
        return salesource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.SALESOURCE
     *
     * @param salesource the value for db_project.SALESOURCE
     *
     * @mbg.generated
     */
    public void setSalesource(String salesource) {
        this.salesource = salesource == null ? null : salesource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.PRODUCTID
     *
     * @return the value of db_project.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.PRODUCTID
     *
     * @param productid the value for db_project.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.RESERVE1
     *
     * @return the value of db_project.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.RESERVE1
     *
     * @param reserve1 the value for db_project.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.RESERVE2
     *
     * @return the value of db_project.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.RESERVE2
     *
     * @param reserve2 the value for db_project.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.RESERVE3
     *
     * @return the value of db_project.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.RESERVE3
     *
     * @param reserve3 the value for db_project.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.RESERVE4
     *
     * @return the value of db_project.RESERVE4
     *
     * @mbg.generated
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.RESERVE4
     *
     * @param reserve4 the value for db_project.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_project.PRODUCTSKU
     *
     * @return the value of db_project.PRODUCTSKU
     *
     * @mbg.generated
     */
    public String getProductsku() {
        return productsku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_project.PRODUCTSKU
     *
     * @param productsku the value for db_project.PRODUCTSKU
     *
     * @mbg.generated
     */
    public void setProductsku(String productsku) {
        this.productsku = productsku == null ? null : productsku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_project
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
        DbProject other = (DbProject) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTranslategroup() == null ? other.getTranslategroup() == null : this.getTranslategroup().equals(other.getTranslategroup()))
            && (this.getPricegroup() == null ? other.getPricegroup() == null : this.getPricegroup().equals(other.getPricegroup()))
            && (this.getContentgroup() == null ? other.getContentgroup() == null : this.getContentgroup().equals(other.getContentgroup()))
            && (this.getPicgroup() == null ? other.getPicgroup() == null : this.getPicgroup().equals(other.getPicgroup()))
            && (this.getDesigngroup() == null ? other.getDesigngroup() == null : this.getDesigngroup().equals(other.getDesigngroup()))
            && (this.getCheckgroup() == null ? other.getCheckgroup() == null : this.getCheckgroup().equals(other.getCheckgroup()))
            && (this.getPublicgroup() == null ? other.getPublicgroup() == null : this.getPublicgroup().equals(other.getPublicgroup()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getDatediff() == null ? other.getDatediff() == null : this.getDatediff().equals(other.getDatediff()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getProductsku() == null ? other.getProductsku() == null : this.getProductsku().equals(other.getProductsku()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_project
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTranslategroup() == null) ? 0 : getTranslategroup().hashCode());
        result = prime * result + ((getPricegroup() == null) ? 0 : getPricegroup().hashCode());
        result = prime * result + ((getContentgroup() == null) ? 0 : getContentgroup().hashCode());
        result = prime * result + ((getPicgroup() == null) ? 0 : getPicgroup().hashCode());
        result = prime * result + ((getDesigngroup() == null) ? 0 : getDesigngroup().hashCode());
        result = prime * result + ((getCheckgroup() == null) ? 0 : getCheckgroup().hashCode());
        result = prime * result + ((getPublicgroup() == null) ? 0 : getPublicgroup().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getDatediff() == null) ? 0 : getDatediff().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getProductsku() == null) ? 0 : getProductsku().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_project
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
        sb.append(", descr=").append(descr);
        sb.append(", flag=").append(flag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", translategroup=").append(translategroup);
        sb.append(", pricegroup=").append(pricegroup);
        sb.append(", contentgroup=").append(contentgroup);
        sb.append(", picgroup=").append(picgroup);
        sb.append(", designgroup=").append(designgroup);
        sb.append(", checkgroup=").append(checkgroup);
        sb.append(", publicgroup=").append(publicgroup);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", endtime=").append(endtime);
        sb.append(", datediff=").append(datediff);
        sb.append(", corpid=").append(corpid);
        sb.append(", name=").append(name);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", productid=").append(productid);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", productsku=").append(productsku);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}