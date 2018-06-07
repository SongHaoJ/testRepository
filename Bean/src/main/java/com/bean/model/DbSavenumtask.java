package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSavenumtask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.ID
     *
     * @mbg.generated
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.SOURCEID
     *
     * @mbg.generated
     */
    private String sourceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.QUANTITY
     *
     * @mbg.generated
     */
    private Long quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.COSTPRICE
     *
     * @mbg.generated
     */
    private BigDecimal costprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.TYPE
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.CHANGE
     *
     * @mbg.generated
     */
    private String change;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.RELATIONID
     *
     * @mbg.generated
     */
    private String relationid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_savenumtask.ORIGINDESCR
     *
     * @mbg.generated
     */
    private String origindescr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.ID
     *
     * @return the value of db_savenumtask.ID
     *
     * @mbg.generated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.ID
     *
     * @param id the value for db_savenumtask.ID
     *
     * @mbg.generated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.SOURCEID
     *
     * @return the value of db_savenumtask.SOURCEID
     *
     * @mbg.generated
     */
    public String getSourceid() {
        return sourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.SOURCEID
     *
     * @param sourceid the value for db_savenumtask.SOURCEID
     *
     * @mbg.generated
     */
    public void setSourceid(String sourceid) {
        this.sourceid = sourceid == null ? null : sourceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.PRODUCTID
     *
     * @return the value of db_savenumtask.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.PRODUCTID
     *
     * @param productid the value for db_savenumtask.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.QUANTITY
     *
     * @return the value of db_savenumtask.QUANTITY
     *
     * @mbg.generated
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.QUANTITY
     *
     * @param quantity the value for db_savenumtask.QUANTITY
     *
     * @mbg.generated
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.COSTPRICE
     *
     * @return the value of db_savenumtask.COSTPRICE
     *
     * @mbg.generated
     */
    public BigDecimal getCostprice() {
        return costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.COSTPRICE
     *
     * @param costprice the value for db_savenumtask.COSTPRICE
     *
     * @mbg.generated
     */
    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.TYPE
     *
     * @return the value of db_savenumtask.TYPE
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.TYPE
     *
     * @param type the value for db_savenumtask.TYPE
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.OPER
     *
     * @return the value of db_savenumtask.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.OPER
     *
     * @param oper the value for db_savenumtask.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.CREATETIME
     *
     * @return the value of db_savenumtask.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.CREATETIME
     *
     * @param createtime the value for db_savenumtask.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.CHANGE
     *
     * @return the value of db_savenumtask.CHANGE
     *
     * @mbg.generated
     */
    public String getChange() {
        return change;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.CHANGE
     *
     * @param change the value for db_savenumtask.CHANGE
     *
     * @mbg.generated
     */
    public void setChange(String change) {
        this.change = change == null ? null : change.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.RELATIONID
     *
     * @return the value of db_savenumtask.RELATIONID
     *
     * @mbg.generated
     */
    public String getRelationid() {
        return relationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.RELATIONID
     *
     * @param relationid the value for db_savenumtask.RELATIONID
     *
     * @mbg.generated
     */
    public void setRelationid(String relationid) {
        this.relationid = relationid == null ? null : relationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_savenumtask.ORIGINDESCR
     *
     * @return the value of db_savenumtask.ORIGINDESCR
     *
     * @mbg.generated
     */
    public String getOrigindescr() {
        return origindescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_savenumtask.ORIGINDESCR
     *
     * @param origindescr the value for db_savenumtask.ORIGINDESCR
     *
     * @mbg.generated
     */
    public void setOrigindescr(String origindescr) {
        this.origindescr = origindescr == null ? null : origindescr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
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
        DbSavenumtask other = (DbSavenumtask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSourceid() == null ? other.getSourceid() == null : this.getSourceid().equals(other.getSourceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getChange() == null ? other.getChange() == null : this.getChange().equals(other.getChange()))
            && (this.getRelationid() == null ? other.getRelationid() == null : this.getRelationid().equals(other.getRelationid()))
            && (this.getOrigindescr() == null ? other.getOrigindescr() == null : this.getOrigindescr().equals(other.getOrigindescr()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSourceid() == null) ? 0 : getSourceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getChange() == null) ? 0 : getChange().hashCode());
        result = prime * result + ((getRelationid() == null) ? 0 : getRelationid().hashCode());
        result = prime * result + ((getOrigindescr() == null) ? 0 : getOrigindescr().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", productid=").append(productid);
        sb.append(", quantity=").append(quantity);
        sb.append(", costprice=").append(costprice);
        sb.append(", type=").append(type);
        sb.append(", oper=").append(oper);
        sb.append(", createtime=").append(createtime);
        sb.append(", change=").append(change);
        sb.append(", relationid=").append(relationid);
        sb.append(", origindescr=").append(origindescr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}