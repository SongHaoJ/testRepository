package com.bean.dao;

import com.bean.model.DbStoragelog;

public interface DbStoragelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbStoragelog record);

    int insertSelective(DbStoragelog record);

    DbStoragelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbStoragelog record);

    int updateByPrimaryKeyWithBLOBs(DbStoragelog record);

    int updateByPrimaryKey(DbStoragelog record);
}