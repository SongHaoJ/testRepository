package com.bean.dao;

import com.bean.model.DbBacknote;

public interface DbBacknoteMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbBacknote record);

    int insertSelective(DbBacknote record);

    DbBacknote selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbBacknote record);

    int updateByPrimaryKeyWithBLOBs(DbBacknote record);

    int updateByPrimaryKey(DbBacknote record);
}