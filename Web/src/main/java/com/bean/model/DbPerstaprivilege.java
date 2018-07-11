package com.bean.model;

import java.io.Serializable;
import java.util.Date;

public class DbPerstaprivilege implements Serializable {
    private String sequenceid;

    private String createoper;

    private String oper;

    private Date createtime;

    private String grade;

    private String ifparent;

    private String modules;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getIfparent() {
        return ifparent;
    }

    public void setIfparent(String ifparent) {
        this.ifparent = ifparent == null ? null : ifparent.trim();
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules == null ? null : modules.trim();
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
        DbPerstaprivilege other = (DbPerstaprivilege) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getIfparent() == null ? other.getIfparent() == null : this.getIfparent().equals(other.getIfparent()))
            && (this.getModules() == null ? other.getModules() == null : this.getModules().equals(other.getModules()));
    }

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