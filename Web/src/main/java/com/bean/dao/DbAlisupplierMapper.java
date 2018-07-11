package com.bean.dao;

import com.bean.model.DbAlisupplier;
import java.util.List;
import org.springframework.stereotype.Service;

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