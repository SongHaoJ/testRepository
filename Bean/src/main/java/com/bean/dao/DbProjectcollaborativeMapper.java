package com.bean.dao;

import com.bean.model.DbProjectcollaborative;
import java.math.BigDecimal;

public interface DbProjectcollaborativeMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProjectcollaborative record);

    int insertSelective(DbProjectcollaborative record);

    DbProjectcollaborative selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProjectcollaborative record);

    int updateByPrimaryKey(DbProjectcollaborative record);
}