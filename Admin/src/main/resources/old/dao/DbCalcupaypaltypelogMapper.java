package com.bean.dao;

import com.bean.model.DbCalcupaypaltypelog;

public interface DbCalcupaypaltypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalcupaypaltypelog record);

    int insertSelective(DbCalcupaypaltypelog record);

    DbCalcupaypaltypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalcupaypaltypelog record);

    int updateByPrimaryKeyWithBLOBs(DbCalcupaypaltypelog record);

    int updateByPrimaryKey(DbCalcupaypaltypelog record);
}