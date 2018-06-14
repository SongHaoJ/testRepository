package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbWytproduct implements Serializable {
    private String sid;

    private String name;

    private String mwarehouseid;

    private BigDecimal qtyonhand;

    private BigDecimal qtyordered;

    private BigDecimal qtyavailable;

    private BigDecimal qtysell;

    private String mabangsku;

    private String wytsku;

    private String productid;

    private String categoryid;

    private String categoryname;

    private String specification;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMwarehouseid() {
        return mwarehouseid;
    }

    public void setMwarehouseid(String mwarehouseid) {
        this.mwarehouseid = mwarehouseid == null ? null : mwarehouseid.trim();
    }

    public BigDecimal getQtyonhand() {
        return qtyonhand;
    }

    public void setQtyonhand(BigDecimal qtyonhand) {
        this.qtyonhand = qtyonhand;
    }

    public BigDecimal getQtyordered() {
        return qtyordered;
    }

    public void setQtyordered(BigDecimal qtyordered) {
        this.qtyordered = qtyordered;
    }

    public BigDecimal getQtyavailable() {
        return qtyavailable;
    }

    public void setQtyavailable(BigDecimal qtyavailable) {
        this.qtyavailable = qtyavailable;
    }

    public BigDecimal getQtysell() {
        return qtysell;
    }

    public void setQtysell(BigDecimal qtysell) {
        this.qtysell = qtysell;
    }

    public String getMabangsku() {
        return mabangsku;
    }

    public void setMabangsku(String mabangsku) {
        this.mabangsku = mabangsku == null ? null : mabangsku.trim();
    }

    public String getWytsku() {
        return wytsku;
    }

    public void setWytsku(String wytsku) {
        this.wytsku = wytsku == null ? null : wytsku.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
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