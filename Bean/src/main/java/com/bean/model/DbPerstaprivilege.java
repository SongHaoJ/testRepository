package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbPerstaprivilege implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.SEQUENCEID
     *
     * @mbg.generated
     */
    private String sequenceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.CREATEOPER
     *
     * @mbg.generated
     */
    private String createoper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.OPER
     *
     * @mbg.generated
     */
    private String oper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.GRADE
     *
     * @mbg.generated
     */
    private String grade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.IFPARENT
     *
     * @mbg.generated
     */
    private String ifparent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_perstaprivilege.MODULES
     *
     * @mbg.generated
     */
    private String modules;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_perstaprivilege
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.SEQUENCEID
     *
     * @return the value of db_perstaprivilege.SEQUENCEID
     *
     * @mbg.generated
     */
    public String getSequenceid() {
        return sequenceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.SEQUENCEID
     *
     * @param sequenceid the value for db_perstaprivilege.SEQUENCEID
     *
     * @mbg.generated
     */
    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.CREATEOPER
     *
     * @return the value of db_perstaprivilege.CREATEOPER
     *
     * @mbg.generated
     */
    public String getCreateoper() {
        return createoper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.CREATEOPER
     *
     * @param createoper the value for db_perstaprivilege.CREATEOPER
     *
     * @mbg.generated
     */
    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.OPER
     *
     * @return the value of db_perstaprivilege.OPER
     *
     * @mbg.generated
     */
    public String getOper() {
        return oper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.OPER
     *
     * @param oper the value for db_perstaprivilege.OPER
     *
     * @mbg.generated
     */
    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.CREATETIME
     *
     * @return the value of db_perstaprivilege.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.CREATETIME
     *
     * @param createtime the value for db_perstaprivilege.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.GRADE
     *
     * @return the value of db_perstaprivilege.GRADE
     *
     * @mbg.generated
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.GRADE
     *
     * @param grade the value for db_perstaprivilege.GRADE
     *
     * @mbg.generated
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.IFPARENT
     *
     * @return the value of db_perstaprivilege.IFPARENT
     *
     * @mbg.generated
     */
    public String getIfparent() {
        return ifparent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.IFPARENT
     *
     * @param ifparent the value for db_perstaprivilege.IFPARENT
     *
     * @mbg.generated
     */
    public void setIfparent(String ifparent) {
        this.ifparent = ifparent == null ? null : ifparent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_perstaprivilege.MODULES
     *
     * @return the value of db_perstaprivilege.MODULES
     *
     * @mbg.generated
     */
    public String getModules() {
        return modules;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_perstaprivilege.MODULES
     *
     * @param modules the value for db_perstaprivilege.MODULES
     *
     * @mbg.generated
     */
    public void setModules(String modules) {
        this.modules = modules == null ? null : modules.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_perstaprivilege
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
        DbPerstaprivilege other = (DbPerstaprivilege) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getIfparent() == null ? other.getIfparent() == null : this.getIfparent().equals(other.getIfparent()))
            && (this.getModules() == null ? other.getModules() == null : this.getModules().equals(other.getModules()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_perstaprivilege
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getIfparent() == null) ? 0 : getIfparent().hashCode());
        result = prime * result + ((getModules() == null) ? 0 : getModules().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_perstaprivilege
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", createoper=").append(createoper);
        sb.append(", oper=").append(oper);
        sb.append(", createtime=").append(createtime);
        sb.append(", grade=").append(grade);
        sb.append(", ifparent=").append(ifparent);
        sb.append(", modules=").append(modules);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}