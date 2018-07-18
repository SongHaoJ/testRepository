package com.bean.dao;

import com.bean.model.DbDeletemessagelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbDeletemessagelogMapper {
    DbDeletemessagelog selectByCriteria(DbDeletemessagelog DbDeletemessagelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbDeletemessagelog DbDeletemessagelog);

    int insertByCriteria(DbDeletemessagelog DbDeletemessagelog);

    int updateByCriteria(DbDeletemessagelog DbDeletemessagelog);

    DbDeletemessagelog selectByPrimaryKey(String sequenceid);

    List<DbDeletemessagelog> selectAll();
}