package com.bean.dao;

import com.bean.model.DbInrcase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbInrcaseMapper {
    DbInrcase selectByCriteria(DbInrcase DbInrcase);

    void deleteByPrimaryKey(String TRANSACTIONID);

    void deleteByCriteria(DbInrcase DbInrcase);

    int insertByCriteria(DbInrcase DbInrcase);

    int updateByCriteria(DbInrcase DbInrcase);

    DbInrcase selectByPrimaryKey(String transactionid);

    List<DbInrcase> selectAll();
}