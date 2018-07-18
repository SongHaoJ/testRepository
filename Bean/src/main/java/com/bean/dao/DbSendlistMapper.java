package com.bean.dao;

import com.bean.model.DbSendlist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSendlistMapper {
    DbSendlist selectByCriteria(DbSendlist DbSendlist);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSendlist DbSendlist);

    int insertByCriteria(DbSendlist DbSendlist);

    int updateByCriteria(DbSendlist DbSendlist);

    DbSendlist selectByPrimaryKey(String sequenceid);

    List<DbSendlist> selectAll();
}