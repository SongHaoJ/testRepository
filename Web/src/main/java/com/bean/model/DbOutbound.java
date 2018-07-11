package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbOutbound implements Serializable {
    private BigDecimal sequenceid;

    private String productid;

    private String productname;

    private BigDecimal savenumber;

    private BigDecimal ordernum;

    private String oper;

    private String opertime;

    private Integer outboundnum;

    private String notes;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public BigDecimal getSavenumber() {
        return savenumber;
    }

    public void setSavenumber(BigDecimal savenumber) {
        this.savenumber = savenumber;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime == null ? null : opertime.trim();
    }

    public Integer getOutboundnum() {
        return outboundnum;
    }

    public void setOutboundnum(Integer outboundnum) {
        this.outboundnum = outboundnum;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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
        DbOutbound other = (DbOutbound) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getSavenumber() == null ? other.getSavenumber() == null : this.getSavenumber().equals(other.getSavenumber()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOutboundnum() == null ? other.getOutboundnum() == null : this.getOutboundnum().equals(other.getOutboundnum()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getSavenumber() == null) ? 0 : getSavenumber().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOutboundnum() == null) ? 0 : getOutboundnum().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", savenumber=").append(savenumber);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", outboundnum=").append(outboundnum);
        sb.append(", notes=").append(notes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}