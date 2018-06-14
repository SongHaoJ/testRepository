package com.bean.dao;

import com.bean.model.DbBoxcuser;

public interface DbBoxcuserMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBoxcuser record);

    int insertSelective(DbBoxcuser record);

    DbBoxcuser selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBoxcuser record);

    int updateByPrimaryKeyWithBLOBs(DbBoxcuser record);

    int updateByPrimaryKey(DbBoxcuser record);
}