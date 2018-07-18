package com.bean.dao;

import com.bean.model.DbPictureattribute;

public interface DbPictureattributeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPictureattribute record);

    int insertSelective(DbPictureattribute record);

    DbPictureattribute selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPictureattribute record);

    int updateByPrimaryKeyWithBLOBs(DbPictureattribute record);

    int updateByPrimaryKey(DbPictureattribute record);
}