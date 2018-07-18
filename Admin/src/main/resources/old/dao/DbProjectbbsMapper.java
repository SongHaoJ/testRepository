package com.bean.dao;

import com.bean.model.DbProjectbbs;
import java.math.BigDecimal;

public interface DbProjectbbsMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProjectbbs record);

    int insertSelective(DbProjectbbs record);

    DbProjectbbs selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProjectbbs record);

    int updateByPrimaryKeyWithBLOBs(DbProjectbbs record);

    int updateByPrimaryKey(DbProjectbbs record);
}