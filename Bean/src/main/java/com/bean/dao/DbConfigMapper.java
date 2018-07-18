package com.bean.dao;

import com.bean.model.DbConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbConfigMapper {
    DbConfig selectByCriteria(DbConfig DbConfig);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbConfig DbConfig);

    int insertByCriteria(DbConfig DbConfig);

    int updateByCriteria(DbConfig DbConfig);

    DbConfig selectByPrimaryKey(String sid);

    List<DbConfig> selectAll();
}