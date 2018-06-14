package com.bean.model;

import java.io.Serializable;

public class DbUsershowconfig implements Serializable {
    private Integer id;

    private Integer apiid;

    private String title;

    private String columname;

    private Integer sort;

    private Short needflag;

    private Short lengthflag;

    private Short filedlength;

    private Short emailflag;

    private Short telflag;

    private String content;

    private String ordertype;

    private String value;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApiid() {
        return apiid;
    }

    public void setApiid(Integer apiid) {
        this.apiid = apiid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getColumname() {
        return columname;
    }

    public void setColumname(String columname) {
        this.columname = columname == null ? null : columname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Short getNeedflag() {
        return needflag;
    }

    public void setNeedflag(Short needflag) {
        this.needflag = needflag;
    }

    public Short getLengthflag() {
        return lengthflag;
    }

    public void setLengthflag(Short lengthflag) {
        this.lengthflag = lengthflag;
    }

    public Short getFiledlength() {
        return filedlength;
    }

    public void setFiledlength(Short filedlength) {
        this.filedlength = filedlength;
    }

    public Short getEmailflag() {
        return emailflag;
    }

    public void setEmailflag(Short emailflag) {
        this.emailflag = emailflag;
    }

    public Short getTelflag() {
        return telflag;
    }

    public void setTelflag(Short telflag) {
        this.telflag = telflag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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
        DbUsershowconfig other = (DbUsershowconfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApiid() == null ? other.getApiid() == null : this.getApiid().equals(other.getApiid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getColumname() == null ? other.getColumname() == null : this.getColumname().equals(other.getColumname()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getNeedflag() == null ? other.getNeedflag() == null : this.getNeedflag().equals(other.getNeedflag()))
            && (this.getLengthflag() == null ? other.getLengthflag() == null : this.getLengthflag().equals(other.getLengthflag()))
            && (this.getFiledlength() == null ? other.getFiledlength() == null : this.getFiledlength().equals(other.getFiledlength()))
            && (this.getEmailflag() == null ? other.getEmailflag() == null : this.getEmailflag().equals(other.getEmailflag()))
            && (this.getTelflag() == null ? other.getTelflag() == null : this.getTelflag().equals(other.getTelflag()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApiid() == null) ? 0 : getApiid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getColumname() == null) ? 0 : getColumname().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getNeedflag() == null) ? 0 : getNeedflag().hashCode());
        result = prime * result + ((getLengthflag() == null) ? 0 : getLengthflag().hashCode());
        result = prime * result + ((getFiledlength() == null) ? 0 : getFiledlength().hashCode());
        result = prime * result + ((getEmailflag() == null) ? 0 : getEmailflag().hashCode());
        result = prime * result + ((getTelflag() == null) ? 0 : getTelflag().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", apiid=").append(apiid);
        sb.append(", title=").append(title);
        sb.append(", columname=").append(columname);
        sb.append(", sort=").append(sort);
        sb.append(", needflag=").append(needflag);
        sb.append(", lengthflag=").append(lengthflag);
        sb.append(", filedlength=").append(filedlength);
        sb.append(", emailflag=").append(emailflag);
        sb.append(", telflag=").append(telflag);
        sb.append(", content=").append(content);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}