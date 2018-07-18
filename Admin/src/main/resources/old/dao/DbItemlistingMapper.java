package com.bean.dao;

import com.bean.model.DbItemlisting;

public interface DbItemlistingMapper {
    int deleteByPrimaryKey(String itemid);

    int insert(DbItemlisting record);

    int insertSelective(DbItemlisting record);

    DbItemlisting selectByPrimaryKey(String itemid);

    int updateByPrimaryKeySelective(DbItemlisting record);

    int updateByPrimaryKeyWithBLOBs(DbItemlisting record);
}