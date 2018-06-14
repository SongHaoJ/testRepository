package com.bean.dao;

import com.bean.model.DbDeletemessagelog;

public interface DbDeletemessagelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbDeletemessagelog record);

    int insertSelective(DbDeletemessagelog record);

    DbDeletemessagelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbDeletemessagelog record);

    int updateByPrimaryKeyWithBLOBs(DbDeletemessagelog record);

    int updateByPrimaryKey(DbDeletemessagelog record);
}