package com.bean.dao;

import com.bean.model.DbSpaypal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSpaypalMapper {
    DbSpaypal selectByCriteria(DbSpaypal DbSpaypal);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSpaypal DbSpaypal);

    int insertByCriteria(DbSpaypal DbSpaypal);

    int updateByCriteria(DbSpaypal DbSpaypal);

    DbSpaypal selectByPrimaryKey(String sequenceid);

    List<DbSpaypal> selectAll();
}