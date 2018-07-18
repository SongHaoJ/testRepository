package com.bean.dao;

import com.bean.model.DbCalprice;

public interface DbCalpriceMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalprice record);

    int insertSelective(DbCalprice record);

    DbCalprice selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalprice record);

    int updateByPrimaryKey(DbCalprice record);
}