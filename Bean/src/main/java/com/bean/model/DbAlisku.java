package com.bean.model;

import java.io.Serializable;

public class DbAlisku implements Serializable {
    private String skuid;

    private String spuid;

    private String sellerid;

    private String mabangsku;

    private String alisku;

    private String imgurl;

    private String name;

    private String productlink;

    private String skuinfo;

    private static final long serialVersionUID = 1L;

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid == null ? null : skuid.trim();
    }

    public String getSpuid() {
        return spuid;
    }

    public void setSpuid(String spuid) {
        this.spuid = spuid == null ? null : spuid.trim();
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid == null ? null : sellerid.trim();
    }

    public String getMabangsku() {
        return mabangsku;
    }

    public void setMabangsku(String mabangsku) {
        this.mabangsku = mabangsku == null ? null : mabangsku.trim();
    }

    public String getAlisku() {
        return alisku;
    }

    public void setAlisku(String alisku) {
        this.alisku = alisku == null ? null : alisku.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProductlink() {
        return productlink;
    }

    public void setProductlink(String productlink) {
        this.productlink = productlink == null ? null : productlink.trim();
    }

    public String getSkuinfo() {
        return skuinfo;
    }

    public void setSkuinfo(String skuinfo) {
        this.skuinfo = skuinfo == null ? null : skuinfo.trim();
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
        DbAlisku other = (DbAlisku) that;
        return (this.getSkuid() == null ? other.getSkuid() == null : this.getSkuid().equals(other.getSkuid()))
            && (this.getSpuid() == null ? other.getSpuid() == null : this.getSpuid().equals(other.getSpuid()))
            && (this.getSellerid() == null ? other.getSellerid() == null : this.getSellerid().equals(other.getSellerid()))
            && (this.getMabangsku() == null ? other.getMabangsku() == null : this.getMabangsku().equals(other.getMabangsku()))
            && (this.getAlisku() == null ? other.getAlisku() == null : this.getAlisku().equals(other.getAlisku()))
            && (this.getImgurl() == null ? other.getImgurl() == null : this.getImgurl().equals(other.getImgurl()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProductlink() == null ? other.getProductlink() == null : this.getProductlink().equals(other.getProductlink()))
            && (this.getSkuinfo() == null ? other.getSkuinfo() == null : this.getSkuinfo().equals(other.getSkuinfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSkuid() == null) ? 0 : getSkuid().hashCode());
        result = prime * result + ((getSpuid() == null) ? 0 : getSpuid().hashCode());
        result = prime * result + ((getSellerid() == null) ? 0 : getSellerid().hashCode());
        result = prime * result + ((getMabangsku() == null) ? 0 : getMabangsku().hashCode());
        result = prime * result + ((getAlisku() == null) ? 0 : getAlisku().hashCode());
        result = prime * result + ((getImgurl() == null) ? 0 : getImgurl().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProductlink() == null) ? 0 : getProductlink().hashCode());
        result = prime * result + ((getSkuinfo() == null) ? 0 : getSkuinfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuid=").append(skuid);
        sb.append(", spuid=").append(spuid);
        sb.append(", sellerid=").append(sellerid);
        sb.append(", mabangsku=").append(mabangsku);
        sb.append(", alisku=").append(alisku);
        sb.append(", imgurl=").append(imgurl);
        sb.append(", name=").append(name);
        sb.append(", productlink=").append(productlink);
        sb.append(", skuinfo=").append(skuinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}