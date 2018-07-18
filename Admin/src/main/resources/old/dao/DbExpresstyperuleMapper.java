package com.bean.dao;

import com.bean.model.DbExpresstyperule;
import java.math.BigDecimal;

public interface DbExpresstyperuleMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbExpresstyperule record);

    int insertSelective(DbExpresstyperule record);

    DbExpresstyperule selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbExpresstyperule record);

    int updateByPrimaryKeyWithBLOBs(DbExpresstyperule record);

    int updateByPrimaryKey(DbExpresstyperule record);
}