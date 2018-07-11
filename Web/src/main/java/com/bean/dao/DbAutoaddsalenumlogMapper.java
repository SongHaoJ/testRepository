package com.bean.dao;

import com.bean.model.DbAutoaddsalenumlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAutoaddsalenumlogMapper {
    DbAutoaddsalenumlog selectByCriteria(DbAutoaddsalenumlog DbAutoaddsalenumlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAutoaddsalenumlog DbAutoaddsalenumlog);

    int insertByCriteria(DbAutoaddsalenumlog DbAutoaddsalenumlog);

    int updateByCriteria(DbAutoaddsalenumlog DbAutoaddsalenumlog);

    DbAutoaddsalenumlog selectByPrimaryKey(String sequenceid);

    List<DbAutoaddsalenumlog> selectAll();
}