package com.bean.dao;

import com.bean.model.DbEbaymessagecontent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagecontentMapper {
    DbEbaymessagecontent selectByCriteria(DbEbaymessagecontent DbEbaymessagecontent);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagecontent DbEbaymessagecontent);

    int insertByCriteria(DbEbaymessagecontent DbEbaymessagecontent);

    int updateByCriteria(DbEbaymessagecontent DbEbaymessagecontent);

    DbEbaymessagecontent selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagecontent> selectAll();
}