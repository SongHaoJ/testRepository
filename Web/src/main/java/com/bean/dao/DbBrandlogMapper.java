package com.bean.dao;

import com.bean.model.DbBrandlog;
import java.util.List;
import org.springframework.stereotype.Service;

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