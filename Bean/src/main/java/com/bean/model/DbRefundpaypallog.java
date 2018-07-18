package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbRefundpaypallog implements Serializable {
    private String sequenceid;

    private String orderid;

    private String paypalid;

    private String username;

    private String password;

    private String paypaltoken;

    private String refundtype;

    private String monrytype;

    private String note;

    private BigDecimal refundmoney;

    private String oper;

    private Date createtime;

    private Date checktime;

    private Date checktime1;

    private Date refundtime;

    private Date opertime;

    private String refundresult;

    private String errorreason;

    private BigDecimal moneytype;

    private BigDecimal remoney;

    private String createoper;

    private String checkoper;

    private String checkoper1;

    private String corpid;

    private String flag;

    private String openflag;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private BigDecimal reserve9;

    private BigDecimal reserve10;

    private String opertype;

    private String content;

    private String productid;

    private Date ordertime;

    private String purchaseoper;

    private String expresstype;

    private String reserve11;

    private String reserve12;

    private String reserve13;

    private String reserve14;

    private String reserve15;

    private String reserve16;

    private String reserve17;

    private String reserve18;

    private String reserve19;

    private String reserve20;

    private BigDecimal reserve21;

    private BigDecimal reserve22;

    private BigDecimal reserve23;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(String paypalid) {
        this.paypalid = paypalid == null ? null : paypalid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPaypaltoken() {
        return paypaltoken;
    }

    public void setPaypaltoken(String paypaltoken) {
        this.paypaltoken = paypaltoken == null ? null : paypaltoken.trim();
    }

    public String getRefundtype() {
        return refundtype;
    }

    public void setRefundtype(String refundtype) {
        this.refundtype = refundtype == null ? null : refundtype.trim();
    }

    public String getMonrytype() {
        return monrytype;
    }

    public void setMonrytype(String monrytype) {
        this.monrytype = monrytype == null ? null : monrytype.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(BigDecimal refundmoney) {
        this.refundmoney = refundmoney;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getChecktime1() {
        return checktime1;
    }

    public void setChecktime1(Date checktime1) {
        this.checktime1 = checktime1;
    }

    public Date getRefundtime() {
        return refundtime;
    }

    public void setRefundtime(Date refundtime) {
        this.refundtime = refundtime;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getRefundresult() {
        return refundresult;
    }

    public void setRefundresult(String refundresult) {
        this.refundresult = refundresult == null ? null : refundresult.trim();
    }

    public String getErrorreason() {
        return errorreason;
    }

    public void setErrorreason(String errorreason) {
        this.errorreason = errorreason == null ? null : errorreason.trim();
    }

    public BigDecimal getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(BigDecimal moneytype) {
        this.moneytype = moneytype;
    }

    public BigDecimal getRemoney() {
        return remoney;
    }

    public void setRemoney(BigDecimal remoney) {
        this.remoney = remoney;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public String getCheckoper1() {
        return checkoper1;
    }

    public void setCheckoper1(String checkoper1) {
        this.checkoper1 = checkoper1 == null ? null : checkoper1.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
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

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    public String getReserve6() {
        return reserve6;
    }

    public void setReserve6(String reserve6) {
        this.reserve6 = reserve6 == null ? null : reserve6.trim();
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

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype == null ? null : opertype.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getPurchaseoper() {
        return purchaseoper;
    }

    public void setPurchaseoper(String purchaseoper) {
        this.purchaseoper = purchaseoper == null ? null : purchaseoper.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
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

    public String getReserve19() {
        return reserve19;
    }

    public void setReserve19(String reserve19) {
        this.reserve19 = reserve19 == null ? null : reserve19.trim();
    }

    public String getReserve20() {
        return reserve20;
    }

    public void setReserve20(String reserve20) {
        this.reserve20 = reserve20 == null ? null : reserve20.trim();
    }

    public BigDecimal getReserve21() {
        return reserve21;
    }

    public void setReserve21(BigDecimal reserve21) {
        this.reserve21 = reserve21;
    }

    public BigDecimal getReserve22() {
        return reserve22;
    }

    public void setReserve22(BigDecimal reserve22) {
        this.reserve22 = reserve22;
    }

    public BigDecimal getReserve23() {
        return reserve23;
    }

    public void setReserve23(BigDecimal reserve23) {
        this.reserve23 = reserve23;
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
        DbRefundpaypallog other = (DbRefundpaypallog) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getPaypalid() == null ? other.getPaypalid() == null : this.getPaypalid().equals(other.getPaypalid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPaypaltoken() == null ? other.getPaypaltoken() == null : this.getPaypaltoken().equals(other.getPaypaltoken()))
            && (this.getRefundtype() == null ? other.getRefundtype() == null : this.getRefundtype().equals(other.getRefundtype()))
            && (this.getMonrytype() == null ? other.getMonrytype() == null : this.getMonrytype().equals(other.getMonrytype()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getRefundmoney() == null ? other.getRefundmoney() == null : this.getRefundmoney().equals(other.getRefundmoney()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getChecktime1() == null ? other.getChecktime1() == null : this.getChecktime1().equals(other.getChecktime1()))
            && (this.getRefundtime() == null ? other.getRefundtime() == null : this.getRefundtime().equals(other.getRefundtime()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getRefundresult() == null ? other.getRefundresult() == null : this.getRefundresult().equals(other.getRefundresult()))
            && (this.getErrorreason() == null ? other.getErrorreason() == null : this.getErrorreason().equals(other.getErrorreason()))
            && (this.getMoneytype() == null ? other.getMoneytype() == null : this.getMoneytype().equals(other.getMoneytype()))
            && (this.getRemoney() == null ? other.getRemoney() == null : this.getRemoney().equals(other.getRemoney()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getCheckoper1() == null ? other.getCheckoper1() == null : this.getCheckoper1().equals(other.getCheckoper1()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
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
            && (this.getOpertype() == null ? other.getOpertype() == null : this.getOpertype().equals(other.getOpertype()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getPurchaseoper() == null ? other.getPurchaseoper() == null : this.getPurchaseoper().equals(other.getPurchaseoper()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getReserve11() == null ? other.getReserve11() == null : this.getReserve11().equals(other.getReserve11()))
            && (this.getReserve12() == null ? other.getReserve12() == null : this.getReserve12().equals(other.getReserve12()))
            && (this.getReserve13() == null ? other.getReserve13() == null : this.getReserve13().equals(other.getReserve13()))
            && (this.getReserve14() == null ? other.getReserve14() == null : this.getReserve14().equals(other.getReserve14()))
            && (this.getReserve15() == null ? other.getReserve15() == null : this.getReserve15().equals(other.getReserve15()))
            && (this.getReserve16() == null ? other.getReserve16() == null : this.getReserve16().equals(other.getReserve16()))
            && (this.getReserve17() == null ? other.getReserve17() == null : this.getReserve17().equals(other.getReserve17()))
            && (this.getReserve18() == null ? other.getReserve18() == null : this.getReserve18().equals(other.getReserve18()))
            && (this.getReserve19() == null ? other.getReserve19() == null : this.getReserve19().equals(other.getReserve19()))
            && (this.getReserve20() == null ? other.getReserve20() == null : this.getReserve20().equals(other.getReserve20()))
            && (this.getReserve21() == null ? other.getReserve21() == null : this.getReserve21().equals(other.getReserve21()))
            && (this.getReserve22() == null ? other.getReserve22() == null : this.getReserve22().equals(other.getReserve22()))
            && (this.getReserve23() == null ? other.getReserve23() == null : this.getReserve23().equals(other.getReserve23()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getPaypalid() == null) ? 0 : getPaypalid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPaypaltoken() == null) ? 0 : getPaypaltoken().hashCode());
        result = prime * result + ((getRefundtype() == null) ? 0 : getRefundtype().hashCode());
        result = prime * result + ((getMonrytype() == null) ? 0 : getMonrytype().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getRefundmoney() == null) ? 0 : getRefundmoney().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getChecktime1() == null) ? 0 : getChecktime1().hashCode());
        result = prime * result + ((getRefundtime() == null) ? 0 : getRefundtime().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getRefundresult() == null) ? 0 : getRefundresult().hashCode());
        result = prime * result + ((getErrorreason() == null) ? 0 : getErrorreason().hashCode());
        result = prime * result + ((getMoneytype() == null) ? 0 : getMoneytype().hashCode());
        result = prime * result + ((getRemoney() == null) ? 0 : getRemoney().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getCheckoper1() == null) ? 0 : getCheckoper1().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
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
        result = prime * result + ((getOpertype() == null) ? 0 : getOpertype().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getPurchaseoper() == null) ? 0 : getPurchaseoper().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getReserve11() == null) ? 0 : getReserve11().hashCode());
        result = prime * result + ((getReserve12() == null) ? 0 : getReserve12().hashCode());
        result = prime * result + ((getReserve13() == null) ? 0 : getReserve13().hashCode());
        result = prime * result + ((getReserve14() == null) ? 0 : getReserve14().hashCode());
        result = prime * result + ((getReserve15() == null) ? 0 : getReserve15().hashCode());
        result = prime * result + ((getReserve16() == null) ? 0 : getReserve16().hashCode());
        result = prime * result + ((getReserve17() == null) ? 0 : getReserve17().hashCode());
        result = prime * result + ((getReserve18() == null) ? 0 : getReserve18().hashCode());
        result = prime * result + ((getReserve19() == null) ? 0 : getReserve19().hashCode());
        result = prime * result + ((getReserve20() == null) ? 0 : getReserve20().hashCode());
        result = prime * result + ((getReserve21() == null) ? 0 : getReserve21().hashCode());
        result = prime * result + ((getReserve22() == null) ? 0 : getReserve22().hashCode());
        result = prime * result + ((getReserve23() == null) ? 0 : getReserve23().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", orderid=").append(orderid);
        sb.append(", paypalid=").append(paypalid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", paypaltoken=").append(paypaltoken);
        sb.append(", refundtype=").append(refundtype);
        sb.append(", monrytype=").append(monrytype);
        sb.append(", note=").append(note);
        sb.append(", refundmoney=").append(refundmoney);
        sb.append(", oper=").append(oper);
        sb.append(", createtime=").append(createtime);
        sb.append(", checktime=").append(checktime);
        sb.append(", checktime1=").append(checktime1);
        sb.append(", refundtime=").append(refundtime);
        sb.append(", opertime=").append(opertime);
        sb.append(", refundresult=").append(refundresult);
        sb.append(", errorreason=").append(errorreason);
        sb.append(", moneytype=").append(moneytype);
        sb.append(", remoney=").append(remoney);
        sb.append(", createoper=").append(createoper);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", checkoper1=").append(checkoper1);
        sb.append(", corpid=").append(corpid);
        sb.append(", flag=").append(flag);
        sb.append(", openflag=").append(openflag);
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
        sb.append(", opertype=").append(opertype);
        sb.append(", content=").append(content);
        sb.append(", productid=").append(productid);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", purchaseoper=").append(purchaseoper);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", reserve11=").append(reserve11);
        sb.append(", reserve12=").append(reserve12);
        sb.append(", reserve13=").append(reserve13);
        sb.append(", reserve14=").append(reserve14);
        sb.append(", reserve15=").append(reserve15);
        sb.append(", reserve16=").append(reserve16);
        sb.append(", reserve17=").append(reserve17);
        sb.append(", reserve18=").append(reserve18);
        sb.append(", reserve19=").append(reserve19);
        sb.append(", reserve20=").append(reserve20);
        sb.append(", reserve21=").append(reserve21);
        sb.append(", reserve22=").append(reserve22);
        sb.append(", reserve23=").append(reserve23);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}