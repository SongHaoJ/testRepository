package com.bean.dao;

import com.bean.model.DbFunctionconfiglog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFunctionconfiglogMapper {
    DbFunctionconfiglog selectByCriteria(DbFunctionconfiglog DbFunctionconfiglog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFunctionconfiglog DbFunctionconfiglog);

    int insertByCriteria(DbFunctionconfiglog DbFunctionconfiglog);

    int updateByCriteria(DbFunctionconfiglog DbFunctionconfiglog);

    DbFunctionconfiglog selectByPrimaryKey(String sid);

    List<DbFunctionconfiglog> selectAll();
}