package com.bean.dao;

import com.bean.model.DbSmspromptlog;

public interface DbSmspromptlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSmspromptlog record);

    int insertSelective(DbSmspromptlog record);

    DbSmspromptlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSmspromptlog record);

    int updateByPrimaryKeyWithBLOBs(DbSmspromptlog record);

    int updateByPrimaryKey(DbSmspromptlog record);
}