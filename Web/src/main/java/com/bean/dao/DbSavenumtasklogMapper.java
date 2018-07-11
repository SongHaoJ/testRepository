package com.bean.dao;

import com.bean.model.DbSavenumtasklog;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSavenumtasklogMapper {
    DbSavenumtasklog selectByCriteria(DbSavenumtasklog DbSavenumtasklog);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbSavenumtasklog DbSavenumtasklog);

    int insertByCriteria(DbSavenumtasklog DbSavenumtasklog);

    int updateByCriteria(DbSavenumtasklog DbSavenumtasklog);

    DbSavenumtasklog selectByPrimaryKey(BigDecimal id);

    List<DbSavenumtasklog> selectAll();
}