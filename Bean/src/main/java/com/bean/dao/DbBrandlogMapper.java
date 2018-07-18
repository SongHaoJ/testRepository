package com.bean.dao;

import com.bean.model.DbBrandlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBrandlogMapper {
    DbBrandlog selectByCriteria(DbBrandlog DbBrandlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbBrandlog DbBrandlog);

    int insertByCriteria(DbBrandlog DbBrandlog);

    int updateByCriteria(DbBrandlog DbBrandlog);

    DbBrandlog selectByPrimaryKey(String sequenceid);

    List<DbBrandlog> selectAll();
}