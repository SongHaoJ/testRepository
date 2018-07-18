package com.bean.model;

/*import com.ebay.eis.dto.responses.DirectionsResponses;*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class DbEdisexpresstype implements Serializable {
    private String sid;

    private String namecn;

    private String nameen;

    private BigDecimal maxweight;

    private BigDecimal maxtotallength;

    private BigDecimal maxlength;

    private Short supportelec;

    //是否带电，布尔，不存
    private boolean supportelecB;

    private Short incoterms;

    // 目标与起始国家字符串，存数据库，格式：from：to，from：to。。。
    private String directions;
/*
    // 目标与起始国家数组，不存数据库
    private List<DirectionsResponses> directionList;*/

    private String descriptioncn;

    private String descriptionen;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
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

    public BigDecimal getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(BigDecimal maxweight) {
        this.maxweight = maxweight;
    }

    public BigDecimal getMaxtotallength() {
        return maxtotallength;
    }

    public void setMaxtotallength(BigDecimal maxtotallength) {
        this.maxtotallength = maxtotallength;
    }

    public BigDecimal getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(BigDecimal maxlength) {
        this.maxlength = maxlength;
    }

    public Short getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(Short incoterms) {
        this.incoterms = incoterms;
    }

    public String getDescriptioncn() {
        return descriptioncn;
    }

    public void setDescriptioncn(String descriptioncn) {
        this.descriptioncn = descriptioncn == null ? null : descriptioncn.trim();
    }

    public String getDescriptionen() {
        return descriptionen;
    }

    public void setDescriptionen(String descriptionen) {
        this.descriptionen = descriptionen == null ? null : descriptionen.trim();
    }

    public Short getSupportelec() {
        return supportelec;
    }

    public void setSupportelec(short supportelec) {
        this.supportelec = supportelec;
        if (supportelec == 0) {
            this.supportelecB = false;
        } else {
            this.supportelecB = true;
        }
    }

    public boolean isSupportelecB() {
        return supportelecB;
    }

    public void setSupportelecB(boolean supportelecB) {
        this.supportelecB = supportelecB;
        if (supportelecB) {
            this.supportelec = 1;
        } else {
            this.supportelec = 0;
        }
    }

    public String getDirections() {
        return directions;
    }
/*
    public void setDirections(String directions) {
        this.directions = directions;
        this.directionList.clear();
        if (directions != null && directions.length() > 0) {
            String[] dirs = directions.split(",");
            for (String dir : dirs) {
                String[] str = dir.split(":");
                DirectionsResponses dr = new DirectionsResponses();
                dr.from(str[0]);
                dr.to(str[1]);
                directionList.add(dr);
            }
        }
    }

    public List<DirectionsResponses> getDirectionList() {
        return directionList;
    }

    public void setDirectionList(List<DirectionsResponses> directionList) {
        this.directionList = directionList;
        this.directions = "";
        if (directionList != null && directionList.size() > 0) {
            for (DirectionsResponses dr : directionList) {
                if (dr != null) {
                    directions += dr.getFrom() + ":" + dr.getTo() + ",";
                }
            }
        }
    }*/

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
        DbEdisexpresstype other = (DbEdisexpresstype) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
                && (this.getNamecn() == null ? other.getNamecn() == null : this.getNamecn().equals(other.getNamecn()))
                && (this.getNameen() == null ? other.getNameen() == null : this.getNameen().equals(other.getNameen()))
                && (this.getMaxweight() == null ? other.getMaxweight() == null : this.getMaxweight().equals(other.getMaxweight()))
                && (this.getMaxtotallength() == null ? other.getMaxtotallength() == null : this.getMaxtotallength().equals(other.getMaxtotallength()))
                && (this.getMaxlength() == null ? other.getMaxlength() == null : this.getMaxlength().equals(other.getMaxlength()))
                && (this.getSupportelec() == null ? other.getSupportelec() == null : this.getSupportelec().equals(other.getSupportelec()))
                && (this.getIncoterms() == null ? other.getIncoterms() == null : this.getIncoterms().equals(other.getIncoterms()))
                && (this.getDirections() == null ? other.getDirections() == null : this.getDirections().equals(other.getDirections()))
                && (this.getDescriptioncn() == null ? other.getDescriptioncn() == null : this.getDescriptioncn().equals(other.getDescriptioncn()))
                && (this.getDescriptionen() == null ? other.getDescriptionen() == null : this.getDescriptionen().equals(other.getDescriptionen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getNamecn() == null) ? 0 : getNamecn().hashCode());
        result = prime * result + ((getNameen() == null) ? 0 : getNameen().hashCode());
        result = prime * result + ((getMaxweight() == null) ? 0 : getMaxweight().hashCode());
        result = prime * result + ((getMaxtotallength() == null) ? 0 : getMaxtotallength().hashCode());
        result = prime * result + ((getMaxlength() == null) ? 0 : getMaxlength().hashCode());
        result = prime * result + ((getSupportelec() == null) ? 0 : getSupportelec().hashCode());
        result = prime * result + ((getIncoterms() == null) ? 0 : getIncoterms().hashCode());
        result = prime * result + ((getDirections() == null) ? 0 : getDirections().hashCode());
        result = prime * result + ((getDescriptioncn() == null) ? 0 : getDescriptioncn().hashCode());
        result = prime * result + ((getDescriptionen() == null) ? 0 : getDescriptionen().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", namecn=").append(namecn);
        sb.append(", nameen=").append(nameen);
        sb.append(", maxweight=").append(maxweight);
        sb.append(", maxtotallength=").append(maxtotallength);
        sb.append(", maxlength=").append(maxlength);
        sb.append(", supportelec=").append(supportelec);
        sb.append(", incoterms=").append(incoterms);
        sb.append(", directions=").append(directions);
        sb.append(", descriptioncn=").append(descriptioncn);
        sb.append(", descriptionen=").append(descriptionen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}