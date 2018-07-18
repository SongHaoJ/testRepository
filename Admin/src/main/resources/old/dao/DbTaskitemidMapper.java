package com.bean.dao;

import com.bean.model.DbTaskitemid;

public interface DbTaskitemidMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTaskitemid record);

    int insertSelective(DbTaskitemid record);

    DbTaskitemid selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTaskitemid record);

    int updateByPrimaryKeyWithBLOBs(DbTaskitemid record);

    int updateByPrimaryKey(DbTaskitemid record);
}