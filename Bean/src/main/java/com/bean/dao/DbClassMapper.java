package com.bean.dao;

import com.bean.model.DbClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbClassMapper {
    DbClass selectByCriteria(DbClass DbClass);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbClass DbClass);

    int insertByCriteria(DbClass DbClass);

    int updateByCriteria(DbClass DbClass);

    DbClass selectByPrimaryKey(String id);

    List<DbClass> selectAll();
}