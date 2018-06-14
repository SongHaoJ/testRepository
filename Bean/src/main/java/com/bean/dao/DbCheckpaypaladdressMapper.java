package com.bean.dao;

import com.bean.model.DbCheckpaypaladdress;
import java.math.BigDecimal;

public interface DbCheckpaypaladdressMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbCheckpaypaladdress record);

    int insertSelective(DbCheckpaypaladdress record);

    DbCheckpaypaladdress selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbCheckpaypaladdress record);

    int updateByPrimaryKeyWithBLOBs(DbCheckpaypaladdress record);

    int updateByPrimaryKey(DbCheckpaypaladdress record);
}