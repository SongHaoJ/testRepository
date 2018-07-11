package com.bean.dao;

import com.bean.model.DbExpense;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExpenseMapper {
    DbExpense selectByCriteria(DbExpense DbExpense);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpense DbExpense);

    int insertByCriteria(DbExpense DbExpense);

    int updateByCriteria(DbExpense DbExpense);

    DbExpense selectByPrimaryKey(String sequenceid);

    List<DbExpense> selectAll();
}