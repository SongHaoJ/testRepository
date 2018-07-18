package com.bean.dao;

import com.bean.model.DbMoban;

public interface DbMobanMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMoban record);

    int insertSelective(DbMoban record);

    DbMoban selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMoban record);

    int updateByPrimaryKeyWithBLOBs(DbMoban record);

    int updateByPrimaryKey(DbMoban record);
}