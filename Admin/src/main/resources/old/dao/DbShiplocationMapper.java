package com.bean.dao;

import com.bean.model.DbShiplocation;
import java.math.BigDecimal;

public interface DbShiplocationMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbShiplocation record);

    int insertSelective(DbShiplocation record);

    DbShiplocation selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbShiplocation record);

    int updateByPrimaryKey(DbShiplocation record);
}