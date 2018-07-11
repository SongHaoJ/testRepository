package com.bean.model;

import java.io.Serializable;

public class DbEncode implements Serializable {
    private String char1;

    private String char2;

    private static final long serialVersionUID = 1L;

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1 == null ? null : char1.trim();
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2 == null ? null : char2.trim();
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
        DbEncode other = (DbEncode) that;
        return (this.getChar1() == null ? other.getChar1() == null : this.getChar1().equals(other.getChar1()))
            && (this.getChar2() == null ? other.getChar2() == null : this.getChar2().equals(other.getChar2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChar1() == null) ? 0 : getChar1().hashCode());
        result = prime * result + ((getChar2() == null) ? 0 : getChar2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", char1=").append(char1);
        sb.append(", char2=").append(char2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}