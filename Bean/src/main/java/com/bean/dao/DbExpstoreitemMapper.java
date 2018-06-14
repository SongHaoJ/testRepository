package com.bean.dao;

import com.bean.model.DbExpstoreitem;
import java.math.BigDecimal;

public interface DbExpstoreitemMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbExpstoreitem record);

    int insertSelective(DbExpstoreitem record);

    DbExpstoreitem selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbExpstoreitem record);

    int updateByPrimaryKeyWithBLOBs(DbExpstoreitem record);

    int updateByPrimaryKey(DbExpstoreitem record);
}