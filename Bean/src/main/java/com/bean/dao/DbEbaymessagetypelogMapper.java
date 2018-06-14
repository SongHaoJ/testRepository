package com.bean.dao;

import com.bean.model.DbEbaymessagetypelog;

public interface DbEbaymessagetypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagetypelog record);

    int insertSelective(DbEbaymessagetypelog record);

    DbEbaymessagetypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagetypelog record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagetypelog record);

    int updateByPrimaryKey(DbEbaymessagetypelog record);
}