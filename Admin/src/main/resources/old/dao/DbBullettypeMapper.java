package com.bean.dao;

import com.bean.model.DbBullettype;
import java.math.BigDecimal;

public interface DbBullettypeMapper {
    int deleteByPrimaryKey(BigDecimal bullettype);

    int insert(DbBullettype record);

    int insertSelective(DbBullettype record);

    DbBullettype selectByPrimaryKey(BigDecimal bullettype);

    int updateByPrimaryKeySelective(DbBullettype record);

    int updateByPrimaryKeyWithBLOBs(DbBullettype record);
}