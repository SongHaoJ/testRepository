package com.bean.model;

import java.io.Serializable;

public class DbQtwarehouses implements Serializable {
    private String warehouseid;

    private String warehousename;

    private static final long serialVersionUID = 1L;

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
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
        DbQtwarehouses other = (DbQtwarehouses) that;
        return (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getWarehousename() == null ? other.getWarehousename() == null : this.getWarehousename().equals(other.getWarehousename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getWarehousename() == null) ? 0 : getWarehousename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", warehouseid=").append(warehouseid);
        sb.append(", warehousename=").append(warehousename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}