package com.bean.dao;

import com.bean.model.DbEbaymessagebind;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagebindMapper {
    DbEbaymessagebind selectByCriteria(DbEbaymessagebind DbEbaymessagebind);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagebind DbEbaymessagebind);

    int insertByCriteria(DbEbaymessagebind DbEbaymessagebind);

    int updateByCriteria(DbEbaymessagebind DbEbaymessagebind);

    DbEbaymessagebind selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagebind> selectAll();
}