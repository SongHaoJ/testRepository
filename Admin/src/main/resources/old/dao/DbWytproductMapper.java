package com.bean.dao;

import com.bean.model.DbWytproduct;

public interface DbWytproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbWytproduct record);

    int insertSelective(DbWytproduct record);

    DbWytproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbWytproduct record);

    int updateByPrimaryKeyWithBLOBs(DbWytproduct record);

    int updateByPrimaryKey(DbWytproduct record);
}