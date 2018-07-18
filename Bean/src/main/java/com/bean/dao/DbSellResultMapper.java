package com.bean.dao;

import com.bean.model.DbSellResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSellResultMapper {
    DbSellResult selectByCriteria(DbSellResult DbSellResult);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSellResult DbSellResult);

    int insertByCriteria(DbSellResult DbSellResult);

    int updateByCriteria(DbSellResult DbSellResult);

    DbSellResult selectByPrimaryKey(String sequenceid);

    List<DbSellResult> selectAll();
}