package com.bean.dao;

import com.bean.model.DbEbaymessagedescrTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagedescrTempMapper {
    DbEbaymessagedescrTemp selectByCriteria(DbEbaymessagedescrTemp DbEbaymessagedescrTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagedescrTemp DbEbaymessagedescrTemp);

    int insertByCriteria(DbEbaymessagedescrTemp DbEbaymessagedescrTemp);

    int updateByCriteria(DbEbaymessagedescrTemp DbEbaymessagedescrTemp);

    DbEbaymessagedescrTemp selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagedescrTemp> selectAll();
}