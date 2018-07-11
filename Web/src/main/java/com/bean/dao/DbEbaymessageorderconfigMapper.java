package com.bean.dao;

import com.bean.model.DbEbaymessageorderconfig;
import java.util.List;
import org.springframework.stereotype.Service;

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