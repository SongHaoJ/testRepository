package com.bean.dao;

import com.bean.model.DbArea1;

public interface DbArea1Mapper {
    int deleteByPrimaryKey(String area);

    int insert(DbArea1 record);

    int insertSelective(DbArea1 record);

    DbArea1 selectByPrimaryKey(String area);

    int updateByPrimaryKeySelective(DbArea1 record);

    int updateByPrimaryKey(DbArea1 record);
}