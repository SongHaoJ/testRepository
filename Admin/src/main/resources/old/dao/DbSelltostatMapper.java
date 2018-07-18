package com.bean.dao;

import com.bean.model.DbSelltostat;

public interface DbSelltostatMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbSelltostat record);

    int insertSelective(DbSelltostat record);

    DbSelltostat selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbSelltostat record);

    int updateByPrimaryKeyWithBLOBs(DbSelltostat record);

    int updateByPrimaryKey(DbSelltostat record);
}