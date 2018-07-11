package com.bean.dao;

import com.bean.model.DbProductOnline;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductOnlineMapper {
    DbProductOnline selectByCriteria(DbProductOnline DbProductOnline);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductOnline DbProductOnline);

    int insertByCriteria(DbProductOnline DbProductOnline);

    int updateByCriteria(DbProductOnline DbProductOnline);

    DbProductOnline selectByPrimaryKey(String sequenceid);

    List<DbProductOnline> selectAll();
}