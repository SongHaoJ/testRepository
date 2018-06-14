package com.bean.dao;

import com.bean.model.DbProduct;

public interface DbProductMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProduct record);

    int insertSelective(DbProduct record);

    DbProduct selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProduct record);

    int updateByPrimaryKeyWithBLOBs(DbProduct record);

    int updateByPrimaryKey(DbProduct record);
}