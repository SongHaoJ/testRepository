package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbAlibbporder implements Serializable {
    private String orderid;

    private String remarks;

    private String purchase;

    private Date opertime;

    private Date createtime;

    private Date modifytime;

    private String logisticsid;

    private Short flag;

    private String supportprint;

    private String companyphone;

    private String companyno;

    private String companyname;

    private String companyid;

    private String contet;

    private String alishopid;

    private String logisticsorderno;

    private String status;

    private String logisticstrace;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase == null ? null : purchase.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(String logisticsid) {
        this.logisticsid = logisticsid == null ? null : logisticsid.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getSupportprint() {
        return supportprint;
    }

    public void setSupportprint(String supportprint) {
        this.supportprint = supportprint == null ? null : supportprint.trim();
    }

    public String getCompanyphone() {
        return companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone == null ? null : companyphone.trim();
    }

    public String getCompanyno() {
        return companyno;
    }

    public void setCompanyno(String companyno) {
        this.companyno = companyno == null ? null : companyno.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getContet() {
        return contet;
    }

    public void setContet(String contet) {
        this.contet = contet == null ? null : contet.trim();
    }

    public String getAlishopid() {
        return alishopid;
    }

    public void setAlishopid(String alishopid) {
        this.alishopid = alishopid == null ? null : alishopid.trim();
    }

    public String getLogisticsorderno() {
        return logisticsorderno;
    }

    public void setLogisticsorderno(String logisticsorderno) {
        this.logisticsorderno = logisticsorderno == null ? null : logisticsorderno.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getLogisticstrace() {
        return logisticstrace;
    }

    public void setLogisticstrace(String logisticstrace) {
        this.logisticstrace = logisticstrace == null ? null : logisticstrace.trim();
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
        DbAlibbporder other = (DbAlibbporder) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getPurchase() == null ? other.getPurchase() == null : this.getPurchase().equals(other.getPurchase()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getLogisticsid() == null ? other.getLogisticsid() == null : this.getLogisticsid().equals(other.getLogisticsid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getSupportprint() == null ? other.getSupportprint() == null : this.getSupportprint().equals(other.getSupportprint()))
            && (this.getCompanyphone() == null ? other.getCompanyphone() == null : this.getCompanyphone().equals(other.getCompanyphone()))
            && (this.getCompanyno() == null ? other.getCompanyno() == null : this.getCompanyno().equals(other.getCompanyno()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getContet() == null ? other.getContet() == null : this.getContet().equals(other.getContet()))
            && (this.getAlishopid() == null ? other.getAlishopid() == null : this.getAlishopid().equals(other.getAlishopid()))
            && (this.getLogisticsorderno() == null ? other.getLogisticsorderno() == null : this.getLogisticsorderno().equals(other.getLogisticsorderno()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLogisticstrace() == null ? other.getLogisticstrace() == null : this.getLogisticstrace().equals(other.getLogisticstrace()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getPurchase() == null) ? 0 : getPurchase().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getLogisticsid() == null) ? 0 : getLogisticsid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getSupportprint() == null) ? 0 : getSupportprint().hashCode());
        result = prime * result + ((getCompanyphone() == null) ? 0 : getCompanyphone().hashCode());
        result = prime * result + ((getCompanyno() == null) ? 0 : getCompanyno().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getContet() == null) ? 0 : getContet().hashCode());
        result = prime * result + ((getAlishopid() == null) ? 0 : getAlishopid().hashCode());
        result = prime * result + ((getLogisticsorderno() == null) ? 0 : getLogisticsorderno().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLogisticstrace() == null) ? 0 : getLogisticstrace().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", remarks=").append(remarks);
        sb.append(", purchase=").append(purchase);
        sb.append(", opertime=").append(opertime);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", logisticsid=").append(logisticsid);
        sb.append(", flag=").append(flag);
        sb.append(", supportprint=").append(supportprint);
        sb.append(", companyphone=").append(companyphone);
        sb.append(", companyno=").append(companyno);
        sb.append(", companyname=").append(companyname);
        sb.append(", companyid=").append(companyid);
        sb.append(", contet=").append(contet);
        sb.append(", alishopid=").append(alishopid);
        sb.append(", logisticsorderno=").append(logisticsorderno);
        sb.append(", status=").append(status);
        sb.append(", logisticstrace=").append(logisticstrace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}