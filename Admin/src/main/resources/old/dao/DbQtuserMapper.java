package com.bean.dao;

import com.bean.model.DbQtuser;

public interface DbQtuserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(DbQtuser record);

    int insertSelective(DbQtuser record);

    DbQtuser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(DbQtuser record);

    int updateByPrimaryKeyWithBLOBs(DbQtuser record);

    int updateByPrimaryKey(DbQtuser record);
}