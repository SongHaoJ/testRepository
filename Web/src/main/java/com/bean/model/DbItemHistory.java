package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbItemHistory implements Serializable {
    private BigDecimal sequenceid;

    private String itemid;

    private BigDecimal browsecount;

    private BigDecimal hitcount;

    private BigDecimal hitrate;

    private BigDecimal buycount;

    private BigDecimal buyrate;

    private String corpid;

    private String oper;

    private String openflag;

    private Date operime;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public BigDecimal getBrowsecount() {
        return browsecount;
    }

    public void setBrowsecount(BigDecimal browsecount) {
        this.browsecount = browsecount;
    }

    public BigDecimal getHitcount() {
        return hitcount;
    }

    public void setHitcount(BigDecimal hitcount) {
        this.hitcount = hitcount;
    }

    public BigDecimal getHitrate() {
        return hitrate;
    }

    public void setHitrate(BigDecimal hitrate) {
        this.hitrate = hitrate;
    }

    public BigDecimal getBuycount() {
        return buycount;
    }

    public void setBuycount(BigDecimal buycount) {
        this.buycount = buycount;
    }

    public BigDecimal getBuyrate() {
        return buyrate;
    }

    public void setBuyrate(BigDecimal buyrate) {
        this.buyrate = buyrate;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public Date getOperime() {
        return operime;
    }

    public void setOperime(Date operime) {
        this.operime = operime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        DbItemHistory other = (DbItemHistory) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getBrowsecount() == null ? other.getBrowsecount() == null : this.getBrowsecount().equals(other.getBrowsecount()))
            && (this.getHitcount() == null ? other.getHitcount() == null : this.getHitcount().equals(other.getHitcount()))
            && (this.getHitrate() == null ? other.getHitrate() == null : this.getHitrate().equals(other.getHitrate()))
            && (this.getBuycount() == null ? other.getBuycount() == null : this.getBuycount().equals(other.getBuycount()))
            && (this.getBuyrate() == null ? other.getBuyrate() == null : this.getBuyrate().equals(other.getBuyrate()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOperime() == null ? other.getOperime() == null : this.getOperime().equals(other.getOperime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getBrowsecount() == null) ? 0 : getBrowsecount().hashCode());
        result = prime * result + ((getHitcount() == null) ? 0 : getHitcount().hashCode());
        result = prime * result + ((getHitrate() == null) ? 0 : getHitrate().hashCode());
        result = prime * result + ((getBuycount() == null) ? 0 : getBuycount().hashCode());
        result = prime * result + ((getBuyrate() == null) ? 0 : getBuyrate().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOperime() == null) ? 0 : getOperime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", itemid=").append(itemid);
        sb.append(", browsecount=").append(browsecount);
        sb.append(", hitcount=").append(hitcount);
        sb.append(", hitrate=").append(hitrate);
        sb.append(", buycount=").append(buycount);
        sb.append(", buyrate=").append(buyrate);
        sb.append(", corpid=").append(corpid);
        sb.append(", oper=").append(oper);
        sb.append(", openflag=").append(openflag);
        sb.append(", operime=").append(operime);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}