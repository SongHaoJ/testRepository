package com.bean.dao;

import com.bean.model.DbAlisupplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAlisupplierMapper {
    DbAlisupplier selectByCriteria(DbAlisupplier DbAlisupplier);

    void deleteByPrimaryKey(String USERID);

    void deleteByCriteria(DbAlisupplier DbAlisupplier);

    int insertByCriteria(DbAlisupplier DbAlisupplier);

    int updateByCriteria(DbAlisupplier DbAlisupplier);

    DbAlisupplier selectByPrimaryKey(String userid);

    List<DbAlisupplier> selectAll();
}