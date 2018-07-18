package com.bean.dao;

import com.bean.model.DbAlinewproduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAlinewproductMapper {
    DbAlinewproduct selectByCriteria(DbAlinewproduct DbAlinewproduct);

    void deleteByPrimaryKey(String ALIITEMID);

    void deleteByCriteria(DbAlinewproduct DbAlinewproduct);

    int insertByCriteria(DbAlinewproduct DbAlinewproduct);

    int updateByCriteria(DbAlinewproduct DbAlinewproduct);

    DbAlinewproduct selectByPrimaryKey(String aliitemid);

    List<DbAlinewproduct> selectAll();
}