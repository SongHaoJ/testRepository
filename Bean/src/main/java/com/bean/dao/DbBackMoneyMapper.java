package com.bean.dao;

import com.bean.model.DbBackMoney;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBackMoneyMapper {
    DbBackMoney selectByCriteria(DbBackMoney DbBackMoney);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbBackMoney DbBackMoney);

    int insertByCriteria(DbBackMoney DbBackMoney);

    int updateByCriteria(DbBackMoney DbBackMoney);

    DbBackMoney selectByPrimaryKey(Integer sequenceid);

    List<DbBackMoney> selectAll();
}