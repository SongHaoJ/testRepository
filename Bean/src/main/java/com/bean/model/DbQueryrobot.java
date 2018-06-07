package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbQueryrobot implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.ORDERID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.EXPRESSID
     *
     * @mbg.generated
     */
    private String expressid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.UPDATETIME
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.SENDFLAG
     *
     * @mbg.generated
     */
    private BigDecimal sendflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.OPENFLAG
     *
     * @mbg.generated
     */
    private BigDecimal openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.MABANGEXPRESS
     *
     * @mbg.generated
     */
    private String mabangexpress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.PACKAGESTATUS
     *
     * @mbg.generated
     */
    private String packagestatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.LASTRUNTIME
     *
     * @mbg.generated
     */
    private BigDecimal lastruntime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.SEARCHSTATUS
     *
     * @mbg.generated
     */
    private String searchstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.TRACKEXPRESS
     *
     * @mbg.generated
     */
    private String trackexpress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_queryrobot.INTERNALCONTENT
     *
     * @mbg.generated
     */
    private String internalcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_queryrobot
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.ORDERID
     *
     * @return the value of db_queryrobot.ORDERID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.ORDERID
     *
     * @param orderid the value for db_queryrobot.ORDERID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.EXPRESSID
     *
     * @return the value of db_queryrobot.EXPRESSID
     *
     * @mbg.generated
     */
    public String getExpressid() {
        return expressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.EXPRESSID
     *
     * @param expressid the value for db_queryrobot.EXPRESSID
     *
     * @mbg.generated
     */
    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.UPDATETIME
     *
     * @return the value of db_queryrobot.UPDATETIME
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.UPDATETIME
     *
     * @param updatetime the value for db_queryrobot.UPDATETIME
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.SENDFLAG
     *
     * @return the value of db_queryrobot.SENDFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getSendflag() {
        return sendflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.SENDFLAG
     *
     * @param sendflag the value for db_queryrobot.SENDFLAG
     *
     * @mbg.generated
     */
    public void setSendflag(BigDecimal sendflag) {
        this.sendflag = sendflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.OPENFLAG
     *
     * @return the value of db_queryrobot.OPENFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.OPENFLAG
     *
     * @param openflag the value for db_queryrobot.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.MABANGEXPRESS
     *
     * @return the value of db_queryrobot.MABANGEXPRESS
     *
     * @mbg.generated
     */
    public String getMabangexpress() {
        return mabangexpress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.MABANGEXPRESS
     *
     * @param mabangexpress the value for db_queryrobot.MABANGEXPRESS
     *
     * @mbg.generated
     */
    public void setMabangexpress(String mabangexpress) {
        this.mabangexpress = mabangexpress == null ? null : mabangexpress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.PACKAGESTATUS
     *
     * @return the value of db_queryrobot.PACKAGESTATUS
     *
     * @mbg.generated
     */
    public String getPackagestatus() {
        return packagestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.PACKAGESTATUS
     *
     * @param packagestatus the value for db_queryrobot.PACKAGESTATUS
     *
     * @mbg.generated
     */
    public void setPackagestatus(String packagestatus) {
        this.packagestatus = packagestatus == null ? null : packagestatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.LASTRUNTIME
     *
     * @return the value of db_queryrobot.LASTRUNTIME
     *
     * @mbg.generated
     */
    public BigDecimal getLastruntime() {
        return lastruntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.LASTRUNTIME
     *
     * @param lastruntime the value for db_queryrobot.LASTRUNTIME
     *
     * @mbg.generated
     */
    public void setLastruntime(BigDecimal lastruntime) {
        this.lastruntime = lastruntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.SEARCHSTATUS
     *
     * @return the value of db_queryrobot.SEARCHSTATUS
     *
     * @mbg.generated
     */
    public String getSearchstatus() {
        return searchstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.SEARCHSTATUS
     *
     * @param searchstatus the value for db_queryrobot.SEARCHSTATUS
     *
     * @mbg.generated
     */
    public void setSearchstatus(String searchstatus) {
        this.searchstatus = searchstatus == null ? null : searchstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.TRACKEXPRESS
     *
     * @return the value of db_queryrobot.TRACKEXPRESS
     *
     * @mbg.generated
     */
    public String getTrackexpress() {
        return trackexpress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.TRACKEXPRESS
     *
     * @param trackexpress the value for db_queryrobot.TRACKEXPRESS
     *
     * @mbg.generated
     */
    public void setTrackexpress(String trackexpress) {
        this.trackexpress = trackexpress == null ? null : trackexpress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.CONTENT
     *
     * @return the value of db_queryrobot.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.CONTENT
     *
     * @param content the value for db_queryrobot.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_queryrobot.INTERNALCONTENT
     *
     * @return the value of db_queryrobot.INTERNALCONTENT
     *
     * @mbg.generated
     */
    public String getInternalcontent() {
        return internalcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_queryrobot.INTERNALCONTENT
     *
     * @param internalcontent the value for db_queryrobot.INTERNALCONTENT
     *
     * @mbg.generated
     */
    public void setInternalcontent(String internalcontent) {
        this.internalcontent = internalcontent == null ? null : internalcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_queryrobot
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
        DbQueryrobot other = (DbQueryrobot) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getSendflag() == null ? other.getSendflag() == null : this.getSendflag().equals(other.getSendflag()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getMabangexpress() == null ? other.getMabangexpress() == null : this.getMabangexpress().equals(other.getMabangexpress()))
            && (this.getPackagestatus() == null ? other.getPackagestatus() == null : this.getPackagestatus().equals(other.getPackagestatus()))
            && (this.getLastruntime() == null ? other.getLastruntime() == null : this.getLastruntime().equals(other.getLastruntime()))
            && (this.getSearchstatus() == null ? other.getSearchstatus() == null : this.getSearchstatus().equals(other.getSearchstatus()))
            && (this.getTrackexpress() == null ? other.getTrackexpress() == null : this.getTrackexpress().equals(other.getTrackexpress()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getInternalcontent() == null ? other.getInternalcontent() == null : this.getInternalcontent().equals(other.getInternalcontent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_queryrobot
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getSendflag() == null) ? 0 : getSendflag().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getMabangexpress() == null) ? 0 : getMabangexpress().hashCode());
        result = prime * result + ((getPackagestatus() == null) ? 0 : getPackagestatus().hashCode());
        result = prime * result + ((getLastruntime() == null) ? 0 : getLastruntime().hashCode());
        result = prime * result + ((getSearchstatus() == null) ? 0 : getSearchstatus().hashCode());
        result = prime * result + ((getTrackexpress() == null) ? 0 : getTrackexpress().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getInternalcontent() == null) ? 0 : getInternalcontent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_queryrobot
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", expressid=").append(expressid);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", sendflag=").append(sendflag);
        sb.append(", openflag=").append(openflag);
        sb.append(", mabangexpress=").append(mabangexpress);
        sb.append(", packagestatus=").append(packagestatus);
        sb.append(", lastruntime=").append(lastruntime);
        sb.append(", searchstatus=").append(searchstatus);
        sb.append(", trackexpress=").append(trackexpress);
        sb.append(", content=").append(content);
        sb.append(", internalcontent=").append(internalcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}