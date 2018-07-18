package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbLcl implements Serializable {
    private BigDecimal sequenceid;

    private String containernumber;

    private BigDecimal ftcbm;

    private BigDecimal arrivalperiod;

    private Date lcltime;

    private Date outporttime;

    private Date towarehousetime;

    private Date inwarehousetime;

    private Date createdate;

    private String createoper;

    private Date opertime;

    private String oper;

    private String packageinglist;

    private String expressid;

    private Date checktime;

    private Date topurposeporttime;

    private String receipt;

    private String expresstype;

    private BigDecimal transportfare;

    private String position;

    private BigDecimal status;

    private Date toporttime;

    private String containerinfo;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getContainernumber() {
        return containernumber;
    }

    public void setContainernumber(String containernumber) {
        this.containernumber = containernumber == null ? null : containernumber.trim();
    }

    public BigDecimal getFtcbm() {
        return ftcbm;
    }

    public void setFtcbm(BigDecimal ftcbm) {
        this.ftcbm = ftcbm;
    }

    public BigDecimal getArrivalperiod() {
        return arrivalperiod;
    }

    public void setArrivalperiod(BigDecimal arrivalperiod) {
        this.arrivalperiod = arrivalperiod;
    }

    public Date getLcltime() {
        return lcltime;
    }

    public void setLcltime(Date lcltime) {
        this.lcltime = lcltime;
    }

    public Date getOutporttime() {
        return outporttime;
    }

    public void setOutporttime(Date outporttime) {
        this.outporttime = outporttime;
    }

    public Date getTowarehousetime() {
        return towarehousetime;
    }

    public void setTowarehousetime(Date towarehousetime) {
        this.towarehousetime = towarehousetime;
    }

    public Date getInwarehousetime() {
        return inwarehousetime;
    }

    public void setInwarehousetime(Date inwarehousetime) {
        this.inwarehousetime = inwarehousetime;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getPackageinglist() {
        return packageinglist;
    }

    public void setPackageinglist(String packageinglist) {
        this.packageinglist = packageinglist == null ? null : packageinglist.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getTopurposeporttime() {
        return topurposeporttime;
    }

    public void setTopurposeporttime(Date topurposeporttime) {
        this.topurposeporttime = topurposeporttime;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt == null ? null : receipt.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public BigDecimal getTransportfare() {
        return transportfare;
    }

    public void setTransportfare(BigDecimal transportfare) {
        this.transportfare = transportfare;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public Date getToporttime() {
        return toporttime;
    }

    public void setToporttime(Date toporttime) {
        this.toporttime = toporttime;
    }

    public String getContainerinfo() {
        return containerinfo;
    }

    public void setContainerinfo(String containerinfo) {
        this.containerinfo = containerinfo == null ? null : containerinfo.trim();
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
        DbLcl other = (DbLcl) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getContainernumber() == null ? other.getContainernumber() == null : this.getContainernumber().equals(other.getContainernumber()))
            && (this.getFtcbm() == null ? other.getFtcbm() == null : this.getFtcbm().equals(other.getFtcbm()))
            && (this.getArrivalperiod() == null ? other.getArrivalperiod() == null : this.getArrivalperiod().equals(other.getArrivalperiod()))
            && (this.getLcltime() == null ? other.getLcltime() == null : this.getLcltime().equals(other.getLcltime()))
            && (this.getOutporttime() == null ? other.getOutporttime() == null : this.getOutporttime().equals(other.getOutporttime()))
            && (this.getTowarehousetime() == null ? other.getTowarehousetime() == null : this.getTowarehousetime().equals(other.getTowarehousetime()))
            && (this.getInwarehousetime() == null ? other.getInwarehousetime() == null : this.getInwarehousetime().equals(other.getInwarehousetime()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getPackageinglist() == null ? other.getPackageinglist() == null : this.getPackageinglist().equals(other.getPackageinglist()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getTopurposeporttime() == null ? other.getTopurposeporttime() == null : this.getTopurposeporttime().equals(other.getTopurposeporttime()))
            && (this.getReceipt() == null ? other.getReceipt() == null : this.getReceipt().equals(other.getReceipt()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getTransportfare() == null ? other.getTransportfare() == null : this.getTransportfare().equals(other.getTransportfare()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getToporttime() == null ? other.getToporttime() == null : this.getToporttime().equals(other.getToporttime()))
            && (this.getContainerinfo() == null ? other.getContainerinfo() == null : this.getContainerinfo().equals(other.getContainerinfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getContainernumber() == null) ? 0 : getContainernumber().hashCode());
        result = prime * result + ((getFtcbm() == null) ? 0 : getFtcbm().hashCode());
        result = prime * result + ((getArrivalperiod() == null) ? 0 : getArrivalperiod().hashCode());
        result = prime * result + ((getLcltime() == null) ? 0 : getLcltime().hashCode());
        result = prime * result + ((getOutporttime() == null) ? 0 : getOutporttime().hashCode());
        result = prime * result + ((getTowarehousetime() == null) ? 0 : getTowarehousetime().hashCode());
        result = prime * result + ((getInwarehousetime() == null) ? 0 : getInwarehousetime().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getPackageinglist() == null) ? 0 : getPackageinglist().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getTopurposeporttime() == null) ? 0 : getTopurposeporttime().hashCode());
        result = prime * result + ((getReceipt() == null) ? 0 : getReceipt().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getTransportfare() == null) ? 0 : getTransportfare().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getToporttime() == null) ? 0 : getToporttime().hashCode());
        result = prime * result + ((getContainerinfo() == null) ? 0 : getContainerinfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", containernumber=").append(containernumber);
        sb.append(", ftcbm=").append(ftcbm);
        sb.append(", arrivalperiod=").append(arrivalperiod);
        sb.append(", lcltime=").append(lcltime);
        sb.append(", outporttime=").append(outporttime);
        sb.append(", towarehousetime=").append(towarehousetime);
        sb.append(", inwarehousetime=").append(inwarehousetime);
        sb.append(", createdate=").append(createdate);
        sb.append(", createoper=").append(createoper);
        sb.append(", opertime=").append(opertime);
        sb.append(", oper=").append(oper);
        sb.append(", packageinglist=").append(packageinglist);
        sb.append(", expressid=").append(expressid);
        sb.append(", checktime=").append(checktime);
        sb.append(", topurposeporttime=").append(topurposeporttime);
        sb.append(", receipt=").append(receipt);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", transportfare=").append(transportfare);
        sb.append(", position=").append(position);
        sb.append(", status=").append(status);
        sb.append(", toporttime=").append(toporttime);
        sb.append(", containerinfo=").append(containerinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}