package com.bean.dao;

import com.bean.model.DbExpenselog;
import java.util.List;
import org.springframework.stereotype.Service;

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