package com.bean.dao;

import com.bean.model.DbDescraption;
import java.math.BigDecimal;

public interface DbDescraptionMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbDescraption record);

    int insertSelective(DbDescraption record);

    DbDescraption selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbDescraption record);

    int updateByPrimaryKeyWithBLOBs(DbDescraption record);
}