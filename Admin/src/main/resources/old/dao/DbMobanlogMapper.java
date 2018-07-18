package com.bean.dao;

import com.bean.model.DbMobanlog;

public interface DbMobanlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMobanlog record);

    int insertSelective(DbMobanlog record);

    DbMobanlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMobanlog record);

    int updateByPrimaryKeyWithBLOBs(DbMobanlog record);

    int updateByPrimaryKey(DbMobanlog record);
}