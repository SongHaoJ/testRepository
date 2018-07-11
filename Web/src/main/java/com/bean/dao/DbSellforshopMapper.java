package com.bean.dao;

import com.bean.model.DbSellforshop;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSellforshopMapper {
    DbSellforshop selectByCriteria(DbSellforshop DbSellforshop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSellforshop DbSellforshop);

    int insertByCriteria(DbSellforshop DbSellforshop);

    int updateByCriteria(DbSellforshop DbSellforshop);

    DbSellforshop selectByPrimaryKey(BigDecimal sequenceid);

    List<DbSellforshop> selectAll();
}