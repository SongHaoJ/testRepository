package com.bean.dao;

import com.bean.model.DbProjectlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProjectlogMapper {
    DbProjectlog selectByCriteria(DbProjectlog DbProjectlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProjectlog DbProjectlog);

    int insertByCriteria(DbProjectlog DbProjectlog);

    int updateByCriteria(DbProjectlog DbProjectlog);

    DbProjectlog selectByPrimaryKey(String sequenceid);

    List<DbProjectlog> selectAll();
}