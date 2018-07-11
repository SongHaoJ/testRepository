package com.bean.dao;

import com.bean.model.DbPostmessage;
import java.util.List;
import org.springframework.stereotype.Service;

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