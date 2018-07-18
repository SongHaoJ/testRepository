package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbOutcategorysell implements Serializable {
    private String sid;

    private String warehouseid;

    private String productid;

    private String specification;

    private String ebaytransactionid;

    private String ebayitemid;

    private Integer quantity;

    private String ebayorderid;

    private Short flag;

    private Date catetime;

    private String oper;

    private Date oeprtime;

    private Date updatetime;

    private String error;

    private String recordid;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getEbaytransactionid() {
        return ebaytransactionid;
    }

    public void setEbaytransactionid(String ebaytransactionid) {
        this.ebaytransactionid = ebaytransactionid == null ? null : ebaytransactionid.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getEbayorderid() {
        return ebayorderid;
    }

    public void setEbayorderid(String ebayorderid) {
        this.ebayorderid = ebayorderid == null ? null : ebayorderid.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Date getCatetime() {
        return catetime;
    }

    public void setCatetime(Date catetime) {
        this.catetime = catetime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getOeprtime() {
        return oeprtime;
    }

    public void setOeprtime(Date oeprtime) {
        this.oeprtime = oeprtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
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
        DbOutcategorysell other = (DbOutcategorysell) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getEbaytransactionid() == null ? other.getEbaytransactionid() == null : this.getEbaytransactionid().equals(other.getEbaytransactionid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getEbayorderid() == null ? other.getEbayorderid() == null : this.getEbayorderid().equals(other.getEbayorderid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCatetime() == null ? other.getCatetime() == null : this.getCatetime().equals(other.getCatetime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOeprtime() == null ? other.getOeprtime() == null : this.getOeprtime().equals(other.getOeprtime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()))
            && (this.getRecordid() == null ? other.getRecordid() == null : this.getRecordid().equals(other.getRecordid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getEbaytransactionid() == null) ? 0 : getEbaytransactionid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getEbayorderid() == null) ? 0 : getEbayorderid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCatetime() == null) ? 0 : getCatetime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOeprtime() == null) ? 0 : getOeprtime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        result = prime * result + ((getRecordid() == null) ? 0 : getRecordid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", warehouseid=").append(warehouseid);
        sb.append(", productid=").append(productid);
        sb.append(", specification=").append(specification);
        sb.append(", ebaytransactionid=").append(ebaytransactionid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", quantity=").append(quantity);
        sb.append(", ebayorderid=").append(ebayorderid);
        sb.append(", flag=").append(flag);
        sb.append(", catetime=").append(catetime);
        sb.append(", oper=").append(oper);
        sb.append(", oeprtime=").append(oeprtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", error=").append(error);
        sb.append(", recordid=").append(recordid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}