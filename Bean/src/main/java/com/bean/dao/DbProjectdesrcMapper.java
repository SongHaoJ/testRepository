package com.bean.dao;

import com.bean.model.DbProjectdesrc;
import java.math.BigDecimal;

public interface DbProjectdesrcMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProjectdesrc record);

    int insertSelective(DbProjectdesrc record);

    DbProjectdesrc selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProjectdesrc record);

    int updateByPrimaryKeyWithBLOBs(DbProjectdesrc record);

    int updateByPrimaryKey(DbProjectdesrc record);
}