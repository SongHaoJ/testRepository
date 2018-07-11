package com.bean.dao;

import com.bean.model.DbExpressiddata;
import java.util.List;
import org.springframework.stereotype.Service;

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