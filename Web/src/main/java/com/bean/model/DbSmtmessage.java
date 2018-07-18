package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSmtmessage implements Serializable {
    private String sid;

    private String sendername;

    private String senderloginid;

    private String producturl;

    private String read;

    private String receivename;

    private String receiveloginid;

    private Date createdate;

    private Date receivedate;

    private String messagetype;

    private String havefile;

    private String fileurl;

    private String orderurl;

    private String itemid;

    private String productid;

    private String productname;

    private String orderid;

    private String relationid;

    private String smttypeid;

    private String content;

    private String descr;

    private String shoptypeid;

    private String shoptypename;

    private String categoryid;

    private String categoryname;

    private String status;

    private String applyoper;

    private String oper;

    private Date opertime;

    private String answer;

    private String assignoper;

    private Date assignopertime;

    private String updateflag;

    private Date updatetime;

    private String updatedescr;

    private String openflag;

    private BigDecimal customertypeid;

    private String customertype;

    private String typeid;

    private String typename;

    private String typecolor;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String reserve6;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername == null ? null : sendername.trim();
    }

    public String getSenderloginid() {
        return senderloginid;
    }

    public void setSenderloginid(String senderloginid) {
        this.senderloginid = senderloginid == null ? null : senderloginid.trim();
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl == null ? null : producturl.trim();
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read == null ? null : read.trim();
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getReceiveloginid() {
        return receiveloginid;
    }

    public void setReceiveloginid(String receiveloginid) {
        this.receiveloginid = receiveloginid == null ? null : receiveloginid.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }

    public String getHavefile() {
        return havefile;
    }

    public void setHavefile(String havefile) {
        this.havefile = havefile == null ? null : havefile.trim();
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public String getOrderurl() {
        return orderurl;
    }

    public void setOrderurl(String orderurl) {
        this.orderurl = orderurl == null ? null : orderurl.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid == null ? null : relationid.trim();
    }

    public String getSmttypeid() {
        return smttypeid;
    }

    public void setSmttypeid(String smttypeid) {
        this.smttypeid = smttypeid == null ? null : smttypeid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(String shoptypeid) {
        this.shoptypeid = shoptypeid == null ? null : shoptypeid.trim();
    }

    public String getShoptypename() {
        return shoptypename;
    }

    public void setShoptypename(String shoptypename) {
        this.shoptypename = shoptypename == null ? null : shoptypename.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getApplyoper() {
        return applyoper;
    }

    public void setApplyoper(String applyoper) {
        this.applyoper = applyoper == null ? null : applyoper.trim();
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getAssignoper() {
        return assignoper;
    }

    public void setAssignoper(String assignoper) {
        this.assignoper = assignoper == null ? null : assignoper.trim();
    }

    public Date getAssignopertime() {
        return assignopertime;
    }

    public void setAssignopertime(Date assignopertime) {
        this.assignopertime = assignopertime;
    }

    public String getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(String updateflag) {
        this.updateflag = updateflag == null ? null : updateflag.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatedescr() {
        return updatedescr;
    }

    public void setUpdatedescr(String updatedescr) {
        this.updatedescr = updatedescr == null ? null : updatedescr.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public BigDecimal getCustomertypeid() {
        return customertypeid;
    }

    public void setCustomertypeid(BigDecimal customertypeid) {
        this.customertypeid = customertypeid;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype == null ? null : customertype.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypecolor() {
        return typecolor;
    }

    public void setTypecolor(String typecolor) {
        this.typecolor = typecolor == null ? null : typecolor.trim();
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
        DbSmtmessage other = (DbSmtmessage) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSendername() == null ? other.getSendername() == null : this.getSendername().equals(other.getSendername()))
            && (this.getSenderloginid() == null ? other.getSenderloginid() == null : this.getSenderloginid().equals(other.getSenderloginid()))
            && (this.getProducturl() == null ? other.getProducturl() == null : this.getProducturl().equals(other.getProducturl()))
            && (this.getRead() == null ? other.getRead() == null : this.getRead().equals(other.getRead()))
            && (this.getReceivename() == null ? other.getReceivename() == null : this.getReceivename().equals(other.getReceivename()))
            && (this.getReceiveloginid() == null ? other.getReceiveloginid() == null : this.getReceiveloginid().equals(other.getReceiveloginid()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getReceivedate() == null ? other.getReceivedate() == null : this.getReceivedate().equals(other.getReceivedate()))
            && (this.getMessagetype() == null ? other.getMessagetype() == null : this.getMessagetype().equals(other.getMessagetype()))
            && (this.getHavefile() == null ? other.getHavefile() == null : this.getHavefile().equals(other.getHavefile()))
            && (this.getFileurl() == null ? other.getFileurl() == null : this.getFileurl().equals(other.getFileurl()))
            && (this.getOrderurl() == null ? other.getOrderurl() == null : this.getOrderurl().equals(other.getOrderurl()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getRelationid() == null ? other.getRelationid() == null : this.getRelationid().equals(other.getRelationid()))
            && (this.getSmttypeid() == null ? other.getSmttypeid() == null : this.getSmttypeid().equals(other.getSmttypeid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptypename() == null ? other.getShoptypename() == null : this.getShoptypename().equals(other.getShoptypename()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getApplyoper() == null ? other.getApplyoper() == null : this.getApplyoper().equals(other.getApplyoper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getAssignoper() == null ? other.getAssignoper() == null : this.getAssignoper().equals(other.getAssignoper()))
            && (this.getAssignopertime() == null ? other.getAssignopertime() == null : this.getAssignopertime().equals(other.getAssignopertime()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getUpdatedescr() == null ? other.getUpdatedescr() == null : this.getUpdatedescr().equals(other.getUpdatedescr()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCustomertypeid() == null ? other.getCustomertypeid() == null : this.getCustomertypeid().equals(other.getCustomertypeid()))
            && (this.getCustomertype() == null ? other.getCustomertype() == null : this.getCustomertype().equals(other.getCustomertype()))
            && (this.getTypeid() == null ? other.getTypeid() == null : this.getTypeid().equals(other.getTypeid()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getTypecolor() == null ? other.getTypecolor() == null : this.getTypecolor().equals(other.getTypecolor()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getReserve6() == null ? other.getReserve6() == null : this.getReserve6().equals(other.getReserve6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSendername() == null) ? 0 : getSendername().hashCode());
        result = prime * result + ((getSenderloginid() == null) ? 0 : getSenderloginid().hashCode());
        result = prime * result + ((getProducturl() == null) ? 0 : getProducturl().hashCode());
        result = prime * result + ((getRead() == null) ? 0 : getRead().hashCode());
        result = prime * result + ((getReceivename() == null) ? 0 : getReceivename().hashCode());
        result = prime * result + ((getReceiveloginid() == null) ? 0 : getReceiveloginid().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getReceivedate() == null) ? 0 : getReceivedate().hashCode());
        result = prime * result + ((getMessagetype() == null) ? 0 : getMessagetype().hashCode());
        result = prime * result + ((getHavefile() == null) ? 0 : getHavefile().hashCode());
        result = prime * result + ((getFileurl() == null) ? 0 : getFileurl().hashCode());
        result = prime * result + ((getOrderurl() == null) ? 0 : getOrderurl().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getRelationid() == null) ? 0 : getRelationid().hashCode());
        result = prime * result + ((getSmttypeid() == null) ? 0 : getSmttypeid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptypename() == null) ? 0 : getShoptypename().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getApplyoper() == null) ? 0 : getApplyoper().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getAssignoper() == null) ? 0 : getAssignoper().hashCode());
        result = prime * result + ((getAssignopertime() == null) ? 0 : getAssignopertime().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getUpdatedescr() == null) ? 0 : getUpdatedescr().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCustomertypeid() == null) ? 0 : getCustomertypeid().hashCode());
        result = prime * result + ((getCustomertype() == null) ? 0 : getCustomertype().hashCode());
        result = prime * result + ((getTypeid() == null) ? 0 : getTypeid().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getTypecolor() == null) ? 0 : getTypecolor().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getReserve6() == null) ? 0 : getReserve6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sendername=").append(sendername);
        sb.append(", senderloginid=").append(senderloginid);
        sb.append(", producturl=").append(producturl);
        sb.append(", read=").append(read);
        sb.append(", receivename=").append(receivename);
        sb.append(", receiveloginid=").append(receiveloginid);
        sb.append(", createdate=").append(createdate);
        sb.append(", receivedate=").append(receivedate);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", havefile=").append(havefile);
        sb.append(", fileurl=").append(fileurl);
        sb.append(", orderurl=").append(orderurl);
        sb.append(", itemid=").append(itemid);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", orderid=").append(orderid);
        sb.append(", relationid=").append(relationid);
        sb.append(", smttypeid=").append(smttypeid);
        sb.append(", content=").append(content);
        sb.append(", descr=").append(descr);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptypename=").append(shoptypename);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", status=").append(status);
        sb.append(", applyoper=").append(applyoper);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", answer=").append(answer);
        sb.append(", assignoper=").append(assignoper);
        sb.append(", assignopertime=").append(assignopertime);
        sb.append(", updateflag=").append(updateflag);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updatedescr=").append(updatedescr);
        sb.append(", openflag=").append(openflag);
        sb.append(", customertypeid=").append(customertypeid);
        sb.append(", customertype=").append(customertype);
        sb.append(", typeid=").append(typeid);
        sb.append(", typename=").append(typename);
        sb.append(", typecolor=").append(typecolor);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", reserve6=").append(reserve6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}