package com.bean.dao;

import com.bean.model.DbExpressapiuser;
import java.math.BigDecimal;

public interface DbExpressapiuserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbExpressapiuser record);

    int insertSelective(DbExpressapiuser record);

    DbExpressapiuser selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbExpressapiuser record);

    int updateByPrimaryKeyWithBLOBs(DbExpressapiuser record);

    int updateByPrimaryKey(DbExpressapiuser record);
}