package com.bean.dao;

import com.bean.model.DbSendmessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSendmessageMapper {
    DbSendmessage selectByCriteria(DbSendmessage DbSendmessage);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSendmessage DbSendmessage);

    int insertByCriteria(DbSendmessage DbSendmessage);

    int updateByCriteria(DbSendmessage DbSendmessage);

    DbSendmessage selectByPrimaryKey(String sequenceid);

    List<DbSendmessage> selectAll();
}