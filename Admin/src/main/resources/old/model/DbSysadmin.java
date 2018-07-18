package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSysadmin implements Serializable {
    private String oper;

    private String name;

    private String mobile;

    private String dbclass;

    private String password;

    private BigDecimal loginflag;

    private String loginip;

    private Date logintime;

    private String team;

    private String groupid;

    private String area;

    private String managerarea;

    private String birthday;

    private String identifynum;

    private String sex;

    private BigDecimal activeflag;

    private BigDecimal locked;

    private String telephone;

    private String depart;

    private String position;

    private String spcode;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private String reserve5;

    private BigDecimal operid;

    private String storage;

    private String menuid;

    private static final long serialVersionUID = 1L;

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getDbclass() {
        return dbclass;
    }

    public void setDbclass(String dbclass) {
        this.dbclass = dbclass == null ? null : dbclass.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public BigDecimal getLoginflag() {
        return loginflag;
    }

    public void setLoginflag(BigDecimal loginflag) {
        this.loginflag = loginflag;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getManagerarea() {
        return managerarea;
    }

    public void setManagerarea(String managerarea) {
        this.managerarea = managerarea == null ? null : managerarea.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getIdentifynum() {
        return identifynum;
    }

    public void setIdentifynum(String identifynum) {
        this.identifynum = identifynum == null ? null : identifynum.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public BigDecimal getActiveflag() {
        return activeflag;
    }

    public void setActiveflag(BigDecimal activeflag) {
        this.activeflag = activeflag;
    }

    public BigDecimal getLocked() {
        return locked;
    }

    public void setLocked(BigDecimal locked) {
        this.locked = locked;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getSpcode() {
        return spcode;
    }

    public void setSpcode(String spcode) {
        this.spcode = spcode == null ? null : spcode.trim();
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

    public BigDecimal getOperid() {
        return operid;
    }

    public void setOperid(BigDecimal operid) {
        this.operid = operid;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
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
        DbSysadmin other = (DbSysadmin) that;
        return (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getDbclass() == null ? other.getDbclass() == null : this.getDbclass().equals(other.getDbclass()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLoginflag() == null ? other.getLoginflag() == null : this.getLoginflag().equals(other.getLoginflag()))
            && (this.getLoginip() == null ? other.getLoginip() == null : this.getLoginip().equals(other.getLoginip()))
            && (this.getLogintime() == null ? other.getLogintime() == null : this.getLogintime().equals(other.getLogintime()))
            && (this.getTeam() == null ? other.getTeam() == null : this.getTeam().equals(other.getTeam()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getManagerarea() == null ? other.getManagerarea() == null : this.getManagerarea().equals(other.getManagerarea()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getIdentifynum() == null ? other.getIdentifynum() == null : this.getIdentifynum().equals(other.getIdentifynum()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getActiveflag() == null ? other.getActiveflag() == null : this.getActiveflag().equals(other.getActiveflag()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getDepart() == null ? other.getDepart() == null : this.getDepart().equals(other.getDepart()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getSpcode() == null ? other.getSpcode() == null : this.getSpcode().equals(other.getSpcode()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getDbclass() == null) ? 0 : getDbclass().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLoginflag() == null) ? 0 : getLoginflag().hashCode());
        result = prime * result + ((getLoginip() == null) ? 0 : getLoginip().hashCode());
        result = prime * result + ((getLogintime() == null) ? 0 : getLogintime().hashCode());
        result = prime * result + ((getTeam() == null) ? 0 : getTeam().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getManagerarea() == null) ? 0 : getManagerarea().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getIdentifynum() == null) ? 0 : getIdentifynum().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getActiveflag() == null) ? 0 : getActiveflag().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getDepart() == null) ? 0 : getDepart().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getSpcode() == null) ? 0 : getSpcode().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oper=").append(oper);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", dbclass=").append(dbclass);
        sb.append(", password=").append(password);
        sb.append(", loginflag=").append(loginflag);
        sb.append(", loginip=").append(loginip);
        sb.append(", logintime=").append(logintime);
        sb.append(", team=").append(team);
        sb.append(", groupid=").append(groupid);
        sb.append(", area=").append(area);
        sb.append(", managerarea=").append(managerarea);
        sb.append(", birthday=").append(birthday);
        sb.append(", identifynum=").append(identifynum);
        sb.append(", sex=").append(sex);
        sb.append(", activeflag=").append(activeflag);
        sb.append(", locked=").append(locked);
        sb.append(", telephone=").append(telephone);
        sb.append(", depart=").append(depart);
        sb.append(", position=").append(position);
        sb.append(", spcode=").append(spcode);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", operid=").append(operid);
        sb.append(", storage=").append(storage);
        sb.append(", menuid=").append(menuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}