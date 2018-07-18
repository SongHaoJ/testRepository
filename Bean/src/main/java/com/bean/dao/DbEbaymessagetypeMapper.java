package com.bean.dao;

import com.bean.model.DbEbaymessagetype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagetypeMapper {
    DbEbaymessagetype selectByCriteria(DbEbaymessagetype DbEbaymessagetype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagetype DbEbaymessagetype);

    int insertByCriteria(DbEbaymessagetype DbEbaymessagetype);

    int updateByCriteria(DbEbaymessagetype DbEbaymessagetype);

    DbEbaymessagetype selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagetype> selectAll();
}