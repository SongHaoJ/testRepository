package com.bean.dao;

import com.bean.model.DbSpaypal;

public interface DbSpaypalMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSpaypal record);

    int insertSelective(DbSpaypal record);

    DbSpaypal selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSpaypal record);

    int updateByPrimaryKeyWithBLOBs(DbSpaypal record);

    int updateByPrimaryKey(DbSpaypal record);
}