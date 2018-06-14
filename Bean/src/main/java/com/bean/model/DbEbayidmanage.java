package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbayidmanage implements Serializable {
    private BigDecimal sequenceid;

    private String name;

    private String shoptypeid;

    private Date opertime;

    private BigDecimal openflag;

    private String oper;

    private BigDecimal corpid;

    private String actualshopname;

    private String actualshopid;

    private String bbereality;

    private String bbereality1;

    private String bbereality2;

    private String bbenum;

    private String bbenum1;

    private String bbenum2;

    private String bbebb;

    private String bbebb1;

    private String bbebb2;

    private BigDecimal bbenumb;

    private BigDecimal bbenumb1;

    private BigDecimal bbenumb2;

    private BigDecimal chae;

    private BigDecimal chae1;

    private BigDecimal chae2;

    private BigDecimal bbesnum;

    private BigDecimal bbesnum1;

    private BigDecimal bbesnum2;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getCorpid() {
        return corpid;
    }

    public void setCorpid(BigDecimal corpid) {
        this.corpid = corpid;
    }

    public String getActualshopname() {
        return actualshopname;
    }

    public void setActualshopname(String actualshopname) {
        this.actualshopname = actualshopname == null ? null : actualshopname.trim();
    }

    public String getActualshopid() {
        return actualshopid;
    }

    public void setActualshopid(String actualshopid) {
        this.actualshopid = actualshopid == null ? null : actualshopid.trim();
    }

    public String getBbereality() {
        return bbereality;
    }

    public void setBbereality(String bbereality) {
        this.bbereality = bbereality == null ? null : bbereality.trim();
    }

    public String getBbereality1() {
        return bbereality1;
    }

    public void setBbereality1(String bbereality1) {
        this.bbereality1 = bbereality1 == null ? null : bbereality1.trim();
    }

    public String getBbereality2() {
        return bbereality2;
    }

    public void setBbereality2(String bbereality2) {
        this.bbereality2 = bbereality2 == null ? null : bbereality2.trim();
    }

    public String getBbenum() {
        return bbenum;
    }

    public void setBbenum(String bbenum) {
        this.bbenum = bbenum == null ? null : bbenum.trim();
    }

    public String getBbenum1() {
        return bbenum1;
    }

    public void setBbenum1(String bbenum1) {
        this.bbenum1 = bbenum1 == null ? null : bbenum1.trim();
    }

    public String getBbenum2() {
        return bbenum2;
    }

    public void setBbenum2(String bbenum2) {
        this.bbenum2 = bbenum2 == null ? null : bbenum2.trim();
    }

    public String getBbebb() {
        return bbebb;
    }

    public void setBbebb(String bbebb) {
        this.bbebb = bbebb == null ? null : bbebb.trim();
    }

    public String getBbebb1() {
        return bbebb1;
    }

    public void setBbebb1(String bbebb1) {
        this.bbebb1 = bbebb1 == null ? null : bbebb1.trim();
    }

    public String getBbebb2() {
        return bbebb2;
    }

    public void setBbebb2(String bbebb2) {
        this.bbebb2 = bbebb2 == null ? null : bbebb2.trim();
    }

    public BigDecimal getBbenumb() {
        return bbenumb;
    }

    public void setBbenumb(BigDecimal bbenumb) {
        this.bbenumb = bbenumb;
    }

    public BigDecimal getBbenumb1() {
        return bbenumb1;
    }

    public void setBbenumb1(BigDecimal bbenumb1) {
        this.bbenumb1 = bbenumb1;
    }

    public BigDecimal getBbenumb2() {
        return bbenumb2;
    }

    public void setBbenumb2(BigDecimal bbenumb2) {
        this.bbenumb2 = bbenumb2;
    }

    public BigDecimal getChae() {
        return chae;
    }

    public void setChae(BigDecimal chae) {
        this.chae = chae;
    }

    public BigDecimal getChae1() {
        return chae1;
    }

    public void setChae1(BigDecimal chae1) {
        this.chae1 = chae1;
    }

    public BigDecimal getChae2() {
        return chae2;
    }

    public void setChae2(BigDecimal chae2) {
        this.chae2 = chae2;
    }

    public BigDecimal getBbesnum() {
        return bbesnum;
    }

    public void setBbesnum(BigDecimal bbesnum) {
        this.bbesnum = bbesnum;
    }

    public BigDecimal getBbesnum1() {
        return bbesnum1;
    }

    public void setBbesnum1(BigDecimal bbesnum1) {
        this.bbesnum1 = bbesnum1;
    }

    public BigDecimal getBbesnum2() {
        return bbesnum2;
    }

    public void setBbesnum2(BigDecimal bbesnum2) {
        this.bbesnum2 = bbesnum2;
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
        DbEbayidmanage other = (DbEbayidmanage) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getActualshopname() == null ? other.getActualshopname() == null : this.getActualshopname().equals(other.getActualshopname()))
            && (this.getActualshopid() == null ? other.getActualshopid() == null : this.getActualshopid().equals(other.getActualshopid()))
            && (this.getBbereality() == null ? other.getBbereality() == null : this.getBbereality().equals(other.getBbereality()))
            && (this.getBbereality1() == null ? other.getBbereality1() == null : this.getBbereality1().equals(other.getBbereality1()))
            && (this.getBbereality2() == null ? other.getBbereality2() == null : this.getBbereality2().equals(other.getBbereality2()))
            && (this.getBbenum() == null ? other.getBbenum() == null : this.getBbenum().equals(other.getBbenum()))
            && (this.getBbenum1() == null ? other.getBbenum1() == null : this.getBbenum1().equals(other.getBbenum1()))
            && (this.getBbenum2() == null ? other.getBbenum2() == null : this.getBbenum2().equals(other.getBbenum2()))
            && (this.getBbebb() == null ? other.getBbebb() == null : this.getBbebb().equals(other.getBbebb()))
            && (this.getBbebb1() == null ? other.getBbebb1() == null : this.getBbebb1().equals(other.getBbebb1()))
            && (this.getBbebb2() == null ? other.getBbebb2() == null : this.getBbebb2().equals(other.getBbebb2()))
            && (this.getBbenumb() == null ? other.getBbenumb() == null : this.getBbenumb().equals(other.getBbenumb()))
            && (this.getBbenumb1() == null ? other.getBbenumb1() == null : this.getBbenumb1().equals(other.getBbenumb1()))
            && (this.getBbenumb2() == null ? other.getBbenumb2() == null : this.getBbenumb2().equals(other.getBbenumb2()))
            && (this.getChae() == null ? other.getChae() == null : this.getChae().equals(other.getChae()))
            && (this.getChae1() == null ? other.getChae1() == null : this.getChae1().equals(other.getChae1()))
            && (this.getChae2() == null ? other.getChae2() == null : this.getChae2().equals(other.getChae2()))
            && (this.getBbesnum() == null ? other.getBbesnum() == null : this.getBbesnum().equals(other.getBbesnum()))
            && (this.getBbesnum1() == null ? other.getBbesnum1() == null : this.getBbesnum1().equals(other.getBbesnum1()))
            && (this.getBbesnum2() == null ? other.getBbesnum2() == null : this.getBbesnum2().equals(other.getBbesnum2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getActualshopname() == null) ? 0 : getActualshopname().hashCode());
        result = prime * result + ((getActualshopid() == null) ? 0 : getActualshopid().hashCode());
        result = prime * result + ((getBbereality() == null) ? 0 : getBbereality().hashCode());
        result = prime * result + ((getBbereality1() == null) ? 0 : getBbereality1().hashCode());
        result = prime * result + ((getBbereality2() == null) ? 0 : getBbereality2().hashCode());
        result = prime * result + ((getBbenum() == null) ? 0 : getBbenum().hashCode());
        result = prime * result + ((getBbenum1() == null) ? 0 : getBbenum1().hashCode());
        result = prime * result + ((getBbenum2() == null) ? 0 : getBbenum2().hashCode());
        result = prime * result + ((getBbebb() == null) ? 0 : getBbebb().hashCode());
        result = prime * result + ((getBbebb1() == null) ? 0 : getBbebb1().hashCode());
        result = prime * result + ((getBbebb2() == null) ? 0 : getBbebb2().hashCode());
        result = prime * result + ((getBbenumb() == null) ? 0 : getBbenumb().hashCode());
        result = prime * result + ((getBbenumb1() == null) ? 0 : getBbenumb1().hashCode());
        result = prime * result + ((getBbenumb2() == null) ? 0 : getBbenumb2().hashCode());
        result = prime * result + ((getChae() == null) ? 0 : getChae().hashCode());
        result = prime * result + ((getChae1() == null) ? 0 : getChae1().hashCode());
        result = prime * result + ((getChae2() == null) ? 0 : getChae2().hashCode());
        result = prime * result + ((getBbesnum() == null) ? 0 : getBbesnum().hashCode());
        result = prime * result + ((getBbesnum1() == null) ? 0 : getBbesnum1().hashCode());
        result = prime * result + ((getBbesnum2() == null) ? 0 : getBbesnum2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", name=").append(name);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", corpid=").append(corpid);
        sb.append(", actualshopname=").append(actualshopname);
        sb.append(", actualshopid=").append(actualshopid);
        sb.append(", bbereality=").append(bbereality);
        sb.append(", bbereality1=").append(bbereality1);
        sb.append(", bbereality2=").append(bbereality2);
        sb.append(", bbenum=").append(bbenum);
        sb.append(", bbenum1=").append(bbenum1);
        sb.append(", bbenum2=").append(bbenum2);
        sb.append(", bbebb=").append(bbebb);
        sb.append(", bbebb1=").append(bbebb1);
        sb.append(", bbebb2=").append(bbebb2);
        sb.append(", bbenumb=").append(bbenumb);
        sb.append(", bbenumb1=").append(bbenumb1);
        sb.append(", bbenumb2=").append(bbenumb2);
        sb.append(", chae=").append(chae);
        sb.append(", chae1=").append(chae1);
        sb.append(", chae2=").append(chae2);
        sb.append(", bbesnum=").append(bbesnum);
        sb.append(", bbesnum1=").append(bbesnum1);
        sb.append(", bbesnum2=").append(bbesnum2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}