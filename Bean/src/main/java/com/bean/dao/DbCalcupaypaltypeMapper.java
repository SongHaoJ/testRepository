package com.bean.dao;

import com.bean.model.DbCalcupaypaltype;

public interface DbCalcupaypaltypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalcupaypaltype record);

    int insertSelective(DbCalcupaypaltype record);

    DbCalcupaypaltype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalcupaypaltype record);

    int updateByPrimaryKeyWithBLOBs(DbCalcupaypaltype record);

    int updateByPrimaryKey(DbCalcupaypaltype record);
}