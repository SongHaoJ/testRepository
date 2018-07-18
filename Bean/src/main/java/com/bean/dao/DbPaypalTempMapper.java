package com.bean.dao;

import com.bean.model.DbPaypalTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPaypalTempMapper {
    DbPaypalTemp selectByCriteria(DbPaypalTemp DbPaypalTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPaypalTemp DbPaypalTemp);

    int insertByCriteria(DbPaypalTemp DbPaypalTemp);

    int updateByCriteria(DbPaypalTemp DbPaypalTemp);

    DbPaypalTemp selectByPrimaryKey(String sequenceid);

    List<DbPaypalTemp> selectAll();
}