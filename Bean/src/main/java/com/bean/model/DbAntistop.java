package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbAntistop implements Serializable {
    private String sequenceid;

    private String parentid;

    private String parentflag;

    private String oper;

    private Date opertime;

    private String createoper;

    private Date creattime;

    private String corpid;

    private String openflag;

    private String totalsales;

    private String totallistings;

    private String sucessfullisting;

    private String bids;

    private String itemssold;

    private String averageprice;

    private String sellthrough;

    private String rank;

    private String name;

    private BigDecimal sort;

    private String antistop;

    private String descr;

    private String antistop1;

    private String antistop2;

    private String antistop3;

    private String antistop4;

    private String antistop5;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getParentflag() {
        return parentflag;
    }

    public void setParentflag(String parentflag) {
        this.parentflag = parentflag == null ? null : parentflag.trim();
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

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
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

    public String getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(String totalsales) {
        this.totalsales = totalsales == null ? null : totalsales.trim();
    }

    public String getTotallistings() {
        return totallistings;
    }

    public void setTotallistings(String totallistings) {
        this.totallistings = totallistings == null ? null : totallistings.trim();
    }

    public String getSucessfullisting() {
        return sucessfullisting;
    }

    public void setSucessfullisting(String sucessfullisting) {
        this.sucessfullisting = sucessfullisting == null ? null : sucessfullisting.trim();
    }

    public String getBids() {
        return bids;
    }

    public void setBids(String bids) {
        this.bids = bids == null ? null : bids.trim();
    }

    public String getItemssold() {
        return itemssold;
    }

    public void setItemssold(String itemssold) {
        this.itemssold = itemssold == null ? null : itemssold.trim();
    }

    public String getAverageprice() {
        return averageprice;
    }

    public void setAverageprice(String averageprice) {
        this.averageprice = averageprice == null ? null : averageprice.trim();
    }

    public String getSellthrough() {
        return sellthrough;
    }

    public void setSellthrough(String sellthrough) {
        this.sellthrough = sellthrough == null ? null : sellthrough.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public String getAntistop() {
        return antistop;
    }

    public void setAntistop(String antistop) {
        this.antistop = antistop == null ? null : antistop.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getAntistop1() {
        return antistop1;
    }

    public void setAntistop1(String antistop1) {
        this.antistop1 = antistop1 == null ? null : antistop1.trim();
    }

    public String getAntistop2() {
        return antistop2;
    }

    public void setAntistop2(String antistop2) {
        this.antistop2 = antistop2 == null ? null : antistop2.trim();
    }

    public String getAntistop3() {
        return antistop3;
    }

    public void setAntistop3(String antistop3) {
        this.antistop3 = antistop3 == null ? null : antistop3.trim();
    }

    public String getAntistop4() {
        return antistop4;
    }

    public void setAntistop4(String antistop4) {
        this.antistop4 = antistop4 == null ? null : antistop4.trim();
    }

    public String getAntistop5() {
        return antistop5;
    }

    public void setAntistop5(String antistop5) {
        this.antistop5 = antistop5 == null ? null : antistop5.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        DbAntistop other = (DbAntistop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getParentflag() == null ? other.getParentflag() == null : this.getParentflag().equals(other.getParentflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getTotalsales() == null ? other.getTotalsales() == null : this.getTotalsales().equals(other.getTotalsales()))
            && (this.getTotallistings() == null ? other.getTotallistings() == null : this.getTotallistings().equals(other.getTotallistings()))
            && (this.getSucessfullisting() == null ? other.getSucessfullisting() == null : this.getSucessfullisting().equals(other.getSucessfullisting()))
            && (this.getBids() == null ? other.getBids() == null : this.getBids().equals(other.getBids()))
            && (this.getItemssold() == null ? other.getItemssold() == null : this.getItemssold().equals(other.getItemssold()))
            && (this.getAverageprice() == null ? other.getAverageprice() == null : this.getAverageprice().equals(other.getAverageprice()))
            && (this.getSellthrough() == null ? other.getSellthrough() == null : this.getSellthrough().equals(other.getSellthrough()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getAntistop() == null ? other.getAntistop() == null : this.getAntistop().equals(other.getAntistop()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getAntistop1() == null ? other.getAntistop1() == null : this.getAntistop1().equals(other.getAntistop1()))
            && (this.getAntistop2() == null ? other.getAntistop2() == null : this.getAntistop2().equals(other.getAntistop2()))
            && (this.getAntistop3() == null ? other.getAntistop3() == null : this.getAntistop3().equals(other.getAntistop3()))
            && (this.getAntistop4() == null ? other.getAntistop4() == null : this.getAntistop4().equals(other.getAntistop4()))
            && (this.getAntistop5() == null ? other.getAntistop5() == null : this.getAntistop5().equals(other.getAntistop5()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getParentflag() == null) ? 0 : getParentflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getTotalsales() == null) ? 0 : getTotalsales().hashCode());
        result = prime * result + ((getTotallistings() == null) ? 0 : getTotallistings().hashCode());
        result = prime * result + ((getSucessfullisting() == null) ? 0 : getSucessfullisting().hashCode());
        result = prime * result + ((getBids() == null) ? 0 : getBids().hashCode());
        result = prime * result + ((getItemssold() == null) ? 0 : getItemssold().hashCode());
        result = prime * result + ((getAverageprice() == null) ? 0 : getAverageprice().hashCode());
        result = prime * result + ((getSellthrough() == null) ? 0 : getSellthrough().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getAntistop() == null) ? 0 : getAntistop().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getAntistop1() == null) ? 0 : getAntistop1().hashCode());
        result = prime * result + ((getAntistop2() == null) ? 0 : getAntistop2().hashCode());
        result = prime * result + ((getAntistop3() == null) ? 0 : getAntistop3().hashCode());
        result = prime * result + ((getAntistop4() == null) ? 0 : getAntistop4().hashCode());
        result = prime * result + ((getAntistop5() == null) ? 0 : getAntistop5().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", parentid=").append(parentid);
        sb.append(", parentflag=").append(parentflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createoper=").append(createoper);
        sb.append(", creattime=").append(creattime);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", totalsales=").append(totalsales);
        sb.append(", totallistings=").append(totallistings);
        sb.append(", sucessfullisting=").append(sucessfullisting);
        sb.append(", bids=").append(bids);
        sb.append(", itemssold=").append(itemssold);
        sb.append(", averageprice=").append(averageprice);
        sb.append(", sellthrough=").append(sellthrough);
        sb.append(", rank=").append(rank);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", antistop=").append(antistop);
        sb.append(", descr=").append(descr);
        sb.append(", antistop1=").append(antistop1);
        sb.append(", antistop2=").append(antistop2);
        sb.append(", antistop3=").append(antistop3);
        sb.append(", antistop4=").append(antistop4);
        sb.append(", antistop5=").append(antistop5);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}