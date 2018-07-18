package com.bean.dao;

import com.bean.model.DbProductclass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductclassMapper {
    DbProductclass selectByCriteria(DbProductclass DbProductclass);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductclass DbProductclass);

    int insertByCriteria(DbProductclass DbProductclass);

    int updateByCriteria(DbProductclass DbProductclass);

    DbProductclass selectByPrimaryKey(String sequenceid);

    List<DbProductclass> selectAll();
}