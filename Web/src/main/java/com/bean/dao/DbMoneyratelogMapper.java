package com.bean.dao;

import com.bean.model.DbMoneyratelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMoneyratelogMapper {
    DbMoneyratelog selectByCriteria(DbMoneyratelog DbMoneyratelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMoneyratelog DbMoneyratelog);

    int insertByCriteria(DbMoneyratelog DbMoneyratelog);

    int updateByCriteria(DbMoneyratelog DbMoneyratelog);

    DbMoneyratelog selectByPrimaryKey(String sequenceid);

    List<DbMoneyratelog> selectAll();
}