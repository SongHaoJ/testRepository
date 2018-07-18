package com.bean.dao;

import com.bean.model.DbEbaytoken;

public interface DbEbaytokenMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaytoken record);

    int insertSelective(DbEbaytoken record);

    DbEbaytoken selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaytoken record);

    int updateByPrimaryKeyWithBLOBs(DbEbaytoken record);

    int updateByPrimaryKey(DbEbaytoken record);
}