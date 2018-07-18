package com.bean.model;

import java.io.Serializable;

public class DbSavenummonth implements Serializable {
    private String month;

    private String flag1;

    private String flag2;

    private String flag3;

    private String flag4;

    private String flag5;

    private String flag6;

    private String flag7;

    private String flag8;

    private String flag9;

    private String flag10;

    private String flag11;

    private String flag12;

    private String flag13;

    private String flag14;

    private String flag15;

    private static final long serialVersionUID = 1L;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1 == null ? null : flag1.trim();
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2 == null ? null : flag2.trim();
    }

    public String getFlag3() {
        return flag3;
    }

    public void setFlag3(String flag3) {
        this.flag3 = flag3 == null ? null : flag3.trim();
    }

    public String getFlag4() {
        return flag4;
    }

    public void setFlag4(String flag4) {
        this.flag4 = flag4 == null ? null : flag4.trim();
    }

    public String getFlag5() {
        return flag5;
    }

    public void setFlag5(String flag5) {
        this.flag5 = flag5 == null ? null : flag5.trim();
    }

    public String getFlag6() {
        return flag6;
    }

    public void setFlag6(String flag6) {
        this.flag6 = flag6 == null ? null : flag6.trim();
    }

    public String getFlag7() {
        return flag7;
    }

    public void setFlag7(String flag7) {
        this.flag7 = flag7 == null ? null : flag7.trim();
    }

    public String getFlag8() {
        return flag8;
    }

    public void setFlag8(String flag8) {
        this.flag8 = flag8 == null ? null : flag8.trim();
    }

    public String getFlag9() {
        return flag9;
    }

    public void setFlag9(String flag9) {
        this.flag9 = flag9 == null ? null : flag9.trim();
    }

    public String getFlag10() {
        return flag10;
    }

    public void setFlag10(String flag10) {
        this.flag10 = flag10 == null ? null : flag10.trim();
    }

    public String getFlag11() {
        return flag11;
    }

    public void setFlag11(String flag11) {
        this.flag11 = flag11 == null ? null : flag11.trim();
    }

    public String getFlag12() {
        return flag12;
    }

    public void setFlag12(String flag12) {
        this.flag12 = flag12 == null ? null : flag12.trim();
    }

    public String getFlag13() {
        return flag13;
    }

    public void setFlag13(String flag13) {
        this.flag13 = flag13 == null ? null : flag13.trim();
    }

    public String getFlag14() {
        return flag14;
    }

    public void setFlag14(String flag14) {
        this.flag14 = flag14 == null ? null : flag14.trim();
    }

    public String getFlag15() {
        return flag15;
    }

    public void setFlag15(String flag15) {
        this.flag15 = flag15 == null ? null : flag15.trim();
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
        DbSavenummonth other = (DbSavenummonth) that;
        return (this.getMonth() == null ? other.getMonth() == null : this.getMonth().equals(other.getMonth()))
            && (this.getFlag1() == null ? other.getFlag1() == null : this.getFlag1().equals(other.getFlag1()))
            && (this.getFlag2() == null ? other.getFlag2() == null : this.getFlag2().equals(other.getFlag2()))
            && (this.getFlag3() == null ? other.getFlag3() == null : this.getFlag3().equals(other.getFlag3()))
            && (this.getFlag4() == null ? other.getFlag4() == null : this.getFlag4().equals(other.getFlag4()))
            && (this.getFlag5() == null ? other.getFlag5() == null : this.getFlag5().equals(other.getFlag5()))
            && (this.getFlag6() == null ? other.getFlag6() == null : this.getFlag6().equals(other.getFlag6()))
            && (this.getFlag7() == null ? other.getFlag7() == null : this.getFlag7().equals(other.getFlag7()))
            && (this.getFlag8() == null ? other.getFlag8() == null : this.getFlag8().equals(other.getFlag8()))
            && (this.getFlag9() == null ? other.getFlag9() == null : this.getFlag9().equals(other.getFlag9()))
            && (this.getFlag10() == null ? other.getFlag10() == null : this.getFlag10().equals(other.getFlag10()))
            && (this.getFlag11() == null ? other.getFlag11() == null : this.getFlag11().equals(other.getFlag11()))
            && (this.getFlag12() == null ? other.getFlag12() == null : this.getFlag12().equals(other.getFlag12()))
            && (this.getFlag13() == null ? other.getFlag13() == null : this.getFlag13().equals(other.getFlag13()))
            && (this.getFlag14() == null ? other.getFlag14() == null : this.getFlag14().equals(other.getFlag14()))
            && (this.getFlag15() == null ? other.getFlag15() == null : this.getFlag15().equals(other.getFlag15()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonth() == null) ? 0 : getMonth().hashCode());
        result = prime * result + ((getFlag1() == null) ? 0 : getFlag1().hashCode());
        result = prime * result + ((getFlag2() == null) ? 0 : getFlag2().hashCode());
        result = prime * result + ((getFlag3() == null) ? 0 : getFlag3().hashCode());
        result = prime * result + ((getFlag4() == null) ? 0 : getFlag4().hashCode());
        result = prime * result + ((getFlag5() == null) ? 0 : getFlag5().hashCode());
        result = prime * result + ((getFlag6() == null) ? 0 : getFlag6().hashCode());
        result = prime * result + ((getFlag7() == null) ? 0 : getFlag7().hashCode());
        result = prime * result + ((getFlag8() == null) ? 0 : getFlag8().hashCode());
        result = prime * result + ((getFlag9() == null) ? 0 : getFlag9().hashCode());
        result = prime * result + ((getFlag10() == null) ? 0 : getFlag10().hashCode());
        result = prime * result + ((getFlag11() == null) ? 0 : getFlag11().hashCode());
        result = prime * result + ((getFlag12() == null) ? 0 : getFlag12().hashCode());
        result = prime * result + ((getFlag13() == null) ? 0 : getFlag13().hashCode());
        result = prime * result + ((getFlag14() == null) ? 0 : getFlag14().hashCode());
        result = prime * result + ((getFlag15() == null) ? 0 : getFlag15().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", month=").append(month);
        sb.append(", flag1=").append(flag1);
        sb.append(", flag2=").append(flag2);
        sb.append(", flag3=").append(flag3);
        sb.append(", flag4=").append(flag4);
        sb.append(", flag5=").append(flag5);
        sb.append(", flag6=").append(flag6);
        sb.append(", flag7=").append(flag7);
        sb.append(", flag8=").append(flag8);
        sb.append(", flag9=").append(flag9);
        sb.append(", flag10=").append(flag10);
        sb.append(", flag11=").append(flag11);
        sb.append(", flag12=").append(flag12);
        sb.append(", flag13=").append(flag13);
        sb.append(", flag14=").append(flag14);
        sb.append(", flag15=").append(flag15);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}