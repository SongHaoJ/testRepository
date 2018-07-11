package com.bean.dao;

import com.bean.model.DbProductdevelop;
import java.util.List;
import org.springframework.stereotype.Service;

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