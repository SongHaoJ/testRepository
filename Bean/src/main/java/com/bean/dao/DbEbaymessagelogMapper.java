package com.bean.dao;

import com.bean.model.DbEbaymessagelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessagelogMapper {
    DbEbaymessagelog selectByCriteria(DbEbaymessagelog DbEbaymessagelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagelog DbEbaymessagelog);

    int insertByCriteria(DbEbaymessagelog DbEbaymessagelog);

    int updateByCriteria(DbEbaymessagelog DbEbaymessagelog);

    DbEbaymessagelog selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagelog> selectAll();
}