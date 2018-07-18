package com.bean.dao;

import com.bean.model.DbExpenselog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpenselogMapper {
    DbExpenselog selectByCriteria(DbExpenselog DbExpenselog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpenselog DbExpenselog);

    int insertByCriteria(DbExpenselog DbExpenselog);

    int updateByCriteria(DbExpenselog DbExpenselog);

    DbExpenselog selectByPrimaryKey(String sequenceid);

    List<DbExpenselog> selectAll();
}