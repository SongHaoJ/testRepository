package com.bean.dao;

import com.bean.model.DbMymabang;
import java.math.BigDecimal;

public interface DbMymabangMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbMymabang record);

    int insertSelective(DbMymabang record);

    DbMymabang selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbMymabang record);

    int updateByPrimaryKey(DbMymabang record);
}