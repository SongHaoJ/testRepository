package com.bean.dao;

import com.bean.model.DbItemspecifics;
import java.math.BigDecimal;

public interface DbItemspecificsMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbItemspecifics record);

    int insertSelective(DbItemspecifics record);

    DbItemspecifics selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbItemspecifics record);

    int updateByPrimaryKey(DbItemspecifics record);
}