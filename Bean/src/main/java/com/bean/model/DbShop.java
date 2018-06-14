package com.bean.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
public class DbShop implements Serializable {
    private String sid;

    private String corpid;

    private String name;

    private String password;

    private String slevel;

    private BigDecimal credit1;

    private BigDecimal credit2;

    private BigDecimal credit3;

    private String manager;

    private String tele;

    private String fax;

    private BigDecimal ordernum;

    private String templetfile;

    private String oper;

    private Date opertime;

    private BigDecimal rate;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String reserve6;

    private String reserve7;

    private String reserve8;

    private String reserve9;

    private String reserve10;

    private String reserve11;

    private String reserve12;

    private String reserve14;

    private BigDecimal reserve15;

    private BigDecimal reserve16;

    private BigDecimal reserve17;

    private BigDecimal reserve18;

    private String itemid;

    private String openflag;

    private String tokenflag;

    private String contact;

    private String contacte;

    private String postcode;

    private String mobile;

    private String phone;

    private String eubemail;

    private String devuserid;

    private String version;

    private String ebaysitid;

    private String provinceen;

    private String cityen;

    private String districten;

    private String starttime;

    private String endtime;

    private String amazon;

    private String amazonflag;

    private String spaypalname;

    private String amazonurl;

    private String amazonurlname;

    private String ebayshopid;

    private String ebayshopname;

    private BigDecimal orderoper;

    private String paypalemail;

    private String shopmanager;

    private String cscartemail;

    private String descr;

    private String email;

    private String templetcontent;

    private String templetclob;

    private String reserve13;

    private String reserve19;

    private String reserve20;

    private String tokenid;

    private String tokendescr;

    private String street;

    private String streete;

    private String province;

    private String city;

    private String district;

    private String eubtonken;

    private String selluserid;

    private String ebayfeemoneyrate;

    private String accesskeyid;

    private String secretaccesskey;

    private String applicationname;

    private String sellerid;

    private String marketplaceid;

    //批量操作使用字段,不存
    private List<String> shopIdList;

