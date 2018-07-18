package com.bean.dao;

import com.bean.model.DbShoppingpics;
import java.math.BigDecimal;

public interface DbShoppingpicsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbShoppingpics record);

    int insertSelective(DbShoppingpics record);

    DbShoppingpics selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbShoppingpics record);

    int updateByPrimaryKeyWithBLOBs(DbShoppingpics record);

    int updateByPrimaryKey(DbShoppingpics record);
}