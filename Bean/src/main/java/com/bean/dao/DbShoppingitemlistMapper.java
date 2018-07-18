package com.bean.dao;

import com.bean.model.DbShoppingitemlist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShoppingitemlistMapper {
    DbShoppingitemlist selectByCriteria(DbShoppingitemlist DbShoppingitemlist);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShoppingitemlist DbShoppingitemlist);

    int insertByCriteria(DbShoppingitemlist DbShoppingitemlist);

    int updateByCriteria(DbShoppingitemlist DbShoppingitemlist);

    DbShoppingitemlist selectByPrimaryKey(String id);

    List<DbShoppingitemlist> selectAll();
}