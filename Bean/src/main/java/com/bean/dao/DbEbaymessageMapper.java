package com.bean.dao;

import com.bean.model.DbEbaymessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessageMapper {
    DbEbaymessage selectByCriteria(DbEbaymessage DbEbaymessage);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessage DbEbaymessage);

    int insertByCriteria(DbEbaymessage DbEbaymessage);

    int updateByCriteria(DbEbaymessage DbEbaymessage);

    DbEbaymessage selectByPrimaryKey(String sequenceid);

    List<DbEbaymessage> selectAll();
}