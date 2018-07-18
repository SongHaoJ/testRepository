package com.bean.dao;

import com.bean.model.DbCompetitor;
import java.math.BigDecimal;

public interface DbCompetitorMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbCompetitor record);

    int insertSelective(DbCompetitor record);

    DbCompetitor selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbCompetitor record);

    int updateByPrimaryKey(DbCompetitor record);
}