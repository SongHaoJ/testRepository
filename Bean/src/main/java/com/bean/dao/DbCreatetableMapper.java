package com.bean.dao;

import com.bean.model.DbCreatetable;
import java.math.BigDecimal;

public interface DbCreatetableMapper {
    int deleteByPrimaryKey(BigDecimal lastruntime);

    int insert(DbCreatetable record);

    int insertSelective(DbCreatetable record);
}