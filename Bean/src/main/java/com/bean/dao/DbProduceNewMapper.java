package com.bean.dao;

import com.bean.model.DbProduceNew;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProduceNewMapper {
    DbProduceNew selectByCriteria(DbProduceNew DbProduceNew);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProduceNew DbProduceNew);

    int insertByCriteria(DbProduceNew DbProduceNew);

    int updateByCriteria(DbProduceNew DbProduceNew);

    DbProduceNew selectByPrimaryKey(String sequenceid);

    List<DbProduceNew> selectAll();
}