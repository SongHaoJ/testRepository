package com.bean.dao;

import com.bean.model.DbPicurl;
import java.math.BigDecimal;

public interface DbPicurlMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbPicurl record);

    int insertSelective(DbPicurl record);

    DbPicurl selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbPicurl record);

    int updateByPrimaryKeyWithBLOBs(DbPicurl record);

    int updateByPrimaryKey(DbPicurl record);
}