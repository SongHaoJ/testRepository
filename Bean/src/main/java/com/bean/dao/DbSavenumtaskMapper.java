package com.bean.dao;

import com.bean.model.DbSavenumtask;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbSavenumtaskMapper {
    DbSavenumtask selectByCriteria(DbSavenumtask DbSavenumtask);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbSavenumtask DbSavenumtask);

    int insertByCriteria(DbSavenumtask DbSavenumtask);

    int updateByCriteria(DbSavenumtask DbSavenumtask);

    DbSavenumtask selectByPrimaryKey(BigDecimal id);

    List<DbSavenumtask> selectAll();
}