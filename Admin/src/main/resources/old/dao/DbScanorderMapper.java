package com.bean.dao;

import com.bean.model.DbScanorder;

public interface DbScanorderMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbScanorder record);

    int insertSelective(DbScanorder record);

    DbScanorder selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbScanorder record);

    int updateByPrimaryKeyWithBLOBs(DbScanorder record);

    int updateByPrimaryKey(DbScanorder record);
}