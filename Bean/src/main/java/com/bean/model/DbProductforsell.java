package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductforsell implements Serializable {
    private String sequenceid;

    private String sellsku;

    private String oper;

    private Date opertime;

    private String openflag;

    private String corpid;

    private String reserve2;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private Date reserve8;

    private Date createtime;

    private String status;

    private String categoryid;

    private String selloper;

    private String purchaseoper;

    private BigDecimal numforsku;

    private BigDecimal numforonlineitem;

    private BigDecimal sodeforonlineitem;

    private BigDecimal numforonlineshop;

    private BigDecimal numforshop;

    private BigDecimal numfordescr;

    private BigDecimal oneweeknum;

    private BigDecimal twoweeknum;

    private BigDecimal threeweeknum;

    private BigDecimal fourweeknum;

    private String us;

    private String au;

    private String uk;

    private String ca;

    private String de;

    private String descrflag;

    private String photoflag;

    private String status1;

    private String attribute;

    private String onestage;

    private String twostage;

    private BigDecimal avgnum;

    private String onemonth;

    private BigDecimal newsall;

    private BigDecimal news;

    private BigDecimal tasknum;

    private String seasonflag;

    private BigDecimal reserve12;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private BigDecimal reserve11;

    private String expresstype1;

    private String expresstype2;

    private String expresstype3;

    private String expresstype4;

    private String expresstype5;

    private BigDecimal maoli;

    private BigDecimal reserve13;

    private BigDecimal reserve14;

    private BigDecimal grossprofit;

    private BigDecimal rateofmargin;

    private String usitemid;

    private String ukitemid;

    private String auitemid;

    private String caitemid;

    private String deitemid;

    private String pictureid;

    private String name;

    private String enname;

    private String title;

    private String reserve1;

    private String reserve3;

    private String categoryname;

    private String picturestr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSellsku() {
        return sellsku;
    }

    public void setSellsku(String sellsku) {
        this.sellsku = sellsku == null ? null : sellsku.trim();
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

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
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

    public Date getReserve8() {
        return reserve8;
    }

    public void setReserve8(Date reserve8) {
        this.reserve8 = reserve8;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getSelloper() {
        return selloper;
    }

    public void setSelloper(String selloper) {
        this.selloper = selloper == null ? null : selloper.trim();
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public BigDecimal getNumforsku() {
        return numforsku;
    }

    public void setNumforsku(BigDecimal numforsku) {
        this.numforsku = numforsku;
    }

    public BigDecimal getNumforonlineitem() {
        return numforonlineitem;
    }

    public void setNumforonlineitem(BigDecimal numforonlineitem) {
        this.numforonlineitem = numforonlineitem;
    }

    public BigDecimal getSodeforonlineitem() {
        return sodeforonlineitem;
    }

    public void setSodeforonlineitem(BigDecimal sodeforonlineitem) {
        this.sodeforonlineitem = sodeforonlineitem;
    }

    public BigDecimal getNumforonlineshop() {
        return numforonlineshop;
    }

    public void setNumforonlineshop(BigDecimal numforonlineshop) {
        this.numforonlineshop = numforonlineshop;
    }

    public BigDecimal getNumforshop() {
        return numforshop;
    }

    public void setNumforshop(BigDecimal numforshop) {
        this.numforshop = numforshop;
    }

    public BigDecimal getNumfordescr() {
        return numfordescr;
    }

    public void setNumfordescr(BigDecimal numfordescr) {
        this.numfordescr = numfordescr;
    }

    public BigDecimal getOneweeknum() {
        return oneweeknum;
    }

    public void setOneweeknum(BigDecimal oneweeknum) {
        this.oneweeknum = oneweeknum;
    }

    public BigDecimal getTwoweeknum() {
        return twoweeknum;
    }

    public void setTwoweeknum(BigDecimal twoweeknum) {
        this.twoweeknum = twoweeknum;
    }

    public BigDecimal getThreeweeknum() {
        return threeweeknum;
    }

    public void setThreeweeknum(BigDecimal threeweeknum) {
        this.threeweeknum = threeweeknum;
    }

    public BigDecimal getFourweeknum() {
        return fourweeknum;
    }

    public void setFourweeknum(BigDecimal fourweeknum) {
        this.fourweeknum = fourweeknum;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us == null ? null : us.trim();
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au == null ? null : au.trim();
    }

    public String getUk() {
        return uk;
    }

    public void setUk(String uk) {
        this.uk = uk == null ? null : uk.trim();
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca == null ? null : ca.trim();
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de == null ? null : de.trim();
    }

    public String getDescrflag() {
        return descrflag;
    }

    public void setDescrflag(String descrflag) {
        this.descrflag = descrflag == null ? null : descrflag.trim();
    }

    public String getPhotoflag() {
        return photoflag;
    }

    public void setPhotoflag(String photoflag) {
        this.photoflag = photoflag == null ? null : photoflag.trim();
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1 == null ? null : status1.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getOnestage() {
        return onestage;
    }

    public void setOnestage(String onestage) {
        this.onestage = onestage == null ? null : onestage.trim();
    }

    public String getTwostage() {
        return twostage;
    }

    public void setTwostage(String twostage) {
        this.twostage = twostage == null ? null : twostage.trim();
    }

    public BigDecimal getAvgnum() {
        return avgnum;
    }

    public void setAvgnum(BigDecimal avgnum) {
        this.avgnum = avgnum;
    }

    public String getOnemonth() {
        return onemonth;
    }

    public void setOnemonth(String onemonth) {
        this.onemonth = onemonth == null ? null : onemonth.trim();
    }

    public BigDecimal getNewsall() {
        return newsall;
    }

    public void setNewsall(BigDecimal newsall) {
        this.newsall = newsall;
    }

    public BigDecimal getNews() {
        return news;
    }

    public void setNews(BigDecimal news) {
        this.news = news;
    }

    public BigDecimal getTasknum() {
        return tasknum;
    }

    public void setTasknum(BigDecimal tasknum) {
        this.tasknum = tasknum;
    }

    public String getSeasonflag() {
        return seasonflag;
    }

    public void setSeasonflag(String seasonflag) {
        this.seasonflag = seasonflag == null ? null : seasonflag.trim();
    }

    public BigDecimal getReserve12() {
        return reserve12;
    }

    public void setReserve12(BigDecimal reserve12) {
        this.reserve12 = reserve12;
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

    public BigDecimal getReserve11() {
        return reserve11;
    }

    public void setReserve11(BigDecimal reserve11) {
        this.reserve11 = reserve11;
    }

    public String getExpresstype1() {
        return expresstype1;
    }

    public void setExpresstype1(String expresstype1) {
        this.expresstype1 = expresstype1 == null ? null : expresstype1.trim();
    }

    public String getExpresstype2() {
        return expresstype2;
    }

    public void setExpresstype2(String expresstype2) {
        this.expresstype2 = expresstype2 == null ? null : expresstype2.trim();
    }

    public String getExpresstype3() {
        return expresstype3;
    }

    public void setExpresstype3(String expresstype3) {
        this.expresstype3 = expresstype3 == null ? null : expresstype3.trim();
    }

    public String getExpresstype4() {
        return expresstype4;
    }

    public void setExpresstype4(String expresstype4) {
        this.expresstype4 = expresstype4 == null ? null : expresstype4.trim();
    }

    public String getExpresstype5() {
        return expresstype5;
    }

    public void setExpresstype5(String expresstype5) {
        this.expresstype5 = expresstype5 == null ? null : expresstype5.trim();
    }

    public BigDecimal getMaoli() {
        return maoli;
    }

    public void setMaoli(BigDecimal maoli) {
        this.maoli = maoli;
    }

    public BigDecimal getReserve13() {
        return reserve13;
    }

    public void setReserve13(BigDecimal reserve13) {
        this.reserve13 = reserve13;
    }

    public BigDecimal getReserve14() {
        return reserve14;
    }

    public void setReserve14(BigDecimal reserve14) {
        this.reserve14 = reserve14;
    }

    public BigDecimal getGrossprofit() {
        return grossprofit;
    }

    public void setGrossprofit(BigDecimal grossprofit) {
        this.grossprofit = grossprofit;
    }

    public BigDecimal getRateofmargin() {
        return rateofmargin;
    }

    public void setRateofmargin(BigDecimal rateofmargin) {
        this.rateofmargin = rateofmargin;
    }

    public String getUsitemid() {
        return usitemid;
    }

    public void setUsitemid(String usitemid) {
        this.usitemid = usitemid == null ? null : usitemid.trim();
    }

    public String getUkitemid() {
        return ukitemid;
    }

    public void setUkitemid(String ukitemid) {
        this.ukitemid = ukitemid == null ? null : ukitemid.trim();
    }

    public String getAuitemid() {
        return auitemid;
    }

    public void setAuitemid(String auitemid) {
        this.auitemid = auitemid == null ? null : auitemid.trim();
    }

    public String getCaitemid() {
        return caitemid;
    }

    public void setCaitemid(String caitemid) {
        this.caitemid = caitemid == null ? null : caitemid.trim();
    }

    public String getDeitemid() {
        return deitemid;
    }

    public void setDeitemid(String deitemid) {
        this.deitemid = deitemid == null ? null : deitemid.trim();
    }

    public String getPictureid() {
        return pictureid;
    }

    public void setPictureid(String pictureid) {
        this.pictureid = pictureid == null ? null : pictureid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getPicturestr() {
        return picturestr;
    }

    public void setPicturestr(String picturestr) {
        this.picturestr = picturestr == null ? null : picturestr.trim();
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
        DbProductforsell other = (DbProductforsell) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSellsku() == null ? other.getSellsku() == null : this.getSellsku().equals(other.getSellsku()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getSelloper() == null ? other.getSelloper() == null : this.getSelloper().equals(other.getSelloper()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getNumforsku() == null ? other.getNumforsku() == null : this.getNumforsku().equals(other.getNumforsku()))
            && (this.getNumforonlineitem() == null ? other.getNumforonlineitem() == null : this.getNumforonlineitem().equals(other.getNumforonlineitem()))
            && (this.getSodeforonlineitem() == null ? other.getSodeforonlineitem() == null : this.getSodeforonlineitem().equals(other.getSodeforonlineitem()))
            && (this.getNumforonlineshop() == null ? other.getNumforonlineshop() == null : this.getNumforonlineshop().equals(other.getNumforonlineshop()))
            && (this.getNumforshop() == null ? other.getNumforshop() == null : this.getNumforshop().equals(other.getNumforshop()))
            && (this.getNumfordescr() == null ? other.getNumfordescr() == null : this.getNumfordescr().equals(other.getNumfordescr()))
            && (this.getOneweeknum() == null ? other.getOneweeknum() == null : this.getOneweeknum().equals(other.getOneweeknum()))
            && (this.getTwoweeknum() == null ? other.getTwoweeknum() == null : this.getTwoweeknum().equals(other.getTwoweeknum()))
            && (this.getThreeweeknum() == null ? other.getThreeweeknum() == null : this.getThreeweeknum().equals(other.getThreeweeknum()))
            && (this.getFourweeknum() == null ? other.getFourweeknum() == null : this.getFourweeknum().equals(other.getFourweeknum()))
            && (this.getUs() == null ? other.getUs() == null : this.getUs().equals(other.getUs()))
            && (this.getAu() == null ? other.getAu() == null : this.getAu().equals(other.getAu()))
            && (this.getUk() == null ? other.getUk() == null : this.getUk().equals(other.getUk()))
            && (this.getCa() == null ? other.getCa() == null : this.getCa().equals(other.getCa()))
            && (this.getDe() == null ? other.getDe() == null : this.getDe().equals(other.getDe()))
            && (this.getDescrflag() == null ? other.getDescrflag() == null : this.getDescrflag().equals(other.getDescrflag()))
            && (this.getPhotoflag() == null ? other.getPhotoflag() == null : this.getPhotoflag().equals(other.getPhotoflag()))
            && (this.getStatus1() == null ? other.getStatus1() == null : this.getStatus1().equals(other.getStatus1()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()))
            && (this.getOnestage() == null ? other.getOnestage() == null : this.getOnestage().equals(other.getOnestage()))
            && (this.getTwostage() == null ? other.getTwostage() == null : this.getTwostage().equals(other.getTwostage()))
            && (this.getAvgnum() == null ? other.getAvgnum() == null : this.getAvgnum().equals(other.getAvgnum()))
            && (this.getOnemonth() == null ? other.getOnemonth() == null : this.getOnemonth().equals(other.getOnemonth()))
            && (this.getNewsall() == null ? other.getNewsall() == null : this.getNewsall().equals(other.getNewsall()))
            && (this.getNews() == null ? other.getNews() == null : this.getNews().equals(other.getNews()))
            && (this.getTasknum() == null ? other.getTasknum() == null : this.getTasknum().equals(other.getTasknum()))
            && (this.getSeasonflag() == null ? other.getSeasonflag() == null : this.getSeasonflag().equals(other.getSeasonflag()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getExpresstype1() == null ? other.getExpresstype1() == null : this.getExpresstype1().equals(other.getExpresstype1()))
            && (this.getExpresstype2() == null ? other.getExpresstype2() == null : this.getExpresstype2().equals(other.getExpresstype2()))
            && (this.getExpresstype3() == null ? other.getExpresstype3() == null : this.getExpresstype3().equals(other.getExpresstype3()))
            && (this.getExpresstype4() == null ? other.getExpresstype4() == null : this.getExpresstype4().equals(other.getExpresstype4()))
            && (this.getExpresstype5() == null ? other.getExpresstype5() == null : this.getExpresstype5().equals(other.getExpresstype5()))
            && (this.getMaoli() == null ? other.getMaoli() == null : this.getMaoli().equals(other.getMaoli()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getGrossprofit() == null ? other.getGrossprofit() == null : this.getGrossprofit().equals(other.getGrossprofit()))
            && (this.getRateofmargin() == null ? other.getRateofmargin() == null : this.getRateofmargin().equals(other.getRateofmargin()))
            && (this.getUsitemid() == null ? other.getUsitemid() == null : this.getUsitemid().equals(other.getUsitemid()))
            && (this.getUkitemid() == null ? other.getUkitemid() == null : this.getUkitemid().equals(other.getUkitemid()))
            && (this.getAuitemid() == null ? other.getAuitemid() == null : this.getAuitemid().equals(other.getAuitemid()))
            && (this.getCaitemid() == null ? other.getCaitemid() == null : this.getCaitemid().equals(other.getCaitemid()))
            && (this.getDeitemid() == null ? other.getDeitemid() == null : this.getDeitemid().equals(other.getDeitemid()))
            && (this.getPictureid() == null ? other.getPictureid() == null : this.getPictureid().equals(other.getPictureid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEnname() == null ? other.getEnname() == null : this.getEnname().equals(other.getEnname()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getPicturestr() == null ? other.getPicturestr() == null : this.getPicturestr().equals(other.getPicturestr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSellsku() == null) ? 0 : getSellsku().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getSelloper() == null) ? 0 : getSelloper().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getNumforsku() == null) ? 0 : getNumforsku().hashCode());
        result = prime * result + ((getNumforonlineitem() == null) ? 0 : getNumforonlineitem().hashCode());
        result = prime * result + ((getSodeforonlineitem() == null) ? 0 : getSodeforonlineitem().hashCode());
        result = prime * result + ((getNumforonlineshop() == null) ? 0 : getNumforonlineshop().hashCode());
        result = prime * result + ((getNumforshop() == null) ? 0 : getNumforshop().hashCode());
        result = prime * result + ((getNumfordescr() == null) ? 0 : getNumfordescr().hashCode());
        result = prime * result + ((getOneweeknum() == null) ? 0 : getOneweeknum().hashCode());
        result = prime * result + ((getTwoweeknum() == null) ? 0 : getTwoweeknum().hashCode());
        result = prime * result + ((getThreeweeknum() == null) ? 0 : getThreeweeknum().hashCode());
        result = prime * result + ((getFourweeknum() == null) ? 0 : getFourweeknum().hashCode());
        result = prime * result + ((getUs() == null) ? 0 : getUs().hashCode());
        result = prime * result + ((getAu() == null) ? 0 : getAu().hashCode());
        result = prime * result + ((getUk() == null) ? 0 : getUk().hashCode());
        result = prime * result + ((getCa() == null) ? 0 : getCa().hashCode());
        result = prime * result + ((getDe() == null) ? 0 : getDe().hashCode());
        result = prime * result + ((getDescrflag() == null) ? 0 : getDescrflag().hashCode());
        result = prime * result + ((getPhotoflag() == null) ? 0 : getPhotoflag().hashCode());
        result = prime * result + ((getStatus1() == null) ? 0 : getStatus1().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        result = prime * result + ((getOnestage() == null) ? 0 : getOnestage().hashCode());
        result = prime * result + ((getTwostage() == null) ? 0 : getTwostage().hashCode());
        result = prime * result + ((getAvgnum() == null) ? 0 : getAvgnum().hashCode());
        result = prime * result + ((getOnemonth() == null) ? 0 : getOnemonth().hashCode());
        result = prime * result + ((getNewsall() == null) ? 0 : getNewsall().hashCode());
        result = prime * result + ((getNews() == null) ? 0 : getNews().hashCode());
        result = prime * result + ((getTasknum() == null) ? 0 : getTasknum().hashCode());
        result = prime * result + ((getSeasonflag() == null) ? 0 : getSeasonflag().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getExpresstype1() == null) ? 0 : getExpresstype1().hashCode());
        result = prime * result + ((getExpresstype2() == null) ? 0 : getExpresstype2().hashCode());
        result = prime * result + ((getExpresstype3() == null) ? 0 : getExpresstype3().hashCode());
        result = prime * result + ((getExpresstype4() == null) ? 0 : getExpresstype4().hashCode());
        result = prime * result + ((getExpresstype5() == null) ? 0 : getExpresstype5().hashCode());
        result = prime * result + ((getMaoli() == null) ? 0 : getMaoli().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getGrossprofit() == null) ? 0 : getGrossprofit().hashCode());
        result = prime * result + ((getRateofmargin() == null) ? 0 : getRateofmargin().hashCode());
        result = prime * result + ((getUsitemid() == null) ? 0 : getUsitemid().hashCode());
        result = prime * result + ((getUkitemid() == null) ? 0 : getUkitemid().hashCode());
        result = prime * result + ((getAuitemid() == null) ? 0 : getAuitemid().hashCode());
        result = prime * result + ((getCaitemid() == null) ? 0 : getCaitemid().hashCode());
        result = prime * result + ((getDeitemid() == null) ? 0 : getDeitemid().hashCode());
        result = prime * result + ((getPictureid() == null) ? 0 : getPictureid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnname() == null) ? 0 : getEnname().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getPicturestr() == null) ? 0 : getPicturestr().hashCode());
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
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", corpid=").append(corpid);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", createtime=").append(createtime);
        sb.append(", status=").append(status);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", selloper=").append(selloper);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", numforsku=").append(numforsku);
        sb.append(", numforonlineitem=").append(numforonlineitem);
        sb.append(", sodeforonlineitem=").append(sodeforonlineitem);
        sb.append(", numforonlineshop=").append(numforonlineshop);
        sb.append(", numforshop=").append(numforshop);
        sb.append(", numfordescr=").append(numfordescr);
        sb.append(", oneweeknum=").append(oneweeknum);
        sb.append(", twoweeknum=").append(twoweeknum);
        sb.append(", threeweeknum=").append(threeweeknum);
        sb.append(", fourweeknum=").append(fourweeknum);
        sb.append(", us=").append(us);
        sb.append(", au=").append(au);
        sb.append(", uk=").append(uk);
        sb.append(", ca=").append(ca);
        sb.append(", de=").append(de);
        sb.append(", descrflag=").append(descrflag);
        sb.append(", photoflag=").append(photoflag);
        sb.append(", status1=").append(status1);
        sb.append(", attribute=").append(attribute);
        sb.append(", onestage=").append(onestage);
        sb.append(", twostage=").append(twostage);
        sb.append(", avgnum=").append(avgnum);
        sb.append(", onemonth=").append(onemonth);
        sb.append(", newsall=").append(newsall);
        sb.append(", news=").append(news);
        sb.append(", tasknum=").append(tasknum);
        sb.append(", seasonflag=").append(seasonflag);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", expresstype1=").append(expresstype1);
        sb.append(", expresstype2=").append(expresstype2);
        sb.append(", expresstype3=").append(expresstype3);
        sb.append(", expresstype4=").append(expresstype4);
        sb.append(", expresstype5=").append(expresstype5);
        sb.append(", maoli=").append(maoli);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", grossprofit=").append(grossprofit);
        sb.append(", rateofmargin=").append(rateofmargin);
        sb.append(", usitemid=").append(usitemid);
        sb.append(", ukitemid=").append(ukitemid);
        sb.append(", auitemid=").append(auitemid);
        sb.append(", caitemid=").append(caitemid);
        sb.append(", deitemid=").append(deitemid);
        sb.append(", pictureid=").append(pictureid);
        sb.append(", name=").append(name);
        sb.append(", enname=").append(enname);
        sb.append(", title=").append(title);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", picturestr=").append(picturestr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}