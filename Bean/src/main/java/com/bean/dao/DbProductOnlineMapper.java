package com.bean.dao;

import com.bean.model.DbProductOnline;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductOnlineMapper {
    DbProductOnline selectByCriteria(DbProductOnline DbProductOnline);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductOnline DbProductOnline);

    int insertByCriteria(DbProductOnline DbProductOnline);

    int updateByCriteria(DbProductOnline DbProductOnline);

    DbProductOnline selectByPrimaryKey(String sequenceid);

    List<DbProductOnline> selectAll();
}