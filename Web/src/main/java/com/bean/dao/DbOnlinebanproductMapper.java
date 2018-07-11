package com.bean.dao;

import com.bean.model.DbOnlinebanproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOnlinebanproductMapper {
    DbOnlinebanproduct selectByCriteria(DbOnlinebanproduct DbOnlinebanproduct);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbOnlinebanproduct DbOnlinebanproduct);

    int insertByCriteria(DbOnlinebanproduct DbOnlinebanproduct);

    int updateByCriteria(DbOnlinebanproduct DbOnlinebanproduct);

    DbOnlinebanproduct selectByPrimaryKey(String itemid);

    List<DbOnlinebanproduct> selectAll();
}