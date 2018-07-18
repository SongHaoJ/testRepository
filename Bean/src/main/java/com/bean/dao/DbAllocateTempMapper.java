package com.bean.dao;

import com.bean.model.DbAllocateTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAllocateTempMapper {
    DbAllocateTemp selectByCriteria(DbAllocateTemp DbAllocateTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAllocateTemp DbAllocateTemp);

    int insertByCriteria(DbAllocateTemp DbAllocateTemp);

    int updateByCriteria(DbAllocateTemp DbAllocateTemp);

    DbAllocateTemp selectByPrimaryKey(String sequenceid);

    List<DbAllocateTemp> selectAll();
}