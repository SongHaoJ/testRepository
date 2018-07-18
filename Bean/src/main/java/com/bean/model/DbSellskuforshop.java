package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSellskuforshop implements Serializable {
    private BigDecimal sequenceid;

    private String sellsku;

    private String shopid;

    private String shopname;

    private String shopuserid;

    private BigDecimal numforus;

    private BigDecimal numforau;

    private BigDecimal numforuk;

    private BigDecimal numforca;

    private BigDecimal numforde;

    private String temporary;

    private BigDecimal total;

    private String reserve1;

    private String reserve2;

    private BigDecimal reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private String corpid;

    private String oper;

    private String openflag;

    private Date operime;

    private Date createtime;

    private BigDecimal flagus;

    private BigDecimal flagau;

    private BigDecimal flaguk;

    private BigDecimal flagca;

    private BigDecimal flagde;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getSellsku() {
        return sellsku;
    }

    public void setSellsku(String sellsku) {
        this.sellsku = sellsku == null ? null : sellsku.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopuserid() {
        return shopuserid;
    }

    public void setShopuserid(String shopuserid) {
        this.shopuserid = shopuserid == null ? null : shopuserid.trim();
    }

    public BigDecimal getNumforus() {
        return numforus;
    }

    public void setNumforus(BigDecimal numforus) {
        this.numforus = numforus;
    }

    public BigDecimal getNumforau() {
        return numforau;
    }

    public void setNumforau(BigDecimal numforau) {
        this.numforau = numforau;
    }

    public BigDecimal getNumforuk() {
        return numforuk;
    }

    public void setNumforuk(BigDecimal numforuk) {
        this.numforuk = numforuk;
    }

    public BigDecimal getNumforca() {
        return numforca;
    }

    public void setNumforca(BigDecimal numforca) {
        this.numforca = numforca;
    }

    public BigDecimal getNumforde() {
        return numforde;
    }

    public void setNumforde(BigDecimal numforde) {
        this.numforde = numforde;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary == null ? null : temporary.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public BigDecimal getReserve3() {
        return reserve3;
    }

    public void setReserve3(BigDecimal reserve3) {
        this.reserve3 = reserve3;
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

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public Date getOperime() {
        return operime;
    }

    public void setOperime(Date operime) {
        this.operime = operime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getFlagus() {
        return flagus;
    }

    public void setFlagus(BigDecimal flagus) {
        this.flagus = flagus;
    }

    public BigDecimal getFlagau() {
        return flagau;
    }

    public void setFlagau(BigDecimal flagau) {
        this.flagau = flagau;
    }

    public BigDecimal getFlaguk() {
        return flaguk;
    }

    public void setFlaguk(BigDecimal flaguk) {
        this.flaguk = flaguk;
    }

    public BigDecimal getFlagca() {
        return flagca;
    }

    public void setFlagca(BigDecimal flagca) {
        this.flagca = flagca;
    }

    public BigDecimal getFlagde() {
        return flagde;
    }

    public void setFlagde(BigDecimal flagde) {
        this.flagde = flagde;
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
        DbSellskuforshop other = (DbSellskuforshop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSellsku() == null ? other.getSellsku() == null : this.getSellsku().equals(other.getSellsku()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getShopuserid() == null ? other.getShopuserid() == null : this.getShopuserid().equals(other.getShopuserid()))
            && (this.getNumforus() == null ? other.getNumforus() == null : this.getNumforus().equals(other.getNumforus()))
            && (this.getNumforau() == null ? other.getNumforau() == null : this.getNumforau().equals(other.getNumforau()))
            && (this.getNumforuk() == null ? other.getNumforuk() == null : this.getNumforuk().equals(other.getNumforuk()))
            && (this.getNumforca() == null ? other.getNumforca() == null : this.getNumforca().equals(other.getNumforca()))
            && (this.getNumforde() == null ? other.getNumforde() == null : this.getNumforde().equals(other.getNumforde()))
            && (this.getTemporary() == null ? other.getTemporary() == null : this.getTemporary().equals(other.getTemporary()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOperime() == null ? other.getOperime() == null : this.getOperime().equals(other.getOperime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getFlagus() == null ? other.getFlagus() == null : this.getFlagus().equals(other.getFlagus()))
            && (this.getFlagau() == null ? other.getFlagau() == null : this.getFlagau().equals(other.getFlagau()))
            && (this.getFlaguk() == null ? other.getFlaguk() == null : this.getFlaguk().equals(other.getFlaguk()))
            && (this.getFlagca() == null ? other.getFlagca() == null : this.getFlagca().equals(other.getFlagca()))
            && (this.getFlagde() == null ? other.getFlagde() == null : this.getFlagde().equals(other.getFlagde()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSellsku() == null) ? 0 : getSellsku().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getShopuserid() == null) ? 0 : getShopuserid().hashCode());
        result = prime * result + ((getNumforus() == null) ? 0 : getNumforus().hashCode());
        result = prime * result + ((getNumforau() == null) ? 0 : getNumforau().hashCode());
        result = prime * result + ((getNumforuk() == null) ? 0 : getNumforuk().hashCode());
        result = prime * result + ((getNumforca() == null) ? 0 : getNumforca().hashCode());
        result = prime * result + ((getNumforde() == null) ? 0 : getNumforde().hashCode());
        result = prime * result + ((getTemporary() == null) ? 0 : getTemporary().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOperime() == null) ? 0 : getOperime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getFlagus() == null) ? 0 : getFlagus().hashCode());
        result = prime * result + ((getFlagau() == null) ? 0 : getFlagau().hashCode());
        result = prime * result + ((getFlaguk() == null) ? 0 : getFlaguk().hashCode());
        result = prime * result + ((getFlagca() == null) ? 0 : getFlagca().hashCode());
        result = prime * result + ((getFlagde() == null) ? 0 : getFlagde().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", sellsku=").append(sellsku);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", shopuserid=").append(shopuserid);
        sb.append(", numforus=").append(numforus);
        sb.append(", numforau=").append(numforau);
        sb.append(", numforuk=").append(numforuk);
        sb.append(", numforca=").append(numforca);
        sb.append(", numforde=").append(numforde);
        sb.append(", temporary=").append(temporary);
        sb.append(", total=").append(total);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", corpid=").append(corpid);
        sb.append(", oper=").append(oper);
        sb.append(", openflag=").append(openflag);
        sb.append(", operime=").append(operime);
        sb.append(", createtime=").append(createtime);
        sb.append(", flagus=").append(flagus);
        sb.append(", flagau=").append(flagau);
        sb.append(", flaguk=").append(flaguk);
        sb.append(", flagca=").append(flagca);
        sb.append(", flagde=").append(flagde);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}