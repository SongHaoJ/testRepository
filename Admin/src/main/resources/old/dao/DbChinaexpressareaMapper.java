package com.bean.dao;

import com.bean.model.DbChinaexpressarea;

public interface DbChinaexpressareaMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbChinaexpressarea record);

    int insertSelective(DbChinaexpressarea record);

    DbChinaexpressarea selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbChinaexpressarea record);

    int updateByPrimaryKeyWithBLOBs(DbChinaexpressarea record);

    int updateByPrimaryKey(DbChinaexpressarea record);
}