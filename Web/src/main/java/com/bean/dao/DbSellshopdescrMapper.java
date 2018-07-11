package com.bean.dao;

import com.bean.model.DbSellshopdescr;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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