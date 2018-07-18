package com.bean.dao;

import com.bean.model.DbExpresstypeapi;
import java.math.BigDecimal;

public interface DbExpresstypeapiMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbExpresstypeapi record);

    int insertSelective(DbExpresstypeapi record);

    DbExpresstypeapi selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbExpresstypeapi record);

    int updateByPrimaryKey(DbExpresstypeapi record);
}