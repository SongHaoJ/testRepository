package com.bean.dao;

import com.bean.model.DbTasktypelog;

public interface DbTasktypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTasktypelog record);

    int insertSelective(DbTasktypelog record);

    DbTasktypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTasktypelog record);

    int updateByPrimaryKeyWithBLOBs(DbTasktypelog record);

    int updateByPrimaryKey(DbTasktypelog record);
}