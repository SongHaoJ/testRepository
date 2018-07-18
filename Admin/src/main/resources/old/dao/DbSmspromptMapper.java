package com.bean.dao;

import com.bean.model.DbSmsprompt;

public interface DbSmspromptMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSmsprompt record);

    int insertSelective(DbSmsprompt record);

    DbSmsprompt selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSmsprompt record);

    int updateByPrimaryKeyWithBLOBs(DbSmsprompt record);

    int updateByPrimaryKey(DbSmsprompt record);
}