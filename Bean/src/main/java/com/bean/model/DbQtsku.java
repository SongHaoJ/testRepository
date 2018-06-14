package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbQtsku implements Serializable {
    private String qtsku;

    private String refsku;

    private String name;

    private String standard;

    private String sort;

    private String unit;

    private BigDecimal netweight;

    private BigDecimal gw;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private String customnamecn;

    private String customnameen;

    private String customhscode;

    private String origin;

    private String currency;

    private String unitprice;

    private Date updatetime;

    private String warehouseid;

    private String warehousename;

    private Integer skustock;

    private Integer availablestock;

    private String errflag;

    private String errdesc;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getQtsku() {
        return qtsku;
    }

    public void setQtsku(String qtsku) {
        this.qtsku = qtsku == null ? null : qtsku.trim();
    }

    public String getRefsku() {
        return refsku;
    }

    public void setRefsku(String refsku) {
        this.refsku = refsku == null ? null : refsku.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getNetweight() {
        return netweight;
    }

    public void setNetweight(BigDecimal netweight) {
        this.netweight = netweight;
    }

    public BigDecimal getGw() {
        return gw;
    }

    public void setGw(BigDecimal gw) {
        this.gw = gw;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getCustomnamecn() {
        return customnamecn;
    }

    public void setCustomnamecn(String customnamecn) {
        this.customnamecn = customnamecn == null ? null : customnamecn.trim();
    }

    public String getCustomnameen() {
        return customnameen;
    }

    public void setCustomnameen(String customnameen) {
        this.customnameen = customnameen == null ? null : customnameen.trim();
    }

    public String getCustomhscode() {
        return customhscode;
    }

    public void setCustomhscode(String customhscode) {
        this.customhscode = customhscode == null ? null : customhscode.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice == null ? null : unitprice.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

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

    public Integer getSkustock() {
        return skustock;
    }

    public void setSkustock(Integer skustock) {
        this.skustock = skustock;
    }

    public Integer getAvailablestock() {
        return availablestock;
    }

    public void setAvailablestock(Integer availablestock) {
        this.availablestock = availablestock;
    }

    public String getErrflag() {
        return errflag;
    }

    public void setErrflag(String errflag) {
        this.errflag = errflag == null ? null : errflag.trim();
    }

    public String getErrdesc() {
        return errdesc;
    }

    public void setErrdesc(String errdesc) {
        this.errdesc = errdesc == null ? null : errdesc.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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
        DbQtsku other = (DbQtsku) that;
        return (this.getQtsku() == null ? other.getQtsku() == null : this.getQtsku().equals(other.getQtsku()))
            && (this.getRefsku() == null ? other.getRefsku() == null : this.getRefsku().equals(other.getRefsku()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStandard() == null ? other.getStandard() == null : this.getStandard().equals(other.getStandard()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getNetweight() == null ? other.getNetweight() == null : this.getNetweight().equals(other.getNetweight()))
            && (this.getGw() == null ? other.getGw() == null : this.getGw().equals(other.getGw()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getCustomnamecn() == null ? other.getCustomnamecn() == null : this.getCustomnamecn().equals(other.getCustomnamecn()))
            && (this.getCustomnameen() == null ? other.getCustomnameen() == null : this.getCustomnameen().equals(other.getCustomnameen()))
            && (this.getCustomhscode() == null ? other.getCustomhscode() == null : this.getCustomhscode().equals(other.getCustomhscode()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getUnitprice() == null ? other.getUnitprice() == null : this.getUnitprice().equals(other.getUnitprice()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getWarehousename() == null ? other.getWarehousename() == null : this.getWarehousename().equals(other.getWarehousename()))
            && (this.getSkustock() == null ? other.getSkustock() == null : this.getSkustock().equals(other.getSkustock()))
            && (this.getAvailablestock() == null ? other.getAvailablestock() == null : this.getAvailablestock().equals(other.getAvailablestock()))
            && (this.getErrflag() == null ? other.getErrflag() == null : this.getErrflag().equals(other.getErrflag()))
            && (this.getErrdesc() == null ? other.getErrdesc() == null : this.getErrdesc().equals(other.getErrdesc()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQtsku() == null) ? 0 : getQtsku().hashCode());
        result = prime * result + ((getRefsku() == null) ? 0 : getRefsku().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStandard() == null) ? 0 : getStandard().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getNetweight() == null) ? 0 : getNetweight().hashCode());
        result = prime * result + ((getGw() == null) ? 0 : getGw().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getCustomnamecn() == null) ? 0 : getCustomnamecn().hashCode());
        result = prime * result + ((getCustomnameen() == null) ? 0 : getCustomnameen().hashCode());
        result = prime * result + ((getCustomhscode() == null) ? 0 : getCustomhscode().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getUnitprice() == null) ? 0 : getUnitprice().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getWarehousename() == null) ? 0 : getWarehousename().hashCode());
        result = prime * result + ((getSkustock() == null) ? 0 : getSkustock().hashCode());
        result = prime * result + ((getAvailablestock() == null) ? 0 : getAvailablestock().hashCode());
        result = prime * result + ((getErrflag() == null) ? 0 : getErrflag().hashCode());
        result = prime * result + ((getErrdesc() == null) ? 0 : getErrdesc().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qtsku=").append(qtsku);
        sb.append(", refsku=").append(refsku);
        sb.append(", name=").append(name);
        sb.append(", standard=").append(standard);
        sb.append(", sort=").append(sort);
        sb.append(", unit=").append(unit);
        sb.append(", netweight=").append(netweight);
        sb.append(", gw=").append(gw);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", customnamecn=").append(customnamecn);
        sb.append(", customnameen=").append(customnameen);
        sb.append(", customhscode=").append(customhscode);
        sb.append(", origin=").append(origin);
        sb.append(", currency=").append(currency);
        sb.append(", unitprice=").append(unitprice);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", warehouseid=").append(warehouseid);
        sb.append(", warehousename=").append(warehousename);
        sb.append(", skustock=").append(skustock);
        sb.append(", availablestock=").append(availablestock);
        sb.append(", errflag=").append(errflag);
        sb.append(", errdesc=").append(errdesc);
        sb.append(", userid=").append(userid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}