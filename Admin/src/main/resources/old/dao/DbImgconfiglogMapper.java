package com.bean.dao;

import com.bean.model.DbImgconfiglog;

public interface DbImgconfiglogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbImgconfiglog record);

    int insertSelective(DbImgconfiglog record);

    DbImgconfiglog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbImgconfiglog record);

    int updateByPrimaryKeyWithBLOBs(DbImgconfiglog record);

    int updateByPrimaryKey(DbImgconfiglog record);
}