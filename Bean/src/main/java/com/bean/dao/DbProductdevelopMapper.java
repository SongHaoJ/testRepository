package com.bean.dao;

import com.bean.model.DbProductdevelop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductdevelopMapper {
    DbProductdevelop selectByCriteria(DbProductdevelop DbProductdevelop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductdevelop DbProductdevelop);

    int insertByCriteria(DbProductdevelop DbProductdevelop);

    int updateByCriteria(DbProductdevelop DbProductdevelop);

    DbProductdevelop selectByPrimaryKey(String sequenceid);

    List<DbProductdevelop> selectAll();
}