package com.bean.dao;

import com.bean.model.DbCategorylog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCategorylogMapper {
    DbCategorylog selectByCriteria(DbCategorylog DbCategorylog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCategorylog DbCategorylog);

    int insertByCriteria(DbCategorylog DbCategorylog);

    int updateByCriteria(DbCategorylog DbCategorylog);

    DbCategorylog selectByPrimaryKey(String sequenceid);

    List<DbCategorylog> selectAll();
}