package com.bean.dao;

import com.bean.model.DbSendlist;
import java.util.List;
import org.springframework.stereotype.Service;

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