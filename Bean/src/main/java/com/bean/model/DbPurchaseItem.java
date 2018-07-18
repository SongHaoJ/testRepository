package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchaseItem implements Serializable {
    private Long id;

    private Long orderid;

    private String groupid;

    private String productid;

    private Integer purchasenum;

    private BigDecimal purchaseprice;

    private BigDecimal purchasetotal;

    private BigDecimal purchasepricelast;

    private Integer recommendnum;

    private Integer arrivenum;

    private Integer stocknum;

    private Integer damagenum;

    private Integer overnum;

    private Short status;

    private String content;

    private String createoper;

    private Date createtime;

    private String checkoper;

    private Date checktime;

    private String oper;

    private Date opertime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(Integer purchasenum) {
        this.purchasenum = purchasenum;
    }

    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public BigDecimal getPurchasetotal() {
        return purchasetotal;
    }

    public void setPurchasetotal(BigDecimal purchasetotal) {
        this.purchasetotal = purchasetotal;
    }

    public BigDecimal getPurchasepricelast() {
        return purchasepricelast;
    }

    public void setPurchasepricelast(BigDecimal purchasepricelast) {
        this.purchasepricelast = purchasepricelast;
    }

    public Integer getRecommendnum() {
        return recommendnum;
    }

    public void setRecommendnum(Integer recommendnum) {
        this.recommendnum = recommendnum;
    }

    public Integer getArrivenum() {
        return arrivenum;
    }

    public void setArrivenum(Integer arrivenum) {
        this.arrivenum = arrivenum;
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public Integer getDamagenum() {
        return damagenum;
    }

    public void setDamagenum(Integer damagenum) {
        this.damagenum = damagenum;
    }

    public Integer getOvernum() {
        return overnum;
    }

    public void setOvernum(Integer overnum) {
        this.overnum = overnum;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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
        DbPurchaseItem other = (DbPurchaseItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getPurchasenum() == null ? other.getPurchasenum() == null : this.getPurchasenum().equals(other.getPurchasenum()))
            && (this.getPurchaseprice() == null ? other.getPurchaseprice() == null : this.getPurchaseprice().equals(other.getPurchaseprice()))
            && (this.getPurchasetotal() == null ? other.getPurchasetotal() == null : this.getPurchasetotal().equals(other.getPurchasetotal()))
            && (this.getPurchasepricelast() == null ? other.getPurchasepricelast() == null : this.getPurchasepricelast().equals(other.getPurchasepricelast()))
            && (this.getRecommendnum() == null ? other.getRecommendnum() == null : this.getRecommendnum().equals(other.getRecommendnum()))
            && (this.getArrivenum() == null ? other.getArrivenum() == null : this.getArrivenum().equals(other.getArrivenum()))
            && (this.getStocknum() == null ? other.getStocknum() == null : this.getStocknum().equals(other.getStocknum()))
            && (this.getDamagenum() == null ? other.getDamagenum() == null : this.getDamagenum().equals(other.getDamagenum()))
            && (this.getOvernum() == null ? other.getOvernum() == null : this.getOvernum().equals(other.getOvernum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getPurchasenum() == null) ? 0 : getPurchasenum().hashCode());
        result = prime * result + ((getPurchaseprice() == null) ? 0 : getPurchaseprice().hashCode());
        result = prime * result + ((getPurchasetotal() == null) ? 0 : getPurchasetotal().hashCode());
        result = prime * result + ((getPurchasepricelast() == null) ? 0 : getPurchasepricelast().hashCode());
        result = prime * result + ((getRecommendnum() == null) ? 0 : getRecommendnum().hashCode());
        result = prime * result + ((getArrivenum() == null) ? 0 : getArrivenum().hashCode());
        result = prime * result + ((getStocknum() == null) ? 0 : getStocknum().hashCode());
        result = prime * result + ((getDamagenum() == null) ? 0 : getDamagenum().hashCode());
        result = prime * result + ((getOvernum() == null) ? 0 : getOvernum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
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
        sb.append(", orderid=").append(orderid);
        sb.append(", groupid=").append(groupid);
        sb.append(", productid=").append(productid);
        sb.append(", purchasenum=").append(purchasenum);
        sb.append(", purchaseprice=").append(purchaseprice);
        sb.append(", purchasetotal=").append(purchasetotal);
        sb.append(", purchasepricelast=").append(purchasepricelast);
        sb.append(", recommendnum=").append(recommendnum);
        sb.append(", arrivenum=").append(arrivenum);
        sb.append(", stocknum=").append(stocknum);
        sb.append(", damagenum=").append(damagenum);
        sb.append(", overnum=").append(overnum);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checktime=").append(checktime);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}