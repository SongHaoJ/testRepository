package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbEbaymessage implements Serializable {
    private String sequenceid;

    private String messageid;

    private String subject;

    private String content;

    private String descr;

    private String sender;

    private String itemid;

    private String flaged;

    private String ifread;

    private Date createdate;

    private Date receivedate;

    private String sendtoname;

    private String productid;

    private String productname;

    private String stype;

    private String shoptypeid;

    private String shoptypename;

    private String categoryid;

    private String categoryname;

    private String orderid;

    private String status;

    private String folderid;

    private String foldername;

    private String applyoper;

    private String oper;

    private Date opertime;

    private String answer;

    private String assignoper;

    private Date assignopertime;

    private String updateflag;

    private String openflag;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private String reserve6;

    private BigDecimal reserve7;

    private BigDecimal reserve8;

    private String reserve9;

    private String reserve10;

    private String typeid;

    private String typename;

    private String typecolor;

    private BigDecimal errorcount;

    private String errordescr;

    private String parentmessageid;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
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

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getFlaged() {
        return flaged;
    }

    public void setFlaged(String flaged) {
        this.flaged = flaged == null ? null : flaged.trim();
    }

    public String getIfread() {
        return ifread;
    }

    public void setIfread(String ifread) {
        this.ifread = ifread == null ? null : ifread.trim();
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

    public String getSendtoname() {
        return sendtoname;
    }

    public void setSendtoname(String sendtoname) {
        this.sendtoname = sendtoname == null ? null : sendtoname.trim();
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

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFolderid() {
        return folderid;
    }

    public void setFolderid(String folderid) {
        this.folderid = folderid == null ? null : folderid.trim();
    }

    public String getFoldername() {
        return foldername;
    }

    public void setFoldername(String foldername) {
        this.foldername = foldername == null ? null : foldername.trim();
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

    public String getReserve9() {
        return reserve9;
    }

    public void setReserve9(String reserve9) {
        this.reserve9 = reserve9 == null ? null : reserve9.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
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

    public BigDecimal getErrorcount() {
        return errorcount;
    }

    public void setErrorcount(BigDecimal errorcount) {
        this.errorcount = errorcount;
    }

    public String getErrordescr() {
        return errordescr;
    }

    public void setErrordescr(String errordescr) {
        this.errordescr = errordescr == null ? null : errordescr.trim();
    }

    public String getParentmessageid() {
        return parentmessageid;
    }

    public void setParentmessageid(String parentmessageid) {
        this.parentmessageid = parentmessageid == null ? null : parentmessageid.trim();
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
        DbEbaymessage other = (DbEbaymessage) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getFlaged() == null ? other.getFlaged() == null : this.getFlaged().equals(other.getFlaged()))
            && (this.getIfread() == null ? other.getIfread() == null : this.getIfread().equals(other.getIfread()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getReceivedate() == null ? other.getReceivedate() == null : this.getReceivedate().equals(other.getReceivedate()))
            && (this.getSendtoname() == null ? other.getSendtoname() == null : this.getSendtoname().equals(other.getSendtoname()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getStype() == null ? other.getStype() == null : this.getStype().equals(other.getStype()))
            && (this.getShoptypeid() == null ? other.getShoptypeid() == null : this.getShoptypeid().equals(other.getShoptypeid()))
            && (this.getShoptypename() == null ? other.getShoptypename() == null : this.getShoptypename().equals(other.getShoptypename()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getCategoryname() == null ? other.getCategoryname() == null : this.getCategoryname().equals(other.getCategoryname()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFolderid() == null ? other.getFolderid() == null : this.getFolderid().equals(other.getFolderid()))
            && (this.getFoldername() == null ? other.getFoldername() == null : this.getFoldername().equals(other.getFoldername()))
            && (this.getApplyoper() == null ? other.getApplyoper() == null : this.getApplyoper().equals(other.getApplyoper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getAssignoper() == null ? other.getAssignoper() == null : this.getAssignoper().equals(other.getAssignoper()))
            && (this.getAssignopertime() == null ? other.getAssignopertime() == null : this.getAssignopertime().equals(other.getAssignopertime()))
            && (this.getUpdateflag() == null ? other.getUpdateflag() == null : this.getUpdateflag().equals(other.getUpdateflag()))
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
            && (this.getTypeid() == null ? other.getTypeid() == null : this.getTypeid().equals(other.getTypeid()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getTypecolor() == null ? other.getTypecolor() == null : this.getTypecolor().equals(other.getTypecolor()))
            && (this.getErrorcount() == null ? other.getErrorcount() == null : this.getErrorcount().equals(other.getErrorcount()))
            && (this.getErrordescr() == null ? other.getErrordescr() == null : this.getErrordescr().equals(other.getErrordescr()))
            && (this.getParentmessageid() == null ? other.getParentmessageid() == null : this.getParentmessageid().equals(other.getParentmessageid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getFlaged() == null) ? 0 : getFlaged().hashCode());
        result = prime * result + ((getIfread() == null) ? 0 : getIfread().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getReceivedate() == null) ? 0 : getReceivedate().hashCode());
        result = prime * result + ((getSendtoname() == null) ? 0 : getSendtoname().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getStype() == null) ? 0 : getStype().hashCode());
        result = prime * result + ((getShoptypeid() == null) ? 0 : getShoptypeid().hashCode());
        result = prime * result + ((getShoptypename() == null) ? 0 : getShoptypename().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getCategoryname() == null) ? 0 : getCategoryname().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFolderid() == null) ? 0 : getFolderid().hashCode());
        result = prime * result + ((getFoldername() == null) ? 0 : getFoldername().hashCode());
        result = prime * result + ((getApplyoper() == null) ? 0 : getApplyoper().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getAssignoper() == null) ? 0 : getAssignoper().hashCode());
        result = prime * result + ((getAssignopertime() == null) ? 0 : getAssignopertime().hashCode());
        result = prime * result + ((getUpdateflag() == null) ? 0 : getUpdateflag().hashCode());
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
        result = prime * result + ((getTypeid() == null) ? 0 : getTypeid().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getTypecolor() == null) ? 0 : getTypecolor().hashCode());
        result = prime * result + ((getErrorcount() == null) ? 0 : getErrorcount().hashCode());
        result = prime * result + ((getErrordescr() == null) ? 0 : getErrordescr().hashCode());
        result = prime * result + ((getParentmessageid() == null) ? 0 : getParentmessageid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", messageid=").append(messageid);
        sb.append(", subject=").append(subject);
        sb.append(", content=").append(content);
        sb.append(", descr=").append(descr);
        sb.append(", sender=").append(sender);
        sb.append(", itemid=").append(itemid);
        sb.append(", flaged=").append(flaged);
        sb.append(", ifread=").append(ifread);
        sb.append(", createdate=").append(createdate);
        sb.append(", receivedate=").append(receivedate);
        sb.append(", sendtoname=").append(sendtoname);
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", stype=").append(stype);
        sb.append(", shoptypeid=").append(shoptypeid);
        sb.append(", shoptypename=").append(shoptypename);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", orderid=").append(orderid);
        sb.append(", status=").append(status);
        sb.append(", folderid=").append(folderid);
        sb.append(", foldername=").append(foldername);
        sb.append(", applyoper=").append(applyoper);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", answer=").append(answer);
        sb.append(", assignoper=").append(assignoper);
        sb.append(", assignopertime=").append(assignopertime);
        sb.append(", updateflag=").append(updateflag);
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
        sb.append(", typeid=").append(typeid);
        sb.append(", typename=").append(typename);
        sb.append(", typecolor=").append(typecolor);
        sb.append(", errorcount=").append(errorcount);
        sb.append(", errordescr=").append(errordescr);
        sb.append(", parentmessageid=").append(parentmessageid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}