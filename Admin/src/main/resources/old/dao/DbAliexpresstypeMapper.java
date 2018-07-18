package com.bean.dao;

import com.bean.model.DbAliexpresstype;
import java.math.BigDecimal;

public interface DbAliexpresstypeMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbAliexpresstype record);

    int insertSelective(DbAliexpresstype record);

    DbAliexpresstype selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbAliexpresstype record);

    int updateByPrimaryKey(DbAliexpresstype record);
}