package com.bean.dao;

import com.bean.model.DbOutcategoryorder;

public interface DbOutcategoryorderMapper {
    int deleteByPrimaryKey(String ebayorderid);

    int insert(DbOutcategoryorder record);

    int insertSelective(DbOutcategoryorder record);

    DbOutcategoryorder selectByPrimaryKey(String ebayorderid);

    int updateByPrimaryKeySelective(DbOutcategoryorder record);

    int updateByPrimaryKeyWithBLOBs(DbOutcategoryorder record);

    int updateByPrimaryKey(DbOutcategoryorder record);
}