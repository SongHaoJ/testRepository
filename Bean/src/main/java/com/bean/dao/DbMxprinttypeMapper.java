package com.bean.dao;

import com.bean.model.DbMxprinttype;

public interface DbMxprinttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbMxprinttype record);

    int insertSelective(DbMxprinttype record);

    DbMxprinttype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbMxprinttype record);

    int updateByPrimaryKey(DbMxprinttype record);
}