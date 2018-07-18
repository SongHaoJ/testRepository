package com.bean.dao;

import com.bean.model.DbSmtblackname;
import java.math.BigDecimal;

public interface DbSmtblacknameMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbSmtblackname record);

    int insertSelective(DbSmtblackname record);

    DbSmtblackname selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbSmtblackname record);

    int updateByPrimaryKeyWithBLOBs(DbSmtblackname record);

    int updateByPrimaryKey(DbSmtblackname record);
}