package com.bean.dao;

import com.bean.model.DbLocationlog;

public interface DbLocationlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLocationlog record);

    int insertSelective(DbLocationlog record);

    DbLocationlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLocationlog record);

    int updateByPrimaryKeyWithBLOBs(DbLocationlog record);

    int updateByPrimaryKey(DbLocationlog record);
}