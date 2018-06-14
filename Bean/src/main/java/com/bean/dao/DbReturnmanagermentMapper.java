package com.bean.dao;

import com.bean.model.DbReturnmanagerment;
import java.math.BigDecimal;

public interface DbReturnmanagermentMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbReturnmanagerment record);

    int insertSelective(DbReturnmanagerment record);

    DbReturnmanagerment selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbReturnmanagerment record);

    int updateByPrimaryKeyWithBLOBs(DbReturnmanagerment record);

    int updateByPrimaryKey(DbReturnmanagerment record);
}