package com.bean.dao;

import com.bean.model.DbExpressiddatalog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpressiddatalogMapper {
    DbExpressiddatalog selectByCriteria(DbExpressiddatalog DbExpressiddatalog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpressiddatalog DbExpressiddatalog);

    int insertByCriteria(DbExpressiddatalog DbExpressiddatalog);

    int updateByCriteria(DbExpressiddatalog DbExpressiddatalog);

    DbExpressiddatalog selectByPrimaryKey(String sequenceid);

    List<DbExpressiddatalog> selectAll();
}