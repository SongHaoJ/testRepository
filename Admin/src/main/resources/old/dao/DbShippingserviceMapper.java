package com.bean.dao;

import com.bean.model.DbShippingservice;
import java.math.BigDecimal;

public interface DbShippingserviceMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbShippingservice record);

    int insertSelective(DbShippingservice record);

    DbShippingservice selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbShippingservice record);

    int updateByPrimaryKey(DbShippingservice record);
}