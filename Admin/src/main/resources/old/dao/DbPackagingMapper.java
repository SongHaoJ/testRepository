package com.bean.dao;

import com.bean.model.DbPackaging;

public interface DbPackagingMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPackaging record);

    int insertSelective(DbPackaging record);

    DbPackaging selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPackaging record);

    int updateByPrimaryKeyWithBLOBs(DbPackaging record);

    int updateByPrimaryKey(DbPackaging record);
}