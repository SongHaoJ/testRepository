package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbNewitemresult implements Serializable {
    private String sid;

    private String productindex;

    private String itemid;

    private BigDecimal ebaybuyitnewprice;

    private String ebaybuyitnewpricemoneytype;

    private String ebaycountry;

    private BigDecimal ebayhitcount;

    private String ebayitemid;

    private Date ebaystarttime;

    private Date ebayendtime;

    private String ebayhasreserveprice;

    private String ebayitemurl;

    private String ebaylistduration;

    private String ebaylocation;

    private String ebaygallerytype;

    private String ebaygalleryurl;

    private String ebayphotodisplay;

    private String ebaypicturesource;

    private String ebaycategoryid;

    private String ebaycategoryname;

    private BigDecimal ebayquantity;

    private BigDecimal ebayquantitysold;

    private BigDecimal ebayfeedbackscore;

    private BigDecimal ebaypositivefeedbackpercent;

    private String ebaysellerbusinesstype;

    private String ebaystorefront;

    private String ebaystoreurl;

    private String ebaysite;

    private String ebaystatus;

    private String ebayuserid;

    private String ebayuseridchanged;

    private String ebaysku;

    private BigDecimal ebaystartprice;

    private BigDecimal ebayddleft;

    private BigDecimal ebayhhleft;

    private BigDecimal ebaymmleft;

    private BigDecimal flag;

    private String corpid;

    private String oper;

    private Date opertime;

    private Date updatetime;

    private Date createtime;

    private BigDecimal priceflag;

    private BigDecimal titleflag;

    private BigDecimal pictrueflag;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private Date reserve11;

    private Date reserve12;

    private Date reserve13;

    private BigDecimal reserve14;

    private BigDecimal reserve15;

    private BigDecimal reserve16;

    private BigDecimal showflag;

    private BigDecimal sellnumberavgoneday;

    private BigDecimal sellnumberday;

    private BigDecimal sellnumberweek;

    private BigDecimal sellnumbermonth;

    private BigDecimal sellnumbertotal;

    private BigDecimal sellnumberavg;

    private BigDecimal sellnumbersite;

    private BigDecimal downcount;

    private String enmityid;

    private BigDecimal threedaysnum;

    private String expressmoneytype1;

    private String expressmoneytype2;

    private String expressmoneytype3;

    private String expressmoneytype4;

    private BigDecimal internationalexpress1;

    private BigDecimal internationalexpress2;

    private BigDecimal express1;

    private BigDecimal express2;

    private BigDecimal weekhitcounter;

    private BigDecimal monthhitcounter;

    private BigDecimal hitcounterall;

    private BigDecimal weektransformrate;

    private BigDecimal monthtransformrate;

    private BigDecimal totalttransformrate;

    private BigDecimal expressflag1;

    private BigDecimal expressflag2;

    private BigDecimal expressflag3;

    private BigDecimal expressflag4;

    private String createoper;

    private String calculateflag;

    private BigDecimal fixfee;

    private BigDecimal bidfee;

    private String ebaydescription;

    private String ebayfeedbacktatingstar;

    private String ebaytitle;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getProductindex() {
        return productindex;
    }

    public void setProductindex(String productindex) {
        this.productindex = productindex == null ? null : productindex.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public BigDecimal getEbaybuyitnewprice() {
        return ebaybuyitnewprice;
    }

    public void setEbaybuyitnewprice(BigDecimal ebaybuyitnewprice) {
        this.ebaybuyitnewprice = ebaybuyitnewprice;
    }

    public String getEbaybuyitnewpricemoneytype() {
        return ebaybuyitnewpricemoneytype;
    }

    public void setEbaybuyitnewpricemoneytype(String ebaybuyitnewpricemoneytype) {
        this.ebaybuyitnewpricemoneytype = ebaybuyitnewpricemoneytype == null ? null : ebaybuyitnewpricemoneytype.trim();
    }

    public String getEbaycountry() {
        return ebaycountry;
    }

    public void setEbaycountry(String ebaycountry) {
        this.ebaycountry = ebaycountry == null ? null : ebaycountry.trim();
    }

    public BigDecimal getEbayhitcount() {
        return ebayhitcount;
    }

    public void setEbayhitcount(BigDecimal ebayhitcount) {
        this.ebayhitcount = ebayhitcount;
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public Date getEbaystarttime() {
        return ebaystarttime;
    }

    public void setEbaystarttime(Date ebaystarttime) {
        this.ebaystarttime = ebaystarttime;
    }

    public Date getEbayendtime() {
        return ebayendtime;
    }

    public void setEbayendtime(Date ebayendtime) {
        this.ebayendtime = ebayendtime;
    }

    public String getEbayhasreserveprice() {
        return ebayhasreserveprice;
    }

    public void setEbayhasreserveprice(String ebayhasreserveprice) {
        this.ebayhasreserveprice = ebayhasreserveprice == null ? null : ebayhasreserveprice.trim();
    }

    public String getEbayitemurl() {
        return ebayitemurl;
    }

    public void setEbayitemurl(String ebayitemurl) {
        this.ebayitemurl = ebayitemurl == null ? null : ebayitemurl.trim();
    }

    public String getEbaylistduration() {
        return ebaylistduration;
    }

    public void setEbaylistduration(String ebaylistduration) {
        this.ebaylistduration = ebaylistduration == null ? null : ebaylistduration.trim();
    }

    public String getEbaylocation() {
        return ebaylocation;
    }

    public void setEbaylocation(String ebaylocation) {
        this.ebaylocation = ebaylocation == null ? null : ebaylocation.trim();
    }

    public String getEbaygallerytype() {
        return ebaygallerytype;
    }

    public void setEbaygallerytype(String ebaygallerytype) {
        this.ebaygallerytype = ebaygallerytype == null ? null : ebaygallerytype.trim();
    }

    public String getEbaygalleryurl() {
        return ebaygalleryurl;
    }

    public void setEbaygalleryurl(String ebaygalleryurl) {
        this.ebaygalleryurl = ebaygalleryurl == null ? null : ebaygalleryurl.trim();
    }

    public String getEbayphotodisplay() {
        return ebayphotodisplay;
    }

    public void setEbayphotodisplay(String ebayphotodisplay) {
        this.ebayphotodisplay = ebayphotodisplay == null ? null : ebayphotodisplay.trim();
    }

    public String getEbaypicturesource() {
        return ebaypicturesource;
    }

    public void setEbaypicturesource(String ebaypicturesource) {
        this.ebaypicturesource = ebaypicturesource == null ? null : ebaypicturesource.trim();
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

    public BigDecimal getEbayquantity() {
        return ebayquantity;
    }

    public void setEbayquantity(BigDecimal ebayquantity) {
        this.ebayquantity = ebayquantity;
    }

    public BigDecimal getEbayquantitysold() {
        return ebayquantitysold;
    }

    public void setEbayquantitysold(BigDecimal ebayquantitysold) {
        this.ebayquantitysold = ebayquantitysold;
    }

    public BigDecimal getEbayfeedbackscore() {
        return ebayfeedbackscore;
    }

    public void setEbayfeedbackscore(BigDecimal ebayfeedbackscore) {
        this.ebayfeedbackscore = ebayfeedbackscore;
    }

    public BigDecimal getEbaypositivefeedbackpercent() {
        return ebaypositivefeedbackpercent;
    }

    public void setEbaypositivefeedbackpercent(BigDecimal ebaypositivefeedbackpercent) {
        this.ebaypositivefeedbackpercent = ebaypositivefeedbackpercent;
    }

    public String getEbaysellerbusinesstype() {
        return ebaysellerbusinesstype;
    }

    public void setEbaysellerbusinesstype(String ebaysellerbusinesstype) {
        this.ebaysellerbusinesstype = ebaysellerbusinesstype == null ? null : ebaysellerbusinesstype.trim();
    }

    public String getEbaystorefront() {
        return ebaystorefront;
    }

    public void setEbaystorefront(String ebaystorefront) {
        this.ebaystorefront = ebaystorefront == null ? null : ebaystorefront.trim();
    }

    public String getEbaystoreurl() {
        return ebaystoreurl;
    }

    public void setEbaystoreurl(String ebaystoreurl) {
        this.ebaystoreurl = ebaystoreurl == null ? null : ebaystoreurl.trim();
    }

    public String getEbaysite() {
        return ebaysite;
    }

    public void setEbaysite(String ebaysite) {
        this.ebaysite = ebaysite == null ? null : ebaysite.trim();
    }

    public String getEbaystatus() {
        return ebaystatus;
    }

    public void setEbaystatus(String ebaystatus) {
        this.ebaystatus = ebaystatus == null ? null : ebaystatus.trim();
    }

    public String getEbayuserid() {
        return ebayuserid;
    }

    public void setEbayuserid(String ebayuserid) {
        this.ebayuserid = ebayuserid == null ? null : ebayuserid.trim();
    }

    public String getEbayuseridchanged() {
        return ebayuseridchanged;
    }

    public void setEbayuseridchanged(String ebayuseridchanged) {
        this.ebayuseridchanged = ebayuseridchanged == null ? null : ebayuseridchanged.trim();
    }

    public String getEbaysku() {
        return ebaysku;
    }

    public void setEbaysku(String ebaysku) {
        this.ebaysku = ebaysku == null ? null : ebaysku.trim();
    }

    public BigDecimal getEbaystartprice() {
        return ebaystartprice;
    }

    public void setEbaystartprice(BigDecimal ebaystartprice) {
        this.ebaystartprice = ebaystartprice;
    }

    public BigDecimal getEbayddleft() {
        return ebayddleft;
    }

    public void setEbayddleft(BigDecimal ebayddleft) {
        this.ebayddleft = ebayddleft;
    }

    public BigDecimal getEbayhhleft() {
        return ebayhhleft;
    }

    public void setEbayhhleft(BigDecimal ebayhhleft) {
        this.ebayhhleft = ebayhhleft;
    }

    public BigDecimal getEbaymmleft() {
        return ebaymmleft;
    }

    public void setEbaymmleft(BigDecimal ebaymmleft) {
        this.ebaymmleft = ebaymmleft;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getPriceflag() {
        return priceflag;
    }

    public void setPriceflag(BigDecimal priceflag) {
        this.priceflag = priceflag;
    }

    public BigDecimal getTitleflag() {
        return titleflag;
    }

    public void setTitleflag(BigDecimal titleflag) {
        this.titleflag = titleflag;
    }

    public BigDecimal getPictrueflag() {
        return pictrueflag;
    }

    public void setPictrueflag(BigDecimal pictrueflag) {
        this.pictrueflag = pictrueflag;
    }

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public BigDecimal getReserve6() {
        return reserve6;
    }

    public void setReserve6(BigDecimal reserve6) {
        this.reserve6 = reserve6;
    }

    public BigDecimal getReserve7() {
        return reserve7;
    }

    public void setReserve7(BigDecimal reserve7) {
        this.reserve7 = reserve7;
    }

    public BigDecimal getReserve8() {
        return reserve8;
    }

    public void setReserve8(BigDecimal reserve8) {
        this.reserve8 = reserve8;
    }

    public BigDecimal getReserve9() {
        return reserve9;
    }

    public void setReserve9(BigDecimal reserve9) {
        this.reserve9 = reserve9;
    }

    public BigDecimal getReserve10() {
        return reserve10;
    }

    public void setReserve10(BigDecimal reserve10) {
        this.reserve10 = reserve10;
    }

    public Date getReserve11() {
        return reserve11;
    }

    public void setReserve11(Date reserve11) {
        this.reserve11 = reserve11;
    }

    public Date getReserve12() {
        return reserve12;
    }

    public void setReserve12(Date reserve12) {
        this.reserve12 = reserve12;
    }

    public Date getReserve13() {
        return reserve13;
    }

    public void setReserve13(Date reserve13) {
        this.reserve13 = reserve13;
    }

    public BigDecimal getReserve14() {
        return reserve14;
    }

    public void setReserve14(BigDecimal reserve14) {
        this.reserve14 = reserve14;
    }

    public BigDecimal getReserve15() {
        return reserve15;
    }

    public void setReserve15(BigDecimal reserve15) {
        this.reserve15 = reserve15;
    }

    public BigDecimal getReserve16() {
        return reserve16;
    }

    public void setReserve16(BigDecimal reserve16) {
        this.reserve16 = reserve16;
    }

    public BigDecimal getShowflag() {
        return showflag;
    }

    public void setShowflag(BigDecimal showflag) {
        this.showflag = showflag;
    }

    public BigDecimal getSellnumberavgoneday() {
        return sellnumberavgoneday;
    }

    public void setSellnumberavgoneday(BigDecimal sellnumberavgoneday) {
        this.sellnumberavgoneday = sellnumberavgoneday;
    }

    public BigDecimal getSellnumberday() {
        return sellnumberday;
    }

    public void setSellnumberday(BigDecimal sellnumberday) {
        this.sellnumberday = sellnumberday;
    }

    public BigDecimal getSellnumberweek() {
        return sellnumberweek;
    }

    public void setSellnumberweek(BigDecimal sellnumberweek) {
        this.sellnumberweek = sellnumberweek;
    }

    public BigDecimal getSellnumbermonth() {
        return sellnumbermonth;
    }

    public void setSellnumbermonth(BigDecimal sellnumbermonth) {
        this.sellnumbermonth = sellnumbermonth;
    }

    public BigDecimal getSellnumbertotal() {
        return sellnumbertotal;
    }

    public void setSellnumbertotal(BigDecimal sellnumbertotal) {
        this.sellnumbertotal = sellnumbertotal;
    }

    public BigDecimal getSellnumberavg() {
        return sellnumberavg;
    }

    public void setSellnumberavg(BigDecimal sellnumberavg) {
        this.sellnumberavg = sellnumberavg;
    }

    public BigDecimal getSellnumbersite() {
        return sellnumbersite;
    }

    public void setSellnumbersite(BigDecimal sellnumbersite) {
        this.sellnumbersite = sellnumbersite;
    }

    public BigDecimal getDowncount() {
        return downcount;
    }

    public void setDowncount(BigDecimal downcount) {
        this.downcount = downcount;
    }

    public String getEnmityid() {
        return enmityid;
    }

    public void setEnmityid(String enmityid) {
        this.enmityid = enmityid == null ? null : enmityid.trim();
    }

    public BigDecimal getThreedaysnum() {
        return threedaysnum;
    }

    public void setThreedaysnum(BigDecimal threedaysnum) {
        this.threedaysnum = threedaysnum;
    }

    public String getExpressmoneytype1() {
        return expressmoneytype1;
    }

    public void setExpressmoneytype1(String expressmoneytype1) {
        this.expressmoneytype1 = expressmoneytype1 == null ? null : expressmoneytype1.trim();
    }

    public String getExpressmoneytype2() {
        return expressmoneytype2;
    }

    public void setExpressmoneytype2(String expressmoneytype2) {
        this.expressmoneytype2 = expressmoneytype2 == null ? null : expressmoneytype2.trim();
    }

    public String getExpressmoneytype3() {
        return expressmoneytype3;
    }

    public void setExpressmoneytype3(String expressmoneytype3) {
        this.expressmoneytype3 = expressmoneytype3 == null ? null : expressmoneytype3.trim();
    }

    public String getExpressmoneytype4() {
        return expressmoneytype4;
    }

    public void setExpressmoneytype4(String expressmoneytype4) {
        this.expressmoneytype4 = expressmoneytype4 == null ? null : expressmoneytype4.trim();
    }

    public BigDecimal getInternationalexpress1() {
        return internationalexpress1;
    }

    public void setInternationalexpress1(BigDecimal internationalexpress1) {
        this.internationalexpress1 = internationalexpress1;
    }

    public BigDecimal getInternationalexpress2() {
        return internationalexpress2;
    }

    public void setInternationalexpress2(BigDecimal internationalexpress2) {
        this.internationalexpress2 = internationalexpress2;
    }

    public BigDecimal getExpress1() {
        return express1;
    }

    public void setExpress1(BigDecimal express1) {
        this.express1 = express1;
    }

    public BigDecimal getExpress2() {
        return express2;
    }

    public void setExpress2(BigDecimal express2) {
        this.express2 = express2;
    }

    public BigDecimal getWeekhitcounter() {
        return weekhitcounter;
    }

    public void setWeekhitcounter(BigDecimal weekhitcounter) {
        this.weekhitcounter = weekhitcounter;
    }

    public BigDecimal getMonthhitcounter() {
        return monthhitcounter;
    }

    public void setMonthhitcounter(BigDecimal monthhitcounter) {
        this.monthhitcounter = monthhitcounter;
    }

    public BigDecimal getHitcounterall() {
        return hitcounterall;
    }

    public void setHitcounterall(BigDecimal hitcounterall) {
        this.hitcounterall = hitcounterall;
    }

    public BigDecimal getWeektransformrate() {
        return weektransformrate;
    }

    public void setWeektransformrate(BigDecimal weektransformrate) {
        this.weektransformrate = weektransformrate;
    }

    public BigDecimal getMonthtransformrate() {
        return monthtransformrate;
    }

    public void setMonthtransformrate(BigDecimal monthtransformrate) {
        this.monthtransformrate = monthtransformrate;
    }

    public BigDecimal getTotalttransformrate() {
        return totalttransformrate;
    }

    public void setTotalttransformrate(BigDecimal totalttransformrate) {
        this.totalttransformrate = totalttransformrate;
    }

    public BigDecimal getExpressflag1() {
        return expressflag1;
    }

    public void setExpressflag1(BigDecimal expressflag1) {
        this.expressflag1 = expressflag1;
    }

    public BigDecimal getExpressflag2() {
        return expressflag2;
    }

    public void setExpressflag2(BigDecimal expressflag2) {
        this.expressflag2 = expressflag2;
    }

    public BigDecimal getExpressflag3() {
        return expressflag3;
    }

    public void setExpressflag3(BigDecimal expressflag3) {
        this.expressflag3 = expressflag3;
    }

    public BigDecimal getExpressflag4() {
        return expressflag4;
    }

    public void setExpressflag4(BigDecimal expressflag4) {
        this.expressflag4 = expressflag4;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public String getCalculateflag() {
        return calculateflag;
    }

    public void setCalculateflag(String calculateflag) {
        this.calculateflag = calculateflag == null ? null : calculateflag.trim();
    }

    public BigDecimal getFixfee() {
        return fixfee;
    }

    public void setFixfee(BigDecimal fixfee) {
        this.fixfee = fixfee;
    }

    public BigDecimal getBidfee() {
        return bidfee;
    }

    public void setBidfee(BigDecimal bidfee) {
        this.bidfee = bidfee;
    }

    public String getEbaydescription() {
        return ebaydescription;
    }

    public void setEbaydescription(String ebaydescription) {
        this.ebaydescription = ebaydescription == null ? null : ebaydescription.trim();
    }

    public String getEbayfeedbacktatingstar() {
        return ebayfeedbacktatingstar;
    }

    public void setEbayfeedbacktatingstar(String ebayfeedbacktatingstar) {
        this.ebayfeedbacktatingstar = ebayfeedbacktatingstar == null ? null : ebayfeedbacktatingstar.trim();
    }

    public String getEbaytitle() {
        return ebaytitle;
    }

    public void setEbaytitle(String ebaytitle) {
        this.ebaytitle = ebaytitle == null ? null : ebaytitle.trim();
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

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
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
        DbNewitemresult other = (DbNewitemresult) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getProductindex() == null ? other.getProductindex() == null : this.getProductindex().equals(other.getProductindex()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getEbaybuyitnewprice() == null ? other.getEbaybuyitnewprice() == null : this.getEbaybuyitnewprice().equals(other.getEbaybuyitnewprice()))
            && (this.getEbaybuyitnewpricemoneytype() == null ? other.getEbaybuyitnewpricemoneytype() == null : this.getEbaybuyitnewpricemoneytype().equals(other.getEbaybuyitnewpricemoneytype()))
            && (this.getEbaycountry() == null ? other.getEbaycountry() == null : this.getEbaycountry().equals(other.getEbaycountry()))
            && (this.getEbayhitcount() == null ? other.getEbayhitcount() == null : this.getEbayhitcount().equals(other.getEbayhitcount()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbaystarttime() == null ? other.getEbaystarttime() == null : this.getEbaystarttime().equals(other.getEbaystarttime()))
            && (this.getEbayendtime() == null ? other.getEbayendtime() == null : this.getEbayendtime().equals(other.getEbayendtime()))
            && (this.getEbayhasreserveprice() == null ? other.getEbayhasreserveprice() == null : this.getEbayhasreserveprice().equals(other.getEbayhasreserveprice()))
            && (this.getEbayitemurl() == null ? other.getEbayitemurl() == null : this.getEbayitemurl().equals(other.getEbayitemurl()))
            && (this.getEbaylistduration() == null ? other.getEbaylistduration() == null : this.getEbaylistduration().equals(other.getEbaylistduration()))
            && (this.getEbaylocation() == null ? other.getEbaylocation() == null : this.getEbaylocation().equals(other.getEbaylocation()))
            && (this.getEbaygallerytype() == null ? other.getEbaygallerytype() == null : this.getEbaygallerytype().equals(other.getEbaygallerytype()))
            && (this.getEbaygalleryurl() == null ? other.getEbaygalleryurl() == null : this.getEbaygalleryurl().equals(other.getEbaygalleryurl()))
            && (this.getEbayphotodisplay() == null ? other.getEbayphotodisplay() == null : this.getEbayphotodisplay().equals(other.getEbayphotodisplay()))
            && (this.getEbaypicturesource() == null ? other.getEbaypicturesource() == null : this.getEbaypicturesource().equals(other.getEbaypicturesource()))
            && (this.getEbaycategoryid() == null ? other.getEbaycategoryid() == null : this.getEbaycategoryid().equals(other.getEbaycategoryid()))
            && (this.getEbaycategoryname() == null ? other.getEbaycategoryname() == null : this.getEbaycategoryname().equals(other.getEbaycategoryname()))
            && (this.getEbayquantity() == null ? other.getEbayquantity() == null : this.getEbayquantity().equals(other.getEbayquantity()))
            && (this.getEbayquantitysold() == null ? other.getEbayquantitysold() == null : this.getEbayquantitysold().equals(other.getEbayquantitysold()))
            && (this.getEbayfeedbackscore() == null ? other.getEbayfeedbackscore() == null : this.getEbayfeedbackscore().equals(other.getEbayfeedbackscore()))
            && (this.getEbaypositivefeedbackpercent() == null ? other.getEbaypositivefeedbackpercent() == null : this.getEbaypositivefeedbackpercent().equals(other.getEbaypositivefeedbackpercent()))
            && (this.getEbaysellerbusinesstype() == null ? other.getEbaysellerbusinesstype() == null : this.getEbaysellerbusinesstype().equals(other.getEbaysellerbusinesstype()))
            && (this.getEbaystorefront() == null ? other.getEbaystorefront() == null : this.getEbaystorefront().equals(other.getEbaystorefront()))
            && (this.getEbaystoreurl() == null ? other.getEbaystoreurl() == null : this.getEbaystoreurl().equals(other.getEbaystoreurl()))
            && (this.getEbaysite() == null ? other.getEbaysite() == null : this.getEbaysite().equals(other.getEbaysite()))
            && (this.getEbaystatus() == null ? other.getEbaystatus() == null : this.getEbaystatus().equals(other.getEbaystatus()))
            && (this.getEbayuserid() == null ? other.getEbayuserid() == null : this.getEbayuserid().equals(other.getEbayuserid()))
            && (this.getEbayuseridchanged() == null ? other.getEbayuseridchanged() == null : this.getEbayuseridchanged().equals(other.getEbayuseridchanged()))
            && (this.getEbaysku() == null ? other.getEbaysku() == null : this.getEbaysku().equals(other.getEbaysku()))
            && (this.getEbaystartprice() == null ? other.getEbaystartprice() == null : this.getEbaystartprice().equals(other.getEbaystartprice()))
            && (this.getEbayddleft() == null ? other.getEbayddleft() == null : this.getEbayddleft().equals(other.getEbayddleft()))
            && (this.getEbayhhleft() == null ? other.getEbayhhleft() == null : this.getEbayhhleft().equals(other.getEbayhhleft()))
            && (this.getEbaymmleft() == null ? other.getEbaymmleft() == null : this.getEbaymmleft().equals(other.getEbaymmleft()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getPriceflag() == null ? other.getPriceflag() == null : this.getPriceflag().equals(other.getPriceflag()))
            && (this.getTitleflag() == null ? other.getTitleflag() == null : this.getTitleflag().equals(other.getTitleflag()))
            && (this.getPictrueflag() == null ? other.getPictrueflag() == null : this.getPictrueflag().equals(other.getPictrueflag()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getShowflag() == null ? other.getShowflag() == null : this.getShowflag().equals(other.getShowflag()))
            && (this.getSellnumberavgoneday() == null ? other.getSellnumberavgoneday() == null : this.getSellnumberavgoneday().equals(other.getSellnumberavgoneday()))
            && (this.getSellnumberday() == null ? other.getSellnumberday() == null : this.getSellnumberday().equals(other.getSellnumberday()))
            && (this.getSellnumberweek() == null ? other.getSellnumberweek() == null : this.getSellnumberweek().equals(other.getSellnumberweek()))
            && (this.getSellnumbermonth() == null ? other.getSellnumbermonth() == null : this.getSellnumbermonth().equals(other.getSellnumbermonth()))
            && (this.getSellnumbertotal() == null ? other.getSellnumbertotal() == null : this.getSellnumbertotal().equals(other.getSellnumbertotal()))
            && (this.getSellnumberavg() == null ? other.getSellnumberavg() == null : this.getSellnumberavg().equals(other.getSellnumberavg()))
            && (this.getSellnumbersite() == null ? other.getSellnumbersite() == null : this.getSellnumbersite().equals(other.getSellnumbersite()))
            && (this.getDowncount() == null ? other.getDowncount() == null : this.getDowncount().equals(other.getDowncount()))
            && (this.getEnmityid() == null ? other.getEnmityid() == null : this.getEnmityid().equals(other.getEnmityid()))
            && (this.getThreedaysnum() == null ? other.getThreedaysnum() == null : this.getThreedaysnum().equals(other.getThreedaysnum()))
            && (this.getExpressmoneytype1() == null ? other.getExpressmoneytype1() == null : this.getExpressmoneytype1().equals(other.getExpressmoneytype1()))
            && (this.getExpressmoneytype2() == null ? other.getExpressmoneytype2() == null : this.getExpressmoneytype2().equals(other.getExpressmoneytype2()))
            && (this.getExpressmoneytype3() == null ? other.getExpressmoneytype3() == null : this.getExpressmoneytype3().equals(other.getExpressmoneytype3()))
            && (this.getExpressmoneytype4() == null ? other.getExpressmoneytype4() == null : this.getExpressmoneytype4().equals(other.getExpressmoneytype4()))
            && (this.getInternationalexpress1() == null ? other.getInternationalexpress1() == null : this.getInternationalexpress1().equals(other.getInternationalexpress1()))
            && (this.getInternationalexpress2() == null ? other.getInternationalexpress2() == null : this.getInternationalexpress2().equals(other.getInternationalexpress2()))
            && (this.getExpress1() == null ? other.getExpress1() == null : this.getExpress1().equals(other.getExpress1()))
            && (this.getExpress2() == null ? other.getExpress2() == null : this.getExpress2().equals(other.getExpress2()))
            && (this.getWeekhitcounter() == null ? other.getWeekhitcounter() == null : this.getWeekhitcounter().equals(other.getWeekhitcounter()))
            && (this.getMonthhitcounter() == null ? other.getMonthhitcounter() == null : this.getMonthhitcounter().equals(other.getMonthhitcounter()))
            && (this.getHitcounterall() == null ? other.getHitcounterall() == null : this.getHitcounterall().equals(other.getHitcounterall()))
            && (this.getWeektransformrate() == null ? other.getWeektransformrate() == null : this.getWeektransformrate().equals(other.getWeektransformrate()))
            && (this.getMonthtransformrate() == null ? other.getMonthtransformrate() == null : this.getMonthtransformrate().equals(other.getMonthtransformrate()))
            && (this.getTotalttransformrate() == null ? other.getTotalttransformrate() == null : this.getTotalttransformrate().equals(other.getTotalttransformrate()))
            && (this.getExpressflag1() == null ? other.getExpressflag1() == null : this.getExpressflag1().equals(other.getExpressflag1()))
            && (this.getExpressflag2() == null ? other.getExpressflag2() == null : this.getExpressflag2().equals(other.getExpressflag2()))
            && (this.getExpressflag3() == null ? other.getExpressflag3() == null : this.getExpressflag3().equals(other.getExpressflag3()))
            && (this.getExpressflag4() == null ? other.getExpressflag4() == null : this.getExpressflag4().equals(other.getExpressflag4()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()))
            && (this.getFixfee() == null ? other.getFixfee() == null : this.getFixfee().equals(other.getFixfee()))
            && (this.getBidfee() == null ? other.getBidfee() == null : this.getBidfee().equals(other.getBidfee()))
            && (this.getEbaydescription() == null ? other.getEbaydescription() == null : this.getEbaydescription().equals(other.getEbaydescription()))
            && (this.getEbayfeedbacktatingstar() == null ? other.getEbayfeedbacktatingstar() == null : this.getEbayfeedbacktatingstar().equals(other.getEbayfeedbacktatingstar()))
            && (this.getEbaytitle() == null ? other.getEbaytitle() == null : this.getEbaytitle().equals(other.getEbaytitle()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getProductindex() == null) ? 0 : getProductindex().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getEbaybuyitnewprice() == null) ? 0 : getEbaybuyitnewprice().hashCode());
        result = prime * result + ((getEbaybuyitnewpricemoneytype() == null) ? 0 : getEbaybuyitnewpricemoneytype().hashCode());
        result = prime * result + ((getEbaycountry() == null) ? 0 : getEbaycountry().hashCode());
        result = prime * result + ((getEbayhitcount() == null) ? 0 : getEbayhitcount().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbaystarttime() == null) ? 0 : getEbaystarttime().hashCode());
        result = prime * result + ((getEbayendtime() == null) ? 0 : getEbayendtime().hashCode());
        result = prime * result + ((getEbayhasreserveprice() == null) ? 0 : getEbayhasreserveprice().hashCode());
        result = prime * result + ((getEbayitemurl() == null) ? 0 : getEbayitemurl().hashCode());
        result = prime * result + ((getEbaylistduration() == null) ? 0 : getEbaylistduration().hashCode());
        result = prime * result + ((getEbaylocation() == null) ? 0 : getEbaylocation().hashCode());
        result = prime * result + ((getEbaygallerytype() == null) ? 0 : getEbaygallerytype().hashCode());
        result = prime * result + ((getEbaygalleryurl() == null) ? 0 : getEbaygalleryurl().hashCode());
        result = prime * result + ((getEbayphotodisplay() == null) ? 0 : getEbayphotodisplay().hashCode());
        result = prime * result + ((getEbaypicturesource() == null) ? 0 : getEbaypicturesource().hashCode());
        result = prime * result + ((getEbaycategoryid() == null) ? 0 : getEbaycategoryid().hashCode());
        result = prime * result + ((getEbaycategoryname() == null) ? 0 : getEbaycategoryname().hashCode());
        result = prime * result + ((getEbayquantity() == null) ? 0 : getEbayquantity().hashCode());
        result = prime * result + ((getEbayquantitysold() == null) ? 0 : getEbayquantitysold().hashCode());
        result = prime * result + ((getEbayfeedbackscore() == null) ? 0 : getEbayfeedbackscore().hashCode());
        result = prime * result + ((getEbaypositivefeedbackpercent() == null) ? 0 : getEbaypositivefeedbackpercent().hashCode());
        result = prime * result + ((getEbaysellerbusinesstype() == null) ? 0 : getEbaysellerbusinesstype().hashCode());
        result = prime * result + ((getEbaystorefront() == null) ? 0 : getEbaystorefront().hashCode());
        result = prime * result + ((getEbaystoreurl() == null) ? 0 : getEbaystoreurl().hashCode());
        result = prime * result + ((getEbaysite() == null) ? 0 : getEbaysite().hashCode());
        result = prime * result + ((getEbaystatus() == null) ? 0 : getEbaystatus().hashCode());
        result = prime * result + ((getEbayuserid() == null) ? 0 : getEbayuserid().hashCode());
        result = prime * result + ((getEbayuseridchanged() == null) ? 0 : getEbayuseridchanged().hashCode());
        result = prime * result + ((getEbaysku() == null) ? 0 : getEbaysku().hashCode());
        result = prime * result + ((getEbaystartprice() == null) ? 0 : getEbaystartprice().hashCode());
        result = prime * result + ((getEbayddleft() == null) ? 0 : getEbayddleft().hashCode());
        result = prime * result + ((getEbayhhleft() == null) ? 0 : getEbayhhleft().hashCode());
        result = prime * result + ((getEbaymmleft() == null) ? 0 : getEbaymmleft().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getPriceflag() == null) ? 0 : getPriceflag().hashCode());
        result = prime * result + ((getTitleflag() == null) ? 0 : getTitleflag().hashCode());
        result = prime * result + ((getPictrueflag() == null) ? 0 : getPictrueflag().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getShowflag() == null) ? 0 : getShowflag().hashCode());
        result = prime * result + ((getSellnumberavgoneday() == null) ? 0 : getSellnumberavgoneday().hashCode());
        result = prime * result + ((getSellnumberday() == null) ? 0 : getSellnumberday().hashCode());
        result = prime * result + ((getSellnumberweek() == null) ? 0 : getSellnumberweek().hashCode());
        result = prime * result + ((getSellnumbermonth() == null) ? 0 : getSellnumbermonth().hashCode());
        result = prime * result + ((getSellnumbertotal() == null) ? 0 : getSellnumbertotal().hashCode());
        result = prime * result + ((getSellnumberavg() == null) ? 0 : getSellnumberavg().hashCode());
        result = prime * result + ((getSellnumbersite() == null) ? 0 : getSellnumbersite().hashCode());
        result = prime * result + ((getDowncount() == null) ? 0 : getDowncount().hashCode());
        result = prime * result + ((getEnmityid() == null) ? 0 : getEnmityid().hashCode());
        result = prime * result + ((getThreedaysnum() == null) ? 0 : getThreedaysnum().hashCode());
        result = prime * result + ((getExpressmoneytype1() == null) ? 0 : getExpressmoneytype1().hashCode());
        result = prime * result + ((getExpressmoneytype2() == null) ? 0 : getExpressmoneytype2().hashCode());
        result = prime * result + ((getExpressmoneytype3() == null) ? 0 : getExpressmoneytype3().hashCode());
        result = prime * result + ((getExpressmoneytype4() == null) ? 0 : getExpressmoneytype4().hashCode());
        result = prime * result + ((getInternationalexpress1() == null) ? 0 : getInternationalexpress1().hashCode());
        result = prime * result + ((getInternationalexpress2() == null) ? 0 : getInternationalexpress2().hashCode());
        result = prime * result + ((getExpress1() == null) ? 0 : getExpress1().hashCode());
        result = prime * result + ((getExpress2() == null) ? 0 : getExpress2().hashCode());
        result = prime * result + ((getWeekhitcounter() == null) ? 0 : getWeekhitcounter().hashCode());
        result = prime * result + ((getMonthhitcounter() == null) ? 0 : getMonthhitcounter().hashCode());
        result = prime * result + ((getHitcounterall() == null) ? 0 : getHitcounterall().hashCode());
        result = prime * result + ((getWeektransformrate() == null) ? 0 : getWeektransformrate().hashCode());
        result = prime * result + ((getMonthtransformrate() == null) ? 0 : getMonthtransformrate().hashCode());
        result = prime * result + ((getTotalttransformrate() == null) ? 0 : getTotalttransformrate().hashCode());
        result = prime * result + ((getExpressflag1() == null) ? 0 : getExpressflag1().hashCode());
        result = prime * result + ((getExpressflag2() == null) ? 0 : getExpressflag2().hashCode());
        result = prime * result + ((getExpressflag3() == null) ? 0 : getExpressflag3().hashCode());
        result = prime * result + ((getExpressflag4() == null) ? 0 : getExpressflag4().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        result = prime * result + ((getFixfee() == null) ? 0 : getFixfee().hashCode());
        result = prime * result + ((getBidfee() == null) ? 0 : getBidfee().hashCode());
        result = prime * result + ((getEbaydescription() == null) ? 0 : getEbaydescription().hashCode());
        result = prime * result + ((getEbayfeedbacktatingstar() == null) ? 0 : getEbayfeedbacktatingstar().hashCode());
        result = prime * result + ((getEbaytitle() == null) ? 0 : getEbaytitle().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", productindex=").append(productindex);
        sb.append(", itemid=").append(itemid);
        sb.append(", ebaybuyitnewprice=").append(ebaybuyitnewprice);
        sb.append(", ebaybuyitnewpricemoneytype=").append(ebaybuyitnewpricemoneytype);
        sb.append(", ebaycountry=").append(ebaycountry);
        sb.append(", ebayhitcount=").append(ebayhitcount);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebaystarttime=").append(ebaystarttime);
        sb.append(", ebayendtime=").append(ebayendtime);
        sb.append(", ebayhasreserveprice=").append(ebayhasreserveprice);
        sb.append(", ebayitemurl=").append(ebayitemurl);
        sb.append(", ebaylistduration=").append(ebaylistduration);
        sb.append(", ebaylocation=").append(ebaylocation);
        sb.append(", ebaygallerytype=").append(ebaygallerytype);
        sb.append(", ebaygalleryurl=").append(ebaygalleryurl);
        sb.append(", ebayphotodisplay=").append(ebayphotodisplay);
        sb.append(", ebaypicturesource=").append(ebaypicturesource);
        sb.append(", ebaycategoryid=").append(ebaycategoryid);
        sb.append(", ebaycategoryname=").append(ebaycategoryname);
        sb.append(", ebayquantity=").append(ebayquantity);
        sb.append(", ebayquantitysold=").append(ebayquantitysold);
        sb.append(", ebayfeedbackscore=").append(ebayfeedbackscore);
        sb.append(", ebaypositivefeedbackpercent=").append(ebaypositivefeedbackpercent);
        sb.append(", ebaysellerbusinesstype=").append(ebaysellerbusinesstype);
        sb.append(", ebaystorefront=").append(ebaystorefront);
        sb.append(", ebaystoreurl=").append(ebaystoreurl);
        sb.append(", ebaysite=").append(ebaysite);
        sb.append(", ebaystatus=").append(ebaystatus);
        sb.append(", ebayuserid=").append(ebayuserid);
        sb.append(", ebayuseridchanged=").append(ebayuseridchanged);
        sb.append(", ebaysku=").append(ebaysku);
        sb.append(", ebaystartprice=").append(ebaystartprice);
        sb.append(", ebayddleft=").append(ebayddleft);
        sb.append(", ebayhhleft=").append(ebayhhleft);
        sb.append(", ebaymmleft=").append(ebaymmleft);
        sb.append(", flag=").append(flag);
        sb.append(", corpid=").append(corpid);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", createtime=").append(createtime);
        sb.append(", priceflag=").append(priceflag);
        sb.append(", titleflag=").append(titleflag);
        sb.append(", pictrueflag=").append(pictrueflag);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", showflag=").append(showflag);
        sb.append(", sellnumberavgoneday=").append(sellnumberavgoneday);
        sb.append(", sellnumberday=").append(sellnumberday);
        sb.append(", sellnumberweek=").append(sellnumberweek);
        sb.append(", sellnumbermonth=").append(sellnumbermonth);
        sb.append(", sellnumbertotal=").append(sellnumbertotal);
        sb.append(", sellnumberavg=").append(sellnumberavg);
        sb.append(", sellnumbersite=").append(sellnumbersite);
        sb.append(", downcount=").append(downcount);
        sb.append(", enmityid=").append(enmityid);
        sb.append(", threedaysnum=").append(threedaysnum);
        sb.append(", expressmoneytype1=").append(expressmoneytype1);
        sb.append(", expressmoneytype2=").append(expressmoneytype2);
        sb.append(", expressmoneytype3=").append(expressmoneytype3);
        sb.append(", expressmoneytype4=").append(expressmoneytype4);
        sb.append(", internationalexpress1=").append(internationalexpress1);
        sb.append(", internationalexpress2=").append(internationalexpress2);
        sb.append(", express1=").append(express1);
        sb.append(", express2=").append(express2);
        sb.append(", weekhitcounter=").append(weekhitcounter);
        sb.append(", monthhitcounter=").append(monthhitcounter);
        sb.append(", hitcounterall=").append(hitcounterall);
        sb.append(", weektransformrate=").append(weektransformrate);
        sb.append(", monthtransformrate=").append(monthtransformrate);
        sb.append(", totalttransformrate=").append(totalttransformrate);
        sb.append(", expressflag1=").append(expressflag1);
        sb.append(", expressflag2=").append(expressflag2);
        sb.append(", expressflag3=").append(expressflag3);
        sb.append(", expressflag4=").append(expressflag4);
        sb.append(", createoper=").append(createoper);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", fixfee=").append(fixfee);
        sb.append(", bidfee=").append(bidfee);
        sb.append(", ebaydescription=").append(ebaydescription);
        sb.append(", ebayfeedbacktatingstar=").append(ebayfeedbacktatingstar);
        sb.append(", ebaytitle=").append(ebaytitle);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}