package com.bean.dao;

import com.bean.model.DbInrcase;
import java.util.List;
import org.springframework.stereotype.Service;

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