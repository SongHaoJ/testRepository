package com.bean.dao;

import com.bean.model.DbEndproductOnline;

public interface DbEndproductOnlineMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEndproductOnline record);

    int insertSelective(DbEndproductOnline record);

    DbEndproductOnline selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEndproductOnline record);

    int updateByPrimaryKeyWithBLOBs(DbEndproductOnline record);

    int updateByPrimaryKey(DbEndproductOnline record);
}