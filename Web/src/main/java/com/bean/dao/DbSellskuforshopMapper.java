package com.bean.dao;

import com.bean.model.DbSellskuforshop;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSellskuforshopMapper {
    DbSellskuforshop selectByCriteria(DbSellskuforshop DbSellskuforshop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSellskuforshop DbSellskuforshop);

    int insertByCriteria(DbSellskuforshop DbSellskuforshop);

    int updateByCriteria(DbSellskuforshop DbSellskuforshop);

    DbSellskuforshop selectByPrimaryKey(BigDecimal sequenceid);

    List<DbSellskuforshop> selectAll();
}