    private static final long serialVersionUID = 1L;



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
        DbShop other = (DbShop) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSlevel() == null ? other.getSlevel() == null : this.getSlevel().equals(other.getSlevel()))
            && (this.getCredit1() == null ? other.getCredit1() == null : this.getCredit1().equals(other.getCredit1()))
            && (this.getCredit2() == null ? other.getCredit2() == null : this.getCredit2().equals(other.getCredit2()))
            && (this.getCredit3() == null ? other.getCredit3() == null : this.getCredit3().equals(other.getCredit3()))
            && (this.getManager() == null ? other.getManager() == null : this.getManager().equals(other.getManager()))
            && (this.getTele() == null ? other.getTele() == null : this.getTele().equals(other.getTele()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getTempletfile() == null ? other.getTempletfile() == null : this.getTempletfile().equals(other.getTempletfile()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getReserve17() == null ? other.getReserve17() == null : this.getReserve17().equals(other.getReserve17()))
            && (this.getReserve18() == null ? other.getReserve18() == null : this.getReserve18().equals(other.getReserve18()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getTokenflag() == null ? other.getTokenflag() == null : this.getTokenflag().equals(other.getTokenflag()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getContacte() == null ? other.getContacte() == null : this.getContacte().equals(other.getContacte()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEubemail() == null ? other.getEubemail() == null : this.getEubemail().equals(other.getEubemail()))
            && (this.getDevuserid() == null ? other.getDevuserid() == null : this.getDevuserid().equals(other.getDevuserid()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getEbaysitid() == null ? other.getEbaysitid() == null : this.getEbaysitid().equals(other.getEbaysitid()))
            && (this.getProvinceen() == null ? other.getProvinceen() == null : this.getProvinceen().equals(other.getProvinceen()))
            && (this.getCityen() == null ? other.getCityen() == null : this.getCityen().equals(other.getCityen()))
            && (this.getDistricten() == null ? other.getDistricten() == null : this.getDistricten().equals(other.getDistricten()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getAmazon() == null ? other.getAmazon() == null : this.getAmazon().equals(other.getAmazon()))
            && (this.getAmazonflag() == null ? other.getAmazonflag() == null : this.getAmazonflag().equals(other.getAmazonflag()))
            && (this.getSpaypalname() == null ? other.getSpaypalname() == null : this.getSpaypalname().equals(other.getSpaypalname()))
            && (this.getAmazonurl() == null ? other.getAmazonurl() == null : this.getAmazonurl().equals(other.getAmazonurl()))
            && (this.getAmazonurlname() == null ? other.getAmazonurlname() == null : this.getAmazonurlname().equals(other.getAmazonurlname()))
            && (this.getEbayshopid() == null ? other.getEbayshopid() == null : this.getEbayshopid().equals(other.getEbayshopid()))
            && (this.getEbayshopname() == null ? other.getEbayshopname() == null : this.getEbayshopname().equals(other.getEbayshopname()))
            && (this.getOrderoper() == null ? other.getOrderoper() == null : this.getOrderoper().equals(other.getOrderoper()))
            && (this.getPaypalemail() == null ? other.getPaypalemail() == null : this.getPaypalemail().equals(other.getPaypalemail()))
            && (this.getShopmanager() == null ? other.getShopmanager() == null : this.getShopmanager().equals(other.getShopmanager()))
            && (this.getCscartemail() == null ? other.getCscartemail() == null : this.getCscartemail().equals(other.getCscartemail()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getTempletcontent() == null ? other.getTempletcontent() == null : this.getTempletcontent().equals(other.getTempletcontent()))
            && (this.getTempletclob() == null ? other.getTempletclob() == null : this.getTempletclob().equals(other.getTempletclob()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve19() == null ? other.getReserve19() == null : this.getReserve19().equals(other.getReserve19()))
            && (this.getReserve20() == null ? other.getReserve20() == null : this.getReserve20().equals(other.getReserve20()))
            && (this.getTokenid() == null ? other.getTokenid() == null : this.getTokenid().equals(other.getTokenid()))
            && (this.getTokendescr() == null ? other.getTokendescr() == null : this.getTokendescr().equals(other.getTokendescr()))
            && (this.getStreet() == null ? other.getStreet() == null : this.getStreet().equals(other.getStreet()))
            && (this.getStreete() == null ? other.getStreete() == null : this.getStreete().equals(other.getStreete()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getEubtonken() == null ? other.getEubtonken() == null : this.getEubtonken().equals(other.getEubtonken()))
            && (this.getSelluserid() == null ? other.getSelluserid() == null : this.getSelluserid().equals(other.getSelluserid()))
            && (this.getEbayfeemoneyrate() == null ? other.getEbayfeemoneyrate() == null : this.getEbayfeemoneyrate().equals(other.getEbayfeemoneyrate()))
            && (this.getAccesskeyid() == null ? other.getAccesskeyid() == null : this.getAccesskeyid().equals(other.getAccesskeyid()))
            && (this.getSecretaccesskey() == null ? other.getSecretaccesskey() == null : this.getSecretaccesskey().equals(other.getSecretaccesskey()))
            && (this.getApplicationname() == null ? other.getApplicationname() == null : this.getApplicationname().equals(other.getApplicationname()))
            && (this.getSellerid() == null ? other.getSellerid() == null : this.getSellerid().equals(other.getSellerid()))
            && (this.getMarketplaceid() == null ? other.getMarketplaceid() == null : this.getMarketplaceid().equals(other.getMarketplaceid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSlevel() == null) ? 0 : getSlevel().hashCode());
        result = prime * result + ((getCredit1() == null) ? 0 : getCredit1().hashCode());
        result = prime * result + ((getCredit2() == null) ? 0 : getCredit2().hashCode());
        result = prime * result + ((getCredit3() == null) ? 0 : getCredit3().hashCode());
        result = prime * result + ((getManager() == null) ? 0 : getManager().hashCode());
        result = prime * result + ((getTele() == null) ? 0 : getTele().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getTempletfile() == null) ? 0 : getTempletfile().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getReserve17() == null) ? 0 : getReserve17().hashCode());
        result = prime * result + ((getReserve18() == null) ? 0 : getReserve18().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getTokenflag() == null) ? 0 : getTokenflag().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getContacte() == null) ? 0 : getContacte().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEubemail() == null) ? 0 : getEubemail().hashCode());
        result = prime * result + ((getDevuserid() == null) ? 0 : getDevuserid().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getEbaysitid() == null) ? 0 : getEbaysitid().hashCode());
        result = prime * result + ((getProvinceen() == null) ? 0 : getProvinceen().hashCode());
        result = prime * result + ((getCityen() == null) ? 0 : getCityen().hashCode());
        result = prime * result + ((getDistricten() == null) ? 0 : getDistricten().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getAmazon() == null) ? 0 : getAmazon().hashCode());
        result = prime * result + ((getAmazonflag() == null) ? 0 : getAmazonflag().hashCode());
        result = prime * result + ((getSpaypalname() == null) ? 0 : getSpaypalname().hashCode());
        result = prime * result + ((getAmazonurl() == null) ? 0 : getAmazonurl().hashCode());
        result = prime * result + ((getAmazonurlname() == null) ? 0 : getAmazonurlname().hashCode());
        result = prime * result + ((getEbayshopid() == null) ? 0 : getEbayshopid().hashCode());
        result = prime * result + ((getEbayshopname() == null) ? 0 : getEbayshopname().hashCode());
        result = prime * result + ((getOrderoper() == null) ? 0 : getOrderoper().hashCode());
        result = prime * result + ((getPaypalemail() == null) ? 0 : getPaypalemail().hashCode());
        result = prime * result + ((getShopmanager() == null) ? 0 : getShopmanager().hashCode());
        result = prime * result + ((getCscartemail() == null) ? 0 : getCscartemail().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getTempletcontent() == null) ? 0 : getTempletcontent().hashCode());
        result = prime * result + ((getTempletclob() == null) ? 0 : getTempletclob().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve19() == null) ? 0 : getReserve19().hashCode());
        result = prime * result + ((getReserve20() == null) ? 0 : getReserve20().hashCode());
        result = prime * result + ((getTokenid() == null) ? 0 : getTokenid().hashCode());
        result = prime * result + ((getTokendescr() == null) ? 0 : getTokendescr().hashCode());
        result = prime * result + ((getStreet() == null) ? 0 : getStreet().hashCode());
        result = prime * result + ((getStreete() == null) ? 0 : getStreete().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getEubtonken() == null) ? 0 : getEubtonken().hashCode());
        result = prime * result + ((getSelluserid() == null) ? 0 : getSelluserid().hashCode());
        result = prime * result + ((getEbayfeemoneyrate() == null) ? 0 : getEbayfeemoneyrate().hashCode());
        result = prime * result + ((getAccesskeyid() == null) ? 0 : getAccesskeyid().hashCode());
        result = prime * result + ((getSecretaccesskey() == null) ? 0 : getSecretaccesskey().hashCode());
        result = prime * result + ((getApplicationname() == null) ? 0 : getApplicationname().hashCode());
        result = prime * result + ((getSellerid() == null) ? 0 : getSellerid().hashCode());
        result = prime * result + ((getMarketplaceid() == null) ? 0 : getMarketplaceid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", corpid=").append(corpid);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", slevel=").append(slevel);
        sb.append(", credit1=").append(credit1);
        sb.append(", credit2=").append(credit2);
        sb.append(", credit3=").append(credit3);
        sb.append(", manager=").append(manager);
        sb.append(", tele=").append(tele);
        sb.append(", fax=").append(fax);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", templetfile=").append(templetfile);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", rate=").append(rate);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", reserve17=").append(reserve17);
        sb.append(", reserve18=").append(reserve18);
        sb.append(", itemid=").append(itemid);
        sb.append(", openflag=").append(openflag);
        sb.append(", tokenflag=").append(tokenflag);
        sb.append(", contact=").append(contact);
        sb.append(", contacte=").append(contacte);
        sb.append(", postcode=").append(postcode);
        sb.append(", mobile=").append(mobile);
        sb.append(", phone=").append(phone);
        sb.append(", eubemail=").append(eubemail);
        sb.append(", devuserid=").append(devuserid);
        sb.append(", version=").append(version);
        sb.append(", ebaysitid=").append(ebaysitid);
        sb.append(", provinceen=").append(provinceen);
        sb.append(", cityen=").append(cityen);
        sb.append(", districten=").append(districten);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", amazon=").append(amazon);
        sb.append(", amazonflag=").append(amazonflag);
        sb.append(", spaypalname=").append(spaypalname);
        sb.append(", amazonurl=").append(amazonurl);
        sb.append(", amazonurlname=").append(amazonurlname);
        sb.append(", ebayshopid=").append(ebayshopid);
        sb.append(", ebayshopname=").append(ebayshopname);
        sb.append(", orderoper=").append(orderoper);
        sb.append(", paypalemail=").append(paypalemail);
        sb.append(", shopmanager=").append(shopmanager);
        sb.append(", cscartemail=").append(cscartemail);
        sb.append(", descr=").append(descr);
        sb.append(", email=").append(email);
        sb.append(", templetcontent=").append(templetcontent);
        sb.append(", templetclob=").append(templetclob);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve19=").append(reserve19);
        sb.append(", reserve20=").append(reserve20);
        sb.append(", tokenid=").append(tokenid);
        sb.append(", tokendescr=").append(tokendescr);
        sb.append(", street=").append(street);
        sb.append(", streete=").append(streete);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", eubtonken=").append(eubtonken);
        sb.append(", selluserid=").append(selluserid);
        sb.append(", ebayfeemoneyrate=").append(ebayfeemoneyrate);
        sb.append(", accesskeyid=").append(accesskeyid);
        sb.append(", secretaccesskey=").append(secretaccesskey);
        sb.append(", applicationname=").append(applicationname);
        sb.append(", sellerid=").append(sellerid);
        sb.append(", marketplaceid=").append(marketplaceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}