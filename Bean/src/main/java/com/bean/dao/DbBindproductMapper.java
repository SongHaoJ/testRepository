package com.bean.dao;

import com.bean.model.DbBindproduct;

public interface DbBindproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBindproduct record);

    int insertSelective(DbBindproduct record);

    DbBindproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBindproduct record);

    int updateByPrimaryKeyWithBLOBs(DbBindproduct record);

    int updateByPrimaryKey(DbBindproduct record);
}