package com.bean.dao;

import com.bean.model.DbExpresstypelog;

public interface DbExpresstypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpresstypelog record);

    int insertSelective(DbExpresstypelog record);

    DbExpresstypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpresstypelog record);

    int updateByPrimaryKeyWithBLOBs(DbExpresstypelog record);

    int updateByPrimaryKey(DbExpresstypelog record);
}