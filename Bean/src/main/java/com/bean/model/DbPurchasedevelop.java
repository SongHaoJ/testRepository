package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchasedevelop implements Serializable {
    private String sequenceid;

    private String groupid;

    private String manufactureid;

    private String paytype;

    private BigDecimal freight;

    private String oper;

    private Date opertime;

    private String creatoper;

    private Date creatopertime;

    private String corpid;

    private String openflag;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private BigDecimal status;

    private BigDecimal weightamount;

    private BigDecimal moneyamount;

    private String trackingnumber;

    private Date arrivetime;

    private Date inporttime;

    private String slevel;

    private String shipmentid;

    private String aliorderid;

    private String manufacturename;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String content;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
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

    public String getCreatoper() {
        return creatoper;
    }

    public void setCreatoper(String creatoper) {
        this.creatoper = creatoper == null ? null : creatoper.trim();
    }

    public Date getCreatopertime() {
        return creatopertime;
    }

    public void setCreatopertime(Date creatopertime) {
        this.creatopertime = creatopertime;
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

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getWeightamount() {
        return weightamount;
    }

    public void setWeightamount(BigDecimal weightamount) {
        this.weightamount = weightamount;
    }

    public BigDecimal getMoneyamount() {
        return moneyamount;
    }

    public void setMoneyamount(BigDecimal moneyamount) {
        this.moneyamount = moneyamount;
    }

    public String getTrackingnumber() {
        return trackingnumber;
    }

    public void setTrackingnumber(String trackingnumber) {
        this.trackingnumber = trackingnumber == null ? null : trackingnumber.trim();
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public Date getInporttime() {
        return inporttime;
    }

    public void setInporttime(Date inporttime) {
        this.inporttime = inporttime;
    }

    public String getSlevel() {
        return slevel;
    }

    public void setSlevel(String slevel) {
        this.slevel = slevel == null ? null : slevel.trim();
    }

    public String getShipmentid() {
        return shipmentid;
    }

    public void setShipmentid(String shipmentid) {
        this.shipmentid = shipmentid == null ? null : shipmentid.trim();
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid == null ? null : aliorderid.trim();
    }

    public String getManufacturename() {
        return manufacturename;
    }

    public void setManufacturename(String manufacturename) {
        this.manufacturename = manufacturename == null ? null : manufacturename.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        DbPurchasedevelop other = (DbPurchasedevelop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreatoper() == null ? other.getCreatoper() == null : this.getCreatoper().equals(other.getCreatoper()))
            && (this.getCreatopertime() == null ? other.getCreatopertime() == null : this.getCreatopertime().equals(other.getCreatopertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWeightamount() == null ? other.getWeightamount() == null : this.getWeightamount().equals(other.getWeightamount()))
            && (this.getMoneyamount() == null ? other.getMoneyamount() == null : this.getMoneyamount().equals(other.getMoneyamount()))
            && (this.getTrackingnumber() == null ? other.getTrackingnumber() == null : this.getTrackingnumber().equals(other.getTrackingnumber()))
            && (this.getArrivetime() == null ? other.getArrivetime() == null : this.getArrivetime().equals(other.getArrivetime()))
            && (this.getInporttime() == null ? other.getInporttime() == null : this.getInporttime().equals(other.getInporttime()))
            && (this.getSlevel() == null ? other.getSlevel() == null : this.getSlevel().equals(other.getSlevel()))
            && (this.getShipmentid() == null ? other.getShipmentid() == null : this.getShipmentid().equals(other.getShipmentid()))
            && (this.getAliorderid() == null ? other.getAliorderid() == null : this.getAliorderid().equals(other.getAliorderid()))
            && (this.getManufacturename() == null ? other.getManufacturename() == null : this.getManufacturename().equals(other.getManufacturename()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreatoper() == null) ? 0 : getCreatoper().hashCode());
        result = prime * result + ((getCreatopertime() == null) ? 0 : getCreatopertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWeightamount() == null) ? 0 : getWeightamount().hashCode());
        result = prime * result + ((getMoneyamount() == null) ? 0 : getMoneyamount().hashCode());
        result = prime * result + ((getTrackingnumber() == null) ? 0 : getTrackingnumber().hashCode());
        result = prime * result + ((getArrivetime() == null) ? 0 : getArrivetime().hashCode());
        result = prime * result + ((getInporttime() == null) ? 0 : getInporttime().hashCode());
        result = prime * result + ((getSlevel() == null) ? 0 : getSlevel().hashCode());
        result = prime * result + ((getShipmentid() == null) ? 0 : getShipmentid().hashCode());
        result = prime * result + ((getAliorderid() == null) ? 0 : getAliorderid().hashCode());
        result = prime * result + ((getManufacturename() == null) ? 0 : getManufacturename().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
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
        sb.append(", groupid=").append(groupid);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", paytype=").append(paytype);
        sb.append(", freight=").append(freight);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", creatoper=").append(creatoper);
        sb.append(", creatopertime=").append(creatopertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", status=").append(status);
        sb.append(", weightamount=").append(weightamount);
        sb.append(", moneyamount=").append(moneyamount);
        sb.append(", trackingnumber=").append(trackingnumber);
        sb.append(", arrivetime=").append(arrivetime);
        sb.append(", inporttime=").append(inporttime);
        sb.append(", slevel=").append(slevel);
        sb.append(", shipmentid=").append(shipmentid);
        sb.append(", aliorderid=").append(aliorderid);
        sb.append(", manufacturename=").append(manufacturename);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", content=").append(content);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}