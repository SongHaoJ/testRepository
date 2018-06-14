package com.bean.dao;

import com.bean.model.DbItemresult;

public interface DbItemresultMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbItemresult record);

    int insertSelective(DbItemresult record);

    DbItemresult selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbItemresult record);

    int updateByPrimaryKeyWithBLOBs(DbItemresult record);

    int updateByPrimaryKey(DbItemresult record);
}