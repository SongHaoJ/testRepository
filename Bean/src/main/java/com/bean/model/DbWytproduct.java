package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbWytproduct implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.SID
     *
     * @mbg.generated
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.MWAREHOUSEID
     *
     * @mbg.generated
     */
    private String mwarehouseid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.QTYONHAND
     *
     * @mbg.generated
     */
    private BigDecimal qtyonhand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.QTYORDERED
     *
     * @mbg.generated
     */
    private BigDecimal qtyordered;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.QTYAVAILABLE
     *
     * @mbg.generated
     */
    private BigDecimal qtyavailable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.QTYSELL
     *
     * @mbg.generated
     */
    private BigDecimal qtysell;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.MABANGSKU
     *
     * @mbg.generated
     */
    private String mabangsku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.WYTSKU
     *
     * @mbg.generated
     */
    private String wytsku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.CATEGORYID
     *
     * @mbg.generated
     */
    private String categoryid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.CATEGORYNAME
     *
     * @mbg.generated
     */
    private String categoryname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_wytproduct.SPECIFICATION
     *
     * @mbg.generated
     */
    private String specification;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_wytproduct
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.SID
     *
     * @return the value of db_wytproduct.SID
     *
     * @mbg.generated
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.SID
     *
     * @param sid the value for db_wytproduct.SID
     *
     * @mbg.generated
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.NAME
     *
     * @return the value of db_wytproduct.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.NAME
     *
     * @param name the value for db_wytproduct.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.MWAREHOUSEID
     *
     * @return the value of db_wytproduct.MWAREHOUSEID
     *
     * @mbg.generated
     */
    public String getMwarehouseid() {
        return mwarehouseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.MWAREHOUSEID
     *
     * @param mwarehouseid the value for db_wytproduct.MWAREHOUSEID
     *
     * @mbg.generated
     */
    public void setMwarehouseid(String mwarehouseid) {
        this.mwarehouseid = mwarehouseid == null ? null : mwarehouseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.QTYONHAND
     *
     * @return the value of db_wytproduct.QTYONHAND
     *
     * @mbg.generated
     */
    public BigDecimal getQtyonhand() {
        return qtyonhand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.QTYONHAND
     *
     * @param qtyonhand the value for db_wytproduct.QTYONHAND
     *
     * @mbg.generated
     */
    public void setQtyonhand(BigDecimal qtyonhand) {
        this.qtyonhand = qtyonhand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.QTYORDERED
     *
     * @return the value of db_wytproduct.QTYORDERED
     *
     * @mbg.generated
     */
    public BigDecimal getQtyordered() {
        return qtyordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.QTYORDERED
     *
     * @param qtyordered the value for db_wytproduct.QTYORDERED
     *
     * @mbg.generated
     */
    public void setQtyordered(BigDecimal qtyordered) {
        this.qtyordered = qtyordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.QTYAVAILABLE
     *
     * @return the value of db_wytproduct.QTYAVAILABLE
     *
     * @mbg.generated
     */
    public BigDecimal getQtyavailable() {
        return qtyavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.QTYAVAILABLE
     *
     * @param qtyavailable the value for db_wytproduct.QTYAVAILABLE
     *
     * @mbg.generated
     */
    public void setQtyavailable(BigDecimal qtyavailable) {
        this.qtyavailable = qtyavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.QTYSELL
     *
     * @return the value of db_wytproduct.QTYSELL
     *
     * @mbg.generated
     */
    public BigDecimal getQtysell() {
        return qtysell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.QTYSELL
     *
     * @param qtysell the value for db_wytproduct.QTYSELL
     *
     * @mbg.generated
     */
    public void setQtysell(BigDecimal qtysell) {
        this.qtysell = qtysell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.MABANGSKU
     *
     * @return the value of db_wytproduct.MABANGSKU
     *
     * @mbg.generated
     */
    public String getMabangsku() {
        return mabangsku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.MABANGSKU
     *
     * @param mabangsku the value for db_wytproduct.MABANGSKU
     *
     * @mbg.generated
     */
    public void setMabangsku(String mabangsku) {
        this.mabangsku = mabangsku == null ? null : mabangsku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.WYTSKU
     *
     * @return the value of db_wytproduct.WYTSKU
     *
     * @mbg.generated
     */
    public String getWytsku() {
        return wytsku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.WYTSKU
     *
     * @param wytsku the value for db_wytproduct.WYTSKU
     *
     * @mbg.generated
     */
    public void setWytsku(String wytsku) {
        this.wytsku = wytsku == null ? null : wytsku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.PRODUCTID
     *
     * @return the value of db_wytproduct.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.PRODUCTID
     *
     * @param productid the value for db_wytproduct.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.CATEGORYID
     *
     * @return the value of db_wytproduct.CATEGORYID
     *
     * @mbg.generated
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.CATEGORYID
     *
     * @param categoryid the value for db_wytproduct.CATEGORYID
     *
     * @mbg.generated
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.CATEGORYNAME
     *
     * @return the value of db_wytproduct.CATEGORYNAME
     *
     * @mbg.generated
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.CATEGORYNAME
     *
     * @param categoryname the value for db_wytproduct.CATEGORYNAME
     *
     * @mbg.generated
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_wytproduct.SPECIFICATION
     *
     * @return the value of db_wytproduct.SPECIFICATION
     *
     * @mbg.generated
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_wytproduct.SPECIFICATION
     *
     * @param specification the value for db_wytproduct.SPECIFICATION
     *
     * @mbg.generated
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytproduct
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
        DbWytproduct other = (DbWytproduct) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMwarehouseid() == null ? other.getMwarehouseid() == null : this.getMwarehouseid().equals(other.getMwarehouseid()))
            && (this.getQtyonhand() == null ? other.getQtyonhand() == null : this.getQtyonhand().equals(other.getQtyonhand()))
            && (this.getQtyordered() == null ? other.getQtyordered() == null : this.getQtyordered().equals(other.getQtyordered()))
            && (this.getQtyavailable() == null ? other.getQtyavailable() == null : this.getQtyavailable().equals(other.getQtyavailable()))
            && (this.getQtysell() == null ? other.getQtysell() == null : this.getQtysell().equals(other.getQtysell()))
            && (this.getMabangsku() == null ? other.getMabangsku() == null : this.getMabangsku().equals(other.getMabangsku()))
            && (this.getWytsku() == null ? other.getWytsku() == null : this.getWytsku().equals(other.getWytsku()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytproduct
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMwarehouseid() == null) ? 0 : getMwarehouseid().hashCode());
        result = prime * result + ((getQtyonhand() == null) ? 0 : getQtyonhand().hashCode());
        result = prime * result + ((getQtyordered() == null) ? 0 : getQtyordered().hashCode());
        result = prime * result + ((getQtyavailable() == null) ? 0 : getQtyavailable().hashCode());
        result = prime * result + ((getQtysell() == null) ? 0 : getQtysell().hashCode());
        result = prime * result + ((getMabangsku() == null) ? 0 : getMabangsku().hashCode());
        result = prime * result + ((getWytsku() == null) ? 0 : getWytsku().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytproduct
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
        sb.append(", name=").append(name);
        sb.append(", mwarehouseid=").append(mwarehouseid);
        sb.append(", qtyonhand=").append(qtyonhand);
        sb.append(", qtyordered=").append(qtyordered);
        sb.append(", qtyavailable=").append(qtyavailable);
        sb.append(", qtysell=").append(qtysell);
        sb.append(", mabangsku=").append(mabangsku);
        sb.append(", wytsku=").append(wytsku);
        sb.append(", productid=").append(productid);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", specification=").append(specification);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}