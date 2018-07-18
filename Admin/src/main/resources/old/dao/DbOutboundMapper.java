package com.bean.dao;

import com.bean.model.DbOutbound;
import java.math.BigDecimal;

public interface DbOutboundMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbOutbound record);

    int insertSelective(DbOutbound record);

    DbOutbound selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbOutbound record);

    int updateByPrimaryKeyWithBLOBs(DbOutbound record);

    int updateByPrimaryKey(DbOutbound record);
}