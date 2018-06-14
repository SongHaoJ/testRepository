package com.bean.dao;

import com.bean.model.DbEndproduct;
import java.math.BigDecimal;

public interface DbEndproductMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbEndproduct record);

    int insertSelective(DbEndproduct record);

    DbEndproduct selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbEndproduct record);

    int updateByPrimaryKeyWithBLOBs(DbEndproduct record);

    int updateByPrimaryKey(DbEndproduct record);
}