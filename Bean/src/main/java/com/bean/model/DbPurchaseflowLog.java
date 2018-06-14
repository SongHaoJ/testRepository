package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchaseflowLog implements Serializable {
    private BigDecimal sequenceid;

    private BigDecimal flowsid;

    private BigDecimal developsid;

    private String productid;

    private BigDecimal ordernum;

    private BigDecimal stockprice;

    private Date createdate;

    private String createoper;

    private Date opertime;

    private String oper;

    private BigDecimal opertype;

    private String groupid;

    private BigDecimal status;

    private BigDecimal lclsid;

    private String content;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public BigDecimal getFlowsid() {
        return flowsid;
    }

    public void setFlowsid(BigDecimal flowsid) {
        this.flowsid = flowsid;
    }

    public BigDecimal getDevelopsid() {
        return developsid;
    }

    public void setDevelopsid(BigDecimal developsid) {
        this.developsid = developsid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getStockprice() {
        return stockprice;
    }

    public void setStockprice(BigDecimal stockprice) {
        this.stockprice = stockprice;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getOpertype() {
        return opertype;
    }

    public void setOpertype(BigDecimal opertype) {
        this.opertype = opertype;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getLclsid() {
        return lclsid;
    }

    public void setLclsid(BigDecimal lclsid) {
        this.lclsid = lclsid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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