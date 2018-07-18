package com.bean.dao;

import com.bean.model.DbProductforsell;

public interface DbProductforsellMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductforsell record);

    int insertSelective(DbProductforsell record);

    DbProductforsell selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductforsell record);

    int updateByPrimaryKeyWithBLOBs(DbProductforsell record);

    int updateByPrimaryKey(DbProductforsell record);
}