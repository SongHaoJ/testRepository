package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbSysadmin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.MOBILE
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.CLASS
     *
     * @mbg.generated
     */
    private String class;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.LOGINFLAG
     *
     * @mbg.generated
     */
    private BigDecimal loginflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.LOGINIP
     *
     * @mbg.generated
     */
    private String loginip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.LOGINTIME
     *
     * @mbg.generated
     */
    private Date logintime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.TEAM
     *
     * @mbg.generated
     */
    private String team;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.GROUPID
     *
     * @mbg.generated
     */
    private String groupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.AREA
     *
     * @mbg.generated
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.MANAGERAREA
     *
     * @mbg.generated
     */
    private String managerarea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.BIRTHDAY
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.IDENTIFYNUM
     *
     * @mbg.generated
     */
    private String identifynum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.SEX
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.ACTIVEFLAG
     *
     * @mbg.generated
     */
    private BigDecimal activeflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.LOCKED
     *
     * @mbg.generated
     */
    private BigDecimal locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.TELEPHONE
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.DEPART
     *
     * @mbg.generated
     */
    private String depart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.POSITION
     *
     * @mbg.generated
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.SPCODE
     *
     * @mbg.generated
     */
    private String spcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.RESERVE4
     *
     * @mbg.generated
     */
    private String reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.RESERVE5
     *
     * @mbg.generated
     */
    private String reserve5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.OPERID
     *
     * @mbg.generated
     */
    private BigDecimal operid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.STORAGE
     *
     * @mbg.generated
     */
    private String storage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_sysadmin.MENUID
     *
     * @mbg.generated
     */
    private String menuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_sysadmin
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.OPER
     *
     * @return the value of db_sysadmin.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.OPER
     *
     * @param oper the value for db_sysadmin.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.NAME
     *
     * @return the value of db_sysadmin.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.NAME
     *
     * @param name the value for db_sysadmin.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.MOBILE
     *
     * @return the value of db_sysadmin.MOBILE
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.MOBILE
     *
     * @param mobile the value for db_sysadmin.MOBILE
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.CLASS
     *
     * @return the value of db_sysadmin.CLASS
     *
     * @mbg.generated
     */
    public String getClass() {
        return class;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.CLASS
     *
     * @param class the value for db_sysadmin.CLASS
     *
     * @mbg.generated
     */
    public void setClass(String class) {
        this.class = class == null ? null : class.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.PASSWORD
     *
     * @return the value of db_sysadmin.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.PASSWORD
     *
     * @param password the value for db_sysadmin.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.LOGINFLAG
     *
     * @return the value of db_sysadmin.LOGINFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getLoginflag() {
        return loginflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.LOGINFLAG
     *
     * @param loginflag the value for db_sysadmin.LOGINFLAG
     *
     * @mbg.generated
     */
    public void setLoginflag(BigDecimal loginflag) {
        this.loginflag = loginflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.LOGINIP
     *
     * @return the value of db_sysadmin.LOGINIP
     *
     * @mbg.generated
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.LOGINIP
     *
     * @param loginip the value for db_sysadmin.LOGINIP
     *
     * @mbg.generated
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.LOGINTIME
     *
     * @return the value of db_sysadmin.LOGINTIME
     *
     * @mbg.generated
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.LOGINTIME
     *
     * @param logintime the value for db_sysadmin.LOGINTIME
     *
     * @mbg.generated
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.TEAM
     *
     * @return the value of db_sysadmin.TEAM
     *
     * @mbg.generated
     */
    public String getTeam() {
        return team;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.TEAM
     *
     * @param team the value for db_sysadmin.TEAM
     *
     * @mbg.generated
     */
    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.GROUPID
     *
     * @return the value of db_sysadmin.GROUPID
     *
     * @mbg.generated
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.GROUPID
     *
     * @param groupid the value for db_sysadmin.GROUPID
     *
     * @mbg.generated
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.AREA
     *
     * @return the value of db_sysadmin.AREA
     *
     * @mbg.generated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.AREA
     *
     * @param area the value for db_sysadmin.AREA
     *
     * @mbg.generated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.MANAGERAREA
     *
     * @return the value of db_sysadmin.MANAGERAREA
     *
     * @mbg.generated
     */
    public String getManagerarea() {
        return managerarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.MANAGERAREA
     *
     * @param managerarea the value for db_sysadmin.MANAGERAREA
     *
     * @mbg.generated
     */
    public void setManagerarea(String managerarea) {
        this.managerarea = managerarea == null ? null : managerarea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.BIRTHDAY
     *
     * @return the value of db_sysadmin.BIRTHDAY
     *
     * @mbg.generated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.BIRTHDAY
     *
     * @param birthday the value for db_sysadmin.BIRTHDAY
     *
     * @mbg.generated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.IDENTIFYNUM
     *
     * @return the value of db_sysadmin.IDENTIFYNUM
     *
     * @mbg.generated
     */
    public String getIdentifynum() {
        return identifynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.IDENTIFYNUM
     *
     * @param identifynum the value for db_sysadmin.IDENTIFYNUM
     *
     * @mbg.generated
     */
    public void setIdentifynum(String identifynum) {
        this.identifynum = identifynum == null ? null : identifynum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.SEX
     *
     * @return the value of db_sysadmin.SEX
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.SEX
     *
     * @param sex the value for db_sysadmin.SEX
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.ACTIVEFLAG
     *
     * @return the value of db_sysadmin.ACTIVEFLAG
     *
     * @mbg.generated
     */
    public BigDecimal getActiveflag() {
        return activeflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.ACTIVEFLAG
     *
     * @param activeflag the value for db_sysadmin.ACTIVEFLAG
     *
     * @mbg.generated
     */
    public void setActiveflag(BigDecimal activeflag) {
        this.activeflag = activeflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.LOCKED
     *
     * @return the value of db_sysadmin.LOCKED
     *
     * @mbg.generated
     */
    public BigDecimal getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.LOCKED
     *
     * @param locked the value for db_sysadmin.LOCKED
     *
     * @mbg.generated
     */
    public void setLocked(BigDecimal locked) {
        this.locked = locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.TELEPHONE
     *
     * @return the value of db_sysadmin.TELEPHONE
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.TELEPHONE
     *
     * @param telephone the value for db_sysadmin.TELEPHONE
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.DEPART
     *
     * @return the value of db_sysadmin.DEPART
     *
     * @mbg.generated
     */
    public String getDepart() {
        return depart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.DEPART
     *
     * @param depart the value for db_sysadmin.DEPART
     *
     * @mbg.generated
     */
    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.POSITION
     *
     * @return the value of db_sysadmin.POSITION
     *
     * @mbg.generated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.POSITION
     *
     * @param position the value for db_sysadmin.POSITION
     *
     * @mbg.generated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.SPCODE
     *
     * @return the value of db_sysadmin.SPCODE
     *
     * @mbg.generated
     */
    public String getSpcode() {
        return spcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.SPCODE
     *
     * @param spcode the value for db_sysadmin.SPCODE
     *
     * @mbg.generated
     */
    public void setSpcode(String spcode) {
        this.spcode = spcode == null ? null : spcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.RESERVE1
     *
     * @return the value of db_sysadmin.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.RESERVE1
     *
     * @param reserve1 the value for db_sysadmin.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.RESERVE2
     *
     * @return the value of db_sysadmin.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.RESERVE2
     *
     * @param reserve2 the value for db_sysadmin.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.RESERVE3
     *
     * @return the value of db_sysadmin.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.RESERVE3
     *
     * @param reserve3 the value for db_sysadmin.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.RESERVE4
     *
     * @return the value of db_sysadmin.RESERVE4
     *
     * @mbg.generated
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.RESERVE4
     *
     * @param reserve4 the value for db_sysadmin.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.RESERVE5
     *
     * @return the value of db_sysadmin.RESERVE5
     *
     * @mbg.generated
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.RESERVE5
     *
     * @param reserve5 the value for db_sysadmin.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.OPERID
     *
     * @return the value of db_sysadmin.OPERID
     *
     * @mbg.generated
     */
    public BigDecimal getOperid() {
        return operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.OPERID
     *
     * @param operid the value for db_sysadmin.OPERID
     *
     * @mbg.generated
     */
    public void setOperid(BigDecimal operid) {
        this.operid = operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.STORAGE
     *
     * @return the value of db_sysadmin.STORAGE
     *
     * @mbg.generated
     */
    public String getStorage() {
        return storage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.STORAGE
     *
     * @param storage the value for db_sysadmin.STORAGE
     *
     * @mbg.generated
     */
    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_sysadmin.MENUID
     *
     * @return the value of db_sysadmin.MENUID
     *
     * @mbg.generated
     */
    public String getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_sysadmin.MENUID
     *
     * @param menuid the value for db_sysadmin.MENUID
     *
     * @mbg.generated
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sysadmin
     *
     * @mbg.generated
     */
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
            && (this.getClass() == null ? other.getClass() == null : this.getClass().equals(other.getClass()))
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sysadmin
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getClass() == null) ? 0 : getClass().hashCode());
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sysadmin
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oper=").append(oper);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", class=").append(class);
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