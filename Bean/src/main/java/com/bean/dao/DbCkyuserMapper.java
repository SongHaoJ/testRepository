package com.bean.dao;

import com.bean.model.DbCkyuser;

public interface DbCkyuserMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCkyuser record);

    int insertSelective(DbCkyuser record);

    DbCkyuser selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCkyuser record);

    int updateByPrimaryKeyWithBLOBs(DbCkyuser record);

    int updateByPrimaryKey(DbCkyuser record);
}