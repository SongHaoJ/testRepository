package com.bean.dao;

import com.bean.model.DbMoneyrate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbMoneyrateMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMoneyrate record);

    int insertSelective(DbMoneyrate record);

    DbMoneyrate selectByPrimaryKey(String sequenceid);

    List<DbMoneyrate> selectByCriteria(DbMoneyrate moneyrate);

    int updateByPrimaryKeySelective(DbMoneyrate record);

    int selectMaxId();

}