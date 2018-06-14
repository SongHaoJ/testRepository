package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbWytcategorydetail implements Serializable {
    private String mwarehouseid;

    private String name;

    private String costomerid;

    private BigDecimal flag;

    private String mwarehouseaddress;

    private static final long serialVersionUID = 1L;

    public String getMwarehouseid() {
        return mwarehouseid;
    }

    public void setMwarehouseid(String mwarehouseid) {
        this.mwarehouseid = mwarehouseid == null ? null : mwarehouseid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCostomerid() {
        return costomerid;
    }

    public void setCostomerid(String costomerid) {
        this.costomerid = costomerid == null ? null : costomerid.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getMwarehouseaddress() {
        return mwarehouseaddress;
    }

    public void setMwarehouseaddress(String mwarehouseaddress) {
        this.mwarehouseaddress = mwarehouseaddress == null ? null : mwarehouseaddress.trim();
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
        DbWytcategorydetail other = (DbWytcategorydetail) that;
        return (this.getMwarehouseid() == null ? other.getMwarehouseid() == null : this.getMwarehouseid().equals(other.getMwarehouseid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCostomerid() == null ? other.getCostomerid() == null : this.getCostomerid().equals(other.getCostomerid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getMwarehouseaddress() == null ? other.getMwarehouseaddress() == null : this.getMwarehouseaddress().equals(other.getMwarehouseaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMwarehouseid() == null) ? 0 : getMwarehouseid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCostomerid() == null) ? 0 : getCostomerid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getMwarehouseaddress() == null) ? 0 : getMwarehouseaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mwarehouseid=").append(mwarehouseid);
        sb.append(", name=").append(name);
        sb.append(", costomerid=").append(costomerid);
        sb.append(", flag=").append(flag);
        sb.append(", mwarehouseaddress=").append(mwarehouseaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}