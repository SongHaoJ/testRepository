package com.bean.dao;

import com.bean.model.DbMytool;
import java.math.BigDecimal;

public interface DbMytoolMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbMytool record);

    int insertSelective(DbMytool record);

    DbMytool selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbMytool record);

    int updateByPrimaryKeyWithBLOBs(DbMytool record);

    int updateByPrimaryKey(DbMytool record);
}