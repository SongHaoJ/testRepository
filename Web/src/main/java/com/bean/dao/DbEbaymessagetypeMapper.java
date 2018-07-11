package com.bean.dao;

import com.bean.model.DbEbaymessagetype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbaymessagetypeMapper {
    DbEbaymessagetype selectByCriteria(DbEbaymessagetype DbEbaymessagetype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagetype DbEbaymessagetype);

    int insertByCriteria(DbEbaymessagetype DbEbaymessagetype);

    int updateByCriteria(DbEbaymessagetype DbEbaymessagetype);

    DbEbaymessagetype selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagetype> selectAll();
}