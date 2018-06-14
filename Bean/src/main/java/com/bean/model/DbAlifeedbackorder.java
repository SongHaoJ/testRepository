package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbAlifeedbackorder implements Serializable {
    private String tradeid;

    private Date feedbacktime;

    private String flag;

    private String shopid;

    private String updateflag;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(String updateflag) {
        this.updateflag = updateflag == null ? null : updateflag.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbAlifeedbackorder other = (DbAlifeedbackorder) that;
        return (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getFeedbacktime() == null ? other.getFeedbacktime() == null : this.getFeedbacktime().equals(other.getFeedbacktime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getFeedbacktime() == null) ? 0 : getFeedbacktime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tradeid=").append(tradeid);
        sb.append(", feedbacktime=").append(feedbacktime);
        sb.append(", flag=").append(flag);
        sb.append(", shopid=").append(shopid);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}