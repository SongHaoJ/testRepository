package com.bean.dao;

import com.bean.model.DbWytuser;

public interface DbWytuserMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbWytuser record);

    int insertSelective(DbWytuser record);

    DbWytuser selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbWytuser record);

    int updateByPrimaryKeyWithBLOBs(DbWytuser record);

    int updateByPrimaryKey(DbWytuser record);
}