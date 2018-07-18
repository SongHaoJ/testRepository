package com.bean.dao;

import com.bean.model.DbTaskcategory;

public interface DbTaskcategoryMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTaskcategory record);

    int insertSelective(DbTaskcategory record);

    DbTaskcategory selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTaskcategory record);

    int updateByPrimaryKeyWithBLOBs(DbTaskcategory record);

    int updateByPrimaryKey(DbTaskcategory record);
}