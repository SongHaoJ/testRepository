package com.bean.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class DbProduct implements Serializable {
    private String sequenceid;

    private String sid;

    private String corpid;

    private String projectid;

    private String categoryid;

    private String unit;

    private String status;

    private String brandid;

    private String brand;

    private String manufactureid;

    private String manufacture;

    private String origin;

    private String originarea;

    private BigDecimal stockprice;

    private BigDecimal costprice;

    private BigDecimal sellprice;

    private BigDecimal batchprice1;

    private BigDecimal batchprice2;

    private BigDecimal batchprice3;

    private BigDecimal batchprice4;

    private String storageid;

    private String storage;

    private String locationid;

    private String location;

    private BigDecimal weight;

    private String sizes;

    private String color;

    private String barcode;

    private String availtime;

    private String picture1;

    private String picture2;

    private String picture4;

    private String buyflag;

    private BigDecimal buynum;

    private BigDecimal savenum;

    private BigDecimal ordernum;

    private BigDecimal alertnum;

    private String levels;

    private String openflag;

    private String oper;

    private Date opertime;

    private String translateflag;

    private String priceflag;

    private String contentflag;

    private String picflag;

    private String designflag;

    private String publicflag;

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

    private String manufactureid2;

    private String manufacture2;

    private String manufactureid3;

    private String manufacture3;

    private String checkstockoper;

    private Date checkstocktime;

    private BigDecimal price1;

    private BigDecimal price2;

    private BigDecimal price3;

    private BigDecimal price4;

    private BigDecimal price5;

    private BigDecimal price6;

    private BigDecimal price7;

    private BigDecimal price8;

    private String itemno;

    private String oper1;

    private String oper2;

    private String oper3;

    private String oper4;

    private String oper5;

    private String oper6;

    private String alertflag;

    private String packagingid;

    private String packagingname;

    private BigDecimal packagingweight;

    private BigDecimal minalernum;

    private BigDecimal savedate;

    private Date savestar;

    private Date nextsavetime;

    private BigDecimal declaredvalue;

    private BigDecimal manufactureprice;

    private BigDecimal manufactureprice1;

    private BigDecimal manufactureprice2;

    private String tort;

    private BigDecimal hjreserve7;

    private BigDecimal hjreserve8;

    private BigDecimal hjreserve9;

    private BigDecimal hjreserve10;

    private String createoper;

    private Date createdate;

    private BigDecimal packagingfee;

    private String storagebinflag;

    private String mainsku;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal high;

    private BigDecimal volume;

    private BigDecimal outerlength;

    private BigDecimal outerwidth;

    private BigDecimal outerhigh;

    private BigDecimal outervolume;

    private BigDecimal outergrossweight;

    private BigDecimal outernetweight;

    private BigDecimal grossweight;

    private BigDecimal reserve11;

    private BigDecimal reserve12;

    private BigDecimal reserve13;

    private BigDecimal reserve14;

    private BigDecimal reserve19;

    private BigDecimal reserve20;

    private String indexfordevelop;

    private BigDecimal purchaseflag;

    private BigDecimal grossprofit;

    private BigDecimal rateofmargin;

    private String purchasinglink3;

    private String purchasinglink2;

    private String name;

    private String content;

    private String descr;

    private String translate1;

    private String translate2;

    private String translate3;

    private String translate4;

    private String othercontent;

    private String alias1;

    private String alias2;

    private String alias3;

    private String picture3;

    private String shoptype;

    private String salesource;

    private String clobcontent;

    private String clobdescr;

    private String clobtranslate;

    private String alertdescr;

    private String iclass;

    private String nameen;

    private String hjreserve1;

    private String hjreserve2;

    private String hjreserve3;

    private String hjreserve4;

    private String hjreserve5;

    private String hjreserve6;

    private String outernorms;

    private String outerlevel;

    private String reserve15;

    private String reserve16;

    private String reserve17;

    private String reserve18;

    private String productname;

    private String purchaseremark;

    private String customsdetails;

    private static final long serialVersionUID = 1L;

    //重写set防止null
    public void setCostprice(BigDecimal costprice){
        this.costprice = costprice==null?new BigDecimal(0):costprice;
    }

    public void setPackagingweight (BigDecimal packagingweight){
        this.packagingweight = packagingweight==null?new BigDecimal(0):packagingweight;
    }

    public void setWeight (BigDecimal weight){
        this.weight = weight==null?new BigDecimal(0):weight;
    }

    public void setPackagingfee(BigDecimal packagingfee){
        this.packagingfee = packagingfee==null?new BigDecimal(0):packagingfee;
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
        DbProduct other = (DbProduct) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getProjectid() == null ? other.getProjectid() == null : this.getProjectid().equals(other.getProjectid()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getOriginarea() == null ? other.getOriginarea() == null : this.getOriginarea().equals(other.getOriginarea()))
            && (this.getStockprice() == null ? other.getStockprice() == null : this.getStockprice().equals(other.getStockprice()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getSellprice() == null ? other.getSellprice() == null : this.getSellprice().equals(other.getSellprice()))
            && (this.getBatchprice1() == null ? other.getBatchprice1() == null : this.getBatchprice1().equals(other.getBatchprice1()))
            && (this.getBatchprice2() == null ? other.getBatchprice2() == null : this.getBatchprice2().equals(other.getBatchprice2()))
            && (this.getBatchprice3() == null ? other.getBatchprice3() == null : this.getBatchprice3().equals(other.getBatchprice3()))
            && (this.getBatchprice4() == null ? other.getBatchprice4() == null : this.getBatchprice4().equals(other.getBatchprice4()))
            && (this.getStorageid() == null ? other.getStorageid() == null : this.getStorageid().equals(other.getStorageid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getLocationid() == null ? other.getLocationid() == null : this.getLocationid().equals(other.getLocationid()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getSizes() == null ? other.getSizes() == null : this.getSizes().equals(other.getSizes()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getAvailtime() == null ? other.getAvailtime() == null : this.getAvailtime().equals(other.getAvailtime()))
            && (this.getPicture1() == null ? other.getPicture1() == null : this.getPicture1().equals(other.getPicture1()))
            && (this.getPicture2() == null ? other.getPicture2() == null : this.getPicture2().equals(other.getPicture2()))
            && (this.getPicture4() == null ? other.getPicture4() == null : this.getPicture4().equals(other.getPicture4()))
            && (this.getBuyflag() == null ? other.getBuyflag() == null : this.getBuyflag().equals(other.getBuyflag()))
            && (this.getBuynum() == null ? other.getBuynum() == null : this.getBuynum().equals(other.getBuynum()))
            && (this.getSavenum() == null ? other.getSavenum() == null : this.getSavenum().equals(other.getSavenum()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getAlertnum() == null ? other.getAlertnum() == null : this.getAlertnum().equals(other.getAlertnum()))
            && (this.getLevels() == null ? other.getLevels() == null : this.getLevels().equals(other.getLevels()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getTranslateflag() == null ? other.getTranslateflag() == null : this.getTranslateflag().equals(other.getTranslateflag()))
            && (this.getPriceflag() == null ? other.getPriceflag() == null : this.getPriceflag().equals(other.getPriceflag()))
            && (this.getContentflag() == null ? other.getContentflag() == null : this.getContentflag().equals(other.getContentflag()))
            && (this.getPicflag() == null ? other.getPicflag() == null : this.getPicflag().equals(other.getPicflag()))
            && (this.getDesignflag() == null ? other.getDesignflag() == null : this.getDesignflag().equals(other.getDesignflag()))
            && (this.getPublicflag() == null ? other.getPublicflag() == null : this.getPublicflag().equals(other.getPublicflag()))
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
            && (this.getManufactureid2() == null ? other.getManufactureid2() == null : this.getManufactureid2().equals(other.getManufactureid2()))
            && (this.getManufacture2() == null ? other.getManufacture2() == null : this.getManufacture2().equals(other.getManufacture2()))
            && (this.getManufactureid3() == null ? other.getManufactureid3() == null : this.getManufactureid3().equals(other.getManufactureid3()))
            && (this.getManufacture3() == null ? other.getManufacture3() == null : this.getManufacture3().equals(other.getManufacture3()))
            && (this.getCheckstockoper() == null ? other.getCheckstockoper() == null : this.getCheckstockoper().equals(other.getCheckstockoper()))
            && (this.getCheckstocktime() == null ? other.getCheckstocktime() == null : this.getCheckstocktime().equals(other.getCheckstocktime()))
            && (this.getPrice1() == null ? other.getPrice1() == null : this.getPrice1().equals(other.getPrice1()))
            && (this.getPrice2() == null ? other.getPrice2() == null : this.getPrice2().equals(other.getPrice2()))
            && (this.getPrice3() == null ? other.getPrice3() == null : this.getPrice3().equals(other.getPrice3()))
            && (this.getPrice4() == null ? other.getPrice4() == null : this.getPrice4().equals(other.getPrice4()))
            && (this.getPrice5() == null ? other.getPrice5() == null : this.getPrice5().equals(other.getPrice5()))
            && (this.getPrice6() == null ? other.getPrice6() == null : this.getPrice6().equals(other.getPrice6()))
            && (this.getPrice7() == null ? other.getPrice7() == null : this.getPrice7().equals(other.getPrice7()))
            && (this.getPrice8() == null ? other.getPrice8() == null : this.getPrice8().equals(other.getPrice8()))
            && (this.getItemno() == null ? other.getItemno() == null : this.getItemno().equals(other.getItemno()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getOper2() == null ? other.getOper2() == null : this.getOper2().equals(other.getOper2()))
            && (this.getOper3() == null ? other.getOper3() == null : this.getOper3().equals(other.getOper3()))
            && (this.getOper4() == null ? other.getOper4() == null : this.getOper4().equals(other.getOper4()))
            && (this.getOper5() == null ? other.getOper5() == null : this.getOper5().equals(other.getOper5()))
            && (this.getOper6() == null ? other.getOper6() == null : this.getOper6().equals(other.getOper6()))
            && (this.getAlertflag() == null ? other.getAlertflag() == null : this.getAlertflag().equals(other.getAlertflag()))
            && (this.getPackagingid() == null ? other.getPackagingid() == null : this.getPackagingid().equals(other.getPackagingid()))
            && (this.getPackagingname() == null ? other.getPackagingname() == null : this.getPackagingname().equals(other.getPackagingname()))
            && (this.getPackagingweight() == null ? other.getPackagingweight() == null : this.getPackagingweight().equals(other.getPackagingweight()))
            && (this.getMinalernum() == null ? other.getMinalernum() == null : this.getMinalernum().equals(other.getMinalernum()))
            && (this.getSavedate() == null ? other.getSavedate() == null : this.getSavedate().equals(other.getSavedate()))
            && (this.getSavestar() == null ? other.getSavestar() == null : this.getSavestar().equals(other.getSavestar()))
            && (this.getNextsavetime() == null ? other.getNextsavetime() == null : this.getNextsavetime().equals(other.getNextsavetime()))
            && (this.getDeclaredvalue() == null ? other.getDeclaredvalue() == null : this.getDeclaredvalue().equals(other.getDeclaredvalue()))
            && (this.getManufactureprice() == null ? other.getManufactureprice() == null : this.getManufactureprice().equals(other.getManufactureprice()))
            && (this.getManufactureprice1() == null ? other.getManufactureprice1() == null : this.getManufactureprice1().equals(other.getManufactureprice1()))
            && (this.getManufactureprice2() == null ? other.getManufactureprice2() == null : this.getManufactureprice2().equals(other.getManufactureprice2()))
            && (this.getTort() == null ? other.getTort() == null : this.getTort().equals(other.getTort()))
            && (this.getHjreserve7() == null ? other.getHjreserve7() == null : this.getHjreserve7().equals(other.getHjreserve7()))
            && (this.getHjreserve8() == null ? other.getHjreserve8() == null : this.getHjreserve8().equals(other.getHjreserve8()))
            && (this.getHjreserve9() == null ? other.getHjreserve9() == null : this.getHjreserve9().equals(other.getHjreserve9()))
            && (this.getHjreserve10() == null ? other.getHjreserve10() == null : this.getHjreserve10().equals(other.getHjreserve10()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getPackagingfee() == null ? other.getPackagingfee() == null : this.getPackagingfee().equals(other.getPackagingfee()))
            && (this.getStoragebinflag() == null ? other.getStoragebinflag() == null : this.getStoragebinflag().equals(other.getStoragebinflag()))
            && (this.getMainsku() == null ? other.getMainsku() == null : this.getMainsku().equals(other.getMainsku()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getOuterlength() == null ? other.getOuterlength() == null : this.getOuterlength().equals(other.getOuterlength()))
            && (this.getOuterwidth() == null ? other.getOuterwidth() == null : this.getOuterwidth().equals(other.getOuterwidth()))
            && (this.getOuterhigh() == null ? other.getOuterhigh() == null : this.getOuterhigh().equals(other.getOuterhigh()))
            && (this.getOutervolume() == null ? other.getOutervolume() == null : this.getOutervolume().equals(other.getOutervolume()))
            && (this.getOutergrossweight() == null ? other.getOutergrossweight() == null : this.getOutergrossweight().equals(other.getOutergrossweight()))
            && (this.getOuternetweight() == null ? other.getOuternetweight() == null : this.getOuternetweight().equals(other.getOuternetweight()))
            && (this.getGrossweight() == null ? other.getGrossweight() == null : this.getGrossweight().equals(other.getGrossweight()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve19() == null ? other.getReserve19() == null : this.getReserve19().equals(other.getReserve19()))
            && (this.getReserve20() == null ? other.getReserve20() == null : this.getReserve20().equals(other.getReserve20()))
            && (this.getIndexfordevelop() == null ? other.getIndexfordevelop() == null : this.getIndexfordevelop().equals(other.getIndexfordevelop()))
            && (this.getPurchaseflag() == null ? other.getPurchaseflag() == null : this.getPurchaseflag().equals(other.getPurchaseflag()))
            && (this.getGrossprofit() == null ? other.getGrossprofit() == null : this.getGrossprofit().equals(other.getGrossprofit()))
            && (this.getRateofmargin() == null ? other.getRateofmargin() == null : this.getRateofmargin().equals(other.getRateofmargin()))
            && (this.getPurchasinglink3() == null ? other.getPurchasinglink3() == null : this.getPurchasinglink3().equals(other.getPurchasinglink3()))
            && (this.getPurchasinglink2() == null ? other.getPurchasinglink2() == null : this.getPurchasinglink2().equals(other.getPurchasinglink2()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getTranslate1() == null ? other.getTranslate1() == null : this.getTranslate1().equals(other.getTranslate1()))
            && (this.getTranslate2() == null ? other.getTranslate2() == null : this.getTranslate2().equals(other.getTranslate2()))
            && (this.getTranslate3() == null ? other.getTranslate3() == null : this.getTranslate3().equals(other.getTranslate3()))
            && (this.getTranslate4() == null ? other.getTranslate4() == null : this.getTranslate4().equals(other.getTranslate4()))
            && (this.getOthercontent() == null ? other.getOthercontent() == null : this.getOthercontent().equals(other.getOthercontent()))
            && (this.getAlias1() == null ? other.getAlias1() == null : this.getAlias1().equals(other.getAlias1()))
            && (this.getAlias2() == null ? other.getAlias2() == null : this.getAlias2().equals(other.getAlias2()))
            && (this.getAlias3() == null ? other.getAlias3() == null : this.getAlias3().equals(other.getAlias3()))
            && (this.getPicture3() == null ? other.getPicture3() == null : this.getPicture3().equals(other.getPicture3()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getSalesource() == null ? other.getSalesource() == null : this.getSalesource().equals(other.getSalesource()))
            && (this.getClobcontent() == null ? other.getClobcontent() == null : this.getClobcontent().equals(other.getClobcontent()))
            && (this.getClobdescr() == null ? other.getClobdescr() == null : this.getClobdescr().equals(other.getClobdescr()))
            && (this.getClobtranslate() == null ? other.getClobtranslate() == null : this.getClobtranslate().equals(other.getClobtranslate()))
            && (this.getAlertdescr() == null ? other.getAlertdescr() == null : this.getAlertdescr().equals(other.getAlertdescr()))
            && (this.getIclass() == null ? other.getIclass() == null : this.getIclass().equals(other.getIclass()))
            && (this.getNameen() == null ? other.getNameen() == null : this.getNameen().equals(other.getNameen()))
            && (this.getHjreserve1() == null ? other.getHjreserve1() == null : this.getHjreserve1().equals(other.getHjreserve1()))
            && (this.getHjreserve2() == null ? other.getHjreserve2() == null : this.getHjreserve2().equals(other.getHjreserve2()))
            && (this.getHjreserve3() == null ? other.getHjreserve3() == null : this.getHjreserve3().equals(other.getHjreserve3()))
            && (this.getHjreserve4() == null ? other.getHjreserve4() == null : this.getHjreserve4().equals(other.getHjreserve4()))
            && (this.getHjreserve5() == null ? other.getHjreserve5() == null : this.getHjreserve5().equals(other.getHjreserve5()))
            && (this.getHjreserve6() == null ? other.getHjreserve6() == null : this.getHjreserve6().equals(other.getHjreserve6()))
            && (this.getOuternorms() == null ? other.getOuternorms() == null : this.getOuternorms().equals(other.getOuternorms()))
            && (this.getOuterlevel() == null ? other.getOuterlevel() == null : this.getOuterlevel().equals(other.getOuterlevel()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getReserve17() == null ? other.getReserve17() == null : this.getReserve17().equals(other.getReserve17()))
            && (this.getReserve18() == null ? other.getReserve18() == null : this.getReserve18().equals(other.getReserve18()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getPurchaseremark() == null ? other.getPurchaseremark() == null : this.getPurchaseremark().equals(other.getPurchaseremark()))
            && (this.getCustomsdetails() == null ? other.getCustomsdetails() == null : this.getCustomsdetails().equals(other.getCustomsdetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getProjectid() == null) ? 0 : getProjectid().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getOriginarea() == null) ? 0 : getOriginarea().hashCode());
        result = prime * result + ((getStockprice() == null) ? 0 : getStockprice().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getSellprice() == null) ? 0 : getSellprice().hashCode());
        result = prime * result + ((getBatchprice1() == null) ? 0 : getBatchprice1().hashCode());
        result = prime * result + ((getBatchprice2() == null) ? 0 : getBatchprice2().hashCode());
        result = prime * result + ((getBatchprice3() == null) ? 0 : getBatchprice3().hashCode());
        result = prime * result + ((getBatchprice4() == null) ? 0 : getBatchprice4().hashCode());
        result = prime * result + ((getStorageid() == null) ? 0 : getStorageid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getLocationid() == null) ? 0 : getLocationid().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getSizes() == null) ? 0 : getSizes().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getAvailtime() == null) ? 0 : getAvailtime().hashCode());
        result = prime * result + ((getPicture1() == null) ? 0 : getPicture1().hashCode());
        result = prime * result + ((getPicture2() == null) ? 0 : getPicture2().hashCode());
        result = prime * result + ((getPicture4() == null) ? 0 : getPicture4().hashCode());
        result = prime * result + ((getBuyflag() == null) ? 0 : getBuyflag().hashCode());
        result = prime * result + ((getBuynum() == null) ? 0 : getBuynum().hashCode());
        result = prime * result + ((getSavenum() == null) ? 0 : getSavenum().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getAlertnum() == null) ? 0 : getAlertnum().hashCode());
        result = prime * result + ((getLevels() == null) ? 0 : getLevels().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getTranslateflag() == null) ? 0 : getTranslateflag().hashCode());
        result = prime * result + ((getPriceflag() == null) ? 0 : getPriceflag().hashCode());
        result = prime * result + ((getContentflag() == null) ? 0 : getContentflag().hashCode());
        result = prime * result + ((getPicflag() == null) ? 0 : getPicflag().hashCode());
        result = prime * result + ((getDesignflag() == null) ? 0 : getDesignflag().hashCode());
        result = prime * result + ((getPublicflag() == null) ? 0 : getPublicflag().hashCode());
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
        result = prime * result + ((getManufactureid2() == null) ? 0 : getManufactureid2().hashCode());
        result = prime * result + ((getManufacture2() == null) ? 0 : getManufacture2().hashCode());
        result = prime * result + ((getManufactureid3() == null) ? 0 : getManufactureid3().hashCode());
        result = prime * result + ((getManufacture3() == null) ? 0 : getManufacture3().hashCode());
        result = prime * result + ((getCheckstockoper() == null) ? 0 : getCheckstockoper().hashCode());
        result = prime * result + ((getCheckstocktime() == null) ? 0 : getCheckstocktime().hashCode());
        result = prime * result + ((getPrice1() == null) ? 0 : getPrice1().hashCode());
        result = prime * result + ((getPrice2() == null) ? 0 : getPrice2().hashCode());
        result = prime * result + ((getPrice3() == null) ? 0 : getPrice3().hashCode());
        result = prime * result + ((getPrice4() == null) ? 0 : getPrice4().hashCode());
        result = prime * result + ((getPrice5() == null) ? 0 : getPrice5().hashCode());
        result = prime * result + ((getPrice6() == null) ? 0 : getPrice6().hashCode());
        result = prime * result + ((getPrice7() == null) ? 0 : getPrice7().hashCode());
        result = prime * result + ((getPrice8() == null) ? 0 : getPrice8().hashCode());
        result = prime * result + ((getItemno() == null) ? 0 : getItemno().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getOper2() == null) ? 0 : getOper2().hashCode());
        result = prime * result + ((getOper3() == null) ? 0 : getOper3().hashCode());
        result = prime * result + ((getOper4() == null) ? 0 : getOper4().hashCode());
        result = prime * result + ((getOper5() == null) ? 0 : getOper5().hashCode());
        result = prime * result + ((getOper6() == null) ? 0 : getOper6().hashCode());
        result = prime * result + ((getAlertflag() == null) ? 0 : getAlertflag().hashCode());
        result = prime * result + ((getPackagingid() == null) ? 0 : getPackagingid().hashCode());
        result = prime * result + ((getPackagingname() == null) ? 0 : getPackagingname().hashCode());
        result = prime * result + ((getPackagingweight() == null) ? 0 : getPackagingweight().hashCode());
        result = prime * result + ((getMinalernum() == null) ? 0 : getMinalernum().hashCode());
        result = prime * result + ((getSavedate() == null) ? 0 : getSavedate().hashCode());
        result = prime * result + ((getSavestar() == null) ? 0 : getSavestar().hashCode());
        result = prime * result + ((getNextsavetime() == null) ? 0 : getNextsavetime().hashCode());
        result = prime * result + ((getDeclaredvalue() == null) ? 0 : getDeclaredvalue().hashCode());
        result = prime * result + ((getManufactureprice() == null) ? 0 : getManufactureprice().hashCode());
        result = prime * result + ((getManufactureprice1() == null) ? 0 : getManufactureprice1().hashCode());
        result = prime * result + ((getManufactureprice2() == null) ? 0 : getManufactureprice2().hashCode());
        result = prime * result + ((getTort() == null) ? 0 : getTort().hashCode());
        result = prime * result + ((getHjreserve7() == null) ? 0 : getHjreserve7().hashCode());
        result = prime * result + ((getHjreserve8() == null) ? 0 : getHjreserve8().hashCode());
        result = prime * result + ((getHjreserve9() == null) ? 0 : getHjreserve9().hashCode());
        result = prime * result + ((getHjreserve10() == null) ? 0 : getHjreserve10().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getPackagingfee() == null) ? 0 : getPackagingfee().hashCode());
        result = prime * result + ((getStoragebinflag() == null) ? 0 : getStoragebinflag().hashCode());
        result = prime * result + ((getMainsku() == null) ? 0 : getMainsku().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getOuterlength() == null) ? 0 : getOuterlength().hashCode());
        result = prime * result + ((getOuterwidth() == null) ? 0 : getOuterwidth().hashCode());
        result = prime * result + ((getOuterhigh() == null) ? 0 : getOuterhigh().hashCode());
        result = prime * result + ((getOutervolume() == null) ? 0 : getOutervolume().hashCode());
        result = prime * result + ((getOutergrossweight() == null) ? 0 : getOutergrossweight().hashCode());
        result = prime * result + ((getOuternetweight() == null) ? 0 : getOuternetweight().hashCode());
        result = prime * result + ((getGrossweight() == null) ? 0 : getGrossweight().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve19() == null) ? 0 : getReserve19().hashCode());
        result = prime * result + ((getReserve20() == null) ? 0 : getReserve20().hashCode());
        result = prime * result + ((getIndexfordevelop() == null) ? 0 : getIndexfordevelop().hashCode());
        result = prime * result + ((getPurchaseflag() == null) ? 0 : getPurchaseflag().hashCode());
        result = prime * result + ((getGrossprofit() == null) ? 0 : getGrossprofit().hashCode());
        result = prime * result + ((getRateofmargin() == null) ? 0 : getRateofmargin().hashCode());
        result = prime * result + ((getPurchasinglink3() == null) ? 0 : getPurchasinglink3().hashCode());
        result = prime * result + ((getPurchasinglink2() == null) ? 0 : getPurchasinglink2().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getTranslate1() == null) ? 0 : getTranslate1().hashCode());
        result = prime * result + ((getTranslate2() == null) ? 0 : getTranslate2().hashCode());
        result = prime * result + ((getTranslate3() == null) ? 0 : getTranslate3().hashCode());
        result = prime * result + ((getTranslate4() == null) ? 0 : getTranslate4().hashCode());
        result = prime * result + ((getOthercontent() == null) ? 0 : getOthercontent().hashCode());
        result = prime * result + ((getAlias1() == null) ? 0 : getAlias1().hashCode());
        result = prime * result + ((getAlias2() == null) ? 0 : getAlias2().hashCode());
        result = prime * result + ((getAlias3() == null) ? 0 : getAlias3().hashCode());
        result = prime * result + ((getPicture3() == null) ? 0 : getPicture3().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getSalesource() == null) ? 0 : getSalesource().hashCode());
        result = prime * result + ((getClobcontent() == null) ? 0 : getClobcontent().hashCode());
        result = prime * result + ((getClobdescr() == null) ? 0 : getClobdescr().hashCode());
        result = prime * result + ((getClobtranslate() == null) ? 0 : getClobtranslate().hashCode());
        result = prime * result + ((getAlertdescr() == null) ? 0 : getAlertdescr().hashCode());
        result = prime * result + ((getIclass() == null) ? 0 : getIclass().hashCode());
        result = prime * result + ((getNameen() == null) ? 0 : getNameen().hashCode());
        result = prime * result + ((getHjreserve1() == null) ? 0 : getHjreserve1().hashCode());
        result = prime * result + ((getHjreserve2() == null) ? 0 : getHjreserve2().hashCode());
        result = prime * result + ((getHjreserve3() == null) ? 0 : getHjreserve3().hashCode());
        result = prime * result + ((getHjreserve4() == null) ? 0 : getHjreserve4().hashCode());
        result = prime * result + ((getHjreserve5() == null) ? 0 : getHjreserve5().hashCode());
        result = prime * result + ((getHjreserve6() == null) ? 0 : getHjreserve6().hashCode());
        result = prime * result + ((getOuternorms() == null) ? 0 : getOuternorms().hashCode());
        result = prime * result + ((getOuterlevel() == null) ? 0 : getOuterlevel().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getReserve17() == null) ? 0 : getReserve17().hashCode());
        result = prime * result + ((getReserve18() == null) ? 0 : getReserve18().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getPurchaseremark() == null) ? 0 : getPurchaseremark().hashCode());
        result = prime * result + ((getCustomsdetails() == null) ? 0 : getCustomsdetails().hashCode());
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
        sb.append(", corpid=").append(corpid);
        sb.append(", projectid=").append(projectid);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", unit=").append(unit);
        sb.append(", status=").append(status);
        sb.append(", brandid=").append(brandid);
        sb.append(", brand=").append(brand);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", origin=").append(origin);
        sb.append(", originarea=").append(originarea);
        sb.append(", stockprice=").append(stockprice);
        sb.append(", costprice=").append(costprice);
        sb.append(", sellprice=").append(sellprice);
        sb.append(", batchprice1=").append(batchprice1);
        sb.append(", batchprice2=").append(batchprice2);
        sb.append(", batchprice3=").append(batchprice3);
        sb.append(", batchprice4=").append(batchprice4);
        sb.append(", storageid=").append(storageid);
        sb.append(", storage=").append(storage);
        sb.append(", locationid=").append(locationid);
        sb.append(", location=").append(location);
        sb.append(", weight=").append(weight);
        sb.append(", sizes=").append(sizes);
        sb.append(", color=").append(color);
        sb.append(", barcode=").append(barcode);
        sb.append(", availtime=").append(availtime);
        sb.append(", picture1=").append(picture1);
        sb.append(", picture2=").append(picture2);
        sb.append(", picture4=").append(picture4);
        sb.append(", buyflag=").append(buyflag);
        sb.append(", buynum=").append(buynum);
        sb.append(", savenum=").append(savenum);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", alertnum=").append(alertnum);
        sb.append(", levels=").append(levels);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", translateflag=").append(translateflag);
        sb.append(", priceflag=").append(priceflag);
        sb.append(", contentflag=").append(contentflag);
        sb.append(", picflag=").append(picflag);
        sb.append(", designflag=").append(designflag);
        sb.append(", publicflag=").append(publicflag);
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
        sb.append(", manufactureid2=").append(manufactureid2);
        sb.append(", manufacture2=").append(manufacture2);
        sb.append(", manufactureid3=").append(manufactureid3);
        sb.append(", manufacture3=").append(manufacture3);
        sb.append(", checkstockoper=").append(checkstockoper);
        sb.append(", checkstocktime=").append(checkstocktime);
        sb.append(", price1=").append(price1);
        sb.append(", price2=").append(price2);
        sb.append(", price3=").append(price3);
        sb.append(", price4=").append(price4);
        sb.append(", price5=").append(price5);
        sb.append(", price6=").append(price6);
        sb.append(", price7=").append(price7);
        sb.append(", price8=").append(price8);
        sb.append(", itemno=").append(itemno);
        sb.append(", oper1=").append(oper1);
        sb.append(", oper2=").append(oper2);
        sb.append(", oper3=").append(oper3);
        sb.append(", oper4=").append(oper4);
        sb.append(", oper5=").append(oper5);
        sb.append(", oper6=").append(oper6);
        sb.append(", alertflag=").append(alertflag);
        sb.append(", packagingid=").append(packagingid);
        sb.append(", packagingname=").append(packagingname);
        sb.append(", packagingweight=").append(packagingweight);
        sb.append(", minalernum=").append(minalernum);
        sb.append(", savedate=").append(savedate);
        sb.append(", savestar=").append(savestar);
        sb.append(", nextsavetime=").append(nextsavetime);
        sb.append(", declaredvalue=").append(declaredvalue);
        sb.append(", manufactureprice=").append(manufactureprice);
        sb.append(", manufactureprice1=").append(manufactureprice1);
        sb.append(", manufactureprice2=").append(manufactureprice2);
        sb.append(", tort=").append(tort);
        sb.append(", hjreserve7=").append(hjreserve7);
        sb.append(", hjreserve8=").append(hjreserve8);
        sb.append(", hjreserve9=").append(hjreserve9);
        sb.append(", hjreserve10=").append(hjreserve10);
        sb.append(", createoper=").append(createoper);
        sb.append(", createdate=").append(createdate);
        sb.append(", packagingfee=").append(packagingfee);
        sb.append(", storagebinflag=").append(storagebinflag);
        sb.append(", mainsku=").append(mainsku);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", high=").append(high);
        sb.append(", volume=").append(volume);
        sb.append(", outerlength=").append(outerlength);
        sb.append(", outerwidth=").append(outerwidth);
        sb.append(", outerhigh=").append(outerhigh);
        sb.append(", outervolume=").append(outervolume);
        sb.append(", outergrossweight=").append(outergrossweight);
        sb.append(", outernetweight=").append(outernetweight);
        sb.append(", grossweight=").append(grossweight);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve19=").append(reserve19);
        sb.append(", reserve20=").append(reserve20);
        sb.append(", indexfordevelop=").append(indexfordevelop);
        sb.append(", purchaseflag=").append(purchaseflag);
        sb.append(", grossprofit=").append(grossprofit);
        sb.append(", rateofmargin=").append(rateofmargin);
        sb.append(", purchasinglink3=").append(purchasinglink3);
        sb.append(", purchasinglink2=").append(purchasinglink2);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", descr=").append(descr);
        sb.append(", translate1=").append(translate1);
        sb.append(", translate2=").append(translate2);
        sb.append(", translate3=").append(translate3);
        sb.append(", translate4=").append(translate4);
        sb.append(", othercontent=").append(othercontent);
        sb.append(", alias1=").append(alias1);
        sb.append(", alias2=").append(alias2);
        sb.append(", alias3=").append(alias3);
        sb.append(", picture3=").append(picture3);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", salesource=").append(salesource);
        sb.append(", clobcontent=").append(clobcontent);
        sb.append(", clobdescr=").append(clobdescr);
        sb.append(", clobtranslate=").append(clobtranslate);
        sb.append(", alertdescr=").append(alertdescr);
        sb.append(", iclass=").append(iclass);
        sb.append(", nameen=").append(nameen);
        sb.append(", hjreserve1=").append(hjreserve1);
        sb.append(", hjreserve2=").append(hjreserve2);
        sb.append(", hjreserve3=").append(hjreserve3);
        sb.append(", hjreserve4=").append(hjreserve4);
        sb.append(", hjreserve5=").append(hjreserve5);
        sb.append(", hjreserve6=").append(hjreserve6);
        sb.append(", outernorms=").append(outernorms);
        sb.append(", outerlevel=").append(outerlevel);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", reserve17=").append(reserve17);
        sb.append(", reserve18=").append(reserve18);
        sb.append(", productname=").append(productname);
        sb.append(", purchaseremark=").append(purchaseremark);
        sb.append(", customsdetails=").append(customsdetails);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}