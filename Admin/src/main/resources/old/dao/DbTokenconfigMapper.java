package com.bean.dao;

import com.bean.model.DbTokenconfig;

public interface DbTokenconfigMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTokenconfig record);

    int insertSelective(DbTokenconfig record);

    DbTokenconfig selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTokenconfig record);

    int updateByPrimaryKeyWithBLOBs(DbTokenconfig record);

    int updateByPrimaryKey(DbTokenconfig record);
}