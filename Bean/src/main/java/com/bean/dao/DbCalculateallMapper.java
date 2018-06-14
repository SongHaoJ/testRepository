package com.bean.dao;

import com.bean.model.DbCalculateall;
import java.math.BigDecimal;

public interface DbCalculateallMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbCalculateall record);

    int insertSelective(DbCalculateall record);

    DbCalculateall selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbCalculateall record);

    int updateByPrimaryKey(DbCalculateall record);
}