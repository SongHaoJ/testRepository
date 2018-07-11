package com.bean.model;

import java.io.Serializable;

public class DbBirdcountry implements Serializable {
    private String sid;

    private String name;

    private String printableName;

    private String iso;

    private String numcode;

    private String iso3;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrintableName() {
        return printableName;
    }

    public void setPrintableName(String printableName) {
        this.printableName = printableName == null ? null : printableName.trim();
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso == null ? null : iso.trim();
    }

    public String getNumcode() {
        return numcode;
    }

    public void setNumcode(String numcode) {
        this.numcode = numcode == null ? null : numcode.trim();
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3 == null ? null : iso3.trim();
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
        DbBirdcountry other = (DbBirdcountry) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrintableName() == null ? other.getPrintableName() == null : this.getPrintableName().equals(other.getPrintableName()))
            && (this.getIso() == null ? other.getIso() == null : this.getIso().equals(other.getIso()))
            && (this.getNumcode() == null ? other.getNumcode() == null : this.getNumcode().equals(other.getNumcode()))
            && (this.getIso3() == null ? other.getIso3() == null : this.getIso3().equals(other.getIso3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrintableName() == null) ? 0 : getPrintableName().hashCode());
        result = prime * result + ((getIso() == null) ? 0 : getIso().hashCode());
        result = prime * result + ((getNumcode() == null) ? 0 : getNumcode().hashCode());
        result = prime * result + ((getIso3() == null) ? 0 : getIso3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", name=").append(name);
        sb.append(", printableName=").append(printableName);
        sb.append(", iso=").append(iso);
        sb.append(", numcode=").append(numcode);
        sb.append(", iso3=").append(iso3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}