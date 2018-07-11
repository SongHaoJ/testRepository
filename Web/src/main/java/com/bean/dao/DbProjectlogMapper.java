package com.bean.dao;

import com.bean.model.DbProjectlog;
import java.util.List;
import org.springframework.stereotype.Service;

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