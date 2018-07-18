package com.bean.dao;

import com.bean.model.DbFunctionlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFunctionlogMapper {
    DbFunctionlog selectByCriteria(DbFunctionlog DbFunctionlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbFunctionlog DbFunctionlog);

    int insertByCriteria(DbFunctionlog DbFunctionlog);

    int updateByCriteria(DbFunctionlog DbFunctionlog);

    DbFunctionlog selectByPrimaryKey(String sequenceid);

    List<DbFunctionlog> selectAll();
}