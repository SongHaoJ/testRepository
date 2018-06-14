package com.bean.dao;

import com.bean.model.DbTaskkeyword;

public interface DbTaskkeywordMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTaskkeyword record);

    int insertSelective(DbTaskkeyword record);

    DbTaskkeyword selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTaskkeyword record);

    int updateByPrimaryKeyWithBLOBs(DbTaskkeyword record);

    int updateByPrimaryKey(DbTaskkeyword record);
}