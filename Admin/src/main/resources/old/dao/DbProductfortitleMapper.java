package com.bean.dao;

import com.bean.model.DbProductfortitle;
import java.math.BigDecimal;

public interface DbProductfortitleMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProductfortitle record);

    int insertSelective(DbProductfortitle record);

    DbProductfortitle selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProductfortitle record);

    int updateByPrimaryKeyWithBLOBs(DbProductfortitle record);

    int updateByPrimaryKey(DbProductfortitle record);
}