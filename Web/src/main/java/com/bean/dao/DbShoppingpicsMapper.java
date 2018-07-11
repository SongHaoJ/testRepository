package com.bean.dao;

import com.bean.model.DbShoppingpics;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShoppingpicsMapper {
    DbShoppingpics selectByCriteria(DbShoppingpics DbShoppingpics);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShoppingpics DbShoppingpics);

    int insertByCriteria(DbShoppingpics DbShoppingpics);

    int updateByCriteria(DbShoppingpics DbShoppingpics);

    DbShoppingpics selectByPrimaryKey(BigDecimal id);

    List<DbShoppingpics> selectAll();
}