package com.bean.dao;

import com.bean.model.DbAutoaddsalenum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAutoaddsalenumMapper {
    DbAutoaddsalenum selectByCriteria(DbAutoaddsalenum DbAutoaddsalenum);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAutoaddsalenum DbAutoaddsalenum);

    int insertByCriteria(DbAutoaddsalenum DbAutoaddsalenum);

    int updateByCriteria(DbAutoaddsalenum DbAutoaddsalenum);

    DbAutoaddsalenum selectByPrimaryKey(String sequenceid);

    List<DbAutoaddsalenum> selectAll();
}