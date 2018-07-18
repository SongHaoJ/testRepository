package com.bean.dao;

import com.bean.model.DbSysadmin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSysadminMapper {
    DbSysadmin selectByCriteria(DbSysadmin DbSysadmin);

    void deleteByPrimaryKey(String OPER);

    void deleteByCriteria(DbSysadmin DbSysadmin);

    int insertByCriteria(DbSysadmin DbSysadmin);

    int updateByCriteria(DbSysadmin DbSysadmin);

    DbSysadmin selectByPrimaryKey(String oper);

    List<DbSysadmin> selectAll();
}