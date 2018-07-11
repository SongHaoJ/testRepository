package com.bean.dao;

import com.bean.model.DbAlinewproduct;
import java.util.List;
import org.springframework.stereotype.Service;

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