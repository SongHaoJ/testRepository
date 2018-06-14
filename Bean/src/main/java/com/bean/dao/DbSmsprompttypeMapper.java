package com.bean.dao;

import com.bean.model.DbSmsprompttype;

public interface DbSmsprompttypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSmsprompttype record);

    int insertSelective(DbSmsprompttype record);

    DbSmsprompttype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSmsprompttype record);

    int updateByPrimaryKeyWithBLOBs(DbSmsprompttype record);

    int updateByPrimaryKey(DbSmsprompttype record);
}