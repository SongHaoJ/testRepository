package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbCaiwu implements Serializable {
    private String sequenceid;

    private String source;

    private String sourceid;

    private String moneyrate;

    private BigDecimal money;

    private String groupid;

    private String remark;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private String corpid;

    private String openflag;

    private String status;

    private String oper;

    private Date opertime;

    private String createoper;

    private Date createtime;

    private String oper1;

    private BigDecimal flag;

    private String country;

    private String ponumber;

    private String menufuncter;

    private String menufuncterid;

    private String paymenttype;

    private Date sendtime;

    private Date toporttime;

    private Date depositstime;

    private Date sendpaytime;

    private Date toportpaytime;

    private Date finalpaytime;

    private BigDecimal amountrmb;

    private BigDecimal amountusd;

    private BigDecimal deposits;

    private BigDecimal paymentmoney;

    private BigDecimal nopaymenymoney;

    private BigDecimal sendmoney;

    private BigDecimal toportmoney;

    private BigDecimal finalmoney;

    private String productid;

    private BigDecimal amountrmbflag;

    private BigDecimal depositsflag;

    private BigDecimal sendmoneyflag;

    private BigDecimal toportmoneyflag;

    private BigDecimal finalmoneyflag;

    private BigDecimal accountmoney;

    private BigDecimal nonpaymentmoney;

    private Date sendmoneytime;

    private Date toportmoneytime;

    private Date finalmoneytime;

    private Date depositsstime;

    private String descr;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid == null ? null : sourceid.trim();
    }

    public String getMoneyrate() {
        return moneyrate;
    }

    public void setMoneyrate(String moneyrate) {
        this.moneyrate = moneyrate == null ? null : moneyrate.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getOper1() {
        return oper1;
    }

    public void setOper1(String oper1) {
        this.oper1 = oper1 == null ? null : oper1.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPonumber() {
        return ponumber;
    }

    public void setPonumber(String ponumber) {
        this.ponumber = ponumber == null ? null : ponumber.trim();
    }

    public String getMenufuncter() {
        return menufuncter;
    }

    public void setMenufuncter(String menufuncter) {
        this.menufuncter = menufuncter == null ? null : menufuncter.trim();
    }

    public String getMenufuncterid() {
        return menufuncterid;
    }

    public void setMenufuncterid(String menufuncterid) {
        this.menufuncterid = menufuncterid == null ? null : menufuncterid.trim();
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getToporttime() {
        return toporttime;
    }

    public void setToporttime(Date toporttime) {
        this.toporttime = toporttime;
    }

    public Date getDepositstime() {
        return depositstime;
    }

    public void setDepositstime(Date depositstime) {
        this.depositstime = depositstime;
    }

    public Date getSendpaytime() {
        return sendpaytime;
    }

    public void setSendpaytime(Date sendpaytime) {
        this.sendpaytime = sendpaytime;
    }

    public Date getToportpaytime() {
        return toportpaytime;
    }

    public void setToportpaytime(Date toportpaytime) {
        this.toportpaytime = toportpaytime;
    }

    public Date getFinalpaytime() {
        return finalpaytime;
    }

    public void setFinalpaytime(Date finalpaytime) {
        this.finalpaytime = finalpaytime;
    }

    public BigDecimal getAmountrmb() {
        return amountrmb;
    }

    public void setAmountrmb(BigDecimal amountrmb) {
        this.amountrmb = amountrmb;
    }

    public BigDecimal getAmountusd() {
        return amountusd;
    }

    public void setAmountusd(BigDecimal amountusd) {
        this.amountusd = amountusd;
    }

    public BigDecimal getDeposits() {
        return deposits;
    }

    public void setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
    }

    public BigDecimal getPaymentmoney() {
        return paymentmoney;
    }

    public void setPaymentmoney(BigDecimal paymentmoney) {
        this.paymentmoney = paymentmoney;
    }

    public BigDecimal getNopaymenymoney() {
        return nopaymenymoney;
    }

    public void setNopaymenymoney(BigDecimal nopaymenymoney) {
        this.nopaymenymoney = nopaymenymoney;
    }

    public BigDecimal getSendmoney() {
        return sendmoney;
    }

    public void setSendmoney(BigDecimal sendmoney) {
        this.sendmoney = sendmoney;
    }

    public BigDecimal getToportmoney() {
        return toportmoney;
    }

    public void setToportmoney(BigDecimal toportmoney) {
        this.toportmoney = toportmoney;
    }

    public BigDecimal getFinalmoney() {
        return finalmoney;
    }

    public void setFinalmoney(BigDecimal finalmoney) {
        this.finalmoney = finalmoney;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public BigDecimal getAmountrmbflag() {
        return amountrmbflag;
    }

    public void setAmountrmbflag(BigDecimal amountrmbflag) {
        this.amountrmbflag = amountrmbflag;
    }

    public BigDecimal getDepositsflag() {
        return depositsflag;
    }

    public void setDepositsflag(BigDecimal depositsflag) {
        this.depositsflag = depositsflag;
    }

    public BigDecimal getSendmoneyflag() {
        return sendmoneyflag;
    }

    public void setSendmoneyflag(BigDecimal sendmoneyflag) {
        this.sendmoneyflag = sendmoneyflag;
    }

    public BigDecimal getToportmoneyflag() {
        return toportmoneyflag;
    }

    public void setToportmoneyflag(BigDecimal toportmoneyflag) {
        this.toportmoneyflag = toportmoneyflag;
    }

    public BigDecimal getFinalmoneyflag() {
        return finalmoneyflag;
    }

    public void setFinalmoneyflag(BigDecimal finalmoneyflag) {
        this.finalmoneyflag = finalmoneyflag;
    }

    public BigDecimal getAccountmoney() {
        return accountmoney;
    }

    public void setAccountmoney(BigDecimal accountmoney) {
        this.accountmoney = accountmoney;
    }

    public BigDecimal getNonpaymentmoney() {
        return nonpaymentmoney;
    }

    public void setNonpaymentmoney(BigDecimal nonpaymentmoney) {
        this.nonpaymentmoney = nonpaymentmoney;
    }

    public Date getSendmoneytime() {
        return sendmoneytime;
    }

    public void setSendmoneytime(Date sendmoneytime) {
        this.sendmoneytime = sendmoneytime;
    }

    public Date getToportmoneytime() {
        return toportmoneytime;
    }

    public void setToportmoneytime(Date toportmoneytime) {
        this.toportmoneytime = toportmoneytime;
    }

    public Date getFinalmoneytime() {
        return finalmoneytime;
    }

    public void setFinalmoneytime(Date finalmoneytime) {
        this.finalmoneytime = finalmoneytime;
    }

    public Date getDepositsstime() {
        return depositsstime;
    }

    public void setDepositsstime(Date depositsstime) {
        this.depositsstime = depositsstime;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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
        DbCaiwu other = (DbCaiwu) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getSourceid() == null ? other.getSourceid() == null : this.getSourceid().equals(other.getSourceid()))
            && (this.getMoneyrate() == null ? other.getMoneyrate() == null : this.getMoneyrate().equals(other.getMoneyrate()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getOper1() == null ? other.getOper1() == null : this.getOper1().equals(other.getOper1()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getPonumber() == null ? other.getPonumber() == null : this.getPonumber().equals(other.getPonumber()))
            && (this.getMenufuncter() == null ? other.getMenufuncter() == null : this.getMenufuncter().equals(other.getMenufuncter()))
            && (this.getMenufuncterid() == null ? other.getMenufuncterid() == null : this.getMenufuncterid().equals(other.getMenufuncterid()))
            && (this.getPaymenttype() == null ? other.getPaymenttype() == null : this.getPaymenttype().equals(other.getPaymenttype()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getToporttime() == null ? other.getToporttime() == null : this.getToporttime().equals(other.getToporttime()))
            && (this.getDepositstime() == null ? other.getDepositstime() == null : this.getDepositstime().equals(other.getDepositstime()))
            && (this.getSendpaytime() == null ? other.getSendpaytime() == null : this.getSendpaytime().equals(other.getSendpaytime()))
            && (this.getToportpaytime() == null ? other.getToportpaytime() == null : this.getToportpaytime().equals(other.getToportpaytime()))
            && (this.getFinalpaytime() == null ? other.getFinalpaytime() == null : this.getFinalpaytime().equals(other.getFinalpaytime()))
            && (this.getAmountrmb() == null ? other.getAmountrmb() == null : this.getAmountrmb().equals(other.getAmountrmb()))
            && (this.getAmountusd() == null ? other.getAmountusd() == null : this.getAmountusd().equals(other.getAmountusd()))
            && (this.getDeposits() == null ? other.getDeposits() == null : this.getDeposits().equals(other.getDeposits()))
            && (this.getPaymentmoney() == null ? other.getPaymentmoney() == null : this.getPaymentmoney().equals(other.getPaymentmoney()))
            && (this.getNopaymenymoney() == null ? other.getNopaymenymoney() == null : this.getNopaymenymoney().equals(other.getNopaymenymoney()))
            && (this.getSendmoney() == null ? other.getSendmoney() == null : this.getSendmoney().equals(other.getSendmoney()))
            && (this.getToportmoney() == null ? other.getToportmoney() == null : this.getToportmoney().equals(other.getToportmoney()))
            && (this.getFinalmoney() == null ? other.getFinalmoney() == null : this.getFinalmoney().equals(other.getFinalmoney()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getAmountrmbflag() == null ? other.getAmountrmbflag() == null : this.getAmountrmbflag().equals(other.getAmountrmbflag()))
            && (this.getDepositsflag() == null ? other.getDepositsflag() == null : this.getDepositsflag().equals(other.getDepositsflag()))
            && (this.getSendmoneyflag() == null ? other.getSendmoneyflag() == null : this.getSendmoneyflag().equals(other.getSendmoneyflag()))
            && (this.getToportmoneyflag() == null ? other.getToportmoneyflag() == null : this.getToportmoneyflag().equals(other.getToportmoneyflag()))
            && (this.getFinalmoneyflag() == null ? other.getFinalmoneyflag() == null : this.getFinalmoneyflag().equals(other.getFinalmoneyflag()))
            && (this.getAccountmoney() == null ? other.getAccountmoney() == null : this.getAccountmoney().equals(other.getAccountmoney()))
            && (this.getNonpaymentmoney() == null ? other.getNonpaymentmoney() == null : this.getNonpaymentmoney().equals(other.getNonpaymentmoney()))
            && (this.getSendmoneytime() == null ? other.getSendmoneytime() == null : this.getSendmoneytime().equals(other.getSendmoneytime()))
            && (this.getToportmoneytime() == null ? other.getToportmoneytime() == null : this.getToportmoneytime().equals(other.getToportmoneytime()))
            && (this.getFinalmoneytime() == null ? other.getFinalmoneytime() == null : this.getFinalmoneytime().equals(other.getFinalmoneytime()))
            && (this.getDepositsstime() == null ? other.getDepositsstime() == null : this.getDepositsstime().equals(other.getDepositsstime()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getSourceid() == null) ? 0 : getSourceid().hashCode());
        result = prime * result + ((getMoneyrate() == null) ? 0 : getMoneyrate().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getOper1() == null) ? 0 : getOper1().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getPonumber() == null) ? 0 : getPonumber().hashCode());
        result = prime * result + ((getMenufuncter() == null) ? 0 : getMenufuncter().hashCode());
        result = prime * result + ((getMenufuncterid() == null) ? 0 : getMenufuncterid().hashCode());
        result = prime * result + ((getPaymenttype() == null) ? 0 : getPaymenttype().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getToporttime() == null) ? 0 : getToporttime().hashCode());
        result = prime * result + ((getDepositstime() == null) ? 0 : getDepositstime().hashCode());
        result = prime * result + ((getSendpaytime() == null) ? 0 : getSendpaytime().hashCode());
        result = prime * result + ((getToportpaytime() == null) ? 0 : getToportpaytime().hashCode());
        result = prime * result + ((getFinalpaytime() == null) ? 0 : getFinalpaytime().hashCode());
        result = prime * result + ((getAmountrmb() == null) ? 0 : getAmountrmb().hashCode());
        result = prime * result + ((getAmountusd() == null) ? 0 : getAmountusd().hashCode());
        result = prime * result + ((getDeposits() == null) ? 0 : getDeposits().hashCode());
        result = prime * result + ((getPaymentmoney() == null) ? 0 : getPaymentmoney().hashCode());
        result = prime * result + ((getNopaymenymoney() == null) ? 0 : getNopaymenymoney().hashCode());
        result = prime * result + ((getSendmoney() == null) ? 0 : getSendmoney().hashCode());
        result = prime * result + ((getToportmoney() == null) ? 0 : getToportmoney().hashCode());
        result = prime * result + ((getFinalmoney() == null) ? 0 : getFinalmoney().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getAmountrmbflag() == null) ? 0 : getAmountrmbflag().hashCode());
        result = prime * result + ((getDepositsflag() == null) ? 0 : getDepositsflag().hashCode());
        result = prime * result + ((getSendmoneyflag() == null) ? 0 : getSendmoneyflag().hashCode());
        result = prime * result + ((getToportmoneyflag() == null) ? 0 : getToportmoneyflag().hashCode());
        result = prime * result + ((getFinalmoneyflag() == null) ? 0 : getFinalmoneyflag().hashCode());
        result = prime * result + ((getAccountmoney() == null) ? 0 : getAccountmoney().hashCode());
        result = prime * result + ((getNonpaymentmoney() == null) ? 0 : getNonpaymentmoney().hashCode());
        result = prime * result + ((getSendmoneytime() == null) ? 0 : getSendmoneytime().hashCode());
        result = prime * result + ((getToportmoneytime() == null) ? 0 : getToportmoneytime().hashCode());
        result = prime * result + ((getFinalmoneytime() == null) ? 0 : getFinalmoneytime().hashCode());
        result = prime * result + ((getDepositsstime() == null) ? 0 : getDepositsstime().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", source=").append(source);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", moneyrate=").append(moneyrate);
        sb.append(", money=").append(money);
        sb.append(", groupid=").append(groupid);
        sb.append(", remark=").append(remark);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", status=").append(status);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", createoper=").append(createoper);
        sb.append(", createtime=").append(createtime);
        sb.append(", oper1=").append(oper1);
        sb.append(", flag=").append(flag);
        sb.append(", country=").append(country);
        sb.append(", ponumber=").append(ponumber);
        sb.append(", menufuncter=").append(menufuncter);
        sb.append(", menufuncterid=").append(menufuncterid);
        sb.append(", paymenttype=").append(paymenttype);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", toporttime=").append(toporttime);
        sb.append(", depositstime=").append(depositstime);
        sb.append(", sendpaytime=").append(sendpaytime);
        sb.append(", toportpaytime=").append(toportpaytime);
        sb.append(", finalpaytime=").append(finalpaytime);
        sb.append(", amountrmb=").append(amountrmb);
        sb.append(", amountusd=").append(amountusd);
        sb.append(", deposits=").append(deposits);
        sb.append(", paymentmoney=").append(paymentmoney);
        sb.append(", nopaymenymoney=").append(nopaymenymoney);
        sb.append(", sendmoney=").append(sendmoney);
        sb.append(", toportmoney=").append(toportmoney);
        sb.append(", finalmoney=").append(finalmoney);
        sb.append(", productid=").append(productid);
        sb.append(", amountrmbflag=").append(amountrmbflag);
        sb.append(", depositsflag=").append(depositsflag);
        sb.append(", sendmoneyflag=").append(sendmoneyflag);
        sb.append(", toportmoneyflag=").append(toportmoneyflag);
        sb.append(", finalmoneyflag=").append(finalmoneyflag);
        sb.append(", accountmoney=").append(accountmoney);
        sb.append(", nonpaymentmoney=").append(nonpaymentmoney);
        sb.append(", sendmoneytime=").append(sendmoneytime);
        sb.append(", toportmoneytime=").append(toportmoneytime);
        sb.append(", finalmoneytime=").append(finalmoneytime);
        sb.append(", depositsstime=").append(depositsstime);
        sb.append(", descr=").append(descr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}