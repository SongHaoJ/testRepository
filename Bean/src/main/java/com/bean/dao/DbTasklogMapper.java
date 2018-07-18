package com.bean.dao;

import com.bean.model.DbTasklog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTasklogMapper {
    DbTasklog selectByCriteria(DbTasklog DbTasklog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTasklog DbTasklog);

    int insertByCriteria(DbTasklog DbTasklog);

    int updateByCriteria(DbTasklog DbTasklog);

    DbTasklog selectByPrimaryKey(String sequenceid);

    List<DbTasklog> selectAll();
}