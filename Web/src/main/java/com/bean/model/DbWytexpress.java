package com.bean.model;

import java.io.Serializable;

public class DbWytexpress implements Serializable {
    private String deliverywayid;

    private String name;

    private String categroyid;

    private String categoryid;

    private static final long serialVersionUID = 1L;

    public String getDeliverywayid() {
        return deliverywayid;
    }

    public void setDeliverywayid(String deliverywayid) {
        this.deliverywayid = deliverywayid == null ? null : deliverywayid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategroyid() {
        return categroyid;
    }

    public void setCategroyid(String categroyid) {
        this.categroyid = categroyid == null ? null : categroyid.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
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
        DbWytexpress other = (DbWytexpress) that;
        return (this.getDeliverywayid() == null ? other.getDeliverywayid() == null : this.getDeliverywayid().equals(other.getDeliverywayid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCategroyid() == null ? other.getCategroyid() == null : this.getCategroyid().equals(other.getCategroyid()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeliverywayid() == null) ? 0 : getDeliverywayid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategroyid() == null) ? 0 : getCategroyid().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deliverywayid=").append(deliverywayid);
        sb.append(", name=").append(name);
        sb.append(", categroyid=").append(categroyid);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}