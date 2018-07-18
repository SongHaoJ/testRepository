package com.bean.dao;

import com.bean.model.DbLabeldate;

public interface DbLabeldateMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLabeldate record);

    int insertSelective(DbLabeldate record);

    DbLabeldate selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLabeldate record);

    int updateByPrimaryKeyWithBLOBs(DbLabeldate record);

    int updateByPrimaryKey(DbLabeldate record);
}