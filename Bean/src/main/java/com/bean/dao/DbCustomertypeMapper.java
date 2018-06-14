package com.bean.dao;

import com.bean.model.DbCustomertype;
import java.math.BigDecimal;

public interface DbCustomertypeMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbCustomertype record);

    int insertSelective(DbCustomertype record);

    DbCustomertype selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbCustomertype record);

    int updateByPrimaryKey(DbCustomertype record);
}