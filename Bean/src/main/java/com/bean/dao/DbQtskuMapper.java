package com.bean.dao;

import com.bean.model.DbQtsku;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbQtskuMapper {
    DbQtsku selectByCriteria(DbQtsku DbQtsku);

    void deleteByPrimaryKey(String QTSKU);

    void deleteByCriteria(DbQtsku DbQtsku);

    int insertByCriteria(DbQtsku DbQtsku);

    int updateByCriteria(DbQtsku DbQtsku);

    DbQtsku selectByPrimaryKey(String qtsku);

    List<DbQtsku> selectAll();
}