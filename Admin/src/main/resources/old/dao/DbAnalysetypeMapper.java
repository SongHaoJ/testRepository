package com.bean.dao;

import com.bean.model.DbAnalysetype;

public interface DbAnalysetypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAnalysetype record);

    int insertSelective(DbAnalysetype record);

    DbAnalysetype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAnalysetype record);

    int updateByPrimaryKeyWithBLOBs(DbAnalysetype record);

    int updateByPrimaryKey(DbAnalysetype record);
}