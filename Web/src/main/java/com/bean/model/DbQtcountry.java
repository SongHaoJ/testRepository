package com.bean.model;

import java.io.Serializable;

public class DbQtcountry implements Serializable {
    private String code2;

    private String code3;

    private String namecn;

    private String nameen;

    private static final long serialVersionUID = 1L;

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2 == null ? null : code2.trim();
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3 == null ? null : code3.trim();
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
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
        DbQtcountry other = (DbQtcountry) that;
        return (this.getCode2() == null ? other.getCode2() == null : this.getCode2().equals(other.getCode2()))
            && (this.getCode3() == null ? other.getCode3() == null : this.getCode3().equals(other.getCode3()))
            && (this.getNamecn() == null ? other.getNamecn() == null : this.getNamecn().equals(other.getNamecn()))
            && (this.getNameen() == null ? other.getNameen() == null : this.getNameen().equals(other.getNameen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode2() == null) ? 0 : getCode2().hashCode());
        result = prime * result + ((getCode3() == null) ? 0 : getCode3().hashCode());
        result = prime * result + ((getNamecn() == null) ? 0 : getNamecn().hashCode());
        result = prime * result + ((getNameen() == null) ? 0 : getNameen().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code2=").append(code2);
        sb.append(", code3=").append(code3);
        sb.append(", namecn=").append(namecn);
        sb.append(", nameen=").append(nameen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}