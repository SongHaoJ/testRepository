package com.bean.dao;

import com.bean.model.DbExpstoreitem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbExpstoreitemMapper {
    DbExpstoreitem selectByCriteria(DbExpstoreitem DbExpstoreitem);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpstoreitem DbExpstoreitem);

    int insertByCriteria(DbExpstoreitem DbExpstoreitem);

    int updateByCriteria(DbExpstoreitem DbExpstoreitem);

    DbExpstoreitem selectByPrimaryKey(BigDecimal sequenceid);

    List<DbExpstoreitem> selectAll();
}