package com.bean.dao;

import com.bean.model.DbManystoragebin;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbManystoragebinMapper {
    DbManystoragebin selectByCriteria(DbManystoragebin DbManystoragebin);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbManystoragebin DbManystoragebin);

    int insertByCriteria(DbManystoragebin DbManystoragebin);

    int updateByCriteria(DbManystoragebin DbManystoragebin);

    DbManystoragebin selectByPrimaryKey(String sequenceid);

    List<DbManystoragebin> selectAll();
}