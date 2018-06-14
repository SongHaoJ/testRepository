package com.bean.dao;

import com.bean.model.DbAntistopshop;
import java.math.BigDecimal;

public interface DbAntistopshopMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbAntistopshop record);

    int insertSelective(DbAntistopshop record);

    DbAntistopshop selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbAntistopshop record);

    int updateByPrimaryKey(DbAntistopshop record);
}