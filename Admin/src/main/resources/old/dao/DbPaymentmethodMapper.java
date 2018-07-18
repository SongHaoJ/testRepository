package com.bean.dao;

import com.bean.model.DbPaymentmethod;
import java.math.BigDecimal;

public interface DbPaymentmethodMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbPaymentmethod record);

    int insertSelective(DbPaymentmethod record);

    DbPaymentmethod selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbPaymentmethod record);

    int updateByPrimaryKey(DbPaymentmethod record);
}