package com.bean.dao;

import com.bean.model.DbUbiseller;

public interface DbUbisellerMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbUbiseller record);

    int insertSelective(DbUbiseller record);

    DbUbiseller selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbUbiseller record);

    int updateByPrimaryKeyWithBLOBs(DbUbiseller record);

    int updateByPrimaryKey(DbUbiseller record);
}