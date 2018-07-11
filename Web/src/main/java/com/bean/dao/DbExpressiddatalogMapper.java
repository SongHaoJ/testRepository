package com.bean.dao;

import com.bean.model.DbExpressiddatalog;
import java.util.List;
import org.springframework.stereotype.Service;

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