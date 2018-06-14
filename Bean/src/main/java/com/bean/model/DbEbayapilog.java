package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbayapilog implements Serializable {
    private String sequenceid;

    private String sid;

    private String name;

    private String oper;

    private Date opertime;

    private String corpid;

    private String openflag;

    private String shoptypeid;

    private String shoptypename;

    private String apitime;

    private Date lastapitime;

    private BigDecimal ordernum;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private BigDecimal daydiff;

    private String apiflag;

    private String daytype;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public String getShoptypename() {
        return shoptypename;
    }

    public void setShoptypename(String shoptypename) {
        this.shoptypename = shoptypename == null ? null : shoptypename.trim();
    }

    public String getApitime() {
        return apitime;
    }

    public void setApitime(String apitime) {
        this.apitime = apitime == null ? null : apitime.trim();
    }

    public Date getLastapitime() {
        return lastapitime;
    }

    public void setLastapitime(Date lastapitime) {
        this.lastapitime = lastapitime;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    public BigDecimal getDaydiff() {
        return daydiff;
    }

    public void setDaydiff(BigDecimal daydiff) {
        this.daydiff = daydiff;
    }

    public String getApiflag() {
        return apiflag;
    }

    public void setApiflag(String apiflag) {
        this.apiflag = apiflag == null ? null : apiflag.trim();
    }

    public String getDaytype() {
        return daytype;
    }

    public void setDaytype(String daytype) {
        this.daytype = daytype == null ? null : daytype.trim();
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
        DbEbayapilog other = (DbEbayapilog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptypename() == null ? other.getShoptypename() == null : this.getShoptypename().equals(other.getShoptypename()))
            && (this.getApitime() == null ? other.getApitime() == null : this.getApitime().equals(other.getApitime()))
            && (this.getLastapitime() == null ? other.getLastapitime() == null : this.getLastapitime().equals(other.getLastapitime()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getDaydiff() == null ? other.getDaydiff() == null : this.getDaydiff().equals(other.getDaydiff()))
            && (this.getApiflag() == null ? other.getApiflag() == null : this.getApiflag().equals(other.getApiflag()))
            && (this.getDaytype() == null ? other.getDaytype() == null : this.getDaytype().equals(other.getDaytype()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptypename() == null) ? 0 : getShoptypename().hashCode());
        result = prime * result + ((getApitime() == null) ? 0 : getApitime().hashCode());
        result = prime * result + ((getLastapitime() == null) ? 0 : getLastapitime().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getDaydiff() == null) ? 0 : getDaydiff().hashCode());
        result = prime * result + ((getApiflag() == null) ? 0 : getApiflag().hashCode());
        result = prime * result + ((getDaytype() == null) ? 0 : getDaytype().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", sid=").append(sid);
        sb.append(", name=").append(name);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptypename=").append(shoptypename);
        sb.append(", apitime=").append(apitime);
        sb.append(", lastapitime=").append(lastapitime);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", daydiff=").append(daydiff);
        sb.append(", apiflag=").append(apiflag);
        sb.append(", daytype=").append(daytype);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}