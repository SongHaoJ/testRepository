package com.bean.dao;

import com.bean.model.DbPictureproject;

public interface DbPictureprojectMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPictureproject record);

    int insertSelective(DbPictureproject record);

    DbPictureproject selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPictureproject record);

    int updateByPrimaryKeyWithBLOBs(DbPictureproject record);

    int updateByPrimaryKey(DbPictureproject record);
}