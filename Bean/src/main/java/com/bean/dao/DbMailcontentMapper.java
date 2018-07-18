package com.bean.dao;

import com.bean.model.DbMailcontent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMailcontentMapper {
    DbMailcontent selectByCriteria(DbMailcontent DbMailcontent);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMailcontent DbMailcontent);

    int insertByCriteria(DbMailcontent DbMailcontent);

    int updateByCriteria(DbMailcontent DbMailcontent);

    DbMailcontent selectByPrimaryKey(String sequenceid);

    List<DbMailcontent> selectAll();
}