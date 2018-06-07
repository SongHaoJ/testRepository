package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbBpostseller implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.SID
     *
     * @mbg.generated
     */
    private BigDecimal sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.TOKENAPI
     *
     * @mbg.generated
     */
    private String tokenapi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.USERNAME
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.ADDRESS1
     *
     * @mbg.generated
     */
    private String address1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.ADDRESS2
     *
     * @mbg.generated
     */
    private String address2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.CITY
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.STATE
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.ZIP5
     *
     * @mbg.generated
     */
    private Long zip5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.ZIP4
     *
     * @mbg.generated
     */
    private Long zip4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.PHONE
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.OPENFLAG
     *
     * @mbg.generated
     */
    private String openflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.OPERTIME
     *
     * @mbg.generated
     */
    private Date opertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.CORPID
     *
     * @mbg.generated
     */
    private String corpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.RESERVE1
     *
     * @mbg.generated
     */
    private String reserve1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.RESERVE2
     *
     * @mbg.generated
     */
    private String reserve2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.RESERVE3
     *
     * @mbg.generated
     */
    private String reserve3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.RESERVE4
     *
     * @mbg.generated
     */
    private String reserve4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.RESERVE5
     *
     * @mbg.generated
     */
    private String reserve5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_bpostseller.SENDNAME
     *
     * @mbg.generated
     */
    private String sendname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_bpostseller
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.SID
     *
     * @return the value of db_bpostseller.SID
     *
     * @mbg.generated
     */
    public BigDecimal getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.SID
     *
     * @param sid the value for db_bpostseller.SID
     *
     * @mbg.generated
     */
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.TOKENAPI
     *
     * @return the value of db_bpostseller.TOKENAPI
     *
     * @mbg.generated
     */
    public String getTokenapi() {
        return tokenapi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.TOKENAPI
     *
     * @param tokenapi the value for db_bpostseller.TOKENAPI
     *
     * @mbg.generated
     */
    public void setTokenapi(String tokenapi) {
        this.tokenapi = tokenapi == null ? null : tokenapi.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.USERNAME
     *
     * @return the value of db_bpostseller.USERNAME
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.USERNAME
     *
     * @param username the value for db_bpostseller.USERNAME
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.PASSWORD
     *
     * @return the value of db_bpostseller.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.PASSWORD
     *
     * @param password the value for db_bpostseller.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.EMAIL
     *
     * @return the value of db_bpostseller.EMAIL
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.EMAIL
     *
     * @param email the value for db_bpostseller.EMAIL
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.ADDRESS1
     *
     * @return the value of db_bpostseller.ADDRESS1
     *
     * @mbg.generated
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.ADDRESS1
     *
     * @param address1 the value for db_bpostseller.ADDRESS1
     *
     * @mbg.generated
     */
    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.ADDRESS2
     *
     * @return the value of db_bpostseller.ADDRESS2
     *
     * @mbg.generated
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.ADDRESS2
     *
     * @param address2 the value for db_bpostseller.ADDRESS2
     *
     * @mbg.generated
     */
    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.CITY
     *
     * @return the value of db_bpostseller.CITY
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.CITY
     *
     * @param city the value for db_bpostseller.CITY
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.STATE
     *
     * @return the value of db_bpostseller.STATE
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.STATE
     *
     * @param state the value for db_bpostseller.STATE
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.ZIP5
     *
     * @return the value of db_bpostseller.ZIP5
     *
     * @mbg.generated
     */
    public Long getZip5() {
        return zip5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.ZIP5
     *
     * @param zip5 the value for db_bpostseller.ZIP5
     *
     * @mbg.generated
     */
    public void setZip5(Long zip5) {
        this.zip5 = zip5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.ZIP4
     *
     * @return the value of db_bpostseller.ZIP4
     *
     * @mbg.generated
     */
    public Long getZip4() {
        return zip4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.ZIP4
     *
     * @param zip4 the value for db_bpostseller.ZIP4
     *
     * @mbg.generated
     */
    public void setZip4(Long zip4) {
        this.zip4 = zip4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.PHONE
     *
     * @return the value of db_bpostseller.PHONE
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.PHONE
     *
     * @param phone the value for db_bpostseller.PHONE
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.OPENFLAG
     *
     * @return the value of db_bpostseller.OPENFLAG
     *
     * @mbg.generated
     */
    public String getOpenflag() {
        return openflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.OPENFLAG
     *
     * @param openflag the value for db_bpostseller.OPENFLAG
     *
     * @mbg.generated
     */
    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.OPER
     *
     * @return the value of db_bpostseller.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.OPER
     *
     * @param oper the value for db_bpostseller.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.OPERTIME
     *
     * @return the value of db_bpostseller.OPERTIME
     *
     * @mbg.generated
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.OPERTIME
     *
     * @param opertime the value for db_bpostseller.OPERTIME
     *
     * @mbg.generated
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.CORPID
     *
     * @return the value of db_bpostseller.CORPID
     *
     * @mbg.generated
     */
    public String getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.CORPID
     *
     * @param corpid the value for db_bpostseller.CORPID
     *
     * @mbg.generated
     */
    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.RESERVE1
     *
     * @return the value of db_bpostseller.RESERVE1
     *
     * @mbg.generated
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.RESERVE1
     *
     * @param reserve1 the value for db_bpostseller.RESERVE1
     *
     * @mbg.generated
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.RESERVE2
     *
     * @return the value of db_bpostseller.RESERVE2
     *
     * @mbg.generated
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.RESERVE2
     *
     * @param reserve2 the value for db_bpostseller.RESERVE2
     *
     * @mbg.generated
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.RESERVE3
     *
     * @return the value of db_bpostseller.RESERVE3
     *
     * @mbg.generated
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.RESERVE3
     *
     * @param reserve3 the value for db_bpostseller.RESERVE3
     *
     * @mbg.generated
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.RESERVE4
     *
     * @return the value of db_bpostseller.RESERVE4
     *
     * @mbg.generated
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.RESERVE4
     *
     * @param reserve4 the value for db_bpostseller.RESERVE4
     *
     * @mbg.generated
     */
    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.RESERVE5
     *
     * @return the value of db_bpostseller.RESERVE5
     *
     * @mbg.generated
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.RESERVE5
     *
     * @param reserve5 the value for db_bpostseller.RESERVE5
     *
     * @mbg.generated
     */
    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_bpostseller.SENDNAME
     *
     * @return the value of db_bpostseller.SENDNAME
     *
     * @mbg.generated
     */
    public String getSendname() {
        return sendname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_bpostseller.SENDNAME
     *
     * @param sendname the value for db_bpostseller.SENDNAME
     *
     * @mbg.generated
     */
    public void setSendname(String sendname) {
        this.sendname = sendname == null ? null : sendname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bpostseller
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
        DbBpostseller other = (DbBpostseller) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getTokenapi() == null ? other.getTokenapi() == null : this.getTokenapi().equals(other.getTokenapi()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getAddress2() == null ? other.getAddress2() == null : this.getAddress2().equals(other.getAddress2()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getZip5() == null ? other.getZip5() == null : this.getZip5().equals(other.getZip5()))
            && (this.getZip4() == null ? other.getZip4() == null : this.getZip4().equals(other.getZip4()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getSendname() == null ? other.getSendname() == null : this.getSendname().equals(other.getSendname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bpostseller
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getTokenapi() == null) ? 0 : getTokenapi().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getZip5() == null) ? 0 : getZip5().hashCode());
        result = prime * result + ((getZip4() == null) ? 0 : getZip4().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getSendname() == null) ? 0 : getSendname().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bpostseller
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", tokenapi=").append(tokenapi);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", address1=").append(address1);
        sb.append(", address2=").append(address2);
        sb.append(", city=").append(city);
        sb.append(", state=").append(state);
        sb.append(", zip5=").append(zip5);
        sb.append(", zip4=").append(zip4);
        sb.append(", phone=").append(phone);
        sb.append(", openflag=").append(openflag);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", corpid=").append(corpid);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", sendname=").append(sendname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}