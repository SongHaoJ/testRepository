package com.bean.dao;

import com.bean.model.DbWorkreport;
import java.math.BigDecimal;

public interface DbWorkreportMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbWorkreport record);

    int insertSelective(DbWorkreport record);

    DbWorkreport selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbWorkreport record);

    int updateByPrimaryKeyWithBLOBs(DbWorkreport record);

    int updateByPrimaryKey(DbWorkreport record);
}