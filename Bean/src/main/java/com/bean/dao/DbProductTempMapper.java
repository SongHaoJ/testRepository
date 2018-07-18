package com.bean.dao;

import com.bean.model.DbProductTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductTempMapper {
    DbProductTemp selectByCriteria(DbProductTemp DbProductTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductTemp DbProductTemp);

    int insertByCriteria(DbProductTemp DbProductTemp);

    int updateByCriteria(DbProductTemp DbProductTemp);

    DbProductTemp selectByPrimaryKey(String sequenceid);

    List<DbProductTemp> selectAll();
}