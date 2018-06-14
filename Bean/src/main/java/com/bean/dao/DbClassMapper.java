package com.bean.dao;

import com.bean.model.DbClass;

public interface DbClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(DbClass record);

    int insertSelective(DbClass record);

    DbClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DbClass record);

    int updateByPrimaryKeyWithBLOBs(DbClass record);

    int updateByPrimaryKey(DbClass record);
}