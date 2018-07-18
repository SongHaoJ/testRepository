package com.bean.dao;

import com.bean.model.DbExpressiddata;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpressiddataMapper {
    DbExpressiddata selectByCriteria(DbExpressiddata DbExpressiddata);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbExpressiddata DbExpressiddata);

    int insertByCriteria(DbExpressiddata DbExpressiddata);

    int updateByCriteria(DbExpressiddata DbExpressiddata);

    DbExpressiddata selectByPrimaryKey(String sid);

    List<DbExpressiddata> selectAll();
}