package com.bean.dao;

import com.bean.model.DbSysadmin;

public interface DbSysadminMapper {
    int deleteByPrimaryKey(String oper);

    int insert(DbSysadmin record);

    int insertSelective(DbSysadmin record);

    DbSysadmin selectByPrimaryKey(String oper);

    int updateByPrimaryKeySelective(DbSysadmin record);

    int updateByPrimaryKeyWithBLOBs(DbSysadmin record);

    int updateByPrimaryKey(DbSysadmin record);
}