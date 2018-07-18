package com.bean.dao;

import com.bean.model.DbYwerrorreason;

public interface DbYwerrorreasonMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbYwerrorreason record);

    int insertSelective(DbYwerrorreason record);

    DbYwerrorreason selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbYwerrorreason record);

    int updateByPrimaryKeyWithBLOBs(DbYwerrorreason record);
}