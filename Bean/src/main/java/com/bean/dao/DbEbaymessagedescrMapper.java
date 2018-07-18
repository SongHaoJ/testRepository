package com.bean.dao;

import com.bean.model.DbEbaymessagedescr;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagedescrMapper {
    DbEbaymessagedescr selectByCriteria(DbEbaymessagedescr DbEbaymessagedescr);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagedescr DbEbaymessagedescr);

    int insertByCriteria(DbEbaymessagedescr DbEbaymessagedescr);

    int updateByCriteria(DbEbaymessagedescr DbEbaymessagedescr);

    DbEbaymessagedescr selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagedescr> selectAll();
}