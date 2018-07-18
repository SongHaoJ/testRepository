package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSalesdata implements Serializable {
    private BigDecimal sid;

    private String ebayitemid;

    private String ebaysku;

    private String ebaycategoryid;

    private String ebaycategoryname;

    private String ebayuserid;

    private String ebayshopid;

    private BigDecimal hitcount;

    private String ebaystarttimestr;

    private String numoda;

    private String ebaymoneytype;

    private BigDecimal ebaybuyitnewprice;

    private String selloper;

    private BigDecimal quantitysold1;

    private BigDecimal quantitysold7;

    private BigDecimal quantitysold14;

    private BigDecimal quantitysold21;

    private BigDecimal quantitysold28;

    private BigDecimal quantitysold56;

    private BigDecimal quantitysold;

    private BigDecimal quantitysoldavg;

    private BigDecimal hitcount1;

    private BigDecimal hitcount7;

    private BigDecimal hitcount14;

    private BigDecimal hitcount21;

    private BigDecimal hitcount28;

    private BigDecimal hitcount56;

    private String corpid;

    private String oper;

    private Date opertime;

    private Date createtime;

    private BigDecimal flag;

    private String ebaytitle;

    private String ebayshopname;

    private String ebaylocation;

    private String ebaygalleryurl;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public String getEbaysku() {
        return ebaysku;
    }

    public void setEbaysku(String ebaysku) {
        this.ebaysku = ebaysku == null ? null : ebaysku.trim();
    }

    public String getEbaycategoryid() {
        return ebaycategoryid;
    }

    public void setEbaycategoryid(String ebaycategoryid) {
        this.ebaycategoryid = ebaycategoryid == null ? null : ebaycategoryid.trim();
    }

    public String getEbaycategoryname() {
        return ebaycategoryname;
    }

    public void setEbaycategoryname(String ebaycategoryname) {
        this.ebaycategoryname = ebaycategoryname == null ? null : ebaycategoryname.trim();
    }

    public String getEbayuserid() {
        return ebayuserid;
    }

    public void setEbayuserid(String ebayuserid) {
        this.ebayuserid = ebayuserid == null ? null : ebayuserid.trim();
    }

    public String getEbayshopid() {
        return ebayshopid;
    }

    public void setEbayshopid(String ebayshopid) {
        this.ebayshopid = ebayshopid == null ? null : ebayshopid.trim();
    }

    public BigDecimal getHitcount() {
        return hitcount;
    }

    public void setHitcount(BigDecimal hitcount) {
        this.hitcount = hitcount;
    }

    public String getEbaystarttimestr() {
        return ebaystarttimestr;
    }

    public void setEbaystarttimestr(String ebaystarttimestr) {
        this.ebaystarttimestr = ebaystarttimestr == null ? null : ebaystarttimestr.trim();
    }

    public String getNumoda() {
        return numoda;
    }

    public void setNumoda(String numoda) {
        this.numoda = numoda == null ? null : numoda.trim();
    }

    public String getEbaymoneytype() {
        return ebaymoneytype;
    }

    public void setEbaymoneytype(String ebaymoneytype) {
        this.ebaymoneytype = ebaymoneytype == null ? null : ebaymoneytype.trim();
    }

    public BigDecimal getEbaybuyitnewprice() {
        return ebaybuyitnewprice;
    }

    public void setEbaybuyitnewprice(BigDecimal ebaybuyitnewprice) {
        this.ebaybuyitnewprice = ebaybuyitnewprice;
    }

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public BigDecimal getQuantitysold1() {
        return quantitysold1;
    }

    public void setQuantitysold1(BigDecimal quantitysold1) {
        this.quantitysold1 = quantitysold1;
    }

    public BigDecimal getQuantitysold7() {
        return quantitysold7;
    }

    public void setQuantitysold7(BigDecimal quantitysold7) {
        this.quantitysold7 = quantitysold7;
    }

    public BigDecimal getQuantitysold14() {
        return quantitysold14;
    }

    public void setQuantitysold14(BigDecimal quantitysold14) {
        this.quantitysold14 = quantitysold14;
    }

    public BigDecimal getQuantitysold21() {
        return quantitysold21;
    }

    public void setQuantitysold21(BigDecimal quantitysold21) {
        this.quantitysold21 = quantitysold21;
    }

    public BigDecimal getQuantitysold28() {
        return quantitysold28;
    }

    public void setQuantitysold28(BigDecimal quantitysold28) {
        this.quantitysold28 = quantitysold28;
    }

    public BigDecimal getQuantitysold56() {
        return quantitysold56;
    }

    public void setQuantitysold56(BigDecimal quantitysold56) {
        this.quantitysold56 = quantitysold56;
    }

    public BigDecimal getQuantitysold() {
        return quantitysold;
    }

    public void setQuantitysold(BigDecimal quantitysold) {
        this.quantitysold = quantitysold;
    }

    public BigDecimal getQuantitysoldavg() {
        return quantitysoldavg;
    }

    public void setQuantitysoldavg(BigDecimal quantitysoldavg) {
        this.quantitysoldavg = quantitysoldavg;
    }

    public BigDecimal getHitcount1() {
        return hitcount1;
    }

    public void setHitcount1(BigDecimal hitcount1) {
        this.hitcount1 = hitcount1;
    }

    public BigDecimal getHitcount7() {
        return hitcount7;
    }

    public void setHitcount7(BigDecimal hitcount7) {
        this.hitcount7 = hitcount7;
    }

    public BigDecimal getHitcount14() {
        return hitcount14;
    }

    public void setHitcount14(BigDecimal hitcount14) {
        this.hitcount14 = hitcount14;
    }

    public BigDecimal getHitcount21() {
        return hitcount21;
    }

    public void setHitcount21(BigDecimal hitcount21) {
        this.hitcount21 = hitcount21;
    }

    public BigDecimal getHitcount28() {
        return hitcount28;
    }

    public void setHitcount28(BigDecimal hitcount28) {
        this.hitcount28 = hitcount28;
    }

    public BigDecimal getHitcount56() {
        return hitcount56;
    }

    public void setHitcount56(BigDecimal hitcount56) {
        this.hitcount56 = hitcount56;
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

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getEbaytitle() {
        return ebaytitle;
    }

    public void setEbaytitle(String ebaytitle) {
        this.ebaytitle = ebaytitle == null ? null : ebaytitle.trim();
    }

    public String getEbayshopname() {
        return ebayshopname;
    }

    public void setEbayshopname(String ebayshopname) {
        this.ebayshopname = ebayshopname == null ? null : ebayshopname.trim();
    }

    public String getEbaylocation() {
        return ebaylocation;
    }

    public void setEbaylocation(String ebaylocation) {
        this.ebaylocation = ebaylocation == null ? null : ebaylocation.trim();
    }

    public String getEbaygalleryurl() {
        return ebaygalleryurl;
    }

    public void setEbaygalleryurl(String ebaygalleryurl) {
        this.ebaygalleryurl = ebaygalleryurl == null ? null : ebaygalleryurl.trim();
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
        DbSalesdata other = (DbSalesdata) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbaysku() == null ? other.getEbaysku() == null : this.getEbaysku().equals(other.getEbaysku()))
            && (this.getEbaycategoryid() == null ? other.getEbaycategoryid() == null : this.getEbaycategoryid().equals(other.getEbaycategoryid()))
            && (this.getEbaycategoryname() == null ? other.getEbaycategoryname() == null : this.getEbaycategoryname().equals(other.getEbaycategoryname()))
            && (this.getEbayuserid() == null ? other.getEbayuserid() == null : this.getEbayuserid().equals(other.getEbayuserid()))
            && (this.getEbayshopid() == null ? other.getEbayshopid() == null : this.getEbayshopid().equals(other.getEbayshopid()))
            && (this.getHitcount() == null ? other.getHitcount() == null : this.getHitcount().equals(other.getHitcount()))
            && (this.getEbaystarttimestr() == null ? other.getEbaystarttimestr() == null : this.getEbaystarttimestr().equals(other.getEbaystarttimestr()))
            && (this.getNumoda() == null ? other.getNumoda() == null : this.getNumoda().equals(other.getNumoda()))
            && (this.getEbaymoneytype() == null ? other.getEbaymoneytype() == null : this.getEbaymoneytype().equals(other.getEbaymoneytype()))
            && (this.getEbaybuyitnewprice() == null ? other.getEbaybuyitnewprice() == null : this.getEbaybuyitnewprice().equals(other.getEbaybuyitnewprice()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getQuantitysold1() == null ? other.getQuantitysold1() == null : this.getQuantitysold1().equals(other.getQuantitysold1()))
            && (this.getQuantitysold7() == null ? other.getQuantitysold7() == null : this.getQuantitysold7().equals(other.getQuantitysold7()))
            && (this.getQuantitysold14() == null ? other.getQuantitysold14() == null : this.getQuantitysold14().equals(other.getQuantitysold14()))
            && (this.getQuantitysold21() == null ? other.getQuantitysold21() == null : this.getQuantitysold21().equals(other.getQuantitysold21()))
            && (this.getQuantitysold28() == null ? other.getQuantitysold28() == null : this.getQuantitysold28().equals(other.getQuantitysold28()))
            && (this.getQuantitysold56() == null ? other.getQuantitysold56() == null : this.getQuantitysold56().equals(other.getQuantitysold56()))
            && (this.getQuantitysold() == null ? other.getQuantitysold() == null : this.getQuantitysold().equals(other.getQuantitysold()))
            && (this.getQuantitysoldavg() == null ? other.getQuantitysoldavg() == null : this.getQuantitysoldavg().equals(other.getQuantitysoldavg()))
            && (this.getHitcount1() == null ? other.getHitcount1() == null : this.getHitcount1().equals(other.getHitcount1()))
            && (this.getHitcount7() == null ? other.getHitcount7() == null : this.getHitcount7().equals(other.getHitcount7()))
            && (this.getHitcount14() == null ? other.getHitcount14() == null : this.getHitcount14().equals(other.getHitcount14()))
            && (this.getHitcount21() == null ? other.getHitcount21() == null : this.getHitcount21().equals(other.getHitcount21()))
            && (this.getHitcount28() == null ? other.getHitcount28() == null : this.getHitcount28().equals(other.getHitcount28()))
            && (this.getHitcount56() == null ? other.getHitcount56() == null : this.getHitcount56().equals(other.getHitcount56()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getEbaytitle() == null ? other.getEbaytitle() == null : this.getEbaytitle().equals(other.getEbaytitle()))
            && (this.getEbayshopname() == null ? other.getEbayshopname() == null : this.getEbayshopname().equals(other.getEbayshopname()))
            && (this.getEbaylocation() == null ? other.getEbaylocation() == null : this.getEbaylocation().equals(other.getEbaylocation()))
            && (this.getEbaygalleryurl() == null ? other.getEbaygalleryurl() == null : this.getEbaygalleryurl().equals(other.getEbaygalleryurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbaysku() == null) ? 0 : getEbaysku().hashCode());
        result = prime * result + ((getEbaycategoryid() == null) ? 0 : getEbaycategoryid().hashCode());
        result = prime * result + ((getEbaycategoryname() == null) ? 0 : getEbaycategoryname().hashCode());
        result = prime * result + ((getEbayuserid() == null) ? 0 : getEbayuserid().hashCode());
        result = prime * result + ((getEbayshopid() == null) ? 0 : getEbayshopid().hashCode());
        result = prime * result + ((getHitcount() == null) ? 0 : getHitcount().hashCode());
        result = prime * result + ((getEbaystarttimestr() == null) ? 0 : getEbaystarttimestr().hashCode());
        result = prime * result + ((getNumoda() == null) ? 0 : getNumoda().hashCode());
        result = prime * result + ((getEbaymoneytype() == null) ? 0 : getEbaymoneytype().hashCode());
        result = prime * result + ((getEbaybuyitnewprice() == null) ? 0 : getEbaybuyitnewprice().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getQuantitysold1() == null) ? 0 : getQuantitysold1().hashCode());
        result = prime * result + ((getQuantitysold7() == null) ? 0 : getQuantitysold7().hashCode());
        result = prime * result + ((getQuantitysold14() == null) ? 0 : getQuantitysold14().hashCode());
        result = prime * result + ((getQuantitysold21() == null) ? 0 : getQuantitysold21().hashCode());
        result = prime * result + ((getQuantitysold28() == null) ? 0 : getQuantitysold28().hashCode());
        result = prime * result + ((getQuantitysold56() == null) ? 0 : getQuantitysold56().hashCode());
        result = prime * result + ((getQuantitysold() == null) ? 0 : getQuantitysold().hashCode());
        result = prime * result + ((getQuantitysoldavg() == null) ? 0 : getQuantitysoldavg().hashCode());
        result = prime * result + ((getHitcount1() == null) ? 0 : getHitcount1().hashCode());
        result = prime * result + ((getHitcount7() == null) ? 0 : getHitcount7().hashCode());
        result = prime * result + ((getHitcount14() == null) ? 0 : getHitcount14().hashCode());
        result = prime * result + ((getHitcount21() == null) ? 0 : getHitcount21().hashCode());
        result = prime * result + ((getHitcount28() == null) ? 0 : getHitcount28().hashCode());
        result = prime * result + ((getHitcount56() == null) ? 0 : getHitcount56().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getEbaytitle() == null) ? 0 : getEbaytitle().hashCode());
        result = prime * result + ((getEbayshopname() == null) ? 0 : getEbayshopname().hashCode());
        result = prime * result + ((getEbaylocation() == null) ? 0 : getEbaylocation().hashCode());
        result = prime * result + ((getEbaygalleryurl() == null) ? 0 : getEbaygalleryurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebaysku=").append(ebaysku);
        sb.append(", ebaycategoryid=").append(ebaycategoryid);
        sb.append(", ebaycategoryname=").append(ebaycategoryname);
        sb.append(", ebayuserid=").append(ebayuserid);
        sb.append(", ebayshopid=").append(ebayshopid);
        sb.append(", hitcount=").append(hitcount);
        sb.append(", ebaystarttimestr=").append(ebaystarttimestr);
        sb.append(", numoda=").append(numoda);
        sb.append(", ebaymoneytype=").append(ebaymoneytype);
        sb.append(", ebaybuyitnewprice=").append(ebaybuyitnewprice);
        sb.append(", selloper=").append(selloper);
        sb.append(", quantitysold1=").append(quantitysold1);
        sb.append(", quantitysold7=").append(quantitysold7);
        sb.append(", quantitysold14=").append(quantitysold14);
        sb.append(", quantitysold21=").append(quantitysold21);
        sb.append(", quantitysold28=").append(quantitysold28);
        sb.append(", quantitysold56=").append(quantitysold56);
        sb.append(", quantitysold=").append(quantitysold);
        sb.append(", quantitysoldavg=").append(quantitysoldavg);
        sb.append(", hitcount1=").append(hitcount1);
        sb.append(", hitcount7=").append(hitcount7);
        sb.append(", hitcount14=").append(hitcount14);
        sb.append(", hitcount21=").append(hitcount21);
        sb.append(", hitcount28=").append(hitcount28);
        sb.append(", hitcount56=").append(hitcount56);
        sb.append(", corpid=").append(corpid);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createtime=").append(createtime);
        sb.append(", flag=").append(flag);
        sb.append(", ebaytitle=").append(ebaytitle);
        sb.append(", ebayshopname=").append(ebayshopname);
        sb.append(", ebaylocation=").append(ebaylocation);
        sb.append(", ebaygalleryurl=").append(ebaygalleryurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}