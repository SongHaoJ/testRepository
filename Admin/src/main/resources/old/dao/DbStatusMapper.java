package com.bean.dao;

import com.bean.model.DbStatus;
import java.math.BigDecimal;

public interface DbStatusMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbStatus record);

    int insertSelective(DbStatus record);

    DbStatus selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbStatus record);

    int updateByPrimaryKey(DbStatus record);
}