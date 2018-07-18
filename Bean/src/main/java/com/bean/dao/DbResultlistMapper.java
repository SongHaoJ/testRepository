package com.bean.dao;

import com.bean.model.DbResultlist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbResultlistMapper {
    DbResultlist selectByCriteria(DbResultlist DbResultlist);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbResultlist DbResultlist);

    int insertByCriteria(DbResultlist DbResultlist);

    int updateByCriteria(DbResultlist DbResultlist);

    DbResultlist selectByPrimaryKey(String sid);

    List<DbResultlist> selectAll();
}