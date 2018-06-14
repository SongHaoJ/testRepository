package com.bean.dao;

import com.bean.model.DbQtsku;

public interface DbQtskuMapper {
    int deleteByPrimaryKey(String qtsku);

    int insert(DbQtsku record);

    int insertSelective(DbQtsku record);

    DbQtsku selectByPrimaryKey(String qtsku);

    int updateByPrimaryKeySelective(DbQtsku record);

    int updateByPrimaryKey(DbQtsku record);
}