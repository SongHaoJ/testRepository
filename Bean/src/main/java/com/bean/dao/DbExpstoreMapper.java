package com.bean.dao;

import com.bean.model.DbExpstore;
import java.math.BigDecimal;

public interface DbExpstoreMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbExpstore record);

    int insertSelective(DbExpstore record);

    DbExpstore selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbExpstore record);

    int updateByPrimaryKeyWithBLOBs(DbExpstore record);

    int updateByPrimaryKey(DbExpstore record);
}