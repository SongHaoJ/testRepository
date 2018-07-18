package com.bean.dao;

import com.bean.model.DbExpensetypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpensetypelogMapper {
    DbExpensetypelog selectByCriteria(DbExpensetypelog DbExpensetypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpensetypelog DbExpensetypelog);

    int insertByCriteria(DbExpensetypelog DbExpensetypelog);

    int updateByCriteria(DbExpensetypelog DbExpensetypelog);

    DbExpensetypelog selectByPrimaryKey(String sequenceid);

    List<DbExpensetypelog> selectAll();
}