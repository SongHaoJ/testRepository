package com.bean.dao;

import com.bean.model.DbCheckstocklog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCheckstocklogMapper {
    DbCheckstocklog selectByCriteria(DbCheckstocklog DbCheckstocklog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCheckstocklog DbCheckstocklog);

    int insertByCriteria(DbCheckstocklog DbCheckstocklog);

    int updateByCriteria(DbCheckstocklog DbCheckstocklog);

    DbCheckstocklog selectByPrimaryKey(String sequenceid);

    List<DbCheckstocklog> selectAll();
}