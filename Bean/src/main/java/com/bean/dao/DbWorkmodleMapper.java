package com.bean.dao;

import com.bean.model.DbWorkmodle;
import java.math.BigDecimal;

public interface DbWorkmodleMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbWorkmodle record);

    int insertSelective(DbWorkmodle record);

    DbWorkmodle selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbWorkmodle record);

    int updateByPrimaryKeyWithBLOBs(DbWorkmodle record);

    int updateByPrimaryKey(DbWorkmodle record);
}