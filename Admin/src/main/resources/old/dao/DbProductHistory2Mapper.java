package com.bean.dao;

import com.bean.model.DbProductHistory2;
import java.math.BigDecimal;

public interface DbProductHistory2Mapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProductHistory2 record);

    int insertSelective(DbProductHistory2 record);

    DbProductHistory2 selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProductHistory2 record);

    int updateByPrimaryKey(DbProductHistory2 record);
}