package com.bean.dao;

import com.bean.model.DbEbayhighbbe;
import java.math.BigDecimal;

public interface DbEbayhighbbeMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbayhighbbe record);

    int insertSelective(DbEbayhighbbe record);

    DbEbayhighbbe selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbayhighbbe record);

    int updateByPrimaryKey(DbEbayhighbbe record);
}