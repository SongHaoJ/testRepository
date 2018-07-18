package com.bean.dao;

import com.bean.model.DbMoneyrate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMoneyrateMapper {
    DbMoneyrate selectByCriteria(DbMoneyrate DbMoneyrate);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMoneyrate DbMoneyrate);

    int insertByCriteria(DbMoneyrate DbMoneyrate);

    int updateByCriteria(DbMoneyrate DbMoneyrate);

    DbMoneyrate selectByPrimaryKey(String sequenceid);

    List<DbMoneyrate> selectAll();
}