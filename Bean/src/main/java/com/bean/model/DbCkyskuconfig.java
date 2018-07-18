package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCkyskuconfig implements Serializable {
    private String productid;

    private String ckyproductid;

    private BigDecimal openflag;

    private String oper;

    private Date opertime;

    private String createoper;

    private Date createtime;

    private String productname;

    private String ckyproductname;

    private String ckystatus;

    private String categoryid;

    private BigDecimal price1;

    private BigDecimal price2;

    private BigDecimal ckysavenum;

    private BigDecimal ckyordernum;

    private String status;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal high;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private BigDecimal reserve6;

    private BigDecimal reserve7;

    private String packingtype;

    private String sharer;

    private String declaredvalue;

    private String reserve8;

    private String reserve10;

    private String reserve9;

    private String descr;

    private String warehouse;

    private String weight;

    private String sellnum;

    private BigDecimal availstock;

    private String tpnsavenum;

    private BigDecimal sharestock;

    private static final long serialVersionUID = 1L;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getCkyproductid() {
        return ckyproductid;
    }

    public void setCkyproductid(String ckyproductid) {
        this.ckyproductid = ckyproductid == null ? null : ckyproductid.trim();
    }

    public BigDecimal getOpenflag() {
        return openflag;
    }

    public void setOpenflag(BigDecimal openflag) {
        this.openflag = openflag;
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

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getCkyproductname() {
        return ckyproductname;
    }

    public void setCkyproductname(String ckyproductname) {
        this.ckyproductname = ckyproductname == null ? null : ckyproductname.trim();
    }

    public String getCkystatus() {
        return ckystatus;
    }

    public void setCkystatus(String ckystatus) {
        this.ckystatus = ckystatus == null ? null : ckystatus.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }

    public BigDecimal getCkysavenum() {
        return ckysavenum;
    }

    public void setCkysavenum(BigDecimal ckysavenum) {
        this.ckysavenum = ckysavenum;
    }

    public BigDecimal getCkyordernum() {
        return ckyordernum;
    }

    public void setCkyordernum(BigDecimal ckyordernum) {
        this.ckyordernum = ckyordernum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getPackingtype() {
        return packingtype;
    }

    public void setPackingtype(String packingtype) {
        this.packingtype = packingtype == null ? null : packingtype.trim();
    }

    public String getSharer() {
        return sharer;
    }

    public void setSharer(String sharer) {
        this.sharer = sharer == null ? null : sharer.trim();
    }

    public String getDeclaredvalue() {
        return declaredvalue;
    }

    public void setDeclaredvalue(String declaredvalue) {
        this.declaredvalue = declaredvalue == null ? null : declaredvalue.trim();
    }

    public String getReserve8() {
        return reserve8;
    }

    public void setReserve8(String reserve8) {
        this.reserve8 = reserve8 == null ? null : reserve8.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }

    public String getReserve9() {
        return reserve9;
    }

    public void setReserve9(String reserve9) {
        this.reserve9 = reserve9 == null ? null : reserve9.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getSellnum() {
        return sellnum;
    }

    public void setSellnum(String sellnum) {
        this.sellnum = sellnum == null ? null : sellnum.trim();
    }

    public BigDecimal getAvailstock() {
        return availstock;
    }

    public void setAvailstock(BigDecimal availstock) {
        this.availstock = availstock;
    }

    public String getTpnsavenum() {
        return tpnsavenum;
    }

    public void setTpnsavenum(String tpnsavenum) {
        this.tpnsavenum = tpnsavenum == null ? null : tpnsavenum.trim();
    }

    public BigDecimal getSharestock() {
        return sharestock;
    }

    public void setSharestock(BigDecimal sharestock) {
        this.sharestock = sharestock;
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
        DbCkyskuconfig other = (DbCkyskuconfig) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getCkyproductid() == null ? other.getCkyproductid() == null : this.getCkyproductid().equals(other.getCkyproductid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getCkyproductname() == null ? other.getCkyproductname() == null : this.getCkyproductname().equals(other.getCkyproductname()))
            && (this.getCkystatus() == null ? other.getCkystatus() == null : this.getCkystatus().equals(other.getCkystatus()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getPrice1() == null ? other.getPrice1() == null : this.getPrice1().equals(other.getPrice1()))
            && (this.getPrice2() == null ? other.getPrice2() == null : this.getPrice2().equals(other.getPrice2()))
            && (this.getCkysavenum() == null ? other.getCkysavenum() == null : this.getCkysavenum().equals(other.getCkysavenum()))
            && (this.getCkyordernum() == null ? other.getCkyordernum() == null : this.getCkyordernum().equals(other.getCkyordernum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()))
            && (this.getReserve7() == null ? other.getReserve7() == null : this.getReserve7().equals(other.getReserve7()))
            && (this.getPackingtype() == null ? other.getPackingtype() == null : this.getPackingtype().equals(other.getPackingtype()))
            && (this.getSharer() == null ? other.getSharer() == null : this.getSharer().equals(other.getSharer()))
            && (this.getDeclaredvalue() == null ? other.getDeclaredvalue() == null : this.getDeclaredvalue().equals(other.getDeclaredvalue()))
            && (this.getReserve8() == null ? other.getReserve8() == null : this.getReserve8().equals(other.getReserve8()))
            && (this.getReserve10() == null ? other.getReserve10() == null : this.getReserve10().equals(other.getReserve10()))
            && (this.getReserve9() == null ? other.getReserve9() == null : this.getReserve9().equals(other.getReserve9()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getWarehouse() == null ? other.getWarehouse() == null : this.getWarehouse().equals(other.getWarehouse()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getSellnum() == null ? other.getSellnum() == null : this.getSellnum().equals(other.getSellnum()))
            && (this.getAvailstock() == null ? other.getAvailstock() == null : this.getAvailstock().equals(other.getAvailstock()))
            && (this.getTpnsavenum() == null ? other.getTpnsavenum() == null : this.getTpnsavenum().equals(other.getTpnsavenum()))
            && (this.getSharestock() == null ? other.getSharestock() == null : this.getSharestock().equals(other.getSharestock()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getCkyproductid() == null) ? 0 : getCkyproductid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getCkyproductname() == null) ? 0 : getCkyproductname().hashCode());
        result = prime * result + ((getCkystatus() == null) ? 0 : getCkystatus().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getPrice1() == null) ? 0 : getPrice1().hashCode());
        result = prime * result + ((getPrice2() == null) ? 0 : getPrice2().hashCode());
        result = prime * result + ((getCkysavenum() == null) ? 0 : getCkysavenum().hashCode());
        result = prime * result + ((getCkyordernum() == null) ? 0 : getCkyordernum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        result = prime * result + ((getReserve7() == null) ? 0 : getReserve7().hashCode());
        result = prime * result + ((getPackingtype() == null) ? 0 : getPackingtype().hashCode());
        result = prime * result + ((getSharer() == null) ? 0 : getSharer().hashCode());
        result = prime * result + ((getDeclaredvalue() == null) ? 0 : getDeclaredvalue().hashCode());
        result = prime * result + ((getReserve8() == null) ? 0 : getReserve8().hashCode());
        result = prime * result + ((getReserve10() == null) ? 0 : getReserve10().hashCode());
        result = prime * result + ((getReserve9() == null) ? 0 : getReserve9().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getWarehouse() == null) ? 0 : getWarehouse().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getSellnum() == null) ? 0 : getSellnum().hashCode());
        result = prime * result + ((getAvailstock() == null) ? 0 : getAvailstock().hashCode());
        result = prime * result + ((getTpnsavenum() == null) ? 0 : getTpnsavenum().hashCode());
        result = prime * result + ((getSharestock() == null) ? 0 : getSharestock().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", ckyproductid=").append(ckyproductid);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", productname=").append(productname);
        sb.append(", ckyproductname=").append(ckyproductname);
        sb.append(", ckystatus=").append(ckystatus);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", price1=").append(price1);
        sb.append(", price2=").append(price2);
        sb.append(", ckysavenum=").append(ckysavenum);
        sb.append(", ckyordernum=").append(ckyordernum);
        sb.append(", status=").append(status);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", high=").append(high);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", reserve7=").append(reserve7);
        sb.append(", packingtype=").append(packingtype);
        sb.append(", sharer=").append(sharer);
        sb.append(", declaredvalue=").append(declaredvalue);
        sb.append(", reserve8=").append(reserve8);
        sb.append(", reserve10=").append(reserve10);
        sb.append(", reserve9=").append(reserve9);
        sb.append(", descr=").append(descr);
        sb.append(", warehouse=").append(warehouse);
        sb.append(", weight=").append(weight);
        sb.append(", sellnum=").append(sellnum);
        sb.append(", availstock=").append(availstock);
        sb.append(", tpnsavenum=").append(tpnsavenum);
        sb.append(", sharestock=").append(sharestock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}