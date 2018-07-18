package com.bean.dao;

import com.bean.model.DbItemidspc;

public interface DbItemidspcMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbItemidspc record);

    int insertSelective(DbItemidspc record);

    DbItemidspc selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbItemidspc record);

    int updateByPrimaryKeyWithBLOBs(DbItemidspc record);

    int updateByPrimaryKey(DbItemidspc record);
}