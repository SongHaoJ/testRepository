package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSpbase implements Serializable {
    private String spcode;

    private String spnumber;

    private String oper;

    private Date opertime;

    private String phone1;

    private BigDecimal state;

    private String corpprop;

    private String wqycode;

    private BigDecimal spstatus;

    private BigDecimal type;

    private BigDecimal agentcount;

    private BigDecimal daynum;

    private BigDecimal ivrcount;

    private BigDecimal faxcount;

    private BigDecimal fee;

    private BigDecimal saving;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private BigDecimal assignflag;

    private String linkman;

    private String tel;

    private String email;

    private String logo;

    private String name;

    private String reserve;

    private String sellarea;

    private String contact1;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String servicetype;

    private String manufacturearea;

    private String address;

    private static final long serialVersionUID = 1L;

    public String getSpcode() {
        return spcode;
    }

    public void setSpcode(String spcode) {
        this.spcode = spcode == null ? null : spcode.trim();
    }

    public String getSpnumber() {
        return spnumber;
    }

    public void setSpnumber(String spnumber) {
        this.spnumber = spnumber == null ? null : spnumber.trim();
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

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public String getCorpprop() {
        return corpprop;
    }

    public void setCorpprop(String corpprop) {
        this.corpprop = corpprop == null ? null : corpprop.trim();
    }

    public String getWqycode() {
        return wqycode;
    }

    public void setWqycode(String wqycode) {
        this.wqycode = wqycode == null ? null : wqycode.trim();
    }

    public BigDecimal getSpstatus() {
        return spstatus;
    }

    public void setSpstatus(BigDecimal spstatus) {
        this.spstatus = spstatus;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getAgentcount() {
        return agentcount;
    }

    public void setAgentcount(BigDecimal agentcount) {
        this.agentcount = agentcount;
    }

    public BigDecimal getDaynum() {
        return daynum;
    }

    public void setDaynum(BigDecimal daynum) {
        this.daynum = daynum;
    }

    public BigDecimal getIvrcount() {
        return ivrcount;
    }

    public void setIvrcount(BigDecimal ivrcount) {
        this.ivrcount = ivrcount;
    }

    public BigDecimal getFaxcount() {
        return faxcount;
    }

    public void setFaxcount(BigDecimal faxcount) {
        this.faxcount = faxcount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getSaving() {
        return saving;
    }

    public void setSaving(BigDecimal saving) {
        this.saving = saving;
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

    public BigDecimal getAssignflag() {
        return assignflag;
    }

    public void setAssignflag(BigDecimal assignflag) {
        this.assignflag = assignflag;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve == null ? null : reserve.trim();
    }

    public String getSellarea() {
        return sellarea;
    }

    public void setSellarea(String sellarea) {
        this.sellarea = sellarea == null ? null : sellarea.trim();
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1 == null ? null : contact1.trim();
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

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }

    public String getManufacturearea() {
        return manufacturearea;
    }

    public void setManufacturearea(String manufacturearea) {
        this.manufacturearea = manufacturearea == null ? null : manufacturearea.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        DbSpbase other = (DbSpbase) that;
        return (this.getSpcode() == null ? other.getSpcode() == null : this.getSpcode().equals(other.getSpcode()))
            && (this.getSpnumber() == null ? other.getSpnumber() == null : this.getSpnumber().equals(other.getSpnumber()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getPhone1() == null ? other.getPhone1() == null : this.getPhone1().equals(other.getPhone1()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCorpprop() == null ? other.getCorpprop() == null : this.getCorpprop().equals(other.getCorpprop()))
            && (this.getWqycode() == null ? other.getWqycode() == null : this.getWqycode().equals(other.getWqycode()))
            && (this.getSpstatus() == null ? other.getSpstatus() == null : this.getSpstatus().equals(other.getSpstatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAgentcount() == null ? other.getAgentcount() == null : this.getAgentcount().equals(other.getAgentcount()))
            && (this.getDaynum() == null ? other.getDaynum() == null : this.getDaynum().equals(other.getDaynum()))
            && (this.getIvrcount() == null ? other.getIvrcount() == null : this.getIvrcount().equals(other.getIvrcount()))
            && (this.getFaxcount() == null ? other.getFaxcount() == null : this.getFaxcount().equals(other.getFaxcount()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getSaving() == null ? other.getSaving() == null : this.getSaving().equals(other.getSaving()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getAssignflag() == null ? other.getAssignflag() == null : this.getAssignflag().equals(other.getAssignflag()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getReserve() == null ? other.getReserve() == null : this.getReserve().equals(other.getReserve()))
            && (this.getSellarea() == null ? other.getSellarea() == null : this.getSellarea().equals(other.getSellarea()))
            && (this.getContact1() == null ? other.getContact1() == null : this.getContact1().equals(other.getContact1()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getServicetype() == null ? other.getServicetype() == null : this.getServicetype().equals(other.getServicetype()))
            && (this.getManufacturearea() == null ? other.getManufacturearea() == null : this.getManufacturearea().equals(other.getManufacturearea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpcode() == null) ? 0 : getSpcode().hashCode());
        result = prime * result + ((getSpnumber() == null) ? 0 : getSpnumber().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getPhone1() == null) ? 0 : getPhone1().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCorpprop() == null) ? 0 : getCorpprop().hashCode());
        result = prime * result + ((getWqycode() == null) ? 0 : getWqycode().hashCode());
        result = prime * result + ((getSpstatus() == null) ? 0 : getSpstatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAgentcount() == null) ? 0 : getAgentcount().hashCode());
        result = prime * result + ((getDaynum() == null) ? 0 : getDaynum().hashCode());
        result = prime * result + ((getIvrcount() == null) ? 0 : getIvrcount().hashCode());
        result = prime * result + ((getFaxcount() == null) ? 0 : getFaxcount().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getSaving() == null) ? 0 : getSaving().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getAssignflag() == null) ? 0 : getAssignflag().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getReserve() == null) ? 0 : getReserve().hashCode());
        result = prime * result + ((getSellarea() == null) ? 0 : getSellarea().hashCode());
        result = prime * result + ((getContact1() == null) ? 0 : getContact1().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getServicetype() == null) ? 0 : getServicetype().hashCode());
        result = prime * result + ((getManufacturearea() == null) ? 0 : getManufacturearea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spcode=").append(spcode);
        sb.append(", spnumber=").append(spnumber);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", phone1=").append(phone1);
        sb.append(", state=").append(state);
        sb.append(", corpprop=").append(corpprop);
        sb.append(", wqycode=").append(wqycode);
        sb.append(", spstatus=").append(spstatus);
        sb.append(", type=").append(type);
        sb.append(", agentcount=").append(agentcount);
        sb.append(", daynum=").append(daynum);
        sb.append(", ivrcount=").append(ivrcount);
        sb.append(", faxcount=").append(faxcount);
        sb.append(", fee=").append(fee);
        sb.append(", saving=").append(saving);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", assignflag=").append(assignflag);
        sb.append(", linkman=").append(linkman);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", logo=").append(logo);
        sb.append(", name=").append(name);
        sb.append(", reserve=").append(reserve);
        sb.append(", sellarea=").append(sellarea);
        sb.append(", contact1=").append(contact1);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", servicetype=").append(servicetype);
        sb.append(", manufacturearea=").append(manufacturearea);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}