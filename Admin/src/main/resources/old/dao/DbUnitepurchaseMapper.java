package com.bean.dao;

import com.bean.model.DbUnitepurchase;
import java.math.BigDecimal;

public interface DbUnitepurchaseMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbUnitepurchase record);

    int insertSelective(DbUnitepurchase record);

    DbUnitepurchase selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbUnitepurchase record);

    int updateByPrimaryKey(DbUnitepurchase record);
}