package com.bean.dao;

import com.bean.model.DbRelistitem;
import java.math.BigDecimal;

public interface DbRelistitemMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbRelistitem record);

    int insertSelective(DbRelistitem record);

    DbRelistitem selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbRelistitem record);

    int updateByPrimaryKeyWithBLOBs(DbRelistitem record);

    int updateByPrimaryKey(DbRelistitem record);
}