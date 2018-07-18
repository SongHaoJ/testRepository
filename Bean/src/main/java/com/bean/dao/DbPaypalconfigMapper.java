package com.bean.dao;

import com.bean.model.DbPaypalconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPaypalconfigMapper {
    DbPaypalconfig selectByCriteria(DbPaypalconfig DbPaypalconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPaypalconfig DbPaypalconfig);

    int insertByCriteria(DbPaypalconfig DbPaypalconfig);

    int updateByCriteria(DbPaypalconfig DbPaypalconfig);

    DbPaypalconfig selectByPrimaryKey(String sequenceid);

    List<DbPaypalconfig> selectAll();
}