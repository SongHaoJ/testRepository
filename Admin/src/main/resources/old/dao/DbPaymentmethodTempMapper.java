package com.bean.dao;

import com.bean.model.DbPaymentmethodTemp;
import java.math.BigDecimal;

public interface DbPaymentmethodTempMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbPaymentmethodTemp record);

    int insertSelective(DbPaymentmethodTemp record);

    DbPaymentmethodTemp selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbPaymentmethodTemp record);

    int updateByPrimaryKey(DbPaymentmethodTemp record);
}