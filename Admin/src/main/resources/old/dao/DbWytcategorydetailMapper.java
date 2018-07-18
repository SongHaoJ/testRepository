package com.bean.dao;

import com.bean.model.DbWytcategorydetail;

public interface DbWytcategorydetailMapper {
    int deleteByPrimaryKey(String mwarehouseid);

    int insert(DbWytcategorydetail record);

    int insertSelective(DbWytcategorydetail record);

    DbWytcategorydetail selectByPrimaryKey(String mwarehouseid);

    int updateByPrimaryKeySelective(DbWytcategorydetail record);

    int updateByPrimaryKeyWithBLOBs(DbWytcategorydetail record);

    int updateByPrimaryKey(DbWytcategorydetail record);
}