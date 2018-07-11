package com.bean.dao;

import com.bean.model.DbExpstoreitem;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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