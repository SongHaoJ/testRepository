package com.bean.dao;

import com.bean.model.DbExpensetype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExpensetypeMapper {
    DbExpensetype selectByCriteria(DbExpensetype DbExpensetype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpensetype DbExpensetype);

    int insertByCriteria(DbExpensetype DbExpensetype);

    int updateByCriteria(DbExpensetype DbExpensetype);

    DbExpensetype selectByPrimaryKey(String sequenceid);

    List<DbExpensetype> selectAll();
}