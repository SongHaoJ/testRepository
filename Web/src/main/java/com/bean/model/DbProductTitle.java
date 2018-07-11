package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductTitle implements Serializable {
    private String sequenceid;

    private String oper;

    private Date opertime;

    private String filed1;

    private BigDecimal filed4;

    private BigDecimal filed5;

    private String title;

    private String sid;

    private String qty;

    private String filed2;

    private String filed3;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
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

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    public BigDecimal getFiled4() {
        return filed4;
    }

    public void setFiled4(BigDecimal filed4) {
        this.filed4 = filed4;
    }

    public BigDecimal getFiled5() {
        return filed5;
    }

    public void setFiled5(BigDecimal filed5) {
        this.filed5 = filed5;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty == null ? null : qty.trim();
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3 == null ? null : filed3.trim();
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
        DbProductTitle other = (DbProductTitle) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getQty() == null ? other.getQty() == null : this.getQty().equals(other.getQty()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getQty() == null) ? 0 : getQty().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed4=").append(filed4);
        sb.append(", filed5=").append(filed5);
        sb.append(", title=").append(title);
        sb.append(", sid=").append(sid);
        sb.append(", qty=").append(qty);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}