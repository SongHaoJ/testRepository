package com.bean.dao;

import com.bean.model.DbEbaymessageconfig;
import java.util.List;
import org.springframework.stereotype.Service;

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