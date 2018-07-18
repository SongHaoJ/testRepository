package com.bean.dao;

import com.bean.model.DbFbaproduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFbaproductMapper {
    DbFbaproduct selectByCriteria(DbFbaproduct DbFbaproduct);

    void deleteByPrimaryKey(String SELLERSKU);

    void deleteByCriteria(DbFbaproduct DbFbaproduct);

    int insertByCriteria(DbFbaproduct DbFbaproduct);

    int updateByCriteria(DbFbaproduct DbFbaproduct);

    DbFbaproduct selectByPrimaryKey(String sellersku);

    List<DbFbaproduct> selectAll();
}