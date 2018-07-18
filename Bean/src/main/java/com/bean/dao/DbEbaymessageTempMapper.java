package com.bean.dao;

import com.bean.model.DbEbaymessageTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessageTempMapper {
    DbEbaymessageTemp selectByCriteria(DbEbaymessageTemp DbEbaymessageTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessageTemp DbEbaymessageTemp);

    int insertByCriteria(DbEbaymessageTemp DbEbaymessageTemp);

    int updateByCriteria(DbEbaymessageTemp DbEbaymessageTemp);

    DbEbaymessageTemp selectByPrimaryKey(String sequenceid);

    List<DbEbaymessageTemp> selectAll();
}