package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbProductdevelop implements Serializable {
    private String sequenceid;

    private String productid;

    private String producttitle;

    private String namechn;

    private BigDecimal goalsell;

    private BigDecimal expresstype;

    private BigDecimal estimateweight;

    private String antistop;

    private String createoper;

    private Date createtime;

    private String createcheckoper;

    private Date createchecktime;

    private String marketoper;

    private String forecastgross;

    private BigDecimal forecastsellnum;

    private String quality;

    private String secular;

    private String country;

    private String ifoldsku;

    private String urgent;

    private String oper;

    private Date opertime;

    private String openflag;

    private String corpid;

    private BigDecimal productnum;

    private String status;

    private String purchaseflowoper;

    private Date finishtime;

    private String reserve1;

    private String reserve2;

    private BigDecimal reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private Date reserve6;

    private String reserve11;

    private String reserve12;

    private String reserve13;

    private String reserve14;

    private String reserve15;

    private String reserve16;

    private String reserve17;

    private String reserve18;

    private String reserve7;

    private String reserve8;

    private String reserve9;

    private String reserve10;

    private String categoryid;

    private String categoryname;

    private BigDecimal lengthnum;

    private BigDecimal widthnum;

    private BigDecimal heightnum;

    private String deliverytime;

    private BigDecimal totalassess;

    private String yieldly;

    private Date finidhtime;

    private Date checksimpletime;

    private String checkoper;

    private Date checkpurchasetime;

    private String productsource;

    private String goalaccount;

    private String photourl;

    private String url;

    private String goaladress;

    private String note;

    private String picture;

    private String content;

    private String productnote;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle == null ? null : producttitle.trim();
    }

    public String getNamechn() {
        return namechn;
    }

    public void setNamechn(String namechn) {
        this.namechn = namechn == null ? null : namechn.trim();
    }

    public BigDecimal getGoalsell() {
        return goalsell;
    }

    public void setGoalsell(BigDecimal goalsell) {
        this.goalsell = goalsell;
    }

    public BigDecimal getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(BigDecimal expresstype) {
        this.expresstype = expresstype;
    }

    public BigDecimal getEstimateweight() {
        return estimateweight;
    }

    public void setEstimateweight(BigDecimal estimateweight) {
        this.estimateweight = estimateweight;
    }

    public String getAntistop() {
        return antistop;
    }

    public void setAntistop(String antistop) {
        this.antistop = antistop == null ? null : antistop.trim();
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatecheckoper() {
        return createcheckoper;
    }

    public void setCreatecheckoper(String createcheckoper) {
        this.createcheckoper = createcheckoper == null ? null : createcheckoper.trim();
    }

    public Date getCreatechecktime() {
        return createchecktime;
    }

    public void setCreatechecktime(Date createchecktime) {
        this.createchecktime = createchecktime;
    }

    public String getMarketoper() {
        return marketoper;
    }

    public void setMarketoper(String marketoper) {
        this.marketoper = marketoper == null ? null : marketoper.trim();
    }

    public String getForecastgross() {
        return forecastgross;
    }

    public void setForecastgross(String forecastgross) {
        this.forecastgross = forecastgross == null ? null : forecastgross.trim();
    }

    public BigDecimal getForecastsellnum() {
        return forecastsellnum;
    }

    public void setForecastsellnum(BigDecimal forecastsellnum) {
        this.forecastsellnum = forecastsellnum;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    public String getSecular() {
        return secular;
    }

    public void setSecular(String secular) {
        this.secular = secular == null ? null : secular.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getIfoldsku() {
        return ifoldsku;
    }

    public void setIfoldsku(String ifoldsku) {
        this.ifoldsku = ifoldsku == null ? null : ifoldsku.trim();
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent == null ? null : urgent.trim();
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

    public BigDecimal getProductnum() {
        return productnum;
    }

    public void setProductnum(BigDecimal productnum) {
        this.productnum = productnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPurchaseflowoper() {
        return purchaseflowoper;
    }

    public void setPurchaseflowoper(String purchaseflowoper) {
        this.purchaseflowoper = purchaseflowoper == null ? null : purchaseflowoper.trim();
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
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

    public Date getReserve6() {
        return reserve6;
    }

    public void setReserve6(Date reserve6) {
        this.reserve6 = reserve6;
    }

    public String getReserve11() {
        return reserve11;
    }

    public void setReserve11(String reserve11) {
        this.reserve11 = reserve11 == null ? null : reserve11.trim();
    }

    public String getReserve12() {
        return reserve12;
    }

    public void setReserve12(String reserve12) {
        this.reserve12 = reserve12 == null ? null : reserve12.trim();
    }

    public String getReserve13() {
        return reserve13;
    }

    public void setReserve13(String reserve13) {
        this.reserve13 = reserve13 == null ? null : reserve13.trim();
    }

    public String getReserve14() {
        return reserve14;
    }

    public void setReserve14(String reserve14) {
        this.reserve14 = reserve14 == null ? null : reserve14.trim();
    }

    public String getReserve15() {
        return reserve15;
    }

    public void setReserve15(String reserve15) {
        this.reserve15 = reserve15 == null ? null : reserve15.trim();
    }

    public String getReserve16() {
        return reserve16;
    }

    public void setReserve16(String reserve16) {
        this.reserve16 = reserve16 == null ? null : reserve16.trim();
    }

    public String getReserve17() {
        return reserve17;
    }

    public void setReserve17(String reserve17) {
        this.reserve17 = reserve17 == null ? null : reserve17.trim();
    }

    public String getReserve18() {
        return reserve18;
    }

    public void setReserve18(String reserve18) {
        this.reserve18 = reserve18 == null ? null : reserve18.trim();
    }

    public String getReserve7() {
        return reserve7;
    }

    public void setReserve7(String reserve7) {
        this.reserve7 = reserve7 == null ? null : reserve7.trim();
    }

    public String getReserve8() {
        return reserve8;
    }

    public void setReserve8(String reserve8) {
        this.reserve8 = reserve8 == null ? null : reserve8.trim();
    }

    public String getReserve9() {
        return reserve9;
    }

    public void setReserve9(String reserve9) {
        this.reserve9 = reserve9 == null ? null : reserve9.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public BigDecimal getLengthnum() {
        return lengthnum;
    }

    public void setLengthnum(BigDecimal lengthnum) {
        this.lengthnum = lengthnum;
    }

    public BigDecimal getWidthnum() {
        return widthnum;
    }

    public void setWidthnum(BigDecimal widthnum) {
        this.widthnum = widthnum;
    }

    public BigDecimal getHeightnum() {
        return heightnum;
    }

    public void setHeightnum(BigDecimal heightnum) {
        this.heightnum = heightnum;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime == null ? null : deliverytime.trim();
    }

    public BigDecimal getTotalassess() {
        return totalassess;
    }

    public void setTotalassess(BigDecimal totalassess) {
        this.totalassess = totalassess;
    }

    public String getYieldly() {
        return yieldly;
    }

    public void setYieldly(String yieldly) {
        this.yieldly = yieldly == null ? null : yieldly.trim();
    }

    public Date getFinidhtime() {
        return finidhtime;
    }

    public void setFinidhtime(Date finidhtime) {
        this.finidhtime = finidhtime;
    }

    public Date getChecksimpletime() {
        return checksimpletime;
    }

    public void setChecksimpletime(Date checksimpletime) {
        this.checksimpletime = checksimpletime;
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public Date getCheckpurchasetime() {
        return checkpurchasetime;
    }

    public void setCheckpurchasetime(Date checkpurchasetime) {
        this.checkpurchasetime = checkpurchasetime;
    }

    public String getProductsource() {
        return productsource;
    }

    public void setProductsource(String productsource) {
        this.productsource = productsource == null ? null : productsource.trim();
    }

    public String getGoalaccount() {
        return goalaccount;
    }

    public void setGoalaccount(String goalaccount) {
        this.goalaccount = goalaccount == null ? null : goalaccount.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getGoaladress() {
        return goaladress;
    }

    public void setGoaladress(String goaladress) {
        this.goaladress = goaladress == null ? null : goaladress.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProductnote() {
        return productnote;
    }

    public void setProductnote(String productnote) {
        this.productnote = productnote == null ? null : productnote.trim();
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
        DbProductdevelop other = (DbProductdevelop) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProducttitle() == null ? other.getProducttitle() == null : this.getProducttitle().equals(other.getProducttitle()))
            && (this.getNamechn() == null ? other.getNamechn() == null : this.getNamechn().equals(other.getNamechn()))
            && (this.getGoalsell() == null ? other.getGoalsell() == null : this.getGoalsell().equals(other.getGoalsell()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getEstimateweight() == null ? other.getEstimateweight() == null : this.getEstimateweight().equals(other.getEstimateweight()))
            && (this.getAntistop() == null ? other.getAntistop() == null : this.getAntistop().equals(other.getAntistop()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreatecheckoper() == null ? other.getCreatecheckoper() == null : this.getCreatecheckoper().equals(other.getCreatecheckoper()))
            && (this.getCreatechecktime() == null ? other.getCreatechecktime() == null : this.getCreatechecktime().equals(other.getCreatechecktime()))
            && (this.getMarketoper() == null ? other.getMarketoper() == null : this.getMarketoper().equals(other.getMarketoper()))
            && (this.getForecastgross() == null ? other.getForecastgross() == null : this.getForecastgross().equals(other.getForecastgross()))
            && (this.getForecastsellnum() == null ? other.getForecastsellnum() == null : this.getForecastsellnum().equals(other.getForecastsellnum()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getSecular() == null ? other.getSecular() == null : this.getSecular().equals(other.getSecular()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getIfoldsku() == null ? other.getIfoldsku() == null : this.getIfoldsku().equals(other.getIfoldsku()))
            && (this.getUrgent() == null ? other.getUrgent() == null : this.getUrgent().equals(other.getUrgent()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getProductnum() == null ? other.getProductnum() == null : this.getProductnum().equals(other.getProductnum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPurchaseflowoper() == null ? other.getPurchaseflowoper() == null : this.getPurchaseflowoper().equals(other.getPurchaseflowoper()))
            && (this.getFinishtime() == null ? other.getFinishtime() == null : this.getFinishtime().equals(other.getFinishtime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getReserve17() == null ? other.getReserve17() == null : this.getReserve17().equals(other.getReserve17()))
            && (this.getReserve18() == null ? other.getReserve18() == null : this.getReserve18().equals(other.getReserve18()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getLengthnum() == null ? other.getLengthnum() == null : this.getLengthnum().equals(other.getLengthnum()))
            && (this.getWidthnum() == null ? other.getWidthnum() == null : this.getWidthnum().equals(other.getWidthnum()))
            && (this.getHeightnum() == null ? other.getHeightnum() == null : this.getHeightnum().equals(other.getHeightnum()))
            && (this.getDeliverytime() == null ? other.getDeliverytime() == null : this.getDeliverytime().equals(other.getDeliverytime()))
            && (this.getTotalassess() == null ? other.getTotalassess() == null : this.getTotalassess().equals(other.getTotalassess()))
            && (this.getYieldly() == null ? other.getYieldly() == null : this.getYieldly().equals(other.getYieldly()))
            && (this.getFinidhtime() == null ? other.getFinidhtime() == null : this.getFinidhtime().equals(other.getFinidhtime()))
            && (this.getChecksimpletime() == null ? other.getChecksimpletime() == null : this.getChecksimpletime().equals(other.getChecksimpletime()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getCheckpurchasetime() == null ? other.getCheckpurchasetime() == null : this.getCheckpurchasetime().equals(other.getCheckpurchasetime()))
            && (this.getProductsource() == null ? other.getProductsource() == null : this.getProductsource().equals(other.getProductsource()))
            && (this.getGoalaccount() == null ? other.getGoalaccount() == null : this.getGoalaccount().equals(other.getGoalaccount()))
            && (this.getPhotourl() == null ? other.getPhotourl() == null : this.getPhotourl().equals(other.getPhotourl()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getGoaladress() == null ? other.getGoaladress() == null : this.getGoaladress().equals(other.getGoaladress()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getProductnote() == null ? other.getProductnote() == null : this.getProductnote().equals(other.getProductnote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProducttitle() == null) ? 0 : getProducttitle().hashCode());
        result = prime * result + ((getNamechn() == null) ? 0 : getNamechn().hashCode());
        result = prime * result + ((getGoalsell() == null) ? 0 : getGoalsell().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getEstimateweight() == null) ? 0 : getEstimateweight().hashCode());
        result = prime * result + ((getAntistop() == null) ? 0 : getAntistop().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreatecheckoper() == null) ? 0 : getCreatecheckoper().hashCode());
        result = prime * result + ((getCreatechecktime() == null) ? 0 : getCreatechecktime().hashCode());
        result = prime * result + ((getMarketoper() == null) ? 0 : getMarketoper().hashCode());
        result = prime * result + ((getForecastgross() == null) ? 0 : getForecastgross().hashCode());
        result = prime * result + ((getForecastsellnum() == null) ? 0 : getForecastsellnum().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getSecular() == null) ? 0 : getSecular().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getIfoldsku() == null) ? 0 : getIfoldsku().hashCode());
        result = prime * result + ((getUrgent() == null) ? 0 : getUrgent().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getProductnum() == null) ? 0 : getProductnum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPurchaseflowoper() == null) ? 0 : getPurchaseflowoper().hashCode());
        result = prime * result + ((getFinishtime() == null) ? 0 : getFinishtime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getReserve17() == null) ? 0 : getReserve17().hashCode());
        result = prime * result + ((getReserve18() == null) ? 0 : getReserve18().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getLengthnum() == null) ? 0 : getLengthnum().hashCode());
        result = prime * result + ((getWidthnum() == null) ? 0 : getWidthnum().hashCode());
        result = prime * result + ((getHeightnum() == null) ? 0 : getHeightnum().hashCode());
        result = prime * result + ((getDeliverytime() == null) ? 0 : getDeliverytime().hashCode());
        result = prime * result + ((getTotalassess() == null) ? 0 : getTotalassess().hashCode());
        result = prime * result + ((getYieldly() == null) ? 0 : getYieldly().hashCode());
        result = prime * result + ((getFinidhtime() == null) ? 0 : getFinidhtime().hashCode());
        result = prime * result + ((getChecksimpletime() == null) ? 0 : getChecksimpletime().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getCheckpurchasetime() == null) ? 0 : getCheckpurchasetime().hashCode());
        result = prime * result + ((getProductsource() == null) ? 0 : getProductsource().hashCode());
        result = prime * result + ((getGoalaccount() == null) ? 0 : getGoalaccount().hashCode());
        result = prime * result + ((getPhotourl() == null) ? 0 : getPhotourl().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getGoaladress() == null) ? 0 : getGoaladress().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getProductnote() == null) ? 0 : getProductnote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", productid=").append(productid);
        sb.append(", producttitle=").append(producttitle);
        sb.append(", namechn=").append(namechn);
        sb.append(", goalsell=").append(goalsell);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", estimateweight=").append(estimateweight);
        sb.append(", antistop=").append(antistop);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", createcheckoper=").append(createcheckoper);
        sb.append(", createchecktime=").append(createchecktime);
        sb.append(", marketoper=").append(marketoper);
        sb.append(", forecastgross=").append(forecastgross);
        sb.append(", forecastsellnum=").append(forecastsellnum);
        sb.append(", quality=").append(quality);
        sb.append(", secular=").append(secular);
        sb.append(", country=").append(country);
        sb.append(", ifoldsku=").append(ifoldsku);
        sb.append(", urgent=").append(urgent);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", openflag=").append(openflag);
        sb.append(", corpid=").append(corpid);
        sb.append(", productnum=").append(productnum);
        sb.append(", status=").append(status);
        sb.append(", purchaseflowoper=").append(purchaseflowoper);
        sb.append(", finishtime=").append(finishtime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", reserve17=").append(reserve17);
        sb.append(", reserve18=").append(reserve18);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", lengthnum=").append(lengthnum);
        sb.append(", widthnum=").append(widthnum);
        sb.append(", heightnum=").append(heightnum);
        sb.append(", deliverytime=").append(deliverytime);
        sb.append(", totalassess=").append(totalassess);
        sb.append(", yieldly=").append(yieldly);
        sb.append(", finidhtime=").append(finidhtime);
        sb.append(", checksimpletime=").append(checksimpletime);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checkpurchasetime=").append(checkpurchasetime);
        sb.append(", productsource=").append(productsource);
        sb.append(", goalaccount=").append(goalaccount);
        sb.append(", photourl=").append(photourl);
        sb.append(", url=").append(url);
        sb.append(", goaladress=").append(goaladress);
        sb.append(", note=").append(note);
        sb.append(", picture=").append(picture);
        sb.append(", content=").append(content);
        sb.append(", productnote=").append(productnote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}