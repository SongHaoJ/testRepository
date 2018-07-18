package com.bean.dao;

import com.bean.model.DbBasket;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBasketMapper {
    DbBasket selectByCriteria(DbBasket DbBasket);

    void deleteByPrimaryKey(String BASKETHEADER);

    void deleteByCriteria(DbBasket DbBasket);

    int insertByCriteria(DbBasket DbBasket);

    int updateByCriteria(DbBasket DbBasket);

    DbBasket selectByPrimaryKey(String basketheader);

    List<DbBasket> selectAll();
}