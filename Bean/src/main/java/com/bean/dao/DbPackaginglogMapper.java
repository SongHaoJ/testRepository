package com.bean.dao;

import com.bean.model.DbPackaginglog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPackaginglogMapper {
    DbPackaginglog selectByCriteria(DbPackaginglog DbPackaginglog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPackaginglog DbPackaginglog);

    int insertByCriteria(DbPackaginglog DbPackaginglog);

    int updateByCriteria(DbPackaginglog DbPackaginglog);

    DbPackaginglog selectByPrimaryKey(String sequenceid);

    List<DbPackaginglog> selectAll();
}