package com.bean.dao;

import com.bean.model.DbOnlinebanproduct;
import org.springframework.stereotype.Service;

import java.util.List;

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