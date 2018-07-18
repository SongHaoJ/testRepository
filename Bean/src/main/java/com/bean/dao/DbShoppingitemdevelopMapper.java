package com.bean.dao;

import com.bean.model.DbShoppingitemdevelop;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbShoppingitemdevelopMapper {
    DbShoppingitemdevelop selectByCriteria(DbShoppingitemdevelop DbShoppingitemdevelop);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbShoppingitemdevelop DbShoppingitemdevelop);

    int insertByCriteria(DbShoppingitemdevelop DbShoppingitemdevelop);

    int updateByCriteria(DbShoppingitemdevelop DbShoppingitemdevelop);

    DbShoppingitemdevelop selectByPrimaryKey(BigDecimal itemid);

    List<DbShoppingitemdevelop> selectAll();
}