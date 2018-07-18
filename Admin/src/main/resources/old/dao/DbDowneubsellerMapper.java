package com.bean.dao;

import com.bean.model.DbDowneubseller;

public interface DbDowneubsellerMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbDowneubseller record);

    int insertSelective(DbDowneubseller record);

    DbDowneubseller selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbDowneubseller record);

    int updateByPrimaryKey(DbDowneubseller record);
}