package com.bean.dao;

import com.bean.model.DbWorkreportlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbWorkreportlogMapper {
    DbWorkreportlog selectByCriteria(DbWorkreportlog DbWorkreportlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbWorkreportlog DbWorkreportlog);

    int insertByCriteria(DbWorkreportlog DbWorkreportlog);

    int updateByCriteria(DbWorkreportlog DbWorkreportlog);

    DbWorkreportlog selectByPrimaryKey(String sequenceid);

    List<DbWorkreportlog> selectAll();
}