package com.bean.dao;

import com.bean.model.DbEbaymessageconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessageconfigMapper {
    DbEbaymessageconfig selectByCriteria(DbEbaymessageconfig DbEbaymessageconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessageconfig DbEbaymessageconfig);

    int insertByCriteria(DbEbaymessageconfig DbEbaymessageconfig);

    int updateByCriteria(DbEbaymessageconfig DbEbaymessageconfig);

    DbEbaymessageconfig selectByPrimaryKey(String sequenceid);

    List<DbEbaymessageconfig> selectAll();
}