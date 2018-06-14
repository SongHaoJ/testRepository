package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbBiaojuexpresstype implements Serializable {
    private Integer id;

    private Integer status;

    private Integer supplierid;

    private String cantrack;

    private String calcvolume;

    private BigDecimal maxweight;

    private BigDecimal maxlength;

    private BigDecimal maxwidth;

    private BigDecimal maxheight;

    private Integer allowbattary;

    private Integer allowreturn;

    private String timelastmodified;

    private Integer page;

    private Short openflag;

    private Date opertime;

    private String name;

    private String suppliername;

    private String channeltype;

    private String extendfields;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

    private String field6;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getCantrack() {
        return cantrack;
    }

    public void setCantrack(String cantrack) {
        this.cantrack = cantrack == null ? null : cantrack.trim();
    }

    public String getCalcvolume() {
        return calcvolume;
    }

    public void setCalcvolume(String calcvolume) {
        this.calcvolume = calcvolume == null ? null : calcvolume.trim();
    }

    public BigDecimal getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(BigDecimal maxweight) {
        this.maxweight = maxweight;
    }

    public BigDecimal getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(BigDecimal maxlength) {
        this.maxlength = maxlength;
    }

    public BigDecimal getMaxwidth() {
        return maxwidth;
    }

    public void setMaxwidth(BigDecimal maxwidth) {
        this.maxwidth = maxwidth;
    }

    public BigDecimal getMaxheight() {
        return maxheight;
    }

    public void setMaxheight(BigDecimal maxheight) {
        this.maxheight = maxheight;
    }

    public Integer getAllowbattary() {
        return allowbattary;
    }

    public void setAllowbattary(Integer allowbattary) {
        this.allowbattary = allowbattary;
    }

    public Integer getAllowreturn() {
        return allowreturn;
    }

    public void setAllowreturn(Integer allowreturn) {
        this.allowreturn = allowreturn;
    }

    public String getTimelastmodified() {
        return timelastmodified;
    }

    public void setTimelastmodified(String timelastmodified) {
        this.timelastmodified = timelastmodified == null ? null : timelastmodified.trim();
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Short getOpenflag() {
        return openflag;
    }

    public void setOpenflag(Short openflag) {
        this.openflag = openflag;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getChanneltype() {
        return channeltype;
    }

    public void setChanneltype(String channeltype) {
        this.channeltype = channeltype == null ? null : channeltype.trim();
    }

    public String getExtendfields() {
        return extendfields;
    }

    public void setExtendfields(String extendfields) {
        this.extendfields = extendfields == null ? null : extendfields.trim();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6 == null ? null : field6.trim();
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
        DbBiaojuexpresstype other = (DbBiaojuexpresstype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSupplierid() == null ? other.getSupplierid() == null : this.getSupplierid().equals(other.getSupplierid()))
            && (this.getCantrack() == null ? other.getCantrack() == null : this.getCantrack().equals(other.getCantrack()))
            && (this.getCalcvolume() == null ? other.getCalcvolume() == null : this.getCalcvolume().equals(other.getCalcvolume()))
            && (this.getMaxweight() == null ? other.getMaxweight() == null : this.getMaxweight().equals(other.getMaxweight()))
            && (this.getMaxlength() == null ? other.getMaxlength() == null : this.getMaxlength().equals(other.getMaxlength()))
            && (this.getMaxwidth() == null ? other.getMaxwidth() == null : this.getMaxwidth().equals(other.getMaxwidth()))
            && (this.getMaxheight() == null ? other.getMaxheight() == null : this.getMaxheight().equals(other.getMaxheight()))
            && (this.getAllowbattary() == null ? other.getAllowbattary() == null : this.getAllowbattary().equals(other.getAllowbattary()))
            && (this.getAllowreturn() == null ? other.getAllowreturn() == null : this.getAllowreturn().equals(other.getAllowreturn()))
            && (this.getTimelastmodified() == null ? other.getTimelastmodified() == null : this.getTimelastmodified().equals(other.getTimelastmodified()))
            && (this.getPage() == null ? other.getPage() == null : this.getPage().equals(other.getPage()))
            && (this.getOpenflag() == null ? other.getOpenflag() == null : this.getOpenflag().equals(other.getOpenflag()))
            && (this.getOpertime() == null ? other.getOpertime() == null : this.getOpertime().equals(other.getOpertime()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSuppliername() == null ? other.getSuppliername() == null : this.getSuppliername().equals(other.getSuppliername()))
            && (this.getChanneltype() == null ? other.getChanneltype() == null : this.getChanneltype().equals(other.getChanneltype()))
            && (this.getExtendfields() == null ? other.getExtendfields() == null : this.getExtendfields().equals(other.getExtendfields()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getField4() == null ? other.getField4() == null : this.getField4().equals(other.getField4()))
            && (this.getField5() == null ? other.getField5() == null : this.getField5().equals(other.getField5()))
            && (this.getField6() == null ? other.getField6() == null : this.getField6().equals(other.getField6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSupplierid() == null) ? 0 : getSupplierid().hashCode());
        result = prime * result + ((getCantrack() == null) ? 0 : getCantrack().hashCode());
        result = prime * result + ((getCalcvolume() == null) ? 0 : getCalcvolume().hashCode());
        result = prime * result + ((getMaxweight() == null) ? 0 : getMaxweight().hashCode());
        result = prime * result + ((getMaxlength() == null) ? 0 : getMaxlength().hashCode());
        result = prime * result + ((getMaxwidth() == null) ? 0 : getMaxwidth().hashCode());
        result = prime * result + ((getMaxheight() == null) ? 0 : getMaxheight().hashCode());
        result = prime * result + ((getAllowbattary() == null) ? 0 : getAllowbattary().hashCode());
        result = prime * result + ((getAllowreturn() == null) ? 0 : getAllowreturn().hashCode());
        result = prime * result + ((getTimelastmodified() == null) ? 0 : getTimelastmodified().hashCode());
        result = prime * result + ((getPage() == null) ? 0 : getPage().hashCode());
        result = prime * result + ((getOpenflag() == null) ? 0 : getOpenflag().hashCode());
        result = prime * result + ((getOpertime() == null) ? 0 : getOpertime().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSuppliername() == null) ? 0 : getSuppliername().hashCode());
        result = prime * result + ((getChanneltype() == null) ? 0 : getChanneltype().hashCode());
        result = prime * result + ((getExtendfields() == null) ? 0 : getExtendfields().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getField4() == null) ? 0 : getField4().hashCode());
        result = prime * result + ((getField5() == null) ? 0 : getField5().hashCode());
        result = prime * result + ((getField6() == null) ? 0 : getField6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", cantrack=").append(cantrack);
        sb.append(", calcvolume=").append(calcvolume);
        sb.append(", maxweight=").append(maxweight);
        sb.append(", maxlength=").append(maxlength);
        sb.append(", maxwidth=").append(maxwidth);
        sb.append(", maxheight=").append(maxheight);
        sb.append(", allowbattary=").append(allowbattary);
        sb.append(", allowreturn=").append(allowreturn);
        sb.append(", timelastmodified=").append(timelastmodified);
        sb.append(", page=").append(page);
        sb.append(", openflag=").append(openflag);
        sb.append(", opertime=").append(opertime);
        sb.append(", name=").append(name);
        sb.append(", suppliername=").append(suppliername);
        sb.append(", channeltype=").append(channeltype);
        sb.append(", extendfields=").append(extendfields);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append(", field6=").append(field6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}