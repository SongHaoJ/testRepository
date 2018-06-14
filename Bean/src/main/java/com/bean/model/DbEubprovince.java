package com.bean.model;

import java.io.Serializable;

public class DbEubprovince implements Serializable {
    private String provinceid;

    private String provincename;

    private String corpid;

    private String openflag;

    private String provinceen;

    private static final long serialVersionUID = 1L;

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
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

    public String getProvinceen() {
        return provinceen;
    }

    public void setProvinceen(String provinceen) {
        this.provinceen = provinceen == null ? null : provinceen.trim();
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
        DbEubprovince other = (DbEubprovince) that;
        return (this.getProvinceid() == null ? other.getProvinceid() == null : this.getProvinceid().equals(other.getProvinceid()))
            && (this.getProvincename() == null ? other.getProvincename() == null : this.getProvincename().equals(other.getProvincename()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getProvinceen() == null ? other.getProvinceen() == null : this.getProvinceen().equals(other.getProvinceen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProvinceid() == null) ? 0 : getProvinceid().hashCode());
        result = prime * result + ((getProvincename() == null) ? 0 : getProvincename().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getProvinceen() == null) ? 0 : getProvinceen().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", provinceid=").append(provinceid);
        sb.append(", provincename=").append(provincename);
        sb.append(", corpid=").append(corpid);
        sb.append(", openflag=").append(openflag);
        sb.append(", provinceen=").append(provinceen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}