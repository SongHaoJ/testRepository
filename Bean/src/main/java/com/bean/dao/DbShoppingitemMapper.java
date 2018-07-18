package com.bean.dao;

import com.bean.model.DbShoppingitem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbShoppingitemMapper {
    DbShoppingitem selectByCriteria(DbShoppingitem DbShoppingitem);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbShoppingitem DbShoppingitem);

    int insertByCriteria(DbShoppingitem DbShoppingitem);

    int updateByCriteria(DbShoppingitem DbShoppingitem);

    DbShoppingitem selectByPrimaryKey(BigDecimal itemid);

    List<DbShoppingitem> selectAll();
}