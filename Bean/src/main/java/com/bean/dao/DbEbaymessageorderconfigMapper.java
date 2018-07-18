package com.bean.dao;

import com.bean.model.DbEbaymessageorderconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessageorderconfigMapper {
    DbEbaymessageorderconfig selectByCriteria(DbEbaymessageorderconfig DbEbaymessageorderconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessageorderconfig DbEbaymessageorderconfig);

    int insertByCriteria(DbEbaymessageorderconfig DbEbaymessageorderconfig);

    int updateByCriteria(DbEbaymessageorderconfig DbEbaymessageorderconfig);

    DbEbaymessageorderconfig selectByPrimaryKey(String sequenceid);

    List<DbEbaymessageorderconfig> selectAll();
}