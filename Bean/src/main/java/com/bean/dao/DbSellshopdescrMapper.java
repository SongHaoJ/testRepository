package com.bean.dao;

import com.bean.model.DbSellshopdescr;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbSellshopdescrMapper {
    DbSellshopdescr selectByCriteria(DbSellshopdescr DbSellshopdescr);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSellshopdescr DbSellshopdescr);

    int insertByCriteria(DbSellshopdescr DbSellshopdescr);

    int updateByCriteria(DbSellshopdescr DbSellshopdescr);

    DbSellshopdescr selectByPrimaryKey(BigDecimal sequenceid);

    List<DbSellshopdescr> selectAll();
}