package com.bean.dao;

import com.bean.model.DbCneseller;

public interface DbCnesellerMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCneseller record);

    int insertSelective(DbCneseller record);

    DbCneseller selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCneseller record);

    int updateByPrimaryKeyWithBLOBs(DbCneseller record);

    int updateByPrimaryKey(DbCneseller record);
}