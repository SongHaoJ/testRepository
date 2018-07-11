package com.bean.dao;

import com.bean.model.DbExpressconfig;

import java.util.List;

public interface DbExpressconfigMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DbExpressconfig record);

    int insertSelective(DbExpressconfig record);

    DbExpressconfig selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(DbExpressconfig record);

    List<DbExpressconfig> selectConfigByOrderTYpes(String ordertypes);
}