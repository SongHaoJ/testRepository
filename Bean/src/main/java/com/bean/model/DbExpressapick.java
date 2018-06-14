package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbExpressapick implements Serializable {
    private BigDecimal id;

    private String namecn;

    private String nameen;

    private String warehousecode;

    private BigDecimal openflag;

    private BigDecimal apiid;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }

    public String getWarehousecode() {
        return warehousecode;
    }

    public void setWarehousecode(String warehousecode) {
        this.warehousecode = warehousecode == null ? null : warehousecode.trim();
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public BigDecimal getApiid() {
        return apiid;
    }

    public void setApiid(BigDecimal apiid) {
        this.apiid = apiid;
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
        DbExpressapick other = (DbExpressapick) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNamecn() == null ? other.getNamecn() == null : this.getNamecn().equals(other.getNamecn()))
            && (this.getNameen() == null ? other.getNameen() == null : this.getNameen().equals(other.getNameen()))
            && (this.getWarehousecode() == null ? other.getWarehousecode() == null : this.getWarehousecode().equals(other.getWarehousecode()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getApiid() == null ? other.getApiid() == null : this.getApiid().equals(other.getApiid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNamecn() == null) ? 0 : getNamecn().hashCode());
        result = prime * result + ((getNameen() == null) ? 0 : getNameen().hashCode());
        result = prime * result + ((getWarehousecode() == null) ? 0 : getWarehousecode().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getApiid() == null) ? 0 : getApiid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", namecn=").append(namecn);
        sb.append(", nameen=").append(nameen);
        sb.append(", warehousecode=").append(warehousecode);
        sb.append(", openflag=").append(openflag);
        sb.append(", apiid=").append(apiid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}