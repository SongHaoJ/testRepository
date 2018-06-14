package com.bean.model;

import java.io.Serializable;

public class DbEubcity implements Serializable {
    private String cityid;

    private String cityname;

    private String provinceid;

    private String corpid;

    private String openflag;

    private String cityen;

    private static final long serialVersionUID = 1L;

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
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

    public String getCityen() {
        return cityen;
    }

    public void setCityen(String cityen) {
        this.cityen = cityen == null ? null : cityen.trim();
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
        DbEubcity other = (DbEubcity) that;
        return (this.getCityid() == null ? other.getCityid() == null : this.getCityid().equals(other.getCityid()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getProvinceid() == null ? other.getProvinceid() == null : this.getProvinceid().equals(other.getProvinceid()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getCityen() == null ? other.getCityen() == null : this.getCityen().equals(other.getCityen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityid() == null) ? 0 : getCityid().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getProvinceid() == null) ? 0 : getProvinceid().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getCityen() == null) ? 0 : getCityen().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityid=").append(cityid);
        sb.append(", cityname=").append(cityname);
        sb.append(", provinceid=").append(provinceid);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", cityen=").append(cityen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}