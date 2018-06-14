package com.bean.dao;

import com.bean.model.DbBanproduct;

public interface DbBanproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBanproduct record);

    int insertSelective(DbBanproduct record);

    DbBanproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBanproduct record);

    int updateByPrimaryKeyWithBLOBs(DbBanproduct record);

    int updateByPrimaryKey(DbBanproduct record);
}