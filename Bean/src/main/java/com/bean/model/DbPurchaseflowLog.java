package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchaseflowLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.SEQUENCEID
     *
     * @mbg.generated
     */
    private BigDecimal sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.FLOWSID
     *
     * @mbg.generated
     */
    private BigDecimal flowsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.DEVELOPSID
     *
     * @mbg.generated
     */
    private BigDecimal developsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.PRODUCTID
     *
     * @mbg.generated
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.ORDERNUM
     *
     * @mbg.generated
     */
    private BigDecimal ordernum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.STOCKPRICE
     *
     * @mbg.generated
     */
    private BigDecimal stockprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.CREATEDATE
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.CREATEOPER
     *
     * @mbg.generated
     */
    private String createoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.OPERTYPE
     *
     * @mbg.generated
     */
    private BigDecimal opertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.GROUPID
     *
     * @mbg.generated
     */
    private String groupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.STATUS
     *
     * @mbg.generated
     */
    private BigDecimal status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.LCLSID
     *
     * @mbg.generated
     */
    private BigDecimal lclsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_purchaseflow_log.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_purchaseflow_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.SEQUENCEID
     *
     * @return the value of db_purchaseflow_log.SEQUENCEID
     *
     * @mbg.generated
     */
    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.SEQUENCEID
     *
     * @param sequenceid the value for db_purchaseflow_log.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.FLOWSID
     *
     * @return the value of db_purchaseflow_log.FLOWSID
     *
     * @mbg.generated
     */
    public BigDecimal getFlowsid() {
        return flowsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.FLOWSID
     *
     * @param flowsid the value for db_purchaseflow_log.FLOWSID
     *
     * @mbg.generated
     */
    public void setFlowsid(BigDecimal flowsid) {
        this.flowsid = flowsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.DEVELOPSID
     *
     * @return the value of db_purchaseflow_log.DEVELOPSID
     *
     * @mbg.generated
     */
    public BigDecimal getDevelopsid() {
        return developsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.DEVELOPSID
     *
     * @param developsid the value for db_purchaseflow_log.DEVELOPSID
     *
     * @mbg.generated
     */
    public void setDevelopsid(BigDecimal developsid) {
        this.developsid = developsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.PRODUCTID
     *
     * @return the value of db_purchaseflow_log.PRODUCTID
     *
     * @mbg.generated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.PRODUCTID
     *
     * @param productid the value for db_purchaseflow_log.PRODUCTID
     *
     * @mbg.generated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.ORDERNUM
     *
     * @return the value of db_purchaseflow_log.ORDERNUM
     *
     * @mbg.generated
     */
    public BigDecimal getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.ORDERNUM
     *
     * @param ordernum the value for db_purchaseflow_log.ORDERNUM
     *
     * @mbg.generated
     */
    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.STOCKPRICE
     *
     * @return the value of db_purchaseflow_log.STOCKPRICE
     *
     * @mbg.generated
     */
    public BigDecimal getStockprice() {
        return stockprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.STOCKPRICE
     *
     * @param stockprice the value for db_purchaseflow_log.STOCKPRICE
     *
     * @mbg.generated
     */
    public void setStockprice(BigDecimal stockprice) {
        this.stockprice = stockprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.CREATEDATE
     *
     * @return the value of db_purchaseflow_log.CREATEDATE
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.CREATEDATE
     *
     * @param createdate the value for db_purchaseflow_log.CREATEDATE
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.CREATEOPER
     *
     * @return the value of db_purchaseflow_log.CREATEOPER
     *
     * @mbg.generated
     */
    public String getCreateoper() {
        return createoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.CREATEOPER
     *
     * @param createoper the value for db_purchaseflow_log.CREATEOPER
     *
     * @mbg.generated
     */
    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.OPERTIME
     *
     * @return the value of db_purchaseflow_log.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.OPERTIME
     *
     * @param opertime the value for db_purchaseflow_log.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.OPER
     *
     * @return the value of db_purchaseflow_log.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.OPER
     *
     * @param oper the value for db_purchaseflow_log.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.OPERTYPE
     *
     * @return the value of db_purchaseflow_log.OPERTYPE
     *
     * @mbg.generated
     */
    public BigDecimal getOpertype() {
        return opertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.OPERTYPE
     *
     * @param opertype the value for db_purchaseflow_log.OPERTYPE
     *
     * @mbg.generated
     */
    public void setOpertype(BigDecimal opertype) {
        this.opertype = opertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.GROUPID
     *
     * @return the value of db_purchaseflow_log.GROUPID
     *
     * @mbg.generated
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.GROUPID
     *
     * @param groupid the value for db_purchaseflow_log.GROUPID
     *
     * @mbg.generated
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.STATUS
     *
     * @return the value of db_purchaseflow_log.STATUS
     *
     * @mbg.generated
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.STATUS
     *
     * @param status the value for db_purchaseflow_log.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.LCLSID
     *
     * @return the value of db_purchaseflow_log.LCLSID
     *
     * @mbg.generated
     */
    public BigDecimal getLclsid() {
        return lclsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.LCLSID
     *
     * @param lclsid the value for db_purchaseflow_log.LCLSID
     *
     * @mbg.generated
     */
    public void setLclsid(BigDecimal lclsid) {
        this.lclsid = lclsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_purchaseflow_log.CONTENT
     *
     * @return the value of db_purchaseflow_log.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_purchaseflow_log.CONTENT
     *
     * @param content the value for db_purchaseflow_log.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow_log
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
        DbPurchaseflowLog other = (DbPurchaseflowLog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getFlowsid() == null ? other.getFlowsid() == null : this.getFlowsid().equals(other.getFlowsid()))
            && (this.getDevelopsid() == null ? other.getDevelopsid() == null : this.getDevelopsid().equals(other.getDevelopsid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getStockprice() == null ? other.getStockprice() == null : this.getStockprice().equals(other.getStockprice()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLclsid() == null ? other.getLclsid() == null : this.getLclsid().equals(other.getLclsid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getFlowsid() == null) ? 0 : getFlowsid().hashCode());
        result = prime * result + ((getDevelopsid() == null) ? 0 : getDevelopsid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getStockprice() == null) ? 0 : getStockprice().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLclsid() == null) ? 0 : getLclsid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", flowsid=").append(flowsid);
        sb.append(", developsid=").append(developsid);
        sb.append(", productid=").append(productid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", stockprice=").append(stockprice);
        sb.append(", createdate=").append(createdate);
        sb.append(", createoper=").append(createoper);
        sb.append(", opertime=").append(opertime);
        sb.append(", oper=").append(oper);
        sb.append(", opertype=").append(opertype);
        sb.append(", groupid=").append(groupid);
        sb.append(", status=").append(status);
        sb.append(", lclsid=").append(lclsid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}