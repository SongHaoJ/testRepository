package com.bean.dao;

import com.bean.model.DbGift;

public interface DbGiftMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbGift record);

    int insertSelective(DbGift record);

    DbGift selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbGift record);

    int updateByPrimaryKeyWithBLOBs(DbGift record);

    int updateByPrimaryKey(DbGift record);
}