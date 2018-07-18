package com.bean.dao;

import com.bean.model.DbCompetitionsku;
import java.math.BigDecimal;

public interface DbCompetitionskuMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbCompetitionsku record);

    int insertSelective(DbCompetitionsku record);

    DbCompetitionsku selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbCompetitionsku record);

    int updateByPrimaryKey(DbCompetitionsku record);
}