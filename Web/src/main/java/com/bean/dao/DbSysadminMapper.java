package com.bean.dao;

import com.bean.model.DbSysadmin;
import java.util.List;
import org.springframework.stereotype.Service;

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