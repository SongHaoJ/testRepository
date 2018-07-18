package com.bean.dao;

import com.bean.model.DbPostmessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPostmessageMapper {
    DbPostmessage selectByCriteria(DbPostmessage DbPostmessage);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPostmessage DbPostmessage);

    int insertByCriteria(DbPostmessage DbPostmessage);

    int updateByCriteria(DbPostmessage DbPostmessage);

    DbPostmessage selectByPrimaryKey(String sequenceid);

    List<DbPostmessage> selectAll();
}