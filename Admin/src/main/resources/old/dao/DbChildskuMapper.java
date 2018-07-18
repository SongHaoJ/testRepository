package com.bean.dao;

import com.bean.model.DbChildsku;
import java.math.BigDecimal;

public interface DbChildskuMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbChildsku record);

    int insertSelective(DbChildsku record);

    DbChildsku selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbChildsku record);

    int updateByPrimaryKey(DbChildsku record);
}