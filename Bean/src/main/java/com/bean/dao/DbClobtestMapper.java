package com.bean.dao;

import com.bean.model.DbClobtest;

public interface DbClobtestMapper {
    int deleteByPrimaryKey(String cid);

    int insert(DbClobtest record);

    int insertSelective(DbClobtest record);

    DbClobtest selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(DbClobtest record);

    int updateByPrimaryKeyWithBLOBs(DbClobtest record);
}