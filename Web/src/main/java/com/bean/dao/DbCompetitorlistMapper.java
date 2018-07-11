package com.bean.dao;

import com.bean.model.DbCompetitorlist;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCompetitorlistMapper {
    DbCompetitorlist selectByCriteria(DbCompetitorlist DbCompetitorlist);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompetitorlist DbCompetitorlist);

    int insertByCriteria(DbCompetitorlist DbCompetitorlist);

    int updateByCriteria(DbCompetitorlist DbCompetitorlist);

    DbCompetitorlist selectByPrimaryKey(String sequenceid);

    List<DbCompetitorlist> selectAll();
}