package com.bean.dao;

import com.bean.model.DbYwuser;

public interface DbYwuserMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbYwuser record);

    int insertSelective(DbYwuser record);

    DbYwuser selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbYwuser record);

    int updateByPrimaryKeyWithBLOBs(DbYwuser record);

    int updateByPrimaryKey(DbYwuser record);
}