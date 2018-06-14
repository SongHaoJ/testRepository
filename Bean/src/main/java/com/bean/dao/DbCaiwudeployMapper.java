package com.bean.dao;

import com.bean.model.DbCaiwudeploy;

public interface DbCaiwudeployMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCaiwudeploy record);

    int insertSelective(DbCaiwudeploy record);

    DbCaiwudeploy selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCaiwudeploy record);

    int updateByPrimaryKey(DbCaiwudeploy record);
}