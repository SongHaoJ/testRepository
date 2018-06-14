package com.bean.dao;

import com.bean.model.DbCkycountry;

public interface DbCkycountryMapper {
    int insert(DbCkycountry record);

    int insertSelective(DbCkycountry record);
}