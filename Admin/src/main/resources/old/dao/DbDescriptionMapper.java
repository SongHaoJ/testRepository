package com.bean.dao;

import com.bean.model.DbDescription;
import java.math.BigDecimal;

public interface DbDescriptionMapper {
    int deleteByPrimaryKey(BigDecimal itemid);

    int insert(DbDescription record);

    int insertSelective(DbDescription record);

    DbDescription selectByPrimaryKey(BigDecimal itemid);

    int updateByPrimaryKeySelective(DbDescription record);

    int updateByPrimaryKeyWithBLOBs(DbDescription record);

    int updateByPrimaryKey(DbDescription record);
}