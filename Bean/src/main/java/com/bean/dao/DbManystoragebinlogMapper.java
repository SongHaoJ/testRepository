package com.bean.dao;

import com.bean.model.DbManystoragebinlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbManystoragebinlogMapper {
    DbManystoragebinlog selectByCriteria(DbManystoragebinlog DbManystoragebinlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbManystoragebinlog DbManystoragebinlog);

    int insertByCriteria(DbManystoragebinlog DbManystoragebinlog);

    int updateByCriteria(DbManystoragebinlog DbManystoragebinlog);

    DbManystoragebinlog selectByPrimaryKey(String sequenceid);

    List<DbManystoragebinlog> selectAll();
}