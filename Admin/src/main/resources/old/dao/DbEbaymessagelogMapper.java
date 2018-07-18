package com.bean.dao;

import com.bean.model.DbEbaymessagelog;

public interface DbEbaymessagelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagelog record);

    int insertSelective(DbEbaymessagelog record);

    DbEbaymessagelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagelog record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagelog record);

    int updateByPrimaryKey(DbEbaymessagelog record);
}