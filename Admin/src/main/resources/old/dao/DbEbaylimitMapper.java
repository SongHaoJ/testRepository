package com.bean.dao;

import com.bean.model.DbEbaylimit;
import java.math.BigDecimal;

public interface DbEbaylimitMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbaylimit record);

    int insertSelective(DbEbaylimit record);

    DbEbaylimit selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbaylimit record);

    int updateByPrimaryKey(DbEbaylimit record);
}