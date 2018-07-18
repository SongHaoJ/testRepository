package com.bean.model;

import java.io.Serializable;

public class DbSystemMenu implements Serializable {
    private Long id;

    private Long parentid;

    private Long firstid;

    private String menuname;

    private String parentname;

    private String pageurl;

    private Short menulevel;

    private Short sort;

    private Short cfirstpage;

    private Short numflag;

    private String ico;

    private Short status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Long getFirstid() {
        return firstid;
    }

    public void setFirstid(Long firstid) {
        this.firstid = firstid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }

    public Short getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(Short menulevel) {
        this.menulevel = menulevel;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Short getCfirstpage() {
        return cfirstpage;
    }

    public void setCfirstpage(Short cfirstpage) {
        this.cfirstpage = cfirstpage;
    }

    public Short getNumflag() {
        return numflag;
    }

    public void setNumflag(Short numflag) {
        this.numflag = numflag;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico == null ? null : ico.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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
        DbSystemMenu other = (DbSystemMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getFirstid() == null ? other.getFirstid() == null : this.getFirstid().equals(other.getFirstid()))
            && (this.getMenuname() == null ? other.getMenuname() == null : this.getMenuname().equals(other.getMenuname()))
            && (this.getParentname() == null ? other.getParentname() == null : this.getParentname().equals(other.getParentname()))
            && (this.getPageurl() == null ? other.getPageurl() == null : this.getPageurl().equals(other.getPageurl()))
            && (this.getMenulevel() == null ? other.getMenulevel() == null : this.getMenulevel().equals(other.getMenulevel()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCfirstpage() == null ? other.getCfirstpage() == null : this.getCfirstpage().equals(other.getCfirstpage()))
            && (this.getNumflag() == null ? other.getNumflag() == null : this.getNumflag().equals(other.getNumflag()))
            && (this.getIco() == null ? other.getIco() == null : this.getIco().equals(other.getIco()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getFirstid() == null) ? 0 : getFirstid().hashCode());
        result = prime * result + ((getMenuname() == null) ? 0 : getMenuname().hashCode());
        result = prime * result + ((getParentname() == null) ? 0 : getParentname().hashCode());
        result = prime * result + ((getPageurl() == null) ? 0 : getPageurl().hashCode());
        result = prime * result + ((getMenulevel() == null) ? 0 : getMenulevel().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCfirstpage() == null) ? 0 : getCfirstpage().hashCode());
        result = prime * result + ((getNumflag() == null) ? 0 : getNumflag().hashCode());
        result = prime * result + ((getIco() == null) ? 0 : getIco().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentid=").append(parentid);
        sb.append(", firstid=").append(firstid);
        sb.append(", menuname=").append(menuname);
        sb.append(", parentname=").append(parentname);
        sb.append(", pageurl=").append(pageurl);
        sb.append(", menulevel=").append(menulevel);
        sb.append(", sort=").append(sort);
        sb.append(", cfirstpage=").append(cfirstpage);
        sb.append(", numflag=").append(numflag);
        sb.append(", ico=").append(ico);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}