package com.bean.dao;

import com.bean.model.DbSelltostat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSelltostatMapper {
    DbSelltostat selectByCriteria(DbSelltostat DbSelltostat);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSelltostat DbSelltostat);

    int insertByCriteria(DbSelltostat DbSelltostat);

    int updateByCriteria(DbSelltostat DbSelltostat);

    DbSelltostat selectByPrimaryKey(String sid);

    List<DbSelltostat> selectAll();
}