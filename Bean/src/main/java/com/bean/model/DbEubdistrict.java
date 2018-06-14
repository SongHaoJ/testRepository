package com.bean.model;

import java.io.Serializable;

public class DbEubdistrict implements Serializable {
    private String ditid;

    private String ditname;

    private String citid;

    private String corpid;

    private String openflag;

    private String diten;

    private static final long serialVersionUID = 1L;

    public String getDitid() {
        return ditid;
    }

    public void setDitid(String ditid) {
        this.ditid = ditid == null ? null : ditid.trim();
    }

    public String getDitname() {
        return ditname;
    }

    public void setDitname(String ditname) {
        this.ditname = ditname == null ? null : ditname.trim();
    }

    public String getCitid() {
        return citid;
    }

    public void setCitid(String citid) {
        this.citid = citid == null ? null : citid.trim();
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getOpenflag() {
        return openflag;
    }

    public void setOpenflag(String openflag) {
        this.openflag = openflag == null ? null : openflag.trim();
    }

    public String getDiten() {
        return diten;
    }

    public void setDiten(String diten) {
        this.diten = diten == null ? null : diten.trim();
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
        DbEubdistrict other = (DbEubdistrict) that;
        return (this.getDitid() == null ? other.getDitid() == null : this.getDitid().equals(other.getDitid()))
            && (this.getDitname() == null ? other.getDitname() == null : this.getDitname().equals(other.getDitname()))
            && (this.getCitid() == null ? other.getCitid() == null : this.getCitid().equals(other.getCitid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getDiten() == null ? other.getDiten() == null : this.getDiten().equals(other.getDiten()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDitid() == null) ? 0 : getDitid().hashCode());
        result = prime * result + ((getDitname() == null) ? 0 : getDitname().hashCode());
        result = prime * result + ((getCitid() == null) ? 0 : getCitid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getDiten() == null) ? 0 : getDiten().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ditid=").append(ditid);
        sb.append(", ditname=").append(ditname);
        sb.append(", citid=").append(citid);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", diten=").append(diten);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}