package com.bean.dao;

import com.bean.model.DbEbaymessagedescr;
import java.util.List;
import org.springframework.stereotype.Service;

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