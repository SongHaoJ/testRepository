package com.bean.dao;

import com.bean.model.DbCompetitorsearch;
import java.math.BigDecimal;

public interface DbCompetitorsearchMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbCompetitorsearch record);

    int insertSelective(DbCompetitorsearch record);

    DbCompetitorsearch selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbCompetitorsearch record);

    int updateByPrimaryKeyWithBLOBs(DbCompetitorsearch record);

    int updateByPrimaryKey(DbCompetitorsearch record);
}