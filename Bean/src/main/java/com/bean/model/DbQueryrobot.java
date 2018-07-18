package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbQueryrobot implements Serializable {
    private String orderid;

    private String expressid;

    private String content;

    private Date updatetime;

    private BigDecimal sendflag;

    private BigDecimal openflag;

    private String mabangexpress;

    private String packagestatus;

    private BigDecimal lastruntime;

    private String internalcontent;

    private String searchstatus;

    private String trackexpress;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getSendflag() {
        return sendflag;
    }

    public void setSendflag(BigDecimal sendflag) {
        this.sendflag = sendflag;
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public String getMabangexpress() {
        return mabangexpress;
    }

    public void setMabangexpress(String mabangexpress) {
        this.mabangexpress = mabangexpress == null ? null : mabangexpress.trim();
    }

    public String getPackagestatus() {
        return packagestatus;
    }

    public void setPackagestatus(String packagestatus) {
        this.packagestatus = packagestatus == null ? null : packagestatus.trim();
    }

    public BigDecimal getLastruntime() {
        return lastruntime;
    }

    public void setLastruntime(BigDecimal lastruntime) {
        this.lastruntime = lastruntime;
    }

    public String getInternalcontent() {
        return internalcontent;
    }

    public void setInternalcontent(String internalcontent) {
        this.internalcontent = internalcontent == null ? null : internalcontent.trim();
    }

    public String getSearchstatus() {
        return searchstatus;
    }

    public void setSearchstatus(String searchstatus) {
        this.searchstatus = searchstatus == null ? null : searchstatus.trim();
    }

    public String getTrackexpress() {
        return trackexpress;
    }

    public void setTrackexpress(String trackexpress) {
        this.trackexpress = trackexpress == null ? null : trackexpress.trim();
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
        DbQueryrobot other = (DbQueryrobot) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getSendflag() == null ? other.getSendflag() == null : this.getSendflag().equals(other.getSendflag()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getMabangexpress() == null ? other.getMabangexpress() == null : this.getMabangexpress().equals(other.getMabangexpress()))
            && (this.getPackagestatus() == null ? other.getPackagestatus() == null : this.getPackagestatus().equals(other.getPackagestatus()))
            && (this.getLastruntime() == null ? other.getLastruntime() == null : this.getLastruntime().equals(other.getLastruntime()))
            && (this.getInternalcontent() == null ? other.getInternalcontent() == null : this.getInternalcontent().equals(other.getInternalcontent()))
            && (this.getSearchstatus() == null ? other.getSearchstatus() == null : this.getSearchstatus().equals(other.getSearchstatus()))
            && (this.getTrackexpress() == null ? other.getTrackexpress() == null : this.getTrackexpress().equals(other.getTrackexpress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getSendflag() == null) ? 0 : getSendflag().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getMabangexpress() == null) ? 0 : getMabangexpress().hashCode());
        result = prime * result + ((getPackagestatus() == null) ? 0 : getPackagestatus().hashCode());
        result = prime * result + ((getLastruntime() == null) ? 0 : getLastruntime().hashCode());
        result = prime * result + ((getInternalcontent() == null) ? 0 : getInternalcontent().hashCode());
        result = prime * result + ((getSearchstatus() == null) ? 0 : getSearchstatus().hashCode());
        result = prime * result + ((getTrackexpress() == null) ? 0 : getTrackexpress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", expressid=").append(expressid);
        sb.append(", content=").append(content);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", sendflag=").append(sendflag);
        sb.append(", openflag=").append(openflag);
        sb.append(", mabangexpress=").append(mabangexpress);
        sb.append(", packagestatus=").append(packagestatus);
        sb.append(", lastruntime=").append(lastruntime);
        sb.append(", internalcontent=").append(internalcontent);
        sb.append(", searchstatus=").append(searchstatus);
        sb.append(", trackexpress=").append(trackexpress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}