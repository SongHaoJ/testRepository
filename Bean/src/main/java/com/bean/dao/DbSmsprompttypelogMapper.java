package com.bean.dao;

import com.bean.model.DbSmsprompttypelog;

public interface DbSmsprompttypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSmsprompttypelog record);

    int insertSelective(DbSmsprompttypelog record);

    DbSmsprompttypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSmsprompttypelog record);

    int updateByPrimaryKeyWithBLOBs(DbSmsprompttypelog record);

    int updateByPrimaryKey(DbSmsprompttypelog record);
}