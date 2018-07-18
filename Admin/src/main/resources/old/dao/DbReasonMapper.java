package com.bean.dao;

import com.bean.model.DbReason;

public interface DbReasonMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbReason record);

    int insertSelective(DbReason record);

    DbReason selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbReason record);

    int updateByPrimaryKeyWithBLOBs(DbReason record);
}