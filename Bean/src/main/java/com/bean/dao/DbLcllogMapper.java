package com.bean.dao;

import com.bean.model.DbLcllog;
import java.math.BigDecimal;

public interface DbLcllogMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbLcllog record);

    int insertSelective(DbLcllog record);

    DbLcllog selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbLcllog record);

    int updateByPrimaryKeyWithBLOBs(DbLcllog record);

    int updateByPrimaryKey(DbLcllog record);
}