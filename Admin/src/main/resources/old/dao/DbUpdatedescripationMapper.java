package com.bean.dao;

import com.bean.model.DbUpdatedescripation;
import java.math.BigDecimal;

public interface DbUpdatedescripationMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbUpdatedescripation record);

    int insertSelective(DbUpdatedescripation record);

    DbUpdatedescripation selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbUpdatedescripation record);

    int updateByPrimaryKeyWithBLOBs(DbUpdatedescripation record);

    int updateByPrimaryKey(DbUpdatedescripation record);
}