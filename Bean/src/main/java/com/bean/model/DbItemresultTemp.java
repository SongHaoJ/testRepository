package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbItemresultTemp implements Serializable {
    private BigDecimal sid;

    private String itemid;

    private String applicationdata;

    private Short autopay;

    private String buyerguaranteepricecode;

    private BigDecimal buyerguaranteeprice;

    private String buyerprotection;

    private String buyitnowpricecode;

    private BigDecimal buyitnowprice;

    private String conditiondisplayname;

    private Integer conditionid;

    private String country;

    private String currencycode;

    private String description;

    private Integer dispatchtimemax;

    private Integer gifticon;

    private Integer hitcount;

    private String hitcounter;

    private Long layoutid;

    private Long themeid;

    private Short adult;

    private Short bindingauction;

    private Short checkoutenabled;

    private Date starttime;

    private Date endtime;

    private String viewitemurl;

    private String viewitemurlfornaturalsearch;

    private String listingduration;

    private String listingtype;

    private String location;

    private String paypalemailaddress;

    private String gallerurl;

    private String pictureurl;

    private String primarycategoryid;

    private String primarycategoryname;

    private Long quantity;

    private String email;

    private String feedbackratingstar;

    private Long feedbackscore;

    private BigDecimal positivefeedbackpercent;

    private String storeurl;

    private String site;

    private String status;

    private String userid;

    private Long bidcount;

    private String listingstatus;

    private Long quantitysold;

    private String paymentinstructions;

    private String website;

    private String sku;

    private String title;

    private String uuid;

    private String companyname;

    private String cityname;

    private String countryname;

    private String firstname;

    private String lastname;

    private String phone;

    private String phone2;

    private String postalcode;

    private String stateorprovince;

    private String street;

    private String street1;

    private String street2;

    private String sellemail;

    private Short flag;

    private Short calculateflag;

    private Date updatetime;

    private Short itemtype;

    private Short itemflag;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getApplicationdata() {
        return applicationdata;
    }

    public void setApplicationdata(String applicationdata) {
        this.applicationdata = applicationdata == null ? null : applicationdata.trim();
    }

    public Short getAutopay() {
        return autopay;
    }

    public void setAutopay(Short autopay) {
        this.autopay = autopay;
    }

    public String getBuyerguaranteepricecode() {
        return buyerguaranteepricecode;
    }

    public void setBuyerguaranteepricecode(String buyerguaranteepricecode) {
        this.buyerguaranteepricecode = buyerguaranteepricecode == null ? null : buyerguaranteepricecode.trim();
    }

    public BigDecimal getBuyerguaranteeprice() {
        return buyerguaranteeprice;
    }

    public void setBuyerguaranteeprice(BigDecimal buyerguaranteeprice) {
        this.buyerguaranteeprice = buyerguaranteeprice;
    }

    public String getBuyerprotection() {
        return buyerprotection;
    }

    public void setBuyerprotection(String buyerprotection) {
        this.buyerprotection = buyerprotection == null ? null : buyerprotection.trim();
    }

    public String getBuyitnowpricecode() {
        return buyitnowpricecode;
    }

    public void setBuyitnowpricecode(String buyitnowpricecode) {
        this.buyitnowpricecode = buyitnowpricecode == null ? null : buyitnowpricecode.trim();
    }

    public BigDecimal getBuyitnowprice() {
        return buyitnowprice;
    }

    public void setBuyitnowprice(BigDecimal buyitnowprice) {
        this.buyitnowprice = buyitnowprice;
    }

    public String getConditiondisplayname() {
        return conditiondisplayname;
    }

    public void setConditiondisplayname(String conditiondisplayname) {
        this.conditiondisplayname = conditiondisplayname == null ? null : conditiondisplayname.trim();
    }

    public Integer getConditionid() {
        return conditionid;
    }

    public void setConditionid(Integer conditionid) {
        this.conditionid = conditionid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode == null ? null : currencycode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDispatchtimemax() {
        return dispatchtimemax;
    }

    public void setDispatchtimemax(Integer dispatchtimemax) {
        this.dispatchtimemax = dispatchtimemax;
    }

    public Integer getGifticon() {
        return gifticon;
    }

    public void setGifticon(Integer gifticon) {
        this.gifticon = gifticon;
    }

    public Integer getHitcount() {
        return hitcount;
    }

    public void setHitcount(Integer hitcount) {
        this.hitcount = hitcount;
    }

    public String getHitcounter() {
        return hitcounter;
    }

    public void setHitcounter(String hitcounter) {
        this.hitcounter = hitcounter == null ? null : hitcounter.trim();
    }

    public Long getLayoutid() {
        return layoutid;
    }

    public void setLayoutid(Long layoutid) {
        this.layoutid = layoutid;
    }

    public Long getThemeid() {
        return themeid;
    }

    public void setThemeid(Long themeid) {
        this.themeid = themeid;
    }

    public Short getAdult() {
        return adult;
    }

    public void setAdult(Short adult) {
        this.adult = adult;
    }

    public Short getBindingauction() {
        return bindingauction;
    }

    public void setBindingauction(Short bindingauction) {
        this.bindingauction = bindingauction;
    }

    public Short getCheckoutenabled() {
        return checkoutenabled;
    }

    public void setCheckoutenabled(Short checkoutenabled) {
        this.checkoutenabled = checkoutenabled;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getViewitemurl() {
        return viewitemurl;
    }

    public void setViewitemurl(String viewitemurl) {
        this.viewitemurl = viewitemurl == null ? null : viewitemurl.trim();
    }

    public String getViewitemurlfornaturalsearch() {
        return viewitemurlfornaturalsearch;
    }

    public void setViewitemurlfornaturalsearch(String viewitemurlfornaturalsearch) {
        this.viewitemurlfornaturalsearch = viewitemurlfornaturalsearch == null ? null : viewitemurlfornaturalsearch.trim();
    }

    public String getListingduration() {
        return listingduration;
    }

    public void setListingduration(String listingduration) {
        this.listingduration = listingduration == null ? null : listingduration.trim();
    }

    public String getListingtype() {
        return listingtype;
    }

    public void setListingtype(String listingtype) {
        this.listingtype = listingtype == null ? null : listingtype.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPaypalemailaddress() {
        return paypalemailaddress;
    }

    public void setPaypalemailaddress(String paypalemailaddress) {
        this.paypalemailaddress = paypalemailaddress == null ? null : paypalemailaddress.trim();
    }

    public String getGallerurl() {
        return gallerurl;
    }

    public void setGallerurl(String gallerurl) {
        this.gallerurl = gallerurl == null ? null : gallerurl.trim();
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public String getPrimarycategoryid() {
        return primarycategoryid;
    }

    public void setPrimarycategoryid(String primarycategoryid) {
        this.primarycategoryid = primarycategoryid == null ? null : primarycategoryid.trim();
    }

    public String getPrimarycategoryname() {
        return primarycategoryname;
    }

    public void setPrimarycategoryname(String primarycategoryname) {
        this.primarycategoryname = primarycategoryname == null ? null : primarycategoryname.trim();
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFeedbackratingstar() {
        return feedbackratingstar;
    }

    public void setFeedbackratingstar(String feedbackratingstar) {
        this.feedbackratingstar = feedbackratingstar == null ? null : feedbackratingstar.trim();
    }

    public Long getFeedbackscore() {
        return feedbackscore;
    }

    public void setFeedbackscore(Long feedbackscore) {
        this.feedbackscore = feedbackscore;
    }

    public BigDecimal getPositivefeedbackpercent() {
        return positivefeedbackpercent;
    }

    public void setPositivefeedbackpercent(BigDecimal positivefeedbackpercent) {
        this.positivefeedbackpercent = positivefeedbackpercent;
    }

    public String getStoreurl() {
        return storeurl;
    }

    public void setStoreurl(String storeurl) {
        this.storeurl = storeurl == null ? null : storeurl.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Long getBidcount() {
        return bidcount;
    }

    public void setBidcount(Long bidcount) {
        this.bidcount = bidcount;
    }

    public String getListingstatus() {
        return listingstatus;
    }

    public void setListingstatus(String listingstatus) {
        this.listingstatus = listingstatus == null ? null : listingstatus.trim();
    }

    public Long getQuantitysold() {
        return quantitysold;
    }

    public void setQuantitysold(Long quantitysold) {
        this.quantitysold = quantitysold;
    }

    public String getPaymentinstructions() {
        return paymentinstructions;
    }

    public void setPaymentinstructions(String paymentinstructions) {
        this.paymentinstructions = paymentinstructions == null ? null : paymentinstructions.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getStateorprovince() {
        return stateorprovince;
    }

    public void setStateorprovince(String stateorprovince) {
        this.stateorprovince = stateorprovince == null ? null : stateorprovince.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1 == null ? null : street1.trim();
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2 == null ? null : street2.trim();
    }

    public String getSellemail() {
        return sellemail;
    }

    public void setSellemail(String sellemail) {
        this.sellemail = sellemail == null ? null : sellemail.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Short getCalculateflag() {
        return calculateflag;
    }

    public void setCalculateflag(Short calculateflag) {
        this.calculateflag = calculateflag;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getItemtype() {
        return itemtype;
    }

    public void setItemtype(Short itemtype) {
        this.itemtype = itemtype;
    }

    public Short getItemflag() {
        return itemflag;
    }

    public void setItemflag(Short itemflag) {
        this.itemflag = itemflag;
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
        DbItemresultTemp other = (DbItemresultTemp) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getApplicationdata() == null ? other.getApplicationdata() == null : this.getApplicationdata().equals(other.getApplicationdata()))
            && (this.getAutopay() == null ? other.getAutopay() == null : this.getAutopay().equals(other.getAutopay()))
            && (this.getBuyerguaranteepricecode() == null ? other.getBuyerguaranteepricecode() == null : this.getBuyerguaranteepricecode().equals(other.getBuyerguaranteepricecode()))
            && (this.getBuyerguaranteeprice() == null ? other.getBuyerguaranteeprice() == null : this.getBuyerguaranteeprice().equals(other.getBuyerguaranteeprice()))
            && (this.getBuyerprotection() == null ? other.getBuyerprotection() == null : this.getBuyerprotection().equals(other.getBuyerprotection()))
            && (this.getBuyitnowpricecode() == null ? other.getBuyitnowpricecode() == null : this.getBuyitnowpricecode().equals(other.getBuyitnowpricecode()))
            && (this.getBuyitnowprice() == null ? other.getBuyitnowprice() == null : this.getBuyitnowprice().equals(other.getBuyitnowprice()))
            && (this.getConditiondisplayname() == null ? other.getConditiondisplayname() == null : this.getConditiondisplayname().equals(other.getConditiondisplayname()))
            && (this.getConditionid() == null ? other.getConditionid() == null : this.getConditionid().equals(other.getConditionid()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getCurrencycode() == null ? other.getCurrencycode() == null : this.getCurrencycode().equals(other.getCurrencycode()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDispatchtimemax() == null ? other.getDispatchtimemax() == null : this.getDispatchtimemax().equals(other.getDispatchtimemax()))
            && (this.getGifticon() == null ? other.getGifticon() == null : this.getGifticon().equals(other.getGifticon()))
            && (this.getHitcount() == null ? other.getHitcount() == null : this.getHitcount().equals(other.getHitcount()))
            && (this.getHitcounter() == null ? other.getHitcounter() == null : this.getHitcounter().equals(other.getHitcounter()))
            && (this.getLayoutid() == null ? other.getLayoutid() == null : this.getLayoutid().equals(other.getLayoutid()))
            && (this.getThemeid() == null ? other.getThemeid() == null : this.getThemeid().equals(other.getThemeid()))
            && (this.getAdult() == null ? other.getAdult() == null : this.getAdult().equals(other.getAdult()))
            && (this.getBindingauction() == null ? other.getBindingauction() == null : this.getBindingauction().equals(other.getBindingauction()))
            && (this.getCheckoutenabled() == null ? other.getCheckoutenabled() == null : this.getCheckoutenabled().equals(other.getCheckoutenabled()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getViewitemurl() == null ? other.getViewitemurl() == null : this.getViewitemurl().equals(other.getViewitemurl()))
            && (this.getViewitemurlfornaturalsearch() == null ? other.getViewitemurlfornaturalsearch() == null : this.getViewitemurlfornaturalsearch().equals(other.getViewitemurlfornaturalsearch()))
            && (this.getListingduration() == null ? other.getListingduration() == null : this.getListingduration().equals(other.getListingduration()))
            && (this.getListingtype() == null ? other.getListingtype() == null : this.getListingtype().equals(other.getListingtype()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getPaypalemailaddress() == null ? other.getPaypalemailaddress() == null : this.getPaypalemailaddress().equals(other.getPaypalemailaddress()))
            && (this.getGallerurl() == null ? other.getGallerurl() == null : this.getGallerurl().equals(other.getGallerurl()))
            && (this.getPictureurl() == null ? other.getPictureurl() == null : this.getPictureurl().equals(other.getPictureurl()))
            && (this.getPrimarycategoryid() == null ? other.getPrimarycategoryid() == null : this.getPrimarycategoryid().equals(other.getPrimarycategoryid()))
            && (this.getPrimarycategoryname() == null ? other.getPrimarycategoryname() == null : this.getPrimarycategoryname().equals(other.getPrimarycategoryname()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getFeedbackratingstar() == null ? other.getFeedbackratingstar() == null : this.getFeedbackratingstar().equals(other.getFeedbackratingstar()))
            && (this.getFeedbackscore() == null ? other.getFeedbackscore() == null : this.getFeedbackscore().equals(other.getFeedbackscore()))
            && (this.getPositivefeedbackpercent() == null ? other.getPositivefeedbackpercent() == null : this.getPositivefeedbackpercent().equals(other.getPositivefeedbackpercent()))
            && (this.getStoreurl() == null ? other.getStoreurl() == null : this.getStoreurl().equals(other.getStoreurl()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBidcount() == null ? other.getBidcount() == null : this.getBidcount().equals(other.getBidcount()))
            && (this.getListingstatus() == null ? other.getListingstatus() == null : this.getListingstatus().equals(other.getListingstatus()))
            && (this.getQuantitysold() == null ? other.getQuantitysold() == null : this.getQuantitysold().equals(other.getQuantitysold()))
            && (this.getPaymentinstructions() == null ? other.getPaymentinstructions() == null : this.getPaymentinstructions().equals(other.getPaymentinstructions()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getCountryname() == null ? other.getCountryname() == null : this.getCountryname().equals(other.getCountryname()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPhone2() == null ? other.getPhone2() == null : this.getPhone2().equals(other.getPhone2()))
            && (this.getPostalcode() == null ? other.getPostalcode() == null : this.getPostalcode().equals(other.getPostalcode()))
            && (this.getStateorprovince() == null ? other.getStateorprovince() == null : this.getStateorprovince().equals(other.getStateorprovince()))
            && (this.getStreet() == null ? other.getStreet() == null : this.getStreet().equals(other.getStreet()))
            && (this.getStreet1() == null ? other.getStreet1() == null : this.getStreet1().equals(other.getStreet1()))
            && (this.getStreet2() == null ? other.getStreet2() == null : this.getStreet2().equals(other.getStreet2()))
            && (this.getSellemail() == null ? other.getSellemail() == null : this.getSellemail().equals(other.getSellemail()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCalculateflag() == null ? other.getCalculateflag() == null : this.getCalculateflag().equals(other.getCalculateflag()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getItemtype() == null ? other.getItemtype() == null : this.getItemtype().equals(other.getItemtype()))
            && (this.getItemflag() == null ? other.getItemflag() == null : this.getItemflag().equals(other.getItemflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getApplicationdata() == null) ? 0 : getApplicationdata().hashCode());
        result = prime * result + ((getAutopay() == null) ? 0 : getAutopay().hashCode());
        result = prime * result + ((getBuyerguaranteepricecode() == null) ? 0 : getBuyerguaranteepricecode().hashCode());
        result = prime * result + ((getBuyerguaranteeprice() == null) ? 0 : getBuyerguaranteeprice().hashCode());
        result = prime * result + ((getBuyerprotection() == null) ? 0 : getBuyerprotection().hashCode());
        result = prime * result + ((getBuyitnowpricecode() == null) ? 0 : getBuyitnowpricecode().hashCode());
        result = prime * result + ((getBuyitnowprice() == null) ? 0 : getBuyitnowprice().hashCode());
        result = prime * result + ((getConditiondisplayname() == null) ? 0 : getConditiondisplayname().hashCode());
        result = prime * result + ((getConditionid() == null) ? 0 : getConditionid().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getCurrencycode() == null) ? 0 : getCurrencycode().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDispatchtimemax() == null) ? 0 : getDispatchtimemax().hashCode());
        result = prime * result + ((getGifticon() == null) ? 0 : getGifticon().hashCode());
        result = prime * result + ((getHitcount() == null) ? 0 : getHitcount().hashCode());
        result = prime * result + ((getHitcounter() == null) ? 0 : getHitcounter().hashCode());
        result = prime * result + ((getLayoutid() == null) ? 0 : getLayoutid().hashCode());
        result = prime * result + ((getThemeid() == null) ? 0 : getThemeid().hashCode());
        result = prime * result + ((getAdult() == null) ? 0 : getAdult().hashCode());
        result = prime * result + ((getBindingauction() == null) ? 0 : getBindingauction().hashCode());
        result = prime * result + ((getCheckoutenabled() == null) ? 0 : getCheckoutenabled().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getViewitemurl() == null) ? 0 : getViewitemurl().hashCode());
        result = prime * result + ((getViewitemurlfornaturalsearch() == null) ? 0 : getViewitemurlfornaturalsearch().hashCode());
        result = prime * result + ((getListingduration() == null) ? 0 : getListingduration().hashCode());
        result = prime * result + ((getListingtype() == null) ? 0 : getListingtype().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getPaypalemailaddress() == null) ? 0 : getPaypalemailaddress().hashCode());
        result = prime * result + ((getGallerurl() == null) ? 0 : getGallerurl().hashCode());
        result = prime * result + ((getPictureurl() == null) ? 0 : getPictureurl().hashCode());
        result = prime * result + ((getPrimarycategoryid() == null) ? 0 : getPrimarycategoryid().hashCode());
        result = prime * result + ((getPrimarycategoryname() == null) ? 0 : getPrimarycategoryname().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getFeedbackratingstar() == null) ? 0 : getFeedbackratingstar().hashCode());
        result = prime * result + ((getFeedbackscore() == null) ? 0 : getFeedbackscore().hashCode());
        result = prime * result + ((getPositivefeedbackpercent() == null) ? 0 : getPositivefeedbackpercent().hashCode());
        result = prime * result + ((getStoreurl() == null) ? 0 : getStoreurl().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBidcount() == null) ? 0 : getBidcount().hashCode());
        result = prime * result + ((getListingstatus() == null) ? 0 : getListingstatus().hashCode());
        result = prime * result + ((getQuantitysold() == null) ? 0 : getQuantitysold().hashCode());
        result = prime * result + ((getPaymentinstructions() == null) ? 0 : getPaymentinstructions().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getCountryname() == null) ? 0 : getCountryname().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPhone2() == null) ? 0 : getPhone2().hashCode());
        result = prime * result + ((getPostalcode() == null) ? 0 : getPostalcode().hashCode());
        result = prime * result + ((getStateorprovince() == null) ? 0 : getStateorprovince().hashCode());
        result = prime * result + ((getStreet() == null) ? 0 : getStreet().hashCode());
        result = prime * result + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        result = prime * result + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        result = prime * result + ((getSellemail() == null) ? 0 : getSellemail().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCalculateflag() == null) ? 0 : getCalculateflag().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getItemtype() == null) ? 0 : getItemtype().hashCode());
        result = prime * result + ((getItemflag() == null) ? 0 : getItemflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", itemid=").append(itemid);
        sb.append(", applicationdata=").append(applicationdata);
        sb.append(", autopay=").append(autopay);
        sb.append(", buyerguaranteepricecode=").append(buyerguaranteepricecode);
        sb.append(", buyerguaranteeprice=").append(buyerguaranteeprice);
        sb.append(", buyerprotection=").append(buyerprotection);
        sb.append(", buyitnowpricecode=").append(buyitnowpricecode);
        sb.append(", buyitnowprice=").append(buyitnowprice);
        sb.append(", conditiondisplayname=").append(conditiondisplayname);
        sb.append(", conditionid=").append(conditionid);
        sb.append(", country=").append(country);
        sb.append(", currencycode=").append(currencycode);
        sb.append(", description=").append(description);
        sb.append(", dispatchtimemax=").append(dispatchtimemax);
        sb.append(", gifticon=").append(gifticon);
        sb.append(", hitcount=").append(hitcount);
        sb.append(", hitcounter=").append(hitcounter);
        sb.append(", layoutid=").append(layoutid);
        sb.append(", themeid=").append(themeid);
        sb.append(", adult=").append(adult);
        sb.append(", bindingauction=").append(bindingauction);
        sb.append(", checkoutenabled=").append(checkoutenabled);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", viewitemurl=").append(viewitemurl);
        sb.append(", viewitemurlfornaturalsearch=").append(viewitemurlfornaturalsearch);
        sb.append(", listingduration=").append(listingduration);
        sb.append(", listingtype=").append(listingtype);
        sb.append(", location=").append(location);
        sb.append(", paypalemailaddress=").append(paypalemailaddress);
        sb.append(", gallerurl=").append(gallerurl);
        sb.append(", pictureurl=").append(pictureurl);
        sb.append(", primarycategoryid=").append(primarycategoryid);
        sb.append(", primarycategoryname=").append(primarycategoryname);
        sb.append(", quantity=").append(quantity);
        sb.append(", email=").append(email);
        sb.append(", feedbackratingstar=").append(feedbackratingstar);
        sb.append(", feedbackscore=").append(feedbackscore);
        sb.append(", positivefeedbackpercent=").append(positivefeedbackpercent);
        sb.append(", storeurl=").append(storeurl);
        sb.append(", site=").append(site);
        sb.append(", status=").append(status);
        sb.append(", userid=").append(userid);
        sb.append(", bidcount=").append(bidcount);
        sb.append(", listingstatus=").append(listingstatus);
        sb.append(", quantitysold=").append(quantitysold);
        sb.append(", paymentinstructions=").append(paymentinstructions);
        sb.append(", website=").append(website);
        sb.append(", sku=").append(sku);
        sb.append(", title=").append(title);
        sb.append(", uuid=").append(uuid);
        sb.append(", companyname=").append(companyname);
        sb.append(", cityname=").append(cityname);
        sb.append(", countryname=").append(countryname);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", phone=").append(phone);
        sb.append(", phone2=").append(phone2);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", stateorprovince=").append(stateorprovince);
        sb.append(", street=").append(street);
        sb.append(", street1=").append(street1);
        sb.append(", street2=").append(street2);
        sb.append(", sellemail=").append(sellemail);
        sb.append(", flag=").append(flag);
        sb.append(", calculateflag=").append(calculateflag);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", itemtype=").append(itemtype);
        sb.append(", itemflag=").append(itemflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}