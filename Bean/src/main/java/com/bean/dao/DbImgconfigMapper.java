package com.bean.dao;

import com.bean.model.DbImgconfig;

public interface DbImgconfigMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbImgconfig record);

    int insertSelective(DbImgconfig record);

    DbImgconfig selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbImgconfig record);

    int updateByPrimaryKeyWithBLOBs(DbImgconfig record);

    int updateByPrimaryKey(DbImgconfig record);
}