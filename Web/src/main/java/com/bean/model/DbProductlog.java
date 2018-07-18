package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductlog implements Serializable {
    private String sequenceid;

    private String sid;

    private String name;

    private String descr;

    private String oper;

    private Date opertime;

    private String filed1;

    private String filed2;

    private String filed3;

    private String filed4;

    private String filed5;

    private String filed6;

    private String filed7;

    private BigDecimal filed8;

    private BigDecimal filed9;

    private BigDecimal filed10;

    private String corpid;

    private String openflag;

    private String opertype;

    private String content;

    private String storagebinflag;

    private BigDecimal outerlength;

    private BigDecimal outerwidth;

    private BigDecimal outerhigh;

    private BigDecimal outervolume;

    private BigDecimal outergrossweight;

    private BigDecimal outernetweight;

    private String outernorms;

    private String outerlevel;

    private BigDecimal grossweight;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal high;

    private BigDecimal volume;

    private String mainsku;

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

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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

    public String getFiled4() {
        return filed4;
    }

    public void setFiled4(String filed4) {
        this.filed4 = filed4 == null ? null : filed4.trim();
    }

    public String getFiled5() {
        return filed5;
    }

    public void setFiled5(String filed5) {
        this.filed5 = filed5 == null ? null : filed5.trim();
    }

    public String getFiled6() {
        return filed6;
    }

    public void setFiled6(String filed6) {
        this.filed6 = filed6 == null ? null : filed6.trim();
    }

    public String getFiled7() {
        return filed7;
    }

    public void setFiled7(String filed7) {
        this.filed7 = filed7 == null ? null : filed7.trim();
    }

    public BigDecimal getFiled8() {
        return filed8;
    }

    public void setFiled8(BigDecimal filed8) {
        this.filed8 = filed8;
    }

    public BigDecimal getFiled9() {
        return filed9;
    }

    public void setFiled9(BigDecimal filed9) {
        this.filed9 = filed9;
    }

    public BigDecimal getFiled10() {
        return filed10;
    }

    public void setFiled10(BigDecimal filed10) {
        this.filed10 = filed10;
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

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype == null ? null : opertype.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getStoragebinflag() {
        return storagebinflag;
    }

    public void setStoragebinflag(String storagebinflag) {
        this.storagebinflag = storagebinflag == null ? null : storagebinflag.trim();
    }

    public BigDecimal getOuterlength() {
        return outerlength;
    }

    public void setOuterlength(BigDecimal outerlength) {
        this.outerlength = outerlength;
    }

    public BigDecimal getOuterwidth() {
        return outerwidth;
    }

    public void setOuterwidth(BigDecimal outerwidth) {
        this.outerwidth = outerwidth;
    }

    public BigDecimal getOuterhigh() {
        return outerhigh;
    }

    public void setOuterhigh(BigDecimal outerhigh) {
        this.outerhigh = outerhigh;
    }

    public BigDecimal getOutervolume() {
        return outervolume;
    }

    public void setOutervolume(BigDecimal outervolume) {
        this.outervolume = outervolume;
    }

    public BigDecimal getOutergrossweight() {
        return outergrossweight;
    }

    public void setOutergrossweight(BigDecimal outergrossweight) {
        this.outergrossweight = outergrossweight;
    }

    public BigDecimal getOuternetweight() {
        return outernetweight;
    }

    public void setOuternetweight(BigDecimal outernetweight) {
        this.outernetweight = outernetweight;
    }

    public String getOuternorms() {
        return outernorms;
    }

    public void setOuternorms(String outernorms) {
        this.outernorms = outernorms == null ? null : outernorms.trim();
    }

    public String getOuterlevel() {
        return outerlevel;
    }

    public void setOuterlevel(String outerlevel) {
        this.outerlevel = outerlevel == null ? null : outerlevel.trim();
    }

    public BigDecimal getGrossweight() {
        return grossweight;
    }

    public void setGrossweight(BigDecimal grossweight) {
        this.grossweight = grossweight;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getMainsku() {
        return mainsku;
    }

    public void setMainsku(String mainsku) {
        this.mainsku = mainsku == null ? null : mainsku.trim();
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
        DbProductlog other = (DbProductlog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getFiled6() == null ? other.getFiled6() == null : this.getFiled6().equals(other.getFiled6()))
            && (this.getFiled7() == null ? other.getFiled7() == null : this.getFiled7().equals(other.getFiled7()))
            && (this.getFiled8() == null ? other.getFiled8() == null : this.getFiled8().equals(other.getFiled8()))
            && (this.getFiled9() == null ? other.getFiled9() == null : this.getFiled9().equals(other.getFiled9()))
            && (this.getFiled10() == null ? other.getFiled10() == null : this.getFiled10().equals(other.getFiled10()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getStoragebinflag() == null ? other.getStoragebinflag() == null : this.getStoragebinflag().equals(other.getStoragebinflag()))
            && (this.getOuterlength() == null ? other.getOuterlength() == null : this.getOuterlength().equals(other.getOuterlength()))
            && (this.getOuterwidth() == null ? other.getOuterwidth() == null : this.getOuterwidth().equals(other.getOuterwidth()))
            && (this.getOuterhigh() == null ? other.getOuterhigh() == null : this.getOuterhigh().equals(other.getOuterhigh()))
            && (this.getOutervolume() == null ? other.getOutervolume() == null : this.getOutervolume().equals(other.getOutervolume()))
            && (this.getOutergrossweight() == null ? other.getOutergrossweight() == null : this.getOutergrossweight().equals(other.getOutergrossweight()))
            && (this.getOuternetweight() == null ? other.getOuternetweight() == null : this.getOuternetweight().equals(other.getOuternetweight()))
            && (this.getOuternorms() == null ? other.getOuternorms() == null : this.getOuternorms().equals(other.getOuternorms()))
            && (this.getOuterlevel() == null ? other.getOuterlevel() == null : this.getOuterlevel().equals(other.getOuterlevel()))
            && (this.getGrossweight() == null ? other.getGrossweight() == null : this.getGrossweight().equals(other.getGrossweight()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getMainsku() == null ? other.getMainsku() == null : this.getMainsku().equals(other.getMainsku()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getFiled6() == null) ? 0 : getFiled6().hashCode());
        result = prime * result + ((getFiled7() == null) ? 0 : getFiled7().hashCode());
        result = prime * result + ((getFiled8() == null) ? 0 : getFiled8().hashCode());
        result = prime * result + ((getFiled9() == null) ? 0 : getFiled9().hashCode());
        result = prime * result + ((getFiled10() == null) ? 0 : getFiled10().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getStoragebinflag() == null) ? 0 : getStoragebinflag().hashCode());
        result = prime * result + ((getOuterlength() == null) ? 0 : getOuterlength().hashCode());
        result = prime * result + ((getOuterwidth() == null) ? 0 : getOuterwidth().hashCode());
        result = prime * result + ((getOuterhigh() == null) ? 0 : getOuterhigh().hashCode());
        result = prime * result + ((getOutervolume() == null) ? 0 : getOutervolume().hashCode());
        result = prime * result + ((getOutergrossweight() == null) ? 0 : getOutergrossweight().hashCode());
        result = prime * result + ((getOuternetweight() == null) ? 0 : getOuternetweight().hashCode());
        result = prime * result + ((getOuternorms() == null) ? 0 : getOuternorms().hashCode());
        result = prime * result + ((getOuterlevel() == null) ? 0 : getOuterlevel().hashCode());
        result = prime * result + ((getGrossweight() == null) ? 0 : getGrossweight().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getMainsku() == null) ? 0 : getMainsku().hashCode());
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
        sb.append(", descr=").append(descr);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", filed4=").append(filed4);
        sb.append(", filed5=").append(filed5);
        sb.append(", filed6=").append(filed6);
        sb.append(", filed7=").append(filed7);
        sb.append(", filed8=").append(filed8);
        sb.append(", filed9=").append(filed9);
        sb.append(", filed10=").append(filed10);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", opertype=").append(opertype);
        sb.append(", content=").append(content);
        sb.append(", storagebinflag=").append(storagebinflag);
        sb.append(", outerlength=").append(outerlength);
        sb.append(", outerwidth=").append(outerwidth);
        sb.append(", outerhigh=").append(outerhigh);
        sb.append(", outervolume=").append(outervolume);
        sb.append(", outergrossweight=").append(outergrossweight);
        sb.append(", outernetweight=").append(outernetweight);
        sb.append(", outernorms=").append(outernorms);
        sb.append(", outerlevel=").append(outerlevel);
        sb.append(", grossweight=").append(grossweight);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", high=").append(high);
        sb.append(", volume=").append(volume);
        sb.append(", mainsku=").append(mainsku);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}