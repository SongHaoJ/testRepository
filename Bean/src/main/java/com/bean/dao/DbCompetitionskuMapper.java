package com.bean.dao;

import com.bean.model.DbCompetitionsku;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbCompetitionskuMapper {
    DbCompetitionsku selectByCriteria(DbCompetitionsku DbCompetitionsku);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompetitionsku DbCompetitionsku);

    int insertByCriteria(DbCompetitionsku DbCompetitionsku);

    int updateByCriteria(DbCompetitionsku DbCompetitionsku);

    DbCompetitionsku selectByPrimaryKey(BigDecimal sequenceid);

    List<DbCompetitionsku> selectAll();
}