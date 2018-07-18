package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbPurchasepayment implements Serializable {
    private String sid;

    private Date sendtime;

    private String oper;

    private BigDecimal actionmoney;

    private Date purchasetime;

    private String paytype;

    private String purchasetimestr;

    private Date expecttime;

    private String createoper;

    private String groupid;

    private BigDecimal moneyneedpay;

    private BigDecimal moneynotpay;

    private String shipnum;

    private String content;

    private BigDecimal pcmoney;

    private String checkoper;

    private BigDecimal expressmoney;

    private BigDecimal moneypaied;

    private Date checktime;

    private Date createtime;

    private String manufactureid;

    private BigDecimal returnmoney;

    private Date opertime;

    private String manufacture;

    private String flag;

    private Date paytime;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public BigDecimal getActionmoney() {
        return actionmoney;
    }

    public void setActionmoney(BigDecimal actionmoney) {
        this.actionmoney = actionmoney;
    }

    public Date getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(Date purchasetime) {
        this.purchasetime = purchasetime;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getPurchasetimestr() {
        return purchasetimestr;
    }

    public void setPurchasetimestr(String purchasetimestr) {
        this.purchasetimestr = purchasetimestr == null ? null : purchasetimestr.trim();
    }

    public Date getExpecttime() {
        return expecttime;
    }

    public void setExpecttime(Date expecttime) {
        this.expecttime = expecttime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public BigDecimal getMoneyneedpay() {
        return moneyneedpay;
    }

    public void setMoneyneedpay(BigDecimal moneyneedpay) {
        this.moneyneedpay = moneyneedpay;
    }

    public BigDecimal getMoneynotpay() {
        return moneynotpay;
    }

    public void setMoneynotpay(BigDecimal moneynotpay) {
        this.moneynotpay = moneynotpay;
    }

    public String getShipnum() {
        return shipnum;
    }

    public void setShipnum(String shipnum) {
        this.shipnum = shipnum == null ? null : shipnum.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getPcmoney() {
        return pcmoney;
    }

    public void setPcmoney(BigDecimal pcmoney) {
        this.pcmoney = pcmoney;
    }

    public String getCheckoper() {
        return checkoper;
    }

    public void setCheckoper(String checkoper) {
        this.checkoper = checkoper == null ? null : checkoper.trim();
    }

    public BigDecimal getExpressmoney() {
        return expressmoney;
    }

    public void setExpressmoney(BigDecimal expressmoney) {
        this.expressmoney = expressmoney;
    }

    public BigDecimal getMoneypaied() {
        return moneypaied;
    }

    public void setMoneypaied(BigDecimal moneypaied) {
        this.moneypaied = moneypaied;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getManufactureid() {
        return manufactureid;
    }

    public void setManufactureid(String manufactureid) {
        this.manufactureid = manufactureid == null ? null : manufactureid.trim();
    }

    public BigDecimal getReturnmoney() {
        return returnmoney;
    }

    public void setReturnmoney(BigDecimal returnmoney) {
        this.returnmoney = returnmoney;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
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
        DbPurchasepayment other = (DbPurchasepayment) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getActionmoney() == null ? other.getActionmoney() == null : this.getActionmoney().equals(other.getActionmoney()))
            && (this.getPurchasetime() == null ? other.getPurchasetime() == null : this.getPurchasetime().equals(other.getPurchasetime()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getPurchasetimestr() == null ? other.getPurchasetimestr() == null : this.getPurchasetimestr().equals(other.getPurchasetimestr()))
            && (this.getExpecttime() == null ? other.getExpecttime() == null : this.getExpecttime().equals(other.getExpecttime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getMoneyneedpay() == null ? other.getMoneyneedpay() == null : this.getMoneyneedpay().equals(other.getMoneyneedpay()))
            && (this.getMoneynotpay() == null ? other.getMoneynotpay() == null : this.getMoneynotpay().equals(other.getMoneynotpay()))
            && (this.getShipnum() == null ? other.getShipnum() == null : this.getShipnum().equals(other.getShipnum()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPcmoney() == null ? other.getPcmoney() == null : this.getPcmoney().equals(other.getPcmoney()))
            && (this.getCheckoper() == null ? other.getCheckoper() == null : this.getCheckoper().equals(other.getCheckoper()))
            && (this.getExpressmoney() == null ? other.getExpressmoney() == null : this.getExpressmoney().equals(other.getExpressmoney()))
            && (this.getMoneypaied() == null ? other.getMoneypaied() == null : this.getMoneypaied().equals(other.getMoneypaied()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getManufactureid() == null ? other.getManufactureid() == null : this.getManufactureid().equals(other.getManufactureid()))
            && (this.getReturnmoney() == null ? other.getReturnmoney() == null : this.getReturnmoney().equals(other.getReturnmoney()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getActionmoney() == null) ? 0 : getActionmoney().hashCode());
        result = prime * result + ((getPurchasetime() == null) ? 0 : getPurchasetime().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getPurchasetimestr() == null) ? 0 : getPurchasetimestr().hashCode());
        result = prime * result + ((getExpecttime() == null) ? 0 : getExpecttime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getMoneyneedpay() == null) ? 0 : getMoneyneedpay().hashCode());
        result = prime * result + ((getMoneynotpay() == null) ? 0 : getMoneynotpay().hashCode());
        result = prime * result + ((getShipnum() == null) ? 0 : getShipnum().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPcmoney() == null) ? 0 : getPcmoney().hashCode());
        result = prime * result + ((getCheckoper() == null) ? 0 : getCheckoper().hashCode());
        result = prime * result + ((getExpressmoney() == null) ? 0 : getExpressmoney().hashCode());
        result = prime * result + ((getMoneypaied() == null) ? 0 : getMoneypaied().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getManufactureid() == null) ? 0 : getManufactureid().hashCode());
        result = prime * result + ((getReturnmoney() == null) ? 0 : getReturnmoney().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", oper=").append(oper);
        sb.append(", actionmoney=").append(actionmoney);
        sb.append(", purchasetime=").append(purchasetime);
        sb.append(", paytype=").append(paytype);
        sb.append(", purchasetimestr=").append(purchasetimestr);
        sb.append(", expecttime=").append(expecttime);
        sb.append(", createoper=").append(createoper);
        sb.append(", groupid=").append(groupid);
        sb.append(", moneyneedpay=").append(moneyneedpay);
        sb.append(", moneynotpay=").append(moneynotpay);
        sb.append(", shipnum=").append(shipnum);
        sb.append(", content=").append(content);
        sb.append(", pcmoney=").append(pcmoney);
        sb.append(", checkoper=").append(checkoper);
        sb.append(", expressmoney=").append(expressmoney);
        sb.append(", moneypaied=").append(moneypaied);
        sb.append(", checktime=").append(checktime);
        sb.append(", createtime=").append(createtime);
        sb.append(", manufactureid=").append(manufactureid);
        sb.append(", returnmoney=").append(returnmoney);
        sb.append(", opertime=").append(opertime);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", flag=").append(flag);
        sb.append(", paytime=").append(paytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}