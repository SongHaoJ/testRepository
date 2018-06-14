package com.bean.dao;

import com.bean.model.DbAmazonsell;

public interface DbAmazonsellMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbAmazonsell record);

    int insertSelective(DbAmazonsell record);

    DbAmazonsell selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbAmazonsell record);

    int updateByPrimaryKeyWithBLOBs(DbAmazonsell record);

    int updateByPrimaryKey(DbAmazonsell record);
}