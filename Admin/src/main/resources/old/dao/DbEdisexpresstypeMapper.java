package com.bean.dao;

import com.bean.model.DbEdisexpresstype;

public interface DbEdisexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbEdisexpresstype record);

    int insertSelective(DbEdisexpresstype record);

    DbEdisexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbEdisexpresstype record);

    int deleteAll();
}