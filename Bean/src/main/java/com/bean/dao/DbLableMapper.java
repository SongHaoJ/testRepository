package com.bean.dao;

import com.bean.model.DbLable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbLableMapper {
    DbLable selectByCriteria(DbLable DbLable);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLable DbLable);

    int insertByCriteria(DbLable DbLable);

    int updateByCriteria(DbLable DbLable);

    DbLable selectByPrimaryKey(String sequenceid);

    List<DbLable> selectAll();
}