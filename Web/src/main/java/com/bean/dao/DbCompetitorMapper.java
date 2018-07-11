package com.bean.dao;

import com.bean.model.DbCompetitor;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCompetitorMapper {
    DbCompetitor selectByCriteria(DbCompetitor DbCompetitor);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompetitor DbCompetitor);

    int insertByCriteria(DbCompetitor DbCompetitor);

    int updateByCriteria(DbCompetitor DbCompetitor);

    DbCompetitor selectByPrimaryKey(BigDecimal sequenceid);

    List<DbCompetitor> selectAll();
}