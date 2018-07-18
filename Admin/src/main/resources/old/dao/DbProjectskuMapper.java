package com.bean.dao;

import com.bean.model.DbProjectsku;
import java.math.BigDecimal;

public interface DbProjectskuMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProjectsku record);

    int insertSelective(DbProjectsku record);

    DbProjectsku selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProjectsku record);

    int updateByPrimaryKeyWithBLOBs(DbProjectsku record);

    int updateByPrimaryKey(DbProjectsku record);
}