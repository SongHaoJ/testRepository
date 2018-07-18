package com.bean.dao;

import com.bean.model.DbSpbase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSpbaseMapper {
    DbSpbase selectByCriteria(DbSpbase DbSpbase);

    void deleteByPrimaryKey(String SPCODE);

    void deleteByCriteria(DbSpbase DbSpbase);

    int insertByCriteria(DbSpbase DbSpbase);

    int updateByCriteria(DbSpbase DbSpbase);

    DbSpbase selectByPrimaryKey(String spcode);

    List<DbSpbase> selectAll();
}