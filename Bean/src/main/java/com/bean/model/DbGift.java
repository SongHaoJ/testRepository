package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbGift implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.WEIGHT
     *
     * @mbg.generated
     */
    private BigDecimal weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.COSTPRICE
     *
     * @mbg.generated
     */
    private BigDecimal costprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.SELLPRICE
     *
     * @mbg.generated
     */
    private BigDecimal sellprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.SAVENUM
     *
     * @mbg.generated
     */
    private BigDecimal savenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.OPER1
     *
     * @mbg.generated
     */
    private String oper1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.OPER2
     *
     * @mbg.generated
     */
    private String oper2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.SHOPTYPE
     *
     * @mbg.generated
     */
    private String shoptype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.SHOPTYPEID
     *
     * @mbg.generated
     */
    private String shoptypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.EBAYITEMID
     *
     * @mbg.generated
     */
    private String ebayitemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.EBAYSITE
     *
     * @mbg.generated
     */
    private String ebaysite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.RESERVE4
     *
     * @mbg.generated
     */
    private BigDecimal reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.RESERVE5
     *
     * @mbg.generated
     */
    private BigDecimal reserve5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.CATEGORYID
     *
     * @mbg.generated
     */
    private String categoryid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.CATEGORY
     *
     * @mbg.generated
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.CREATEOPER
     *
     * @mbg.generated
     */
    private String createoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.PRODUCTNAME
     *
     * @mbg.generated
     */
    private String productname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.PRODUCTNAMEEN
     *
     * @mbg.generated
     */
    private String productnameen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.PICTUREURL
     *
     * @mbg.generated
     */
    private String pictureurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_gift.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_gift
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.SEQUENCEID
     *
     * @return the value of db_gift.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.SEQUENCEID
     *
     * @param sequenceid the value for db_gift.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.PRODUCTID
     *
     * @return the value of db_gift.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.PRODUCTID
     *
     * @param productid the value for db_gift.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.WEIGHT
     *
     * @return the value of db_gift.WEIGHT
     *
     * @mbg.generated
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.WEIGHT
     *
     * @param weight the value for db_gift.WEIGHT
     *
     * @mbg.generated
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.COSTPRICE
     *
     * @return the value of db_gift.COSTPRICE
     *
     * @mbg.generated
     */
    public BigDecimal getCostprice() {
        return costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.COSTPRICE
     *
     * @param costprice the value for db_gift.COSTPRICE
     *
     * @mbg.generated
     */
    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.SELLPRICE
     *
     * @return the value of db_gift.SELLPRICE
     *
     * @mbg.generated
     */
    public BigDecimal getSellprice() {
        return sellprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.SELLPRICE
     *
     * @param sellprice the value for db_gift.SELLPRICE
     *
     * @mbg.generated
     */
    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.SAVENUM
     *
     * @return the value of db_gift.SAVENUM
     *
     * @mbg.generated
     */
    public BigDecimal getSavenum() {
        return savenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.SAVENUM
     *
     * @param savenum the value for db_gift.SAVENUM
     *
     * @mbg.generated
     */
    public void setSavenum(BigDecimal savenum) {
        this.savenum = savenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.OPER1
     *
     * @return the value of db_gift.OPER1
     *
     * @mbg.generated
     */
    public String getOper1() {
        return oper1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.OPER1
     *
     * @param oper1 the value for db_gift.OPER1
     *
     * @mbg.generated
     */
    public void setOper1(String oper1) {
        this.oper1 = oper1 == null ? null : oper1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.OPER2
     *
     * @return the value of db_gift.OPER2
     *
     * @mbg.generated
     */
    public String getOper2() {
        return oper2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.OPER2
     *
     * @param oper2 the value for db_gift.OPER2
     *
     * @mbg.generated
     */
    public void setOper2(String oper2) {
        this.oper2 = oper2 == null ? null : oper2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.SHOPTYPE
     *
     * @return the value of db_gift.SHOPTYPE
     *
     * @mbg.generated
     */
    public String getShoptype() {
        return shoptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.SHOPTYPE
     *
     * @param shoptype the value for db_gift.SHOPTYPE
     *
     * @mbg.generated
     */
    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.SHOPTYPEID
     *
     * @return the value of db_gift.SHOPTYPEID
     *
     * @mbg.generated
     */
    public String getShoptypeid() {
        return shoptypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.SHOPTYPEID
     *
     * @param shoptypeid the value for db_gift.SHOPTYPEID
     *
     * @mbg.generated
     */
    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.EBAYITEMID
     *
     * @return the value of db_gift.EBAYITEMID
     *
     * @mbg.generated
     */
    public String getEbayitemid() {
        return ebayitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.EBAYITEMID
     *
     * @param ebayitemid the value for db_gift.EBAYITEMID
     *
     * @mbg.generated
     */
    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.EBAYSITE
     *
     * @return the value of db_gift.EBAYSITE
     *
     * @mbg.generated
     */
    public String getEbaysite() {
        return ebaysite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.EBAYSITE
     *
     * @param ebaysite the value for db_gift.EBAYSITE
     *
     * @mbg.generated
     */
    public void setEbaysite(String ebaysite) {
        this.ebaysite = ebaysite == null ? null : ebaysite.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.RESERVE4
     *
     * @return the value of db_gift.RESERVE4
     *
     * @mbg.generated
     */
    public BigDecimal getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.RESERVE4
     *
     * @param reserve4 the value for db_gift.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.RESERVE5
     *
     * @return the value of db_gift.RESERVE5
     *
     * @mbg.generated
     */
    public BigDecimal getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.RESERVE5
     *
     * @param reserve5 the value for db_gift.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.OPER
     *
     * @return the value of db_gift.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.OPER
     *
     * @param oper the value for db_gift.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.OPERTIME
     *
     * @return the value of db_gift.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.OPERTIME
     *
     * @param opertime the value for db_gift.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.CORPID
     *
     * @return the value of db_gift.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.CORPID
     *
     * @param corpid the value for db_gift.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.OPENFLAG
     *
     * @return the value of db_gift.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.OPENFLAG
     *
     * @param openflag the value for db_gift.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.CATEGORYID
     *
     * @return the value of db_gift.CATEGORYID
     *
     * @mbg.generated
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.CATEGORYID
     *
     * @param categoryid the value for db_gift.CATEGORYID
     *
     * @mbg.generated
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.CATEGORY
     *
     * @return the value of db_gift.CATEGORY
     *
     * @mbg.generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.CATEGORY
     *
     * @param category the value for db_gift.CATEGORY
     *
     * @mbg.generated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.CREATEOPER
     *
     * @return the value of db_gift.CREATEOPER
     *
     * @mbg.generated
     */
    public String getCreateoper() {
        return createoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.CREATEOPER
     *
     * @param createoper the value for db_gift.CREATEOPER
     *
     * @mbg.generated
     */
    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.CREATETIME
     *
     * @return the value of db_gift.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.CREATETIME
     *
     * @param createtime the value for db_gift.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.PRODUCTNAME
     *
     * @return the value of db_gift.PRODUCTNAME
     *
     * @mbg.generated
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.PRODUCTNAME
     *
     * @param productname the value for db_gift.PRODUCTNAME
     *
     * @mbg.generated
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.PRODUCTNAMEEN
     *
     * @return the value of db_gift.PRODUCTNAMEEN
     *
     * @mbg.generated
     */
    public String getProductnameen() {
        return productnameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.PRODUCTNAMEEN
     *
     * @param productnameen the value for db_gift.PRODUCTNAMEEN
     *
     * @mbg.generated
     */
    public void setProductnameen(String productnameen) {
        this.productnameen = productnameen == null ? null : productnameen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.PICTUREURL
     *
     * @return the value of db_gift.PICTUREURL
     *
     * @mbg.generated
     */
    public String getPictureurl() {
        return pictureurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.PICTUREURL
     *
     * @param pictureurl the value for db_gift.PICTUREURL
     *
     * @mbg.generated
     */
    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.RESERVE1
     *
     * @return the value of db_gift.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.RESERVE1
     *
     * @param reserve1 the value for db_gift.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.RESERVE2
     *
     * @return the value of db_gift.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.RESERVE2
     *
     * @param reserve2 the value for db_gift.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_gift.RESERVE3
     *
     * @return the value of db_gift.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_gift.RESERVE3
     *
     * @param reserve3 the value for db_gift.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_gift
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
        DbGift other = (DbGift) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbaysite() == null ? other.getEbaysite() == null : this.getEbaysite().equals(other.getEbaysite()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getProductnameen() == null ? other.getProductnameen() == null : this.getProductnameen().equals(other.getProductnameen()))
            && (this.getPictureurl() == null ? other.getPictureurl() == null : this.getPictureurl().equals(other.getPictureurl()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_gift
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbaysite() == null) ? 0 : getEbaysite().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getProductnameen() == null) ? 0 : getProductnameen().hashCode());
        result = prime * result + ((getPictureurl() == null) ? 0 : getPictureurl().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_gift
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
        sb.append(", productid=").append(productid);
        sb.append(", weight=").append(weight);
        sb.append(", costprice=").append(costprice);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", savenum=").append(savenum);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebaysite=").append(ebaysite);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", category=").append(category);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", productname=").append(productname);
        sb.append(", productnameen=").append(productnameen);
        sb.append(", pictureurl=").append(pictureurl);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}