package com.bean.dao;

import com.bean.model.DbOrdertypelog;

public interface DbOrdertypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbOrdertypelog record);

    int insertSelective(DbOrdertypelog record);

    DbOrdertypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbOrdertypelog record);

    int updateByPrimaryKeyWithBLOBs(DbOrdertypelog record);

    int updateByPrimaryKey(DbOrdertypelog record);
}