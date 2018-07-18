package com.bean.dao;

import com.bean.model.DbProperty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPropertyMapper {
    DbProperty selectByCriteria(DbProperty DbProperty);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProperty DbProperty);

    int insertByCriteria(DbProperty DbProperty);

    int updateByCriteria(DbProperty DbProperty);

    DbProperty selectByPrimaryKey(String sid);

    List<DbProperty> selectAll();
}