package com.bean.dao;

import com.bean.model.DbProductwyt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductwytMapper {
    DbProductwyt selectByCriteria(DbProductwyt DbProductwyt);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProductwyt DbProductwyt);

    int insertByCriteria(DbProductwyt DbProductwyt);

    int updateByCriteria(DbProductwyt DbProductwyt);

    DbProductwyt selectByPrimaryKey(String sid);

    List<DbProductwyt> selectAll();
}