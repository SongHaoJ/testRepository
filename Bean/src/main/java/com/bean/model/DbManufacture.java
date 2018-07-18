package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbManufacture implements Serializable {
    private String sequenceid;

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

    private String skype;

    private String takeoper1;

    private String takeoper2;

    private String takeoper;

    private String manageproduct;

    private String productcategory;

    private String manufacturer;

    private String phone;

    private String onlinecontactway;

    private String productclass;

    private String factoryeclass;

    private String serviceclass;

    private String priceclass;

    private String deliverytime;

    private String christmasdeliverytime;

    private String productdeliverytime;

    private String productquality;

    private String packaging;

    private String delivertype;

    private String emaile;

    private String faxmaile;

    private String drawback;

    private String collectionoper;

    private String bank;

    private String account;

    private String remittancecompanyname;

    private String remittanceaccount;

    private String companyaddress;

    private String bankname;

    private String swiftcode;

    private String bankaddress;

    private String transferbankname;

    private String transferswiftcode;

    private String transferbankaddress;

    private String district;

    private BigDecimal arrivalcycle;

    private String categoryid;

    private String categoryname;

    private String alisupplierid;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
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

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype == null ? null : skype.trim();
    }

    public String getTakeoper1() {
        return takeoper1;
    }

    public void setTakeoper1(String takeoper1) {
        this.takeoper1 = takeoper1 == null ? null : takeoper1.trim();
    }

    public String getTakeoper2() {
        return takeoper2;
    }

    public void setTakeoper2(String takeoper2) {
        this.takeoper2 = takeoper2 == null ? null : takeoper2.trim();
    }

    public String getTakeoper() {
        return takeoper;
    }

    public void setTakeoper(String takeoper) {
        this.takeoper = takeoper == null ? null : takeoper.trim();
    }

    public String getManageproduct() {
        return manageproduct;
    }

    public void setManageproduct(String manageproduct) {
        this.manageproduct = manageproduct == null ? null : manageproduct.trim();
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory == null ? null : productcategory.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOnlinecontactway() {
        return onlinecontactway;
    }

    public void setOnlinecontactway(String onlinecontactway) {
        this.onlinecontactway = onlinecontactway == null ? null : onlinecontactway.trim();
    }

    public String getProductclass() {
        return productclass;
    }

    public void setProductclass(String productclass) {
        this.productclass = productclass == null ? null : productclass.trim();
    }

    public String getFactoryeclass() {
        return factoryeclass;
    }

    public void setFactoryeclass(String factoryeclass) {
        this.factoryeclass = factoryeclass == null ? null : factoryeclass.trim();
    }

    public String getServiceclass() {
        return serviceclass;
    }

    public void setServiceclass(String serviceclass) {
        this.serviceclass = serviceclass == null ? null : serviceclass.trim();
    }

    public String getPriceclass() {
        return priceclass;
    }

    public void setPriceclass(String priceclass) {
        this.priceclass = priceclass == null ? null : priceclass.trim();
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime == null ? null : deliverytime.trim();
    }

    public String getChristmasdeliverytime() {
        return christmasdeliverytime;
    }

    public void setChristmasdeliverytime(String christmasdeliverytime) {
        this.christmasdeliverytime = christmasdeliverytime == null ? null : christmasdeliverytime.trim();
    }

    public String getProductdeliverytime() {
        return productdeliverytime;
    }

    public void setProductdeliverytime(String productdeliverytime) {
        this.productdeliverytime = productdeliverytime == null ? null : productdeliverytime.trim();
    }

    public String getProductquality() {
        return productquality;
    }

    public void setProductquality(String productquality) {
        this.productquality = productquality == null ? null : productquality.trim();
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging == null ? null : packaging.trim();
    }

    public String getDelivertype() {
        return delivertype;
    }

    public void setDelivertype(String delivertype) {
        this.delivertype = delivertype == null ? null : delivertype.trim();
    }

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile == null ? null : emaile.trim();
    }

    public String getFaxmaile() {
        return faxmaile;
    }

    public void setFaxmaile(String faxmaile) {
        this.faxmaile = faxmaile == null ? null : faxmaile.trim();
    }

    public String getDrawback() {
        return drawback;
    }

    public void setDrawback(String drawback) {
        this.drawback = drawback == null ? null : drawback.trim();
    }

    public String getCollectionoper() {
        return collectionoper;
    }

    public void setCollectionoper(String collectionoper) {
        this.collectionoper = collectionoper == null ? null : collectionoper.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getRemittancecompanyname() {
        return remittancecompanyname;
    }

    public void setRemittancecompanyname(String remittancecompanyname) {
        this.remittancecompanyname = remittancecompanyname == null ? null : remittancecompanyname.trim();
    }

    public String getRemittanceaccount() {
        return remittanceaccount;
    }

    public void setRemittanceaccount(String remittanceaccount) {
        this.remittanceaccount = remittanceaccount == null ? null : remittanceaccount.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getSwiftcode() {
        return swiftcode;
    }

    public void setSwiftcode(String swiftcode) {
        this.swiftcode = swiftcode == null ? null : swiftcode.trim();
    }

    public String getBankaddress() {
        return bankaddress;
    }

    public void setBankaddress(String bankaddress) {
        this.bankaddress = bankaddress == null ? null : bankaddress.trim();
    }

    public String getTransferbankname() {
        return transferbankname;
    }

    public void setTransferbankname(String transferbankname) {
        this.transferbankname = transferbankname == null ? null : transferbankname.trim();
    }

    public String getTransferswiftcode() {
        return transferswiftcode;
    }

    public void setTransferswiftcode(String transferswiftcode) {
        this.transferswiftcode = transferswiftcode == null ? null : transferswiftcode.trim();
    }

    public String getTransferbankaddress() {
        return transferbankaddress;
    }

    public void setTransferbankaddress(String transferbankaddress) {
        this.transferbankaddress = transferbankaddress == null ? null : transferbankaddress.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public BigDecimal getArrivalcycle() {
        return arrivalcycle;
    }

    public void setArrivalcycle(BigDecimal arrivalcycle) {
        this.arrivalcycle = arrivalcycle;
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

    public String getAlisupplierid() {
        return alisupplierid;
    }

    public void setAlisupplierid(String alisupplierid) {
        this.alisupplierid = alisupplierid == null ? null : alisupplierid.trim();
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
        DbManufacture other = (DbManufacture) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
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
            && (this.getSkype() == null ? other.getSkype() == null : this.getSkype().equals(other.getSkype()))
            && (this.getTakeoper1() == null ? other.getTakeoper1() == null : this.getTakeoper1().equals(other.getTakeoper1()))
            && (this.getTakeoper2() == null ? other.getTakeoper2() == null : this.getTakeoper2().equals(other.getTakeoper2()))
            && (this.getTakeoper() == null ? other.getTakeoper() == null : this.getTakeoper().equals(other.getTakeoper()))
            && (this.getManageproduct() == null ? other.getManageproduct() == null : this.getManageproduct().equals(other.getManageproduct()))
            && (this.getProductcategory() == null ? other.getProductcategory() == null : this.getProductcategory().equals(other.getProductcategory()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getOnlinecontactway() == null ? other.getOnlinecontactway() == null : this.getOnlinecontactway().equals(other.getOnlinecontactway()))
            && (this.getProductclass() == null ? other.getProductclass() == null : this.getProductclass().equals(other.getProductclass()))
            && (this.getFactoryeclass() == null ? other.getFactoryeclass() == null : this.getFactoryeclass().equals(other.getFactoryeclass()))
            && (this.getServiceclass() == null ? other.getServiceclass() == null : this.getServiceclass().equals(other.getServiceclass()))
            && (this.getPriceclass() == null ? other.getPriceclass() == null : this.getPriceclass().equals(other.getPriceclass()))
            && (this.getDeliverytime() == null ? other.getDeliverytime() == null : this.getDeliverytime().equals(other.getDeliverytime()))
            && (this.getChristmasdeliverytime() == null ? other.getChristmasdeliverytime() == null : this.getChristmasdeliverytime().equals(other.getChristmasdeliverytime()))
            && (this.getProductdeliverytime() == null ? other.getProductdeliverytime() == null : this.getProductdeliverytime().equals(other.getProductdeliverytime()))
            && (this.getProductquality() == null ? other.getProductquality() == null : this.getProductquality().equals(other.getProductquality()))
            && (this.getPackaging() == null ? other.getPackaging() == null : this.getPackaging().equals(other.getPackaging()))
            && (this.getDelivertype() == null ? other.getDelivertype() == null : this.getDelivertype().equals(other.getDelivertype()))
            && (this.getEmaile() == null ? other.getEmaile() == null : this.getEmaile().equals(other.getEmaile()))
            && (this.getFaxmaile() == null ? other.getFaxmaile() == null : this.getFaxmaile().equals(other.getFaxmaile()))
            && (this.getDrawback() == null ? other.getDrawback() == null : this.getDrawback().equals(other.getDrawback()))
            && (this.getCollectionoper() == null ? other.getCollectionoper() == null : this.getCollectionoper().equals(other.getCollectionoper()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getRemittancecompanyname() == null ? other.getRemittancecompanyname() == null : this.getRemittancecompanyname().equals(other.getRemittancecompanyname()))
            && (this.getRemittanceaccount() == null ? other.getRemittanceaccount() == null : this.getRemittanceaccount().equals(other.getRemittanceaccount()))
            && (this.getCompanyaddress() == null ? other.getCompanyaddress() == null : this.getCompanyaddress().equals(other.getCompanyaddress()))
            && (this.getBankname() == null ? other.getBankname() == null : this.getBankname().equals(other.getBankname()))
            && (this.getSwiftcode() == null ? other.getSwiftcode() == null : this.getSwiftcode().equals(other.getSwiftcode()))
            && (this.getBankaddress() == null ? other.getBankaddress() == null : this.getBankaddress().equals(other.getBankaddress()))
            && (this.getTransferbankname() == null ? other.getTransferbankname() == null : this.getTransferbankname().equals(other.getTransferbankname()))
            && (this.getTransferswiftcode() == null ? other.getTransferswiftcode() == null : this.getTransferswiftcode().equals(other.getTransferswiftcode()))
            && (this.getTransferbankaddress() == null ? other.getTransferbankaddress() == null : this.getTransferbankaddress().equals(other.getTransferbankaddress()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getArrivalcycle() == null ? other.getArrivalcycle() == null : this.getArrivalcycle().equals(other.getArrivalcycle()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getAlisupplierid() == null ? other.getAlisupplierid() == null : this.getAlisupplierid().equals(other.getAlisupplierid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
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
        result = prime * result + ((getSkype() == null) ? 0 : getSkype().hashCode());
        result = prime * result + ((getTakeoper1() == null) ? 0 : getTakeoper1().hashCode());
        result = prime * result + ((getTakeoper2() == null) ? 0 : getTakeoper2().hashCode());
        result = prime * result + ((getTakeoper() == null) ? 0 : getTakeoper().hashCode());
        result = prime * result + ((getManageproduct() == null) ? 0 : getManageproduct().hashCode());
        result = prime * result + ((getProductcategory() == null) ? 0 : getProductcategory().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getOnlinecontactway() == null) ? 0 : getOnlinecontactway().hashCode());
        result = prime * result + ((getProductclass() == null) ? 0 : getProductclass().hashCode());
        result = prime * result + ((getFactoryeclass() == null) ? 0 : getFactoryeclass().hashCode());
        result = prime * result + ((getServiceclass() == null) ? 0 : getServiceclass().hashCode());
        result = prime * result + ((getPriceclass() == null) ? 0 : getPriceclass().hashCode());
        result = prime * result + ((getDeliverytime() == null) ? 0 : getDeliverytime().hashCode());
        result = prime * result + ((getChristmasdeliverytime() == null) ? 0 : getChristmasdeliverytime().hashCode());
        result = prime * result + ((getProductdeliverytime() == null) ? 0 : getProductdeliverytime().hashCode());
        result = prime * result + ((getProductquality() == null) ? 0 : getProductquality().hashCode());
        result = prime * result + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        result = prime * result + ((getDelivertype() == null) ? 0 : getDelivertype().hashCode());
        result = prime * result + ((getEmaile() == null) ? 0 : getEmaile().hashCode());
        result = prime * result + ((getFaxmaile() == null) ? 0 : getFaxmaile().hashCode());
        result = prime * result + ((getDrawback() == null) ? 0 : getDrawback().hashCode());
        result = prime * result + ((getCollectionoper() == null) ? 0 : getCollectionoper().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getRemittancecompanyname() == null) ? 0 : getRemittancecompanyname().hashCode());
        result = prime * result + ((getRemittanceaccount() == null) ? 0 : getRemittanceaccount().hashCode());
        result = prime * result + ((getCompanyaddress() == null) ? 0 : getCompanyaddress().hashCode());
        result = prime * result + ((getBankname() == null) ? 0 : getBankname().hashCode());
        result = prime * result + ((getSwiftcode() == null) ? 0 : getSwiftcode().hashCode());
        result = prime * result + ((getBankaddress() == null) ? 0 : getBankaddress().hashCode());
        result = prime * result + ((getTransferbankname() == null) ? 0 : getTransferbankname().hashCode());
        result = prime * result + ((getTransferswiftcode() == null) ? 0 : getTransferswiftcode().hashCode());
        result = prime * result + ((getTransferbankaddress() == null) ? 0 : getTransferbankaddress().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getArrivalcycle() == null) ? 0 : getArrivalcycle().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getAlisupplierid() == null) ? 0 : getAlisupplierid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
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
        sb.append(", skype=").append(skype);
        sb.append(", takeoper1=").append(takeoper1);
        sb.append(", takeoper2=").append(takeoper2);
        sb.append(", takeoper=").append(takeoper);
        sb.append(", manageproduct=").append(manageproduct);
        sb.append(", productcategory=").append(productcategory);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", phone=").append(phone);
        sb.append(", onlinecontactway=").append(onlinecontactway);
        sb.append(", productclass=").append(productclass);
        sb.append(", factoryeclass=").append(factoryeclass);
        sb.append(", serviceclass=").append(serviceclass);
        sb.append(", priceclass=").append(priceclass);
        sb.append(", deliverytime=").append(deliverytime);
        sb.append(", christmasdeliverytime=").append(christmasdeliverytime);
        sb.append(", productdeliverytime=").append(productdeliverytime);
        sb.append(", productquality=").append(productquality);
        sb.append(", packaging=").append(packaging);
        sb.append(", delivertype=").append(delivertype);
        sb.append(", emaile=").append(emaile);
        sb.append(", faxmaile=").append(faxmaile);
        sb.append(", drawback=").append(drawback);
        sb.append(", collectionoper=").append(collectionoper);
        sb.append(", bank=").append(bank);
        sb.append(", account=").append(account);
        sb.append(", remittancecompanyname=").append(remittancecompanyname);
        sb.append(", remittanceaccount=").append(remittanceaccount);
        sb.append(", companyaddress=").append(companyaddress);
        sb.append(", bankname=").append(bankname);
        sb.append(", swiftcode=").append(swiftcode);
        sb.append(", bankaddress=").append(bankaddress);
        sb.append(", transferbankname=").append(transferbankname);
        sb.append(", transferswiftcode=").append(transferswiftcode);
        sb.append(", transferbankaddress=").append(transferbankaddress);
        sb.append(", district=").append(district);
        sb.append(", arrivalcycle=").append(arrivalcycle);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", alisupplierid=").append(alisupplierid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}