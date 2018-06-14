package com.bean.dao;

import com.bean.model.DbRepeatproduct;
import java.math.BigDecimal;

public interface DbRepeatproductMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbRepeatproduct record);

    int insertSelective(DbRepeatproduct record);

    DbRepeatproduct selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbRepeatproduct record);

    int updateByPrimaryKeyWithBLOBs(DbRepeatproduct record);

    int updateByPrimaryKey(DbRepeatproduct record);
}