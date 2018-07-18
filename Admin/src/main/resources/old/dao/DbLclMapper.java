package com.bean.dao;

import com.bean.model.DbLcl;
import java.math.BigDecimal;

public interface DbLclMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbLcl record);

    int insertSelective(DbLcl record);

    DbLcl selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbLcl record);

    int updateByPrimaryKeyWithBLOBs(DbLcl record);

    int updateByPrimaryKey(DbLcl record);
}