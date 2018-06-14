package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbBanproduct implements Serializable {
    private String sid;

    private String productid;

    private String shopid;

    private String coperid;

    private Date opertime;

    private BigDecimal filed7;

    private BigDecimal filed8;

    private BigDecimal filed9;

    private String openflag;

    private String oper;

    private String filed1;

    private String filed2;

    private String filed3;

    private String filed4;

    private String filed5;

    private String filed6;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getCoperid() {
        return coperid;
    }

    public void setCoperid(String coperid) {
        this.coperid = coperid == null ? null : coperid.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public BigDecimal getFiled7() {
        return filed7;
    }

    public void setFiled7(BigDecimal filed7) {
        this.filed7 = filed7;
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

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
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
        DbBanproduct other = (DbBanproduct) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getCoperid() == null ? other.getCoperid() == null : this.getCoperid().equals(other.getCoperid()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getFiled7() == null ? other.getFiled7() == null : this.getFiled7().equals(other.getFiled7()))
            && (this.getFiled8() == null ? other.getFiled8() == null : this.getFiled8().equals(other.getFiled8()))
            && (this.getFiled9() == null ? other.getFiled9() == null : this.getFiled9().equals(other.getFiled9()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFiled2() == null ? other.getFiled2() == null : this.getFiled2().equals(other.getFiled2()))
            && (this.getFiled3() == null ? other.getFiled3() == null : this.getFiled3().equals(other.getFiled3()))
            && (this.getFiled4() == null ? other.getFiled4() == null : this.getFiled4().equals(other.getFiled4()))
            && (this.getFiled5() == null ? other.getFiled5() == null : this.getFiled5().equals(other.getFiled5()))
            && (this.getFiled6() == null ? other.getFiled6() == null : this.getFiled6().equals(other.getFiled6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getCoperid() == null) ? 0 : getCoperid().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getFiled7() == null) ? 0 : getFiled7().hashCode());
        result = prime * result + ((getFiled8() == null) ? 0 : getFiled8().hashCode());
        result = prime * result + ((getFiled9() == null) ? 0 : getFiled9().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFiled2() == null) ? 0 : getFiled2().hashCode());
        result = prime * result + ((getFiled3() == null) ? 0 : getFiled3().hashCode());
        result = prime * result + ((getFiled4() == null) ? 0 : getFiled4().hashCode());
        result = prime * result + ((getFiled5() == null) ? 0 : getFiled5().hashCode());
        result = prime * result + ((getFiled6() == null) ? 0 : getFiled6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", productid=").append(productid);
        sb.append(", shopid=").append(shopid);
        sb.append(", coperid=").append(coperid);
        sb.append(", opertime=").append(opertime);
        sb.append(", filed7=").append(filed7);
        sb.append(", filed8=").append(filed8);
        sb.append(", filed9=").append(filed9);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", filed1=").append(filed1);
        sb.append(", filed2=").append(filed2);
        sb.append(", filed3=").append(filed3);
        sb.append(", filed4=").append(filed4);
        sb.append(", filed5=").append(filed5);
        sb.append(", filed6=").append(filed6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}