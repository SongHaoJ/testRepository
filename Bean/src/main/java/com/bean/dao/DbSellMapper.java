package com.bean.dao;

import com.bean.model.DbSell;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSellMapper {
    DbSell selectByCriteria(DbSell DbSell);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSell DbSell);

    int insertByCriteria(DbSell DbSell);

    int updateByCriteria(DbSell DbSell);

    DbSell selectByPrimaryKey(String sid);

    List<DbSell> selectAll();
}