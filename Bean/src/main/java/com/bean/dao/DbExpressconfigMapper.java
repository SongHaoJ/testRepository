package com.bean.dao;

import com.bean.model.DbExpressconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpressconfigMapper {
    DbExpressconfig selectByCriteria(DbExpressconfig DbExpressconfig);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExpressconfig DbExpressconfig);

    int insertByCriteria(DbExpressconfig DbExpressconfig);

    int updateByCriteria(DbExpressconfig DbExpressconfig);

    DbExpressconfig selectByPrimaryKey(Short id);

    List<DbExpressconfig> selectAll();
}