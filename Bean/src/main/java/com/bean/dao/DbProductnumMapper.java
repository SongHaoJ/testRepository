package com.bean.dao;

import com.bean.model.DbProductnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductnumMapper {
    DbProductnum selectByCriteria(DbProductnum DbProductnum);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbProductnum DbProductnum);

    int insertByCriteria(DbProductnum DbProductnum);

    int updateByCriteria(DbProductnum DbProductnum);

    DbProductnum selectByPrimaryKey(Long id);

    List<DbProductnum> selectAll();
}