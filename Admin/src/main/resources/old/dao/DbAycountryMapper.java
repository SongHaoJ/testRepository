package com.bean.dao;

import com.bean.model.DbAycountry;

public interface DbAycountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbAycountry record);

    int insertSelective(DbAycountry record);

    DbAycountry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbAycountry record);

    int updateByPrimaryKey(DbAycountry record);
}