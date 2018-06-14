package com.bean.dao;

import com.bean.model.DbZhyexpress;
import java.math.BigDecimal;

public interface DbZhyexpressMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbZhyexpress record);

    int insertSelective(DbZhyexpress record);

    DbZhyexpress selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbZhyexpress record);

    int updateByPrimaryKeyWithBLOBs(DbZhyexpress record);

    int updateByPrimaryKey(DbZhyexpress record);
}