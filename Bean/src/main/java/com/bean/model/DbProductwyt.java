package com.bean.model;

import java.io.Serializable;

public class DbProductwyt implements Serializable {
    private String sid;

    private String name;

    private String mwarehouseid;

    private Integer qtyonhand;

    private Integer qtyordered;

    private String specification;

    private Integer qtyavailable;

    private Integer qtysell;

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

    public Integer getQtyonhand() {
        return qtyonhand;
    }

    public void setQtyonhand(Integer qtyonhand) {
        this.qtyonhand = qtyonhand;
    }

    public Integer getQtyordered() {
        return qtyordered;
    }

    public void setQtyordered(Integer qtyordered) {
        this.qtyordered = qtyordered;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Integer getQtyavailable() {
        return qtyavailable;
    }

    public void setQtyavailable(Integer qtyavailable) {
        this.qtyavailable = qtyavailable;
    }

    public Integer getQtysell() {
        return qtysell;
    }

    public void setQtysell(Integer qtysell) {
        this.qtysell = qtysell;
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
        DbProductwyt other = (DbProductwyt) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMwarehouseid() == null ? other.getMwarehouseid() == null : this.getMwarehouseid().equals(other.getMwarehouseid()))
            && (this.getQtyonhand() == null ? other.getQtyonhand() == null : this.getQtyonhand().equals(other.getQtyonhand()))
            && (this.getQtyordered() == null ? other.getQtyordered() == null : this.getQtyordered().equals(other.getQtyordered()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getQtyavailable() == null ? other.getQtyavailable() == null : this.getQtyavailable().equals(other.getQtyavailable()))
            && (this.getQtysell() == null ? other.getQtysell() == null : this.getQtysell().equals(other.getQtysell()));
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
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getQtyavailable() == null) ? 0 : getQtyavailable().hashCode());
        result = prime * result + ((getQtysell() == null) ? 0 : getQtysell().hashCode());
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
        sb.append(", specification=").append(specification);
        sb.append(", qtyavailable=").append(qtyavailable);
        sb.append(", qtysell=").append(qtysell);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}