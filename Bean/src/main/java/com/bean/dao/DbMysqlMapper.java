package com.bean.dao;

import com.bean.model.DbMysql;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMysqlMapper {
    DbMysql selectByCriteria(DbMysql DbMysql);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMysql DbMysql);

    int insertByCriteria(DbMysql DbMysql);

    int updateByCriteria(DbMysql DbMysql);

    DbMysql selectByPrimaryKey(String sequenceid);

    List<DbMysql> selectAll();
}