package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbShopifyitem implements Serializable {
    private Long sid;

    private Long id;

    private String orderid;

    private String variantId;

    private String title;

    private Integer quantity;

    private BigDecimal price;

    private String sku;

    private String variantTitle;

    private String fulfillmentService;

    private String productId;

    private String requiresShipping;

    private String giftCard;

    private String name;

    private BigDecimal totalDiscount;

    private String pictureUrl;

    private static final long serialVersionUID = 1L;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId == null ? null : variantId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getVariantTitle() {
        return variantTitle;
    }

    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle == null ? null : variantTitle.trim();
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService == null ? null : fulfillmentService.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getRequiresShipping() {
        return requiresShipping;
    }

    public void setRequiresShipping(String requiresShipping) {
        this.requiresShipping = requiresShipping == null ? null : requiresShipping.trim();
    }

    public String getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(String giftCard) {
        this.giftCard = giftCard == null ? null : giftCard.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
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
        DbShopifyitem other = (DbShopifyitem) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getVariantId() == null ? other.getVariantId() == null : this.getVariantId().equals(other.getVariantId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getVariantTitle() == null ? other.getVariantTitle() == null : this.getVariantTitle().equals(other.getVariantTitle()))
            && (this.getFulfillmentService() == null ? other.getFulfillmentService() == null : this.getFulfillmentService().equals(other.getFulfillmentService()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getRequiresShipping() == null ? other.getRequiresShipping() == null : this.getRequiresShipping().equals(other.getRequiresShipping()))
            && (this.getGiftCard() == null ? other.getGiftCard() == null : this.getGiftCard().equals(other.getGiftCard()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTotalDiscount() == null ? other.getTotalDiscount() == null : this.getTotalDiscount().equals(other.getTotalDiscount()))
            && (this.getPictureUrl() == null ? other.getPictureUrl() == null : this.getPictureUrl().equals(other.getPictureUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getVariantId() == null) ? 0 : getVariantId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getVariantTitle() == null) ? 0 : getVariantTitle().hashCode());
        result = prime * result + ((getFulfillmentService() == null) ? 0 : getFulfillmentService().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getRequiresShipping() == null) ? 0 : getRequiresShipping().hashCode());
        result = prime * result + ((getGiftCard() == null) ? 0 : getGiftCard().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTotalDiscount() == null) ? 0 : getTotalDiscount().hashCode());
        result = prime * result + ((getPictureUrl() == null) ? 0 : getPictureUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", variantId=").append(variantId);
        sb.append(", title=").append(title);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", sku=").append(sku);
        sb.append(", variantTitle=").append(variantTitle);
        sb.append(", fulfillmentService=").append(fulfillmentService);
        sb.append(", productId=").append(productId);
        sb.append(", requiresShipping=").append(requiresShipping);
        sb.append(", giftCard=").append(giftCard);
        sb.append(", name=").append(name);
        sb.append(", totalDiscount=").append(totalDiscount);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}