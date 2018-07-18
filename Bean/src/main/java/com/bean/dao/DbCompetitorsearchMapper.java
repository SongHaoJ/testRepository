package com.bean.dao;

import com.bean.model.DbCompetitorsearch;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbCompetitorsearchMapper {
    DbCompetitorsearch selectByCriteria(DbCompetitorsearch DbCompetitorsearch);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompetitorsearch DbCompetitorsearch);

    int insertByCriteria(DbCompetitorsearch DbCompetitorsearch);

    int updateByCriteria(DbCompetitorsearch DbCompetitorsearch);

    DbCompetitorsearch selectByPrimaryKey(BigDecimal sequenceid);

    List<DbCompetitorsearch> selectAll();
}