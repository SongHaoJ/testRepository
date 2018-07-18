package com.bean.dao;

import com.bean.model.DbFindingtask;

public interface DbFindingtaskMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFindingtask record);

    int insertSelective(DbFindingtask record);

    DbFindingtask selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFindingtask record);

    int updateByPrimaryKeyWithBLOBs(DbFindingtask record);

    int updateByPrimaryKey(DbFindingtask record);
}