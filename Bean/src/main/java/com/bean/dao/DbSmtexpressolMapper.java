package com.bean.dao;

import com.bean.model.DbSmtexpressol;

public interface DbSmtexpressolMapper {
    int deleteByPrimaryKey(String code);

    int insert(DbSmtexpressol record);

    int insertSelective(DbSmtexpressol record);

    DbSmtexpressol selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(DbSmtexpressol record);

    int updateByPrimaryKeyWithBLOBs(DbSmtexpressol record);

    int updateByPrimaryKey(DbSmtexpressol record);
}