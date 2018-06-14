package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbTradefree implements Serializable {
    private String sequenceid;

    private String platformid;

    private String platform;

    private String salemethod;

    private BigDecimal starprice;

    private BigDecimal endprice;

    private String oper;

    private Date opertime;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private BigDecimal reserve4;

    private BigDecimal reserve5;

    private String createoper;

    private Date createdate;

    private String corpid;

    private String expression;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getPlatformid() {
        return platformid;
    }

    public void setPlatformid(String platformid) {
        this.platformid = platformid == null ? null : platformid.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getSalemethod() {
        return salemethod;
    }

    public void setSalemethod(String salemethod) {
        this.salemethod = salemethod == null ? null : salemethod.trim();
    }

    public BigDecimal getStarprice() {
        return starprice;
    }

    public void setStarprice(BigDecimal starprice) {
        this.starprice = starprice;
    }

    public BigDecimal getEndprice() {
        return endprice;
    }

    public void setEndprice(BigDecimal endprice) {
        this.endprice = endprice;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public BigDecimal getReserve4() {
        return reserve4;
    }

    public void setReserve4(BigDecimal reserve4) {
        this.reserve4 = reserve4;
    }

    public BigDecimal getReserve5() {
        return reserve5;
    }

    public void setReserve5(BigDecimal reserve5) {
        this.reserve5 = reserve5;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        DbTradefree other = (DbTradefree) that;
        return (this.getSequenceid() == null ? other.getSequenceid() == null : this.getSequenceid().equals(other.getSequenceid()))
            && (this.getPlatformid() == null ? other.getPlatformid() == null : this.getPlatformid().equals(other.getPlatformid()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getSalemethod() == null ? other.getSalemethod() == null : this.getSalemethod().equals(other.getSalemethod()))
            && (this.getStarprice() == null ? other.getStarprice() == null : this.getStarprice().equals(other.getStarprice()))
            && (this.getEndprice() == null ? other.getEndprice() == null : this.getEndprice().equals(other.getEndprice()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getReserve4() == null ? other.getReserve4() == null : this.getReserve4().equals(other.getReserve4()))
            && (this.getReserve5() == null ? other.getReserve5() == null : this.getReserve5().equals(other.getReserve5()))
            && (this.getCreateoper() == null ? other.getCreateoper() == null : this.getCreateoper().equals(other.getCreateoper()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCorpid() == null ? other.getCorpid() == null : this.getCorpid().equals(other.getCorpid()))
            && (this.getExpression() == null ? other.getExpression() == null : this.getExpression().equals(other.getExpression()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceid() == null) ? 0 : getSequenceid().hashCode());
        result = prime * result + ((getPlatformid() == null) ? 0 : getPlatformid().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getSalemethod() == null) ? 0 : getSalemethod().hashCode());
        result = prime * result + ((getStarprice() == null) ? 0 : getStarprice().hashCode());
        result = prime * result + ((getEndprice() == null) ? 0 : getEndprice().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getReserve4() == null) ? 0 : getReserve4().hashCode());
        result = prime * result + ((getReserve5() == null) ? 0 : getReserve5().hashCode());
        result = prime * result + ((getCreateoper() == null) ? 0 : getCreateoper().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCorpid() == null) ? 0 : getCorpid().hashCode());
        result = prime * result + ((getExpression() == null) ? 0 : getExpression().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceid=").append(sequenceid);
        sb.append(", platformid=").append(platformid);
        sb.append(", platform=").append(platform);
        sb.append(", salemethod=").append(salemethod);
        sb.append(", starprice=").append(starprice);
        sb.append(", endprice=").append(endprice);
        sb.append(", oper=").append(oper);
        sb.append(", opertime=").append(opertime);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", reserve4=").append(reserve4);
        sb.append(", reserve5=").append(reserve5);
        sb.append(", createoper=").append(createoper);
        sb.append(", createdate=").append(createdate);
        sb.append(", corpid=").append(corpid);
        sb.append(", expression=").append(expression);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}