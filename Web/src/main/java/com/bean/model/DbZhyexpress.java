package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DbZhyexpress implements Serializable {
    private BigDecimal sequenceid;

    private String shippingcode;

    private String shippingnamecn;

    private String shippingnameen;

    private String shippintimgurl;

    private String status;

    private String shippintaddress;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(BigDecimal sequenceid) {
        this.sequenceid = sequenceid;
    }

    public String getShippingcode() {
        return shippingcode;
    }

    public void setShippingcode(String shippingcode) {
        this.shippingcode = shippingcode == null ? null : shippingcode.trim();
    }

    public String getShippingnamecn() {
        return shippingnamecn;
    }

    public void setShippingnamecn(String shippingnamecn) {
        this.shippingnamecn = shippingnamecn == null ? null : shippingnamecn.trim();
    }

    public String getShippingnameen() {
        return shippingnameen;
    }

    public void setShippingnameen(String shippingnameen) {
        this.shippingnameen = shippingnameen == null ? null : shippingnameen.trim();
    }

    public String getShippintimgurl() {
        return shippintimgurl;
    }

    public void setShippintimgurl(String shippintimgurl) {
        this.shippintimgurl = shippintimgurl == null ? null : shippintimgurl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getShippintaddress() {
        return shippintaddress;
    }

    public void setShippintaddress(String shippintaddress) {
        this.shippintaddress = shippintaddress == null ? null : shippintaddress.trim();
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
        DbZhyexpress other = (DbZhyexpress) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getShippingcode() == null ? other.getShippingcode() == null : this.getShippingcode().equals(other.getShippingcode()))
            && (this.getShippingnamecn() == null ? other.getShippingnamecn() == null : this.getShippingnamecn().equals(other.getShippingnamecn()))
            && (this.getShippingnameen() == null ? other.getShippingnameen() == null : this.getShippingnameen().equals(other.getShippingnameen()))
            && (this.getShippintimgurl() == null ? other.getShippintimgurl() == null : this.getShippintimgurl().equals(other.getShippintimgurl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getShippintaddress() == null ? other.getShippintaddress() == null : this.getShippintaddress().equals(other.getShippintaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getShippingcode() == null) ? 0 : getShippingcode().hashCode());
        result = prime * result + ((getShippingnamecn() == null) ? 0 : getShippingnamecn().hashCode());
        result = prime * result + ((getShippingnameen() == null) ? 0 : getShippingnameen().hashCode());
        result = prime * result + ((getShippintimgurl() == null) ? 0 : getShippintimgurl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShippintaddress() == null) ? 0 : getShippintaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", shippingcode=").append(shippingcode);
        sb.append(", shippingnamecn=").append(shippingnamecn);
        sb.append(", shippingnameen=").append(shippingnameen);
        sb.append(", shippintimgurl=").append(shippintimgurl);
        sb.append(", status=").append(status);
        sb.append(", shippintaddress=").append(shippintaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}