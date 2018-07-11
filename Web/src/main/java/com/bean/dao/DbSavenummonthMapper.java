package com.bean.dao;

import com.bean.model.DbSavenummonth;
import java.util.List;
import org.springframework.stereotype.Service;

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