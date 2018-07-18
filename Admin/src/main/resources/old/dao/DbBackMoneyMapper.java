package com.bean.dao;

import com.bean.model.DbBackMoney;

public interface DbBackMoneyMapper {
    int deleteByPrimaryKey(Integer sequenceid);

    int insert(DbBackMoney record);

    int insertSelective(DbBackMoney record);

    DbBackMoney selectByPrimaryKey(Integer sequenceid);

    int updateByPrimaryKeySelective(DbBackMoney record);

    int updateByPrimaryKey(DbBackMoney record);
}