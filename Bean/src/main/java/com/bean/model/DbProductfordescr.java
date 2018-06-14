package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductfordescr implements Serializable {
    private BigDecimal sequenceid;

    private String oper;

    private Date opertime;

    private String corpid;

    private Date createtime;

    private String sellsku;

    private String language;

    private Integer reserve2;

    private BigDecimal reserve3;

    private Date reserve4;

    private String descr;

    private String reserve1;

    private String descr2;

    private String descr3;

    private String descr4;

    private String descr5;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSellsku() {
        return sellsku;
    }

    public void setSellsku(String sellsku) {
        this.sellsku = sellsku == null ? null : sellsku.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getReserve2() {
        return reserve2;
    }

    public void setReserve2(Integer reserve2) {
        this.reserve2 = reserve2;
    }

    public BigDecimal getReserve3() {
        return reserve3;
    }

    public void setReserve3(BigDecimal reserve3) {
        this.reserve3 = reserve3;
    }

    public Date getReserve4() {
        return reserve4;
    }

    public void setReserve4(Date reserve4) {
        this.reserve4 = reserve4;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getDescr2() {
        return descr2;
    }

    public void setDescr2(String descr2) {
        this.descr2 = descr2 == null ? null : descr2.trim();
    }

    public String getDescr3() {
        return descr3;
    }

    public void setDescr3(String descr3) {
        this.descr3 = descr3 == null ? null : descr3.trim();
    }

    public String getDescr4() {
        return descr4;
    }

    public void setDescr4(String descr4) {
        this.descr4 = descr4 == null ? null : descr4.trim();
    }

    public String getDescr5() {
        return descr5;
    }

    public void setDescr5(String descr5) {
        this.descr5 = descr5 == null ? null : descr5.trim();
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
        DbProductfordescr other = (DbProductfordescr) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSellsku() == null ? other.getSellsku() == null : this.getSellsku().equals(other.getSellsku()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getDescr2() == null ? other.getDescr2() == null : this.getDescr2().equals(other.getDescr2()))
            && (this.getDescr3() == null ? other.getDescr3() == null : this.getDescr3().equals(other.getDescr3()))
            && (this.getDescr4() == null ? other.getDescr4() == null : this.getDescr4().equals(other.getDescr4()))
            && (this.getDescr5() == null ? other.getDescr5() == null : this.getDescr5().equals(other.getDescr5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getSellsku() == null) ? 0 : getSellsku().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getDescr2() == null) ? 0 : getDescr2().hashCode());
        result = prime * result + ((getDescr3() == null) ? 0 : getDescr3().hashCode());
        result = prime * result + ((getDescr4() == null) ? 0 : getDescr4().hashCode());
        result = prime * result + ((getDescr5() == null) ? 0 : getDescr5().hashCode());
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
        sb.append(", corpid=").append(corpid);
        sb.append(", createtime=").append(createtime);
        sb.append(", sellsku=").append(sellsku);
        sb.append(", language=").append(language);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", descr=").append(descr);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", descr2=").append(descr2);
        sb.append(", descr3=").append(descr3);
        sb.append(", descr4=").append(descr4);
        sb.append(", descr5=").append(descr5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}