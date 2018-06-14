package com.bean.dao;

import com.bean.model.DbIndividualexpressiddata;

public interface DbIndividualexpressiddataMapper {
    int deleteByPrimaryKey(String expressid);

    int insert(DbIndividualexpressiddata record);

    int insertSelective(DbIndividualexpressiddata record);

    DbIndividualexpressiddata selectByPrimaryKey(String expressid);

    int updateByPrimaryKeySelective(DbIndividualexpressiddata record);

    int updateByPrimaryKeyWithBLOBs(DbIndividualexpressiddata record);

    int updateByPrimaryKey(DbIndividualexpressiddata record);
}