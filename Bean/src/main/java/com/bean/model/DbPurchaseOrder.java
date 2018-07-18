package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchaseOrder implements Serializable {
    private Long id;

    private String groupid;

    private String manufactoryid;

    private String manufactoryname;

    private Integer productnum;

    private BigDecimal productmoney;

    private BigDecimal expressmoney;

    private BigDecimal totalmoney;

    private Short paymethod;

    private String expressid;

    private Date expectarrivetime;

    private Short status;

    private String purchaseoper;

    private String storageid;

    private String storagename;

    private String content;

    private String createoper;

    private Date createtime;

    private String checkoper;

    private Date checktime;

    private String traceoper;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getManufactoryid() {
        return manufactoryid;
    }

    public void setManufactoryid(String manufactoryid) {
        this.manufactoryid = manufactoryid == null ? null : manufactoryid.trim();
    }

    public String getManufactoryname() {
        return manufactoryname;
    }

    public void setManufactoryname(String manufactoryname) {
        this.manufactoryname = manufactoryname == null ? null : manufactoryname.trim();
    }

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    public BigDecimal getProductmoney() {
        return productmoney;
    }

    public void setProductmoney(BigDecimal productmoney) {
        this.productmoney = productmoney;
    }

    public BigDecimal getExpressmoney() {
        return expressmoney;
    }

    public void setExpressmoney(BigDecimal expressmoney) {
        this.expressmoney = expressmoney;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Short getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(Short paymethod) {
        this.paymethod = paymethod;
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public Date getExpectarrivetime() {
        return expectarrivetime;
    }

    public void setExpectarrivetime(Date expectarrivetime) {
        this.expectarrivetime = expectarrivetime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid == null ? null : storageid.trim();
    }

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename == null ? null : storagename.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getTraceoper() {
        return traceoper;
    }

    public void setTraceoper(String traceoper) {
        this.traceoper = traceoper == null ? null : traceoper.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
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
        DbPurchaseOrder other = (DbPurchaseOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getManufactoryid() == null ? other.getManufactoryid() == null : this.getManufactoryid().equals(other.getManufactoryid()))
            && (this.getManufactoryname() == null ? other.getManufactoryname() == null : this.getManufactoryname().equals(other.getManufactoryname()))
            && (this.getProductnum() == null ? other.getProductnum() == null : this.getProductnum().equals(other.getProductnum()))
            && (this.getProductmoney() == null ? other.getProductmoney() == null : this.getProductmoney().equals(other.getProductmoney()))
            && (this.getExpressmoney() == null ? other.getExpressmoney() == null : this.getExpressmoney().equals(other.getExpressmoney()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getPaymethod() == null ? other.getPaymethod() == null : this.getPaymethod().equals(other.getPaymethod()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getExpectarrivetime() == null ? other.getExpectarrivetime() == null : this.getExpectarrivetime().equals(other.getExpectarrivetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStoragename() == null ? other.getStoragename() == null : this.getStoragename().equals(other.getStoragename()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getTraceoper() == null ? other.getTraceoper() == null : this.getTraceoper().equals(other.getTraceoper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getManufactoryid() == null) ? 0 : getManufactoryid().hashCode());
        result = prime * result + ((getManufactoryname() == null) ? 0 : getManufactoryname().hashCode());
        result = prime * result + ((getProductnum() == null) ? 0 : getProductnum().hashCode());
        result = prime * result + ((getProductmoney() == null) ? 0 : getProductmoney().hashCode());
        result = prime * result + ((getExpressmoney() == null) ? 0 : getExpressmoney().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getPaymethod() == null) ? 0 : getPaymethod().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getExpectarrivetime() == null) ? 0 : getExpectarrivetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStoragename() == null) ? 0 : getStoragename().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getTraceoper() == null) ? 0 : getTraceoper().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupid=").append(groupid);
        sb.append(", manufactoryid=").append(manufactoryid);
        sb.append(", manufactoryname=").append(manufactoryname);
        sb.append(", productnum=").append(productnum);
        sb.append(", productmoney=").append(productmoney);
        sb.append(", expressmoney=").append(expressmoney);
        sb.append(", totalmoney=").append(totalmoney);
        sb.append(", paymethod=").append(paymethod);
        sb.append(", expressid=").append(expressid);
        sb.append(", expectarrivetime=").append(expectarrivetime);
        sb.append(", status=").append(status);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", storageid=").append(storageid);
        sb.append(", storagename=").append(storagename);
        sb.append(", content=").append(content);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checktime=").append(checktime);
        sb.append(", traceoper=").append(traceoper);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}