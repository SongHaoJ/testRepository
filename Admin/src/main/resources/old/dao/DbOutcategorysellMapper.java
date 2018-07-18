package com.bean.dao;

import com.bean.model.DbOutcategorysell;

public interface DbOutcategorysellMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbOutcategorysell record);

    int insertSelective(DbOutcategorysell record);

    DbOutcategorysell selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbOutcategorysell record);

    int updateByPrimaryKeyWithBLOBs(DbOutcategorysell record);

    int updateByPrimaryKey(DbOutcategorysell record);
}