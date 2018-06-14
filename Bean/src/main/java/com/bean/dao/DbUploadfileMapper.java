package com.bean.dao;

import com.bean.model.DbUploadfile;

public interface DbUploadfileMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbUploadfile record);

    int insertSelective(DbUploadfile record);

    DbUploadfile selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbUploadfile record);

    int updateByPrimaryKeyWithBLOBs(DbUploadfile record);

    int updateByPrimaryKey(DbUploadfile record);
}