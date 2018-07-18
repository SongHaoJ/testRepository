package com.bean.dao;

import com.bean.model.DbSellshopfordescr;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbSellshopfordescrMapper {
    DbSellshopfordescr selectByCriteria(DbSellshopfordescr DbSellshopfordescr);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSellshopfordescr DbSellshopfordescr);

    int insertByCriteria(DbSellshopfordescr DbSellshopfordescr);

    int updateByCriteria(DbSellshopfordescr DbSellshopfordescr);

    DbSellshopfordescr selectByPrimaryKey(BigDecimal sequenceid);

    List<DbSellshopfordescr> selectAll();
}