package com.bean.dao;

import com.bean.model.DbLoginfree;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbLoginfreeMapper {
    DbLoginfree selectByCriteria(DbLoginfree DbLoginfree);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLoginfree DbLoginfree);

    int insertByCriteria(DbLoginfree DbLoginfree);

    int updateByCriteria(DbLoginfree DbLoginfree);

    DbLoginfree selectByPrimaryKey(String sequenceid);

    List<DbLoginfree> selectAll();
}