package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbShopdowntimeconfig implements Serializable {
    private String shopid;

    private Date starttime;

    private Date endtime;

    private String startrun;

    private String stoprun;

    private Short runmode;

    private Short downflag;

    private static final long serialVersionUID = 1L;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStartrun() {
        return startrun;
    }

    public void setStartrun(String startrun) {
        this.startrun = startrun == null ? null : startrun.trim();
    }

    public String getStoprun() {
        return stoprun;
    }

    public void setStoprun(String stoprun) {
        this.stoprun = stoprun == null ? null : stoprun.trim();
    }

    public Short getRunmode() {
        return runmode;
    }

    public void setRunmode(Short runmode) {
        this.runmode = runmode;
    }

    public Short getDownflag() {
        return downflag;
    }

    public void setDownflag(Short downflag) {
        this.downflag = downflag;
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
        DbShopdowntimeconfig other = (DbShopdowntimeconfig) that;
        return (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getStartrun() == null ? other.getStartrun() == null : this.getStartrun().equals(other.getStartrun()))
            && (this.getStoprun() == null ? other.getStoprun() == null : this.getStoprun().equals(other.getStoprun()))
            && (this.getRunmode() == null ? other.getRunmode() == null : this.getRunmode().equals(other.getRunmode()))
            && (this.getDownflag() == null ? other.getDownflag() == null : this.getDownflag().equals(other.getDownflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getStartrun() == null) ? 0 : getStartrun().hashCode());
        result = prime * result + ((getStoprun() == null) ? 0 : getStoprun().hashCode());
        result = prime * result + ((getRunmode() == null) ? 0 : getRunmode().hashCode());
        result = prime * result + ((getDownflag() == null) ? 0 : getDownflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopid=").append(shopid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", startrun=").append(startrun);
        sb.append(", stoprun=").append(stoprun);
        sb.append(", runmode=").append(runmode);
        sb.append(", downflag=").append(downflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}