package com.bean.dao;

import com.bean.model.DbEbaymessagetypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagetypelogMapper {
    DbEbaymessagetypelog selectByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    int insertByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    int updateByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    DbEbaymessagetypelog selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagetypelog> selectAll();
}