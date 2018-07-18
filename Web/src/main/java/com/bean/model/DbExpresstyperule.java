package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbExpresstyperule implements Serializable {
    private BigDecimal sid;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal volumeweight;

    private BigDecimal volume;

    private BigDecimal bottomperimeter;

    private BigDecimal additionalcharge;

    private String sqlfilter;

    private String expresstypeid;

    private String formula;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolumeweight() {
        return volumeweight;
    }

    public void setVolumeweight(BigDecimal volumeweight) {
        this.volumeweight = volumeweight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getBottomperimeter() {
        return bottomperimeter;
    }

    public void setBottomperimeter(BigDecimal bottomperimeter) {
        this.bottomperimeter = bottomperimeter;
    }

    public BigDecimal getAdditionalcharge() {
        return additionalcharge;
    }

    public void setAdditionalcharge(BigDecimal additionalcharge) {
        this.additionalcharge = additionalcharge;
    }

    public String getSqlfilter() {
        return sqlfilter;
    }

    public void setSqlfilter(String sqlfilter) {
        this.sqlfilter = sqlfilter == null ? null : sqlfilter.trim();
    }

    public String getExpresstypeid() {
        return expresstypeid;
    }

    public void setExpresstypeid(String expresstypeid) {
        this.expresstypeid = expresstypeid == null ? null : expresstypeid.trim();
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
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
        DbExpresstyperule other = (DbExpresstyperule) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getVolumeweight() == null ? other.getVolumeweight() == null : this.getVolumeweight().equals(other.getVolumeweight()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getBottomperimeter() == null ? other.getBottomperimeter() == null : this.getBottomperimeter().equals(other.getBottomperimeter()))
            && (this.getAdditionalcharge() == null ? other.getAdditionalcharge() == null : this.getAdditionalcharge().equals(other.getAdditionalcharge()))
            && (this.getSqlfilter() == null ? other.getSqlfilter() == null : this.getSqlfilter().equals(other.getSqlfilter()))
            && (this.getExpresstypeid() == null ? other.getExpresstypeid() == null : this.getExpresstypeid().equals(other.getExpresstypeid()))
            && (this.getFormula() == null ? other.getFormula() == null : this.getFormula().equals(other.getFormula()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getVolumeweight() == null) ? 0 : getVolumeweight().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getBottomperimeter() == null) ? 0 : getBottomperimeter().hashCode());
        result = prime * result + ((getAdditionalcharge() == null) ? 0 : getAdditionalcharge().hashCode());
        result = prime * result + ((getSqlfilter() == null) ? 0 : getSqlfilter().hashCode());
        result = prime * result + ((getExpresstypeid() == null) ? 0 : getExpresstypeid().hashCode());
        result = prime * result + ((getFormula() == null) ? 0 : getFormula().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", volumeweight=").append(volumeweight);
        sb.append(", volume=").append(volume);
        sb.append(", bottomperimeter=").append(bottomperimeter);
        sb.append(", additionalcharge=").append(additionalcharge);
        sb.append(", sqlfilter=").append(sqlfilter);
        sb.append(", expresstypeid=").append(expresstypeid);
        sb.append(", formula=").append(formula);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}