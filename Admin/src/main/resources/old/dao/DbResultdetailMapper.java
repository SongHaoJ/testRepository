package com.bean.dao;

import com.bean.model.DbResultdetail;

public interface DbResultdetailMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbResultdetail record);

    int insertSelective(DbResultdetail record);

    DbResultdetail selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbResultdetail record);

    int updateByPrimaryKeyWithBLOBs(DbResultdetail record);

    int updateByPrimaryKey(DbResultdetail record);
}