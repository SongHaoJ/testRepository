package com.bean.dao;

import com.bean.model.DbOpergroup;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOpergroupMapper {
    DbOpergroup selectByCriteria(DbOpergroup DbOpergroup);

    void deleteByPrimaryKey(String OPER);

    void deleteByCriteria(DbOpergroup DbOpergroup);

    int insertByCriteria(DbOpergroup DbOpergroup);

    int updateByCriteria(DbOpergroup DbOpergroup);

    DbOpergroup selectByPrimaryKey(String oper);

    List<DbOpergroup> selectAll();
}