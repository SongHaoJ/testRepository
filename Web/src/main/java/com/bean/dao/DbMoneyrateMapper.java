package com.bean.dao;

import com.bean.model.DbMoneyrate;
import java.util.List;
import org.springframework.stereotype.Service;

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