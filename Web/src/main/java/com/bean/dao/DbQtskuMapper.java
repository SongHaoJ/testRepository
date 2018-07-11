package com.bean.dao;

import com.bean.model.DbQtsku;
import java.util.List;
import org.springframework.stereotype.Service;

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