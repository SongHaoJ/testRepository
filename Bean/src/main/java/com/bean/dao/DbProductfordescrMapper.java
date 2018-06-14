package com.bean.dao;

import com.bean.model.DbProductfordescr;
import java.math.BigDecimal;

public interface DbProductfordescrMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProductfordescr record);

    int insertSelective(DbProductfordescr record);

    DbProductfordescr selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProductfordescr record);

    int updateByPrimaryKeyWithBLOBs(DbProductfordescr record);

    int updateByPrimaryKey(DbProductfordescr record);
}