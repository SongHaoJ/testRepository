package com.bean.dao;

import com.bean.model.DbPaypal;

public interface DbPaypalMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPaypal record);

    int insertSelective(DbPaypal record);

    DbPaypal selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPaypal record);

    int updateByPrimaryKeyWithBLOBs(DbPaypal record);

    int updateByPrimaryKey(DbPaypal record);
}