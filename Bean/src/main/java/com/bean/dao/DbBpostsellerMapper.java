package com.bean.dao;

import com.bean.model.DbBpostseller;
import java.math.BigDecimal;

public interface DbBpostsellerMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbBpostseller record);

    int insertSelective(DbBpostseller record);

    DbBpostseller selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbBpostseller record);

    int updateByPrimaryKey(DbBpostseller record);
}