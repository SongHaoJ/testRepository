package com.bean.dao;

import com.bean.model.DbProductfortemplet;
import java.math.BigDecimal;

public interface DbProductfortempletMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProductfortemplet record);

    int insertSelective(DbProductfortemplet record);

    DbProductfortemplet selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProductfortemplet record);

    int updateByPrimaryKeyWithBLOBs(DbProductfortemplet record);

    int updateByPrimaryKey(DbProductfortemplet record);
}