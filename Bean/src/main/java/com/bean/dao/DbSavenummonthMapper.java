package com.bean.dao;

import com.bean.model.DbSavenummonth;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSavenummonthMapper {
    DbSavenummonth selectByCriteria(DbSavenummonth DbSavenummonth);

    void deleteByPrimaryKey(String MONTH);

    void deleteByCriteria(DbSavenummonth DbSavenummonth);

    int insertByCriteria(DbSavenummonth DbSavenummonth);

    int updateByCriteria(DbSavenummonth DbSavenummonth);

    DbSavenummonth selectByPrimaryKey(String month);

    List<DbSavenummonth> selectAll();
}