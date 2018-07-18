package com.bean.dao;

import com.bean.model.DbReturnreason;
import java.math.BigDecimal;

public interface DbReturnreasonMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbReturnreason record);

    int insertSelective(DbReturnreason record);

    DbReturnreason selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbReturnreason record);

    int updateByPrimaryKeyWithBLOBs(DbReturnreason record);

    int updateByPrimaryKey(DbReturnreason record);
}