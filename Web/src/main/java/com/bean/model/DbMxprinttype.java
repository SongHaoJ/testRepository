package com.bean.model;

import java.io.Serializable;

public class DbMxprinttype implements Serializable {
    private Integer id;

    private String formatid;

    private String formatpath;

    private String printtype;

    private String formatname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormatid() {
        return formatid;
    }

    public void setFormatid(String formatid) {
        this.formatid = formatid == null ? null : formatid.trim();
    }

    public String getFormatpath() {
        return formatpath;
    }

    public void setFormatpath(String formatpath) {
        this.formatpath = formatpath == null ? null : formatpath.trim();
    }

    public String getPrinttype() {
        return printtype;
    }

    public void setPrinttype(String printtype) {
        this.printtype = printtype == null ? null : printtype.trim();
    }

    public String getFormatname() {
        return formatname;
    }

    public void setFormatname(String formatname) {
        this.formatname = formatname == null ? null : formatname.trim();
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
        DbMxprinttype other = (DbMxprinttype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFormatid() == null ? other.getFormatid() == null : this.getFormatid().equals(other.getFormatid()))
            && (this.getFormatpath() == null ? other.getFormatpath() == null : this.getFormatpath().equals(other.getFormatpath()))
            && (this.getPrinttype() == null ? other.getPrinttype() == null : this.getPrinttype().equals(other.getPrinttype()))
            && (this.getFormatname() == null ? other.getFormatname() == null : this.getFormatname().equals(other.getFormatname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFormatid() == null) ? 0 : getFormatid().hashCode());
        result = prime * result + ((getFormatpath() == null) ? 0 : getFormatpath().hashCode());
        result = prime * result + ((getPrinttype() == null) ? 0 : getPrinttype().hashCode());
        result = prime * result + ((getFormatname() == null) ? 0 : getFormatname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", formatid=").append(formatid);
        sb.append(", formatpath=").append(formatpath);
        sb.append(", printtype=").append(printtype);
        sb.append(", formatname=").append(formatname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}