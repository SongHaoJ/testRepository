package com.bean.dao;

import com.bean.model.DbAllocateTemp;
import java.util.List;
import org.springframework.stereotype.Service;

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