package com.bean.dao;

import com.bean.model.DbEbaymessage;
import java.util.List;
import org.springframework.stereotype.Service;

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