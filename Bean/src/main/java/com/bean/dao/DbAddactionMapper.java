package com.bean.dao;

import com.bean.model.DbAddaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAddactionMapper {
    DbAddaction selectByCriteria(DbAddaction DbAddaction);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAddaction DbAddaction);

    int insertByCriteria(DbAddaction DbAddaction);

    int updateByCriteria(DbAddaction DbAddaction);

    DbAddaction selectByPrimaryKey(String sequenceid);

    List<DbAddaction> selectAll();
}