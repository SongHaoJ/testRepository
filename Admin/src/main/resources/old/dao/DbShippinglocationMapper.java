package com.bean.dao;

import com.bean.model.DbShippinglocation;
import java.math.BigDecimal;

public interface DbShippinglocationMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbShippinglocation record);

    int insertSelective(DbShippinglocation record);

    DbShippinglocation selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbShippinglocation record);

    int updateByPrimaryKey(DbShippinglocation record);
}