package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbInrcase implements Serializable {
    private String transactionid;

    private String orderid;

    private String customerid;

    private String ebayitemid;

    private String ebayitemname;

    private Date starttime;

    private Date endtime;

    private Date precasetime;

    private Date opertime;

    private String answer;

    private Short updateflag;

    private String updatedescr;

    private String shoptype;

    private String shoptypeid;

    private String selluserid;

    private String expressid;

    private String expresstype;

    private String trackurl;

    private String groupid;

    private String checkinfo;

    private Short checkflag;

    private Short updatetime;

    private Short oper;

    private static final long serialVersionUID = 1L;

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getEbayitemid() {
        return ebayitemid;
    }

    public void setEbayitemid(String ebayitemid) {
        this.ebayitemid = ebayitemid == null ? null : ebayitemid.trim();
    }

    public String getEbayitemname() {
        return ebayitemname;
    }

    public void setEbayitemname(String ebayitemname) {
        this.ebayitemname = ebayitemname == null ? null : ebayitemname.trim();
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

    public Date getPrecasetime() {
        return precasetime;
    }

    public void setPrecasetime(Date precasetime) {
        this.precasetime = precasetime;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Short getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(Short updateflag) {
        this.updateflag = updateflag;
    }

    public String getUpdatedescr() {
        return updatedescr;
    }

    public void setUpdatedescr(String updatedescr) {
        this.updatedescr = updatedescr == null ? null : updatedescr.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public String getSelluserid() {
        return selluserid;
    }

    public void setSelluserid(String selluserid) {
        this.selluserid = selluserid == null ? null : selluserid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpresstype() {
        return expresstype;
    }

    public void setExpresstype(String expresstype) {
        this.expresstype = expresstype == null ? null : expresstype.trim();
    }

    public String getTrackurl() {
        return trackurl;
    }

    public void setTrackurl(String trackurl) {
        this.trackurl = trackurl == null ? null : trackurl.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(String checkinfo) {
        this.checkinfo = checkinfo == null ? null : checkinfo.trim();
    }

    public Short getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(Short checkflag) {
        this.checkflag = checkflag;
    }

    public Short getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Short updatetime) {
        this.updatetime = updatetime;
    }

    public Short getOper() {
        return oper;
    }

    public void setOper(Short oper) {
        this.oper = oper;
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
        DbInrcase other = (DbInrcase) that;
        return (this.getTransactionid() == null ? other.getTransactionid() == null : this.getTransactionid().equals(other.getTransactionid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getEbayitemid() == null ? other.getEbayitemid() == null : this.getEbayitemid().equals(other.getEbayitemid()))
            && (this.getEbayitemname() == null ? other.getEbayitemname() == null : this.getEbayitemname().equals(other.getEbayitemname()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getPrecasetime() == null ? other.getPrecasetime() == null : this.getPrecasetime().equals(other.getPrecasetime()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getUpdatedescr() == null ? other.getUpdatedescr() == null : this.getUpdatedescr().equals(other.getUpdatedescr()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getSelluserid() == null ? other.getSelluserid() == null : this.getSelluserid().equals(other.getSelluserid()))
            && (this.getExpressid() == null ? other.getExpressid() == null : this.getExpressid().equals(other.getExpressid()))
            && (this.getExpresstype() == null ? other.getExpresstype() == null : this.getExpresstype().equals(other.getExpresstype()))
            && (this.getTrackurl() == null ? other.getTrackurl() == null : this.getTrackurl().equals(other.getTrackurl()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getCheckinfo() == null ? other.getCheckinfo() == null : this.getCheckinfo().equals(other.getCheckinfo()))
            && (this.getCheckflag() == null ? other.getCheckflag() == null : this.getCheckflag().equals(other.getCheckflag()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransactionid() == null) ? 0 : getTransactionid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getEbayitemid() == null) ? 0 : getEbayitemid().hashCode());
        result = prime * result + ((getEbayitemname() == null) ? 0 : getEbayitemname().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getPrecasetime() == null) ? 0 : getPrecasetime().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getUpdatedescr() == null) ? 0 : getUpdatedescr().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getSelluserid() == null) ? 0 : getSelluserid().hashCode());
        result = prime * result + ((getExpressid() == null) ? 0 : getExpressid().hashCode());
        result = prime * result + ((getExpresstype() == null) ? 0 : getExpresstype().hashCode());
        result = prime * result + ((getTrackurl() == null) ? 0 : getTrackurl().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getCheckinfo() == null) ? 0 : getCheckinfo().hashCode());
        result = prime * result + ((getCheckflag() == null) ? 0 : getCheckflag().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transactionid=").append(transactionid);
        sb.append(", orderid=").append(orderid);
        sb.append(", customerid=").append(customerid);
        sb.append(", ebayitemid=").append(ebayitemid);
        sb.append(", ebayitemname=").append(ebayitemname);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", precasetime=").append(precasetime);
        sb.append(", opertime=").append(opertime);
        sb.append(", answer=").append(answer);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", updatedescr=").append(updatedescr);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", selluserid=").append(selluserid);
        sb.append(", expressid=").append(expressid);
        sb.append(", expresstype=").append(expresstype);
        sb.append(", trackurl=").append(trackurl);
        sb.append(", groupid=").append(groupid);
        sb.append(", checkinfo=").append(checkinfo);
        sb.append(", checkflag=").append(checkflag);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", oper=").append(oper);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}