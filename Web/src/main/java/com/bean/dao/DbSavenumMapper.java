package com.bean.dao;

import com.bean.model.DbSavenum;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSavenumMapper {
    DbSavenum selectByCriteria(DbSavenum DbSavenum);

    void deleteByPrimaryKey(String SKU);

    void deleteByCriteria(DbSavenum DbSavenum);

    int insertByCriteria(DbSavenum DbSavenum);

    int updateByCriteria(DbSavenum DbSavenum);

    DbSavenum selectByPrimaryKey(String sku);

    List<DbSavenum> selectAll();
}